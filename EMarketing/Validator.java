package EMarketing;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static List<ValidationError> validate(Object obj) {
        List<ValidationError> errors = new ArrayList<>();
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            try {
                Object value = field.get(obj);

                if (field.isAnnotationPresent(Min.class) ) {
                    Min annotation = field.getAnnotation(Min.class);

                    if ( value instanceof Double d && d < annotation.min()) {
                        errors.add(new ValidationError(annotation.message(), field.getName()));
                    } else if (value instanceof Integer i && i < annotation.min()) {
                        errors.add(new ValidationError(annotation.message(), field.getName()));

                    }

                }
                if (field.isAnnotationPresent(NotEmpty.class)) {

                    NotEmpty annotation = field.getAnnotation(NotEmpty.class);

                    if (value == null || value.toString().trim().isEmpty()) {
                        errors.add(new ValidationError(annotation.message(), field.getName()));

                    }
                }
                if (field.isAnnotationPresent(PositivePrice.class) && value instanceof Double d) {
                    PositivePrice annotation = field.getAnnotation(PositivePrice.class);

                    if (d < annotation.min) {
                        errors.add(new ValidationError(annotation.message(), field.getName()));
                    }

                }


            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        return errors;
    }
}

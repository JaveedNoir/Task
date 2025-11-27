package EMarketing;

import java.util.List;

public interface Validatable {
    List<ValidationError> validate();
}

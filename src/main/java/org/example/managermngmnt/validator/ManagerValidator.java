package org.example.managermngmnt.validator;

import org.example.managermngmnt.exception.AgeValidationException;
import org.example.managermngmnt.exception.MailAdressValidationException;
import org.example.managermngmnt.model.Manager;
import org.example.managermngmnt.model.Personal;
import org.springframework.stereotype.Component;

@Component
public class ManagerValidator implements Validator {

    @Override
    public boolean ageValidate(Personal personal) {
        if (!(personal instanceof Manager manager)) {
            throw new ClassCastException("Bu validator sadece Manager için!");
        }
        if (manager.getAge() != null && manager.getAge() >= 18) {
            return true;
        } else {
            throw new AgeValidationException();
        }
    }

    @Override
    public boolean mailValidate(Personal personal) {

        if (!(personal instanceof Manager manager)) {
            throw new ClassCastException("Bu validator sadece Manager için!");
        }
        if (manager.getEmail() == null ||
                (!manager.getEmail().contains("@")) ||
                (manager.getEmail().isEmpty())) {
            throw new MailAdressValidationException();
        }
        else  return true;
    }
}




package org.example.managermngmnt.validator;

import org.example.managermngmnt.model.Personal;

public interface Validator {
     boolean ageValidate(Personal personal);
     boolean mailValidate(Personal personal);

}

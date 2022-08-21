package programmerfadliyandra.spring.validation.validation;

import org.springframework.beans.factory.annotation.Autowired;
import programmerfadliyandra.spring.validation.helper.StringHelper;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PalindromeValidator implements ConstraintValidator<Palindrome, String> {

    @Autowired
    private StringHelper stringHelper;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return stringHelper.isPalindrome(value);
    }
}

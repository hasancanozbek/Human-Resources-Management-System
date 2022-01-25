package com.demo.humanresourcesmanagementsystem.Core.Validation.MailValidation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Qualifier("TestMailVerification")
public class TestMailVerification implements MailVerificationService {
    @Override
    public boolean isValidMail(String email) {
        return true;
    }
}

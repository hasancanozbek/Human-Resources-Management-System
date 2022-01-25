package com.demo.humanresourcesmanagementsystem.Core.Utilities.Regex;

import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailRegex {

    public static boolean ifValidMail(String email) {
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.find();
    }

    public static boolean ifCompanyMail(Employer employer) {
        String domain = employer.getCompanyWebsite().substring(4);
        return employer.getEmail().endsWith("@" + domain);
    }
}

package com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.MernisValidation;

import com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.MernisValidation.MernisPackages.NCUKPSPublicSoap;
import com.demo.humanresourcesmanagementsystem.Core.Validation.PersonValidation.PersonValidationService;
import com.demo.humanresourcesmanagementsystem.Entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
@Qualifier("MernisAdapter")
public class MernisAdapter implements PersonValidationService {
    @Override
    public boolean isValidPerson(Employee employee) throws Exception {
        NCUKPSPublicSoap client = new NCUKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(employee.getNationalIdentity()), employee.getFirstName().toUpperCase(new Locale("tr")), employee.getLastName().toUpperCase(new Locale("tr")), employee.getYearOfBirth());
    }
}

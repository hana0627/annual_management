package com.hana.annual.application.service;

import com.hana.annual.application.dto.SimpleCalculateDto;
import com.hana.annual.application.dto.UserAccountDto;
import org.springframework.stereotype.Service;

@Service
public class UserAccountService {

    public SimpleCalculateDto search(SimpleCalculateDto dto) {

        System.out.println(dto);

        return  dto.calculate(dto);
    }
}

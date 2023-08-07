package com.hana.annual.application.dto;

public record UserAccountDto(
        String name,
        String userCode,
        Integer workingYear,
        String meno

) {
}

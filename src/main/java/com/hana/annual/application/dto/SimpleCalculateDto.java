package com.hana.annual.application.dto;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Period;

public record SimpleCalculateDto(
    LocalDateTime hireDate,
    Integer usedVacation,
    Integer hasVacation
) {

    public SimpleCalculateDto calculate(SimpleCalculateDto dto) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime hireDate = dto.hireDate;
        Period diff = Period.between(hireDate.toLocalDate(),now.toLocalDate());
        System.out.println(diff);

        System.out.printf("두 날짜 사이 기간: %d년 %d월 %d일",
                diff.getYears(), diff.getMonths(), diff.getDays());

        // 1년차일때는 수행하는 로직이 다름
        if(diff.getYears() == 0) {
            // TODO something
        }
        // 1년차 이상일때
        if(diff.getYears() != 0) {
            // TODO something
        }
        return new SimpleCalculateDto(dto.hireDate,dto.usedVacation,diff.getDays());
    }
}

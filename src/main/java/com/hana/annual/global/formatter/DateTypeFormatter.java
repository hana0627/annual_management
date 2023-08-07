package com.hana.annual.global.formatter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Locale;

@Slf4j
public class DateTypeFormatter implements Formatter<LocalDateTime> {
    @Override
    public LocalDateTime parse(String text, Locale locale) throws ParseException {

        // .. 과거의 나에게 졋다... 예전에 구현한 코드 복붙해씀...

        // SimpleDateFormat 생성
        String datePattern = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(datePattern);


        try {
            Date date = format.parse(text);

            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
            return localDateTime;
        } catch (ParseException e) {
            System.err.println("dateStr : " + text + ", datePattern:" + datePattern);
            e.printStackTrace();
        }
        return null;

    }

    @Override
    public String print(LocalDateTime object, Locale locale) {
        return null;
    }
}
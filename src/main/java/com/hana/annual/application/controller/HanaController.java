package com.hana.annual.application.controller;

import com.hana.annual.application.dto.SimpleCalculateDto;
import com.hana.annual.application.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HanaController {

    private final UserAccountService userAccountService;

    @GetMapping("/")
    public String hello () {
        return "/hello";
    }

    @PostMapping("/simple_search")
    public String simple_search(SimpleCalculateDto dto, Model model) {
        SimpleCalculateDto result = userAccountService.search(dto);

        model.addAttribute("result",result);
        return "/registForm";
    }

}

package com.jergs.springsecurityoauth2github.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class SecurityController {

    @GetMapping("/")
    public String oAuth2(OAuth2AuthenticationToken token) {
        log.info("TOKEN principal: " + token.getPrincipal().toString());
        return "secure.html";
    }

}

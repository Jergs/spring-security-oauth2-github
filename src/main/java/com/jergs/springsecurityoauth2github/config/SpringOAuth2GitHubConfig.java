package com.jergs.springsecurityoauth2github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringOAuth2GitHubConfig {

    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(request ->
                        request.anyRequest().authenticated())
                .oauth2Login(Customizer.withDefaults());

        return http.build();
    }

    /**
     * @see application.properties for these
     */

//    @Bean
//    public ClientRegistrationRepository clientRepository() {
//        ClientRegistration clientReg = clientRegistration();
//        return new InMemoryClientRegistrationRepository(clientReg);
//    }
//
//    private ClientRegistration clientRegistration() {
//        return CommonOAuth2Provider.GITHUB.getBuilder("github").clientId("XXX")
//                .clientSecret("YYY").build();
//    }
}

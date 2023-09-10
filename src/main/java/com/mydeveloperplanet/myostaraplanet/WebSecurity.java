package com.mydeveloperplanet.myostaraplanet;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurity {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authz -> authz
                .requestMatchers("/actuator/**").hasRole("ADMIN")
                .anyRequest().permitAll())
                .csrf(csrf -> csrf
                        .ignoringRequestMatchers("/actuator/**")
                )
                .httpBasic(Customizer.withDefaults());
        return http.build();

    }

}

package com.ll.security.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration // 스프링의 환경 설정 파일임을 명시
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.authorizeRequests()
                .antMatchers("/**") // 모든 요청
                .permitAll() // 접근 허용
                .and()
                .build();
    }

    /**
     * PasswordEncoder는 BCryptPasswordEncoder의 인터페이스
     * 당연하게도 한 곳에서 정의해놓고 가져다 쓰는게 재사용성이 훨씬 좋음..
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}

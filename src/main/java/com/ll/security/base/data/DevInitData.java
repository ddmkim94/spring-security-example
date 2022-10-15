package com.ll.security.base.data;


import com.ll.security.member.domain.Member;
import com.ll.security.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@Profile("dev")
public class DevInitData {

    @Bean
    public CommandLineRunner initData(MemberService memberService) {
        return args -> {
            Member member1 = memberService.join("dongmin", "1234", "dongmin@naver.com");
            Member member2 = memberService.join("eunbin", "1234", "eunbin@naver.com");
        };
    }

}

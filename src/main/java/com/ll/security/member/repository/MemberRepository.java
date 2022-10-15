package com.ll.security.member.repository;

import com.ll.security.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JpaRepository를 상속한 클래스는 @Repository를 생략해도 스프링 로딩 시 자동으로 Repository로 등록
 */
public interface MemberRepository extends JpaRepository<Member, Long> {
}

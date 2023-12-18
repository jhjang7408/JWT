package com.temisone.jwt.repository;

import com.temisone.jwt.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Optional<Member> findByEmail(String email); // 값이 있는지 없는지 확인해 줌

    boolean existsByEmail(String Email); // 참, 거짓 나타내 줌 (해당하는 이메일이 있는지 없는지)

}

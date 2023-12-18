package com.temisone.jwt.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity // entity 클래스 지정 (테이블)
@Getter
@NoArgsConstructor  // 매개 변수 없는 기본 생성자 자동 생성
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 이게 auto_increment
    @Column(name = "member_id")
    private Long id;

    private String email;

    private String password;

    @Enumerated(EnumType.STRING) // enum 타입을 매핑하는 방법 지정
    private Authority authority;

    @Builder
    public Member(String email, String password, Authority authority){
        this.email = email;
        this.password = password;
        this.authority = authority;
    }

}

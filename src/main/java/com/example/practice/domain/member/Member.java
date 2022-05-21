package com.example.practice.domain.member;

import lombok.*;

@Getter @Setter @ToString @EqualsAndHashCode @NoArgsConstructor
public class Member {

    private Long id;
    private String email;
    private String pwd;
    private String nickname;
    private String intro;

}

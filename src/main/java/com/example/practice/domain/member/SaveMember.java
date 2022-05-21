package com.example.practice.domain.member;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SaveMember {

    private Long id;
    private String email;
    private String pwd;
    private String nickname;
}

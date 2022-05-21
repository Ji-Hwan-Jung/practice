package com.example.practice.domain.post;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class SaveWithUpdatePost {

    private Long id;
    private String title;
    private String content;
}

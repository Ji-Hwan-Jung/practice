package com.example.practice.domain.post;

import lombok.*;

import java.time.LocalDateTime;

@Getter @Setter @ToString @EqualsAndHashCode @NoArgsConstructor
public class Post {

    private Long id;
    private String title;
    private String content;
    private String nickname;
    private LocalDateTime dateCreated;
    private LocalDateTime dateModified;

}

package com.bilibili.healthmanage.bean;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 用户实体类
 */
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class User {
    private int id;
    @NonNull
    private String username;
    @NonNull
    private String password;
    @NonNull
    private String email;
    @NonNull
    private String role;
    @NonNull
    private boolean state;
}

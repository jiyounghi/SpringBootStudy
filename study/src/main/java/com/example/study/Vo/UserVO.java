package com.example.study.Vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserVO {
    private String user_id;
    private String user_pw;
    private String user_name;
    private String user_email;
}

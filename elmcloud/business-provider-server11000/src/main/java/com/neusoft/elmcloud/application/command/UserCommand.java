package com.neusoft.elmcloud.application.command;

import lombok.Data;

@Data
public class UserCommand {
    private String userId;
    private String password;
    private String userName;
    private Integer userSex;
}

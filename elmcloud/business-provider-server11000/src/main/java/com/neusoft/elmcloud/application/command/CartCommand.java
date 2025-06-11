package com.neusoft.elmcloud.application.command;

import lombok.Data;

@Data
public class CartCommand {
    private Integer businessId;
    private String userId;
    private Integer foodId;
    private Integer quantity;
}

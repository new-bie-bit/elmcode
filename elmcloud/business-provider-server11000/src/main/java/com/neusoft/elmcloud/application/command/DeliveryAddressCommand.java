package com.neusoft.elmcloud.application.command;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class DeliveryAddressCommand {
    private Integer daId;
    @NotEmpty
    private String contactName;
    @NotNull
    private Integer contactSex;
    @NotEmpty
    private String contactTel;
    @NotEmpty
    private String address;
    @NotEmpty
    private String userId;
}

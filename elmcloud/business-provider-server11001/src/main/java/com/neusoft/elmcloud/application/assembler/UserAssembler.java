package com.neusoft.elmcloud.application.assembler;

import com.neusoft.elmcloud.application.command.UserCommand;
import com.neusoft.elmcloud.common.core.domain.SexEnum;
import com.neusoft.elmcloud.domain.model.user.Password;
import com.neusoft.elmcloud.domain.model.user.UserDM;
import com.neusoft.elmcloud.domain.model.user.UserId;
import com.neusoft.elmcloud.domain.model.user.UserName;

public class UserAssembler {

    public static UserDM toUser(final UserCommand command) {
        return new UserDM(new UserId(command.getUserId()), new Password(command.getPassword()),
                null, new UserName(command.getUserName()),
                SexEnum.getSexEnum(command.getUserSex()), null);
    }
}

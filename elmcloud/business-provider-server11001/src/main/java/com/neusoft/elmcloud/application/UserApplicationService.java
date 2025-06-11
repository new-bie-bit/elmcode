package com.neusoft.elmcloud.application;

import com.neusoft.elmcloud.application.command.UserCommand;


public interface UserApplicationService {
	int saveUser(UserCommand user);
}

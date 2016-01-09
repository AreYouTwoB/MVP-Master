package com.example.mvp2.model;

/**
 * 实现login
 * */
public class UserBiz implements IUserBiz {

	@Override
	public void login(final String name, final String pwd,
			final OnLoginListener loginListener) {
		// TODO 自动生成的方法存根
		if ("zx".equals(name) && "zx".equals(pwd)) {
			UserInfo userInfo = new UserInfo();
			userInfo.setUsername(name);
			userInfo.setPassword(pwd);
			loginListener.loginSuccess(userInfo);
		} else {
			loginListener.loginFail("登录失败");
		}
	}

}

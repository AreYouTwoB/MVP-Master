package com.example.mvp2.model;

/**
 * ʵ��login
 * */
public class UserBiz implements IUserBiz {

	@Override
	public void login(final String name, final String pwd,
			final OnLoginListener loginListener) {
		// TODO �Զ����ɵķ������
		if ("zx".equals(name) && "zx".equals(pwd)) {
			UserInfo userInfo = new UserInfo();
			userInfo.setUsername(name);
			userInfo.setPassword(pwd);
			loginListener.loginSuccess(userInfo);
		} else {
			loginListener.loginFail("��¼ʧ��");
		}
	}

}

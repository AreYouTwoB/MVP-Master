package com.example.mvp2.view;

import com.example.mvp2.model.UserInfo;

/**
 * ʵ�ֲ����Ľӿ�
 * */
public interface IUserLoginView {
	
	String getUsername();
	String getPassword();
	void clearUsername();
	void clearPassword();
	void toLoginSuccess(UserInfo info);
	void toLoginFail(String msg);
}

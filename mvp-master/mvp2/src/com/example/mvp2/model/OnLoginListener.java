package com.example.mvp2.model;

/**
 * login�ɹ�ʧ�ܼ����ӿ�
 * */
public interface OnLoginListener {
	void loginSuccess(UserInfo userInfo);
	void loginFail(String msg);
}

package com.example.mvp2.model;

/**
 * login成功失败监听接口
 * */
public interface OnLoginListener {
	void loginSuccess(UserInfo userInfo);
	void loginFail(String msg);
}

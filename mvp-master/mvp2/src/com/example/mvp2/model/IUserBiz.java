package com.example.mvp2.model;

/**
 * login�ӿ�
 * */
public interface IUserBiz {
	public void login(String name,String pwd,OnLoginListener loginListener);
}

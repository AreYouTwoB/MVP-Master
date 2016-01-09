package com.example.mvp2.model;

/**
 * login½Ó¿Ú
 * */
public interface IUserBiz {
	public void login(String name,String pwd,OnLoginListener loginListener);
}

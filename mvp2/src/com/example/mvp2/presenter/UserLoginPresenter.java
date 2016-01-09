package com.example.mvp2.presenter;

import com.example.mvp2.model.IUserBiz;
import com.example.mvp2.model.OnLoginListener;
import com.example.mvp2.model.UserBiz;
import com.example.mvp2.model.UserInfo;
import com.example.mvp2.view.IUserLoginView;

import android.os.Handler;

/**
 * 执行操作
 * */
public class UserLoginPresenter {

	private IUserBiz userBiz;
	private IUserLoginView iLoginView;

	public UserLoginPresenter(IUserLoginView iLoginView) {
		// TODO 自动生成的构造函数存根
		this.iLoginView = iLoginView;
		this.userBiz = new UserBiz();
	}

	public void login() {
		userBiz.login(iLoginView.getUsername(), iLoginView.getPassword(),
				new OnLoginListener() {

					@Override
					public void loginSuccess(UserInfo userInfo) {
						// TODO 自动生成的方法存根
						iLoginView.toLoginSuccess(userInfo);
					}

					@Override
					public void loginFail(String msg) {
						// TODO 自动生成的方法存根
						iLoginView.toLoginFail(msg);
					}
				});
	}
	public void clear(){
		iLoginView.clearUsername();
		iLoginView.clearPassword();
	}
	
}

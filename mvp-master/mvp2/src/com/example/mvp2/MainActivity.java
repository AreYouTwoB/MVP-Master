package com.example.mvp2;

import com.example.mvp2.model.UserInfo;
import com.example.mvp2.presenter.UserLoginPresenter;
import com.example.mvp2.view.IUserLoginView;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements IUserLoginView{

	private EditText name,pwd;
	private Button login,clear;
	private UserLoginPresenter persenter = new UserLoginPresenter(this);
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initView();
	}
	private void initView() {
		// TODO 自动生成的方法存根
		name = (EditText) findViewById(R.id.name);
		pwd = (EditText) findViewById(R.id.pwd);
		login = (Button) findViewById(R.id.login);
		clear = (Button) findViewById(R.id.clear);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				persenter.login();
			}
		});
		clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO 自动生成的方法存根
				persenter.clear();
			}
		});
				
	}
	@Override
	public String getUsername() {
		// TODO 自动生成的方法存根
		return name.getText().toString();
	}
	@Override
	public String getPassword() {
		// TODO 自动生成的方法存根
		return pwd.getText().toString();
	}
	@Override
	public void clearUsername() {
		// TODO 自动生成的方法存根
		name.setText("");
	}
	@Override
	public void clearPassword() {
		// TODO 自动生成的方法存根
		pwd.setText("");
	}
	@Override
	public void toLoginSuccess(UserInfo info) {
		// TODO 自动生成的方法存根
		Toast.makeText(getApplicationContext(), info.getUsername() + " 登录成功！", 500).show();
	}
	@Override
	public void toLoginFail(String msg) {
		// TODO 自动生成的方法存根
		Toast.makeText(getApplicationContext(), msg, 500).show();
	}

}

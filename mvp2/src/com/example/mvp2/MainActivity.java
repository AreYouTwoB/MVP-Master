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
		// TODO �Զ����ɵķ������
		name = (EditText) findViewById(R.id.name);
		pwd = (EditText) findViewById(R.id.pwd);
		login = (Button) findViewById(R.id.login);
		clear = (Button) findViewById(R.id.clear);
		
		login.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				persenter.login();
			}
		});
		clear.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				persenter.clear();
			}
		});
				
	}
	@Override
	public String getUsername() {
		// TODO �Զ����ɵķ������
		return name.getText().toString();
	}
	@Override
	public String getPassword() {
		// TODO �Զ����ɵķ������
		return pwd.getText().toString();
	}
	@Override
	public void clearUsername() {
		// TODO �Զ����ɵķ������
		name.setText("");
	}
	@Override
	public void clearPassword() {
		// TODO �Զ����ɵķ������
		pwd.setText("");
	}
	@Override
	public void toLoginSuccess(UserInfo info) {
		// TODO �Զ����ɵķ������
		Toast.makeText(getApplicationContext(), info.getUsername() + " ��¼�ɹ���", 500).show();
	}
	@Override
	public void toLoginFail(String msg) {
		// TODO �Զ����ɵķ������
		Toast.makeText(getApplicationContext(), msg, 500).show();
	}

}

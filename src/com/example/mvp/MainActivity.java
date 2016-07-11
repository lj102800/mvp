package com.example.mvp;

import com.example.mvp.presenter.SplashPresenter;
import com.example.mvp.view.ISplashView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity implements ISplashView{

	SplashPresenter mSplashPresenter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mSplashPresenter=new SplashPresenter(this);
	}
	@Override
	protected void onResume() {
		mSplashPresenter.doUiLogic(this);
		super.onResume();
	}
	@Override
	public void showLoadingDialog() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startNextActivity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showNetWorkError() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideLoadingDialog() {
		// TODO Auto-generated method stub
		
	}

 

}

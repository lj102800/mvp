package com.example.mvp.presenter;

import android.content.Context;

import com.example.mvp.mode.INetWork;
import com.example.mvp.mode.impl.INetWorkImpl;
import com.example.mvp.view.ISplashView;

public class SplashPresenter {
	INetWork mINetWork;
	ISplashView mISplashView;
	public SplashPresenter(ISplashView iSplashView){
		mISplashView=iSplashView;
		mINetWork=new INetWorkImpl();
	}
	public void doUiLogic(Context context){
		mISplashView.showLoadingDialog();
		if(mINetWork.isNetworkAvailable(context)){
			mISplashView.startNextActivity();
		}else{
			mISplashView.showNetWorkError();
		}
		mISplashView.hideLoadingDialog();
	}
}

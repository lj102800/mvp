package com.example.mvp.view;

public interface ISplashView {
	/**
	 * 显示加载框
	 */
	public void showLoadingDialog();
	/**
	 * 进入下一个页面
	 */
	public void startNextActivity();
	/**
	 * 提示网络错误
	 */
	public void showNetWorkError();
	/**
	 * 隐藏加载框
	 */
	public void hideLoadingDialog();
}

package com.example.mvp.view;

public interface ISplashView {
	/**
	 * ��ʾ���ؿ�
	 */
	public void showLoadingDialog();
	/**
	 * ������һ��ҳ��
	 */
	public void startNextActivity();
	/**
	 * ��ʾ�������
	 */
	public void showNetWorkError();
	/**
	 * ���ؼ��ؿ�
	 */
	public void hideLoadingDialog();
}

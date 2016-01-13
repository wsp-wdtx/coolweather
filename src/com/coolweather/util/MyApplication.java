package com.coolweather.util;

import android.app.Application;
import android.content.Context;

/**
 * ��ȡContext(������)
 * ��Ŀ�κεط�����ʹ��Context
 * @author Roc
 *
 */
public class MyApplication extends Application{
	private static Context context;
	
	@Override
	public void onCreate() {
		context = getApplicationContext();
	}
	
	public static Context getContext() {
		return context;
	}
}

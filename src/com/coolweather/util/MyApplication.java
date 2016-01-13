package com.coolweather.util;

import android.app.Application;
import android.content.Context;

/**
 * 获取Context(上下文)
 * 项目任何地方都能使用Context
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

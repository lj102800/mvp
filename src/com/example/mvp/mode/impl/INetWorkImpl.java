package com.example.mvp.mode.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

import com.example.mvp.mode.INetWork;

public class INetWorkImpl implements INetWork{
	 @Override
	 public boolean isNetworkAvailable(Context context) {   
         ConnectivityManager connectivity = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);   
          if (connectivity == null) {   
             Log.i("NetWorkState", "Unavailabel");   
             return false;   
          } else {   
              NetworkInfo[] info = connectivity.getAllNetworkInfo();   
             if (info != null) {   
                  for (int i = 0; i < info.length; i++) {   
                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {   
                         Log.i("NetWorkState", "Availabel");   
                         return true;   
                     }   
                }   
             }   
        }   
         return false;
	 }
}

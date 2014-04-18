package com.umer.splashgameku;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends Activity {

	//splash screen timer
	private static int SPLASH_TIME_OUT = 3000;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		
		new Handler().postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// method ini akan di eksekusi kalau timer selesai
				//membuka main activity aplikasi
				
				Intent i = new Intent(SplashScreen.this, MainActivity.class);
				startActivity(i);
				
				//tutup activity ini
				
			}
		}, SPLASH_TIME_OUT);
	}
}

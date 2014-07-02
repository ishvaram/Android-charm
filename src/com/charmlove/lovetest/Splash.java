package com.charmlove.lovetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		
		Thread timer = new Thread()
		{
			public void run()
			{
				try{
					sleep(2500);
					startActivity(new Intent("com.lovetest.charmlove.MAIN"));
				
				}
				catch(Exception e){
					e.printStackTrace();
				}
				finally{
					finish();
				}
			}
		};
		timer.start();
	}	
}

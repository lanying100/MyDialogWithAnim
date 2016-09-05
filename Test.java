package com.iotek.lesson13_contentprovider.test;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

public class Test extends Activity {
	
	private MyDialog mDialog;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		mDialog = new MyDialog(this);
	}
	
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		if(event.getAction() == MotionEvent.ACTION_UP){
			mDialog.show();
		}
		return super.onTouchEvent(event);
	}
	
	@Override
	protected void onDestroy() {
		super.onDestroy();
		mDialog.dismiss();
	}

}

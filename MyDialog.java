package com.iotek.lesson13_contentprovider.test;

import com.iotek.lesson13_contentprovider.R;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
/**
 * 自定义扫描效果的Dialog
 * 
 * 需要补充以下内容
 * <style name="MyDialog" parent="@android:style/Theme.Dialog">
        <item name="android:windowNoTitle">true</item>
        <item name="android:windowBackground">@color/transparent</item>
    	<item name="android:backgroundDimEnabled">false</item><!-- 是否需要阴影 -->
    </style>
    
    <color name="transparent">#0000</color>
 * 
 * 【参考网址】http://blog.csdn.net/fastthinking/article/details/18308689
 * 
 * @author lanying
 *
 */
public class MyDialog extends Dialog {
	private Animation anim;
	private ImageView image;

	public MyDialog(Context context) {
		super(context,R.style.MyDialog);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog);
	}
	
	@Override
	public void show() {
		super.show();
		anim = AnimationUtils.loadAnimation(getContext(), R.anim.dialog_anim);
		image = (ImageView) findViewById(R.id.image_dialog);
		image.startAnimation(anim);
	}
	
	@Override
	public void dismiss() {
		super.dismiss();
		anim.cancel();
	}

}

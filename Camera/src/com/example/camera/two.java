package com.example.camera;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;

public class two extends ActionBarActivity{
	 
	 protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);
	        iv=(ImageView)findViewById(R.id.imageView1);
	 }
	 ImageView iv;  
	 protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	      // TODO Auto-generated method stub
	      super.onActivityResult(requestCode, resultCode, data);
	      
	      Bitmap bp = (Bitmap) data.getExtras().get("data");
	      iv.setImageBitmap(bp);
	   }

}

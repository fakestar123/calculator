package com.example.calc;

import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class two extends Activity {
	
	 ImageView mimage;
	 TextView mText;
	    protected void onCreate(Bundle savedInstanceState) 
	 {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.two);
	       
	        mimage =(ImageView)findViewById(R.id.imageView1);

	        mText=(TextView)findViewById(R.id.textView1);
	        loadDataFromAsset();
	        
	 }
	   public void loadDataFromAsset()
        {
        	try{
        		InputStream is=getAssets().open("asset.txt");
        		int size=is.available();
        		byte [] buffer=new byte[size];
        		is.read(buffer);
        		is.close();
        		mText.setText(new String(buffer));
        	}
        	catch(IOException e)
        	{
        		return ;
        	}
        	try{
        		InputStream ims=getAssets().open("Capture.PNG");
        		Drawable d=Drawable.createFromStream(ims,null);
        		mimage.setImageDrawable(d);
        	}
        	catch(IOException ex)
        	{
        		return ;
        	}
        }
}

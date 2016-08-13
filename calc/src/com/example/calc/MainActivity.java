package com.example.calc;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity implements OnClickListener {
	EditText e1,e2;
	TextView tv;
	Button b1,b2,b3,b4;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(this);
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(this);
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(this);
        b4=(Button)findViewById(R.id.button4);
        b4.setOnClickListener(this);
        tv=(TextView)findViewById(R.id.textView4);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
        case R.id.item1:Intent i=new Intent(MainActivity.this,two.class);
						startActivity(i);
        	
        case R.id.item2:Intent j=new Intent(MainActivity.this,two.class);
						startActivity(j);
        	
        case R.id.item3:Intent k=new Intent(MainActivity.this,two.class);
						startActivity(k);
        }
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(e1.getText().toString());
		int b=Integer.parseInt(e2.getText().toString());
		int result=0;
		if(b1==v)
		{
		Intent i=new Intent(MainActivity.this,two.class);
		startActivity(i);
		}
		if(b2==v)
			result=a-b;
		if(b3==v)
			result=a*b;
		if(b4==v)
			result=a/b;
		tv.setText(result+"");
	}
}

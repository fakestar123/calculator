package com.example.internalstorage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import android.support.v7.app.ActionBarActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity{
EditText edFileName,edContent;
Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        edFileName=(EditText)findViewById(R.id.filename);
        edContent=(EditText)findViewById(R.id.content);
        b1=(Button)findViewById(R.id.save);
        
        b1.setOnClickListener(new Button.OnClickListener(){
        	public void onClick(View arg0) {
				
				String fileName=edFileName.getText().toString();
				String content=edContent.getText().toString();
				FileOutputStream fos;
				try{
				fos=openFileOutput(fileName,Context.MODE_PRIVATE);
		fos.write(content.getBytes());
		fos.close();
		Toast.makeText(
				MainActivity.this,
				fileName+ "saved", 
						Toast.LENGTH_LONG).show();
				}
				catch(FileNotFoundException e)
				{e.printStackTrace();
        	}catch(IOException e){e.printStackTrace();
        }
    }
        });
    }
        	
        
        
    

		
			
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

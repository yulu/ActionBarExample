package com.example.actionbarexample;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import android.widget.Toast;

public class MainActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		ActionBar actionBar = getActionBar();
		actionBar.setCustomView(R.layout.action_bar);
		EditText search = (EditText)actionBar.getCustomView().findViewById(R.id.searchfield);
		search.setOnEditorActionListener(new OnEditorActionListener(){

			@Override
			public boolean onEditorAction(TextView v, int actionId,
					KeyEvent event) {
				Toast.makeText(MainActivity.this, "search triggered", Toast.LENGTH_SHORT).show();
				return false;
			}
			
		});
		actionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM |
				ActionBar.DISPLAY_SHOW_HOME);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/*@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch (item.getItemId()){
		case R.id.action_refresh:
			Toast.makeText(this, "Menu Item 1", Toast.LENGTH_SHORT).show();
			break;
		case R.id.action_settings:
			Toast.makeText(this, "Menu Item 2", Toast.LENGTH_SHORT).show();
			break;
		default:
			break;
		}
		
		return true;
	}*/
}

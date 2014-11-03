package com.example.contactmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class AddContact extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add_contact);
		
		final Button saveButton = (Button) findViewById(R.id.add_contact_save);
		saveButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
			}
		});
		final Button cancelButton = (Button) findViewById(R.id.add_contact_cancel);
		cancelButton.setOnClickListener(new View.OnClickListener(){
			public void onClick(View v){
				onBackPressed(); //same thing as when the user hits back.
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_contact, menu);
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
	
	@Override
	public void onBackPressed(){
		super.onBackPressed();
		overridePendingTransition(R.anim.slide_in_l,R.anim.slide_out_r);
	}
}

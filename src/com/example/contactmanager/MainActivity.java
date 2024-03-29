package com.example.contactmanager;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        switch(id){
        	case(R.id.action_settings): {
        		return true;
        	}
        	case(R.id.action_add):{
        		//TODO open the adding view.
        		Intent intent = new Intent(this, AddContact.class);
        		startActivity(intent);
        		overridePendingTransition(R.anim.slide_in_r,R.anim.slide_out_l);
        	}
        }
        	return super.onOptionsItemSelected(item);
    }
}

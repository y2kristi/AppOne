package com.example.kpowell.appone;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement
        if (id == R.id.est) {

            DateFormat format = new SimpleDateFormat("MMM d, yyyy, h:mm a");
            TimeZone cst = TimeZone.getTimeZone("US/Eastern");
            GregorianCalendar gc = new GregorianCalendar(cst);
            Date now = gc.getTime();
            format.setTimeZone(cst);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(format.format(now));

            return true;

        }
        if(id == R.id.ist){
            DateFormat format = new SimpleDateFormat("MMM d, yyyy, h:mm a");
            TimeZone cst = TimeZone.getTimeZone("IST");
            GregorianCalendar gc = new GregorianCalendar(cst);
            Date now = gc.getTime();
            format.setTimeZone(cst);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(format.format(now));

            return true;

        }
        if(id == R.id.pst){
            DateFormat format = new SimpleDateFormat("MMM d, yyyy, h:mm a");
            TimeZone cst = TimeZone.getTimeZone("US/Pacific");
            GregorianCalendar gc = new GregorianCalendar(cst);
            Date now = gc.getTime();
            format.setTimeZone(cst);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(format.format(now));

            return true;

        }

        return super.onOptionsItemSelected(item);
    }
}

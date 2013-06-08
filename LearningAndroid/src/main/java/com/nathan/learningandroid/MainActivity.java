package com.nathan.learningandroid;


import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
    //Button b1;
    //Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(my_OnClickListener);
        findViewById(R.id.button2).setOnClickListener(my_OnClickListener);
        findViewById(R.id.button3).setOnClickListener(my_OnClickListener);
        findViewById(R.id.button4).setOnClickListener(my_OnClickListener);

    }

        //Global OnClickListener
        public View.OnClickListener my_OnClickListener = new View.OnClickListener(){
            public void onClick(final View v) {
                switch(v.getId()) {
                    case R.id.button:
                        ((TextView)findViewById(R.id.textView)).setText("Button 1 Clicked");
                        break;
                    case R.id.button2:
                        ((TextView)findViewById(R.id.textView)).setText("Button 2 Clicked");
                        break;

                    case R.id.button3:
                        ImageView myimageview = ((ImageView)findViewById(R.id.imageView));
                        myimageview.setImageResource(R.drawable.images);
                        break;
                    case R.id.button4:
                        ((TextView)findViewById(R.id.checkBox)).setText("this is a test");
                        CheckBox mycheckbox = ((CheckBox)findViewById(R.id.checkBox));
                        if (mycheckbox.isChecked())
                            ((CheckBox)findViewById(R.id.checkBox)).setChecked(false);
                        else
                            ((CheckBox)findViewById(R.id.checkBox)).setChecked(true);
                        break;

                }
            }
        };





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }}




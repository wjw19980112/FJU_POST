package com.example.lawrence.fju_post;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler.sendEmptyMessageDelayed(GOTO_MAIN_ACTIVITY, 2000);
    }
    private static final int GOTO_MAIN_ACTIVITY = 0;
    private Handler mHandler = new Handler() {
        public void handleMessage(android.os.Message msg) {

            switch (msg.what) {
                case GOTO_MAIN_ACTIVITY:
                    Intent intent = new Intent();
                    //將原本Activity的換成MainActivity
                    intent.setClass(MainActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                    break;

                default:
                    break;
            }
        }

    };
    public void selectItem(View view){
        ArrayList<String> selection1 =new ArrayList<String>();
        boolean checked=((CheckBox) view).isChecked();
        switch (view.getId()){
            case R.id.Type_art:
                if(checked){
                    selection1.add("art");
                }
                else{
                    selection1.remove("art");
                }
                break;
            case R.id.Type_scholar:
                if(checked){
                    selection1.add("scholar");
                }
                else{
                    selection1.remove("scholar");
                }
                break;
            case R.id.Type_pe:
                if(checked){
                    selection1.add("pe");
                }
                else{
                    selection1.remove("pe");
                }
                break;
            case R.id.Type_volunteer:
                if(checked){
                    selection1.add("volunteer");
                }
                else{
                    selection1.remove("volunteer");
                }
                break;
            case R.id.Type_career:
                if(checked){
                    selection1.add("career");
                }
                else{
                    selection1.remove("career");
                }
                break;
            case R.id.Type_health:
                if(checked){
                    selection1.add("health");
                }
                else{
                    selection1.remove("health");
                }
                break;
            case R.id.Type_entertainment:
                if(checked){
                    selection1.add("entertainment");
                }
                else{
                    selection1.remove("entertainment");
                }
                break;
            case R.id.Type_selfgrowth:
                if(checked){
                    selection1.add("selfgrowth");
                }
                else{
                    selection1.remove("selfgrowth");
                }
                break;
            case R.id.Type_campus:
                if(checked){
                    selection1.add("campus");
                }
                else{
                    selection1.remove("campus");
                }
                break;
            case R.id.Type_gmeeting:
                if(checked){
                    selection1.add("gmeeting");
                }
                else{
                    selection1.remove("gmeeting");
                }
                break;
            case R.id.Type_gdevelop:
                if(checked){
                    selection1.add("gdevelop");
                }
                else{
                    selection1.remove("gdevelop");
                }
                break;

        }

    }
    private Spinner yearnum,monthnum,datenum;
    public void SelectDate(){

        yearnum = (Spinner)findViewById(R.id.yearnumber);
        ArrayAdapter<CharSequence> yearnumber = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.yearnumber,
                android.R.layout.simple_spinner_dropdown_item);

        monthnum = (Spinner)findViewById(R.id.yearnumber);
        ArrayAdapter<CharSequence> monthnum = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.monthnum,
                android.R.layout.simple_spinner_dropdown_item);

        datenum = (Spinner)findViewById(R.id.yearnumber);
        ArrayAdapter<CharSequence> datenum = ArrayAdapter.createFromResource(MainActivity.this,
                R.array.datenum,
                android.R.layout.simple_spinner_dropdown_item);

    }

}

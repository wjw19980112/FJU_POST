package com.example.lawrence.fju_post;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.ArrayList;

public class newnoticeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_newnotice, container, false);


        Button button1 = (Button) view.findViewById(R.id.send);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = new NoticeFragment();
                FragmentTransaction transaction =getFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment_container, fragment);
                transaction.commit();
            }
        });


        return view;
    }

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
}

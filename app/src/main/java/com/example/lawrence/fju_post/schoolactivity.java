package com.example.lawrence.fju_post;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class schoolactivity extends Fragment {
    private ListView lv;
    private SimpleAdapter adapter;
    private List<Map<String, Object>> list;
    Button mOrder;
    TextView mItemSelected;
    String[] listItems;
    boolean[] checkedItems;
    ArrayList<Integer> mUserItems = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tab_schoolactivity, container, false);
        mOrder = (Button) view.findViewById(R.id.btnorder);//
        //mItemSelected = (TextView) view.findViewById(R.id.tvItemSelected);
        listItems = getResources().getStringArray(R.array.shopping_item);
        checkedItems = new boolean[listItems.length];
        lv = (ListView)view.findViewById(R.id.tab_listview);//实例化

        mOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(schoolactivity.super.getContext());
                mBuilder.setTitle(R.string.dialog_title);
                mBuilder.setMultiChoiceItems(listItems, checkedItems, new DialogInterface.OnMultiChoiceClickListener() {
                    //類別點選
                    @Override
                    public void onClick(DialogInterface dialogInterface, int position, boolean isChecked) {
                        if (isChecked) {
                            if (!mUserItems.contains(position)) {
                                mUserItems.add(position);
                            } else if(!mUserItems.contains(position)){
                                mUserItems.remove(position);
                            }
                        }
                    }
                });
                //確認
                mBuilder.setCancelable(false);
                mBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        String item = "";
                        for (int i = 0; i < mUserItems.size(); i++) {
                            item = item + listItems[mUserItems.get(i)];
                            if (i != mUserItems.size() - 1) ;
                            {
                                item = item + ",";

                            }
                        }
                        mItemSelected.setText(item);
                    }


                });

                //離開
                mBuilder.setNegativeButton(R.string.dismiss, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                //清除
                mBuilder.setNeutralButton(R.string.clear, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int which) {
                        for (int i = 0; i < checkedItems.length; i++) {
                            checkedItems[i] = false;
                            mUserItems.clear();
                            //mItemSelected.setText("");
                        }
                    }
                });
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
        return view;

    }

    //活動list
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        adapter = new SimpleAdapter(getActivity(), getData(), R.layout.tab_listview_item,
                new String[]{"img", "title", "body"},
                new int[]{R.id.itemimg, R.id.itemtitle, R.id.itembody});      //配置适配器，并获取对应Item中的ID
        lv.setAdapter(adapter);
    }
    //数据的获取@！
    private List<? extends Map<String, ?>> getData() {
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();

//将需要的值传入map中
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("title", "[健康促進]");
        map.put("body", "106學年度第2學期珍愛生命守門人培課課程");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "[國際交流]");
        map.put("body", "日本的語言藝術");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "[服務]");
        map.put("body", "暑假營隊幹部訓練");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "[職涯發展]");
        map.put("body", "校级活动，化工电影本周放啥？艺设妹子有什么动向？点我查看");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "[職涯發展]");
        map.put("body", "職場美學工作坊");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "[自我成長]");
        map.put("body", "文學院教學助理培訓活動");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("title", "校内最新消息通知");
        map.put("body", "校级活动，化工电影本周放啥？艺设妹子有什么动向？点我查看");
        map.put("img", R.drawable.ic_fiber_new_black_24dp);
        list.add(map);

        return list;
    }

}

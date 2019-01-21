package com.patikom.mylistpic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    //String [] datas;
    private List<Data> datas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Data item = new Data("Cat","แมว",R.mipmap.cat);
        datas.add(item);
        datas.add(new Data("Dog","สุนัข",R.mipmap.dog));
        datas.add(new Data("Bird","นก",R.mipmap.bird));
        datas.add(new Data("Pig","หมู",R.mipmap.pig));
        datas.add(new Data("Elephant","ช้าง",R.mipmap.elephant));
        datas.add(new Data("Fish","ปลา",R.mipmap.fish));

        MyAdapter adapter = new MyAdapter(this,datas);

        ListView lv = (ListView)findViewById(R.id.listview);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(this);
//        datas = new String[]{
//                "Cat",
//                "Dog",
//                "Elephant",
//                "Bird",
//                "Fish"
//        };
//        ListAdapter adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas);


    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this,"Click" + String.valueOf(position) + " " + datas.get(position).getmText1(),Toast.LENGTH_LONG).show();
    }
}

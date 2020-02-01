package com.example.bookmycoffee;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;


public class shop_list extends AppCompatActivity {

    List<Model> mlist;
    RecyclerView myRecyclerview;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        mlist = new ArrayList<>();
        myAdapter = new MyAdapter(mlist);
        myRecyclerview = findViewById(R.id.recy);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        myRecyclerview.setLayoutManager(layoutManager);
        myRecyclerview.setAdapter(myAdapter);


        Model mdl = new Model("Cafe Coffee Day","Reliance Mall", R.drawable.app_icon);
        mlist.add(mdl);

        Model md2 = new Model("Cafe Coffee Day","Crystal Mall", R.drawable.app_icon);
        mlist.add(md2);

        Model md3 = new Model("Cafe Coffee Day","West Zone Rajkot", R.drawable.app_icon);
        mlist.add(md3);

        Model md4 = new Model("In De Burt","New Ring Road", R.drawable.app_icon);
        mlist.add(md4);

        Model md5 = new Model("Cafe Bia","Kalavad Road", R.drawable.app_icon);
        mlist.add(md5);

        Model md6 = new Model("Coffee Culture","Kalavad Road", R.drawable.app_icon);
        mlist.add(md6);

        Model md7 = new Model("First Date Cafe","Kalavad Road", R.drawable.app_icon);
        mlist.add(md7);

        Model md8 = new Model("Made House Mocha","Kalavad Road", R.drawable.app_icon);
        mlist.add(md8);

        Model md9 = new Model("Cafe Hash Tag","Kalavad Road", R.drawable.app_icon);
        mlist.add(md9);

        Model mdl0 = new Model("Big Bite","Sadhuvasvani Road", R.drawable.app_icon);
        mlist.add(mdl0);

        //----------Temp code--------------
        /*String title = mlist.get(0).getTitle();
        int img = mlist.get(0).getImage();
        Intent intent = new Intent(shop_list.this,newClaa.acas);
        intent.putExtra("title",title);
        intent.putExtra("img",img);*/

    }
}

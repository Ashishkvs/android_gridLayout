package com.datazi.gridlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gridView
        GridView gridView=findViewById(R.id.gridView);

        BookAdapter bookAdapter=new BookAdapter(MainActivity.this,new BookService().bookList());
        gridView.setAdapter(bookAdapter);
        //place click event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Book "+i,Toast.LENGTH_SHORT).show();
            }
        });

    }
}

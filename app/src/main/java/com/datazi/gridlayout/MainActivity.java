package com.datazi.gridlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BookAdapter bookAdapter;
    List<Book> bookList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //gridView
        GridView gridView = findViewById(R.id.gridView);
        bookList = new BookService().bookList();
        bookAdapter = new BookAdapter(MainActivity.this, bookList);
        gridView.setAdapter(bookAdapter);
        //place click event
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Book " + i, Toast.LENGTH_SHORT).show();
            }
        });

        //Search view field
        SearchView searchView=(SearchView) findViewById(R.id.searchView);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                filter(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filter(s);
                return false;
            }
        });



    }

    /**
     * onQueryTextSubmit(String s)
     * filter(s)
     * @param query
     */
    public void filter(String query){
        ArrayList<Book> arrayList=new ArrayList<>();
        for(Book book:bookList){
            if(book.getName().toLowerCase().contains((query.toLowerCase()))||
                    (book.getIsbn().toLowerCase().contains((query))
                    )
            ){
                arrayList.add(book);
            }
        }
        bookAdapter.filterList(arrayList);
    }


}

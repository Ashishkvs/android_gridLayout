package com.datazi.gridlayout;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ashish on 2/21/2018.
 */

public class BookAdapter extends BaseAdapter {

    //passed as and argument to adapter constructor
    private List<Book> bookList;
    private Context mContext;


    public BookAdapter(Context mContext, List<Book> bookList) {
        this.mContext = mContext;
        this.bookList = bookList;
    }

    @Override
    public int getCount() {
        return bookList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

       LayoutInflater inflater =LayoutInflater.from(mContext);
        view = inflater.inflate(R.layout.book_layout, null);

        ImageView imageView=view.findViewById(R.id.bookImage);
        TextView name = view.findViewById(R.id.bookName);
        TextView price = view.findViewById(R.id.bookPrice);
        TextView isbn = view.findViewById(R.id.bookIsbn);

        name.setText(bookList.get(i).getName());
        price.setText(String.valueOf(bookList.get(i).getPrice()));
        isbn.setText(bookList.get(i).getIsbn());
        imageView.setImageResource(bookList.get(i).getImage());



        return view;
    }
}

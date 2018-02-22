package com.datazi.gridlayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ashish on 2/21/2018.
 */

public class BookService {
    public List bookList;

    public List<Book> bookList() {
        bookList = new ArrayList();

        bookList.add(new Book("JAVA", "msn100", R.drawable.book, 100));
        bookList.add(new Book("c", "isbn100", R.drawable.book, 10));
        bookList.add(new Book("c++", "nba1500", R.drawable.book, 50));
        bookList.add(new Book("Hibernate", "isbn100", R.drawable.book, 70));
        bookList.add(new Book("python", "isbn100", R.drawable.book, 70));
        bookList.add(new Book("html", "isbn100", R.drawable.book, 45));
        bookList.add(new Book("css", "isbn100", R.drawable.book, 20));
        bookList.add(new Book("daa", "isbn100", R.drawable.book, 15));
        bookList.add(new Book("data structure", "isbn100", R.drawable.book, 70));


        return bookList;
    }
}

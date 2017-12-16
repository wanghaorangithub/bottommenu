package com.example.whr.bottommenu;

/**
 * Created by whr on 2017/12/9.
 */

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import android.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class MainFragment extends Fragment {
    private List<Mood> moodList = new ArrayList<>();
    private SearchView mSearch;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        initMood();
        View messageLayout = inflater.inflate(R.layout.message_layout, container, false);
        RecyclerView recyclerView = (RecyclerView) messageLayout.findViewById(R.id.recycler_view);
        GridLayoutManager layoutManager = new GridLayoutManager(MyApplication.getContext(), 2);
        recyclerView.setLayoutManager(layoutManager);
        MoodAdapter adapter = new MoodAdapter(moodList);
        recyclerView.setAdapter(adapter);
       // mSearch = (SearchView) messageLayout.findViewById(R.id.input_text);
//获取到TextView的ID
        //    int id = mSearch.getContext().getResources().getIdentifier("android:id/search_src_text", null, null);
//获取到TextView的控件
      //      EditText textView = (EditText) mSearch.findViewById(id);
//设置字体大小为8sp
        //   textView.setTextSize(8);//8sp
        return messageLayout;
    }

    private void initMood() {
        for (int i = 0; i < 20; i++) {
            Mood mood = new Mood("Happpy", R.drawable.ic_mood_black_24dp);
            moodList.add(mood);
        }
    }


}
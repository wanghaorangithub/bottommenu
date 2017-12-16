package com.example.whr.bottommenu;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by whr on 2017/12/2.
 */

public class MoodAdapter extends RecyclerView.Adapter<MoodAdapter.ViewHolder> {
    private List<Mood> mMoodList;

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView moodImage;
        TextView moodName;

        public ViewHolder(View view) {
            super(view);
            moodImage = (ImageView) view.findViewById(R.id.mood_image);
            moodName = (TextView) view.findViewById(R.id.mood_name);
        }
    }

    public MoodAdapter(List<Mood> moodList) {
        mMoodList = moodList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.mood_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    public void onBindViewHolder(ViewHolder holder, int position) {
        Mood mood = mMoodList.get(position);
        holder.moodImage.setImageResource(mood.getImageId());
        holder.moodName.setText(mood.getName());
    }

    @Override
    public int getItemCount() {
        return mMoodList.size();
    }
}

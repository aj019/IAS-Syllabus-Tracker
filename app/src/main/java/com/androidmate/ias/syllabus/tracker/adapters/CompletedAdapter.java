package com.androidmate.ias.syllabus.tracker.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.androidmate.ias.syllabus.tracker.R;

import java.util.ArrayList;

/**
 * Created by Diva on 12/2/2016.
 */

public class CompletedAdapter extends RecyclerView.Adapter<CompletedAdapter.Completed> {

    Context context;
    String id;
    ArrayList<String> completed;

    public CompletedAdapter(Context context,String id, ArrayList<String> completed) {
        this.context = context;
        this.id = id;
        this.completed = completed;
    }

    @Override
    public Completed onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.card_only_text,parent,false);
        Completed c = new Completed(v);
        return c;
    }

    @Override
    public void onBindViewHolder(Completed holder, int position) {
        holder.tvCompleted.setText(completed.get(position));
    }

    @Override
    public int getItemCount() {
        return completed.size();
    }

    public  class Completed extends RecyclerView.ViewHolder{

        TextView tvCompleted;
        public Completed(View itemView) {
            super(itemView);
            tvCompleted = (TextView) itemView.findViewById(R.id.tvCompletedTopic);
        }
    }
}

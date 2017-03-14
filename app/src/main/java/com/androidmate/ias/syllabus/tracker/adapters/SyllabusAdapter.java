package com.androidmate.ias.syllabus.tracker.adapters;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.TextView;

import com.androidmate.ias.syllabus.tracker.R;

import java.util.ArrayList;

/**
 * Created by Diva on 12/2/2016.
 */

public class SyllabusAdapter extends BaseAdapter {


    Context context;
    String id;
    ArrayList<String> syllabus;
    ArrayList<String> positions;
    boolean[] checkBoxState;

    private static LayoutInflater inflater=null;


    public SyllabusAdapter(Context context,String id,ArrayList<String> syllabus, boolean[] checkBoxState) {

        this.id = id;
        this.context = context;
        this.syllabus = syllabus;
        this.checkBoxState = checkBoxState;

    }

    @Override
    public int getCount() {
        return syllabus.size();
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
    public View getView(final int i, View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.from(context).inflate(R.layout.card_syllabus, null);

        TextView title = (TextView)vi.findViewById(R.id.tvTopicName); // title
        CheckBox cb = (CheckBox) vi.findViewById(R.id.cbSyllabus);
        // Setting all values in listview
        title.setText(syllabus.get(i));
        cb.setChecked(checkBoxState[i]);

        cb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox)v).isChecked()){
                    checkBoxState[i]=true;

                    String state=String.valueOf(checkBoxState[0]);
                    for(int i=1;i<checkBoxState.length;i++){
                        state = state + "," + String.valueOf(checkBoxState[i]);
                    }
                    SharedPreferences prefs = context.getSharedPreferences("Syllabus",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();

                    if(id.equals("0")){
                        editor.putString("gsp",state);
                    }else if(id.equals("1")){
                        editor.putString("gs1",state);
                    }else if(id.equals("2")){
                        editor.putString("gs2",state);
                    }else if(id.equals("3")){
                        editor.putString("gs3",state);
                    }else if(id.equals("4")){
                        editor.putString("gs4",state);
                    }

                    editor.commit();
                }

                else{
                    checkBoxState[i]=false;
                    String state=String.valueOf(checkBoxState[0]);
                    for(int i=1;i<checkBoxState.length;i++){
                        state = state + "," + String.valueOf(checkBoxState[i]);
                    }
                    SharedPreferences prefs = context.getSharedPreferences("Syllabus",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    if(id.equals("0")){
                        editor.putString("gsp",state);
                    }else if(id.equals("1")){
                        editor.putString("gs1",state);
                    }else if(id.equals("2")){
                        editor.putString("gs2",state);
                    }else if(id.equals("3")){
                        editor.putString("gs3",state);
                    }else if(id.equals("4")){
                        editor.putString("gs4",state);
                    }

                    editor.commit();
                }

            }
        });

        return vi;
    }
}

package com.example.lneves.project;

import android.content.Context;
import android.os.TestLooperManager;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by lneves on 12/12/2017.
 */

public class TrainingAdapter extends ArrayAdapter<Training> {


    public TrainingAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Training> objects) {
        super(context, resource, objects);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null)
        {
            LayoutInflater inflater;//block list about courses
            inflater = LayoutInflater.from(getContext());//block list about meetings
            view = inflater.inflate(R.layout.training_item_adapter, null); //block list about trainning
        }

        Training info = getItem(position);

        if (info != null)
        {
            TextView textView = view.findViewById(R.id.label_date);

            textView.setText(info.getDate());
        }

        return view;
    }
}

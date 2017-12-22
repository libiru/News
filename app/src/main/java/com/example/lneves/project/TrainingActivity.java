package com.example.lneves.project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TrainingActivity extends AppCompatActivity {
    private ListView listView;
    private TrainingAdapter adapterTraining;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training);

        List trainingList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {

            Training item = new Training();
            item.setDate("20");
            trainingList.add(item);
        }
        if (adapterTraining != null) {
            adapterTraining = null;
        }
        listView = (ListView) findViewById(R.id.listview);

        adapterTraining = new TrainingAdapter(this, R.layout.training_item_adapter, trainingList);
        listView.setAdapter(adapterTraining);

    }
}

package com.example.recyclercardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdapter(this, getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }


    private ArrayList<model>getMyList(){

        ArrayList<model>models = new ArrayList<>();

        model m = new model();
        m.setTitle("AWS");
        m.setDescription("Course Group : Full-Time \n Batch : Batch-1 \n Attendance Type : Daily");
        m.setImg(R.drawable.aws);
        models.add(m);

        m = new model();
        m.setTitle("PHP");
        m.setDescription("Course Group : Full-Time \n Batch : Batch-1 \n Attendance Type : Daily");
        m.setImg(R.drawable.php);
        models.add(m);

        m = new model();
        m.setTitle("FLUENT ENGLISH");
        m.setDescription("Course Group : Full-Time \n Batch : Batch-1 \n Attendance Type : Daily");
        m.setImg(R.drawable.fluent_english);
        models.add(m);

        m = new model();
        m.setTitle("PAINTING");
        m.setDescription("Course Group : Full-Time \n Batch : Batch-1 \n Attendance Type : Daily");
        m.setImg(R.drawable.painting);
        models.add(m);

        return models;

    }
}
package ly.generalassemb.actors_list_trial1;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerAdapter mRecyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView mRecyclerView;
    ArrayList<Actor> mActorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        mRecycler = (RecyclerView) findViewById(R.id.recycler_view);
//        mActorArrayList = new ArrayList<>();
//
//        Actor bradPitt = new Actor("Brad Pitt", 50, "man");
//        Actor susanSarandon = new Actor("Susan Sarandon", 55, "lady");
//        Actor milaKunis = new Actor("Mila Kunis", 30, "lady");
//
//        mActorArrayList.add(bradPitt);
//        mActorArrayList.add(susanSarandon);
//        mActorArrayList.add(milaKunis);
//
//        mAdapter = new RecyclerAdapter(mActorArrayList, MainActivity.this);
//        mRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
//        mRecycler.setAdapter(mAdapter);


        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);

        Actor johnCena = new Actor("John Cena",39,"Male");
        Actor chloeBennet = new Actor("Chloe Bennet",24,"Female");
        Actor sethRogen = new Actor ("Seth Rogen",34,"Male");
        mActorList = new ArrayList<>();
        mActorList.add(johnCena);
        mActorList.add(chloeBennet);
        mActorList.add(sethRogen);
        mRecyclerAdapter = new RecyclerAdapter(mActorList, MainActivity.this);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setAdapter(mRecyclerAdapter);



    }
}

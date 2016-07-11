package ly.generalassemb.actors_list_trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecycler;
    ArrayList<Actor> mActorArrayList;
    RecyclerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecycler = (RecyclerView) findViewById(R.id.recycler_view);
        mActorArrayList = new ArrayList<>();

        Actor bradPitt = new Actor("Brad Pitt", 50, "man");
        Actor susanSarandon = new Actor("Susan Sarandon", 55, "lady");
        Actor milaKunis = new Actor("Mila Kunis", 30, "lady");

        mActorArrayList.add(bradPitt);
        mActorArrayList.add(susanSarandon);
        mActorArrayList.add(milaKunis);

        mAdapter = new RecyclerAdapter(mActorArrayList, MainActivity.this);
        mRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecycler.setAdapter(mAdapter);



    }
}

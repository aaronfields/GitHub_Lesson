package ly.generalassemb.actors_list_trial1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView.Adapter mRecyclerAdapter;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView mRecyclerView;
    List<Actor> mActorList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        layoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(layoutManager);

        Actor johnCena = new Actor("John Cena",39,"Male");
        Actor chloeBennet = new Actor("Chloe Bennet",24,"Female");
        Actor sethRogen = new Actor ("Seth Rogen",34,"Male");
        mActorList = new ArrayList<>();
        mActorList.add(johnCena);
        mActorList.add(chloeBennet);
        mActorList.add(sethRogen);
        mRecyclerAdapter = new RecyclerAdapter(mActorList,this);

        mRecyclerView.setAdapter(mRecyclerAdapter);


    }
}

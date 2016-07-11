package ly.generalassemb.actors_list_trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

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

        Actor johnCena = new Actor("John Cena",39,"Male","http://wish.org/~/media/100-000/Content/Cena%20500/cena200x299.ashx?h=299&w=200&la=en");
        Actor chloeBennet = new Actor("Chloe Bennet",24,"Female","http://vignette1.wikia.nocookie.net/agentsofshield/images/b/b1/Tumblr_mwophcxL1r1rjtt9yo1_1280.jpg/revision/latest?cb=20131202102556");
        Actor sethRogen = new Actor ("Seth Rogen",34,"Male","http://i.dailymail.co.uk/i/pix/2014/04/23/article-2610769-1D45FCEB00000578-950_634x423.jpg");
        mActorList = new ArrayList<>();
        mActorList.add(johnCena);
        mActorList.add(chloeBennet);
        mActorList.add(sethRogen);
        mRecyclerAdapter = new RecyclerAdapter(mActorList,this);

        mRecyclerView.setAdapter(mRecyclerAdapter);

    }
}

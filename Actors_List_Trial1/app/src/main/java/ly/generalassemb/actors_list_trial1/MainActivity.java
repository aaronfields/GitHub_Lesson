package ly.generalassemb.actors_list_trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> mActorsList;
    String actor1;
    String actor2;
    String actor3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        actor1 = "Christopher Waltz";
        actor2 = "Steve Carrell";
        actor3 = "BJ Novak";

        mActorsList =new ArrayList<String>();

        mActorsList.add(actor1);
        mActorsList.add(actor2);
        mActorsList.add(actor3);


    }
}

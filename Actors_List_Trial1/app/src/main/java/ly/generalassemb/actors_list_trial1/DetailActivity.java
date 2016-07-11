package ly.generalassemb.actors_list_trial1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    ImageView actorImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        actorImage = (ImageView) findViewById(R.id.actor_image);
        Picasso.with(this)
                .load(getIntent().getStringExtra("actor_pic"))
                .into(actorImage);

    }
}

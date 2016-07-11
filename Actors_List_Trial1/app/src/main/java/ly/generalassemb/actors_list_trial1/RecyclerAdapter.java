package ly.generalassemb.actors_list_trial1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samwyz on 7/11/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.myViewHolder> {


    LayoutInflater mInflater;
    List<Actor> mActorList;
    Context mContext;

    RecyclerAdapter(List<Actor> actorList, Context context) {
        this.mActorList = actorList;
        this.mContext = context;

    }


    @Override
    public myViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = mInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);

        myViewHolder holder = new myViewHolder(v, mContext, mActorList);
        return holder;
    }

    @Override
    public void onBindViewHolder(myViewHolder holder, int position) {

        holder.actorName.setText(mActorList.get(position).getName());
        holder.actorAge.setText(String.valueOf(mActorList.get(position).getAge()));
        holder.actorSex.setText(mActorList.get(position).getSex());


    }

    @Override
    public int getItemCount() {
        return mActorList.size();
    }


    public class myViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {


        public TextView actorName, actorAge, actorSex;

        List<Actor> actorList = new ArrayList<>();
        Context context;

        public myViewHolder(View itemView, Context context, List<Actor> actor) {
            super(itemView);
            this.actorList = actor;
            this.context = context;

            itemView.setOnClickListener(this);

            actorName = (TextView) itemView.findViewById(R.id.actor_name);
            actorAge = (TextView) itemView.findViewById(R.id.actor_age);
            actorSex = (TextView) itemView.findViewById(R.id.actor_sex);


        }

        // telling my ClickListener what to do
        @Override
        public void onClick(View view) {
            int position = getAdapterPosition();
            Actor actor = this.actorList.get(position);
            Intent intent = new Intent(this.context, ActorDetail.class);
            intent.putExtra("actor_name", actor.getName());
            intent.putExtra("actor_age", actor.getAge());
            intent.putExtra("actor_sex", actor.getSex());
            this.context.startActivity(intent);


        }
    }


}

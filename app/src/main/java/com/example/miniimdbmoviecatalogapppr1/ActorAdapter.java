package com.example.miniimdbmoviecatalogapppr1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ActorAdapter extends RecyclerView.Adapter<ActorAdapter.ActorViewHolder> {

    private Context context;
    private List<Actor> actorList;

    public ActorAdapter(Context context, List<Actor> actorList) {
        this.context = context;
        this.actorList = actorList;
    }

    @NonNull
    @Override
    public ActorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_actor, parent, false);
        return new ActorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ActorViewHolder holder, int position) {
        Actor actor = actorList.get(position);
        holder.actorName.setText(actor.getName());
        holder.actorPhoto.setImageResource(actor.getPhotoResId());
    }

    @Override
    public int getItemCount() {
        return actorList.size();
    }

    static class ActorViewHolder extends RecyclerView.ViewHolder {
        ImageView actorPhoto;
        TextView actorName;

        public ActorViewHolder(@NonNull View itemView) {
            super(itemView);
            actorPhoto = itemView.findViewById(R.id.actorPhoto);
            actorName = itemView.findViewById(R.id.actorName);
        }
    }
}
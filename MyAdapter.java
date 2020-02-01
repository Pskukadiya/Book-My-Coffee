package com.example.bookmycoffee;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private List<Model> mlist;

    public MyAdapter(List<Model> mlist) {
        this.mlist =mlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Model mymodel = mlist.get(position);
        holder.title.setText(mymodel.getTitle());
        holder.dec.setText(mymodel.getDec());
        holder.icon.setImageResource(mymodel.getImage());
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView title,dec;
        ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            title=itemView.findViewById(R.id.title);
            dec=itemView.findViewById(R.id.description);
            icon=itemView.findViewById(R.id.cardImgView);
        }

        //Maut ka nanga nach

        @Override
        public void onClick(View view) {
            //Get position of clicked items
            int position = getAdapterPosition();
            Model item = mlist.get(position);
            Intent intent = new Intent(context,CoffeeShopProfile.class);
            intent.putExtra("title",item.getTitle());
            intent.putExtra("icon",item.getImage());
            context.startActivity(intent);
        }
    }
}

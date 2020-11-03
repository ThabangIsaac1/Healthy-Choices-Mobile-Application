package com.example.healthychoices;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>{
    ArrayList fruitNames;
    ArrayList fruitDescription;
    ArrayList fruitImages;
    Context context;
    public CustomAdapter(Context context, ArrayList fruitNames,ArrayList fruitDescription, ArrayList fruitImages ) {
        this.context = context;
        this.fruitNames = fruitNames;
        this.fruitDescription = fruitDescription;
        this.fruitImages = fruitImages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_list, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(fruitNames.get(position).toString());
        holder.description.setText(fruitDescription.get(position).toString());

        // holder.image.setImageResource((Integer) fruitImages.get(position));
        Picasso.get().load((int)fruitImages.get(position)).into(holder.image);
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(view,fruitNames.get(position).toString() + " Selected",Snackbar.LENGTH_LONG);
                snackbar.show();

                final Intent intent;
                if (fruitNames.get(position).toString() == "Apples"){
                    intent =  new Intent(context, Details.class);
                } else if (fruitNames.get(position).toString() == "Apples"){
                    intent =  new Intent(context, Details.class);
                } else {
                    intent =  new Intent(context, fruitsrecyler.class);
                }
                context.startActivity(intent);


            }


        });
    }

    @Override
    public int getItemCount() {
        return fruitNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        TextView description;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.fruitname);
            description = (TextView) itemView.findViewById(R.id.fruitdescriptions);
            image = (ImageView) itemView.findViewById(R.id.fruitimage);

        }
    }


}

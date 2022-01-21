package com.linuxuser.apibasednewsapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    Context context;
    SampleData sampleData;

    public AdapterRecyclerView(Context context, SampleData sampleData) {
        this.context = context;
        this.sampleData = sampleData;
    }


    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.itemofrecyclerview,null,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailedNews.class);
                context.startActivity(intent);
            }
        });
        holder.newsheading.setText(sampleData.getHeadline());
        holder.newstime.setText(sampleData.getPublishedat());
        holder.newscontent.setText(sampleData.getContent());
        holder.newsauthor.setText(sampleData.getAuthor());
        Glide.with(context).load("https://media.istockphoto.com/photos/shell-script-inscription-against-laptop-and-code-background-concept-picture-id1313617131?s=612x612").into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView newsheading,newsauthor,newscontent,newstime;
        ImageView imageView;
        CardView cardView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            newsheading=itemView.findViewById(R.id.headline);
            newscontent=itemView.findViewById(R.id.newscontent);
            newsauthor=itemView.findViewById(R.id.author);
            newstime=itemView.findViewById(R.id.publisiontime);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }
}

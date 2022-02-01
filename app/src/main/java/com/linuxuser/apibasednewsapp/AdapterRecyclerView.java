package com.linuxuser.apibasednewsapp;

import android.annotation.SuppressLint;
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

import java.util.ArrayList;

public class AdapterRecyclerView extends RecyclerView.Adapter<AdapterRecyclerView.ViewHolder> {
    Context context;
    ArrayList<SampleData> newslist;

    public AdapterRecyclerView(Context context, ArrayList<SampleData> newslist) {
        this.context = context;
        this.newslist = newslist;
    }


    @NonNull
    @Override
    public AdapterRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.itemofrecyclerview,null,false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterRecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,DetailedNews.class);
                intent.putExtra("url",newslist.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        /*holder.newsheading.setText(sampleData.getHeadline());
        holder.newstime.setText(sampleData.getPublishedat());
        holder.newscontent.setText(sampleData.getContent());
        holder.newsauthor.setText(sampleData.getAuthor());
        Glide.with(context).load("https://media.istockphoto.com/photos/shell-script-inscription-against-laptop-and-code-background-concept-picture-id1313617131?s=612x612").into(holder.imageView);*/
        holder.newstime.setText("Published At: "+newslist.get(position).getPublishedat());
        holder.newsauthor.setText(newslist.get(position).getAuthor());
        holder.newsheading.setText(newslist.get(position).getHeadline());
        holder.newscontent.setText(newslist.get(position).getContent());
        Glide.with(context).load(newslist.get(position).getUrlOfImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return newslist.size() ;
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

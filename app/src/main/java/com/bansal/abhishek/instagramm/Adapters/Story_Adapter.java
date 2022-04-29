package com.bansal.abhishek.instagramm.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bansal.abhishek.instagramm.Models.Story_Model;
import com.bansal.abhishek.instagramm.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Story_Adapter extends RecyclerView.Adapter<Story_Adapter.ViewHolder>{
    ArrayList<Story_Model> list;
    Context context;

    public Story_Adapter(ArrayList<Story_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.story_recycler_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull ViewHolder holder, int position) {
    Story_Model model = list.get(position);
    holder.imageView.setImageResource(model.getPics());
    holder.textView.setText(model.getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.story_img);
            textView = itemView.findViewById(R.id.story_name);
        }


    }
}

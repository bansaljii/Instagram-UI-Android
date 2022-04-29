package com.bansal.abhishek.instagramm.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bansal.abhishek.instagramm.Models.Post_Model;
import com.bansal.abhishek.instagramm.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class Post_Adapter extends RecyclerView.Adapter<Post_Adapter.viewHolder>{
    ArrayList<Post_Model> list;
    Context context;

    public Post_Adapter(ArrayList<Post_Model> list, Context context) {
        this.list = list;
        this.context = context;
    }


    @NonNull
    @NotNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.post_recycler_view,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull viewHolder holder, int position) {
        Post_Model model = list.get(position);
        holder.circularImg.setImageResource(model.getCircularImg());
        holder.PostImg.setImageResource(model.getPostImg());
        holder.UserNamePost.setText(model.getUserName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView circularImg , PostImg;
        TextView UserNamePost;

        public viewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            circularImg = itemView.findViewById(R.id.circular_post);
            PostImg = itemView.findViewById(R.id.post_image);
            UserNamePost = itemView.findViewById(R.id.post_username);
        }
    }
}

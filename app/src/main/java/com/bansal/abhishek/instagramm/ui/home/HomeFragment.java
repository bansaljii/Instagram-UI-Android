package com.bansal.abhishek.instagramm.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.bansal.abhishek.instagramm.Adapters.Post_Adapter;
import com.bansal.abhishek.instagramm.Adapters.Story_Adapter;
import com.bansal.abhishek.instagramm.Models.Post_Model;
import com.bansal.abhishek.instagramm.Models.Story_Model;
import com.bansal.abhishek.instagramm.R;
import com.bansal.abhishek.instagramm.databinding.FragmentHomeBinding;

import java.util.ArrayList;

//import com.bansal.abhishek.instagramm.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    RecyclerView recyclerViewPost;
    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.recyclerView);
        ArrayList<Story_Model> list = new ArrayList<>();
        list.add(new Story_Model(R.drawable.kartik,"Kartik Bhargava"));
        list.add(new Story_Model(R.drawable.pics, "Abhishek Bansal"));
        list.add(new Story_Model(R.drawable.anmol, "Anmol Tyagi"));
        list.add(new Story_Model(R.drawable.pankaj,"Pankaj Bansal"));
        list.add(new Story_Model(R.drawable.bansaljii, "Bansal Jii"));
        list.add(new Story_Model(R.drawable.anmol,"Anmol Tyagi"));
        list.add(new Story_Model(R.drawable.shrijan,"Shrijan Giri"));
        Story_Adapter adapter = new Story_Adapter(list, getActivity());
        recyclerView.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);


        //code for post recycler view
        recyclerViewPost = root.findViewById(R.id.recyclerViewPost);
        ArrayList<Post_Model> postlist = new ArrayList<>();
        postlist.add((new Post_Model(R.drawable.kartik,R.drawable.kartik,"Kartik Bhargav")));
        postlist.add(new Post_Model(R.drawable.pics,R.drawable.picccc,"Abhishek Bansal"));
        postlist.add(new Post_Model(R.drawable.anmol,R.drawable.anmol, "Anmol Tyagi"));
        postlist.add(new Post_Model(R.drawable.kartik,R.drawable.piccc,"Kartik Bhargav"));
        postlist.add(new Post_Model(R.drawable.anmol,R.drawable.picc,"Anmol Tyagi"));
        postlist.add(new Post_Model(R.drawable.pankaj,R.drawable.pankaj,"Pankaj Bansal"));
        postlist.add(new Post_Model(R.drawable.pics,R.drawable.picccc,"Abhishek Bansal"));
        postlist.add(new Post_Model(R.drawable.shrijan,R.drawable.shrijan, "Shrijan Giri"));
        postlist.add(new Post_Model(R.drawable.piccccc,R.drawable.pics,"Bansal Jii"));
        postlist.add(new Post_Model(R.drawable.rohan,R.drawable.rohan, "Rohan Arya"));
        postlist.add((new Post_Model(R.drawable.kartik,R.drawable.kartik,"Kartik Bhargav")));
        postlist.add(new Post_Model(R.drawable.pics,R.drawable.picccc,"Abhishek Bansal"));
        postlist.add(new Post_Model(R.drawable.anmol,R.drawable.anmol, "Anmol Tyagi"));
        postlist.add(new Post_Model(R.drawable.anmol,R.drawable.picc,"Anmol Tyagi"));
        postlist.add(new Post_Model(R.drawable.pankaj,R.drawable.pankaj,"Pankaj Bansal"));


        Post_Adapter adapter1 = new Post_Adapter(postlist,getActivity());
        recyclerViewPost.setAdapter(adapter1);
        LinearLayoutManager layoutManagerPost = new LinearLayoutManager(getActivity());
        recyclerViewPost.setLayoutManager(layoutManagerPost);

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}
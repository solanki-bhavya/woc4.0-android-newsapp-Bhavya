package com.linuxuser.apibasednewsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EntertainmentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class EntertainmentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public EntertainmentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment EntertainmentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static EntertainmentFragment newInstance(String param1, String param2) {
        EntertainmentFragment fragment = new EntertainmentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    String apikey="f3704f2408b54fafbca5f1dce20f0cb7";
    ArrayList<SampleData> newslist;
    String country="in",category="entertainment";
    AdapterRecyclerView adapter;
    private RecyclerView recyclerViewofentertainment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_entertainment, null);
        recyclerViewofentertainment=v.findViewById(R.id.entertainmentrecyclerview);
        newslist=new ArrayList<>();
        recyclerViewofentertainment.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new AdapterRecyclerView(getContext(),newslist);
        recyclerViewofentertainment.setAdapter(adapter);
        findNews();
        adapter.notifyDataSetChanged();
        return v;
    }
    private void findNews(){
        BackendOfApplication.getApiInterface().getCategoryNews(country,category,30,apikey).enqueue(new Callback<NewsResponse>() {
            @Override
            public void onResponse(Call<NewsResponse> call, Response<NewsResponse> response) {
                if(response.isSuccessful()) {
                    newslist.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }

            }

            @Override
            public void onFailure(Call<NewsResponse> call, Throwable t) {

            }
        });
    }
}
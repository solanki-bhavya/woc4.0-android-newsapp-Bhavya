package com.linuxuser.apibasednewsapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SportsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SportsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SportsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment SportsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static SportsFragment newInstance(String param1, String param2) {
        SportsFragment fragment = new SportsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    SampleData item=new SampleData("MSTC DA-IICT","Linux Operating System Users Are Born Developers Because They Know Value of Terminal and Command Line","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean porttitor enim ut lorem semper tempor. Nulla vitae aliquet mi. Donec at urna vel sapien rutrum posuere. Praesent et tortor sed lacus venenatis ultrices. Phasellus a elementum lectus.","Published AT "+"21-01-2022 12:30");
    AdapterRecyclerView adapter;
    private RecyclerView recyclerViewofsports;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_sports, null);
        recyclerViewofsports=v.findViewById(R.id.sportsrecyclerview);
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter=new AdapterRecyclerView(getContext(),item);
        recyclerViewofsports.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        return v;
    }
}
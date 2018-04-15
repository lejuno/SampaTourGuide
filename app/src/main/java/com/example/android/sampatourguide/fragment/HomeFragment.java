package com.example.android.sampatourguide.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.android.sampatourguide.Other.Suggestion;
import com.example.android.sampatourguide.Other.SuggestionAdapter;
import com.example.android.sampatourguide.R;
import com.example.android.sampatourguide.support.Home;

import java.util.ArrayList;
import java.util.List;

/**
 * HomeFragment
 * Holds Home History suggestion list
 */
public class HomeFragment extends Fragment {
    /**
     * Constructor
     */
    public HomeFragment() {
        // Required empty public constructor
    }

    /**
     * onCreateView
     * Initialize Home History List and return the view with parks list.
     *
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Suggestion> list = new ArrayList<>();
        Home.initHomeList(list, getContext());

        SuggestionAdapter adapter = new SuggestionAdapter(getActivity(), -1, list);
        View view = inflater.inflate(R.layout.sugestion_list, container, false);
        ListView listView = (ListView) view.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return view;
    }

    /**
     * Used to set title text
     *
     * @param view
     * @param savedInstanceState
     */
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle(R.string.string_home);
    }
}

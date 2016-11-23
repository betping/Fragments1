package com.acadgild.fragments1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by hp on 22-11-2016.
 */

public class SimpleAddition extends Fragment {
    TextView textView;
    View rootView;
    MainActivity activity= (MainActivity) getActivity();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        rootView= inflater.inflate(R.layout.simple_addition,container,false);
        return rootView;
    }
}

package com.myapplicationdev.android.knowyourfacts_ps_team4;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment_Frag3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment_Frag3 extends Fragment {
    TextView tv3;
    Button btnColor3;
    LinearLayout ll;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment_Frag3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment_Frag3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment_Frag3 newInstance(String param1, String param2) {
        Fragment_Frag3 fragment = new Fragment_Frag3();
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment__frag3, container, false);

        tv3 = view.findViewById(R.id.tv3);
        btnColor3 = view.findViewById(R.id.btnColor3);
        ll = view.findViewById(R.id.ll3);
        ll.setBackgroundColor(Color.CYAN);

        tv3.setText("Honey is the only food that does not spoil. Honey found in the tombs of Egyptian pharaohs has been tasted by archaeologists and found edible.");

        btnColor3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundColor();
            }
        });
        return view;
    }
    public void setBackgroundColor(){

        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        ll.setBackgroundColor(color);
    }
}
package com.dzaki.utsakb4.Fragment;
/**
 * Nama : Dzaki Fakhruddin
 * NIM : 10116156
 * Kelas : AKB 4
 * Waktu Pengerjaan : 21 Mei 2019
 */


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dzaki.utsakb4.R;


public class KontakFragment extends Fragment {

    ImageView fb;


    public KontakFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontak, container, false);




    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {


        ImageView ig = (ImageView) view.findViewById(R.id.instagram);



        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri uriUrl = Uri.parse("https://www.instagram.com/dzakifakh_/");

                Intent browse_intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(browse_intent);
            }
        });









    }


}

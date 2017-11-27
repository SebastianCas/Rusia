package com.example.sistemas.rusia;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class Estadios extends Fragment {

    private ImageButton btkaliningrad,btpetersburgo,btloujniki,btrostov,btsochi,btvolgogrado,btmordovia,btnovgorod,btkazan,btkosmos,btcentral,btotkrytie;
    private FragmentActivity myContext;
    View view;

    public Estadios() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view= inflater.inflate(R.layout.fragment_estadios, container, false);

        btkaliningrad = (ImageButton) view.findViewById(R.id.kaliningrad);
        btpetersburgo = (ImageButton) view.findViewById(R.id.petersburgo);
        btloujniki = (ImageButton) view.findViewById(R.id.loujniki);
        btrostov = (ImageButton) view.findViewById(R.id.rostov);
        btsochi = (ImageButton) view.findViewById(R.id.sochi);
        btvolgogrado = (ImageButton) view.findViewById(R.id.volgogrado);
        btmordovia = (ImageButton) view.findViewById(R.id.mordovia);
        btnovgorod = (ImageButton) view.findViewById(R.id.novgorod);
        btkazan = (ImageButton) view.findViewById(R.id.kazan);
        btkosmos = (ImageButton) view.findViewById(R.id.kosmos);
        btcentral = (ImageButton) view.findViewById(R.id.central);
        btotkrytie = (ImageButton) view.findViewById(R.id.otkrytie);

        btkaliningrad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",1);
                startActivity(miIntent);
            }
        });

        btpetersburgo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btloujniki.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btrostov.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btsochi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btvolgogrado.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btmordovia.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btnovgorod.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btkazan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btkosmos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btcentral.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        btotkrytie.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent miIntent=new Intent(myContext,Mapa.class);
                miIntent.putExtra("lugar",2);
                startActivity(miIntent);
            }
        });

        return view;
    }

}

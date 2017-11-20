package com.example.most601.listofarticles;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity

    implements HeadLinesFregment.OnFragmentInteractionListener {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState != null ){
            return;
        }

        HeadLinesFregment aaa = new HeadLinesFregment();
        aaa.setArguments(getIntent().getExtras());

        getSupportFragmentManager().beginTransaction().add(R.id.fregment_cointent , aaa ).commit();



    }
    @Override
    public void onArticleSelcted(int position) {
        ArticleFregment bbb = ArticleFregment.newInstance(position);
        android.support.v4.app.FragmentTransaction aaaaa = getSupportFragmentManager().beginTransaction();

        aaaaa.replace(R.id.fregment_cointent , bbb);
        aaaaa.addToBackStack(null);
        aaaaa.commit();

    }
}

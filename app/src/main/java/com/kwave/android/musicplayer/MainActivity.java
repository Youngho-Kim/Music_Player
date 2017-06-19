package com.kwave.android.musicplayer;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    FrameLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setViews();
        setFragment(new ListFragment());    // 목록프래그먼트



    }

    private void setViews(){
        layout = (FrameLayout) findViewById(R.id.layout);
    }


    // 세팅하고자 하는 프래그먼트를 인자로 넣어주면 getSupportFragmentManager가
    // beginTransaction을 실행하고 transaction에 해당하는 레이아웃과 fragment를 더해주면
    // commit해서 반영을 시킨다.
    private  void setFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.layout,fragment);
        transaction.commit();

    }
}

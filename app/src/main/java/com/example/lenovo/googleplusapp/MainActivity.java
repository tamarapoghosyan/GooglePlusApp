package com.example.lenovo.googleplusapp;


import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,Fragment1Callback, Fragment2.OnFragmentInteractionListener,Fragment3.OnFragmentInteractionListener,Fragment4.OnFragmentInteractionListener,Fragment5.OnFragmentInteractionListener,Fragment6.OnFragmentInteractionListener,Fragment7.OnFragmentInteractionListener{

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    FrameLayout frameLayout;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    Fragment fragment=null;
    int conteinerId=0;
    String tag=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= (Button) findViewById(R.id.act_main_navig_btn_1);
        btn2= (Button) findViewById(R.id.act_main_navig_btn_2);
        btn3= (Button) findViewById(R.id.act_main_navig_btn_3);
        btn4= (Button) findViewById(R.id.act_main_navig_btn_4);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);


        frameLayout= (FrameLayout) findViewById(R.id.act_main_conteiner);

         fragmentManager=getSupportFragmentManager();
         fragmentTransaction=fragmentManager.beginTransaction();

        conteinerId=R.id.act_main_conteiner;
        fragment=Fragment1.newInstance("fragment1 text");
        tag=Fragment1.TAG;
        frameLayout.setBackgroundColor(Color.BLUE);


        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(conteinerId, fragment, tag);
        fragmentTransaction.commit();


    }

    @Override
    public void onClick(View view) {
        fragmentTransaction=fragmentManager.beginTransaction();

        switch (view.getId()){
            case R.id.act_main_navig_btn_1:{
                tag=Fragment1.TAG;
                if(getFragmentManager().findFragmentByTag(tag)!=null){
                    Log.d("testt", "show hided 1 fragment ");
                    fragmentTransaction.hide(fragment);
                    fragment=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 1 fragment ");

                    fragmentTransaction.hide(fragment);
                    fragment = Fragment1.newInstance("fragment1 text");
                    frameLayout.setBackgroundColor(Color.BLUE);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_2:{
                tag=Fragment2.TAG;

                if(getFragmentManager().findFragmentByTag(tag)!=null){
                    Log.d("testt", "show hided 2 fragment ");

                    fragmentTransaction.hide(fragment);
                    fragment=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 1 fragment ");

                    fragmentTransaction.hide(fragment);
                   fragment = Fragment2.newInstance();
                    frameLayout.setBackgroundColor(Color.RED);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_3:{
                tag=Fragment3.TAG;
                if(getFragmentManager().findFragmentByTag(tag)!=null){
                    Log.d("testt", "show hided 3 fragment ");
                    fragmentTransaction.hide(fragment);
                    fragment=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 3 fragment ");
                    fragmentTransaction.hide(fragment);
                    fragment = Fragment3.newInstance("fragment3 text");
                    frameLayout.setBackgroundColor(Color.GREEN);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_4:{
                tag=Fragment4.TAG;
                if(getSupportFragmentManager().findFragmentByTag(tag)!=null){
                    Log.d("testt", "show hided 4 fragment ");
                    fragmentTransaction.hide(fragment);
                    fragment=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 4 fragment ");
                    fragmentTransaction.hide(fragment);
                    fragment = Fragment4.newInstance("fragment4 text");
                    frameLayout.setBackgroundColor(Color.YELLOW);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment, tag);
                    fragmentTransaction.commit();
                }
                break;
            }
        }
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void setTextToFragment3(String textToFragment3) {

    String tag=Fragment3.TAG;
        if(getSupportFragmentManager().findFragmentByTag(tag)!=null){
//            Log.d("testt", "njisn ");

            ((Fragment3)getSupportFragmentManager().findFragmentByTag(tag)).setTextToFragment(textToFragment3);

        }
        else{
    }}
}

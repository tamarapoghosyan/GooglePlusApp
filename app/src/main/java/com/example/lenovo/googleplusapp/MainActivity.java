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

    Fragment fragment1=null;
    Fragment fragment2=null;
    Fragment fragment3=null;
    Fragment fragment4=null;
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
        fragment1=Fragment1.newInstance("fragment1 text");
        tag=Fragment1.TAG;
        frameLayout.setBackgroundColor(Color.BLUE);


        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.add(conteinerId, fragment1, tag);
        fragmentTransaction.commit();


    }

    @Override
    public void onClick(View view) {
        fragmentTransaction=fragmentManager.beginTransaction();

        switch (view.getId()){
            case R.id.act_main_navig_btn_1:{
                tag=Fragment1.TAG;
                if(fragment1!=null){
                    Log.d("testt", "show hided 1 fragment ");
                    if (fragment2!=null){
                    fragmentTransaction.hide(fragment2);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }

                  //  fragment1=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment1);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 1 fragment ");
                    if (fragment2!=null){
                        fragmentTransaction.hide(fragment2);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }
//                    fragmentTransaction.hide(fragment);
                    fragment1 = Fragment1.newInstance("fragment1 text");
                    frameLayout.setBackgroundColor(Color.BLUE);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment1, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_2:{
                tag=Fragment2.TAG;

                if(fragment2!=null){
                    Log.d("testt", "show hided 2 fragment ");

                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }
//                    fragmentTransaction.hide(fragment);
//                    fragment2=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment2);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 2 fragment ");
                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }
                   fragment2 = Fragment2.newInstance();
                    frameLayout.setBackgroundColor(Color.RED);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment2, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_3:{
                tag=Fragment3.TAG;
                if(fragment3!=null){
                    Log.d("testt", "show hided 3 fragment ");
                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment2!=null){
                        fragmentTransaction.hide(fragment2);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }
//                    fragmentTransaction.hide(fragment);
//                    fragment3=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment3);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 3 fragment ");
                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment2!=null){
                        fragmentTransaction.hide(fragment2);

                    }
                    if (fragment4!=null){
                        fragmentTransaction.hide(fragment4);
                    }
//                    fragmentTransaction.hide(fragment);
                    fragment3 = Fragment3.newInstance("fragment3 text");
                    frameLayout.setBackgroundColor(Color.GREEN);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment3, tag);
                    fragmentTransaction.commit();
                }break;
            }
            case R.id.act_main_navig_btn_4:{
                tag=Fragment4.TAG;
                if(fragment4!=null){
                    Log.d("testt", "show hided 4 fragment ");
                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment2!=null){
                        fragmentTransaction.hide(fragment2);
                    }
//                    fragmentTransaction.hide(fragment);
//                    fragment=getSupportFragmentManager().findFragmentByTag(tag);
                    fragmentTransaction.show(fragment4);
                    fragmentTransaction.commit();
                }else {
                    Log.d("testt", "create 4 fragment ");
//                    fragmentTransaction.hide(fragment);
                    if (fragment1!=null){
                        fragmentTransaction.hide(fragment1);
                    }
                    if (fragment3!=null){
                        fragmentTransaction.hide(fragment3);

                    }
                    if (fragment2!=null){
                        fragmentTransaction.hide(fragment2);
                    }
                    fragment4 = Fragment4.newInstance("fragment4 text");
                    frameLayout.setBackgroundColor(Color.WHITE);
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.add(conteinerId, fragment4, tag);
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

        if(fragment3!=null){
//            Log.d("testt", "njisn ");

            ((Fragment3)fragment3).setTextToFragment(textToFragment3);

        }
        else{
    }}
}

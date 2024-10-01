package com.miracakkoyun.methodsandclasses;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    String username;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("On create called");
        miracMetodu();miracMetodu();
        System.out.println(mathMetodu(32,22));
        int k=mathMetodu(11,23);
        System.out.println(k*2);
        Musicians kamil=new Musicians("Kamil","Şiko",33);
        makeMusicians();
        System.out.println(kamil.instrument+kamil.name+kamil.age);
        deneme("Kadir","Kmean",31);
    }
    public void makeMusicians(){
        Musicians james= new Musicians("Miraç","Bateri",22);
        System.out.println(james.name);
    }
    public void deneme(String ad,String alet,int yas){
        Musicians jon=new Musicians(ad,alet,yas);
        System.out.println(jon.name+" "+jon.instrument);
    }

    // methodlarda void geriye bir değer döndürmeyecek demek oluyor
    // void yerine int boolean vs giib değişken trleri verseydik geriye o değişken türünden değer döndürcekti anlamına geliyor

    public void miracMetodu(){
        int x=4+4;
        System.out.println("value of x:"+x);
    }

    public int mathMetodu(int x , int y){
        return x+y;
    }



    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(
                "on resume called"
        );
    }

}
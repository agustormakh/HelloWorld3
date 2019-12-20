package com.example.pc_agus.v1popupwindow;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Dialog myDialog;
    private Button popUpBtn,animatorBtn;
    private ConstraintLayout constraintLayout;

    private ConstraintSet constraintSet = new ConstraintSet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person bauti = new Person("Bauti", 19,423568334);
        Student agus = new Student("Agus", 20 , 102948593 , "Cefe");

        Toast.makeText(MainActivity.this,bauti.decimeKienSos(),Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,agus.decimeKienSos(),Toast.LENGTH_LONG).show();

        myDialog= new Dialog(this);
        popUpBtn = findViewById(R.id.popup_btn);
        constraintLayout = findViewById(R.id.constraint_layout);
        animatorBtn = findViewById(R.id.button_animator);

        popUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtclose;
                Button btnFollow;
                myDialog.setContentView(R.layout.popup_window_1);
                txtclose = myDialog.findViewById(R.id.textclose);
                btnFollow = myDialog.findViewById(R.id.btnfollow);
                txtclose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        myDialog.dismiss();
                    }
                });
                myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                myDialog.show();
            }
        });

        animatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"se clickeo el boton",Toast.LENGTH_SHORT).show();
                constraintSet.load(MainActivity.this,R.layout.activity_main2);
                TransitionManager.beginDelayedTransition((ViewGroup) popUpBtn.getParent());
                constraintLayout.setConstraintSet(constraintSet);
            }
        });





    }
}

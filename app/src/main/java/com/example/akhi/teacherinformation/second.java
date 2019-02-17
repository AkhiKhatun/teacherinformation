package com.example.akhi.teacherinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second extends AppCompatActivity {

    private Button g,a,b,c,k,d,n,e,l,f,j,m,i,h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        g = (Button) findViewById(R.id.enterId1);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(second.this,DrGalib.class);
                startActivity(i);
            }
        });

        a= (Button) findViewById(R.id.enterId2);
        a.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,alam.class);
                                     startActivity(f);

                                 }
                             }

        );

        b= (Button) findViewById(R.id.enterId3);
        b.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,asif.class);
                                     startActivity(f);

                                 }
                             }
        );
        c= (Button) findViewById(R.id.enterId4);
        c.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,ashraf.class);
                                     startActivity(f);

                                 }
                             }

        );

        k= (Button) findViewById(R.id.enterId5);
        k.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,kamrul.class);
                                     startActivity(f);

                                 }
                             }

        );

        d= (Button) findViewById(R.id.enterId6);
        d.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,arif.class);
                                     startActivity(f);

                                 }
                             }

        );

        n= (Button) findViewById(R.id.enterId7);
        n.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,najmul.class);
                                     startActivity(f);

                                 }
                             }

        );

        e= (Button) findViewById(R.id.enterId8);
        e.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,amin.class);
                                     startActivity(f);

                                 }
                             }

        );

        l = (Button) findViewById(R.id.enterId9);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(second.this,MdNowshin.class);
                startActivity(f);
            }
        });

        f= (Button) findViewById(R.id.enterId10);
        f.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,arafat.class);
                                     startActivity(f);

                                 }
                             }


        );
        j= (Button) findViewById(R.id.enterId11);
        j.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,jannat.class);
                                     startActivity(f);

                                 }
                             }


        );


        m = (Button) findViewById(R.id.enterId12);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent f = new Intent(second.this, moni.class);
                startActivity(f);
            }
            });


        i= (Button) findViewById(R.id.enterId13);
        i.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,atish.class);
                                     startActivity(f);

                                 }
                             }

        );

        h= (Button) findViewById(R.id.enterId14);
        h.setOnClickListener(new View.OnClickListener() {
                                 @Override
                                 public void onClick(View v) {
                                     Intent f=new Intent(second.this,hira.class);
                                     startActivity(f);

                                 }
                             }
        );
    }
}




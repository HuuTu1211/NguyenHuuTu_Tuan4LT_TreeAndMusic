package com.example.nguyenhuutu_tuan3didong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chaynhac extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaynhac);
        findViewById( R.id.imageView10 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(Chaynhac.this,DanhsachMusic.class) );
                overridePendingTransition( R.anim.enter,R.anim.exit);


            }
        } );
    }
}
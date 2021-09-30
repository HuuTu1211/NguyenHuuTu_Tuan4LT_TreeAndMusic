package com.example.nguyenhuutu_tuan3didong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        findViewById( R.id.button ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this,DanhsachMusic.class) );
                overridePendingTransition( R.anim.enter,R.anim.exit );


            }
        } );

        findViewById( R.id.button2 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(MainActivity.this,TrangchuTree.class) );
                overridePendingTransition( R.anim.enter,R.anim.exit );


            }
        } );
    }


}
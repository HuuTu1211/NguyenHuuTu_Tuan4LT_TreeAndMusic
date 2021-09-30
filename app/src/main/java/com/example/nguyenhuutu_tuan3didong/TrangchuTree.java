package com.example.nguyenhuutu_tuan3didong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TrangchuTree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu_tree);
        findViewById( R.id.button3 ).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity( new Intent(TrangchuTree.this,DanhsachTree.class) );
                overridePendingTransition( R.anim.enter_x,R.anim.exit_x);


            }
        } );
    }
}
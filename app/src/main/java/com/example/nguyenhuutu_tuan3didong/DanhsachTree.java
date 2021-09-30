package com.example.nguyenhuutu_tuan3didong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.widget.ImageView;

public class DanhsachTree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danhsach_tree);

        Fade fade=new Fade();
        View decor=getWindow().getDecorView();
        getWindow().setEnterTransition( fade );
        getWindow().setExitTransition( fade );

        final ImageView imageView4=findViewById( R.id.img4 );
        imageView4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DanhsachTree.this,ChitietTree2.class);
                ActivityOptionsCompat optionsCompat =ActivityOptionsCompat.makeSceneTransitionAnimation( DanhsachTree.this
                        ,imageView4, ViewCompat.getTransitionName( imageView4 ));
                startActivity( intent,optionsCompat.toBundle() );


            }
        } );

        final ImageView imageView=findViewById( R.id.img6 );
        imageView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(DanhsachTree.this,ChitietTree.class);
                ActivityOptionsCompat optionsCompat=ActivityOptionsCompat.makeSceneTransitionAnimation( DanhsachTree.this
                        ,imageView, ViewCompat.getTransitionName( imageView ) );
                startActivity( intent,optionsCompat.toBundle() );

            }
        } );
    }
}
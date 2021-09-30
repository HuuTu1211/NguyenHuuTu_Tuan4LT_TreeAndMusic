package com.example.nguyenhuutu_tuan3didong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class MusicAdapter extends RecyclerView.Adapter<MusicAdapter.viewhover>{

    LayoutInflater layoutInflater;
    ArrayList<Music> musicArrayList;
    Context context;

    public MusicAdapter(Context context, ArrayList<Music> musicArrayList) {
        layoutInflater=LayoutInflater.from(context);
        this.musicArrayList = musicArrayList;
        this.context=context;
    }


    @Override
    public viewhover onCreateViewHolder( ViewGroup parent, int viewType) {
        View view=layoutInflater.inflate(R.layout.layout_item,parent,false);
        return new viewhover(view,this);
    }

    @Override
    public void onBindViewHolder( viewhover holder, int position) {
        Music music=musicArrayList.get(position);
        holder.music=music;
        holder.tvnamecs.setText(music.getTencs());
        holder.tvnamems.setText(music.getTenbaihat());
        holder.imganh.setImageResource(music.getImg());
        holder.imganh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context,Chaynhac.class);
                intent.putExtra("name", (CharSequence) music);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return musicArrayList.size();
    }

    public class viewhover extends RecyclerView.ViewHolder{
        Music music;
        MusicAdapter musicAdapter;
        TextView tvnamecs;
        TextView tvnamems;
        ImageView imganh;
        public viewhover(@NonNull View view,MusicAdapter adapter) {
            super(view);
            tvnamems=view.findViewById(R.id.textView8);
            tvnamecs=view.findViewById(R.id.textView9);
            imganh=view.findViewById(R.id.imageView9);
            this.musicAdapter=adapter;

        }
    }
}

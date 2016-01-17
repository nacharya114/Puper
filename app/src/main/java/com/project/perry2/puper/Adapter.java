package com.project.perry2.puper;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by Aditya Mohile on 12/29/2015.
 */
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private Context context1;
    private ClickListener clickListener;
    private  LayoutInflater inflater;
    List<Information> data = Collections.emptyList();
    public Adapter(Context context, List<Information> data){
        inflater = LayoutInflater.from(context);
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.custom_row,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information current = data.get(position);
        holder.title.setText(current.title);
        holder.icon.setImageResource(current.iconId);
    }

    public void setClickListener(ClickListener clickListener){
        this.clickListener=clickListener;
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView title;
        ImageView icon;
        RelativeLayout navRow;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.listText);
            icon = (ImageView) itemView.findViewById(R.id.listIcon);
            navRow = (RelativeLayout)itemView.findViewById(R.id.customRow);
            navRow.setOnClickListener(this);
            //icon.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener!=null){
                clickListener.itemClicked(v,getAdapterPosition());
            }
        }
    }

    public interface ClickListener{
        public void itemClicked(View view, int position);
    }
}

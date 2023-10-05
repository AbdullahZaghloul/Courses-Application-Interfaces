package com.abdullah.course_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class course_adapter extends RecyclerView.Adapter<course_adapter.viewHolder> {
    ArrayList<courseDomain> items;
    Context context;

    public course_adapter(ArrayList<courseDomain> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @NonNull
    @Override
    public course_adapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_course,parent,false);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull course_adapter.viewHolder holder, int position) {

        Glide.with(context).load(items.get(position).getPicPath()).into(holder.pic);
        holder.titleText.setText(items.get(position).getTitle());
        holder.priceText.setText(items.get(position).getPrice()+"");
        holder.ownerText.setText(items.get(position).getOwner());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView pic;
        TextView titleText,ownerText,priceText;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            pic=itemView.findViewById(R.id.pic_id);
            titleText=itemView.findViewById(R.id.title_id);
            ownerText=itemView.findViewById(R.id.owner_txt_id);
            priceText=itemView.findViewById(R.id.price_txt_id);

        }
    }
}

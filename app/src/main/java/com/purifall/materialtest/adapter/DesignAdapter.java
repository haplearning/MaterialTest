package com.purifall.materialtest.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.purifall.materialtest.R;

import java.util.ArrayList;

public class DesignAdapter extends RecyclerView.Adapter {
    private final Context mContext;
    private final ArrayList<String> mData;

    public DesignAdapter(Context mContext, ArrayList<String> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.base_item, parent, false);
        return new DesignViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        ((DesignViewHolder) holder).itemBtn.setText(mData.get(position));
        ((DesignViewHolder) holder).itemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (mData.get(position)){
                    case "Toolbar": {
                        break;
                    }
                    default:
                        break;
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    private static class DesignViewHolder extends RecyclerView.ViewHolder {
        private final Button itemBtn;
        public DesignViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemBtn = itemView.findViewById(R.id.baseItemBtn);
        }
    }
}

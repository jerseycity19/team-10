package com.example.codeforgood.UI_Components;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codeforgood.R;
import com.example.codeforgood.models.MeetingEvent;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private Context context;
    private List<MeetingEvent> meetings;
    @NonNull
    @Override
    public EventAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull EventAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView monthtv, dateTv;
        private ImageView imageView;

        public ViewHolder(View itemView){
            super(itemView);
            monthtv = itemView.findViewById(R.id.month_id);
            dateTv = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.eventPosterId);
        }
    }
}

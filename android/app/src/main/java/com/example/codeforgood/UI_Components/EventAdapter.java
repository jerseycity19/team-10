package com.example.codeforgood.UI_Components;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.codeforgood.R;
import com.example.codeforgood.models.MeetingEvent;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.ViewHolder> {
    private Context context;
    private List<MeetingEvent> meetings;


    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView monthtv, dateTv;
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            monthtv = itemView.findViewById(R.id.month_id);
            dateTv = itemView.findViewById(R.id.date);
            imageView = itemView.findViewById(R.id.eventPosterId);
        }

        void bind(MeetingEvent meetingEvent) {
            monthtv.setText(meetingEvent.getMonth());
            dateTv.setText(meetingEvent.getDate());
//            Glide.with(context).load(String.format("https://image.tmdb.org/t/p/w342%s", movie.getPosterPath())).into(ivPoster);

//            container.setOnClickListener(v -> {
//                Intent intent = new Intent(context, DetailActivity.class);
//                intent.putExtra(MVBUNDLE, movie);
//                context.startActivity(intent);
//            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.event_item_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        MeetingEvent movie = meetings.get(position);
        viewHolder.bind(movie);
    }

    @Override
    public int getItemCount() {
        if (meetings != null) {
            return meetings.size();
        } else {
            return 0;
        }
    }

}

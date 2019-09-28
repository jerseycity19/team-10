package com.example.codeforgood.UI_Components;

import android.content.Context;
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

    public EventAdapter(Context context, List<MeetingEvent> meetings) {
        this.context = context;
        this.meetings = meetings;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView dayTv, dateTv;
        private ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            dayTv = itemView.findViewById(R.id.day_id);
            dateTv = itemView.findViewById(R.id.Date_id);
            imageView = itemView.findViewById(R.id.eventPosterId);
        }

        void bind(MeetingEvent meetingEvent) {

            dayTv.setText(String.valueOf(meetingEvent.getDay()));
            dateTv.setText(meetingEvent.getDate());
            Glide.with(context).load(meetingEvent.getImagePath()).into(imageView);

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
        MeetingEvent meeting = meetings.get(position);
        viewHolder.bind(meeting);
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

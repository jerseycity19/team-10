package com.example.codeforgood;

import android.os.Bundle;

import com.example.codeforgood.UI_Components.EventAdapter;
import com.example.codeforgood.models.MeetingEvent;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private EventAdapter eventAdapter;
    private List<MeetingEvent> meetingEvents;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        meetingEvents = new ArrayList<>();
        meetingEvents.add(new MeetingEvent("",4,"Mon","https://musicoomph.com/wp-content/uploads/2018/03/benefits-of-going-to-live-music-concerts.jpg"));
        meetingEvents.add(new MeetingEvent("",5,"Wed","https://www.insure-our-event.co.uk/wp-content/uploads/2018/08/music-event-1024x683.jpg"));
        meetingEvents.add(new MeetingEvent("",9,"Sun","https://www.insure-our-event.co.uk/wp-content/uploads/2018/08/music-event-1024x683.jpg"));
        meetingEvents.add(new MeetingEvent("",10,"Sun","https://www.insure-our-event.co.uk/wp-content/uploads/2018/08/music-event-1024x683.jpg"));
        initRecylerView();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    private void initRecylerView() {
        RecyclerView recyclerView = findViewById(R.id.eventRV);
        eventAdapter = new EventAdapter(this, meetingEvents);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(eventAdapter); //pair recyclerView and an adapter together
    }
}

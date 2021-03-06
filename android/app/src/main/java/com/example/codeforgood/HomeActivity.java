package com.example.codeforgood;

import android.content.Intent;
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
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {
    private EventAdapter eventAdapter;
    private List<MeetingEvent> meetingEvents;
    private TextView meetPplTV;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        meetingEvents = new ArrayList<>();
        meetPplTV = findViewById(R.id.meetPeople_id);
        fab = findViewById(R.id.survey_id);
        meetingEvents.add(new MeetingEvent("","12","Mon","https://musicoomph.com/wp-content/uploads/2018/03/benefits-of-going-to-live-music-concerts.jpg"));
        meetingEvents.add(new MeetingEvent("","13","Wed","https://www.chinahighlights.com/image/amp/beijing-opera.jpg"));
        meetingEvents.add(new MeetingEvent("","1","Sun","data:image/jpeg;base64,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"));
        meetingEvents.add(new MeetingEvent("","20","Sun","https://www.insure-our-event.co.uk/wp-content/uploads/2018/08/music-event-1024x683.jpg"));
        initRecylerView();

        meetPplTV.setOnClickListener(v -> {
            Intent intent = new Intent(this, MeetPeopleActivity.class);
            startActivity(intent);
        });

        fab.setOnClickListener(v -> {
            Intent intent = new Intent(this, SurveyActivity.class);
            startActivity(intent);
        });
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

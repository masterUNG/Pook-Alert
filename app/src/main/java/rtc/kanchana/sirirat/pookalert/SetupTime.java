package rtc.kanchana.sirirat.pookalert;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.CalendarView;
import android.widget.TimePicker;
import android.widget.Toast;

public class SetupTime extends AppCompatActivity {

    //Explicit
    private CalendarView calendarView;
    private TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setup_time);

        //Bind Widget
        calendarView = (CalendarView) findViewById(R.id.calendarView);


        //CalendarView Controller
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(CalendarView calendarView, int year, int month, int day) {

                Log.d("pookV1", "date ==> " + day + "/" + (month + 1) + "/" + year);
                Toast.makeText(SetupTime.this, "คุณเลือก " + day + "/" + (month + 1) + "/" + year,
                        Toast.LENGTH_SHORT).show();

            }   // onSelected
        });


    }   // Main Method




}   // Main Class

package sg.edu.rp.c346.p02_holidays;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvName;
    TextView tvDate;
    ArrayAdapter aa;
    ArrayList<Holidays> holiday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        lv = (ListView) findViewById (R.id.lvHoliday);
        tvName = (TextView) findViewById(R.id.tvTypes);


        holiday = new ArrayList<Holidays>();

        Intent i = getIntent();
        String name = i.getStringExtra("sel");
        tvName.setText(name);

        if (name.equals("Secular")){
            holiday.add(new Holidays("New Year's Day", "1 Jan 2017", true, "Secular"));
            holiday.add(new Holidays("Labour Day", "1 May 2017", false, "Secular"));
        } else {
            holiday.add(new Holidays("Chinese New Year", "28-29 Jan 2017", true, "Ethnic"));
            holiday.add(new Holidays("Good Friday", "14 April 2017", false, "Ethnic"));
        }



        aa = new HolidaysAdapter(this, R.layout.row, holiday);
        lv.setAdapter(aa);



        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Holidays selected = holiday.get(position);

                Toast.makeText(SecondActivity.this, selected.getName()
                                + " Date: " + selected.getDate(),
                        Toast.LENGTH_LONG).show();

            }
        });




    }
}


package sg.edu.rp.c346.p02_holidays;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    ArrayList sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvSel);

        final ArrayList<String> alSel = new ArrayList<>();
        alSel.add("Secular");
        alSel.add("Ethics & Religion");

        ArrayAdapter<String> aa;
        aa = new ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, alSel);
        lv.setAdapter(aa);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String sel = alSel.get(position);

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("sel", sel);
                startActivity(i);
            }
        });

    }
}

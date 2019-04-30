package sg.edu.rp.c346.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidaysAdapter extends ArrayAdapter<Holidays> {

        private ArrayList<Holidays> holidays;
        private Context context;
        private TextView tvName;
        private ImageView ivLogo;
        private TextView tvDate;

        public HolidaysAdapter(Context context, int resource, ArrayList<Holidays> objects){
            super(context, resource, objects);
            holidays = objects;
            this.context = context;
        }


        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater inflater = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View rowView = inflater.inflate(R.layout.row, parent, false);


            tvName = rowView.findViewById(R.id.textView2);
            tvDate = rowView.findViewById(R.id.textView3);
            ivLogo = rowView.findViewById(R.id.imageView);

            Holidays currentFood = holidays.get(position);

            tvName.setText(currentFood.getName());
            tvDate.setText(currentFood.getDate());
            if(currentFood.isImage()) {
                ivLogo.setImageResource(R.drawable.cny);
            }
            else {
                ivLogo.setImageResource(R.drawable.christmas);
            }
            return rowView;
        }
}

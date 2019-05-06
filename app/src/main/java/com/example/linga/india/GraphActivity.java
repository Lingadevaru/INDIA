package com.example.linga.india;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.Date;

public class GraphActivity extends AppCompatActivity {

    BarChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_activity);

        chart = findViewById(R.id.bar_chart);

        ArrayList<BarEntry> BarEntry = new ArrayList<>();

        BarEntry.add(new BarEntry(19.9f, 0));
        BarEntry.add(new BarEntry(11.2f, 1));
        BarEntry.add(new BarEntry(10.4f, 2));
        BarEntry.add(new BarEntry(9.1f, 3));
        BarEntry.add(new BarEntry(7.26f, 4));
        BarEntry.add(new BarEntry(7.21f, 5));

        BarDataSet dataSets = new BarDataSet(BarEntry, "Population in Crores");

        ArrayList<String> months = new ArrayList<>();
        months.add("U.P");
        months.add("Maha");
        months.add("Bihar");
        months.add("W.Bengal");
        months.add("M.P");
        months.add("T.Nadu");

        BarData data = new BarData(months, dataSets);
        chart.setData(data);

    }
}

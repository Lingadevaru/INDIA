package com.example.linga.india;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class TableActivity extends AppCompatActivity {

    //ArrayList<String> numberlist = new ArrayList<>();

    private TextView tvData;
    //BarChart chart;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table_activity);

         //chart = findViewById(R.id.bar_chart);

         tvData = (TextView) findViewById(R.id.tvdata);

        new JSONTask().execute("https://api.myjson.com/bins/h2w2o");
       // get_json();
    }

    public class JSONTask extends AsyncTask<String, String, String>{

        @Override
        protected String doInBackground(String... params) {
            HttpURLConnection connection = null;
            BufferedReader reader  = null;

            try{
                URL url = new URL(params[0]);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                InputStream stream = connection.getInputStream();

                reader = new BufferedReader(new InputStreamReader(stream));

                StringBuffer buffer = new StringBuffer();

                String line = " ";
                while((line = reader.readLine())!= null){
                    buffer.append(line);
            }

            String finalJson = buffer.toString();

            JSONArray parentArray = new JSONArray(finalJson);

            StringBuffer finalBufferedData = new StringBuffer();

           // ArrayList<BarEntry> yVals = new ArrayList<>();

            //ArrayList<String> months = new ArrayList<>();

                for (int i=0; i < parentArray.length();i++) {
            JSONObject finalObject = parentArray.getJSONObject(i);
            String stateName = finalObject.getString("State");
            int population = finalObject.getInt("Population");
            finalBufferedData.append(stateName + " - " + population + "\n");
            //yVals.add(new BarEntry(i, (int)population));
            //months.add(stateName);
        }

              //  BarDataSet set = new BarDataSet(yVals, "Data Set");
                //BarData data = new BarData(months, set);
                //chart.setData(data);

        return finalBufferedData.toString();

        }catch (MalformedURLException e){
                e.printStackTrace();
            }catch (IOException e){
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            } finally {
                if(connection!=null){
                    connection.disconnect();
                }
                try{
                    if(reader!=null){
                        reader.close();
                    }
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
           return null;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            tvData.setText(s);
        }
    }
//    public void get_json(){
//        String json;
//        try{
//            InputStream is  = getAssets().open("indianStates.json");
//            int size = is.available();
//            byte[] buffer = new byte[size];
//            is.read(buffer);
//            is.close();
//
//            json = new String(buffer, "UTF-8");
//            JSONArray jsonArray = new JSONArray(json);
//
//            //Log.d("myTag", String.valueOf(jsonArray.length()));
//            //System.out.println(jsonArray.length());
//
//            //for(int i=0; i<jsonArray.length(); i++){
//              //  JSONObject obj = jsonArray.getJSONObject(i);
//                //if(obj.getString("State").equals("Bihar")){
//                  //  numberlist.add(obj.getString("Population"));
//                //}
//            //}
//            //for(int i=0; i<jsonArray.length(); i++) {
//              //  Toast.makeText(getApplicationContext(), numberlist.get(i).toString(), Toast.LENGTH_LONG).show();
//            //}
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }catch (JSONException e){
//            e.printStackTrace();
//        }
// }


}

package com.narij.rettest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView txt1 = (TextView) findViewById(R.id.txt1);
        Button btn1 = (Button) findViewById(R.id.btn1);

        final APIInterface apiInterface = APIClient.getClient().create(APIInterface.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Call<RetrofitModel> call = apiInterface.getHumen();

                call.enqueue(new Callback<RetrofitModel>() {
                    @Override
                    public void onResponse(Call<RetrofitModel> call, Response<RetrofitModel> response) {

                        try {
                            ArrayList<Human> humen = response.body().humen;
                            StringBuffer sb = new StringBuffer();
                            for (Human h : humen) {
                                sb.append(h.getHuman_Id() + " " + h.getName() + " " + h.getFamily() + "\n");
                            }
                            txt1.setText(sb.toString());
                        } catch (Exception e) {
                            Log.d(Globals.LOG_TAG, e.getMessage());
                        }


                    }

                    @Override
                    public void onFailure(Call<RetrofitModel> call, Throwable t) {

                        Log.d(Globals.LOG_TAG, t.getMessage());


                    }
                });


            }
        });


    }
}

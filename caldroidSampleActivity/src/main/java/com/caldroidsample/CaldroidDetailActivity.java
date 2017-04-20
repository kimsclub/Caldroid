package com.caldroidsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by chosh on 2017-04-13.
 */

public class CaldroidDetailActivity extends AppCompatActivity {
    private static final int REQUEST_CODE = 100;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        Button dateButton = (Button) findViewById(R.id.date_btn);
        Button listGoButton = (Button) findViewById(R.id.list_go_btn);

        dateButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

            }
        });

        listGoButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//                Intent i = new Intent(CaldroidDetailActivity.this, CaldroidSampleActivity.class);
//                i.putExtra("key","문자열을 입력하세요");
//
//                startActivityForResult(i, REQUEST_CODE);
                finish();
            }
        });

        Intent intent = getIntent();
//        String selectedDate = intent.getStringExtra("selectedDate");
        String selectedDate = intent.getExtras().getString("selectedDate");
        String choosedate = intent.getExtras().getString("choosedate");

        Log.d("selectedDate", "" + selectedDate);
        Log.d("choosedate", "" + choosedate);

        final TextView textTilte = (TextView) findViewById(R.id.choosedate1);
        textTilte.setText(selectedDate);

    }
}

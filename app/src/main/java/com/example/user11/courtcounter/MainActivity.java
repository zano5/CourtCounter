package com.example.user11.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn3Points, btnFreeThrow, btn2Points;
    private TextView tvSocre;
    private int score = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn2Points = (Button) findViewById(R.id.btn2Points);
        btn3Points = (Button) findViewById(R.id.btn3Points);
        tvSocre = (TextView) findViewById(R.id.tvScore);

    }


    public void threeCount()
    {

        score+= 3;
        tvSocre.setText("" +score);

    }

    public void twoCount()
    {

        score+= 2;
        tvSocre.setText("" +score);

    }

    public void oneCount()
    {

        score+= 1;
        tvSocre.setText("" +score);

    }


    public void onClick(View view)
    {

        int id = view.getId();



        switch (id)
        {
            case R.id.btn2Points:
               twoCount();
                break;
            case R.id.btn3Points:
                threeCount();
                break;

            default:

                oneCount();
        }
    }
}

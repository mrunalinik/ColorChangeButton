package com.example.b19_activity2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button changeColorButton;
    private RelativeLayout mainContainer;
    private TextView statusTv;
    private boolean isBlue = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Loading the UI
        setContentView(R.layout.activity_main);

        changeColorButton = (Button) findViewById(R.id.changeColorBtn);
        mainContainer = (RelativeLayout) findViewById(R.id.mainContainer);
        statusTv = (TextView) findViewById(R.id.statusTv);

        changeColorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeColorButton.setBackgroundColor(Color.YELLOW);

                if(isBlue){
                    mainContainer.setBackgroundColor(Color.RED);
                    isBlue = false;
                    statusTv.setText("It is RED");
                }
                else{
                    mainContainer.setBackgroundColor(Color.BLUE);
                    isBlue = true;
                    statusTv.setText("It is BLUE");
                }

            }
        });

    }

   /* View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };*/
}

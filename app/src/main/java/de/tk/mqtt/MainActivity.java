package de.tk.mqtt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView result = (TextView) findViewById(R.id.result);
        Button btnOn = (Button) findViewById(R.id.btnOn);
        Button btnOff = (Button) findViewById(R.id.btnOff);
        Button btnDown = (Button) findViewById(R.id.btnDown);
        Button btnUp = (Button) findViewById(R.id.btnUp);
        Button btnRed = (Button) findViewById(R.id.btnRed);
        Button btnGreen = (Button) findViewById(R.id.btnGreen);
        Button btnBlue = (Button) findViewById(R.id.btnBlue);
        Button btnWhite = (Button) findViewById(R.id.btnWhite);

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("ON"));
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("OFF"));
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("DOWN"));
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("UP"));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("R0"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("G0"));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("B0"));
            }
        });

        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(PubSync.doTest("W"));
            }
        });
    }
}

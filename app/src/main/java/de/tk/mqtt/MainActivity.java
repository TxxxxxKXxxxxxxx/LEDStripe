package de.tk.mqtt;

import android.support.design.widget.FloatingActionButton;
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
        FloatingActionButton btnOn = (FloatingActionButton) findViewById(R.id.btnOn);
        FloatingActionButton btnOff = (FloatingActionButton) findViewById(R.id.btnOff);
        FloatingActionButton btnDown = (FloatingActionButton) findViewById(R.id.btnDown);
        FloatingActionButton btnUp = (FloatingActionButton) findViewById(R.id.btnUp);
        FloatingActionButton btnRed = (FloatingActionButton) findViewById(R.id.btnRed);
        FloatingActionButton btnGreen = (FloatingActionButton) findViewById(R.id.btnGreen);
        FloatingActionButton btnBlue = (FloatingActionButton) findViewById(R.id.btnBlue);
        FloatingActionButton btnWhite = (FloatingActionButton) findViewById(R.id.btnWhite);

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

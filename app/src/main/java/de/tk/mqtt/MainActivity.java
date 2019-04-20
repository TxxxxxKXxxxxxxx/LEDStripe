package de.tk.mqtt;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(R.style.AppTheme);

        final TextView result = (TextView) findViewById(R.id.result);
        FloatingActionButton btnOn = (FloatingActionButton) findViewById(R.id.btnOn);
        FloatingActionButton btnOff = (FloatingActionButton) findViewById(R.id.btnOff);
        FloatingActionButton btnDown = (FloatingActionButton) findViewById(R.id.btnDown);
        FloatingActionButton btnUp = (FloatingActionButton) findViewById(R.id.btnUp);
        FloatingActionButton btnRed = (FloatingActionButton) findViewById(R.id.btnRed);
        FloatingActionButton btnGreen = (FloatingActionButton) findViewById(R.id.btnGreen);
        FloatingActionButton btnBlue = (FloatingActionButton) findViewById(R.id.btnBlue);
        FloatingActionButton btnWhite = (FloatingActionButton) findViewById(R.id.btnWhite);
        ImageButton btnSettings = (ImageButton) findViewById(R.id.btnSettings);

        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Bitte geben Sie die IP-Adresse des Raspberry Pis an.");

                final EditText input = new EditText(MainActivity.this);
                input.setHint("IP-Adresse");
                input.setText(getPreferences(MODE_PRIVATE).getString("IPAdress", ""));
                builder.setView(input);

                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                         getPreferences(MODE_PRIVATE).edit().putString("IPAdress", input.getText().toString()).commit();
                    }
                });
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                builder.show();
                Toast.makeText(MainActivity.this, "start Dialog", Toast.LENGTH_SHORT).show();
            }
        });

        btnOn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("ON") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("OFF") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("DOWN") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("UP") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("R0") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("G0") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("B0") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });

        btnWhite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (PubSync.doTest("W") == false)
                    result.setTextColor(getColor(android.R.color.holo_red_light));
                else
                    result.setTextColor(getColor(android.R.color.holo_green_light));
            }
        });
    }
}

package com.example.adriannakoszowska.android2;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    PaintView paintView;
    Context ctx;
    RadioGroup radioGroup;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        paintView = (PaintView) findViewById(R.id.view);
        ctx = getApplicationContext();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.menu_kolor:

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
                alertDialogBuilder.setTitle("Wybor koloru");
                final CharSequence[] items = { "Czerwony", "Zielony", "Niebieski" };

                alertDialogBuilder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        switch (item) {
                            case 0:
                                paintView.setColor(Color.RED);
                                break;
                            case 1:
                                paintView.setColor(Color.GREEN);
                                break;
                            case 2:
                                paintView.setColor(Color.BLUE);
                                break;
                        }
                    }
                });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                break;

        }

        return true;
    }
}

package com.example.concertticket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double costpertickets= 79.99;
    int numberoftickets;
    double totalcost;
    String groupchoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText tickets = (EditText) findViewById(R.id.txtTickets);
        final Spinner group = (Spinner) findViewById(R.id.Txtgroup);
        Button cost = (Button) findViewById(R.id.btnCost);
        cost.setOnClickListener(new View.OnClickListener() {
            final TextView result = ((TextView)findViewById(R.id.txtResult));
            @Override
            public void onClick(View v) {
            numberoftickets = Integer.parseInt(tickets.getText ().toString());
            totalcost = costpertickets * numberoftickets;
            DecimalFormat currency = new DecimalFormat("$###,###.##");
            groupchoice = group.getSelectedItem().toString();
            String unformattedTotalCost = String.valueOf(totalcost);
            result.setText("Cost for "+groupchoice+"is"+String.valueOf(totalcost));
            }
        });
    }
}
package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button jaksha, prosent, kobeitu, bolu, alu, kosu, equal;
    TextView number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        jaksha = findViewById(R.id.skobka);
        prosent = findViewById(R.id.persent);
        kobeitu = findViewById(R.id.multiply);
        bolu = findViewById(R.id.devide);
        alu = findViewById(R.id.minus);
        kosu = findViewById(R.id.plus);

        equal = findViewById(R.id.equal);

        number = findViewById(R.id.number);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("9");
            }
        });

        jaksha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("()");
            }
        });
        prosent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("%");
            }
        });
        kobeitu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("(*)");
            }
        });
        bolu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("/");
            }
        });
        alu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("-");
            }
        });
        kosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("+");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                number.setText("=");
            }
        });
    }
}
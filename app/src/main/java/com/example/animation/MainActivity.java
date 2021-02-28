package com.example.animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button zero, one, two, three, four, five, six, seven, eight, nine;
    Button jaksha, prosent, kobeitu, bolu, alu, kosu, equal;
    Button delete_all, PlusMinus;
    TextView number, zapis;

    String birinshiSan, ekinshiSan, znak, zapisText;
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

        jaksha = findViewById(R.id.jaksha);
        prosent = findViewById(R.id.prosent);
        kobeitu = findViewById(R.id.kobeitu);
        bolu = findViewById(R.id.bolu);
        alu = findViewById(R.id.alu);
        kosu = findViewById(R.id.kosu);

        PlusMinus = findViewById(R.id.PlusMinus);
        delete_all = findViewById(R.id.delete_all);

        equal = findViewById(R.id.equal);

        number = findViewById(R.id.number);
        zapis = findViewById(R.id.zapis);

        sandarMethods();
        DeletePlusMinusMethod();
        functionsMethod();

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
        kosu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        alu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
    public void sandarMethods(){
        View.OnClickListener btnSandar = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String aldyngySan = number.getText().toString();
                String basylganSan = "";
                String songyResult = "";


                switch (view.getId()){
                    case R.id.zero:
                        basylganSan = "0";
                        break;
                    case R.id.one:
                        basylganSan = "1";
                        break;
                    case R.id.two:
                        basylganSan = "2";
                        break;
                    case R.id.three:
                        basylganSan = "3";
                        break;

                    case R.id.four:
                        basylganSan = "4";
                        break;

                    case R.id.five:
                        basylganSan = "5";
                        break;

                    case R.id.six:
                        basylganSan = "6";
                        break;

                    case R.id.seven:
                        basylganSan = "7";
                        break;

                    case R.id.eight:
                        basylganSan = "8";
                        break;

                    case R.id.nine:
                        basylganSan = "9";
                        break;
                }
                if(!aldyngySan.equals("0")) songyResult = aldyngySan + basylganSan;
                else songyResult = basylganSan;
                number.setText(songyResult);
            }
        };

        zero.setOnClickListener(btnSandar);
        one .setOnClickListener(btnSandar);
        two .setOnClickListener(btnSandar);
        three.setOnClickListener(btnSandar);
        four.setOnClickListener(btnSandar);
        five.setOnClickListener(btnSandar);
        six .setOnClickListener(btnSandar);
        seven.setOnClickListener(btnSandar);
        eight.setOnClickListener(btnSandar);
        nine.setOnClickListener(btnSandar);

    }
    public void DeletePlusMinusMethod(){
        View.OnClickListener btnDeletePlusMinus = new View.OnClickListener() {
            @Override
            public void onClick(View view){
                switch (view.getId()){
                    case R.id.delete_all:
                        number.setText("0");
                        break;
                    case R.id.PlusMinus:

                        String sanText = number.getText().toString();
                        int san = Integer.parseInt(sanText);

                        if (san > 0)number.setText("-"+sanText);
                        else {
                            san = san *(-1);
                            number.setText(""+san);
                        }

                        break;
                }
            }
        };
        PlusMinus.setOnClickListener(btnDeletePlusMinus);
        delete_all.setOnClickListener(btnDeletePlusMinus);
    }
    public void functionsMethod(){
        View.OnClickListener btnFunctions = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                birinshiSan = number.getText().toString();

                switch(view.getId()){
                    case R.id.kosu:

                        znak = "+";
                        break;

                    case R.id.alu:

                        znak = "-";
                        break;

                    case R.id.kobeitu:

                        znak = "-";
                        break;

                    case R.id.bolu:

                        znak = "-";
                        break;
                }

                zapisText = birinshiSan + znak;
                zapis.setText(zapisText);
                number.setText("0");

            }
        };

        alu.setOnClickListener(btnFunctions);
        kosu.setOnClickListener(btnFunctions);
        kobeitu.setOnClickListener(btnFunctions);
        bolu.setOnClickListener(btnFunctions);

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ekinshiSan = number.getText().toString();
                int san1 = Integer.parseInt(birinshiSan);
                int san2 = Integer.parseInt(ekinshiSan);
                int res = 0;

                if(znak.equals("+")){
                    res = san1 + san2;
                }else if(znak.equals("-")){
                    res = san1 - san2;
                }else if(znak.equals("*")){
                    res = san1 * san2;
                }else if(znak.equals("/")){
                    res = san1 / san2;
                }

                zapisText = birinshiSan + znak + ekinshiSan +"="+res;

                zapis.setText(zapisText);
                number.setText(""+res);
            }

        });
    }
}
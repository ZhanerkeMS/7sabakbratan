package com.example.animation;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView phone, socialmedia;
    RadioButton  with_email, with_number;
    CheckBox computer, laptop, tablet, smartphone;
    Button create_acc;

    String sign, devices;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone = findViewById(R.id.phone);
        socialmedia = findViewById(R.id.socialmedia);

        with_email = findViewById(R.id.with_email);
        with_number = findViewById(R.id.whith_number);

        computer = findViewById(R.id.computer);
        laptop = findViewById(R.id.laptop);
        tablet = findViewById(R.id.tablet);
        smartphone = findViewById(R.id.smartphone);

        create_acc = findViewById(R.id.create_acc);

        registerForContextMenu(socialmedia);
        registerForContextMenu(phone);

        create_acc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(with_email.isChecked()){
                    sign = "sign in with e-mail";
                }else if(with_number.isChecked()){
                    sign = "sign in with app";
                }

                if(computer.isChecked()){
                    devices = "computer user";
                }

                if(laptop.isChecked()){
                    devices = "laptop user";
                }

                if(tablet.isChecked()){
                    devices = "tablet user";
                }

                if(smartphone.isChecked()){
                    devices = "smartphone user";
                }

                String result = "User: "+phone.getText()+"\n"+
                        "User: "+socialmedia.getText()+"\n"+
                        "Sign in:"+sign+"\n"+
                        "Create Account:"+create_acc;
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        if (v == phone) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.android_menu, menu);
        }
        if (v == socialmedia) {
            MenuInflater menuInflater = getMenuInflater();
            menuInflater.inflate(R.menu.toke_menu, menu);
        }

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.android:
                phone.setText("Android");
                break;
            case R.id.ios:
                phone.setText("IOs");
                break;
            case R.id.lg:
                phone.setText("Lg");
                break;
            case R.id.xiaomi:
                phone.setText("Xiaomi");
                break;

            case R.id.facebook:
                socialmedia.setText("Facebook");
                break;
            case R.id.instagram:
                socialmedia.setText("Instagram");
                break;
            case R.id.twitter:
                socialmedia.setText("Twitter");
                break;
            case R.id.telegram:
                socialmedia.setText("Telegram");
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_settings:
                Toast.makeText(this, "setings menu", Toast.LENGTH_SHORT).show();
                break;

            case R.id.menu_exit:
                Toast.makeText(this, "exit menu", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
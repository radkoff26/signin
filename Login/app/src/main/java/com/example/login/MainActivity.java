package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText login;
    EditText password;
    TextView output;

    private final String log = "qwerty";
    private final String pass = "1234554321";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);
        login = (EditText) findViewById(R.id.login);
        password = (EditText) findViewById(R.id.password);
        output = (TextView) findViewById(R.id.tv_out);

        Listener listener = new Listener();
        btn.setOnClickListener(listener);

    }

    public class Listener implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            String log_ = login.getText().toString();
            String pass_ = password.getText().toString();
            if (log_.equals(log) && pass_.equals(pass)) {
                output.setText("ВЕРНО!");
                output.setTextColor(Color.GREEN);
            } else {
                output.setText("Вы ошиблись в логине или пароле!");
                output.setTextColor(Color.RED);
            }
            password.setText("");
            login.setText("");
        }
    }
}

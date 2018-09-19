package com.example.david.relativelayoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView edtEmail;
    private TextView edtPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buildUI();

    }

    private void buildUI() {
        edtEmail = (EditText)findViewById(R.id.edtEmail);
        edtPass  = (EditText)findViewById(R.id.edtPassword);
    }

    public void onClick(View view) {
    }
}

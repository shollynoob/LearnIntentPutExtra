package com.visionstech.maidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.name)EditText mname;
    @Bind(R.id.address)EditText maddress;
    @Bind(R.id.phonenum) EditText mphonenum;
    @Bind(R.id.but) Button button;
    @Bind(R.id.gender) RadioGroup mradiogroup;
    public static final String TAG = MainActivity.class.getSimpleName();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass = new Intent(MainActivity.this, CatchResult.class);
                pass.putExtra("name", mname.getText().toString());
                pass.putExtra("address", maddress.getText().toString());
                pass.putExtra("phonenum", mphonenum.getText().toString());

                int id = mradiogroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(id);
                pass.putExtra("gender", radioButton.getText().toString());
                startActivity(pass);

            }
        });
    }
}

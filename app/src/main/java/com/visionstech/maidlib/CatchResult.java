package com.visionstech.maidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class CatchResult extends AppCompatActivity {
    private String name, address, phonenum, radiogroup;
    @Bind(R.id.catchname)TextView catchname;
    @Bind(R.id.catchaddress) TextView catchaddress;
    @Bind(R.id.catchphonenum) TextView catchphonenum;
    @Bind(R.id.radiogroup) TextView mradiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catch_result);

        ButterKnife.bind(this);

        Intent recall = getIntent();
        name = recall.getStringExtra("name");
        address = recall.getStringExtra("address");
        phonenum = recall.getStringExtra("phonenum");
        radiogroup = recall.getStringExtra("gender");

        catchname.setText(name);
        catchaddress.setText(address);
        catchphonenum.setText(phonenum);
        mradiogroup.setText(radiogroup);
    }
}

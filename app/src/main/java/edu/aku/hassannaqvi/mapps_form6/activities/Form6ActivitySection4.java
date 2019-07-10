package edu.aku.hassannaqvi.mapps_form6.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mappsform4.R;

public class Form6ActivitySection4 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {


    @BindView(R.id.mp0601)
    RadioGroup mp0601;
    @BindView(R.id.mp060101)
    RadioButton mp060101;
    @BindView(R.id.mp060102)
    RadioButton mp060102;




    @BindView(R.id.mp0602)
    RadioGroup mp0602;
    @BindView(R.id.mp060201)
    RadioButton mp060201;
    @BindView(R.id.mp060202)
    RadioButton mp060202;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6_section4);
        ButterKnife.bind(this);

       mp060101.setOnCheckedChangeListener( this);
       mp060102.setOnCheckedChangeListener( this);

    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

        if(compoundButton.getId()==R.id.mp060101)
        {
            show_alert();
        }
        if(compoundButton.getId()==R.id.mp060201)
        {
            show_alert();

        }
    }

    public  void show_alert()
    {
        final AlertDialog b = new AlertDialog.Builder(this).create();
        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.alertdialogue, null);
        b.setView(v);
        b.show();
        b.setCancelable(false);



    }
}

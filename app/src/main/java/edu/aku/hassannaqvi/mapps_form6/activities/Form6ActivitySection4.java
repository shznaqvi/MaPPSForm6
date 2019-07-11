package edu.aku.hassannaqvi.mapps_form6.activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.HashMap;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form6.getclasses.mp060;
import edu.aku.hassannaqvi.mappsform4.R;

public class Form6ActivitySection4 extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {


    HashMap<String, mp060> HMmp060=new HashMap<>();


    //region  CNTRL initilizatoin
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

    @BindView(R.id.mp0603)
    RadioGroup mp0603;
    @BindView(R.id.mp060301)
    RadioButton mp060301;
    @BindView(R.id.mp060302)
    RadioButton mp060302;

    @BindView(R.id.mp0604)
    RadioGroup mp0604;
    @BindView(R.id.mp060401)
    RadioButton mp060401;
    @BindView(R.id.mp060402)
    RadioButton mp060402;

    @BindView(R.id.mp0605)
    RadioGroup mp0605;
    @BindView(R.id.mp060501)
    RadioButton mp060501;
    @BindView(R.id.mp060502)
    RadioButton mp060502;

    @BindView(R.id.mp0606)
    RadioGroup mp0606;
    @BindView(R.id.mp060601)
    RadioButton mp060601;
    @BindView(R.id.mp060602)
    RadioButton mp060602;

    @BindView(R.id.mp0607)
    RadioGroup mp0607;
    @BindView(R.id.mp060701)
    RadioButton mp060701;
    @BindView(R.id.mp060702)
    RadioButton mp060702;

    @BindView(R.id.mp0608)
    RadioGroup mp0608;
    @BindView(R.id.mp060801)
    RadioButton mp060801;
    @BindView(R.id.mp060802)
    RadioButton mp060802;

    @BindView(R.id.mp0609)
    RadioGroup mp0609;
    @BindView(R.id.mp060901)
    RadioButton mp060901;
    @BindView(R.id.mp060902)
    RadioButton mp060902;

    @BindView(R.id.mp0610)
    RadioGroup mp0610;
    @BindView(R.id.mp061001)
    RadioButton mp061001;
    @BindView(R.id.mp061002)
    RadioButton mp061002;

    @BindView(R.id.mp0611)
    RadioGroup mp0611;
    @BindView(R.id.mp061101)
    RadioButton mp061101;
    @BindView(R.id.mp061102)
    RadioButton mp061102;

    @BindView(R.id.mp0612)
    RadioGroup mp0612;
    @BindView(R.id.mp061201)
    RadioButton mp061201;
    @BindView(R.id.mp061202)
    RadioButton mp061202;

    @BindView(R.id.mp0613)
    RadioGroup mp0613;
    @BindView(R.id.mp061301)
    RadioButton mp061301;
    @BindView(R.id.mp061302)
    RadioButton mp061302;

    @BindView(R.id.mp0614)
    RadioGroup mp0614;
    @BindView(R.id.mp061401)
    RadioButton mp061401;
    @BindView(R.id.mp061402)
    RadioButton mp061402;

    @BindView(R.id.mp0615)
    RadioGroup mp0615;
    @BindView(R.id.mp061501)
    RadioButton mp061501;
    @BindView(R.id.mp061502)
    RadioButton mp061502;

    @BindView(R.id.mp0616)
    RadioGroup mp0616;
    @BindView(R.id.mp061601)
    RadioButton mp061601;
    @BindView(R.id.mp061602)
    RadioButton mp061602;

    @BindView(R.id.mp0617)
    RadioGroup mp0617;
    @BindView(R.id.mp061701)
    RadioButton mp061701;
    @BindView(R.id.mp061702)
    RadioButton mp061702;

    @BindView(R.id.mp0618)
    RadioGroup mp0618;
    @BindView(R.id.mp061801)
    RadioButton mp061801;
    @BindView(R.id.mp061802)
    RadioButton mp061802;

    @BindView(R.id.mp0619)
    RadioGroup mp0619;
    @BindView(R.id.mp061901)
    RadioButton mp061901;
    @BindView(R.id.mp061902)
    RadioButton mp061902;

    @BindView(R.id.mp0620)
    RadioGroup mp0620;
    @BindView(R.id.mp062001)
    RadioButton mp062001;
    @BindView(R.id.mp062002)
    RadioButton mp062002;

    @BindView(R.id.mp0621)
    RadioGroup mp0621;
    @BindView(R.id.mp062101)
    RadioButton mp062101;
    @BindView(R.id.mp062102)
    RadioButton mp062102;

    @BindView(R.id.mp0622)
    RadioGroup mp0622;
    @BindView(R.id.mp062201)
    RadioButton mp062201;
    @BindView(R.id.mp062202)
    RadioButton mp062202;

    @BindView(R.id.mp0623)
    RadioGroup mp0623;
    @BindView(R.id.mp062301)
    RadioButton mp062301;
    @BindView(R.id.mp062302)
    RadioButton mp062302;

    @BindView(R.id.mp0624)
    RadioGroup mp0624;
    @BindView(R.id.mp062401)
    RadioButton mp062401;
    @BindView(R.id.mp062402)
    RadioButton mp062402;

    @BindView(R.id.mp0625)
    RadioGroup mp0625;
    @BindView(R.id.mp062501)
    RadioButton mp062501;
    @BindView(R.id.mp062502)
    RadioButton mp062502;

    @BindView(R.id.mp0626)
    RadioGroup mp0626;
    @BindView(R.id.mp062601)
    RadioButton mp062601;
    @BindView(R.id.mp062602)
    RadioButton mp062602;

    @BindView(R.id.mp0627)
    RadioGroup mp0627;
    @BindView(R.id.mp062701)
    RadioButton mp062701;
    @BindView(R.id.mp062702)
    RadioButton mp062702;

    @BindView(R.id.mp0628)
    RadioGroup mp0628;
    @BindView(R.id.mp062801)
    RadioButton mp062801;
    @BindView(R.id.mp062802)
    RadioButton mp062802;

    @BindView(R.id.mp0629)
    RadioGroup mp0629;
    @BindView(R.id.mp062901)
    RadioButton mp062901;
    @BindView(R.id.mp062902)
    RadioButton mp062902;

    @BindView(R.id.mp0630)
    RadioGroup mp0630;
    @BindView(R.id.mp063001)
    RadioButton mp063001;
    @BindView(R.id.mp063002)
    RadioButton mp063002;

    @BindView(R.id.mp0631)
    RadioGroup mp0631;
    @BindView(R.id.mp063101)
    RadioButton mp063101;
    @BindView(R.id.mp063102)
    RadioButton mp063102;

    @BindView(R.id.mp0632)
    RadioGroup mp0632;
    @BindView(R.id.mp063201)
    RadioButton mp063201;
    @BindView(R.id.mp063202)
    RadioButton mp063202;



    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    @BindView(R.id.btn_End)
    Button btn_End;

    @BindView(R.id.lvmain)
    LinearLayout lvmain;

//endregion




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6_section4);
        ButterKnife.bind(this);

     //region RB click evernts

       mp060101.setOnCheckedChangeListener( this);
       mp060102.setOnCheckedChangeListener( this);

        mp060201.setOnCheckedChangeListener( this);
        mp060202.setOnCheckedChangeListener( this);

        mp060301.setOnCheckedChangeListener( this);
        mp060302.setOnCheckedChangeListener( this);

        mp060401.setOnCheckedChangeListener( this);
        mp060402.setOnCheckedChangeListener( this);

        mp060501.setOnCheckedChangeListener( this);
        mp060502.setOnCheckedChangeListener( this);

        mp060601.setOnCheckedChangeListener( this);
        mp060602.setOnCheckedChangeListener( this);

        mp060701.setOnCheckedChangeListener( this);
        mp060702.setOnCheckedChangeListener( this);


        mp060801.setOnCheckedChangeListener( this);
        mp060802.setOnCheckedChangeListener( this);

        mp060901.setOnCheckedChangeListener( this);
        mp060902.setOnCheckedChangeListener( this);

        mp061001.setOnCheckedChangeListener( this);
        mp061002.setOnCheckedChangeListener( this);

        mp061101.setOnCheckedChangeListener( this);
        mp061102.setOnCheckedChangeListener( this);

        mp061201.setOnCheckedChangeListener( this);
        mp061202.setOnCheckedChangeListener( this);

        mp061301.setOnCheckedChangeListener( this);
        mp061302.setOnCheckedChangeListener( this);

        mp061401.setOnCheckedChangeListener( this);
        mp061402.setOnCheckedChangeListener( this);

        mp061501.setOnCheckedChangeListener( this);
        mp061502.setOnCheckedChangeListener( this);

        mp061601.setOnCheckedChangeListener( this);
        mp061602.setOnCheckedChangeListener( this);

        mp061701.setOnCheckedChangeListener( this);
        mp061702.setOnCheckedChangeListener( this);

        mp061801.setOnCheckedChangeListener( this);
        mp061802.setOnCheckedChangeListener( this);

        mp061901.setOnCheckedChangeListener( this);
        mp061902.setOnCheckedChangeListener( this);

        mp062001.setOnCheckedChangeListener( this);
        mp062002.setOnCheckedChangeListener( this);

        mp062101.setOnCheckedChangeListener( this);
        mp062102.setOnCheckedChangeListener( this);

        mp062201.setOnCheckedChangeListener( this);
        mp062202.setOnCheckedChangeListener( this);

        mp062301.setOnCheckedChangeListener( this);
        mp062302.setOnCheckedChangeListener( this);

        mp062401.setOnCheckedChangeListener( this);
        mp062402.setOnCheckedChangeListener( this);

        mp062501.setOnCheckedChangeListener( this);
        mp062502.setOnCheckedChangeListener( this);


        mp062601.setOnCheckedChangeListener( this);
        mp062602.setOnCheckedChangeListener( this);


        mp062701.setOnCheckedChangeListener( this);
        mp062702.setOnCheckedChangeListener( this);


        mp062801.setOnCheckedChangeListener( this);
        mp062802.setOnCheckedChangeListener( this);

        mp062901.setOnCheckedChangeListener( this);
        mp062902.setOnCheckedChangeListener( this);

        mp063001.setOnCheckedChangeListener( this);
        mp063002.setOnCheckedChangeListener( this);

        mp063101.setOnCheckedChangeListener( this);
        mp063102.setOnCheckedChangeListener( this);

        mp063201.setOnCheckedChangeListener( this);
        mp063202.setOnCheckedChangeListener( this);


//endregion


    }


    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {



        String id=compoundButton.getResources().getResourceName(compoundButton.getId());
        String lst6 = id.substring(Math.max(id.length() - 8, 0));
        String lst2 = id.substring(Math.max(id.length() - 2, 0));

        if(lst2.equals("01")&&b==true)
        {
            show_alert(lst6);
        }
        else
        {
            if(HMmp060.containsKey(lst6))
                HMmp060.remove(lst6);

        }

     //   Log.d("", "onCheckedChanged: "+id);


        btn_Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!checvalidation(lvmain)) {
                    Log.d("taq",HMmp060+"");
                }
            }

        });



    }



    public  void show_alert(final String vname)
    {
        final AlertDialog b = new AlertDialog.Builder(this).create();
        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.alertdialogue, null);
        b.setView(v);
        b.show();
        b.setCancelable(false);


     final    CheckBox mp06h2a,mp06h2b,mp06h2c;
     final    RadioButton
                mp06h301,
                mp06h302,
                mp06h401,
                mp06h402,
                mp06h403,
                mp06h404,
                mp06h405,
                mp06h406,
                mp06h407;
        final EditText mp06h407x,
                 mp06h5;

        Button btn_End,btn_Continue;

        mp06h2a=v.findViewById(R.id.mp06h2a);
        mp06h2b=v.findViewById(R.id.mp06h2b);
        mp06h2c=v.findViewById(R.id.mp06h2c);

                mp06h301=v.findViewById(R.id.mp06h301);
                mp06h302=v.findViewById(R.id.mp06h302);
                mp06h401=v.findViewById(R.id.mp06h401);
                mp06h402=v.findViewById(R.id.mp06h402);
                mp06h403=v.findViewById(R.id.mp06h403);
                mp06h404=v.findViewById(R.id.mp06h404);
                mp06h405=v.findViewById(R.id.mp06h405);
                mp06h406=v.findViewById(R.id.mp06h406);
                mp06h407=v.findViewById(R.id.mp06h407);

        mp06h407x=v.findViewById(R.id.mp06h407x);
        mp06h5=v.findViewById(R.id.mp06h5);

        btn_End=v.findViewById(R.id.btn_End);
        btn_Continue=v.findViewById(R.id.btn_Continue);

    final   mp060 obj_mp060=new mp060();


        mp06h407.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked())
                {
                    mp06h407x.setVisibility(View.VISIBLE);
                }
                else
                {
                    mp06h407x.setVisibility(View.GONE);
                }
            }
        });




        btn_End.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           b.dismiss();
                                       }
                                       });



btn_Continue.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        // validation dialog

        if (!mp06h2a.isChecked() && !mp06h2b.isChecked() && !mp06h2c.isChecked()) {
            Toast.makeText(Form6ActivitySection4.this, "ERROR(empty): " + getString(R.string.mp06h2a), Toast.LENGTH_SHORT).show();
            mp06h2a.setError("This data is Required!");

            return;
        }
        else
        {
            if(mp06h2a.isChecked())
            {
                obj_mp060.mp06h2a="1";
            }
            else
            {
                obj_mp060.mp06h2a="0";
            }
            if(mp06h2b.isChecked())
            {
                obj_mp060.mp06h2b="1";
            }
            else
            {
                obj_mp060.mp06h2b="0";
            }
            if(mp06h2c.isChecked())
            {
                obj_mp060.mp06h2c="1";
            }
            else
            {
                obj_mp060.mp06h2c="0";
            }
        }

        if (!mp06h301.isChecked() && !mp06h302.isChecked() ) {
            Toast.makeText(Form6ActivitySection4.this, "ERROR(empty): " , Toast.LENGTH_SHORT).show();
            mp06h301.setError("This data is Required!");

            return;
        }
        else
        {
            if(mp06h301.isChecked())
            {
                obj_mp060.mp06h3="1";
            }
            if(mp06h302.isChecked())
            {
                obj_mp060.mp06h3="2";
            }
        }

        if (!mp06h401.isChecked() && !mp06h402.isChecked()
                && !mp06h403.isChecked()  && !mp06h404.isChecked()  && !mp06h405.isChecked()
                && !mp06h406.isChecked()  && !mp06h407.isChecked()
        ) {
            Toast.makeText(Form6ActivitySection4.this, "ERROR(empty): " , Toast.LENGTH_SHORT).show();
            mp06h401.setError("This data is Required!");

            return;
        }
        else
        {
            if(mp06h401.isChecked())
            {
                obj_mp060.mp06h4="1";
            }
            if(mp06h402.isChecked())
            {
                obj_mp060.mp06h4="2";
            }
            if(mp06h403.isChecked())
            {
                obj_mp060.mp06h4="3";
            }
            if(mp06h404.isChecked())
            {
                obj_mp060.mp06h4="4";
            }
            if(mp06h405.isChecked())
            {
                obj_mp060.mp06h4="5";
            }
            if(mp06h406.isChecked())
            {
                obj_mp060.mp06h4="6";
            }
            if(mp06h407.isChecked())
            {
                obj_mp060.mp06h4="7";

                if(mp06h407x.getText().toString().isEmpty())
                {
                    Toast.makeText(Form6ActivitySection4.this, "ERROR(empty): ", Toast.LENGTH_SHORT).show();
                    mp06h407x.setError("This data is Required!");
                    return;
                }
                else
                {
                    obj_mp060.mp06h407x=mp06h407x.getText().toString();
                }
            }

        }

        if (mp06h5.getText().toString().isEmpty() ) {
            Toast.makeText(Form6ActivitySection4.this, "ERROR(empty): " + getString(R.string.mp06h5), Toast.LENGTH_SHORT).show();
            mp06h5.setError("This data is Required!");

            return ;
        }
        else
        {
            obj_mp060.mp06h5=mp06h5.getText().toString();
        }


        HMmp060.put(vname,obj_mp060);
        b.dismiss();

    }
});


    }

    public static boolean checvalidation(LinearLayout lv) {

        /// Checkbox Celar*************************************

        try {

            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);

                if (view instanceof RadioGroup) {
                 int id=   ((RadioGroup) view).getCheckedRadioButtonId();
                 if(id==-1)
                 {
                     ((RadioGroup) view).requestFocus();

                     Toast.makeText(this,"Some filed are missing",Toast.LENGTH_LONG).show();
                     return false;
                 }
                }



            }
            return true;
        }
        catch (Exception e) {

        }




    }
}

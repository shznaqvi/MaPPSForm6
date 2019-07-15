package edu.aku.hassannaqvi.mapps_form6.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mappsform4.R;

public class Form6ActivitySection4a extends AppCompatActivity  implements RadioButton.OnCheckedChangeListener {




    //region  CNTRL initilizatoin
    @BindView(R.id.mp0601)
    RadioGroup mp0601;
    @BindView(R.id.mp060101)
    RadioButton mp060101;
    @BindView(R.id.mp060102)
    RadioButton mp060102;

  //  @BindView(R.id.lvmp060102)
   // LinearLayout mp060102;




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


    //endregion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6_section4a);
        ButterKnife.bind(this);




    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

    }
}

package edu.aku.hassannaqvi.mapps_form6.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
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

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form6.R;
import edu.aku.hassannaqvi.mapps_form6.other.mp060;
import edu.aku.hassannaqvi.mapps_form6.validation.ValidatorClass;

public class Form6Section4Activity extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {

    HashMap<String, mp060> HMmp06d0 = new HashMap<>();

    //region  CNTRL initilizatoin
    @BindView(R.id.mp06d01)
    RadioGroup mp06d01;
    @BindView(R.id.mp06d0101)
    RadioButton mp06d0101;
    @BindView(R.id.mp06d0102)
    RadioButton mp06d0102;


    @BindView(R.id.mp06d02)
    RadioGroup mp06d02;
    @BindView(R.id.mp06d0201)
    RadioButton mp06d0201;
    @BindView(R.id.mp06d0202)
    RadioButton mp06d0202;

    @BindView(R.id.mp06d03)
    RadioGroup mp06d03;
    @BindView(R.id.mp06d0301)
    RadioButton mp06d0301;
    @BindView(R.id.mp06d0302)
    RadioButton mp06d0302;

    @BindView(R.id.mp06d04)
    RadioGroup mp06d04;
    @BindView(R.id.mp06d0401)
    RadioButton mp06d0401;
    @BindView(R.id.mp06d0402)
    RadioButton mp06d0402;

    @BindView(R.id.mp06d05)
    RadioGroup mp06d05;
    @BindView(R.id.mp06d0501)
    RadioButton mp06d0501;
    @BindView(R.id.mp06d0502)
    RadioButton mp06d0502;

    @BindView(R.id.mp06d06)
    RadioGroup mp06d06;
    @BindView(R.id.mp06d0601)
    RadioButton mp06d0601;
    @BindView(R.id.mp06d0602)
    RadioButton mp06d0602;

    @BindView(R.id.mp06d07)
    RadioGroup mp06d07;
    @BindView(R.id.mp06d0701)
    RadioButton mp06d0701;
    @BindView(R.id.mp06d0702)
    RadioButton mp06d0702;

    @BindView(R.id.mp06d08)
    RadioGroup mp06d08;
    @BindView(R.id.mp06d0801)
    RadioButton mp06d0801;
    @BindView(R.id.mp06d0802)
    RadioButton mp06d0802;

    @BindView(R.id.mp06d09)
    RadioGroup mp06d09;
    @BindView(R.id.mp06d0901)
    RadioButton mp06d0901;
    @BindView(R.id.mp06d0902)
    RadioButton mp06d0902;

    @BindView(R.id.mp06d10)
    RadioGroup mp06d10;
    @BindView(R.id.mp06d1001)
    RadioButton mp06d1001;
    @BindView(R.id.mp06d1002)
    RadioButton mp06d1002;

    @BindView(R.id.mp06d11)
    RadioGroup mp06d11;
    @BindView(R.id.mp06d1101)
    RadioButton mp06d1101;
    @BindView(R.id.mp06d1102)
    RadioButton mp06d1102;

    @BindView(R.id.mp06d12)
    RadioGroup mp06d12;
    @BindView(R.id.mp06d1201)
    RadioButton mp06d1201;
    @BindView(R.id.mp06d1202)
    RadioButton mp06d1202;

    @BindView(R.id.mp06d13)
    RadioGroup mp06d13;
    @BindView(R.id.mp06d1301)
    RadioButton mp06d1301;
    @BindView(R.id.mp06d1302)
    RadioButton mp06d1302;

    @BindView(R.id.mp06d14)
    RadioGroup mp06d14;
    @BindView(R.id.mp06d1401)
    RadioButton mp06d1401;
    @BindView(R.id.mp06d1402)
    RadioButton mp06d1402;

    @BindView(R.id.mp06d15)
    RadioGroup mp06d15;
    @BindView(R.id.mp06d1501)
    RadioButton mp06d1501;
    @BindView(R.id.mp06d1502)
    RadioButton mp06d1502;

    @BindView(R.id.mp06d16)
    RadioGroup mp06d16;
    @BindView(R.id.mp06d1601)
    RadioButton mp06d1601;
    @BindView(R.id.mp06d1602)
    RadioButton mp06d1602;

    @BindView(R.id.mp06d17)
    RadioGroup mp06d17;
    @BindView(R.id.mp06d1701)
    RadioButton mp06d1701;
    @BindView(R.id.mp06d1702)
    RadioButton mp06d1702;

    @BindView(R.id.mp06d18)
    RadioGroup mp06d18;
    @BindView(R.id.mp06d1801)
    RadioButton mp06d1801;
    @BindView(R.id.mp06d1802)
    RadioButton mp06d1802;

    @BindView(R.id.mp06d19)
    RadioGroup mp06d19;
    @BindView(R.id.mp06d1901)
    RadioButton mp06d1901;
    @BindView(R.id.mp06d1902)
    RadioButton mp06d1902;

    @BindView(R.id.mp06d20)
    RadioGroup mp06d20;
    @BindView(R.id.mp06d2001)
    RadioButton mp06d2001;
    @BindView(R.id.mp06d2002)
    RadioButton mp06d2002;

    @BindView(R.id.mp06d21)
    RadioGroup mp06d21;
    @BindView(R.id.mp06d2101)
    RadioButton mp06d2101;
    @BindView(R.id.mp06d2102)
    RadioButton mp06d2102;

    @BindView(R.id.mp06d22)
    RadioGroup mp06d22;
    @BindView(R.id.mp06d2201)
    RadioButton mp06d2201;
    @BindView(R.id.mp06d2202)
    RadioButton mp06d2202;

    @BindView(R.id.mp06d23)
    RadioGroup mp06d23;
    @BindView(R.id.mp06d2301)
    RadioButton mp06d2301;
    @BindView(R.id.mp06d2302)
    RadioButton mp06d2302;

    @BindView(R.id.mp06d24)
    RadioGroup mp06d24;
    @BindView(R.id.mp06d2401)
    RadioButton mp06d2401;
    @BindView(R.id.mp06d2402)
    RadioButton mp06d2402;

    @BindView(R.id.mp06d25)
    RadioGroup mp06d25;
    @BindView(R.id.mp06d2501)
    RadioButton mp06d2501;
    @BindView(R.id.mp06d2502)
    RadioButton mp06d2502;

    @BindView(R.id.mp06d26)
    RadioGroup mp06d26;
    @BindView(R.id.mp06d2601)
    RadioButton mp06d2601;
    @BindView(R.id.mp06d2602)
    RadioButton mp06d2602;

    @BindView(R.id.mp06d27)
    RadioGroup mp06d27;
    @BindView(R.id.mp06d2701)
    RadioButton mp06d2701;
    @BindView(R.id.mp06d2702)
    RadioButton mp06d2702;

    @BindView(R.id.mp06d28)
    RadioGroup mp06d28;
    @BindView(R.id.mp06d2801)
    RadioButton mp06d2801;
    @BindView(R.id.mp06d2802)
    RadioButton mp06d2802;

    @BindView(R.id.mp06d29)
    RadioGroup mp06d29;
    @BindView(R.id.mp06d2901)
    RadioButton mp06d2901;
    @BindView(R.id.mp06d2902)
    RadioButton mp06d2902;

    @BindView(R.id.mp06d30)
    RadioGroup mp06d30;
    @BindView(R.id.mp06d3001)
    RadioButton mp06d3001;
    @BindView(R.id.mp06d3002)
    RadioButton mp06d3002;

    @BindView(R.id.mp06d31)
    RadioGroup mp06d31;
    @BindView(R.id.mp06d3101)
    RadioButton mp06d3101;
    @BindView(R.id.mp06d3102)
    RadioButton mp06d3102;

    @BindView(R.id.mp06d32)
    RadioGroup mp06d32;
    @BindView(R.id.mp06d3201)
    RadioButton mp06d3201;
    @BindView(R.id.mp06d3202)
    RadioButton mp06d3202;


    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    @BindView(R.id.btn_End)
    Button btn_End;

    @BindView(R.id.lvmain)
    LinearLayout lvmain;
    //lvmp06d02

    @BindView(R.id.lvmp06d01)
    LinearLayout lvmp06d01;

    @BindView(R.id.lvmp06d02)
    LinearLayout lvmp06d02;

    @BindView(R.id.lvmp06d03)
    LinearLayout lvmp06d03;

    @BindView(R.id.lvmp06d04)
    LinearLayout lvmp06d04;

    @BindView(R.id.lvmp06d05)
    LinearLayout lvmp06d05;

    @BindView(R.id.lvmp06d06)
    LinearLayout lvmp06d06;

    @BindView(R.id.lvmp06d07)
    LinearLayout lvmp06d07;

    @BindView(R.id.lvmp06d08)
    LinearLayout lvmp06d08;

    @BindView(R.id.lvmp06d09)
    LinearLayout lvmp06d09;

    @BindView(R.id.lvmp06d10)
    LinearLayout lvmp06d10;

    @BindView(R.id.lvmp06d11)
    LinearLayout lvmp06d11;

    @BindView(R.id.lvmp06d12)
    LinearLayout lvmp06d12;

    @BindView(R.id.lvmp06d13)
    LinearLayout lvmp06d13;

    @BindView(R.id.lvmp06d14)
    LinearLayout lvmp06d14;

    @BindView(R.id.lvmp06d15)
    LinearLayout lvmp06d15;

    @BindView(R.id.lvmp06d16)
    LinearLayout lvmp06d16;

    @BindView(R.id.lvmp06d17)
    LinearLayout lvmp06d17;

    @BindView(R.id.lvmp06d18)
    LinearLayout lvmp06d18;

    @BindView(R.id.lvmp06d19)
    LinearLayout lvmp06d19;

    @BindView(R.id.lvmp06d20)
    LinearLayout lvmp06d20;

    @BindView(R.id.lvmp06d21)
    LinearLayout lvmp06d21;

    @BindView(R.id.lvmp06d22)
    LinearLayout lvmp06d22;

    @BindView(R.id.lvmp06d23)
    LinearLayout lvmp06d23;

    @BindView(R.id.lvmp06d24)
    LinearLayout lvmp06d24;

    @BindView(R.id.lvmp06d25)
    LinearLayout lvmp06d25;

    @BindView(R.id.lvmp06d26)
    LinearLayout lvmp06d26;

    @BindView(R.id.lvmp06d27)
    LinearLayout lvmp06d27;

    @BindView(R.id.lvmp06d28)
    LinearLayout lvmp06d28;

    @BindView(R.id.lvmp06d29)
    LinearLayout lvmp06d29;

    @BindView(R.id.lvmp06d30)
    LinearLayout lvmp06d30;

    @BindView(R.id.lvmp06d31)
    LinearLayout lvmp06d31;

    @BindView(R.id.lvmp06d32)
    LinearLayout lvmp06d32;

    HashMap<String, LinearLayout> Hm_Lv = new HashMap<>();


    //endregion

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6_section4);
        ButterKnife.bind(this);

        //region RB click evernts


        mp06d0101.setOnCheckedChangeListener(this);

        mp06d0102.setOnCheckedChangeListener(this);

        mp06d0201.setOnCheckedChangeListener(this);
        mp06d0202.setOnCheckedChangeListener(this);

        mp06d0301.setOnCheckedChangeListener(this);
        mp06d0302.setOnCheckedChangeListener(this);

        mp06d0401.setOnCheckedChangeListener(this);
        mp06d0402.setOnCheckedChangeListener(this);

        mp06d0501.setOnCheckedChangeListener(this);
        mp06d0502.setOnCheckedChangeListener(this);

        mp06d0601.setOnCheckedChangeListener(this);
        mp06d0602.setOnCheckedChangeListener(this);

        mp06d0701.setOnCheckedChangeListener(this);
        mp06d0702.setOnCheckedChangeListener(this);


        mp06d0801.setOnCheckedChangeListener(this);
        mp06d0802.setOnCheckedChangeListener(this);

        mp06d0901.setOnCheckedChangeListener(this);
        mp06d0902.setOnCheckedChangeListener(this);

        mp06d1001.setOnCheckedChangeListener(this);
        mp06d1002.setOnCheckedChangeListener(this);

        mp06d1101.setOnCheckedChangeListener(this);
        mp06d1102.setOnCheckedChangeListener(this);

        mp06d1201.setOnCheckedChangeListener(this);
        mp06d1202.setOnCheckedChangeListener(this);

        mp06d1301.setOnCheckedChangeListener(this);
        mp06d1302.setOnCheckedChangeListener(this);

        mp06d1401.setOnCheckedChangeListener(this);
        mp06d1402.setOnCheckedChangeListener(this);

        mp06d1501.setOnCheckedChangeListener(this);
        mp06d1502.setOnCheckedChangeListener(this);

        mp06d1601.setOnCheckedChangeListener(this);
        mp06d1602.setOnCheckedChangeListener(this);

        mp06d1701.setOnCheckedChangeListener(this);
        mp06d1702.setOnCheckedChangeListener(this);

        mp06d1801.setOnCheckedChangeListener(this);
        mp06d1802.setOnCheckedChangeListener(this);

        mp06d1901.setOnCheckedChangeListener(this);
        mp06d1902.setOnCheckedChangeListener(this);

        mp06d2001.setOnCheckedChangeListener(this);
        mp06d2002.setOnCheckedChangeListener(this);

        mp06d2101.setOnCheckedChangeListener(this);
        mp06d2102.setOnCheckedChangeListener(this);

        mp06d2201.setOnCheckedChangeListener(this);
        mp06d2202.setOnCheckedChangeListener(this);

        mp06d2301.setOnCheckedChangeListener(this);
        mp06d2302.setOnCheckedChangeListener(this);

        mp06d2401.setOnCheckedChangeListener(this);
        mp06d2402.setOnCheckedChangeListener(this);

        mp06d2501.setOnCheckedChangeListener(this);
        mp06d2502.setOnCheckedChangeListener(this);


        mp06d2601.setOnCheckedChangeListener(this);
        mp06d2602.setOnCheckedChangeListener(this);


        mp06d2701.setOnCheckedChangeListener(this);
        mp06d2702.setOnCheckedChangeListener(this);


        mp06d2801.setOnCheckedChangeListener(this);
        mp06d2802.setOnCheckedChangeListener(this);

        mp06d2901.setOnCheckedChangeListener(this);
        mp06d2902.setOnCheckedChangeListener(this);

        mp06d3001.setOnCheckedChangeListener(this);
        mp06d3002.setOnCheckedChangeListener(this);

        mp06d3101.setOnCheckedChangeListener(this);
        mp06d3102.setOnCheckedChangeListener(this);

        mp06d3201.setOnCheckedChangeListener(this);
        mp06d3202.setOnCheckedChangeListener(this);


//endregion


        //region  hasmap

        Hm_Lv.put("mp06d01", lvmp06d01);
        Hm_Lv.put("mp06d02", lvmp06d02);
        Hm_Lv.put("mp06d03", lvmp06d03);
        Hm_Lv.put("mp06d04", lvmp06d04);
        Hm_Lv.put("mp06d05", lvmp06d05);
        Hm_Lv.put("mp06d06", lvmp06d06);
        Hm_Lv.put("mp06d07", lvmp06d07);
        Hm_Lv.put("mp06d08", lvmp06d08);
        Hm_Lv.put("mp06d09", lvmp06d09);
        Hm_Lv.put("mp06d10", lvmp06d10);
        Hm_Lv.put("mp06d11", lvmp06d11);
        Hm_Lv.put("mp06d12", lvmp06d12);
        Hm_Lv.put("mp06d13", lvmp06d13);
        Hm_Lv.put("mp06d14", lvmp06d14);
        Hm_Lv.put("mp06d15", lvmp06d15);
        Hm_Lv.put("mp06d16", lvmp06d16);
        Hm_Lv.put("mp06d17", lvmp06d17);
        Hm_Lv.put("mp06d18", lvmp06d18);
        Hm_Lv.put("mp06d19", lvmp06d19);
        Hm_Lv.put("mp06d20", lvmp06d20);
        Hm_Lv.put("mp06d21", lvmp06d21);
        Hm_Lv.put("mp06d22", lvmp06d22);
        Hm_Lv.put("mp06d23", lvmp06d23);
        Hm_Lv.put("mp06d24", lvmp06d24);
        Hm_Lv.put("mp06d25", lvmp06d25);
        Hm_Lv.put("mp06d26", lvmp06d26);
        Hm_Lv.put("mp06d27", lvmp06d27);
        Hm_Lv.put("mp06d28", lvmp06d28);
        Hm_Lv.put("mp06d29", lvmp06d29);
        Hm_Lv.put("mp06d30", lvmp06d30);
        Hm_Lv.put("mp06d31", lvmp06d31);
        Hm_Lv.put("mp06d32", lvmp06d32);

        //endregion

        btn_Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                boolean ff=checvalidation(lvmain);


                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmain) == false) {
                    return;
                }


                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d01) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d02) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d03) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d04) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d05) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d06) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d07) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d08) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d09) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d10) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d11) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d12) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d13) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d14) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d15) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d16) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d17) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d18) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d19) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d20) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d21) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d22) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d23) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d24) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d25) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d26) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d27) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d28) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d29) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d30) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d31) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, lvmp06d32) == false) {
                    return;
                }


                get_data(lvmp06d01);
                        get_data(lvmp06d02);
                get_data(lvmp06d03);
                        get_data(lvmp06d04);
                get_data(lvmp06d05);
                        get_data(lvmp06d06);
                get_data(lvmp06d07);
                        get_data(lvmp06d08);
                get_data(lvmp06d09);
                        get_data(lvmp06d10);
                get_data(lvmp06d11);
                        get_data(lvmp06d12);
                get_data(lvmp06d13);
                        get_data(lvmp06d14);
                get_data(lvmp06d15);
                        get_data(lvmp06d16);
                get_data(lvmp06d17);
                        get_data(lvmp06d18);
                get_data(lvmp06d19);
                        get_data(lvmp06d20);
                get_data(lvmp06d21);
                        get_data(lvmp06d22);
                get_data(lvmp06d23);
                        get_data(lvmp06d24);
                get_data(lvmp06d25);
                        get_data(lvmp06d26);
                get_data(lvmp06d27);
                        get_data(lvmp06d28);
                get_data(lvmp06d29);
                        get_data(lvmp06d30);
                get_data(lvmp06d31);
                        get_data(lvmp06d32);


                try {
                    saveDrafts();
                } catch (JSONException e) {
                    e.printStackTrace();
                }

               startActivity(new Intent(Form6Section4Activity.this, EndingActivity.class)
                        .putExtra("complete", true));



            }

        });

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        String id = compoundButton.getResources().getResourceName(compoundButton.getId());
        String lst6 = id.substring(Math.max(id.length() - 9, 0));
        String lst2 = id.substring(Math.max(id.length() - 3, 0));
        String lst8 = removeLastChar(lst6);


        if (compoundButton.getId() == R.id.mp06d0101 ) {
            if (mp06d0101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0102 ) {
            if (mp06d0102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0201 ) {
            if (mp06d0201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0202 ) {
            if (mp06d0202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0301 ) {
            if (mp06d0301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0302 ) {
            if (mp06d0302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }



        if (compoundButton.getId() == R.id.mp06d0401 ) {
            if (mp06d0401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0402 ) {
            if (mp06d0402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0501 ) {
            if (mp06d0501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0502 ) {
            if (mp06d0502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0601 ) {
            if (mp06d0601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0602 ) {
            if (mp06d0602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0701 ) {
            if (mp06d0701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0702 ) {
            if (mp06d0702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0801 ) {
            if (mp06d0801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0802 ) {
            if (mp06d0802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp06d0901 ) {
            if (mp06d0901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0902 ) {
            if (mp06d0902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1001 ) {
            if (mp06d1001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1002 ) {
            if (mp06d1002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp06d1101 ) {
            if (mp06d1101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1102 ) {
            if (mp06d1102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp06d1201 ) {
            if (mp06d1201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1202 ) {
            if (mp06d1202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1301 ) {
            if (mp06d1301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1302 ) {
            if (mp06d1302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1401 ) {
            if (mp06d1401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1402 ) {
            if (mp06d1402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1501 ) {
            if (mp06d1501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1502 ) {
            if (mp06d1502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }



        if (compoundButton.getId() == R.id.mp06d1601 ) {
            if (mp06d1601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1602 ) {
            if (mp06d1602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1701 ) {
            if (mp06d1701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1702 ) {
            if (mp06d1702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1801 ) {
            if (mp06d1801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1802 ) {
            if (mp06d1802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1901 ) {
            if (mp06d1901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1902 ) {
            if (mp06d1902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2001 ) {
            if (mp06d2001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2002 ) {
            if (mp06d2002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2101 ) {
            if (mp06d2101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2102 ) {
            if (mp06d2102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2201 ) {
            if (mp06d2201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2202 ) {
            if (mp06d2202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2301 ) {
            if (mp06d2301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2302 ) {
            if (mp06d2302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2401 ) {
            if (mp06d2401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2402 ) {
            if (mp06d2402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2501 ) {
            if (mp06d2501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2502 ) {
            if (mp06d2502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2601 ) {
            if (mp06d2601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2602 ) {
            if (mp06d2602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2701 ) {
            if (mp06d2701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2702 ) {
            if (mp06d2702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2801 ) {
            if (mp06d2801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2802 ) {
            if (mp06d2802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2901 ) {
            if (mp06d2901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2902 ) {
            if (mp06d2902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3001 ) {
            if (mp06d3001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3002 ) {
            if (mp06d3002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3101 ) {
            if (mp06d3101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3102 ) {
            if (mp06d3102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3201 ) {
            if (mp06d3201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3202 ) {
            if (mp06d3202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }






    }

    public void get_data( final LinearLayout v) {

        mp060 obj_mp06d0 = new mp060();
        String id = v.getResources().getResourceName(v.getId());
        String lst6 = id.substring(Math.max(id.length() - 9, 0));
        String vname = lst6;
        if(v.getChildCount()==0)
        {
            obj_mp06d0.mp06dh2a="0";
            obj_mp06d0.mp06dh2b="0";
            obj_mp06d0.mp06dh2c="0";
            obj_mp06d0.mp06dh3="0";
            obj_mp06d0.mp06dh4="0";
            obj_mp06d0.mp06dh5="0";
            obj_mp06d0.mp06dh407x="0";
            HMmp06d0.put(vname, obj_mp06d0);
            
            return;
        }



        final CheckBox mp06dh2a, mp06dh2b, mp06dh2c;
        final RadioButton
                mp06dh301,
                mp06dh302,
                mp06dh401,
                mp06dh402,
                mp06dh403,
                mp06dh404,
                mp06dh405,
                mp06dh406,
                mp06dh407;
        final EditText mp06dh407x,
                mp06dh5;

        Button btn_End, btn_Continue;

        mp06dh2a = v.findViewById(R.id.mp06dh2a);
        mp06dh2b = v.findViewById(R.id.mp06dh2b);
        mp06dh2c = v.findViewById(R.id.mp06dh2c);

        mp06dh301 = v.findViewById(R.id.mp06dh301);
        mp06dh302 = v.findViewById(R.id.mp06dh302);
        mp06dh401 = v.findViewById(R.id.mp06dh401);
        mp06dh402 = v.findViewById(R.id.mp06dh402);
        mp06dh403 = v.findViewById(R.id.mp06dh403);
        mp06dh404 = v.findViewById(R.id.mp06dh404);
        mp06dh405 = v.findViewById(R.id.mp06dh405);
        mp06dh406 = v.findViewById(R.id.mp06dh406);
        mp06dh407 = v.findViewById(R.id.mp06dh407);

        mp06dh407x = v.findViewById(R.id.mp06dh407x);
        mp06dh5 = v.findViewById(R.id.mp06dh5);













                    if (mp06dh2a.isChecked()) {
                        obj_mp06d0.mp06dh2a = "1";
                    } else {
                        obj_mp06d0.mp06dh2a = "0";
                    }
                    if (mp06dh2b.isChecked()) {
                        obj_mp06d0.mp06dh2b = "1";
                    } else {
                        obj_mp06d0.mp06dh2b = "0";
                    }
                    if (mp06dh2c.isChecked()) {
                        obj_mp06d0.mp06dh2c = "1";
                    } else {
                        obj_mp06d0.mp06dh2c = "0";
                    }



                    if (mp06dh301.isChecked()) {
                        obj_mp06d0.mp06dh3 = "1";
                    }
                    if (mp06dh302.isChecked()) {
                        obj_mp06d0.mp06dh3 = "2";
                    }


                    if (mp06dh401.isChecked()) {
                        obj_mp06d0.mp06dh4 = "1";
                    }
                    if (mp06dh402.isChecked()) {
                        obj_mp06d0.mp06dh4 = "2";
                    }
                    if (mp06dh403.isChecked()) {
                        obj_mp06d0.mp06dh4 = "3";
                    }
                    if (mp06dh404.isChecked()) {
                        obj_mp06d0.mp06dh4 = "4";
                    }
                    if (mp06dh405.isChecked()) {
                        obj_mp06d0.mp06dh4 = "5";
                    }
                    if (mp06dh406.isChecked()) {
                        obj_mp06d0.mp06dh4 = "6";
                    }
                    if (mp06dh407.isChecked()) {
                        obj_mp06d0.mp06dh4 = "7";

                        if (!mp06dh407x.getText().toString().isEmpty()) {
                            obj_mp06d0.mp06dh407x = mp06dh407x.getText().toString();
                        }
                        else
                        {
                            obj_mp06d0.mp06dh407x = "0";
                        }




                }
                    else
                    {
                        obj_mp06d0.mp06dh407x = "0";
                    }

                if (!mp06dh5.getText().toString().isEmpty()) {
                    obj_mp06d0.mp06dh5 = mp06dh5.getText().toString();
                }

                HMmp06d0.put(vname, obj_mp06d0);


             int a=0;


    }

    public void showLV(final String vname, LinearLayout lv) {
        // final AlertDialog b = new AlertDialog.Builder(this).create();


        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.alertdialogue, null);
        lv.addView(v);
        // b.setView(v);
        // b.show();
        // b.setCancelable(false);


        CheckBox mp06dh2a, mp06dh2b, mp06dh2c;
      final   LinearLayout mp06dh4lv,mp06dh5lv;
        RadioButton
                mp06dh301,
                mp06dh302,
                mp06dh401,
                mp06dh402,
                mp06dh403,
                mp06dh404,
                mp06dh405,
                mp06dh406,
                mp06dh407;
        final EditText mp06dh407x,
                mp06dh5;

        Button btn_End, btn_Continue;
        mp06dh4lv=v.findViewById(R.id.mp06dh4lv);
        mp06dh5lv=v.findViewById(R.id.mp06dh5lv);

        mp06dh2a = v.findViewById(R.id.mp06dh2a);
        mp06dh2b = v.findViewById(R.id.mp06dh2b);
        mp06dh2c = v.findViewById(R.id.mp06dh2c);

        mp06dh301 = v.findViewById(R.id.mp06dh301);
        mp06dh302 = v.findViewById(R.id.mp06dh302);
        mp06dh401 = v.findViewById(R.id.mp06dh401);
        mp06dh402 = v.findViewById(R.id.mp06dh402);
        mp06dh403 = v.findViewById(R.id.mp06dh403);
        mp06dh404 = v.findViewById(R.id.mp06dh404);
        mp06dh405 = v.findViewById(R.id.mp06dh405);
        mp06dh406 = v.findViewById(R.id.mp06dh406);
        mp06dh407 = v.findViewById(R.id.mp06dh407);

        mp06dh407x = v.findViewById(R.id.mp06dh407x);
        mp06dh5 = v.findViewById(R.id.mp06dh5);


        mp06dh407.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp06dh407x.setVisibility(View.VISIBLE);
                } else {
                    mp06dh407x.setVisibility(View.GONE);
                }
            }
        });

        mp06dh301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp06dh4lv.setVisibility(View.VISIBLE);
                    mp06dh5lv.setVisibility(View.VISIBLE);
                } else {
                    mp06dh4lv.setVisibility(View.GONE);
                    mp06dh5lv.setVisibility(View.GONE);

                }
            }
        });
        mp06dh302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp06dh4lv.setVisibility(View.GONE);
                    mp06dh5lv.setVisibility(View.GONE);
                } else {


                    mp06dh4lv.setVisibility(View.VISIBLE);
                    mp06dh5lv.setVisibility(View.VISIBLE);

                }
            }
        });

    }






    public boolean checvalidation(LinearLayout lv) {

        /// Checkbox Celar*************************************



            for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
                View view = lv.getChildAt(i);

                if (view instanceof RadioGroup) {
                    int id = ((RadioGroup) view).getCheckedRadioButtonId();
                    if (id == -1) {
                        view.requestFocus();

                          Toast.makeText(Form6Section4Activity.this, "Radio Button: Some filed are missing", Toast.LENGTH_LONG).show();

                          return false;
                    }

                }
                if (view instanceof LinearLayout) {
                    //  Boolean lvb=check_get_data(((LinearLayout)view));


                }


            }

            return true;



    }

    public void saveDrafts() throws JSONException
    {
        JSONObject form6 = new JSONObject();
        String mp06dh2a;
        String mp06dh2b;
        String mp06dh2c;


        String mp06dh3;
        String mp06dh4;
        String mp06dh407x;

        String mp06dh5;

        for(Map.Entry<String, mp060> entry : HMmp06d0.entrySet()) {
            String key = entry.getKey();
            mp060 obj_mp060 = entry.getValue();

            mp06dh2a=obj_mp060.mp06dh2a;
            mp06dh2b=obj_mp060.mp06dh2b;
            mp06dh2c=obj_mp060.mp06dh2c;
            mp06dh3=obj_mp060.mp06dh3;
            mp06dh4=obj_mp060.mp06dh4;
            mp06dh407x=obj_mp060.mp06dh407x;
            mp06dh5=obj_mp060.mp06dh5;

            key=key.substring(2);

            form6.put(key+"02a",mp06dh2a);
            form6.put(key+"02b",mp06dh2b);
            form6.put(key+"02c",mp06dh2c);

            form6.put(key+"03",mp06dh3);
            form6.put(key+"04",mp06dh4);
            form6.put(key+"04x",mp06dh407x);
            form6.put(key+"05",mp06dh5);


        }

        form6.put("mp06d01",mp06d0101.isChecked()?"1":mp06d0102.isChecked()?"2":"0" );
        form6.put("mp06d02",mp06d0201.isChecked()?"1":mp06d0202.isChecked()?"2":"0" );
        form6.put("mp06d03",mp06d0301.isChecked()?"1":mp06d0302.isChecked()?"2":"0" );
        form6.put("mp06d04",mp06d0401.isChecked()?"1":mp06d0402.isChecked()?"2":"0" );
        form6.put("mp06d05",mp06d0501.isChecked()?"1":mp06d0502.isChecked()?"2":"0" );
        form6.put("mp06d06",mp06d0601.isChecked()?"1":mp06d0602.isChecked()?"2":"0" );
        form6.put("mp06d07",mp06d0701.isChecked()?"1":mp06d0702.isChecked()?"2":"0" );
        form6.put("mp06d08",mp06d0801.isChecked()?"1":mp06d0802.isChecked()?"2":"0" );
        form6.put("mp06d09",mp06d0901.isChecked()?"1":mp06d0902.isChecked()?"2":"0" );
        form6.put("mp06d10",mp06d1001.isChecked()?"1":mp06d1002.isChecked()?"2":"0" );
        form6.put("mp06d11",mp06d1101.isChecked()?"1":mp06d1102.isChecked()?"2":"0" );
        form6.put("mp06d12",mp06d1201.isChecked()?"1":mp06d1202.isChecked()?"2":"0" );
        form6.put("mp06d13",mp06d1301.isChecked()?"1":mp06d1302.isChecked()?"2":"0" );
        form6.put("mp06d14",mp06d1401.isChecked()?"1":mp06d1402.isChecked()?"2":"0" );
        form6.put("mp06d15",mp06d1501.isChecked()?"1":mp06d1502.isChecked()?"2":"0" );
        form6.put("mp06d16",mp06d1601.isChecked()?"1":mp06d1602.isChecked()?"2":"0" );
        form6.put("mp06d17",mp06d1701.isChecked()?"1":mp06d1702.isChecked()?"2":"0" );
        form6.put("mp06d18",mp06d1801.isChecked()?"1":mp06d1802.isChecked()?"2":"0" );
        form6.put("mp06d19",mp06d1901.isChecked()?"1":mp06d1902.isChecked()?"2":"0" );
        form6.put("mp06d20",mp06d2001.isChecked()?"1":mp06d2002.isChecked()?"2":"0" );
        form6.put("mp06d21",mp06d2101.isChecked()?"1":mp06d2102.isChecked()?"2":"0" );
        form6.put("mp06d22",mp06d2201.isChecked()?"1":mp06d2202.isChecked()?"2":"0" );
        form6.put("mp06d23",mp06d2301.isChecked()?"1":mp06d2302.isChecked()?"2":"0" );
        form6.put("mp06d24",mp06d2401.isChecked()?"1":mp06d2402.isChecked()?"2":"0" );
        form6.put("mp06d25",mp06d2501.isChecked()?"1":mp06d2502.isChecked()?"2":"0" );
        form6.put("mp06d26",mp06d2601.isChecked()?"1":mp06d2602.isChecked()?"2":"0" );
        form6.put("mp06d27",mp06d2701.isChecked()?"1":mp06d2702.isChecked()?"2":"0" );
        form6.put("mp06d28",mp06d2801.isChecked()?"1":mp06d2802.isChecked()?"2":"0" );
        form6.put("mp06d29",mp06d2901.isChecked()?"1":mp06d2902.isChecked()?"2":"0" );
        form6.put("mp06d30",mp06d3001.isChecked()?"1":mp06d3002.isChecked()?"2":"0" );
        form6.put("mp06d31",mp06d3101.isChecked()?"1":mp06d3102.isChecked()?"2":"0" );
        form6.put("mp06d32",mp06d3201.isChecked()?"1":mp06d3202.isChecked()?"2":"0" );































































    }

}

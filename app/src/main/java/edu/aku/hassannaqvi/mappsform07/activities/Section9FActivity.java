package edu.aku.hassannaqvi.mappsform07.activities;

import android.content.Intent;
import android.os.Bundle;
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
import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.other.mp090;
import edu.aku.hassannaqvi.mappsform07.validation.ValidatorClass2;


public class Section9FActivity extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {

    HashMap<String, mp090> HMmp09e0 = new HashMap<>();

    //region  CNTRL initilizatoin
    @BindView(R.id.mp09e01)
    RadioGroup mp09e01;
    @BindView(R.id.mp09e0101)
    RadioButton mp09e0101;
    @BindView(R.id.mp09e0102)
    RadioButton mp09e0102;


    @BindView(R.id.mp09e02)
    RadioGroup mp09e02;
    @BindView(R.id.mp09e0201)
    RadioButton mp09e0201;
    @BindView(R.id.mp09e0202)
    RadioButton mp09e0202;

    @BindView(R.id.mp09e03)
    RadioGroup mp09e03;
    @BindView(R.id.mp09e0301)
    RadioButton mp09e0301;
    @BindView(R.id.mp09e0302)
    RadioButton mp09e0302;

    @BindView(R.id.mp09e04)
    RadioGroup mp09e04;
    @BindView(R.id.mp09e0401)
    RadioButton mp09e0401;
    @BindView(R.id.mp09e0402)
    RadioButton mp09e0402;

    @BindView(R.id.mp09e05)
    RadioGroup mp09e05;
    @BindView(R.id.mp09e0501)
    RadioButton mp09e0501;
    @BindView(R.id.mp09e0502)
    RadioButton mp09e0502;

    @BindView(R.id.mp09e06)
    RadioGroup mp09e06;
    @BindView(R.id.mp09e0601)
    RadioButton mp09e0601;
    @BindView(R.id.mp09e0602)
    RadioButton mp09e0602;

    @BindView(R.id.mp09e06x)
    EditText mp09e06x;


    @BindView(R.id.mp09e07)
    RadioGroup mp09e07;
    @BindView(R.id.mp09e0701)
    RadioButton mp09e0701;
    @BindView(R.id.mp09e0702)
    RadioButton mp09e0702;


    @BindView(R.id.mp09e07x)
    EditText mp09e07x;

    @BindView(R.id.mp09e08)
    RadioGroup mp09e08;
    @BindView(R.id.mp09e0801)
    RadioButton mp09e0801;
    @BindView(R.id.mp09e0802)
    RadioButton mp09e0802;

    @BindView(R.id.mp09e09)
    RadioGroup mp09e09;
    @BindView(R.id.mp09e0901)
    RadioButton mp09e0901;
    @BindView(R.id.mp09e0902)
    RadioButton mp09e0902;

    @BindView(R.id.mp09e10)
    RadioGroup mp09e10;
    @BindView(R.id.mp09e1001)
    RadioButton mp09e1001;
    @BindView(R.id.mp09e1002)
    RadioButton mp09e1002;

    @BindView(R.id.mp09e11)
    RadioGroup mp09e11;
    @BindView(R.id.mp09e1101)
    RadioButton mp09e1101;
    @BindView(R.id.mp09e1102)
    RadioButton mp09e1102;

    @BindView(R.id.mp09e12)
    RadioGroup mp09e12;
    @BindView(R.id.mp09e1201)
    RadioButton mp09e1201;
    @BindView(R.id.mp09e1202)
    RadioButton mp09e1202;


    @BindView(R.id.mp09e12x)
    EditText mp09e12x;


    @BindView(R.id.mp09e13)
    RadioGroup mp09e13;
    @BindView(R.id.mp09e1301)
    RadioButton mp09e1301;
    @BindView(R.id.mp09e1302)
    RadioButton mp09e1302;


    @BindView(R.id.mp09e13x)
    EditText mp09e13x;


    @BindView(R.id.mp09e14)
    RadioGroup mp09e14;
    @BindView(R.id.mp09e1401)
    RadioButton mp09e1401;

    @BindView(R.id.mp09e1402)
    RadioButton mp09e1402;


    @BindView(R.id.mp09e14x)
    EditText mp09e14x;


    @BindView(R.id.mp09e15)
    RadioGroup mp09e15;
    @BindView(R.id.mp09e1501)
    RadioButton mp09e1501;
    @BindView(R.id.mp09e1502)
    RadioButton mp09e1502;

    @BindView(R.id.mp09e16)
    RadioGroup mp09e16;
    @BindView(R.id.mp09e1601)
    RadioButton mp09e1601;
    @BindView(R.id.mp09e1602)
    RadioButton mp09e1602;

    @BindView(R.id.mp09e17)
    RadioGroup mp09e17;
    @BindView(R.id.mp09e1701)
    RadioButton mp09e1701;
    @BindView(R.id.mp09e1702)
    RadioButton mp09e1702;


    @BindView(R.id.mp09e17x)
    EditText mp09e17x;


    @BindView(R.id.mp09e18)
    RadioGroup mp09e18;
    @BindView(R.id.mp09e1801)
    RadioButton mp09e1801;
    @BindView(R.id.mp09e1802)
    RadioButton mp09e1802;

    @BindView(R.id.mp09e19)
    RadioGroup mp09e19;
    @BindView(R.id.mp09e1901)
    RadioButton mp09e1901;
    @BindView(R.id.mp09e1902)
    RadioButton mp09e1902;

    @BindView(R.id.mp09e20)
    RadioGroup mp09e20;
    @BindView(R.id.mp09e2001)
    RadioButton mp09e2001;
    @BindView(R.id.mp09e2002)
    RadioButton mp09e2002;

    @BindView(R.id.mp09e21)
    RadioGroup mp09e21;
    @BindView(R.id.mp09e2101)
    RadioButton mp09e2101;
    @BindView(R.id.mp09e2102)
    RadioButton mp09e2102;

    @BindView(R.id.mp09e22)
    RadioGroup mp09e22;
    @BindView(R.id.mp09e2201)
    RadioButton mp09e2201;
    @BindView(R.id.mp09e2202)
    RadioButton mp09e2202;

    @BindView(R.id.mp09e23)
    RadioGroup mp09e23;
    @BindView(R.id.mp09e2301)
    RadioButton mp09e2301;
    @BindView(R.id.mp09e2302)
    RadioButton mp09e2302;

    @BindView(R.id.mp09e24)
    RadioGroup mp09e24;
    @BindView(R.id.mp09e2401)
    RadioButton mp09e2401;
    @BindView(R.id.mp09e2402)
    RadioButton mp09e2402;

    @BindView(R.id.mp09e25)
    RadioGroup mp09e25;
    @BindView(R.id.mp09e2501)
    RadioButton mp09e2501;
    @BindView(R.id.mp09e2502)
    RadioButton mp09e2502;

    @BindView(R.id.mp09e26)
    RadioGroup mp09e26;
    @BindView(R.id.mp09e2601)
    RadioButton mp09e2601;
    @BindView(R.id.mp09e2602)
    RadioButton mp09e2602;


    @BindView(R.id.mp09e26x)
    EditText mp09e26x;


    @BindView(R.id.btn_Continue)
    Button btn_Continue;

    @BindView(R.id.btn_End)
    Button btn_End;

    @BindView(R.id.lvmain)
    LinearLayout lvmain;
    //lvmp09e02

    @BindView(R.id.lvmp09e01)
    LinearLayout lvmp09e01;

    @BindView(R.id.lvmp09e02)
    LinearLayout lvmp09e02;

    @BindView(R.id.lvmp09e03)
    LinearLayout lvmp09e03;

    @BindView(R.id.lvmp09e04)
    LinearLayout lvmp09e04;

    @BindView(R.id.lvmp09e05)
    LinearLayout lvmp09e05;

    @BindView(R.id.lvmp09e06)
    LinearLayout lvmp09e06;

    @BindView(R.id.lvmp09e07)
    LinearLayout lvmp09e07;

    @BindView(R.id.lvmp09e08)
    LinearLayout lvmp09e08;

    @BindView(R.id.lvmp09e09)
    LinearLayout lvmp09e09;

    @BindView(R.id.lvmp09e10)
    LinearLayout lvmp09e10;

    @BindView(R.id.lvmp09e11)
    LinearLayout lvmp09e11;

    @BindView(R.id.lvmp09e12)
    LinearLayout lvmp09e12;

    @BindView(R.id.lvmp09e13)
    LinearLayout lvmp09e13;

    @BindView(R.id.lvmp09e14)
    LinearLayout lvmp09e14;

    @BindView(R.id.lvmp09e15)
    LinearLayout lvmp09e15;

    @BindView(R.id.lvmp09e16)
    LinearLayout lvmp09e16;

    @BindView(R.id.lvmp09e17)
    LinearLayout lvmp09e17;

    @BindView(R.id.lvmp09e18)
    LinearLayout lvmp09e18;

    @BindView(R.id.lvmp09e19)
    LinearLayout lvmp09e19;

    @BindView(R.id.lvmp09e20)
    LinearLayout lvmp09e20;

    @BindView(R.id.lvmp09e21)
    LinearLayout lvmp09e21;

    @BindView(R.id.lvmp09e22)
    LinearLayout lvmp09e22;

    @BindView(R.id.lvmp09e23)
    LinearLayout lvmp09e23;

    @BindView(R.id.lvmp09e24)
    LinearLayout lvmp09e24;

    @BindView(R.id.lvmp09e25)
    LinearLayout lvmp09e25;

    @BindView(R.id.lvmp09e26)
    LinearLayout lvmp09e26;


    HashMap<String, LinearLayout> Hm_Lv = new HashMap<>();


    //endregion

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section9f);
        ButterKnife.bind(this);

        //region RB click evernts


        mp09e0101.setOnCheckedChangeListener(this);

        mp09e0102.setOnCheckedChangeListener(this);

        mp09e0201.setOnCheckedChangeListener(this);
        mp09e0202.setOnCheckedChangeListener(this);

        mp09e0301.setOnCheckedChangeListener(this);
        mp09e0302.setOnCheckedChangeListener(this);

        mp09e0401.setOnCheckedChangeListener(this);
        mp09e0402.setOnCheckedChangeListener(this);

        mp09e0501.setOnCheckedChangeListener(this);
        mp09e0502.setOnCheckedChangeListener(this);

        mp09e0601.setOnCheckedChangeListener(this);
        mp09e0602.setOnCheckedChangeListener(this);

        mp09e0701.setOnCheckedChangeListener(this);
        mp09e0702.setOnCheckedChangeListener(this);


        mp09e0801.setOnCheckedChangeListener(this);
        mp09e0802.setOnCheckedChangeListener(this);

        mp09e0901.setOnCheckedChangeListener(this);
        mp09e0902.setOnCheckedChangeListener(this);

        mp09e1001.setOnCheckedChangeListener(this);
        mp09e1002.setOnCheckedChangeListener(this);

        mp09e1101.setOnCheckedChangeListener(this);
        mp09e1102.setOnCheckedChangeListener(this);

        mp09e1201.setOnCheckedChangeListener(this);
        mp09e1202.setOnCheckedChangeListener(this);

        mp09e1301.setOnCheckedChangeListener(this);
        mp09e1302.setOnCheckedChangeListener(this);

        mp09e1401.setOnCheckedChangeListener(this);
        mp09e1402.setOnCheckedChangeListener(this);

        mp09e1501.setOnCheckedChangeListener(this);
        mp09e1502.setOnCheckedChangeListener(this);

        mp09e1601.setOnCheckedChangeListener(this);
        mp09e1602.setOnCheckedChangeListener(this);

        mp09e1701.setOnCheckedChangeListener(this);
        mp09e1702.setOnCheckedChangeListener(this);

        mp09e1801.setOnCheckedChangeListener(this);
        mp09e1802.setOnCheckedChangeListener(this);

        mp09e1901.setOnCheckedChangeListener(this);
        mp09e1902.setOnCheckedChangeListener(this);

        mp09e2001.setOnCheckedChangeListener(this);
        mp09e2002.setOnCheckedChangeListener(this);

        mp09e2101.setOnCheckedChangeListener(this);
        mp09e2102.setOnCheckedChangeListener(this);

        mp09e2201.setOnCheckedChangeListener(this);
        mp09e2202.setOnCheckedChangeListener(this);

        mp09e2301.setOnCheckedChangeListener(this);
        mp09e2302.setOnCheckedChangeListener(this);

        mp09e2401.setOnCheckedChangeListener(this);
        mp09e2402.setOnCheckedChangeListener(this);

        mp09e2501.setOnCheckedChangeListener(this);
        mp09e2502.setOnCheckedChangeListener(this);


        mp09e2601.setOnCheckedChangeListener(this);
        mp09e2602.setOnCheckedChangeListener(this);


//endregion


        //region  hasmap

        Hm_Lv.put("mp09e01", lvmp09e01);
        Hm_Lv.put("mp09e02", lvmp09e02);
        Hm_Lv.put("mp09e03", lvmp09e03);
        Hm_Lv.put("mp09e04", lvmp09e04);
        Hm_Lv.put("mp09e05", lvmp09e05);
        Hm_Lv.put("mp09e06", lvmp09e06);
        Hm_Lv.put("mp09e07", lvmp09e07);
        Hm_Lv.put("mp09e08", lvmp09e08);
        Hm_Lv.put("mp09e09", lvmp09e09);
        Hm_Lv.put("mp09e10", lvmp09e10);
        Hm_Lv.put("mp09e11", lvmp09e11);
        Hm_Lv.put("mp09e12", lvmp09e12);
        Hm_Lv.put("mp09e13", lvmp09e13);
        Hm_Lv.put("mp09e14", lvmp09e14);
        Hm_Lv.put("mp09e15", lvmp09e15);
        Hm_Lv.put("mp09e16", lvmp09e16);
        Hm_Lv.put("mp09e17", lvmp09e17);
        Hm_Lv.put("mp09e18", lvmp09e18);
        Hm_Lv.put("mp09e19", lvmp09e19);
        Hm_Lv.put("mp09e20", lvmp09e20);
        Hm_Lv.put("mp09e21", lvmp09e21);
        Hm_Lv.put("mp09e22", lvmp09e22);
        Hm_Lv.put("mp09e23", lvmp09e23);
        Hm_Lv.put("mp09e24", lvmp09e24);
        Hm_Lv.put("mp09e25", lvmp09e25);
        Hm_Lv.put("mp09e26", lvmp09e26);


        //endregion

        btn_Continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                boolean ff = checvalidation(lvmain);


                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmain) == false) {
                    return;
                }


                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e01) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e02) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e03) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e04) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e05) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e06) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e07) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e08) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e09) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e10) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e11) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e12) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e13) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e14) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e15) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e16) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e17) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e18) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e19) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e20) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e21) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e22) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e23) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e24) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e25) == false) {
                    return;
                }
                if (ValidatorClass2.EmptyCheckingContainer(Section9FActivity.this, lvmp09e26) == false) {
                    return;
                }


                if (mp09e06x.getVisibility() == View.VISIBLE) {
                    if (mp09e06x.getText().toString().length() == 0) {
                        mp09e06x.setError("this field is mentadory");
                        mp09e06x.requestFocus();


                        return;
                    } else {
                        int a = Integer.parseInt(mp09e06x.getText().toString());
                        if (a > 90) {
                            mp09e06x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }


                if (mp09e07x.getVisibility() == View.VISIBLE) {
                    if (mp09e07x.getText().toString().length() == 0) {
                        mp09e07x.setError("this field is mentadory");
                        mp09e07x.requestFocus();
                        return;
                    } else {
                        int a = Integer.parseInt(mp09e07x.getText().toString());
                        if (a > 90) {
                            mp09e07x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }


                if (mp09e12x.getVisibility() == View.VISIBLE) {
                    if (mp09e12x.getText().toString().length() == 0) {
                        mp09e12x.setError("this field is mentadory");
                        mp09e12x.requestFocus();
                        return;
                    } else {
                        int a = Integer.parseInt(mp09e12x.getText().toString());
                        if (a > 90) {
                            mp09e12x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }


                if (mp09e13x.getVisibility() == View.VISIBLE) {
                    if (mp09e13x.getText().toString().length() == 0) {
                        mp09e13x.setError("this field is mentadory");
                        mp09e13x.requestFocus();
                        return;
                    } else {
                        int a = Integer.parseInt(mp09e13x.getText().toString());
                        if (a > 90) {
                            mp09e13x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }

                if (mp09e14x.getVisibility() == View.VISIBLE) {
                    if (mp09e14x.getText().toString().length() == 0) {
                        mp09e14x.setError("this field is mentadory");
                        mp09e14x.requestFocus();
                        return;
                    } else {
                        int a = Integer.parseInt(mp09e14x.getText().toString());
                        if (a > 90) {
                            mp09e14x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }

                if (mp09e17x.getVisibility() == View.VISIBLE) {
                    if (mp09e17x.getText().toString().length() == 0) {
                        mp09e17x.setError("this field is mentadory");
                        mp09e17x.requestFocus();
                        return;
                    } else {
                        int a = Integer.parseInt(mp09e17x.getText().toString());
                        if (a > 90) {
                            mp09e17x.setError("Range Error 1 to 90 days");
                            return;
                        }

                    }
                }

                if (mp09e26x.getVisibility() == View.VISIBLE) {
                    if (mp09e26x.getText().toString().length() == 0) {
                        mp09e26x.setError("this field is mentadory");
                        mp09e26x.requestFocus();
                        return;
                    }

                }


                get_data(lvmp09e01);
                get_data(lvmp09e02);
                get_data(lvmp09e03);
                get_data(lvmp09e04);
                get_data(lvmp09e05);
                get_data(lvmp09e06);
                get_data(lvmp09e07);
                get_data(lvmp09e08);
                get_data(lvmp09e09);
                get_data(lvmp09e10);
                get_data(lvmp09e11);
                get_data(lvmp09e12);
                get_data(lvmp09e13);
                get_data(lvmp09e14);
                get_data(lvmp09e15);
                get_data(lvmp09e16);
                get_data(lvmp09e17);
                get_data(lvmp09e18);
                get_data(lvmp09e19);
                get_data(lvmp09e20);
                get_data(lvmp09e21);
                get_data(lvmp09e22);
                get_data(lvmp09e23);
                get_data(lvmp09e24);
                get_data(lvmp09e25);
                get_data(lvmp09e26);


                try {
                    saveDrafts();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (updateDB()) {
                    finish();
                    startActivity(new Intent(Section9FActivity.this, EndingActivity.class)
                            .putExtra("complete", true));

                } else {
                    Toast.makeText(Section9FActivity.this, "Error in updating DB", Toast.LENGTH_SHORT).show();
                }


            }

        });

    }

    private boolean updateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates9F();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {


        String id = compoundButton.getResources().getResourceName(compoundButton.getId());
        String lst6 = id.substring(Math.max(id.length() - 9, 0));
        String lst2 = id.substring(Math.max(id.length() - 3, 0));
        String lst8 = removeLastChar(lst6);


        if (compoundButton.getId() == R.id.mp09e0101) {
            if (mp09e0101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0102) {
            if (mp09e0102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e0201) {
            if (mp09e0201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0202) {
            if (mp09e0202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e0301) {
            if (mp09e0301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0302) {
            if (mp09e0302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp09e0401) {
            if (mp09e0401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0402) {
            if (mp09e0402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e0501) {
            if (mp09e0501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0502) {
            if (mp09e0502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e0601) {
            if (mp09e0601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

                mp09e06x.setText("");
                mp09e06x.setVisibility(View.VISIBLE);
            }
        }


        if (compoundButton.getId() == R.id.mp09e0602) {
            if (mp09e0602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

                mp09e06x.setText("");
                mp09e06x.setVisibility(View.GONE);

            }
        }

        if (compoundButton.getId() == R.id.mp09e0701) {
            if (mp09e0701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

                mp09e07x.setText("");
                mp09e07x.setVisibility(View.VISIBLE);

            }
        }


        if (compoundButton.getId() == R.id.mp09e0702) {
            if (mp09e0702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

                mp09e07x.setText("");
                mp09e07x.setVisibility(View.GONE);

            }
        }

        if (compoundButton.getId() == R.id.mp09e0801) {
            if (mp09e0801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0802) {
            if (mp09e0802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp09e0901) {
            if (mp09e0901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e0902) {
            if (mp09e0902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e1001) {
            if (mp09e1001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1002) {
            if (mp09e1002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp09e1101) {
            if (mp09e1101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1102) {
            if (mp09e1102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp09e1201) {
            if (mp09e1201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));


                mp09e12x.setText("");
                mp09e12x.setVisibility(View.VISIBLE);

            }
        }


        if (compoundButton.getId() == R.id.mp09e1202) {
            if (mp09e1202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

                mp09e12x.setText("");
                mp09e12x.setVisibility(View.GONE);

            }
        }

        if (compoundButton.getId() == R.id.mp09e1301) {
            if (mp09e1301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

                mp09e13x.setText("");
                mp09e13x.setVisibility(View.VISIBLE);


            }
        }


        if (compoundButton.getId() == R.id.mp09e1302) {
            if (mp09e1302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

                mp09e13x.setText("");
                mp09e13x.setVisibility(View.GONE);

            }
        }

        if (compoundButton.getId() == R.id.mp09e1401) {
            if (mp09e1401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

                mp09e14x.setText("");
                mp09e14x.setVisibility(View.VISIBLE);


            }
        }


        if (compoundButton.getId() == R.id.mp09e1402) {
            if (mp09e1402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

                mp09e14x.setText("");
                mp09e14x.setVisibility(View.GONE);

            }
        }

        if (compoundButton.getId() == R.id.mp09e1501) {
            if (mp09e1501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1502) {
            if (mp09e1502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp09e1601) {
            if (mp09e1601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1602) {
            if (mp09e1602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e1701) {
            if (mp09e1701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

                mp09e17x.setText("");
                mp09e17x.setVisibility(View.VISIBLE);

            }
        }


        if (compoundButton.getId() == R.id.mp09e1702) {
            if (mp09e1702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();


                mp09e17x.setText("");
                mp09e17x.setVisibility(View.GONE);
            }
        }

        if (compoundButton.getId() == R.id.mp09e1801) {
            if (mp09e1801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1802) {
            if (mp09e1802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e1901) {
            if (mp09e1901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e1902) {
            if (mp09e1902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2001) {
            if (mp09e2001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2002) {
            if (mp09e2002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2101) {
            if (mp09e2101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2102) {
            if (mp09e2102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2201) {
            if (mp09e2201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2202) {
            if (mp09e2202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2301) {
            if (mp09e2301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2302) {
            if (mp09e2302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2401) {
            if (mp09e2401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2402) {
            if (mp09e2402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2501) {
            if (mp09e2501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2502) {
            if (mp09e2502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp09e2601) {
            if (mp09e2601.isChecked()) {
                // Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                //   showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp09e2602) {
            if (mp09e2602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                // compoundButton.requestFocus();

            }
        }


    }

    public void get_data(final LinearLayout v) {

        mp090 obj_mp09e0 = new mp090();
        String id = v.getResources().getResourceName(v.getId());
        String lst6 = id.substring(Math.max(id.length() - 9, 0));
        String vname = lst6;
        if (v.getChildCount() == 0) {
            obj_mp09e0.mp09eh2a = "0";
            obj_mp09e0.mp09eh2b = "0";
            obj_mp09e0.mp09eh2c = "0";
            obj_mp09e0.mp09eh3 = "0";
            obj_mp09e0.mp09eh4 = "0";
            obj_mp09e0.mp09eh5 = "0";
            obj_mp09e0.mp09eh407x = "0";
            HMmp09e0.put(vname, obj_mp09e0);

            return;
        }


        final CheckBox mp09eh2a, mp09eh2b, mp09eh2c;
        final RadioButton
                mp09eh301,
                mp09eh302,
                mp09eh401,
                mp09eh402,
                mp09eh403,
                mp09eh404,
                mp09eh405,
                mp09eh406,
                mp09eh407;
        final EditText mp09eh407x,
                mp09eh5;

        Button btn_End, btn_Continue;

        mp09eh2a = v.findViewById(R.id.mp09eh2a);
        mp09eh2b = v.findViewById(R.id.mp09eh2b);
        mp09eh2c = v.findViewById(R.id.mp09eh2c);

        mp09eh301 = v.findViewById(R.id.mp09eh301);
        mp09eh302 = v.findViewById(R.id.mp09eh302);
        mp09eh401 = v.findViewById(R.id.mp09eh401);
        mp09eh402 = v.findViewById(R.id.mp09eh402);
        mp09eh403 = v.findViewById(R.id.mp09eh403);
        mp09eh404 = v.findViewById(R.id.mp09eh404);
        mp09eh405 = v.findViewById(R.id.mp09eh405);
        mp09eh406 = v.findViewById(R.id.mp09eh406);
        mp09eh407 = v.findViewById(R.id.mp09eh407);

        mp09eh407x = v.findViewById(R.id.mp09eh407x);
        mp09eh5 = v.findViewById(R.id.mp09eh5);


        if (mp09eh2a.isChecked()) {
            obj_mp09e0.mp09eh2a = "1";
        } else {
            obj_mp09e0.mp09eh2a = "0";
        }
        if (mp09eh2b.isChecked()) {
            obj_mp09e0.mp09eh2b = "1";
        } else {
            obj_mp09e0.mp09eh2b = "0";
        }
        if (mp09eh2c.isChecked()) {
            obj_mp09e0.mp09eh2c = "1";
        } else {
            obj_mp09e0.mp09eh2c = "0";
        }


        if (mp09eh301.isChecked()) {
            obj_mp09e0.mp09eh3 = "1";
        }
        if (mp09eh302.isChecked()) {
            obj_mp09e0.mp09eh3 = "2";
        }


        if (mp09eh401.isChecked()) {
            obj_mp09e0.mp09eh4 = "1";
        }
        if (mp09eh402.isChecked()) {
            obj_mp09e0.mp09eh4 = "2";
        }
        if (mp09eh403.isChecked()) {
            obj_mp09e0.mp09eh4 = "3";
        }
        if (mp09eh404.isChecked()) {
            obj_mp09e0.mp09eh4 = "4";
        }
        if (mp09eh405.isChecked()) {
            obj_mp09e0.mp09eh4 = "5";
        }
        if (mp09eh406.isChecked()) {
            obj_mp09e0.mp09eh4 = "6";
        }
        if (mp09eh407.isChecked()) {
            obj_mp09e0.mp09eh4 = "7";

            if (!mp09eh407x.getText().toString().isEmpty()) {
                obj_mp09e0.mp09eh407x = mp09eh407x.getText().toString();
            } else {
                obj_mp09e0.mp09eh407x = "0";
            }


        } else {
            obj_mp09e0.mp09eh407x = "0";
        }

        if (!mp09eh5.getText().toString().isEmpty()) {
            obj_mp09e0.mp09eh5 = mp09eh5.getText().toString();
        }

        HMmp09e0.put(vname, obj_mp09e0);


        int a = 0;


    }

    public void showLV(final String vname, LinearLayout lv) {
        // final AlertDialog b = new AlertDialog.Builder(this).create();


        LayoutInflater layoutInflater = getLayoutInflater();
        View v = layoutInflater.inflate(R.layout.alertdialogue, null);
        lv.addView(v);
        // b.setView(v);
        // b.show();
        // b.setCancelable(false);


        CheckBox mp09eh2a, mp09eh2b, mp09eh2c;
        final LinearLayout mp09eh4lv, mp09eh5lv;
        final RadioButton
                mp09eh301,
                mp09eh302,
                mp09eh401,
                mp09eh402,
                mp09eh403,
                mp09eh404,
                mp09eh405,
                mp09eh406,
                mp09eh407;
        final EditText mp09eh407x,
                mp09eh5;

        Button btn_End, btn_Continue;
        mp09eh4lv = v.findViewById(R.id.mp09eh4lv);
        mp09eh5lv = v.findViewById(R.id.mp09eh5lv);

        mp09eh2a = v.findViewById(R.id.mp09eh2a);
        mp09eh2b = v.findViewById(R.id.mp09eh2b);
        mp09eh2c = v.findViewById(R.id.mp09eh2c);

        mp09eh301 = v.findViewById(R.id.mp09eh301);
        mp09eh302 = v.findViewById(R.id.mp09eh302);
        mp09eh401 = v.findViewById(R.id.mp09eh401);
        mp09eh402 = v.findViewById(R.id.mp09eh402);
        mp09eh403 = v.findViewById(R.id.mp09eh403);
        mp09eh404 = v.findViewById(R.id.mp09eh404);
        mp09eh405 = v.findViewById(R.id.mp09eh405);
        mp09eh406 = v.findViewById(R.id.mp09eh406);
        mp09eh407 = v.findViewById(R.id.mp09eh407);

        mp09eh407x = v.findViewById(R.id.mp09eh407x);
        mp09eh5 = v.findViewById(R.id.mp09eh5);


        mp09eh407.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp09eh407x.setVisibility(View.VISIBLE);

                } else {
                    mp09eh407x.setVisibility(View.GONE);
                    mp09eh407x.setText("");
                }
            }
        });

        mp09eh301.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp09eh4lv.setVisibility(View.VISIBLE);
                    mp09eh5lv.setVisibility(View.VISIBLE);
                } else {
                    mp09eh4lv.setVisibility(View.GONE);
                    mp09eh5lv.setVisibility(View.GONE);


                    mp09eh401.setChecked(false);
                    mp09eh402.setChecked(false);
                    mp09eh403.setChecked(false);
                    mp09eh404.setChecked(false);
                    mp09eh405.setChecked(false);
                    mp09eh406.setChecked(false);
                    mp09eh407.setChecked(false);
                    mp09eh407x.setText("");
                    mp09eh5.setText("");


                }
            }
        });
        mp09eh302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp09eh4lv.setVisibility(View.GONE);
                    mp09eh5lv.setVisibility(View.GONE);

                    mp09eh401.setChecked(false);
                    mp09eh402.setChecked(false);
                    mp09eh403.setChecked(false);
                    mp09eh404.setChecked(false);
                    mp09eh405.setChecked(false);
                    mp09eh406.setChecked(false);
                    mp09eh407.setChecked(false);
                    mp09eh407x.setText("");
                    mp09eh5.setText("");
                } else {


                    mp09eh4lv.setVisibility(View.VISIBLE);
                    mp09eh5lv.setVisibility(View.VISIBLE);

                }
            }
        });

    }

    @Override
    public void onBackPressed() {
        // Do Here what ever you want do on back press;
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public boolean checvalidation(LinearLayout lv) {

        /// Checkbox Celar*************************************


        for (int i = 0, count = lv.getChildCount(); i < count; ++i) {
            View view = lv.getChildAt(i);

            if (view instanceof RadioGroup) {
                int id = ((RadioGroup) view).getCheckedRadioButtonId();
                if (id == -1) {
                    view.requestFocus();

                    Toast.makeText(Section9FActivity.this, "Radio Button: Some filed are missing", Toast.LENGTH_LONG).show();

                    return false;
                }

            }
            if (view instanceof LinearLayout) {
                //  Boolean lvb=check_get_data(((LinearLayout)view));


            }


        }

        return true;


    }

    public void saveDrafts() throws JSONException {
        JSONObject form6 = new JSONObject();
        String mp09eh2a;
        String mp09eh2b;
        String mp09eh2c;


        String mp09eh3;
        String mp09eh4;
        String mp09eh407x;

        String mp09eh5;

        for (Map.Entry<String, mp090> entry : HMmp09e0.entrySet()) {
            String key = entry.getKey();
            mp090 obj_mp090 = entry.getValue();

            mp09eh2a = obj_mp090.mp09eh2a;
            mp09eh2b = obj_mp090.mp09eh2b;
            mp09eh2c = obj_mp090.mp09eh2c;
            mp09eh3 = obj_mp090.mp09eh3;
            mp09eh4 = obj_mp090.mp09eh4;
            mp09eh407x = obj_mp090.mp09eh407x;
            mp09eh5 = obj_mp090.mp09eh5;

            key = key.substring(2);

            // form6.put(key + "02a", mp09eh2a);
            // form6.put(key + "02b", mp09eh2b);
            // form6.put(key + "02c", mp09eh2c);

            form6.put(key + "03", mp09eh3);
            form6.put(key + "04", mp09eh4);
            form6.put(key + "04x", mp09eh407x);
            form6.put(key + "05", mp09eh5);


        }

        form6.put("mp08g01", mp09e0101.isChecked() ? "1" : mp09e0102.isChecked() ? "2" : "0");
        form6.put("mp08g02", mp09e0201.isChecked() ? "1" : mp09e0202.isChecked() ? "2" : "0");
        form6.put("mp08g03", mp09e0301.isChecked() ? "1" : mp09e0302.isChecked() ? "2" : "0");
        form6.put("mp08g04", mp09e0401.isChecked() ? "1" : mp09e0402.isChecked() ? "2" : "0");
        form6.put("mp08g05", mp09e0501.isChecked() ? "1" : mp09e0502.isChecked() ? "2" : "0");
        form6.put("mp08g06", mp09e0601.isChecked() ? "1" : mp09e0602.isChecked() ? "2" : "0");
        form6.put("mp08g06x", mp09e06x.getText().toString());
        form6.put("mp08g07", mp09e0701.isChecked() ? "1" : mp09e0702.isChecked() ? "2" : "0");
        form6.put("mp08g07x", mp09e07x.getText().toString());
        form6.put("mp08g08", mp09e0801.isChecked() ? "1" : mp09e0802.isChecked() ? "2" : "0");
        form6.put("mp08g09", mp09e0901.isChecked() ? "1" : mp09e0902.isChecked() ? "2" : "0");
        form6.put("mp08g10", mp09e1001.isChecked() ? "1" : mp09e1002.isChecked() ? "2" : "0");
        form6.put("mp08g11", mp09e1101.isChecked() ? "1" : mp09e1102.isChecked() ? "2" : "0");
        form6.put("mp08g12", mp09e1201.isChecked() ? "1" : mp09e1202.isChecked() ? "2" : "0");
        form6.put("mp08g12x", mp09e12x.getText().toString());
        form6.put("mp08g13", mp09e1301.isChecked() ? "1" : mp09e1302.isChecked() ? "2" : "0");
        form6.put("mp08g13x", mp09e13x.getText().toString());
        form6.put("mp08g14", mp09e1401.isChecked() ? "1" : mp09e1402.isChecked() ? "2" : "0");
        form6.put("mp08g14x", mp09e14x.getText().toString());
        form6.put("mp08g15", mp09e1501.isChecked() ? "1" : mp09e1502.isChecked() ? "2" : "0");
        form6.put("mp08g16", mp09e1601.isChecked() ? "1" : mp09e1602.isChecked() ? "2" : "0");
        form6.put("mp08g17", mp09e1701.isChecked() ? "1" : mp09e1702.isChecked() ? "2" : "0");
        form6.put("mp08g17x", mp09e17x.getText().toString());
        form6.put("mp08g18", mp09e1801.isChecked() ? "1" : mp09e1802.isChecked() ? "2" : "0");
        form6.put("mp08g19", mp09e1901.isChecked() ? "1" : mp09e1902.isChecked() ? "2" : "0");
        form6.put("mp08g20", mp09e2001.isChecked() ? "1" : mp09e2002.isChecked() ? "2" : "0");
        form6.put("mp08g21", mp09e2101.isChecked() ? "1" : mp09e2102.isChecked() ? "2" : "0");
        form6.put("mp08g22", mp09e2201.isChecked() ? "1" : mp09e2202.isChecked() ? "2" : "0");
        form6.put("mp08g23", mp09e2301.isChecked() ? "1" : mp09e2302.isChecked() ? "2" : "0");
        form6.put("mp08g24", mp09e2401.isChecked() ? "1" : mp09e2402.isChecked() ? "2" : "0");
        form6.put("mp08g25", mp09e2501.isChecked() ? "1" : mp09e2502.isChecked() ? "2" : "0");
        form6.put("mp08g26", mp09e26x.getText().toString());


        AppMain.fc.setS9F(String.valueOf(form6));


    }

}

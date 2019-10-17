package edu.aku.hassannaqvi.mappsform8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
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

import com.edittextpicker.aliazaz.EditTextPicker;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.core.AppMain;
import edu.aku.hassannaqvi.mappsform8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivityForm6Section4Binding;
import edu.aku.hassannaqvi.mappsform8.other.mp060;
import edu.aku.hassannaqvi.mappsform8.validation.ValidatorClass;

public class Form6Section4Activity extends AppCompatActivity implements RadioButton.OnCheckedChangeListener {

    HashMap<String, mp060> HMmp06d0 = new HashMap<>();

    ActivityForm6Section4Binding bi;

    HashMap<String, LinearLayout> Hm_Lv = new HashMap<>();


    //endregion

    private static String removeLastChar(String str) {
        return str.substring(0, str.length() - 2);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_form6_section4);

        bi.mp06d0101.setOnCheckedChangeListener(this);

        bi.mp06d0102.setOnCheckedChangeListener(this);
        bi.mp06d0201.setOnCheckedChangeListener(this);
        bi.mp06d0202.setOnCheckedChangeListener(this);
        bi.mp06d0301.setOnCheckedChangeListener(this);
        bi.mp06d0302.setOnCheckedChangeListener(this);
        bi.mp06d0401.setOnCheckedChangeListener(this);
        bi.mp06d0402.setOnCheckedChangeListener(this);
        bi.mp06d0501.setOnCheckedChangeListener(this);
        bi.mp06d0502.setOnCheckedChangeListener(this);
        bi.mp06d0601.setOnCheckedChangeListener(this);
        bi.mp06d0602.setOnCheckedChangeListener(this);
        bi.mp06d0701.setOnCheckedChangeListener(this);
        bi.mp06d0702.setOnCheckedChangeListener(this);
        bi.mp06d0801.setOnCheckedChangeListener(this);
        bi.mp06d0802.setOnCheckedChangeListener(this);
        bi.mp06d0901.setOnCheckedChangeListener(this);
        bi.mp06d0902.setOnCheckedChangeListener(this);
        bi.mp06d1001.setOnCheckedChangeListener(this);
        bi.mp06d1002.setOnCheckedChangeListener(this);
        bi.mp06d1101.setOnCheckedChangeListener(this);
        bi.mp06d1102.setOnCheckedChangeListener(this);
        bi.mp06d1201.setOnCheckedChangeListener(this);
        bi.mp06d1202.setOnCheckedChangeListener(this);
        bi.mp06d1301.setOnCheckedChangeListener(this);
        bi.mp06d1302.setOnCheckedChangeListener(this);
        bi.mp06d1401.setOnCheckedChangeListener(this);
        bi.mp06d1402.setOnCheckedChangeListener(this);
        bi.mp06d1501.setOnCheckedChangeListener(this);
        bi.mp06d1502.setOnCheckedChangeListener(this);
        bi.mp06d1601.setOnCheckedChangeListener(this);
        bi.mp06d1602.setOnCheckedChangeListener(this);
        bi.mp06d1701.setOnCheckedChangeListener(this);
        bi.mp06d1702.setOnCheckedChangeListener(this);
        bi.mp06d1801.setOnCheckedChangeListener(this);
        bi.mp06d1802.setOnCheckedChangeListener(this);
        bi.mp06d1901.setOnCheckedChangeListener(this);
        bi.mp06d1902.setOnCheckedChangeListener(this);
        bi.mp06d2001.setOnCheckedChangeListener(this);
        bi.mp06d2002.setOnCheckedChangeListener(this);
        bi.mp06d2101.setOnCheckedChangeListener(this);
        bi.mp06d2102.setOnCheckedChangeListener(this);
        bi.mp06d2201.setOnCheckedChangeListener(this);
        bi.mp06d2202.setOnCheckedChangeListener(this);
        bi.mp06d2301.setOnCheckedChangeListener(this);
        bi.mp06d2302.setOnCheckedChangeListener(this);
        bi.mp06d2401.setOnCheckedChangeListener(this);
        bi.mp06d2402.setOnCheckedChangeListener(this);
        bi.mp06d2501.setOnCheckedChangeListener(this);
        bi.mp06d2502.setOnCheckedChangeListener(this);
        bi.mp06d2601.setOnCheckedChangeListener(this);
        bi.mp06d2602.setOnCheckedChangeListener(this);
        bi.mp06d2701.setOnCheckedChangeListener(this);
        bi.mp06d2702.setOnCheckedChangeListener(this);
        bi.mp06d2801.setOnCheckedChangeListener(this);
        bi.mp06d2802.setOnCheckedChangeListener(this);
        bi.mp06d2901.setOnCheckedChangeListener(this);
        bi.mp06d2902.setOnCheckedChangeListener(this);
        bi.mp06d3001.setOnCheckedChangeListener(this);
        bi.mp06d3002.setOnCheckedChangeListener(this);
        bi.mp06d3101.setOnCheckedChangeListener(this);
        bi.mp06d3102.setOnCheckedChangeListener(this);
        bi.mp06d3201.setOnCheckedChangeListener(this);
        bi.mp06d3202.setOnCheckedChangeListener(this);


//endregion


        //region  hasmap

        Hm_Lv.put("mp08d01", bi.lvmp06d01);
        Hm_Lv.put("mp08d02", bi.lvmp06d02);
        Hm_Lv.put("mp08d03", bi.lvmp06d03);
        Hm_Lv.put("mp08d04", bi.lvmp06d04);
        Hm_Lv.put("mp08d05", bi.lvmp06d05);
        Hm_Lv.put("mp08d06", bi.lvmp06d06);
        Hm_Lv.put("mp08d07", bi.lvmp06d07);
        Hm_Lv.put("mp08d08", bi.lvmp06d08);
        Hm_Lv.put("mp08d09", bi.lvmp06d09);
        Hm_Lv.put("mp08d10", bi.lvmp06d10);
        Hm_Lv.put("mp08d11", bi.lvmp06d11);
        Hm_Lv.put("mp08d12", bi.lvmp06d12);
        Hm_Lv.put("mp08d13", bi.lvmp06d13);
        Hm_Lv.put("mp08d14", bi.lvmp06d14);
        Hm_Lv.put("mp08d15", bi.lvmp06d15);
        Hm_Lv.put("mp08d16", bi.lvmp06d16);
        Hm_Lv.put("mp08d17", bi.lvmp06d17);
        Hm_Lv.put("mp08d18", bi.lvmp06d18);
        Hm_Lv.put("mp08d19", bi.lvmp06d19);
        Hm_Lv.put("mp08d20", bi.lvmp06d20);
        Hm_Lv.put("mp08d21", bi.lvmp06d21);
        Hm_Lv.put("mp08d22", bi.lvmp06d22);
        Hm_Lv.put("mp08d23", bi.lvmp06d23);
        Hm_Lv.put("mp08d24", bi.lvmp06d24);
        Hm_Lv.put("mp08d25", bi.lvmp06d25);
        Hm_Lv.put("mp08d26", bi.lvmp06d26);
        Hm_Lv.put("mp08d27", bi.lvmp06d27);
        Hm_Lv.put("mp08d28", bi.lvmp06d28);
        Hm_Lv.put("mp08d29", bi.lvmp06d29);
        Hm_Lv.put("mp08d30", bi.lvmp06d30);
        Hm_Lv.put("mp08d31", bi.lvmp06d31);
        Hm_Lv.put("mp08d32", bi.lvmp06d32);

        //endregion

        bi.btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                boolean ff = checvalidation(bi.lvmain);


                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmain) == false) {
                    return;
                }
                if (bi.mp06d0601.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d0601x, getString(R.string.mp06d06))) {
                        return;
                    }
                }
                if (bi.mp06d0701.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d0701x, getString(R.string.mp06d07))) {
                        return;
                    }
                }
                if (bi.mp06d1201.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d1201x, getString(R.string.mp06d12))) {
                        return;
                    }
                }
                if (bi.mp06d1301.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d1301x, getString(R.string.mp06d13))) {
                        return;
                    }
                }
                if (bi.mp06d1401.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d1401x, getString(R.string.mp06d14))) {
                        return;
                    }
                }
                if (bi.mp06d1701.isChecked()) {
                    if (!ValidatorClass.EmptyTextBox(Form6Section4Activity.this, bi.mp06d1701x, getString(R.string.mp06d17))) {
                        return;
                    }
                }

                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d01) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d02) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d03) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d04) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d05) == false) {
                    return;
                }

                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d06) == false) {
                    return;
                }

                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d07) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d08) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d09) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d10) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d11) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d12) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d13) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d14) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d15) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d16) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d17) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d18) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d19) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d20) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d21) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d22) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d23) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d24) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d25) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d26) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d27) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d28) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d29) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d30) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d31) == false) {
                    return;
                }
                if (ValidatorClass.EmptyCheckingContainer(Form6Section4Activity.this, bi.lvmp06d32) == false) {
                    return;
                }


                get_data(bi.lvmp06d01);
                get_data(bi.lvmp06d02);
                get_data(bi.lvmp06d03);
                get_data(bi.lvmp06d04);
                get_data(bi.lvmp06d05);
                get_data(bi.lvmp06d06);
                get_data(bi.lvmp06d07);
                get_data(bi.lvmp06d08);
                get_data(bi.lvmp06d09);
                get_data(bi.lvmp06d10);
                get_data(bi.lvmp06d11);
                get_data(bi.lvmp06d12);
                get_data(bi.lvmp06d13);
                get_data(bi.lvmp06d14);
                get_data(bi.lvmp06d15);
                get_data(bi.lvmp06d16);
                get_data(bi.lvmp06d17);
                get_data(bi.lvmp06d18);
                get_data(bi.lvmp06d19);
                get_data(bi.lvmp06d20);
                get_data(bi.lvmp06d21);
                get_data(bi.lvmp06d22);
                get_data(bi.lvmp06d23);
                get_data(bi.lvmp06d24);
                get_data(bi.lvmp06d25);
                get_data(bi.lvmp06d26);
                get_data(bi.lvmp06d27);
                get_data(bi.lvmp06d28);
                get_data(bi.lvmp06d29);
                get_data(bi.lvmp06d30);
                get_data(bi.lvmp06d31);
                get_data(bi.lvmp06d32);


                try {
                    saveDrafts();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                if (updateDB()) {
                    startActivity(new Intent(Form6Section4Activity.this, EndingActivity.class)
                            .putExtra("complete", true));

                } else {
                    Toast.makeText(Form6Section4Activity.this, "Error in updating DB", Toast.LENGTH_SHORT).show();
                }


            }

        });

    }

    private boolean updateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesG();

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


        if (compoundButton.getId() == R.id.mp06d0101) {
            if (bi.mp06d0101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0102) {
            if (bi.mp06d0102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0201) {
            if (bi.mp06d0201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0202) {
            if (bi.mp06d0202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0301) {
            if (bi.mp06d0301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0302) {
            if (bi.mp06d0302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp06d0401) {
            if (bi.mp06d0401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0402) {
            if (bi.mp06d0402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0501) {
            if (bi.mp06d0501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0502) {
            if (bi.mp06d0502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0601) {
            if (bi.mp06d0601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d0601x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0602) {
            if (bi.mp06d0602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                bi.mp06d0601x.setVisibility(View.GONE);
                bi.mp06d0601x.setText(null);
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0701) {
            if (bi.mp06d0701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d0701x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0702) {
            if (bi.mp06d0702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                bi.mp06d0701x.setVisibility(View.GONE);
                bi.mp06d0701x.setText(null);
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d0801) {
            if (bi.mp06d0801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0802) {
            if (bi.mp06d0802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp06d0901) {
            if (bi.mp06d0901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d0902) {
            if (bi.mp06d0902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1001) {
            if (bi.mp06d1001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1002) {
            if (bi.mp06d1002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }
        if (compoundButton.getId() == R.id.mp06d1101) {
            if (bi.mp06d1101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1102) {
            if (bi.mp06d1102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp06d1201) {
            if (bi.mp06d1201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d1201x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1202) {
            if (bi.mp06d1202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                bi.mp06d1201x.setVisibility(View.GONE);
                bi.mp06d1201x.setText(null);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1301) {
            if (bi.mp06d1301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d1301x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1302) {
            if (bi.mp06d1302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                bi.mp06d1301x.setVisibility(View.GONE);
                bi.mp06d1301x.setText(null);

                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1401) {
            if (bi.mp06d1401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d1401x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1402) {
            if (bi.mp06d1402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                bi.mp06d1401x.setVisibility(View.GONE);
                bi.mp06d1401x.setText(null);
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1501) {
            if (bi.mp06d1501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1502) {
            if (bi.mp06d1502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


        if (compoundButton.getId() == R.id.mp06d1601) {
            if (bi.mp06d1601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1602) {
            if (bi.mp06d1602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1701) {
            if (bi.mp06d1701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);
                bi.mp06d1701x.setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1702) {
            if (bi.mp06d1702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                bi.mp06d1701x.setVisibility(View.GONE);
                bi.mp06d1701x.setText(null);
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1801) {
            if (bi.mp06d1801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1802) {
            if (bi.mp06d1802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d1901) {
            if (bi.mp06d1901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d1902) {
            if (bi.mp06d1902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2001) {
            if (bi.mp06d2001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2002) {
            if (bi.mp06d2002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2101) {
            if (bi.mp06d2101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2102) {
            if (bi.mp06d2102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2201) {
            if (bi.mp06d2201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2202) {
            if (bi.mp06d2202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2301) {
            if (bi.mp06d2301.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2302) {
            if (bi.mp06d2302.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2401) {
            if (bi.mp06d2401.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2402) {
            if (bi.mp06d2402.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2501) {
            if (bi.mp06d2501.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2502) {
            if (bi.mp06d2502.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2601) {
            if (bi.mp06d2601.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2602) {
            if (bi.mp06d2602.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2701) {
            if (bi.mp06d2701.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2702) {
            if (bi.mp06d2702.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2801) {
            if (bi.mp06d2801.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2802) {
            if (bi.mp06d2802.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d2901) {
            if (bi.mp06d2901.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d2902) {
            if (bi.mp06d2902.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3001) {
            if (bi.mp06d3001.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3002) {
            if (bi.mp06d3002.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3101) {
            if (bi.mp06d3101.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3102) {
            if (bi.mp06d3102.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }

        if (compoundButton.getId() == R.id.mp06d3201) {
            if (bi.mp06d3201.isChecked()) {
                Hm_Lv.get(lst8).setVisibility(View.VISIBLE);

                showLV(lst6, Hm_Lv.get(lst8));

            }
        }


        if (compoundButton.getId() == R.id.mp06d3202) {
            if (bi.mp06d3202.isChecked()) {
                Hm_Lv.get(lst8).removeAllViews();
                // Hm_Lv.get(lst8).setVisibility(View.GONE);
                compoundButton.requestFocus();

            }
        }


    }

    public void get_data(final LinearLayout v) {

        mp060 obj_mp06d0 = new mp060();
        String id = v.getResources().getResourceName(v.getId());
        String lst6 = id.substring(Math.max(id.length() - 9, 0));
        String vname = lst6;
        if (v.getChildCount() == 0) {
            obj_mp06d0.mp06dh2a = "0";
            obj_mp06d0.mp06dh2b = "0";
            obj_mp06d0.mp06dh2c = "0";
            obj_mp06d0.mp06dh3 = "0";
            obj_mp06d0.mp06dh4 = "0";
            obj_mp06d0.mp06dh5 = "0";
            obj_mp06d0.mp06dh407x = "0";
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
            } else {
                obj_mp06d0.mp06dh407x = "0";
            }


        } else {
            obj_mp06d0.mp06dh407x = "0";
        }

        if (!mp06dh5.getText().toString().isEmpty()) {
            obj_mp06d0.mp06dh5 = mp06dh5.getText().toString();
        }

        HMmp06d0.put(vname, obj_mp06d0);


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


        CheckBox mp06dh2a, mp06dh2b, mp06dh2c;
        final LinearLayout mp06dh4lv, mp06dh5lv;
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
        mp06dh4lv = v.findViewById(R.id.mp06dh4lv);
        mp06dh5lv = v.findViewById(R.id.mp06dh5lv);

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
                    mp06dh407x.setText(null);
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
                    edu.aku.hassannaqvi.mapps_form6.validation.ClearClass.ClearAllFields(mp06dh4lv, null);
                    edu.aku.hassannaqvi.mapps_form6.validation.ClearClass.ClearAllFields(mp06dh5lv, null);

                }
            }
        });
        mp06dh302.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    mp06dh4lv.setVisibility(View.GONE);
                    mp06dh5lv.setVisibility(View.GONE);
                    edu.aku.hassannaqvi.mapps_form6.validation.ClearClass.ClearAllFields(mp06dh4lv, null);
                    edu.aku.hassannaqvi.mapps_form6.validation.ClearClass.ClearAllFields(mp06dh5lv, null);
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

    public void saveDrafts() throws JSONException {
        JSONObject form6 = new JSONObject();
        String mp06dh2a;
        String mp06dh2b;
        String mp06dh2c;


        String mp06dh3;
        String mp06dh4;
        String mp06dh407x;

        String mp06dh5;

        for (Map.Entry<String, mp060> entry : HMmp06d0.entrySet()) {
            String key = entry.getKey();
            mp060 obj_mp060 = entry.getValue();

            mp06dh2a = obj_mp060.mp06dh2a;
            mp06dh2b = obj_mp060.mp06dh2b;
            mp06dh2c = obj_mp060.mp06dh2c;
            mp06dh3 = obj_mp060.mp06dh3;
            mp06dh4 = obj_mp060.mp06dh4;
            mp06dh407x = obj_mp060.mp06dh407x;
            mp06dh5 = obj_mp060.mp06dh5;

            key = key.substring(2);

            form6.put(key + "02a", mp06dh2a);
            form6.put(key + "02b", mp06dh2b);
            form6.put(key + "02c", mp06dh2c);

            form6.put(key + "03", mp06dh3);
            form6.put(key + "04", mp06dh4);
            form6.put(key + "04x", mp06dh407x);
            form6.put(key + "05", mp06dh5);


        }

        form6.put("mp08g01", bi.mp06d0101.isChecked() ? "1" : bi.mp06d0102.isChecked() ? "2" : "0");
        form6.put("mp08g02", bi.mp06d0201.isChecked() ? "1" : bi.mp06d0202.isChecked() ? "2" : "0");
        form6.put("mp08g03", bi.mp06d0301.isChecked() ? "1" : bi.mp06d0302.isChecked() ? "2" : "0");
        form6.put("mp08g04", bi.mp06d0401.isChecked() ? "1" : bi.mp06d0402.isChecked() ? "2" : "0");
        form6.put("mp08g05", bi.mp06d0501.isChecked() ? "1" : bi.mp06d0502.isChecked() ? "2" : "0");
        form6.put("mp08g06", bi.mp06d0601.isChecked() ? "1" : bi.mp06d0602.isChecked() ? "2" : "0");
        form6.put("mp08g06day", bi.mp06d0601x.getText().toString());
        form6.put("mp08g07", bi.mp06d0701.isChecked() ? "1" : bi.mp06d0702.isChecked() ? "2" : "0");
        form6.put("mp08g07day", bi.mp06d0701x.getText().toString());
        form6.put("mp08g08", bi.mp06d0801.isChecked() ? "1" : bi.mp06d0802.isChecked() ? "2" : "0");
        form6.put("mp08g09", bi.mp06d0901.isChecked() ? "1" : bi.mp06d0902.isChecked() ? "2" : "0");
        form6.put("mp08g10", bi.mp06d1001.isChecked() ? "1" : bi.mp06d1002.isChecked() ? "2" : "0");
        form6.put("mp08g11", bi.mp06d1101.isChecked() ? "1" : bi.mp06d1102.isChecked() ? "2" : "0");
        form6.put("mp08g12", bi.mp06d1201.isChecked() ? "1" : bi.mp06d1202.isChecked() ? "2" : "0");
        form6.put("mp08g12day", bi.mp06d1201x.getText().toString());
        form6.put("mp08g13", bi.mp06d1301.isChecked() ? "1" : bi.mp06d1302.isChecked() ? "2" : "0");
        form6.put("mp08g13day", bi.mp06d1301x.getText().toString());
        form6.put("mp08g14", bi.mp06d1401.isChecked() ? "1" : bi.mp06d1402.isChecked() ? "2" : "0");
        form6.put("mp08g14day", bi.mp06d1401x.getText().toString());
        form6.put("mp08g15", bi.mp06d1501.isChecked() ? "1" : bi.mp06d1502.isChecked() ? "2" : "0");
        form6.put("mp08g16", bi.mp06d1601.isChecked() ? "1" : bi.mp06d1602.isChecked() ? "2" : "0");
        form6.put("mp08g17", bi.mp06d1701.isChecked() ? "1" : bi.mp06d1702.isChecked() ? "2" : "0");
        form6.put("mp08g17day", bi.mp06d1701x.getText().toString());
        form6.put("mp08g18", bi.mp06d1801.isChecked() ? "1" : bi.mp06d1802.isChecked() ? "2" : "0");
        form6.put("mp08g19", bi.mp06d1901.isChecked() ? "1" : bi.mp06d1902.isChecked() ? "2" : "0");
        form6.put("mp08g20", bi.mp06d2001.isChecked() ? "1" : bi.mp06d2002.isChecked() ? "2" : "0");
        form6.put("mp08g21", bi.mp06d2101.isChecked() ? "1" : bi.mp06d2102.isChecked() ? "2" : "0");
        form6.put("mp08g22", bi.mp06d2201.isChecked() ? "1" : bi.mp06d2202.isChecked() ? "2" : "0");
        form6.put("mp08g23", bi.mp06d2301.isChecked() ? "1" : bi.mp06d2302.isChecked() ? "2" : "0");
        form6.put("mp08g24", bi.mp06d2401.isChecked() ? "1" : bi.mp06d2402.isChecked() ? "2" : "0");
        form6.put("mp08g25", bi.mp06d2501.isChecked() ? "1" : bi.mp06d2502.isChecked() ? "2" : "0");
        form6.put("mp08g26", bi.mp06d2601.isChecked() ? "1" : bi.mp06d2602.isChecked() ? "2" : "0");
        form6.put("mp08g27", bi.mp06d2701.isChecked() ? "1" : bi.mp06d2702.isChecked() ? "2" : "0");
        form6.put("mp08g28", bi.mp06d2801.isChecked() ? "1" : bi.mp06d2802.isChecked() ? "2" : "0");
        form6.put("mp08g29", bi.mp06d2901.isChecked() ? "1" : bi.mp06d2902.isChecked() ? "2" : "0");
        form6.put("mp08g30", bi.mp06d3001.isChecked() ? "1" : bi.mp06d3002.isChecked() ? "2" : "0");
        form6.put("mp08g31", bi.mp06d3101.isChecked() ? "1" : bi.mp06d3102.isChecked() ? "2" : "0");
        form6.put("mp08g32", bi.mp06d3201.isChecked() ? "1" : bi.mp06d3202.isChecked() ? "2" : "0");

        AppMain.fc.setsG(String.valueOf(form6));


    }

}

package edu.aku.hassannaqvi.mappsform07.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivitySectionCBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class SectionCActivity extends Activity {

    ActivitySectionCBinding bl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_c);

        bl = DataBindingUtil.setContentView(this, R.layout.activity_section_c);

        bl.setCallback(this);
        setupViews();
    }

    public void setupViews() {

        bl.mp08c003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bl.mp08c00377.isChecked() || bl.mp08c00399.isChecked()) {
                    bl.fldGrpmp08c004.setVisibility(View.GONE);
                    bl.mp08c004.clearCheck();
                    bl.mp08c005.clearCheck();
                } else {
                    bl.fldGrpmp08c004.setVisibility(View.VISIBLE);

                }
            }
        });

        if (AppMain.outcome == 1) {
            bl.fldGrpmp08c010.setVisibility(View.GONE);
            bl.mp08c010.clearCheck();
            bl.mp08c01088x.setText(null);
            bl.mp08c011.clearCheck();
            bl.mp08c01188x.setText(null);
            bl.mp08c012.clearCheck();

        } else {
            bl.fldGrpmp08c010.setVisibility(View.VISIBLE);
        }

        bl.mp08c00977.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bl.mp08c009a.setEnabled(false);
                    bl.mp08c009b.setEnabled(false);
                    bl.mp08c009c.setEnabled(false);
                    bl.mp08c009d.setEnabled(false);
                    bl.mp08c009e.setEnabled(false);
                    bl.mp08c009f.setEnabled(false);
                    bl.mp08c009g.setEnabled(false);
                    bl.mp08c009h.setEnabled(false);
                    bl.mp08c009i.setEnabled(false);
                    bl.mp08c009j.setEnabled(false);
                    bl.mp08c009k.setEnabled(false);
                    bl.mp08c009l.setEnabled(false);
                    bl.mp08c009m.setEnabled(false);
                    bl.mp08c009n.setEnabled(false);
                    bl.mp08c009o.setEnabled(false);
                    bl.mp08c009p.setEnabled(false);
                    bl.mp08c00988.setEnabled(false);
                    bl.mp08c00999.setEnabled(false);

                    bl.mp08c009a.setChecked(false);
                    bl.mp08c009b.setChecked(false);
                    bl.mp08c009c.setChecked(false);
                    bl.mp08c009d.setChecked(false);
                    bl.mp08c009e.setChecked(false);
                    bl.mp08c009f.setChecked(false);
                    bl.mp08c009g.setChecked(false);
                    bl.mp08c009h.setChecked(false);
                    bl.mp08c009i.setChecked(false);
                    bl.mp08c009j.setChecked(false);
                    bl.mp08c009k.setChecked(false);
                    bl.mp08c009l.setChecked(false);
                    bl.mp08c009m.setChecked(false);
                    bl.mp08c009n.setChecked(false);
                    bl.mp08c009o.setChecked(false);
                    bl.mp08c009p.setChecked(false);
                    bl.mp08c00988.setChecked(false);
                    bl.mp08c00988x.setText(null);
                    bl.mp08c00999.setChecked(false);


                } else {
                    bl.mp08c009a.setEnabled(true);
                    bl.mp08c009b.setEnabled(true);
                    bl.mp08c009c.setEnabled(true);
                    bl.mp08c009d.setEnabled(true);
                    bl.mp08c009e.setEnabled(true);
                    bl.mp08c009f.setEnabled(true);
                    bl.mp08c009g.setEnabled(true);
                    bl.mp08c009h.setEnabled(true);
                    bl.mp08c009i.setEnabled(true);
                    bl.mp08c009j.setEnabled(true);
                    bl.mp08c009k.setEnabled(true);
                    bl.mp08c009l.setEnabled(true);
                    bl.mp08c009m.setEnabled(true);
                    bl.mp08c009n.setEnabled(true);
                    bl.mp08c009o.setEnabled(true);
                    bl.mp08c009p.setEnabled(true);
                    bl.mp08c00988.setEnabled(true);
                    bl.mp08c00999.setEnabled(true);
                }
            }
        });

        bl.mp08c00999.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    bl.mp08c009a.setEnabled(false);
                    bl.mp08c009b.setEnabled(false);
                    bl.mp08c009c.setEnabled(false);
                    bl.mp08c009d.setEnabled(false);
                    bl.mp08c009e.setEnabled(false);
                    bl.mp08c009f.setEnabled(false);
                    bl.mp08c009g.setEnabled(false);
                    bl.mp08c009h.setEnabled(false);
                    bl.mp08c009i.setEnabled(false);
                    bl.mp08c009j.setEnabled(false);
                    bl.mp08c009k.setEnabled(false);
                    bl.mp08c009l.setEnabled(false);
                    bl.mp08c009m.setEnabled(false);
                    bl.mp08c009n.setEnabled(false);
                    bl.mp08c009o.setEnabled(false);
                    bl.mp08c009p.setEnabled(false);
                    bl.mp08c00988.setEnabled(false);
                    bl.mp08c00977.setEnabled(false);

                    bl.mp08c009a.setChecked(false);
                    bl.mp08c009b.setChecked(false);
                    bl.mp08c009c.setChecked(false);
                    bl.mp08c009d.setChecked(false);
                    bl.mp08c009e.setChecked(false);
                    bl.mp08c009f.setChecked(false);
                    bl.mp08c009g.setChecked(false);
                    bl.mp08c009h.setChecked(false);
                    bl.mp08c009i.setChecked(false);
                    bl.mp08c009j.setChecked(false);
                    bl.mp08c009k.setChecked(false);
                    bl.mp08c009l.setChecked(false);
                    bl.mp08c009m.setChecked(false);
                    bl.mp08c009n.setChecked(false);
                    bl.mp08c009o.setChecked(false);
                    bl.mp08c009p.setChecked(false);
                    bl.mp08c00988.setChecked(false);
                    bl.mp08c00988x.setText(null);
                    bl.mp08c00977.setChecked(false);


                } else {
                    bl.mp08c009a.setEnabled(true);
                    bl.mp08c009b.setEnabled(true);
                    bl.mp08c009c.setEnabled(true);
                    bl.mp08c009d.setEnabled(true);
                    bl.mp08c009e.setEnabled(true);
                    bl.mp08c009f.setEnabled(true);
                    bl.mp08c009g.setEnabled(true);
                    bl.mp08c009h.setEnabled(true);
                    bl.mp08c009i.setEnabled(true);
                    bl.mp08c009j.setEnabled(true);
                    bl.mp08c009k.setEnabled(true);
                    bl.mp08c009l.setEnabled(true);
                    bl.mp08c009m.setEnabled(true);
                    bl.mp08c009n.setEnabled(true);
                    bl.mp08c009o.setEnabled(true);
                    bl.mp08c009p.setEnabled(true);
                    bl.mp08c00988.setEnabled(true);
                    bl.mp08c00977.setEnabled(true);
                }
            }
        });





    }


    public Boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c001, bl.mp08c001a, getString(R.string.mp08c001))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c002, bl.mp08c002a, getString(R.string.mp08c002))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c003, bl.mp08c003a, getString(R.string.mp08c003))) {
            return false;
        }

        if (bl.mp08c003a.isChecked() || bl.mp08c003b.isChecked()) {
            if (!validatorClass.EmptyRadioButton(this, bl.mp08c004, bl.mp08c004a, getString(R.string.mp08c004))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bl.mp08c005, bl.mp08c005a, getString(R.string.mp08c005))) {
                return false;
            }

        }


        if (!validatorClass.EmptyRadioButton(this, bl.mp08c006, bl.mp08c006a, getString(R.string.mp08c006))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c006, bl.mp08c00688, bl.mp08c00688x, getString(R.string.mp08c006) + " - " + getString(R.string.other))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c007, bl.mp08c007a, getString(R.string.mp08c007))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c007, bl.mp08c00788, bl.mp08c00788x, getString(R.string.mp08c007) + " - " + getString(R.string.other))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c008, bl.mp08c008a, getString(R.string.mp08c008))) {
            return false;
        }

        if (!validatorClass.EmptyCheckBox(this, bl.fldGrpchek009, bl.mp08c009a, getString(R.string.mp08c009))) {
            return false;
        }

        if (!validatorClass.EmptyCheckBox(this, bl.fldGrpchek009, bl.mp08c00988, bl.mp08c00988x, getString(R.string.mp08c009) + " - " + getString(R.string.other))) {
            return false;
        }

        if (AppMain.outcome != 1) {
            if (!validatorClass.EmptyRadioButton(this, bl.mp08c010, bl.mp08c010a, getString(R.string.mp08c010))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bl.mp08c010, bl.mp08c01088, bl.mp08c01088x, getString(R.string.mp08c010) + " - " + getString(R.string.other))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bl.mp08c011, bl.mp08c011a, getString(R.string.mp08c011))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bl.mp08c011, bl.mp08c01188, bl.mp08c01188x, getString(R.string.mp08c011) + " - " + getString(R.string.other))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bl.mp08c012, bl.mp08c012a, getString(R.string.mp08c012))) {
                return false;
            }

        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c013, bl.mp08c013a, getString(R.string.mp08c013))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08c014, bl.mp08c014a, getString(R.string.mp08c014))) {
            return false;
        }

        return validatorClass.EmptyRadioButton(this, bl.mp08c015, bl.mp08c015a, getString(R.string.mp08c015));

    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (formValidation()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Ending Section", Toast.LENGTH_SHORT).show();

                finish();

                if (AppMain.outcome == 1 || AppMain.outcome == 2) {
                    startActivity(new Intent(this, SectionEActivity.class).putExtra("complete", false));
                } else {
                    startActivity(new Intent(this, SectionDActivity.class).putExtra("complete", false));
                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sC = new JSONObject();

        sC.put("mp08c001", bl.mp08c001a.isChecked() ? "1"
                : bl.mp08c001b.isChecked() ? "2"
                : bl.mp08c001c.isChecked() ? "3" : "0");

        sC.put("mp08c002", bl.mp08c002a.isChecked() ? "1"
                : bl.mp08c002b.isChecked() ? "2"
                : bl.mp08c00277.isChecked() ? "77"
                : bl.mp08c00299.isChecked() ? "99"
                : "0");


        sC.put("mp08c003", bl.mp08c003a.isChecked() ? "1"
                : bl.mp08c003b.isChecked() ? "2"
                : bl.mp08c00377.isChecked() ? "77"
                : bl.mp08c00399.isChecked() ? "99"
                : "0");

        sC.put("mp08c004", bl.mp08c004a.isChecked() ? "1"
                : bl.mp08c004b.isChecked() ? "2"
                : bl.mp08c00477.isChecked() ? "77"
                : bl.mp08c00499.isChecked() ? "99"
                : "0");

        sC.put("mp08c005", bl.mp08c005a.isChecked() ? "1"
                : bl.mp08c005b.isChecked() ? "2"
                : bl.mp08c00577.isChecked() ? "77"
                : bl.mp08c00599.isChecked() ? "99"
                : "0");

        sC.put("mp08c006", bl.mp08c006a.isChecked() ? "1"
                : bl.mp08c006b.isChecked() ? "2"
                : bl.mp08c006c.isChecked() ? "3"
                : bl.mp08c006d.isChecked() ? "4"
                : bl.mp08c006e.isChecked() ? "5"
                : bl.mp08c006f.isChecked() ? "6"
                : bl.mp08c00688.isChecked() ? "88"
                : bl.mp08c00699.isChecked() ? "99"
                : "0");

        sC.put("mp08c00688x", bl.mp08c00688x.getText().toString());


        sC.put("mp08c007", bl.mp08c007a.isChecked() ? "1"
                : bl.mp08c007b.isChecked() ? "2"
                : bl.mp08c007c.isChecked() ? "3"
                : bl.mp08c007d.isChecked() ? "4"
                : bl.mp08c007e.isChecked() ? "5"
                : bl.mp08c00777.isChecked() ? "77"
                : bl.mp08c00788.isChecked() ? "88"
                : bl.mp08c00799.isChecked() ? "99"
                : "0");

        sC.put("mp08c00788x", bl.mp08c00788x.getText().toString());

        sC.put("mp08c008", bl.mp08c008a.isChecked() ? "1"
                : bl.mp08c008b.isChecked() ? "2"
                : bl.mp08c008c.isChecked() ? "3"
                : bl.mp08c008d.isChecked() ? "4"
                : bl.mp08c008e.isChecked() ? "5"
                : bl.mp08c008f.isChecked() ? "6"
                : "0");

        sC.put("mp08c009a", bl.mp08c009a.isChecked() ? "1" : "0");
        sC.put("mp08c009b", bl.mp08c009b.isChecked() ? "2" : "0");
        sC.put("mp08c009c", bl.mp08c009c.isChecked() ? "3" : "0");
        sC.put("mp08c009d", bl.mp08c009d.isChecked() ? "4" : "0");
        sC.put("mp08c009e", bl.mp08c009e.isChecked() ? "5" : "0");
        sC.put("mp08c009f", bl.mp08c009f.isChecked() ? "6" : "0");
        sC.put("mp08c009g", bl.mp08c009g.isChecked() ? "7" : "0");
        sC.put("mp08c009h", bl.mp08c009h.isChecked() ? "8" : "0");
        sC.put("mp08c009i", bl.mp08c009i.isChecked() ? "9" : "0");
        sC.put("mp08c009j", bl.mp08c009j.isChecked() ? "10" : "0");
        sC.put("mp08c009k", bl.mp08c009k.isChecked() ? "11" : "0");
        sC.put("mp08c009l", bl.mp08c009l.isChecked() ? "12" : "0");
        sC.put("mp08c009m", bl.mp08c009m.isChecked() ? "13" : "0");
        sC.put("mp08c009n", bl.mp08c009n.isChecked() ? "14" : "0");
        sC.put("mp08c009o", bl.mp08c009o.isChecked() ? "15" : "0");
        sC.put("mp08c009p", bl.mp08c009p.isChecked() ? "16" : "0");
        sC.put("mp08c00977", bl.mp08c00977.isChecked() ? "77" : "0");
        sC.put("mp08c00988", bl.mp08c00988.isChecked() ? "88" : "0");
        sC.put("mp08c00999", bl.mp08c00999.isChecked() ? "99" : "0");
        sC.put("mp08c00988x", bl.mp08c00988x.getText().toString());


        sC.put("mp08c010", bl.mp08c010a.isChecked() ? "1"
                : bl.mp08c010b.isChecked() ? "2"
                : bl.mp08c010c.isChecked() ? "3"
                : bl.mp08c010d.isChecked() ? "4"
                : bl.mp08c01077.isChecked() ? "77"
                : bl.mp08c01088.isChecked() ? "88"
                : bl.mp08c01099.isChecked() ? "99"
                : "0");

        sC.put("mp08c01088x", bl.mp08c01088x.getText().toString());

        sC.put("mp08c011", bl.mp08c011a.isChecked() ? "1"
                : bl.mp08c011b.isChecked() ? "2"
                : bl.mp08c011c.isChecked() ? "3"
                : bl.mp08c01177.isChecked() ? "77"
                : bl.mp08c01188.isChecked() ? "88"
                : bl.mp08c01199.isChecked() ? "99"
                : "0");

        sC.put("mp08c01188x", bl.mp08c01188x.getText().toString());


        sC.put("mp08c012", bl.mp08c012a.isChecked() ? "1"
                : bl.mp08c012b.isChecked() ? "2"
                : bl.mp08c01277.isChecked() ? "77"
                : bl.mp08c01299.isChecked() ? "99"
                : "0");

        sC.put("mp08c013", bl.mp08c013a.isChecked() ? "1"
                : bl.mp08c013b.isChecked() ? "2"
                : bl.mp08c01377.isChecked() ? "77"
                : bl.mp08c01399.isChecked() ? "99"
                : "0");

        sC.put("mp08c014", bl.mp08c014a.isChecked() ? "1"
                : bl.mp08c014b.isChecked() ? "2"
                : bl.mp08c01499.isChecked() ? "99"
                : "0");

        sC.put("mp08c015", bl.mp08c015a.isChecked() ? "1"
                : bl.mp08c015b.isChecked() ? "2"
                : bl.mp08c01599.isChecked() ? "99"
                : "0");


        AppMain.fc.setS8C(String.valueOf(sC));


        //sRc.put()


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

        // 2. UPDATE FORM ROWID
        int updcount = db.updates8C();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


        //return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    public class checking {
        int check;

        public checking(int check) {
            this.check = check;
        }

        public int getCheck() {
            return check;
        }
    }


}

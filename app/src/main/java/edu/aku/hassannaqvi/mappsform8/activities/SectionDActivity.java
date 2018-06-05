package edu.aku.hassannaqvi.mappsform8.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.core.AppMain;
import edu.aku.hassannaqvi.mappsform8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySectionDBinding;
import edu.aku.hassannaqvi.mappsform8.validation.validatorClass;

public class SectionDActivity extends Activity {

    ActivitySectionDBinding bl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);

        bl = DataBindingUtil.setContentView(this, R.layout.activity_section_d);

        bl.setCallback(this);

        setupViews();
    }

    public void setupViews() {

        bl.mp08d003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!bl.mp08d003a.isChecked()) {
                    bl.fldGrpmp08d004.setVisibility(View.GONE);
                    bl.mp08d004a.setChecked(false);
                    bl.mp08d004b.setChecked(false);
                    bl.mp08d004c.setChecked(false);
                    bl.mp08d004d.setChecked(false);
                    bl.mp08d004e.setChecked(false);
                    bl.mp08d004f.setChecked(false);
                    bl.mp08d004g.setChecked(false);
                    bl.mp08d004h.setChecked(false);
                    bl.mp08d004i.setChecked(false);
                    bl.mp08d00488.setChecked(false);
                    bl.mp08d00499.setChecked(false);
                    bl.mp08d00488x.setText(null);
                } else {
                    bl.fldGrpmp08d004.setVisibility(View.VISIBLE);
                }
            }
        });

    }


    public Boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bl.mp08d001, bl.mp08d001a, getString(R.string.mp08d001))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08d001, bl.mp08d001b, bl.mp08d001bx, getString(R.string.mp08d001b) + " - " + getString(R.string.hours))) {
            return false;
        }

        if (bl.mp08d001b.isChecked()) {
            if (!validatorClass.RangeTextBox(this, bl.mp08d001bx, 1, 23, getString(R.string.mp08d001b), " hours")) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08d001, bl.mp08d001c, bl.mp08d001cx, getString(R.string.mp08d001c) + " - " + getString(R.string.hours))) {
            return false;
        }

        if (bl.mp08d001c.isChecked()) {
            if (!validatorClass.RangeTextBox(this, bl.mp08d001cx, 1, 30, getString(R.string.mp08d001c), " days")) {
                return false;
            }
        }


        if (!validatorClass.EmptyRadioButton(this, bl.mp08d002, bl.mp08d002a, getString(R.string.mp08d002))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bl.mp08d003, bl.mp08d003a, getString(R.string.mp08d003))) {
            return false;
        }

        if (bl.mp08d003a.isChecked()) {
            if (!validatorClass.EmptyCheckBox(this, bl.fldGrpCheck004, bl.mp08d004a, getString(R.string.mp08d004))) {
                return false;
            }

            if (!validatorClass.EmptyCheckBox(this, bl.fldGrpCheck004, bl.mp08d00488, bl.mp08d00488x, getString(R.string.mp08d004) + " - " + getString(R.string.other))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, bl.mp08d005, bl.mp08d005a, getString(R.string.mp08d005))) {
                return false;
            }

        }

        if (!bl.mp08d00677.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bl.mp08d006, getString(R.string.mp08d006))) {
                return false;
            }

            return validatorClass.RangeTextBox(this, bl.mp08d006, 1, 12, getString(R.string.mp08d006), " times");
        }



        return true;

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

                startActivity(new Intent(this, SectionEActivity.class).putExtra("complete", false));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sD = new JSONObject();

        sD.put("mp08d001", bl.mp08d001a.isChecked() ? "1"
                : bl.mp08d001b.isChecked() ? "2"
                : bl.mp08d001c.isChecked() ? "3"
                : bl.mp08d001d.isChecked() ? "4"
                : bl.mp08d00177.isChecked() ? "77"
                : "0");

        sD.put("mp08d001b_hours", bl.mp08d001bx.getText().toString());
        sD.put("mp08d001c_days", bl.mp08d001cx.getText().toString());

        sD.put("mp08d002", bl.mp08d002a.isChecked() ? "1"
                : bl.mp08d002b.isChecked() ? "2"
                : bl.mp08d00299.isChecked() ? "99"
                : bl.mp08d00277.isChecked() ? "77"
                : "0");

        sD.put("mp08d003", bl.mp08d003a.isChecked() ? "1"
                : bl.mp08d003b.isChecked() ? "2"
                : bl.mp08d00399.isChecked() ? "99"
                : bl.mp08d00377.isChecked() ? "77"
                : "0");

        sD.put("mp08d004a", bl.mp08d004a.isChecked() ? "1" : "0");
        sD.put("mp08d004b", bl.mp08d004b.isChecked() ? "2" : "0");
        sD.put("mp08d004c", bl.mp08d004c.isChecked() ? "3" : "0");
        sD.put("mp08d004d", bl.mp08d004d.isChecked() ? "4" : "0");
        sD.put("mp08d004e", bl.mp08d004e.isChecked() ? "5" : "0");
        sD.put("mp08d004f", bl.mp08d004f.isChecked() ? "6" : "0");
        sD.put("mp08d004g", bl.mp08d004g.isChecked() ? "7" : "0");
        sD.put("mp08d004h", bl.mp08d004h.isChecked() ? "8" : "0");
        sD.put("mp08d004i", bl.mp08d004i.isChecked() ? "9" : "0");
        sD.put("mp08d00499", bl.mp08d00499.isChecked() ? "99" : "0");
        sD.put("mp08d00488", bl.mp08d00488.isChecked() ? "88" : "0");

        sD.put("mp08d00488x", bl.mp08d00488x.getText().toString());

        sD.put("mp08d005", bl.mp08d005a.isChecked() ? "1"
                : bl.mp08d005b.isChecked() ? "2"
                : "0");

        sD.put("mp08d006", bl.mp08d00677.isChecked() ? "77" : bl.mp08d006.getText().toString());


        AppMain.fc.setsD(String.valueOf(sD));


        //sRc.put()


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

        // 2. UPDATE FORM ROWID
        int updcount = db.updatesD();

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

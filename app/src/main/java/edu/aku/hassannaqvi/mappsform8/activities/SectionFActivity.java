package edu.aku.hassannaqvi.mappsform8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.core.AppMain;
import edu.aku.hassannaqvi.mappsform8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySectionFBinding;
import edu.aku.hassannaqvi.mappsform8.validation.ValidatorClass;
import edu.aku.hassannaqvi.mappsform8.validation.ValidatorClass02;

import static edu.aku.hassannaqvi.mapps_form6.validation.ClearClass.ClearAllFields;

public class SectionFActivity extends AppCompatActivity {

    ActivitySectionFBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f);
        bi.setCallback(this);

        setupViews();
    }

    private void setupViews() {

        /*bi.mp08f01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.mp08f01a.getId()) {
                    ClearAllFields(bi.fldGrpMain, null);
                }
            }
        });*/

//       bi.mp08f01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(RadioGroup radioGroup, int i) {
//                if (!bi.mp08f01a.isChecked()) {
//                    bi.fldGrpMain.setVisibility(View.GONE);
//                    bi.mp08f02a.setChecked(false);
//                    bi.mp08f02b.setChecked(false);
//                    bi.mp08f02c.setChecked(false);
//                    bi.mp08f02d.setChecked(false);
//                    bi.mp08f02e.setChecked(false);
//                    bi.mp08f02f.setChecked(false);
//                    bi.mp08f02g.setChecked(false);
//                    bi.mp08f02h.setChecked(false);
//                    bi.mp08f0296.setChecked(false);
//                    bi.mp08f0296x.setText(null);
//                } else {
//                    bi.fldGrpMain.setVisibility(View.VISIBLE);
//                }
//            }
//        });

        bi.mp08f01.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (!bi.mp08f01a.isChecked()) {
                    ClearAllFields(bi.fldGrpMain, null);
                    bi.fldGrpMain.setVisibility(View.GONE);
//                    bi.mp08f03a.setChecked(false);
//                    bi.mp08f03b.setChecked(false);
//                    bi.mp08f03c.setChecked(false);
//                    bi.mp08f03d.setChecked(false);
//                    bi.mp08f03e.setChecked(false);
//                    bi.mp08f03f.setChecked(false);
//                    bi.mp08f03g.setChecked(false);
//                    bi.mp08f03h.setChecked(false);
//                    bi.mp08f03i.setChecked(false);
//                    bi.mp08f03j.setChecked(false);
//                    bi.mp08f03k.setChecked(false);
//                    bi.mp08f03l.setChecked(false);
//                    bi.mp08f0396.setChecked(false);
//                    bi.mp08f0396x.setText(null);
                } else {
                    bi.fldGrpMain.setVisibility(View.VISIBLE);
                }
            }
        });

        bi.mp08f08.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == bi.mp08f08b.getId()) {
                    ClearAllFields(bi.fldGrpmp08f09, null);
                }
            }
        });
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

                startActivity(new Intent(this, Form6Section4Activity.class));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesF();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
    }

    private void SaveDraft() throws JSONException {

        JSONObject sForm08 = new JSONObject();

        sForm08.put("mp08f01", bi.mp08f01a.isChecked() ? "1"
                : bi.mp08f01b.isChecked() ? "2" : "0");

        sForm08.put("mp08f02a", bi.mp08f02a.isChecked() ? "1" : "0");
        sForm08.put("mp08f02b", bi.mp08f02b.isChecked() ? "2" : "0");
        sForm08.put("mp08f02c", bi.mp08f02c.isChecked() ? "3" : "0");
        sForm08.put("mp08f02d", bi.mp08f02d.isChecked() ? "4" : "0");
        sForm08.put("mp08f02e", bi.mp08f02e.isChecked() ? "5" : "0");
        sForm08.put("mp08f02f", bi.mp08f02f.isChecked() ? "6" : "0");
        sForm08.put("mp08f02g", bi.mp08f02g.isChecked() ? "7" : "0");
        sForm08.put("mp08f02h", bi.mp08f02h.isChecked() ? "8" : "0");
        sForm08.put("mp08f0296", bi.mp08f0296.isChecked() ? "96" : "0");
        sForm08.put("mp08f0296x", bi.mp08f0296x.getText().toString());

        sForm08.put("mp08f03a", bi.mp08f03a.isChecked() ? "1" : "0");
        sForm08.put("mp08f03b", bi.mp08f03b.isChecked() ? "2" : "0");
        sForm08.put("mp08f03c", bi.mp08f03c.isChecked() ? "3" : "0");
        sForm08.put("mp08f03d", bi.mp08f03d.isChecked() ? "4" : "0");
        sForm08.put("mp08f03e", bi.mp08f03e.isChecked() ? "5" : "0");
        sForm08.put("mp08f03f", bi.mp08f03f.isChecked() ? "6" : "0");
        sForm08.put("mp08f03g", bi.mp08f03g.isChecked() ? "7" : "0");
        sForm08.put("mp08f03h", bi.mp08f03h.isChecked() ? "8" : "0");
        sForm08.put("mp08f03i", bi.mp08f03i.isChecked() ? "9" : "0");
        sForm08.put("mp08f03j", bi.mp08f03j.isChecked() ? "10" : "0");
        sForm08.put("mp08f03k", bi.mp08f03k.isChecked() ? "11" : "0");
        sForm08.put("mp08f03l", bi.mp08f03l.isChecked() ? "12" : "0");
        sForm08.put("mp08f0396", bi.mp08f0396.isChecked() ? "96" : "0");
        sForm08.put("mp08f0396x", bi.mp08f0396x.getText().toString());

        sForm08.put("mp08f04a", bi.mp08f04a.getText().toString());
        sForm08.put("mp08f04b", bi.mp08f04b.getText().toString());
        sForm08.put("mp08f04c", bi.mp08f04c.getText().toString());
        sForm08.put("mp08f04d", bi.mp08f04d.getText().toString());


        sForm08.put("mp08f05", bi.mp08f05.getText().toString());

        sForm08.put("mp08f06a", bi.mp08f06a01.isChecked() ? "1"
                : bi.mp08f06a02.isChecked() ? "2" : "0");

        sForm08.put("mp08f06b", bi.mp08f06b01.isChecked() ? "1"
                : bi.mp08f06b02.isChecked() ? "2" : "0");

        sForm08.put("mp08f06c", bi.mp08f06c01.isChecked() ? "1"
                : bi.mp08f06c02.isChecked() ? "2" : "0");

        sForm08.put("mp08f06d", bi.mp08f06d01.isChecked() ? "1"
                : bi.mp08f06d02.isChecked() ? "2" : "0");

        sForm08.put("mp08f06e", bi.mp08f06e01.isChecked() ? "1"
                : bi.mp08f06e02.isChecked() ? "2" : "0");

        sForm08.put("mp08f07", bi.mp08f07a.isChecked() ? "1"
                : bi.mp08f07b.isChecked() ? "2" : "0");

        sForm08.put("mp08f08", bi.mp08f08a.isChecked() ? "1"
                : bi.mp08f08b.isChecked() ? "2" : "0");


        sForm08.put("mp08f09", bi.mp08f09.getText().toString());

        sForm08.put("mp08f10", bi.mp08f10a.isChecked() ? "1"
                : bi.mp08f10b.isChecked() ? "2" : "0");

        AppMain.fc.setsF(String.valueOf(sForm08));

    }

    private boolean formValidation() {

        /*if (bi.mp08f01a.isChecked()) {
            if (ValidatorClass.EmptyCheckBox(this, bi.fldGrpmp08f002, bi.mp08f02a, getString(R.string.mp08f01))) {
                return false;
            }

            if (ValidatorClass.EmptyCheckBox(this, bi.fldGrpmp08f002, bi.mp08f0296, bi.mp08f0296x, getString(R.string.mp08f02) + " - " + getString(R.string.other))) {
                return false;
            }
            if (ValidatorClass.EmptyCheckBox(this, bi.fldGrpmp08f003, bi.mp08f0396, bi.mp08f0396x, getString(R.string.mp08f03) + " - " + getString(R.string.other))) {
                return false;
            }

        }*/

        return ValidatorClass02.EmptyCheckingContainer(this, bi.fldGrpForm08);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }
}

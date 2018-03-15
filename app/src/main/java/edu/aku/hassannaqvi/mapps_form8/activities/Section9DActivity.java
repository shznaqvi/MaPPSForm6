package edu.aku.hassannaqvi.mapps_form8.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form8.core.AppMain;
import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form8.validation.validatorClass;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySection9DBinding;

public class Section9DActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    ActivitySection9DBinding bi;

    @BindViews({R.id.mp09q34a, R.id.mp09q34b, R.id.mp09q34c, R.id.mp09q34d, R.id.mp09q34e, R.id.mp09q34f, R.id.mp09q34g, R.id.mp09q34h, R.id.mp09q34i, R.id.mp09q3488})
    List<RadioGroup> grpmp09q34;
    @BindViews({R.id.mp09q34ab, R.id.mp09q34bb, R.id.mp09q34cb, R.id.mp09q34db, R.id.mp09q34eb, R.id.mp09q34fb, R.id.mp09q34gb,
            R.id.mp09q34hb, R.id.mp09q34ib, R.id.mp09q3488b})
    List<RadioButton> grpmp09q34No;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section9_d);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section9_d);
        ButterKnife.bind(this);
        bi.setCallback(this);

        bi.mp09q35.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.mp09q35b.isChecked()) {
                    bi.mp09q36.clearCheck();
                    bi.mp09q3688x.setText(null);
                    bi.mp09q37.clearCheck();
                    bi.mp09q38.setText(null);
                }
            }
        });

        for (RadioGroup rg : grpmp09q34) {
            rg.setOnCheckedChangeListener(this);
        }


    }

    public void BtnEnd() {

        AppMain.endActivity(this, this);
    }

    public void BtnContinue() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                Intent sece = new Intent(this, EndingActivity.class);
                sece.putExtra("complete", true);
                startActivity(sece);


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    public boolean ValidateForm() {

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34a, bi.mp09q34aa, getString(R.string.mp09q34a))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34b, bi.mp09q34ba, getString(R.string.mp09q34b))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34c, bi.mp09q34ca, getString(R.string.mp09q34c))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34d, bi.mp09q34da, getString(R.string.mp09q34d))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34e, bi.mp09q34ea, getString(R.string.mp09q34e))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34f, bi.mp09q34fa, getString(R.string.mp09q34f))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34g, bi.mp09q34ga, getString(R.string.mp09q34g))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34h, bi.mp09q34ha, getString(R.string.mp09q34h))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q34i, bi.mp09q34ia, getString(R.string.mp09q34i))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q3488, bi.mp09q3488a, bi.mp09q3488x, getString(R.string.other))) {
            return false;
        }

        if (is34AllNo()) {
            if (!validatorClass.EmptyRadioButton(this, bi.mp09q35, bi.mp09q35a, getString(R.string.mp09q35))) {
                return false;
            }
            if (bi.mp09q35a.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, bi.mp09q36, bi.mp09q3688, bi.mp09q3688x, getString(R.string.mp09q36))) {
                    return false;
                }

                if (!validatorClass.EmptyRadioButton(this, bi.mp09q37, bi.mp09q37a, getString(R.string.mp09q37))) {
                    return false;
                }

                if (bi.mp09q37a.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, bi.mp09q38, getString(R.string.mp09q38))) {
                        return false;
                    }

                }
            }


        }


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp09q34a", bi.mp09q34aa.isChecked() ? "1"
                : bi.mp09q34ab.isChecked() ? "2"
                : "0");

        form4.put("mp09q34b", bi.mp09q34ba.isChecked() ? "1"
                : bi.mp09q34bb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34c", bi.mp09q34ca.isChecked() ? "1"
                : bi.mp09q34cb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34d", bi.mp09q34da.isChecked() ? "1"
                : bi.mp09q34db.isChecked() ? "2"
                : "0");

        form4.put("mp09q34e", bi.mp09q34ea.isChecked() ? "1"
                : bi.mp09q34eb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34f", bi.mp09q34fa.isChecked() ? "1"
                : bi.mp09q34fb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34g", bi.mp09q34ga.isChecked() ? "1"
                : bi.mp09q34gb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34h", bi.mp09q34ha.isChecked() ? "1"
                : bi.mp09q34hb.isChecked() ? "2"
                : "0");

        form4.put("mp09q34i", bi.mp09q34ia.isChecked() ? "1"
                : bi.mp09q34ib.isChecked() ? "2"
                : "0");


        form4.put("mp09q3488", bi.mp09q3488a.isChecked() ? "1"
                : bi.mp09q3488b.isChecked() ? "2"
                : "0");

        form4.put("mp09q3488x", bi.mp09q3488x.getText().toString());

        form4.put("mp09q35", bi.mp09q35a.isChecked() ? "1"
                : bi.mp09q35b.isChecked() ? "2"
                : "0");

        form4.put("mp09q36", bi.mp09q36a.isChecked() ? "1"
                : bi.mp09q36b.isChecked() ? "2"
                : bi.mp09q36c.isChecked() ? "3"
                : bi.mp09q36d.isChecked() ? "4"
                : bi.mp09q36e.isChecked() ? "5"
                : bi.mp09q36f.isChecked() ? "6"
                : bi.mp09q36g.isChecked() ? "7"
                : bi.mp09q3688.isChecked() ? "88"
                : "0");

        form4.put("mp09q3688x", bi.mp09q3688x.getText().toString());

        form4.put("mp09q37", bi.mp09q37a.isChecked() ? "1"
                : bi.mp09q37b.isChecked() ? "2"
                : "0");
        form4.put("mp09q38", bi.mp09q38.getText().toString());


        AppMain.fc.setS9D(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates9D();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (is34AllNo()) {
            bi.fldGrpmp09q35.setVisibility(View.GONE);
            bi.mp09q35.clearCheck();
            bi.mp09q36.clearCheck();
            bi.mp09q3688x.setText(null);
            bi.mp09q37.clearCheck();
            bi.mp09q38.setText(null);
        } else {
            bi.fldGrpmp09q35.setVisibility(View.VISIBLE);
        }

    }

    public boolean is34AllNo() {

        int i = 0;
        for (RadioButton rg : grpmp09q34No) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == grpmp09q34No.size();
    }
}

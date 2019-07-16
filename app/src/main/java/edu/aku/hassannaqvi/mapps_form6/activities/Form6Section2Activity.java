package edu.aku.hassannaqvi.mapps_form6.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mapps_form6.R;
import edu.aku.hassannaqvi.mapps_form6.core.AppMain;
import edu.aku.hassannaqvi.mapps_form6.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form6.databinding.ActivityForm6Section2Binding;
import edu.aku.hassannaqvi.mapps_form6.validation.ValidatorClass;


public class Form6Section2Activity extends Activity {

    ActivityForm6Section2Binding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_form6_section2);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_form6_section2);
        bi.setCallback(this);
    }

    public boolean ValidateForm() {

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c001, bi.mp06c001a, getString(R.string.mp06c001))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c002, bi.mp06c002a, getString(R.string.mp06c002))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c003, bi.mp06c003a, getString(R.string.mp06c003))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c004, bi.mp06c004a, getString(R.string.mp06c004))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c005, bi.mp06c005a, getString(R.string.mp06c005))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c006, bi.mp06c006a, getString(R.string.mp06c006))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c007, bi.mp06c007a, getString(R.string.mp06c007))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c008, bi.mp06c008a, getString(R.string.mp06c008))) {
            return false;
        }

        if (!ValidatorClass.EmptyRadioButton(this, bi.mp06c009, bi.mp06c009a, getString(R.string.mp06c009))) {
            return false;
        }

        return ValidatorClass.EmptyRadioButton(this, bi.mp06c010, bi.mp06c010a, getString(R.string.mp06c010));
    }

    public void BtnEnd() {

        finish();

        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);

    }

    public void BtnContinue() {


        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (UpdateDB()) {

                startActivity(new Intent(this, Form6Section4Activity.class));

            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {


        JSONObject form4 = new JSONObject();

        form4.put("mp06c001", bi.mp06c001a.isChecked() ? "1"
                : bi.mp06c001b.isChecked() ? "2"
                : bi.mp06c001c.isChecked() ? "3"
                : bi.mp06c001d.isChecked() ? "4"
                : "0");

        form4.put("mp06c002", bi.mp06c002a.isChecked() ? "1"
                : bi.mp06c002b.isChecked() ? "2"
                : bi.mp06c002c.isChecked() ? "3"
                : bi.mp06c002d.isChecked() ? "4"
                : "0");

        form4.put("mp06c003", bi.mp06c003a.isChecked() ? "1"
                : bi.mp06c003b.isChecked() ? "2"
                : bi.mp06c003c.isChecked() ? "3"
                : bi.mp06c003d.isChecked() ? "4"
                : "0");

        form4.put("mp06c004", bi.mp06c004a.isChecked() ? "1"
                : bi.mp06c004b.isChecked() ? "2"
                : bi.mp06c004c.isChecked() ? "3"
                : bi.mp06c004d.isChecked() ? "4"
                : "0");

        form4.put("mp06c005", bi.mp06c005a.isChecked() ? "1"
                : bi.mp06c005b.isChecked() ? "2"
                : bi.mp06c005c.isChecked() ? "3"
                : bi.mp06c005d.isChecked() ? "4"
                : "0");

        form4.put("mp06c006", bi.mp06c006a.isChecked() ? "1"
                : bi.mp06c006b.isChecked() ? "2"
                : bi.mp06c006c.isChecked() ? "3"
                : bi.mp06c006d.isChecked() ? "4"
                : "0");

        form4.put("mp06c007", bi.mp06c007a.isChecked() ? "1"
                : bi.mp06c007b.isChecked() ? "2"
                : bi.mp06c007c.isChecked() ? "3"
                : bi.mp06c007d.isChecked() ? "4"
                : "0");

        form4.put("mp06c008", bi.mp06c008a.isChecked() ? "1"
                : bi.mp06c008b.isChecked() ? "2"
                : bi.mp06c008c.isChecked() ? "3"
                : bi.mp06c008d.isChecked() ? "4"
                : "0");

        form4.put("mp06c009", bi.mp06c009a.isChecked() ? "1"
                : bi.mp06c009b.isChecked() ? "2"
                : bi.mp06c009c.isChecked() ? "3"
                : bi.mp06c009d.isChecked() ? "4"
                : "0");

        form4.put("mp06c010", bi.mp06c010a.isChecked() ? "1"
                : bi.mp06c010b.isChecked() ? "2"
                : bi.mp06c010c.isChecked() ? "3"
                : bi.mp06c010d.isChecked() ? "4"
                : "0");


        AppMain.fc.setsB(String.valueOf(form4));


    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesB();

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


}

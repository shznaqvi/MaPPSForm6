package edu.aku.hassannaqvi.mappsform15_16.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform15_16.R;
import edu.aku.hassannaqvi.mappsform15_16.core.AppMain;
import edu.aku.hassannaqvi.mappsform15_16.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform15_16.databinding.ActivitySectionCDBinding;
import edu.aku.hassannaqvi.mappsform15_16.validation.validatorClass;

public class SectionC_DActivity extends AppCompatActivity {


    ActivitySectionCDBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c__d);
        bi.setCallback(this);


    }


    public boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, bi.mp15c01, bi.mp15c01a, getString(R.string.mp15c01))) {
            bi.mp15c01.requestFocus();
            return false;
        } else {

            bi.mp15c01.clearFocus();
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp15c02, bi.mp15c02a, getString(R.string.mp15c02))) {
            bi.mp15c02.requestFocus();
            return false;
        } else {

            bi.mp15c02.clearFocus();
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp15d01, bi.mp15d01a, getString(R.string.mp15d01))) {
            bi.mp15d01.requestFocus();
            return false;
        } else {

            bi.mp15d01.clearFocus();
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp15d02, bi.mp15d02a, getString(R.string.mp15d02))) {
            bi.mp15d02.requestFocus();
            return false;
        } else {

            bi.mp15d02.clearFocus();
        }

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        return true;
    }


    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (formValidation()) {
            try {
                saveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if(UpdateDB()){
                startActivity(new Intent(this,EndingActivity.class));
                finish();
            }

        }


    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
        // 2. UPDATE FORM ROWID
        int updcount = db.updatesB();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


        //return true;
    }

    public void saveDraft() throws JSONException {

        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sCD = new JSONObject();

        sCD.put("mp15c01", bi.mp15c01a.isChecked() ? "1" : bi.mp15c01b.isChecked() ? "2" : bi.mp15c01c.isChecked() ? "3" : bi.mp15c01d.isChecked() ? "4" : "0");
        sCD.put("mp15c02", bi.mp15c02a.isChecked() ? "1" : bi.mp15c02b.isChecked() ? "2" : bi.mp15c02c.isChecked() ? "99" : "0");
        sCD.put("mp15d01", bi.mp15d01a.isChecked() ? "1" : bi.mp15d01b.isChecked() ? "2" : bi.mp15d01c.isChecked() ? "3" : bi.mp15d01d.isChecked() ? "4" : bi.mp15d01e.isChecked() ? "5" : "0");
        sCD.put("mp15d01", bi.mp15d01a.isChecked() ? "1" : bi.mp15d01b.isChecked() ? "2" : bi.mp15d01c.isChecked() ? "99" : "0");


        AppMain.fc.setsC(String.valueOf(sCD));
    }

    public void BtnEnd() {


    }
}

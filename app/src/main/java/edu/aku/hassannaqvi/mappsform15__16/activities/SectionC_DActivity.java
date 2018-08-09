package edu.aku.hassannaqvi.mappsform15__16.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform15__16.R;
import edu.aku.hassannaqvi.mappsform15__16.core.AppMain;
import edu.aku.hassannaqvi.mappsform15__16.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform15__16.databinding.ActivitySectionCDBinding;
import edu.aku.hassannaqvi.mappsform15__16.validation.validatorClass;

public class SectionC_DActivity extends AppCompatActivity {

    ActivitySectionCDBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_c__d);
        bi.setCallback(this);

        this.setTitle(getString(R.string.app_name15));
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

        return true;
    }


    public void BtnContinue() {

        if (formValidation()) {
            try {
                saveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {
                startActivity(new Intent(this, EndingActivity.class)
                        .putExtra("complete", true));
                finish();
            }
        }

    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesC() == 1 ? db.updatesD() : 0;

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }

    }

    public void saveDraft() throws JSONException {

        JSONObject sC = new JSONObject();
        JSONObject sD = new JSONObject();

        sC.put("mp15c01", bi.mp15c01a.isChecked() ? "1" : bi.mp15c01b.isChecked() ? "2" : bi.mp15c01c.isChecked() ? "3" : bi.mp15c01d.isChecked() ? "4" : "0");
        sC.put("mp15c02", bi.mp15c02a.isChecked() ? "1" : bi.mp15c02b.isChecked() ? "2" : bi.mp15c02c.isChecked() ? "99" : "0");
        sD.put("mp15d01", bi.mp15d01a.isChecked() ? "1" : bi.mp15d01b.isChecked() ? "2" : bi.mp15d01c.isChecked() ? "3" : bi.mp15d01d.isChecked() ? "4" : bi.mp15d01e.isChecked() ? "5" : "0");
        sD.put("mp15d02", bi.mp15d02a.isChecked() ? "1" : bi.mp15d02b.isChecked() ? "2" : bi.mp15d02c.isChecked() ? "99" : "0");

        AppMain.fc.setsC(String.valueOf(sC));
        AppMain.fc.setsD(String.valueOf(sD));
    }

    public void BtnEnd() {

        AppMain.endActivity(this, this);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }
}

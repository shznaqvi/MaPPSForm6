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
import edu.aku.hassannaqvi.mappsform15__16.databinding.ActivitySection16BBinding;
import edu.aku.hassannaqvi.mappsform15__16.validation.validatorClass;

public class Section16_BActivity extends AppCompatActivity {


    ActivitySection16BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section16__b);
        bi.setCallback(this);
    }


    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    public void BtnContinue() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (formValidation()) {

            try {
                saveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {

                startActivity(new Intent(this, EndingActivity.class));
                finish();
            }

        }


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


        //return true;
    }

    public void saveDraft() throws JSONException {


        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();
        JSONObject sB = new JSONObject();

        sB.put("mp16b01", bi.mp16b02.getText().toString());
        sB.put("mp16b02", bi.mp16b01a.isChecked() ? "1" : bi.mp16b01b.isChecked() ? "2" : bi.mp16b01c.isChecked() ? "3" : bi.mp16b01d.isChecked() ? "4" : bi.mp16b01e.isChecked() ? "5" : bi.mp16b01f.isChecked() ? "6" : bi.mp16b01g.isChecked() ? "7" : bi.mp16b01h.isChecked() ? "8" : bi.mp16b01i.isChecked() ? "88" : "0");
        sB.put("mp16b02", bi.mp16b01ix.getText().toString());
        AppMain.fc.setsB(String.valueOf(sB));
    }

    public boolean formValidation() {


        if (!validatorClass.EmptyTextBox(this, bi.mp16b02, getString(R.string.mp16b02))) {

            bi.mp16b02.requestFocus();
            return false;
        } else {

            bi.mp16b02.clearFocus();
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp16b01, bi.mp16b01a, getString(R.string.mp16b01))) {

            bi.mp16b01.requestFocus();
            return false;
        } else {

            bi.mp16b01.clearFocus();
        }

        if (bi.mp16b01i.isChecked()) {

            if (!validatorClass.EmptyTextBox(this, bi.mp16b01ix, getString(R.string.mp16b01))) {

                bi.mp16b01ix.requestFocus();
                return false;
            } else {

                bi.mp16b01ix.clearFocus();
            }
        }

        return true;
    }
}
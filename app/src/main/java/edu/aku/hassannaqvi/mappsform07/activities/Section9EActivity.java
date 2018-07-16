package edu.aku.hassannaqvi.mappsform07.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivitySection9EBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class Section9EActivity extends Activity {

    ActivitySection9EBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section9_e);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section9_e);
        bi.setCallback(this);
    }

    public boolean ValidateForm() {

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q39, bi.mp09q39a, getString(R.string.mp09q39))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q40, bi.mp09q40a, getString(R.string.mp09q40))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q41, bi.mp09q41a, getString(R.string.mp09q41))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q42, bi.mp09q42a, getString(R.string.mp09q42))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q43, bi.mp09q43a, getString(R.string.mp09q43))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q44, bi.mp09q44a, getString(R.string.mp09q44))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q45, bi.mp09q45a, getString(R.string.mp09q45))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q46, bi.mp09q46a, getString(R.string.mp09q46))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp09q47, bi.mp09q47a, getString(R.string.mp09q47))) {
            return false;
        }

        return validatorClass.EmptyRadioButton(this, bi.mp09q48, bi.mp09q48a, getString(R.string.mp09q48));
    }

    public void BtnEnd() {
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
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

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put(AppMain.ftype + "q39", bi.mp09q39a.isChecked() ? "1"
                : bi.mp09q39b.isChecked() ? "2"
                : bi.mp09q39c.isChecked() ? "3"
                : bi.mp09q39d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q40", bi.mp09q40a.isChecked() ? "1"
                : bi.mp09q40b.isChecked() ? "2"
                : bi.mp09q40c.isChecked() ? "3"
                : bi.mp09q40d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q41", bi.mp09q41a.isChecked() ? "1"
                : bi.mp09q41b.isChecked() ? "2"
                : bi.mp09q41c.isChecked() ? "3"
                : bi.mp09q41d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q42", bi.mp09q42a.isChecked() ? "1"
                : bi.mp09q42b.isChecked() ? "2"
                : bi.mp09q42c.isChecked() ? "3"
                : bi.mp09q42d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q43", bi.mp09q43a.isChecked() ? "1"
                : bi.mp09q43b.isChecked() ? "2"
                : bi.mp09q43c.isChecked() ? "3"
                : bi.mp09q43d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q44", bi.mp09q44a.isChecked() ? "1"
                : bi.mp09q44b.isChecked() ? "2"
                : bi.mp09q44c.isChecked() ? "3"
                : bi.mp09q44d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q45", bi.mp09q45a.isChecked() ? "1"
                : bi.mp09q45b.isChecked() ? "2"
                : bi.mp09q45c.isChecked() ? "3"
                : bi.mp09q45d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q46", bi.mp09q46a.isChecked() ? "1"
                : bi.mp09q46b.isChecked() ? "2"
                : bi.mp09q46c.isChecked() ? "3"
                : bi.mp09q46d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q47", bi.mp09q47a.isChecked() ? "1"
                : bi.mp09q47b.isChecked() ? "2"
                : bi.mp09q47c.isChecked() ? "3"
                : bi.mp09q47d.isChecked() ? "4"
                : "0");

        form4.put(AppMain.ftype + "q48", bi.mp09q48a.isChecked() ? "1"
                : bi.mp09q48b.isChecked() ? "2"
                : bi.mp09q48c.isChecked() ? "3"
                : bi.mp09q48d.isChecked() ? "4"
                : "0");

        if (AppMain.formType.equals("9")) {
            AppMain.fc.setS9E(String.valueOf(form4));
        } else if (AppMain.formType.equals("10")) {
            AppMain.fc.setS10E(String.valueOf(form4));
        }

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates9E();

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

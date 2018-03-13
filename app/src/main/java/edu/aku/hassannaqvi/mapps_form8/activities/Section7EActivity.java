package edu.aku.hassannaqvi.mapps_form8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mapps_form8.core.AppMain;
import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form8.validation.validatorClass;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySection7EBinding;

public class Section7EActivity extends AppCompatActivity {

    ActivitySection7EBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section7_e);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section7_e);

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

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q38, bi.mp07q38a, getString(R.string.mp07q38))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q39, bi.mp07q39a, getString(R.string.mp07q39))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q40, bi.mp07q40a, getString(R.string.mp07q40))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q41, bi.mp07q41a, getString(R.string.mp07q40))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q42, bi.mp07q42a, getString(R.string.mp07q42))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q43, bi.mp07q43a, getString(R.string.mp07q43))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q44, bi.mp07q44a, getString(R.string.mp07q44))) {
            return false;
        }

        return validatorClass.EmptyRadioButton(this, bi.mp07q45, bi.mp07q45a, getString(R.string.mp07q45));
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp07q38", bi.mp07q38a.isChecked() ? "1"
                : bi.mp07q38b.isChecked() ? "2"
                : "0");

        form4.put("mp07q39", bi.mp07q39a.isChecked() ? "1"
                : bi.mp07q39b.isChecked() ? "2"
                : "0");

        form4.put("mp07q40", bi.mp07q40a.isChecked() ? "1"
                : bi.mp07q40b.isChecked() ? "2"
                : "0");

        form4.put("mp07q41", bi.mp07q41a.isChecked() ? "1"
                : bi.mp07q41b.isChecked() ? "2"
                : "0");

        form4.put("mp07q42", bi.mp07q42a.isChecked() ? "1"
                : bi.mp07q42b.isChecked() ? "2"
                : "0");

        form4.put("mp07q43", bi.mp07q43a.isChecked() ? "1"
                : bi.mp07q43b.isChecked() ? "2"
                : "0");

        form4.put("mp07q44", bi.mp07q44a.isChecked() ? "1"
                : bi.mp07q44b.isChecked() ? "2"
                : "0");

        form4.put("mp07q45", bi.mp07q45a.isChecked() ? "1"
                : bi.mp07q45b.isChecked() ? "2"
                : "0");

        AppMain.fc.setS7E(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates7E();

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

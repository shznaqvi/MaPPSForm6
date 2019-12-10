package edu.aku.hassannaqvi.mappsform07.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.Date;

import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivitySection7eBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class Section7EActivity extends AppCompatActivity {

    ActivitySection7eBinding bi;

    Date dob, today;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section7e);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section7e);
        bi.setCallback(this);

        dob = AppMain.getCalendarDate(AppMain.dob).getTime();
        today = Calendar.getInstance().getTime();

        if (getDifferenceInHours(dob, today) > 24) {
            bi.fldGrpmp07q49.setVisibility(View.VISIBLE);
        } else {
            bi.fldGrpmp07q49.setVisibility(View.GONE);
            bi.mp07q49.setText(null);
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

                finish();
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

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q45, bi.mp07q45a, getString(R.string.mp07q45))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q46, bi.mp07q46a, bi.mp07q46x, getString(R.string.mp07q46))) {
            return false;
        }


        if (!validatorClass.EmptyTextBox(this, bi.mp07q47, getString(R.string.mp07q47))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp07q48, getString(R.string.mp07q48))) {
            return false;
        }


        if (getDifferenceInHours(dob, today) > 24) {

            if (!bi.mp07q4977.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.mp07q49, getString(R.string.mp07q49))) {
                    return false;
                }

                return validatorClass.RangeTextBox(this, bi.mp07q49, 1.5, 4.5, getString(R.string.mp07q49), " kg");
            }
        }

        return true;
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

        form4.put("mp07q46", bi.mp07q46a.isChecked() ? "1" : bi.mp07q46b.isChecked() ? "2" : "0");
        form4.put("mp07q46x", bi.mp07q46x.getText().toString());
        form4.put("mp07q47", bi.mp07q47.getText().toString());
        form4.put("mp07q48", bi.mp07q48.getText().toString());
        form4.put("mp07q49", bi.mp07q4977.isChecked() ? "77" : bi.mp07q49.getText().toString());


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


    public long getDifferenceInHours(Date startDate, Date endDate) {
        long difference = endDate.getTime() - startDate.getTime();

        long secondsInMilli = 1000;
        long minutesInMilli = secondsInMilli * 60;
        long hoursInMilli = minutesInMilli * 60;

        long differenInHours = difference / hoursInMilli;

        return differenInHours;

    }

}

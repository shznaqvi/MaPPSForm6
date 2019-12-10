package edu.aku.hassannaqvi.mappsform07.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivitySection10dBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class Section10DActivity extends AppCompatActivity {

    ActivitySection10dBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section10d);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section10d);
        bi.setCallback(this);

        bi.mp10q34.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.mp10q34a) {
                    bi.fldGrpmp10d01.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpmp10d01.setVisibility(View.GONE);
                    bi.mp10q35.clearCheck();
                }
            }
        });
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
                Intent sece = new Intent(this, Section10EActivity.class);
                sece.putExtra("complete", true);
                startActivity(sece);


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    public boolean ValidateForm() {

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q34, bi.mp10q34a, getString(R.string.mp10q34))) {
            return false;
        }

        if (bi.mp10q34a.isChecked()) {
            if (!validatorClass.EmptyRadioButton(this, bi.mp10q35, bi.mp10q35a, getString(R.string.mp10q35))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q36, bi.mp10q36a, getString(R.string.mp10q36))) {
            return false;
        }

        return validatorClass.EmptyRadioButton(this, bi.mp10q37, bi.mp10q37a, getString(R.string.mp10q37));
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp10q34", bi.mp10q34a.isChecked() ? "1"
                : bi.mp10q34b.isChecked() ? "2"
                : bi.mp10q3499.isChecked() ? "99"
                : "0");

        form4.put("mp10q35", bi.mp10q35a.isChecked() ? "1"
                : bi.mp10q35b.isChecked() ? "2"
                : bi.mp10q3599.isChecked() ? "99"
                : "0");

        form4.put("mp10q36", bi.mp10q36a.isChecked() ? "1"
                : bi.mp10q36b.isChecked() ? "2"
                : bi.mp10q3699.isChecked() ? "99"
                : "0");

        form4.put("mp10q37", bi.mp10q37a.isChecked() ? "1"
                : bi.mp10q37b.isChecked() ? "2"
                : bi.mp10q3799.isChecked() ? "99"
                : "0");

        AppMain.fc.setS10D(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates10D();

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

package edu.aku.hassannaqvi.mappsform8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.core.AppMain;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySectionFBinding;
import edu.aku.hassannaqvi.mappsform8.validation.ValidatorClass;

public class SectionFActivity extends AppCompatActivity {

    ActivitySectionFBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section_f);
        bi.setCallback(this);
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

                startActivity(new Intent(this, SectionEActivity.class).putExtra("complete", false));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private boolean UpdateDB() {

        return true;
    }

    private void SaveDraft() throws JSONException {

        JSONObject sForm08 = new JSONObject();

        sForm08.put("mp08f01", bi.mp08f01a.isChecked() ? "1"
                : bi.mp08f01b.isChecked() ? "2" : "0");

        sForm08.put("mp08f02", bi.mp08f02a.isChecked() ? "1"
                : bi.mp08f02b.isChecked() ? "2"
                : bi.mp08f02c.isChecked() ? "3"
                : bi.mp08f02d.isChecked() ? "4"
                : bi.mp08f02e.isChecked() ? "5"
                : bi.mp08f02f.isChecked() ? "6"
                : bi.mp08f02g.isChecked() ? "7"
                : bi.mp08f02h.isChecked() ? "8"
                : bi.mp08f0296.isChecked() ? "96"
                : "0");

        sForm08.put("mp08f0296x", bi.mp08f0296x.getText().toString());

        sForm08.put("mp08f03", bi.mp08f03a.isChecked() ? "1"
                : bi.mp08f03b.isChecked() ? "2"
                : bi.mp08f03c.isChecked() ? "3"
                : bi.mp08f03d.isChecked() ? "4"
                : bi.mp08f03e.isChecked() ? "5"
                : bi.mp08f03f.isChecked() ? "6"
                : bi.mp08f03g.isChecked() ? "7"
                : bi.mp08f03h.isChecked() ? "8"
                : bi.mp08f03i.isChecked() ? "9"
                : bi.mp08f03j.isChecked() ? "10"
                : bi.mp08f03k.isChecked() ? "11"
                : bi.mp08f03l.isChecked() ? "12"
                : bi.mp08f0296.isChecked() ? "96"
                : "0");

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

    }

    private boolean formValidation() {

        return ValidatorClass.EmptyCheckingContainer(this, bi.fldGrpForm08);

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }
}

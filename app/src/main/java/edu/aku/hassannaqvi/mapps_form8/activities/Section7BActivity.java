package edu.aku.hassannaqvi.mapps_form8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mapps_form8.core.AppMain;
import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form8.validation.validatorClass;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySection7BBinding;

public class Section7BActivity extends AppCompatActivity {

    ActivitySection7BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section7_b);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section7_b);

        bi.mp07q17.setManager(getSupportFragmentManager());
        bi.mp07q20.setManager(getSupportFragmentManager());
        bi.setCallback(this);

        if (AppMain.formType.equals("7")) {
            bi.appHeader.setText(R.string.mp07heading1);
            bi.fldGrpform7.setVisibility(View.VISIBLE);
            bi.fldGrpName.setVisibility(View.VISIBLE);
        } else {
            bi.appHeader.setText(R.string.mp10heading1);
            bi.fldGrpform7.setVisibility(View.GONE);
            bi.fldGrpName.setVisibility(View.GONE);
            bi.mp07q16.setText(null);
            bi.mp07q17.setText(null);
            bi.mp07q18.clearCheck();
            bi.mp07q21.setText(null);
        }
    }

    public Boolean formValidation() {

        if (AppMain.formType.equals("7")) {

            if (!validatorClass.EmptyTextBox(this, bi.mp07q16, getString(R.string.mp07q16))) {
                return false;
            }

            if (!validatorClass.EmptyTextBox(this, bi.mp07q17, getString(R.string.mp07q17))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, bi.mp07q18, bi.mp07q18a, getString(R.string.mp07q18))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp07q19, bi.mp07q19a, getString(R.string.mp07q19))) {
            return false;
        }

        if (bi.mp07q19a.isChecked()) {
            if (AppMain.formType.equals("7")) {
                if (!validatorClass.EmptyTextBox(this, bi.mp07q21, getString(R.string.mp07q21))) {
                    return false;
                }
            }

        } else {
            if (!validatorClass.EmptyTextBox(this, bi.mp07q20, getString(R.string.mp07q20))) {
                return false;
            }
        }


        return true;

    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sB = new JSONObject();
        if (AppMain.formType.equals("7")) {

            sB.put("mp07q16", bi.mp07q16.getText().toString());
            sB.put("mp07q17", bi.mp07q17.getText().toString());
            sB.put("mp17q18", bi.mp07q18a.isChecked() ? "1"
                    : bi.mp07q18b.isChecked() ? "2"
                    : "0");
            sB.put("mp07q19", bi.mp07q19a.isChecked() ? "1"
                    : bi.mp07q19b.isChecked() ? "2"
                    : "0");
            sB.put("mp07q20", bi.mp07q20.getText().toString());
            sB.put("mp07q21", bi.mp07q21.getText().toString());

        } else {
            sB.put(AppMain.ftype + "q16", bi.mp07q19a.isChecked() ? "1"
                    : bi.mp07q19b.isChecked() ? "2"
                    : "0");
            sB.put(AppMain.ftype + "q17", bi.mp07q20.getText().toString());

        }


        if (AppMain.formType.equals("7")) {
            AppMain.fc.setS7B(String.valueOf(sB));
        } else if (AppMain.formType.equals("9")) {
            AppMain.fc.setS9B(String.valueOf(sB));
        } else if (AppMain.formType.equals("10")) {
            AppMain.fc.setS10B(String.valueOf(sB));
        }


        //sRc.put()


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

        int updcount = 0;
        // 2. UPDATE FORM ROWID
        if (AppMain.formType.equals("7")) {
            updcount = db.updates7B();
        } else if (AppMain.formType.equals("9")) {
            updcount = db.updates9B();
        } else if (AppMain.formType.equals("10")) {
            updcount = db.updates10B();
        }

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


        //return true;
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
                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();

                finish();

                startActivity(new Intent(this, Section7DActivity.class));
                /*if (AppMain.outcome == 1) {

                    startActivity(new Intent(this, SectionEActivity.class).putExtra("complete", false));
                } else {
                    startActivity(new Intent(this, SectionCActivity.class).putExtra("complete", false));
                }*/
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    public void BtnCheckID() {

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}

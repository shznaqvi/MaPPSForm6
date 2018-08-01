package edu.aku.hassannaqvi.mappsform15__16.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mappsform15__16.R;
import edu.aku.hassannaqvi.mappsform15__16.core.AppMain;
import edu.aku.hassannaqvi.mappsform15__16.core.DatabaseHelper;

public class EndingActivity extends Activity {

    @BindView(R.id.activity_ending)
    RelativeLayout activityEnding;
    @BindView(R.id.mp08a014)
    RadioGroup mp08a014;
    @BindView(R.id.mp08a01401)
    RadioButton mp08a01401;
    @BindView(R.id.mp08a01402)
    RadioButton mp08a01402;
    @BindView(R.id.mp08a01403)
    RadioButton mp08a01403;
    @BindView(R.id.mp08a01404)
    RadioButton mp08a01404;
    @BindView(R.id.mp08a01405)
    RadioButton mp08a01405;
    @BindView(R.id.mp08a01406)
    RadioButton mp08a01406;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("complete");

        if (check || AppMain.endFlag) {
            mp08a01401.setEnabled(true);
            mp08a01402.setEnabled(false);
            mp08a01403.setEnabled(false);
            mp08a01404.setEnabled(false);
            mp08a01405.setEnabled(false);
            mp08a01406.setEnabled(false);
        } else {
            mp08a01401.setEnabled(false);
            mp08a01402.setEnabled(true);
            mp08a01403.setEnabled(true);
            mp08a01404.setEnabled(true);
            mp08a01405.setEnabled(true);
            mp08a01406.setEnabled(true);
        }

        /*if (AppMain.formType.equals("5")) {
            mp08a01406.setVisibility(View.VISIBLE);
        } else {
            mp08a01406.setVisibility(View.GONE);
        }
*/
    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            SaveDraft();
            if (UpdateDB()) {
                AppMain.endFlag = false;

                AppMain.partiFlag = 0;

                finish();
                Toast.makeText(this, "Complete Sections", Toast.LENGTH_SHORT).show();
                Intent endSec = new Intent(this, MainActivity.class);
                endSec.putExtra("complete", false);
                startActivity(endSec);
            }
        }
    }

    public boolean ValidateForm() {

        if (mp08a014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mp08a013), Toast.LENGTH_SHORT).show();
            mp08a01405.setError("This data is Required!");
            return false;
        } else {
            mp08a01405.setError(null);
        }

        return true;
    }

    private void SaveDraft() {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        AppMain.fc.setIstatus(mp08a01401.isChecked() ? "1" : mp08a01402.isChecked() ? "2" : mp08a01403.isChecked() ? "3"
                : mp08a01404.isChecked() ? "4" : mp08a01405.isChecked() ? "5" : mp08a01406.isChecked() ? "6" : "0");
        AppMain.fc.setEndingDateTime((DateFormat.format("dd-MM-yyyy HH:mm", new Date())).toString());

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updateEnding();

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

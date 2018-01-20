package edu.aku.hassannaqvi.mapps_forms5.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import org.json.JSONException;

import java.util.Date;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_forms5.core.AppMain;
import edu.aku.hassannaqvi.mapps_forms5.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsforms5.R;

public class EndingActivity extends Activity {

    @BindView(R.id.activity_ending)
    RelativeLayout activityEnding;
    @BindView(R.id.mps5a014)
    RadioGroup mps5a014;
    @BindView(R.id.mps5a01401)
    RadioButton mps5a01401;
    @BindView(R.id.mps5a01402)
    RadioButton mps5a01402;
    @BindView(R.id.mps5a01403)
    RadioButton mps5a01403;
    @BindView(R.id.mps5a01404)
    RadioButton mps5a01404;
    @BindView(R.id.mps5a01405)
    RadioButton mps5a01405;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ending);
        ButterKnife.bind(this);

        Boolean check = getIntent().getExtras().getBoolean("complete");

        if (check || AppMain.endFlag) {
            mps5a01401.setEnabled(true);
            mps5a01402.setEnabled(false);
            mps5a01403.setEnabled(false);
            mps5a01404.setEnabled(false);
            mps5a01405.setEnabled(false);

        } else {
            mps5a01401.setEnabled(false);
            mps5a01402.setEnabled(true);
            mps5a01403.setEnabled(true);
            mps5a01404.setEnabled(true);
            mps5a01405.setEnabled(true);

        }


    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {
        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();
        if (ValidateForm()) {
            try {
                SaveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }
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

        if (mps5a014.getCheckedRadioButtonId() == -1) {
            Toast.makeText(this, "" + getString(R.string.mps5a013), Toast.LENGTH_SHORT).show();
            mps5a01405.setError("This data is Required!");
            return false;
        } else {
            mps5a01405.setError(null);
        }

        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();


        AppMain.fc.setIstatus(mps5a01401.isChecked() ? "1" : mps5a01402.isChecked() ? "2" : mps5a01403.isChecked() ? "3"
                : mps5a01404.isChecked() ? "4" : mps5a01405.isChecked() ? "5" : "0");
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

}

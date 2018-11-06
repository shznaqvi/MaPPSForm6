package edu.aku.hassannaqvi.mappsform07.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform07.JSON.GeneratorClass;
import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivityForm11BBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class Form11BActivity extends AppCompatActivity {


    ActivityForm11BBinding bi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_form11_b);
        bi.setCallback(this);
    }

    public void BtnContinue() {
        if (formValidation()) {

            saveDraft();

            if (UpdateDB()) {

                startActivity(new Intent(this, EndingActivity.class)
                        .putExtra("complete", true));
                finish();
            }

        }


    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    private boolean UpdateDB() {

        return true;
    }

    private void saveDraft() {

        JSONObject Json = GeneratorClass.getContainerJSON(bi.fldgrpf11b, true);
        AppMain.fc.setS11B(String.valueOf(Json));

        Log.d("F5-BA", String.valueOf(Json));
    }

    private boolean formValidation() {

        if (!validatorClass.EmptyTextBox(this, bi.mp11b01, getString(R.string.mp11b01))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b01, getString(R.string.mp11b01), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b02, getString(R.string.mp11b02))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b02, getString(R.string.mp11b02), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp11b03, bi.mp11b03a, getString(R.string.mp11b03))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b04, getString(R.string.mp11b01))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b04, getString(R.string.mp11b01), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b05, getString(R.string.mp11b05))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b05, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }
        if (!validatorClass.EmptyTextBox(this, bi.mp11b06, getString(R.string.mp11b05))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b06, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp11b07, bi.mp11b07a, getString(R.string.mp11b06))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b08, getString(R.string.mp11b05))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b08, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b09, getString(R.string.mp11b07))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b09, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X")) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b10, getString(R.string.mp11b07))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b10, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X")) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp11b11, bi.mp11b11a, getString(R.string.mp11b08))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b12, getString(R.string.mp11b07))) {
            return false;
        }

        return validatorClass.PatternTextBox(this, bi.mp11b12, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X");
    }


}

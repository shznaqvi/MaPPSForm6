package edu.aku.hassannaqvi.mappsform15_16.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform15_16.R;
import edu.aku.hassannaqvi.mappsform15_16.core.AppMain;
import edu.aku.hassannaqvi.mappsform15_16.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform15_16.databinding.ActivitySectionBBinding;
import edu.aku.hassannaqvi.mappsform15_16.validation.ClearClass;
import edu.aku.hassannaqvi.mappsform15_16.validation.validatorClass;

public class SectionBActivity extends AppCompatActivity {


    ActivitySectionBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        binding.setCallback(this);

        setupViews();

    }

    private void setupViews() {

        binding.mp15b02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b02f) {

                    binding.fldgrpmp15b03.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b03, false);
                    binding.fldgrpmp15b04.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b04, false);
                    binding.fldgrpmp15b05.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b05, false);
                    binding.fldgrpmp15b06.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b06, false);
                    binding.fldgrpmp15b07.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b07, false);
                    binding.fldgrpmp15b08.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b08, false);
                    binding.fldgrpmp15b09.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b09, false);
                    binding.fldgrpmp15b10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b10, false);


                } else {

                    binding.fldgrpmp15b03.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b03, true);
                    binding.fldgrpmp15b04.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b04, true);
                    binding.fldgrpmp15b05.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b05, true);
                    binding.fldgrpmp15b06.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b06, true);
                    binding.fldgrpmp15b07.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b07, true);
                    binding.fldgrpmp15b08.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b08, true);
                    binding.fldgrpmp15b09.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b09, true);
                    binding.fldgrpmp15b10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b10, true);
                }
            }
        });


    }

    public void BtnContinue() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

        if (formValidation()) {
            try {
                saveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if(UpdateDB()){

                Toast.makeText(this, "Starting New Section", Toast.LENGTH_SHORT).show();

                startActivity(new Intent(this,SectionC_DActivity.class));
                finish();
            }
        }
//        if (formValidation()) {
//            try {S
////                SaveDraft();
////            } catch (JSONException e) {
////                e.printtackTrace();
//            }
//            if (UpdateDB()) {
//                Toast.makeText(this, "Starting Next Section", Toast.LENGTH_SHORT).show();
//
//                finish();
//
//                /*if (AppMain.outcome == 1) {
//
//                    startActivity(new Intent(this, SectionEActivity.class).putExtra("complete", false));
//                } else {
//                    startActivity(new Intent(this, SectionCActivity.class).putExtra("complete", false));
//                }*/
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }

    }

    public void saveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sA = new JSONObject();
        sA.put("mp15b01", binding.mp15b01a.isChecked() ? "1" : binding.mp15b01b.isChecked() ? "2" : binding.mp15b01c.isChecked() ? "3" : "0");
        sA.put("mp15b02", binding.mp15b02a.isChecked() ? "1" : binding.mp15b02b.isChecked() ? "2" : binding.mp15b02c.isChecked() ? "3" : binding.mp15b02d.isChecked() ? "4" : binding.mp15b02e.isChecked() ? "5" : binding.mp15b02f.isChecked() ? "6" : "0");
        sA.put("mp15b03", binding.mp15b03a.isChecked() ? "1" : binding.mp15b03b.isChecked() ? "2" : "0");
        sA.put("mp15b04", binding.mp15b04a.isChecked() ? "1" : binding.mp15b04b.isChecked() ? "2" : binding.mp15b04c.isChecked() ? "3" : binding.mp15b04d.isChecked() ? "4" : "0");
        sA.put("mp15b05", binding.mp15b05a.isChecked() ? "1" : binding.mp15b05b.isChecked() ? "2" : binding.mp15b05c.isChecked() ? "3" : binding.mp15b05d.isChecked() ? "4" : "0");
        sA.put("mp15b06", binding.mp15b06a.isChecked() ? "1" : binding.mp15b06b.isChecked() ? "2" : binding.mp15b06c.isChecked() ? "3" : binding.mp15b06d.isChecked() ? "4" : binding.mp15b06e.isChecked() ? "5" : binding.mp15b06f.isChecked() ? "6" : binding.mp15b06g.isChecked() ? "7" : binding.mp15b06h.isChecked() ? "8" : binding.mp15b06i.isChecked() ? "9" : binding.mp15b06j.isChecked() ? "88" : binding.mp15b06k.isChecked() ? "99" : "0");
        sA.put("mp15b06", binding.mp15b06kx.getText().toString());
        sA.put("mp15b07", binding.mp15b07a.isChecked() ? "1" : binding.mp15b07b.isChecked() ? "2" : "0");
        sA.put("mp15b08", binding.mp15b08a.isChecked() ? "1" : binding.mp15b08b.isChecked() ? "2" : binding.mp15b08c.isChecked() ? "3" : binding.mp15b08d.isChecked() ? "4" : binding.mp15b08e.isChecked() ? "5" : binding.mp15b08f.isChecked() ? "6" : binding.mp15b08g.isChecked() ? "7" : binding.mp15b08h.isChecked() ? "8" : binding.mp15b08i.isChecked() ? "9" : binding.mp15b08j.isChecked() ? "88" : "0");
        sA.put("mp15b08", binding.mp15b08jx.getText().toString());
        sA.put("mp15b09", binding.mp15b09a.isChecked() ? "1" : binding.mp15b09b.isChecked() ? "2" : binding.mp15b09c.isChecked() ? "3" : binding.mp15b09d.isChecked() ? "4" : binding.mp15b09e.isChecked() ? "5" : binding.mp15b09f.isChecked() ? "6" : binding.mp15b09g.isChecked() ? "7" : binding.mp15b09h.isChecked() ? "8" : binding.mp15b09i.isChecked() ? "9" : binding.mp15b09j.isChecked() ? "88" : "0");
        sA.put("mp15b09", binding.mp15b09jx.getText().toString());
        //sCD.put("mp15b09", binding.mp15b01a.isChecked() ? "1" : binding.mp15b01b.isChecked() ? "2" : binding.mp15b01c.isChecked() ? "3" : "0");
        sA.put("mp15b10", binding.mp15b10a.isChecked() ? "1" : binding.mp15b10b.isChecked() ? "2" : binding.mp15b10c.isChecked() ? "3" : binding.mp15b10d.isChecked() ? "99" : "0");

        AppMain.fc.setsB(String.valueOf(sA));
    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

        // 2. UPDATE FORM ROWID
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

    public boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, binding.mp15b01, binding.mp15b01a, getString(R.string.mp15b01))) {

            binding.mp15b01a.setError("This field is required");
            binding.mp15b01.requestFocus();
            return false;
        } else {
            binding.mp15b01.clearFocus();
        }

        if (!validatorClass.EmptyRadioButton(this, binding.mp15b02, binding.mp15b02a, getString(R.string.mp15b01))) {

            binding.mp15b02a.setError("This field is required");
            binding.mp15b02.requestFocus();
            return false;
        } else {
            binding.mp15b02.clearFocus();
        }

        if (!binding.mp15b02f.isChecked()) {

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b03, binding.mp15b03a, getString(R.string.mp15b03))) {
                binding.mp15b03a.setError("This field is required");
                binding.mp15b03.requestFocus();
                return false;
            } else {
                binding.mp15b03.clearFocus();
            }

            if (!binding.mp15b03b.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, binding.mp15b04, binding.mp15b04a, getString(R.string.mp15b04))) {
                    binding.mp15b04a.setError("This field is required");
                    binding.mp15b04.requestFocus();
                    return false;
                } else {
                    binding.mp15b04.clearFocus();
                }
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b05, binding.mp15b05a, getString(R.string.mp15b05))) {
                    binding.mp15b05a.setError("This field is required");
                    binding.mp15b05.requestFocus();
                    return false;
                } else {
                    binding.mp15b05.clearFocus();
                }
            }
//
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b06, binding.mp15b06a, getString(R.string.mp15b06))) {
                binding.mp15b06a.setError("This field is required");
                binding.mp15b06.requestFocus();
                return false;
            } else {
                binding.mp15b06.clearFocus();
            }

            if (binding.mp15b06k.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, binding.mp15b06kx, getString(R.string.mp15b06))) {
                    return false;
                }
            }


            if (!validatorClass.EmptyRadioButton(this, binding.mp15b07, binding.mp15b07a, getString(R.string.mp15b07))) {
                binding.mp15b07a.setError("This field is required");
                binding.mp15b07.requestFocus();

                return false;
            } else {
                binding.mp15b07.clearFocus();
            }

            if (!binding.mp15b07b.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, binding.mp15b08, binding.mp15b08a, getString(R.string.mp15b08))) {
                    binding.mp15b08a.setError("This field is required");
                    binding.mp15b08.requestFocus();

                    return false;
                } else {
                    binding.mp15b08.clearFocus();
                }

                if (binding.mp15b08j.isChecked()) {

                    if (!validatorClass.EmptyTextBox(this, binding.mp15b08jx, getString(R.string.mp15b08))) {
                        binding.mp15b08jx.setError("This field is required");
                        binding.mp15b08jx.requestFocus();
                        return false;
                    } else {

                        binding.mp15b08jx.clearFocus();
                    }
                }
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b09, binding.mp15b09a, getString(R.string.mp15b09))) {
                binding.mp15b09a.setError("This field is required");
                binding.mp15b09.requestFocus();

                return false;
            } else {
                binding.mp15b09.clearFocus();
            }

            if (binding.mp15b09j.isChecked()) {

                if (!validatorClass.EmptyTextBox(this, binding.mp15b09jx, getString(R.string.mp15b09))) {

                    binding.mp15b09jx.setError("This field is required");
                    binding.mp15b09jx.requestFocus();
                    return false;
                } else {

                    binding.mp15b09jx.clearFocus();
                }
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b10, binding.mp15b10a, getString(R.string.mp15b10))) {
                binding.mp15b10a.setError("This field is required");
                binding.mp15b10.requestFocus();

                return false;
            } else {
                binding.mp15b10.clearFocus();

            }


        }
        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

        return true;

    }

    public void BtnEnd() {
        //AppMain.endActivity(this, this);
    }
}

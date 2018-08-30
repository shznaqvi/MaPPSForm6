package edu.aku.hassannaqvi.mappsform15__16.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import edu.aku.hassannaqvi.mappsform15__16.R;
import edu.aku.hassannaqvi.mappsform15__16.core.AppMain;
import edu.aku.hassannaqvi.mappsform15__16.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform15__16.databinding.ActivitySectionBBinding;
import edu.aku.hassannaqvi.mappsform15__16.validation.ClearClass;
import edu.aku.hassannaqvi.mappsform15__16.validation.validatorClass;

public class SectionBActivity extends AppCompatActivity {


    ActivitySectionBBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_section_b);
        binding.setCallback(this);

        this.setTitle(getString(R.string.app_name15));

        setupViews();

    }

    private void setupViews() {

        binding.mp15b02.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b02b) {

                    ClearClass.ClearAllFields(binding.fldgrpmp15b03, false);

                } else {

                    ClearClass.ClearAllFields(binding.fldgrpmp15b03, true);
                }
            }
        });

        binding.mp15b04.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b04a) {

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
                    binding.fldgrpmp15b11.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b11, true);
                    binding.fldgrpmp15b12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b12, true);
                    binding.fldgrpmp15b13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b13, true);
                    binding.fldgrpmp15b14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, true);
                    binding.fldgrpmp15b15.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b15, true);
                    binding.fldgrpmp15b16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b16, true);
                    binding.fldgrpmp15b17.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b17, true);
                    binding.fldgrpmp15b18.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b18, true);
                    binding.fldgrpmp15b19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b19, true);
                    binding.fldgrpmp15b20.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b20, true);


                }

                if (i == R.id.mp15b04b) {

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
                    binding.fldgrpmp15b11.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b11, false);

                }

                if (i == R.id.mp15b04c) {
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
                    binding.fldgrpmp15b11.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b11, false);
                    binding.fldgrpmp15b12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b12, false);
                    binding.fldgrpmp15b13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b13, false);
                    binding.fldgrpmp15b14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, false);
                    binding.fldgrpmp15b15.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b15, false);
                    binding.fldgrpmp15b16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b16, false);
                    binding.fldgrpmp15b17.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b17, false);
                    binding.fldgrpmp15b18.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b18, false);
                    binding.fldgrpmp15b19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b19, false);
                    binding.fldgrpmp15b20.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b20, false);
                }
            }
        });

        binding.mp15b07.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.mp15b07b) {
                    binding.fldgrpmp15b08.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b08, false);
                    binding.fldgrpmp15b09.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b09, false);
                    binding.fldgrpmp15b10.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b10, false);

                } else {

                    binding.fldgrpmp15b08.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b08, true);
                    binding.fldgrpmp15b09.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b09, true);
                    binding.fldgrpmp15b10.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b10, true);

                }
            }
        });

        binding.mp15b10.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i != R.id.mp15b10a) {
                    binding.fldgrpmp15b11.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b11, false);
                } else {
                    binding.fldgrpmp15b11.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b11, true);
                }
            }
        });

        binding.mp15b11.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b11b) {
                    binding.fldgrpmp15b12.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b12, false);
                    binding.fldgrpmp15b13.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b13, false);
                    binding.fldgrpmp15b14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, false);
                    binding.fldgrpmp15b15.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b15, false);
                    binding.fldgrpmp15b16.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b16, false);
                    binding.fldgrpmp15b17.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b17, false);
                } else {

                    binding.fldgrpmp15b12.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b12, true);
                    binding.fldgrpmp15b13.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b13, true);
                    binding.fldgrpmp15b14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, true);
                    binding.fldgrpmp15b15.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b15, true);
                    binding.fldgrpmp15b16.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b16, true);
                    binding.fldgrpmp15b17.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b17, true);

                }
            }
        });

        binding.mp15b13.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b13b) {
                    binding.fldgrpmp15b14.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, false);

                } else {
                    binding.fldgrpmp15b14.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b14, true);
                }
            }
        });

        binding.mp15b18.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {

                if (i == R.id.mp15b18b) {
                    binding.fldgrpmp15b19.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b19, false);
                    binding.fldgrpmp15b20.setVisibility(View.GONE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b20, false);
                } else {

                    binding.fldgrpmp15b19.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b19, true);
                    binding.fldgrpmp15b20.setVisibility(View.VISIBLE);
                    ClearClass.ClearAllFields(binding.fldgrpmp15b20, true);
                }
            }
        });


    }

    public void BtnContinue() {

        if (formValidation()) {
            try {
                saveDraft();
            } catch (JSONException e) {
                e.printStackTrace();
            }

            if (UpdateDB()) {

                startActivity(new Intent(this, SectionC_DActivity.class));
                finish();
            }
        }

    }

    public void saveDraft() throws JSONException {

        JSONObject sB = new JSONObject();
        sB.put("mp15b01", binding.mp15b01a.isChecked() ? "1" : binding.mp15b01b.isChecked() ? "2" : binding.mp15b01c.isChecked() ? "3" : binding.mp15b01d.isChecked() ? "4" : "0");
        sB.put("mp15b02", binding.mp15b02a.isChecked() ? "1" : binding.mp15b02b.isChecked() ? "2" : "0");
        sB.put("mp15b03", binding.mp15b03a.isChecked() ? "1" : binding.mp15b03b.isChecked() ? "2" : binding.mp15b03c.isChecked() ? "3" : binding.mp15b03d.isChecked() ? "4" : binding.mp15b03e.isChecked() ? "5" : "0");
        sB.put("mp15b04", binding.mp15b04a.isChecked() ? "1" : binding.mp15b04b.isChecked() ? "2" : binding.mp15b04c.isChecked() ? "3" : "0");
        sB.put("mp15b05", binding.mp15b05a.isChecked() ? "1" : binding.mp15b05b.isChecked() ? "2" : binding.mp15b05c.isChecked() ? "3" : binding.mp15b05d.isChecked() ? "4" : binding.mp15b05e.isChecked() ? "5" : "0");
        sB.put("mp15b06", binding.mp15b06a.isChecked() ? "1" : binding.mp15b06b.isChecked() ? "2" : binding.mp15b06c.isChecked() ? "3" : binding.mp15b06d.isChecked() ? "4" : binding.mp15b06e.isChecked() ? "5" : "0");
        sB.put("mp15b07", binding.mp15b07a.isChecked() ? "1" : binding.mp15b07b.isChecked() ? "2" : "0");
        sB.put("mp15b08", binding.mp15b08a.isChecked() ? "1" : binding.mp15b08b.isChecked() ? "2" : binding.mp15b08c.isChecked() ? "3" : binding.mp15b08d.isChecked() ? "4" : binding.mp15b08e.isChecked() ? "5" : binding.mp15b08f.isChecked() ? "6" : binding.mp15b08g.isChecked() ? "7" : binding.mp15b08h.isChecked() ? "8" : binding.mp15b08i.isChecked() ? "9" : binding.mp15b08j.isChecked() ? "10" : binding.mp15b08k.isChecked() ? "11" : binding.mp15b08l.isChecked() ? "12" : binding.mp15b08m.isChecked() ? "88" : "0");
        sB.put("mp15b08x", binding.mp15b08mx.getText().toString());
        sB.put("mp15b09", binding.mp15b09a.isChecked() ? "1" : binding.mp15b09b.isChecked() ? "2" : binding.mp15b09c.isChecked() ? "3" : binding.mp15b09d.isChecked() ? "4" : binding.mp15b09e.isChecked() ? "5" : "0");
        sB.put("mp15b10", binding.mp15b10a.isChecked() ? "1" : binding.mp15b10b.isChecked() ? "2" : binding.mp15b10c.isChecked() ? "3" : binding.mp15b10d.isChecked() ? "4" : binding.mp15b10e.isChecked() ? "5" : "0");
        sB.put("mp15b11", binding.mp15b11a.isChecked() ? "1" : binding.mp15b11b.isChecked() ? "2" : "0");
        sB.put("mp15b12", binding.mp15b12a.isChecked() ? "1" : binding.mp15b12b.isChecked() ? "2" : binding.mp15b12c.isChecked() ? "3" : binding.mp15b12d.isChecked() ? "4" : binding.mp15b12e.isChecked() ? "5" : binding.mp15b12f.isChecked() ? "6" : binding.mp15b12g.isChecked() ? "7" : binding.mp15b12h.isChecked() ? "8" : binding.mp15b12i.isChecked() ? "9" : binding.mp15b12j.isChecked() ? "88" : binding.mp15b12k.isChecked() ? "99" : "0");
        sB.put("mp15b12x", binding.mp15b12jx.getText().toString());
        sB.put("mp15b13", binding.mp15b13a.isChecked() ? "1" : binding.mp15b13b.isChecked() ? "2" : "0");
        sB.put("mp15b14", binding.mp15b14a.isChecked() ? "1" : binding.mp15b14b.isChecked() ? "2" : binding.mp15b14c.isChecked() ? "3" : binding.mp15b14d.isChecked() ? "4" : binding.mp15b14e.isChecked() ? "5" : binding.mp15b14f.isChecked() ? "6" : binding.mp15b14g.isChecked() ? "7" : binding.mp15b14h.isChecked() ? "8" : binding.mp15b14i.isChecked() ? "9" : binding.mp15b14j.isChecked() ? "88" : "0");
        sB.put("mp15b14x", binding.mp15b14jx.getText().toString());
        sB.put("mp15b15", binding.mp15b15a.isChecked() ? "1" : binding.mp15b15b.isChecked() ? "2" : "0");
        sB.put("mp15b16", binding.mp15b16a.isChecked() ? "1" : binding.mp15b16b.isChecked() ? "2" : binding.mp15b16c.isChecked() ? "3" : binding.mp15b16d.isChecked() ? "4" : binding.mp15b16e.isChecked() ? "5" : binding.mp15b16f.isChecked() ? "6" : binding.mp15b16g.isChecked() ? "7" : binding.mp15b16h.isChecked() ? "8" : binding.mp15b16i.isChecked() ? "9" : binding.mp15b16j.isChecked() ? "88" : "0");
        sB.put("mp15b16x", binding.mp15b16jx.getText().toString());
        sB.put("mp15b17", binding.mp15b17a.isChecked() ? "1" : binding.mp15b17b.isChecked() ? "2" : binding.mp15b17c.isChecked() ? "3" : binding.mp15b17d.isChecked() ? "99" : "0");
        sB.put("mp15b18", binding.mp15b18a.isChecked() ? "1" : binding.mp15b18b.isChecked() ? "2" : "0");
        sB.put("mp15b19", binding.mp15b19a.isChecked() ? "1" : binding.mp15b19b.isChecked() ? "2" : binding.mp15b19c.isChecked() ? "3" : binding.mp15b19d.isChecked() ? "4" : "0");
        sB.put("mp15b20", binding.mp15b20a.isChecked() ? "1" : binding.mp15b20b.isChecked() ? "2" : binding.mp15b20c.isChecked() ? "99" : "0");
        sB.put("mp15b21", binding.mp15b21a.isChecked() ? "1" : binding.mp15b21b.isChecked() ? "2" : binding.mp15b21c.isChecked() ? "3" : binding.mp15b21d.isChecked() ? "4" : binding.mp15b21e.isChecked() ? "5" : "0");
        sB.put("mp15b22", binding.mp15b22a.isChecked() ? "1" : binding.mp15b22b.isChecked() ? "2" : binding.mp15b22c.isChecked() ? "99" : "0");
        AppMain.fc.setsB(String.valueOf(sB));
    }

    private boolean UpdateDB() {

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesB();

        if (updcount == 1) {
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


        //return true;
    }

    public boolean formValidation() {

        if (!validatorClass.EmptyRadioButton(this, binding.mp15b01, binding.mp15b01a, getString(R.string.mp15b01))) {
            return false;
        }
        if (!validatorClass.EmptyRadioButton(this, binding.mp15b02, binding.mp15b02a, getString(R.string.mp15b02))) {
            return false;
        }

        if (!binding.mp15b02b.isChecked()) {

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b03, binding.mp15b03a, getString(R.string.mp15b03))) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, binding.mp15b04, binding.mp15b04a, getString(R.string.mp15b04))) {
            return false;
        }

        //===================if it is Haan==================================

        if (binding.mp15b04a.isChecked()) {

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b05, binding.mp15b05a, getString(R.string.mp15b05))) {

                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b06, binding.mp15b06a, getString(R.string.mp15b06))) {

                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b07, binding.mp15b07a, getString(R.string.mp15b07))) {

                return false;
            }

            if (!binding.mp15b07b.isChecked()) {

                if (!validatorClass.EmptyRadioButton(this, binding.mp15b08, binding.mp15b08a, getString(R.string.mp15b08))) {

                    return false;
                }

                if (binding.mp15b08m.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, binding.mp15b08mx, getString(R.string.mp15b08))) {
                        return false;
                    }
                }

                if (!validatorClass.EmptyRadioButton(this, binding.mp15b09, binding.mp15b09a, getString(R.string.mp15b09))) {

                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b10, binding.mp15b10a, getString(R.string.mp15b10))) {

                    return false;
                }

                if (binding.mp15b10a.isChecked()) {

                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b11, binding.mp15b11a, getString(R.string.mp15b11))) {
                        return false;
                    }

                    if (!binding.mp15b11b.isChecked()) {

                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b12, binding.mp15b12a, getString(R.string.mp15b12))) {
                            return false;
                        }

                        if (binding.mp15b12j.isChecked()) {
                            if (!validatorClass.EmptyTextBox(this, binding.mp15b12jx, getString(R.string.mp15b12))) {
                                return false;
                            }
                        }

                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b13, binding.mp15b13a, getString(R.string.mp15b13))) {
                            return false;
                        }
                        if (!binding.mp15b13b.isChecked()) {
                            if (!validatorClass.EmptyRadioButton(this, binding.mp15b14, binding.mp15b14a, getString(R.string.mp15b14))) {
                                return false;
                            }

                            if (binding.mp15b14j.isChecked()) {
                                if (!validatorClass.EmptyTextBox(this, binding.mp15b14jx, getString(R.string.mp15b14))) {
                                    return false;
                                }
                            }
                        }
                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b15, binding.mp15b15a, getString(R.string.mp15b15))) {
                            return false;
                        }

                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b16, binding.mp15b16a, getString(R.string.mp15b16))) {
                            return false;
                        }

                        if (binding.mp15b16j.isChecked()) {
                            if (!validatorClass.EmptyTextBox(this, binding.mp15b16jx, getString(R.string.mp15b16))) {
                                return false;
                            }
                        }
                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b17, binding.mp15b17a, getString(R.string.mp15b17))) {
                            return false;
                        }

                    }
                }else {

                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b12, binding.mp15b12a, getString(R.string.mp15b12))) {
                        return false;
                    }

                    if (binding.mp15b12j.isChecked()) {
                        if (!validatorClass.EmptyTextBox(this, binding.mp15b12jx, getString(R.string.mp15b12))) {
                            return false;
                        }
                    }

                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b13, binding.mp15b13a, getString(R.string.mp15b13))) {
                        return false;
                    }
                    if (!binding.mp15b13b.isChecked()) {
                        if (!validatorClass.EmptyRadioButton(this, binding.mp15b14, binding.mp15b14a, getString(R.string.mp15b14))) {
                            return false;
                        }

                        if (binding.mp15b14j.isChecked()) {
                            if (!validatorClass.EmptyTextBox(this, binding.mp15b14jx, getString(R.string.mp15b14))) {
                                return false;
                            }
                        }
                    }
                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b15, binding.mp15b15a, getString(R.string.mp15b15))) {
                        return false;
                    }

                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b16, binding.mp15b16a, getString(R.string.mp15b16))) {
                        return false;
                    }

                    if (binding.mp15b16j.isChecked()) {
                        if (!validatorClass.EmptyTextBox(this, binding.mp15b16jx, getString(R.string.mp15b16))) {
                            return false;
                        }
                    }
                    if (!validatorClass.EmptyRadioButton(this, binding.mp15b17, binding.mp15b17a, getString(R.string.mp15b17))) {
                        return false;
                    }
                }

            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b18, binding.mp15b18a, getString(R.string.mp15b18))) {
                return false;
            }

            if (!binding.mp15b18b.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b19, binding.mp15b19a, getString(R.string.mp15b19))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b20, binding.mp15b20a, getString(R.string.mp15b20))) {
                    return false;
                }
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b21, binding.mp15b21a, getString(R.string.mp15b21))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b22, binding.mp15b22a, getString(R.string.mp15b22))) {
                return false;
            }


        }

        //============if it is No, in intervention skip to Q12==============================================

        if (binding.mp15b04b.isChecked()) {
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b12, binding.mp15b12a, getString(R.string.mp15b12))) {
                return false;
            }

            if (binding.mp15b12j.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, binding.mp15b12jx, getString(R.string.mp15b12))) {
                    return false;
                }
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b13, binding.mp15b13a, getString(R.string.mp15b13))) {
                return false;
            }
            if (!binding.mp15b13b.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b14, binding.mp15b14a, getString(R.string.mp15b14))) {
                    return false;
                }

                if (binding.mp15b14j.isChecked()) {
                    if (!validatorClass.EmptyTextBox(this, binding.mp15b14jx, getString(R.string.mp15b14))) {
                        return false;
                    }
                }
            }
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b15, binding.mp15b15a, getString(R.string.mp15b15))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b16, binding.mp15b16a, getString(R.string.mp15b16))) {
                return false;
            }

            if (binding.mp15b16j.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, binding.mp15b16jx, getString(R.string.mp15b16))) {
                    return false;
                }
            }
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b17, binding.mp15b17a, getString(R.string.mp15b17))) {
                return false;
            }
            if (!validatorClass.EmptyRadioButton(this, binding.mp15b18, binding.mp15b18a, getString(R.string.mp15b18))) {
                return false;
            }

            if (!binding.mp15b18b.isChecked()) {
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b19, binding.mp15b19a, getString(R.string.mp15b19))) {
                    return false;
                }
                if (!validatorClass.EmptyRadioButton(this, binding.mp15b20, binding.mp15b20a, getString(R.string.mp15b20))) {
                    return false;
                }
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b21, binding.mp15b21a, getString(R.string.mp15b21))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b22, binding.mp15b22a, getString(R.string.mp15b22))) {
                return false;
            }

        }

        //=======if it is No, in control skip to Q21========================================

        if (binding.mp15b04c.isChecked()) {

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b21, binding.mp15b21a, getString(R.string.mp15b21))) {
                return false;
            }

            if (!validatorClass.EmptyRadioButton(this, binding.mp15b22, binding.mp15b22a, getString(R.string.mp15b22))) {
                return false;
            }

        }


        return true;

    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}

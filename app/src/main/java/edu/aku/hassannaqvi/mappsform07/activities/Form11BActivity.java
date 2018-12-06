package edu.aku.hassannaqvi.mappsform07.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import org.json.JSONObject;

import java.util.Arrays;

import edu.aku.hassannaqvi.mappsform07.JSON.GeneratorClass;
import edu.aku.hassannaqvi.mappsform07.R;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform07.databinding.ActivityForm11BBinding;
import edu.aku.hassannaqvi.mappsform07.validation.validatorClass;

public class Form11BActivity extends AppCompatActivity {


    ActivityForm11BBinding bi;
    double measur01a, measur01b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_form11_b);
        bi.setCallback(this);

        setupViews();
    }

    private void setupViews() {

        bi.mp11b01id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b02id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b04id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b05id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b06id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b08id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b09id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b10id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));
        bi.mp11b12id.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, AppMain.loginMem));

        bi.mp11b02id.setEnabled(false);
        bi.mp11b06id.setEnabled(false);
        bi.mp11b10id.setEnabled(false);

        bi.mp11b01id.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i > 0) {
                    bi.mp11b02id.setEnabled(true);
                    String[] users = new String[AppMain.loginMem.length - 1];
                    int j = 0;
                    for (String s : AppMain.loginMem) {
                        if (!s.equals(bi.mp11b01id.getSelectedItem().toString())) {
                            users[j] = s;
                            j++;
                        }
                    }
                    bi.mp11b02id.setAdapter(new ArrayAdapter<String>(Form11BActivity.this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(users)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        bi.mp11b05id.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i > 0) {
                    bi.mp11b06id.setEnabled(true);
                    String[] users = new String[AppMain.loginMem.length - 1];
                    int j = 0;
                    for (String s : AppMain.loginMem) {
                        if (!s.equals(bi.mp11b05id.getSelectedItem().toString())) {
                            users[j] = s;
                            j++;
                        }
                    }
                    bi.mp11b06id.setAdapter(new ArrayAdapter<String>(Form11BActivity.this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(users)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        bi.mp11b09id.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i > 0) {
                    bi.mp11b10id.setEnabled(true);
                    String[] users = new String[AppMain.loginMem.length - 1];
                    int j = 0;
                    for (String s : AppMain.loginMem) {
                        if (!s.equals(bi.mp11b09id.getSelectedItem().toString())) {
                            users[j] = s;
                            j++;
                        }
                    }
                    bi.mp11b10id.setAdapter(new ArrayAdapter<String>(Form11BActivity.this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(users)));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


    }

    @Override
    public void onBackPressed() {

        Toast.makeText(this, "You can't go back!", Toast.LENGTH_SHORT).show();
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

        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates11B();

        // Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
        return updcount == 1;

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

        if (!validatorClass.RangeTextBox(this, bi.mp11b01, 100.0, 180.0, getString(R.string.mp11b01), "Height")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp11b01id, getString(R.string.mp11b01))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b02, getString(R.string.mp11b02))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b02, getString(R.string.mp11b02), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.mp11b02, 100.0, 180.0, getString(R.string.mp11b02), "Height")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp11b02id, getString(R.string.mp11b02))) {
            return false;
        }

        double result1 = Math.abs(Double.parseDouble(bi.mp11b01.getText().toString()) - Double.parseDouble(bi.mp11b02.getText().toString()));

        if (result1 > 1) {
            bi.mp11b01.setEnabled(false);
            bi.mp11b02.setEnabled(false);
            bi.mp11b01id.setEnabled(false);
            bi.mp11b02id.setEnabled(false);
            //bi.fldgrpmp11b03.setVisibility(View.GONE);
            bi.fldgrpmp11b01.setVisibility(View.VISIBLE);

            if (!validatorClass.EmptyTextBox(this, bi.mp11b04, getString(R.string.mp11b01))) {
                return false;
            }
            if (!validatorClass.PatternTextBox(this, bi.mp11b04, getString(R.string.mp11b01), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.mp11b04, 100.0, 180.0, getString(R.string.mp11b02), "Height")) {
                return false;
            }
            if (!validatorClass.EmptySpinner(this, bi.mp11b04id, getString(R.string.mp11b02))) {
                return false;
            }

        } else {
            bi.mp11b01.setEnabled(true);
            bi.mp11b02.setEnabled(true);
            bi.mp11b01id.setEnabled(true);
            bi.mp11b02id.setEnabled(true);
           // bi.fldgrpmp11b03.setVisibility(View.VISIBLE);
            bi.fldgrpmp11b01.setVisibility(View.GONE);

//
//            if (!validatorClass.EmptyRadioButton(this, bi.mp11b03, bi.mp11b03a, getString(R.string.mp11b03))) {
//                return false;
//            }



        }


        if (!validatorClass.EmptyTextBox(this, bi.mp11b05, getString(R.string.mp11b05))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b05, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.mp11b05, 30.0, 99.0, getString(R.string.mp11b02), "Weight")) {
            return false;
        }
        if (!validatorClass.EmptySpinner(this, bi.mp11b05id, getString(R.string.mp11b02))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b06, getString(R.string.mp11b05))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b06, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
            return false;
        }
        if (!validatorClass.RangeTextBox(this, bi.mp11b06, 30.0, 99.0, getString(R.string.mp11b02), "Weight")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp11b06id, getString(R.string.mp11b02))) {
            return false;
        }

        double result2 = Math.abs(Double.parseDouble(bi.mp11b05.getText().toString()) - Double.parseDouble(bi.mp11b06.getText().toString()));

        if (result2 > 0.5) {
            bi.mp11b05.setEnabled(false);
            bi.mp11b06.setEnabled(false);
            bi.mp11b05id.setEnabled(false);
            bi.mp11b06id.setEnabled(false);
           // bi.fldgrpmp11b06.setVisibility(View.GONE);
            bi.fldgrpmp11b05.setVisibility(View.VISIBLE);

            if (!validatorClass.EmptyTextBox(this, bi.mp11b08, getString(R.string.mp11b05))) {
                return false;
            }

            if (!validatorClass.PatternTextBox(this, bi.mp11b08, getString(R.string.mp11b05), "^(\\d{3,3}\\.\\d{1,1})$", "XXX.X")) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp11b08, 30.0, 99.0, getString(R.string.mp11b02), "Weight")) {
                return false;
            }
            if (!validatorClass.EmptySpinner(this, bi.mp11b08id, getString(R.string.mp11b02))) {
                return false;
            }


        } else {
            bi.mp11b05.setEnabled(true);
            bi.mp11b06.setEnabled(true);
            bi.mp11b05id.setEnabled(true);
            bi.mp11b06id.setEnabled(true);
           // bi.fldgrpmp11b06.setVisibility(View.VISIBLE);
            bi.fldgrpmp11b05.setVisibility(View.GONE);


//            if (!validatorClass.EmptyRadioButton(this, bi.mp11b07, bi.mp11b07a, getString(R.string.mp11b06))) {
//                return false;
//            }



        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b09, getString(R.string.mp11b07))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b09, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X")) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp11b09, 15.0, 45.0, getString(R.string.mp11b07), "MUAC")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp11b09id, getString(R.string.mp11b07))) {
            return false;
        }

        if (!validatorClass.EmptyTextBox(this, bi.mp11b10, getString(R.string.mp11b07))) {
            return false;
        }

        if (!validatorClass.PatternTextBox(this, bi.mp11b10, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X")) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp11b10, 15.0, 45.0, getString(R.string.mp11b07), "MUAC")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp11b10id, getString(R.string.mp11b07))) {
            return false;
        }

        double result3 = Math.abs(Double.parseDouble(bi.mp11b09.getText().toString()) - Double.parseDouble(bi.mp11b10.getText().toString()));

        if (result3 > 0.5) {
            bi.mp11b10.setEnabled(false);
            bi.mp11b09.setEnabled(false);
            bi.mp11b09id.setEnabled(false);
            bi.mp11b10id.setEnabled(false);
          //  bi.fldgrpmp11b08.setVisibility(View.GONE);
            bi.fldgrpmp11b07.setVisibility(View.VISIBLE);

            if (!validatorClass.EmptyTextBox(this, bi.mp11b12, getString(R.string.mp11b07))) {
                return false;
            }

            if (!validatorClass.PatternTextBox(this, bi.mp11b12, getString(R.string.mp11b07), "^(\\d{2,2}\\.\\d{1,1})$", "XX.X")) {
                return false;
            }
            if (!validatorClass.RangeTextBox(this, bi.mp11b12, 15.0, 45.0, getString(R.string.mp11b07), "MUAC")) {
                return false;
            }

            if (!validatorClass.EmptySpinner(this, bi.mp11b12id, getString(R.string.mp11b07))) {
                return false;
            }

        } else {
            bi.mp11b10.setEnabled(true);
            bi.mp11b09.setEnabled(true);
            bi.mp11b09id.setEnabled(true);
            bi.mp11b10id.setEnabled(true);
           // bi.fldgrpmp11b08.setVisibility(View.VISIBLE);
            bi.fldgrpmp11b07.setVisibility(View.GONE);





//            if (!validatorClass.EmptyRadioButton(this, bi.mp11b11, bi.mp11b11a, getString(R.string.mp11b08))) {
//                return false;
//            }



        }


        return true;
    }


}

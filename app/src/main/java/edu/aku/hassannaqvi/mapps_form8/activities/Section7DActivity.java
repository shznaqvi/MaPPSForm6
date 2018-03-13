package edu.aku.hassannaqvi.mapps_form8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;
import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mapps_form8.core.AppMain;
import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mapps_form8.validation.validatorClass;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySection7DBinding;

public class Section7DActivity extends AppCompatActivity {
    private static final String TAG = Section7DActivity.class.getSimpleName();

    ActivitySection7DBinding bi;
    boolean flag_q25 = false, flag_q29 = false, flag_q33 = false, flag_q37 = false;

    @BindViews({R.id.mp07q22id, R.id.mp07q23id, R.id.mp07q25id, R.id.mp07q26id, R.id.mp07q27id,
            R.id.mp07q29id, R.id.mp07q30id, R.id.mp07q31id, R.id.mp07q33id, R.id.mp07q34id, R.id.mp07q35id, R.id.mp07q37id})
    List<Spinner> grpSpinners;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section7_d);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section7_d);
        ButterKnife.bind(this);

        for (Spinner sp : grpSpinners) {
            sp.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
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

                Intent sece = new Intent(this, EndingActivity.class);
                sece.putExtra("complete", true);
                startActivity(sece);


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }


    public boolean ValidateForm() {

        // Weight 1

        if (!validatorClass.EmptyTextBox(this, bi.mp07q22, getString(R.string.mp07q22))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q22, 2.5, 8.0, getString(R.string.mp07q22), " kg")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q22id, getString(R.string.mp07q22id))) {
            return false;
        }

        // Height 1

        if (!validatorClass.EmptyTextBox(this, bi.mp07q26, getString(R.string.mp07q26))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q26, 2.5, 8.0, getString(R.string.mp07q26), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q26id, getString(R.string.mp07q26id))) {
            return false;
        }

        // Head circumference 1


        if (!validatorClass.EmptyTextBox(this, bi.mp07q30, getString(R.string.mp07q30))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q30, 2.5, 8.0, getString(R.string.mp07q30), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q30id, getString(R.string.mp07q30id))) {
            return false;
        }

        // Left middle upper arm 1

        if (!validatorClass.EmptyTextBox(this, bi.mp07q34, getString(R.string.mp07q34))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q34, 2.5, 8.0, getString(R.string.mp07q34), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q34id, getString(R.string.mp07q34id))) {
            return false;
        }


        // Weight 2
        if (!validatorClass.EmptyTextBox(this, bi.mp07q23, getString(R.string.mp07q23))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q23, 2.5, 8.0, getString(R.string.mp07q23), " kg")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q23id, getString(R.string.mp07q23id))) {
            return false;
        }

        if (!validatorClass.DuplicateItemSelected(this, bi.mp07q22id, bi.mp07q23id, getString(R.string.mp07q23))) {
            return false;
        }


        // Weight 3
        double q25 = Double.parseDouble(bi.mp07q22.getText().toString()) - Double.parseDouble(bi.mp07q23.getText().toString());

        if (Math.signum(q25) == -1) {
            q25 = q25 * -1;
        }

        if (!flag_q25) {
            if (q25 > 0.5) {
                flag_q25 = true;

                bi.fldGrpmp07q25.setVisibility(View.VISIBLE);
                bi.mp07q25.requestFocus();
                bi.mp07q22.setEnabled(false);
                bi.mp07q23.setEnabled(false);

                bi.mp07q22id.setEnabled(false);
                bi.mp07q23id.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp07q22 & mp07q23: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q25) {
            if (!validatorClass.EmptyTextBox(this, bi.mp07q25, getString(R.string.mp07q25))) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp07q25, 2.5, 8.0, getString(R.string.mp07q25), " kg")) {
                return false;
            }

            if (!validatorClass.EmptySpinner(this, bi.mp07q25id, getString(R.string.mp07q25id))) {
                return false;
            }

        }

        //============= End of weights

        // Height 2
        if (!validatorClass.EmptyTextBox(this, bi.mp07q27, getString(R.string.mp07q27))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q27, 2.5, 8.0, getString(R.string.mp07q27), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q27id, getString(R.string.mp07q27id))) {
            return false;
        }

        if (!validatorClass.DuplicateItemSelected(this, bi.mp07q26id, bi.mp07q27id, getString(R.string.mp07q26))) {
            return false;
        }

        // Height 3

        double q29 = Double.parseDouble(bi.mp07q26.getText().toString()) - Double.parseDouble(bi.mp07q27.getText().toString());

        if (Math.signum(q29) == -1) {
            q29 = q29 * -1;
        }

        if (!flag_q29) {
            if (q29 > 1) {
                flag_q29 = true;

                bi.fldGrpmp07q29.setVisibility(View.VISIBLE);
                bi.mp07q29.requestFocus();
                bi.mp07q26.setEnabled(false);
                bi.mp07q27.setEnabled(false);

                bi.mp07q26id.setEnabled(false);
                bi.mp07q27id.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp07q26 & mp07q27: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q29) {
            if (!validatorClass.EmptyTextBox(this, bi.mp07q29, getString(R.string.mp07q29))) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp07q29, 2.5, 8.0, getString(R.string.mp07q29), " cm")) {
                return false;
            }

            if (!validatorClass.EmptySpinner(this, bi.mp07q29id, getString(R.string.mp07q29id))) {
                return false;
            }

        }


        // End of Height 3

        // Head 2
        if (!validatorClass.EmptyTextBox(this, bi.mp07q31, getString(R.string.mp07q31))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q31, 2.5, 8.0, getString(R.string.mp07q31), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q31id, getString(R.string.mp07q31id))) {
            return false;
        }

        if (!validatorClass.DuplicateItemSelected(this, bi.mp07q30id, bi.mp07q31id, getString(R.string.mp07q30))) {
            return false;
        }

        // Head 3

        double q33 = Double.parseDouble(bi.mp07q30.getText().toString()) - Double.parseDouble(bi.mp07q31.getText().toString());

        if (Math.signum(q33) == -1) {
            q33 = q33 * -1;
        }

        if (!flag_q33) {
            if (q33 > 1) {
                flag_q33 = true;

                bi.fldGrpmp07q33.setVisibility(View.VISIBLE);
                bi.mp07q33.requestFocus();
                bi.mp07q30.setEnabled(false);
                bi.mp07q31.setEnabled(false);

                bi.mp07q30id.setEnabled(false);
                bi.mp07q31id.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp07q30 & mp07q31: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q33) {
            if (!validatorClass.EmptyTextBox(this, bi.mp07q33, getString(R.string.mp07q33))) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp07q33, 2.5, 8.0, getString(R.string.mp07q33), " kg")) {
                return false;
            }

            if (!validatorClass.EmptySpinner(this, bi.mp07q33id, getString(R.string.mp07q33id))) {
                return false;
            }

        }


        // arm 2
        if (!validatorClass.EmptyTextBox(this, bi.mp07q35, getString(R.string.mp07q25))) {
            return false;
        }

        if (!validatorClass.RangeTextBox(this, bi.mp07q35, 2.5, 8.0, getString(R.string.mp07q35), " cm")) {
            return false;
        }

        if (!validatorClass.EmptySpinner(this, bi.mp07q35id, getString(R.string.mp07q35id))) {
            return false;
        }

        if (!validatorClass.DuplicateItemSelected(this, bi.mp07q34id, bi.mp07q35id, getString(R.string.mp07q34))) {
            return false;
        }


        // arm 3

        double q37 = Double.parseDouble(bi.mp07q30.getText().toString()) - Double.parseDouble(bi.mp07q31.getText().toString());

        if (Math.signum(q37) == -1) {
            q37 = q37 * -1;
        }

        if (!flag_q37) {
            if (q37 > 1) {
                flag_q37 = true;

                bi.fldGrpmp07q37.setVisibility(View.VISIBLE);
                bi.mp07q37.requestFocus();
                bi.mp07q34.setEnabled(false);
                bi.mp07q35.setEnabled(false);

                bi.mp07q34id.setEnabled(false);
                bi.mp07q35id.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp07q34 & mp07q35: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q37) {
            if (!validatorClass.EmptyTextBox(this, bi.mp07q37, getString(R.string.mp07q37))) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp07q37, 2.5, 8.0, getString(R.string.mp07q37), " kg")) {
                return false;
            }

            if (!validatorClass.EmptySpinner(this, bi.mp07q37id, getString(R.string.mp07q37id))) {
                return false;
            }

        }


        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp07q22", bi.mp07q22.getText().toString());
        form4.put("mp07q22id", bi.mp07q22id.getSelectedItem().toString());

        form4.put("mp07q23", bi.mp07q23.getText().toString());
        form4.put("mp07q23id", bi.mp07q23id.getSelectedItem().toString());

        form4.put("mp07q24", flag_q25 ? "1" : "2");

        form4.put("mp07q25", bi.mp07q25.getText().toString());
        form4.put("mp07q25id", bi.mp07q25id.getSelectedItem().toString());


        form4.put("mp07q26", bi.mp07q26.getText().toString());
        form4.put("mp07q26id", bi.mp07q26id.getSelectedItem().toString());

        form4.put("mp07q27", bi.mp07q27.getText().toString());
        form4.put("mp07q27id", bi.mp07q27id.getSelectedItem().toString());

        form4.put("mp07q28", flag_q29 ? "1" : "2");

        form4.put("mp07q29", bi.mp07q29.getText().toString());
        form4.put("mp07q29", bi.mp07q29id.getSelectedItem().toString());

        form4.put("mp07q30", bi.mp07q30.getText().toString());
        form4.put("mp07q30id", bi.mp07q30id.getSelectedItem().toString());

        form4.put("mp07q31", bi.mp07q31.getText().toString());
        form4.put("mp07q31id", bi.mp07q31id.getSelectedItem().toString());

        form4.put("mp07q32", flag_q33 ? "1" : "2");

        form4.put("mp07q33", bi.mp07q33.getText().toString());
        form4.put("mp07q33id", bi.mp07q33id.getSelectedItem().toString());

        form4.put("mp07q34", bi.mp07q34.getText().toString());
        form4.put("mp07q34id", bi.mp07q34id.getSelectedItem().toString());

        form4.put("mp07q35", bi.mp07q35.getText().toString());
        form4.put("mp07q35id", bi.mp07q35id.getSelectedItem().toString());

        form4.put("mp07q36", flag_q25 ? "1" : "2");

        form4.put("mp07q37", bi.mp07q37.getText().toString());
        form4.put("mp07q37id", bi.mp07q37id.getSelectedItem().toString());


        AppMain.fc.setS7D(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updates7D();

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

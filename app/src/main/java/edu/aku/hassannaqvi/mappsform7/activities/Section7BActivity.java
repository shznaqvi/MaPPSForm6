package edu.aku.hassannaqvi.mappsform7.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import edu.aku.hassannaqvi.mappsform7.R;
import edu.aku.hassannaqvi.mappsform7.contracts.FormsContract;
import edu.aku.hassannaqvi.mappsform7.core.AppMain;
import edu.aku.hassannaqvi.mappsform7.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform7.databinding.ActivitySection7BBinding;
import edu.aku.hassannaqvi.mappsform7.validation.validatorClass;

public class Section7BActivity extends AppCompatActivity {

    ActivitySection7BBinding bi;
    Collection<FormsContract> child;
    DatabaseHelper db;
    String maxdate1Week;

    Boolean isChecked = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section7_b);
        bi = DataBindingUtil.setContentView(this, R.layout.activity_section7_b);
        maxdate1Week = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTimeInMillis() - ((AppMain.MILLISECONDS_IN_WEEK)));

        bi.mp07q17.setManager(getSupportFragmentManager());
        bi.mp07q20.setManager(getSupportFragmentManager());
        bi.mp07q17.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
        bi.mp07q20.setMaxDate(new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis()));
        bi.mp07q17.setMinDate(maxdate1Week);

        bi.setCallback(this);

        child = new ArrayList<>();
        db = new DatabaseHelper(this);

        if (AppMain.formType.equals("7")) {
            bi.appHeader.setText(R.string.mp07heading1);
            bi.fldGrpform7.setVisibility(View.VISIBLE);
            bi.fldGrpName.setVisibility(View.VISIBLE);
        } else {
            bi.appHeader.setText(R.string.mp10heading1);
            bi.fldGrpcheck.setVisibility(View.VISIBLE);
            bi.fldGrpdob.setVisibility(View.GONE);
            bi.fldGrpmp07q19.setVisibility(View.VISIBLE);
            bi.fldGrpform7.setVisibility(View.GONE);
            bi.fldGrpName.setVisibility(View.GONE);
            bi.mp07q16.setText(null);
            bi.mp07q17.setText(null);
            bi.mp07q18.clearCheck();
            bi.mp07q21.setText(null);
        }

        bi.mp07q19a.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b && AppMain.formType.equals("7")) {
                    bi.fldGrpName.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpName.setVisibility(View.GONE);
                    bi.mp07q21.setText(null);
                }
            }
        });

        bi.mp07q16.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                isChecked = false;
                bi.fldGrpcheck.setVisibility(View.GONE);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        bi.mp07q17.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                bi.mp07q20.setMinDate(AppMain.convertDateFormat(bi.mp07q17.getText().toString()));

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }

    public Boolean formValidation() {

        if (AppMain.formType.equals("7")) {


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
                return validatorClass.EmptyTextBox(this, bi.mp07q21, getString(R.string.mp07q21));
            }

        } else {
            return validatorClass.EmptyTextBox(this, bi.mp07q20, getString(R.string.mp07q20));
        }


        return true;

    }


    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();


        JSONObject sB = new JSONObject();

        if (AppMain.formType.equals("7")) {
            AppMain.fc.setChildId(bi.mp07q16.getText().toString());
            //sB.put("mp07q16", bi.mp07q16.getText().toString());
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

                if (bi.mp07q19a.isChecked()) {
                    startActivity(new Intent(this, Section7DActivity.class));
                } else {
                    startActivity(new Intent(this, EndingActivity.class).putExtra("complete", true));
                }


            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    public void BtnEnd() {
        AppMain.endActivity(this, this);
    }

    public void BtnCheckID() {
        if (!bi.mp07q16.getText().toString().trim().isEmpty()) {
            child = db.checkDuplicateInfant(InfoActivity.id + bi.mp07q16.getText().toString());

            if (child.size() < 1) {
                isChecked = true;
                bi.fldGrpcheck.setVisibility(View.VISIBLE);

            } else {
                Toast.makeText(this, "This ID already exists.. ", Toast.LENGTH_SHORT).show();
            }

        } else {
            Toast.makeText(this, "Please write Infant ID first", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

}

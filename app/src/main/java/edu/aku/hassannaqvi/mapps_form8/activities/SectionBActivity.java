package edu.aku.hassannaqvi.mapps_form8.activities;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Date;

import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySectionBBinding;

public class SectionBActivity extends AppCompatActivity {

    ActivitySectionBBinding bl;

    String dateToday = new SimpleDateFormat("dd/MM/yyyy").format(new Date().getTime());


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section_b);
        bl = DataBindingUtil.setContentView(this, R.layout.activity_section_b);

        bl.setCallback(this);
        setupViews();
    }

    public void setupViews() {
        bl.mp08b002.setManager(getSupportFragmentManager());
        bl.mp08b004.setManager(getSupportFragmentManager());
        bl.mp08b002.setMaxDate(dateToday);
        bl.mp08b004.setMaxDate(dateToday);

        bl.mp08b001.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bl.mp08b001c.isChecked()) {
                    bl.fldGrpmp08b002.setVisibility(View.VISIBLE);
                } else {
                    bl.fldGrpmp08b002.setVisibility(View.GONE);
                    bl.mp08b002.setText(null);
                }
            }
        });

        bl.mp08b003.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bl.mp08b003a.isChecked() || bl.mp08b001b.isChecked()) {

                    bl.fldGrpmp08b006.setVisibility(View.GONE);
                } else {
                    bl.fldGrpmp08b006.setVisibility(View.VISIBLE);
                    bl.mp08b006.clearCheck();
                }
            }
        });

        bl.mp08b007.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bl.mp08b007b.isChecked()) {
                    bl.fldGrpmp08b008.setVisibility(View.GONE);
                    bl.mp08b008.setText(null);
                } else {
                    bl.fldGrpmp08b008.setVisibility(View.VISIBLE);
                }
            }
        });


    }


    public Boolean formValidation() {

        return true;

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

                startActivity(new Intent(this, SectionDActivity.class).putExtra("complete", false));
            } else {
                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
            }
        }

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject sB = new JSONObject();

        sB.put("mp08b001", bl.mp08b001a.isChecked() ? "1"
                : bl.mp08b001b.isChecked() ? "2"
                : bl.mp08b001c.isChecked() ? "3" : "0");
        sB.put("mp08b002", bl.mp08b002.getText().toString());

        sB.put("mp08b003", bl.mp08b003a.isChecked() ? "1"
                : bl.mp08b003b.isChecked() ? "2"
                : bl.mp08b003c.isChecked() ? "3"
                : bl.mp08b003d.isChecked() ? "4"
                : bl.mp08b003e.isChecked() ? "5"
                : bl.mp08b00388.isChecked() ? "88"
                : "0");
        sB.put("mp08b00388x", bl.mp08b00388x.getText().toString());

        sB.put("mp08b004", bl.mp08b004.getText().toString());
        sB.put("mp08b005", bl.mp08b002.getText().toString());


        sB.put("mp08b006", bl.mp08b006a.isChecked() ? "1"
                : bl.mp08b006b.isChecked() ? "2"
                : bl.mp08b006c.isChecked() ? "3"
                : bl.mp08b006d.isChecked() ? "4"
                : bl.mp08b006e.isChecked() ? "5"
                : "0");

        sB.put("mp08b007", bl.mp08b007a.isChecked() ? "1"
                : bl.mp08b007b.isChecked() ? "2"
                : "0");
        sB.put("mp08b008", bl.mp08b008.getText().toString());


        //AppMain.fc.setsC(String.valueOf(sRc));


        //sRc.put()


        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();
    }

    private boolean UpdateDB() {
//Long rowId;
        DatabaseHelper db = new DatabaseHelper(this);


        /*Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();

        // 2. UPDATE FORM ROWID
        int updcount = db.updateSC();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }
*/

        return true;
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }

    public class checking {
        int check;

        public checking(int check) {
            this.check = check;
        }

        public int getCheck() {
            return check;
        }
    }

}

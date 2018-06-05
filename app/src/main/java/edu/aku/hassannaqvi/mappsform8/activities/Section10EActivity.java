package edu.aku.hassannaqvi.mappsform8.activities;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import butterknife.BindViews;
import butterknife.ButterKnife;
import edu.aku.hassannaqvi.mappsform8.R;
import edu.aku.hassannaqvi.mappsform8.core.AppMain;
import edu.aku.hassannaqvi.mappsform8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.databinding.ActivitySection10EBinding;
import edu.aku.hassannaqvi.mappsform8.validation.validatorClass;

public class Section10EActivity extends Activity implements RadioGroup.OnCheckedChangeListener {

    ActivitySection10EBinding bi;

    @BindViews({R.id.mp10q38a, R.id.mp10q38b, R.id.mp10q38c, R.id.mp10q38d, R.id.mp10q38e, R.id.mp10q38f,
            R.id.mp10q38g, R.id.mp10q38h, R.id.mp10q38i, R.id.mp10q39a, R.id.mp10q39b, R.id.mp10q39c, R.id.mp10q39d,
            R.id.mp10q39e, R.id.mp10q39f, R.id.mp10q39g, R.id.mp10q39h, R.id.mp10q39i, R.id.mp10q39j,
            R.id.mp10q39k, R.id.mp10q39l, R.id.mp10q39m, R.id.mp10q39n, R.id.mp10q39o, R.id.mp10q39p, R.id.mp10q39q})
    List<RadioGroup> grpmp1038;

    @BindViews({R.id.mp10q38aa, R.id.mp10q38ba, R.id.mp10q38ca, R.id.mp10q38da, R.id.mp10q38ea, R.id.mp10q38fa,
            R.id.mp10q38ga, R.id.mp10q38ha, R.id.mp10q38ia, R.id.mp10q39aa, R.id.mp10q39ba, R.id.mp10q39ca,
            R.id.mp10q39da, R.id.mp10q39ea, R.id.mp10q39fa, R.id.mp10q39ga, R.id.mp10q39ha, R.id.mp10q39ia,
            R.id.mp10q39ja, R.id.mp10q39ka, R.id.mp10q39la, R.id.mp10q39ma, R.id.mp10q39na, R.id.mp10q39oa,
            R.id.mp10q39pa, R.id.mp10q39qa})
    List<RadioButton> grpmp1038yes;

    @BindViews({R.id.mp10q38ab, R.id.mp10q38bb, R.id.mp10q38cb, R.id.mp10q38db, R.id.mp10q38eb, R.id.mp10q38fb,
            R.id.mp10q38gb, R.id.mp10q38hb, R.id.mp10q38ib, R.id.mp10q39ab, R.id.mp10q39bb, R.id.mp10q39cb,
            R.id.mp10q39db, R.id.mp10q39eb, R.id.mp10q39fb, R.id.mp10q39gb, R.id.mp10q39hb, R.id.mp10q39ib,
            R.id.mp10q39jb, R.id.mp10q39kb, R.id.mp10q39lb, R.id.mp10q39mb, R.id.mp10q39nb, R.id.mp10q39ob,
            R.id.mp10q39pb, R.id.mp10q39qb})
    List<RadioButton> grpmp1038no;

    @BindViews({R.id.mp10q38a99, R.id.mp10q38b99, R.id.mp10q38c99, R.id.mp10q38d99, R.id.mp10q38e99, R.id.mp10q38f99,
            R.id.mp10q38g99, R.id.mp10q38h99, R.id.mp10q38i99, R.id.mp10q39a99, R.id.mp10q39b99, R.id.mp10q39c99,
            R.id.mp10q39d99, R.id.mp10q39e99, R.id.mp10q39f99, R.id.mp10q39g99, R.id.mp10q39h99, R.id.mp10q39i99,
            R.id.mp10q39j99, R.id.mp10q39k99, R.id.mp10q39l99, R.id.mp10q39m99, R.id.mp10q39n99, R.id.mp10q39o99,
            R.id.mp10q39p99, R.id.mp10q39q99})
    List<RadioButton> grpmp1038dkn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_section10_e);

        bi = DataBindingUtil.setContentView(this, R.layout.activity_section10_e);
        ButterKnife.bind(this);
        bi.setCallback(this);

        for (RadioGroup rg : grpmp1038) {
            rg.setOnCheckedChangeListener(this);
        }

        bi.mp10q40.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (bi.mp10q40a.isChecked()) {
                    bi.fldGrpmp10eq41.setVisibility(View.VISIBLE);
                } else {
                    bi.fldGrpmp10eq41.setVisibility(View.GONE);
                    bi.mp10q41.setText(null);
                    bi.mp10q4199.setChecked(false);
                }
            }
        });
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

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38a, bi.mp10q38aa, getString(R.string.mp10q38a))) {
            return false;
        }


        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38b, bi.mp10q38ba, getString(R.string.mp10q38b))) {
            return false;
        }

        if (bi.mp10q38ba.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.mp10q38bx, getString(R.string.mp10q38b) + " times")) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp10q38bx, 1, 10, getString(R.string.mp10q38b), " times")) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38c, bi.mp10q38ca, getString(R.string.mp10q38c))) {
            return false;
        }

        if (bi.mp10q38ca.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.mp10q38cx, getString(R.string.mp10q38c) + " times")) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp10q38cx, 1, 10, getString(R.string.mp10q38c), " times")) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38d, bi.mp10q38da, getString(R.string.mp10q38d))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38e, bi.mp10q38ea, getString(R.string.mp10q38e))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38f, bi.mp10q38fa, getString(R.string.mp10q38f))) {
            return false;
        }

        if (bi.mp10q38fa.isChecked()) {
            if (!validatorClass.EmptyTextBox(this, bi.mp10q38fx, getString(R.string.mp10q38f) + " times")) {
                return false;
            }

            if (!validatorClass.RangeTextBox(this, bi.mp10q38fx, 1, 10, getString(R.string.mp10q38f), " times")) {
                return false;
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38g, bi.mp10q38ga, getString(R.string.mp10q38g))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38h, bi.mp10q38ha, getString(R.string.mp10q38h))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q38i, bi.mp10q38ia, bi.mp10q38ix, getString(R.string.mp10q38i))) {
            return false;
        }

        //==== 39

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39a, bi.mp10q39aa, getString(R.string.mp10q39a))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39b, bi.mp10q39ba, getString(R.string.mp10q39b))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39c, bi.mp10q39ca, getString(R.string.mp10q39c))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39d, bi.mp10q39da, getString(R.string.mp10q39d))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39e, bi.mp10q39ea, getString(R.string.mp10q39e))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39f, bi.mp10q39fa, getString(R.string.mp10q39f))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39g, bi.mp10q39ga, getString(R.string.mp10q39g))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39h, bi.mp10q39ha, getString(R.string.mp10q39h))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39i, bi.mp10q39ia, getString(R.string.mp10q39i))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39j, bi.mp10q39ja, getString(R.string.mp10q39j))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39k, bi.mp10q39ka, getString(R.string.mp10q39k))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39l, bi.mp10q39la, getString(R.string.mp10q39l))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39m, bi.mp10q39ma, getString(R.string.mp10q39m))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39n, bi.mp10q39na, getString(R.string.mp10q39n))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39o, bi.mp10q39oa, getString(R.string.mp10q39o))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39p, bi.mp10q39pa, getString(R.string.mp10q39p))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q39q, bi.mp10q39qa, getString(R.string.mp10q39q))) {
            return false;
        }

        if (isAllNo() || isAlldkn() || (!isoneYes())) {
            if (!validatorClass.EmptyRadioButton(this, bi.mp10q40, bi.mp10q40a, getString(R.string.mp10q40))) {
                return false;
            }
        }

        if ((isAllNo() || isAlldkn()) && bi.mp10q40a.isChecked()) {
            Toast.makeText(this, "ERROR: " + getString(R.string.mp10q40) + "Atleast one should be Yes", Toast.LENGTH_SHORT).show();
            bi.mp10q40a.setError(getString(R.string.mp10q40));
            Log.i(Section10EActivity.class.getSimpleName(), "mp10q40: This data is Required!");
            return false;
        } else {
            bi.mp10q40a.setError(null);
        }

        if (isoneYes()) {
            if (!bi.mp10q4199.isChecked()) {
                if (!validatorClass.EmptyTextBox(this, bi.mp10q41, getString(R.string.mp10q41))) {
                    return false;
                }

                if (!validatorClass.RangeTextBox(this, bi.mp10q41, 1, 10, getString(R.string.mp10q41), " times")) {
                    return false;
                }
            }
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q42, bi.mp10q42a, getString(R.string.mp10q42))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q43, bi.mp10q43a, getString(R.string.mp10q43))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q44, bi.mp10q44a, getString(R.string.mp10q44))) {
            return false;
        }

        if (!validatorClass.EmptyRadioButton(this, bi.mp10q45, bi.mp10q45a, getString(R.string.mp10q45))) {
            return false;
        }

        return validatorClass.EmptyRadioButton(this, bi.mp10q46, bi.mp10q46a, getString(R.string.mp10q46));

    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp10q38a", bi.mp10q38aa.isChecked() ? "1"
                : bi.mp10q38ab.isChecked() ? "2"
                : bi.mp10q38a99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38b", bi.mp10q38ba.isChecked() ? "1"
                : bi.mp10q38bb.isChecked() ? "2"
                : bi.mp10q38b99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38bx", bi.mp10q38bx.getText().toString());

        form4.put("mp10q38c", bi.mp10q38ca.isChecked() ? "1"
                : bi.mp10q38cb.isChecked() ? "2"
                : bi.mp10q38c99.isChecked() ? "99"
                : "0");
        form4.put("mp10q38cx", bi.mp10q38cx.getText().toString());

        form4.put("mp10q38d", bi.mp10q38da.isChecked() ? "1"
                : bi.mp10q38db.isChecked() ? "2"
                : bi.mp10q38d99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38e", bi.mp10q38ea.isChecked() ? "1"
                : bi.mp10q38eb.isChecked() ? "2"
                : bi.mp10q38e99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38f", bi.mp10q38fa.isChecked() ? "1"
                : bi.mp10q38fb.isChecked() ? "2"
                : bi.mp10q38f99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38fx", bi.mp10q38fx.getText().toString());

        form4.put("mp10q38g", bi.mp10q38ga.isChecked() ? "1"
                : bi.mp10q38gb.isChecked() ? "2"
                : bi.mp10q38g99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38h", bi.mp10q38ha.isChecked() ? "1"
                : bi.mp10q38hb.isChecked() ? "2"
                : bi.mp10q38h99.isChecked() ? "99"
                : "0");

        form4.put("mp10q38i", bi.mp10q38ia.isChecked() ? "1"
                : bi.mp10q38ib.isChecked() ? "2"
                : bi.mp10q38i99.isChecked() ? "99"
                : "0");
        form4.put("mp10q38ix", bi.mp10q38ix.getText().toString());


        form4.put("mp10q39a", bi.mp10q39aa.isChecked() ? "1"
                : bi.mp10q39ab.isChecked() ? "2"
                : bi.mp10q39a99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39b", bi.mp10q39ba.isChecked() ? "1"
                : bi.mp10q39bb.isChecked() ? "2"
                : bi.mp10q39b99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39c", bi.mp10q39ca.isChecked() ? "1"
                : bi.mp10q39cb.isChecked() ? "2"
                : bi.mp10q39c99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39d", bi.mp10q39da.isChecked() ? "1"
                : bi.mp10q39db.isChecked() ? "2"
                : bi.mp10q39d99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39e", bi.mp10q39ea.isChecked() ? "1"
                : bi.mp10q39eb.isChecked() ? "2"
                : bi.mp10q39e99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39f", bi.mp10q39fa.isChecked() ? "1"
                : bi.mp10q39fb.isChecked() ? "2"
                : bi.mp10q39f99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39g", bi.mp10q39ga.isChecked() ? "1"
                : bi.mp10q39gb.isChecked() ? "2"
                : bi.mp10q39g99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39h", bi.mp10q39ha.isChecked() ? "1"
                : bi.mp10q39hb.isChecked() ? "2"
                : bi.mp10q39h99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39i", bi.mp10q39ia.isChecked() ? "1"
                : bi.mp10q39ib.isChecked() ? "2"
                : bi.mp10q39i99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39j", bi.mp10q39ja.isChecked() ? "1"
                : bi.mp10q39jb.isChecked() ? "2"
                : bi.mp10q39j99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39k", bi.mp10q39ka.isChecked() ? "1"
                : bi.mp10q39kb.isChecked() ? "2"
                : bi.mp10q39k99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39l", bi.mp10q39la.isChecked() ? "1"
                : bi.mp10q39lb.isChecked() ? "2"
                : bi.mp10q39l99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39m", bi.mp10q39ma.isChecked() ? "1"
                : bi.mp10q39mb.isChecked() ? "2"
                : bi.mp10q39m99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39n", bi.mp10q39na.isChecked() ? "1"
                : bi.mp10q39nb.isChecked() ? "2"
                : bi.mp10q39n99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39o", bi.mp10q39oa.isChecked() ? "1"
                : bi.mp10q39ob.isChecked() ? "2"
                : bi.mp10q39o99.isChecked() ? "99"
                : "0");

        form4.put("mp10q39p", bi.mp10q39pa.isChecked() ? "1"
                : bi.mp10q39pb.isChecked() ? "2"
                : bi.mp10q39p99.isChecked() ? "99"
                : "0");
        form4.put("mp10q39q", bi.mp10q39qa.isChecked() ? "1"
                : bi.mp10q39qb.isChecked() ? "2"
                : bi.mp10q39q99.isChecked() ? "99"
                : "0");
        form4.put("mp10q40", bi.mp10q40a.isChecked() ? "1"
                : bi.mp10q40b.isChecked() ? "2"
                : bi.mp10q4099.isChecked() ? "99"
                : "0");

        form4.put("mp10q41", bi.mp10q4199.isChecked() ? "99"
                : bi.mp10q41.getText().toString());


        form4.put("mp10q42", bi.mp10q42a.isChecked() ? "1"
                : bi.mp10q42b.isChecked() ? "2"
                : bi.mp10q4299.isChecked() ? "99"
                : "0");


        form4.put("mp10q43", bi.mp10q43a.isChecked() ? "1"
                : bi.mp10q43b.isChecked() ? "2"
                : bi.mp10q4399.isChecked() ? "99"
                : "0");

        form4.put("mp10q44", bi.mp10q44a.isChecked() ? "1"
                : bi.mp10q44b.isChecked() ? "2"
                : bi.mp10q4499.isChecked() ? "99"
                : "0");

        form4.put("mp10q45", bi.mp10q45a.isChecked() ? "1"
                : bi.mp10q45b.isChecked() ? "2"
                : bi.mp10q4599.isChecked() ? "99"
                : "0");

        form4.put("mp10q46", bi.mp10q46a.isChecked() ? "1"
                : bi.mp10q46b.isChecked() ? "2"
                : bi.mp10q4699.isChecked() ? "99"
                : "0");


        //AppMain.fc.setS10B(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        /*int updcount = db.updates10E();

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


    public boolean isoneYes() {

        int i = 0;
        for (RadioButton rg : grpmp1038yes) {
            if (rg.isChecked())
                return true;
        }

        // Show answer here
        // return i == rg;
        return false;
    }

    public boolean isAlldkn() {

        int i = 0;
        for (RadioButton rg : grpmp1038dkn) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == grpmp1038dkn.size();
    }

    public boolean isAllNo() {

        int i = 0;
        for (RadioButton rg : grpmp1038no) {
            if (rg.isChecked())
                i++;
        }

        // Show answer here
        return i == grpmp1038no.size();
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (isoneYes()) {
            bi.fldGrpmp10eq40.setVisibility(View.GONE);
            bi.fldGrpmp10eq41.setVisibility(View.VISIBLE);
            bi.mp10q40.clearCheck();

        } else {
            bi.fldGrpmp10eq40.setVisibility(View.VISIBLE);
            bi.fldGrpmp10eq41.setVisibility(View.VISIBLE);
        }


    }
}

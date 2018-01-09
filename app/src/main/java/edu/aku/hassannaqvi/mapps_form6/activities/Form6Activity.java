package edu.aku.hassannaqvi.mapps_form6.activities;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Arrays;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.aku.hassannaqvi.mapps_form6.core.AppMain;
import edu.aku.hassannaqvi.mapps_form6.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform4.R;

public class Form6Activity extends AppCompatActivity {

    private static final String TAG = Form6Activity.class.getSimpleName();

    @BindView(R.id.mp06b001)
    EditText mp06b001;
    @BindView(R.id.mp06b001id1)
    Spinner mp06b001id1;
    @BindView(R.id.mp06b005)
    EditText mp06b005;
    @BindView(R.id.mp06b005id1)
    Spinner mp06b005id1;
    @BindView(R.id.mp06b009)
    EditText mp06b009;
    @BindView(R.id.mp06b009id1)
    Spinner mp06b009id1;
    @BindView(R.id.mp06b002)
    EditText mp06b002;
    @BindView(R.id.mp06b002id2)
    Spinner mp06b002id2;
    @BindView(R.id.mp06b006)
    EditText mp06b006;
    @BindView(R.id.mp06b006id2)
    Spinner mp06b006id2;
    @BindView(R.id.mp06b010)
    EditText mp06b010;
    @BindView(R.id.mp06b010id2)
    Spinner mp06b010id2;
    @BindView(R.id.fldGrpmp06b004)
    LinearLayout fldGrpmp06b004;
    @BindView(R.id.mp06b004)
    EditText mp06b004;
    @BindView(R.id.mp06b004id3)
    Spinner mp06b004id3;
    @BindView(R.id.fldGrpmp06b008)
    LinearLayout fldGrpmp06b008;
    @BindView(R.id.mp06b008)
    EditText mp06b008;
    @BindView(R.id.mp06b008id3)
    Spinner mp06b008id3;
    @BindView(R.id.fldGrpmp06b012)
    LinearLayout fldGrpmp06b012;
    @BindView(R.id.mp06b012)
    EditText mp06b012;
    @BindView(R.id.mp06b012id3)
    Spinner mp06b012id3;

    boolean flag_q4 = false, flag_q8 = false, flag_q12 = false;

    String dateToday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form6);
        ButterKnife.bind(this);


        mp06b001id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b002id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b004id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b005id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b006id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b008id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b009id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b010id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp06b012id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));




    }

    @OnClick(R.id.btn_End)
    void onBtnEndClick() {

        Toast.makeText(this, "Processing This Section", Toast.LENGTH_SHORT).show();

//        if (ValidateForm()) {
//            try {
//                SaveDraft();
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }
//            if (UpdateDB()) {
        finish();
        Toast.makeText(this, "Starting Form Ending Section", Toast.LENGTH_SHORT).show();
        Intent endSec = new Intent(this, EndingActivity.class);
        endSec.putExtra("complete", false);
        startActivity(endSec);
//            } else {
//                Toast.makeText(this, "Failed to Update Database!", Toast.LENGTH_SHORT).show();
//            }
//        }
    }


    @OnClick(R.id.btn_Continue)
    void onBtnContinueClick() {

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

//        1
        if (mp06b001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
            mp06b001.setError("This data is Required!");
            mp06b001.requestFocus();
            Log.i(TAG, "mp06b001: This data is Required!");
            return false;
        } else {
            mp06b001.setError(null);
            if (!mp06b001.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
                mp06b001.setError("Invalid: Decimal value is Required!");
                mp06b001.requestFocus();
                Log.i(TAG, "mp06b001: Invalid Decimal value is Required!");
                return false;
            } else {
                mp06b001.setError(null);
                if (Double.parseDouble(mp06b001.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
                    mp06b001.setError("Invalid: Greater then 0");
                    mp06b001.requestFocus();
                    Log.i(TAG, "mp06b001: Invalid Greater then 0");
                    return false;
                } else {
                    mp06b001.setError(null);
                    if (Double.parseDouble(mp06b001.getText().toString()) < 100 || Double.parseDouble(mp06b001.getText().toString()) > 180) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
                        mp06b001.setError("Invalid: Range 100-180");
                        Log.i(TAG, "mp06b001: Invalid Range 100-180");
                        mp06b001.requestFocus();
                        return false;
                    } else {
                        mp06b001.setError(null);
                    }
                }
            }
        }

        TextView mp06b001id1_txt = (TextView) mp06b001id1.getSelectedView();
        if (mp06b001id1.getSelectedItemId() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
            mp06b001id1_txt.setTextColor(Color.RED);
            mp06b001id1_txt.setError("This data is Required!");
            mp06b001id1_txt.requestFocus();
            Log.i(TAG, "mp06b001id1: This data is Required!");
            return false;
        } else {
            mp06b001id1_txt.setError(null);
        }

//        2
        if (mp06b002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b002), Toast.LENGTH_SHORT).show();
            mp06b002.setError("This data is Required!");
            mp06b002.requestFocus();
            Log.i(TAG, "mp06b002: This data is Required!");
            return false;
        } else {
            mp06b002.setError(null);
            if (!mp06b002.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b002), Toast.LENGTH_SHORT).show();
                mp06b002.setError("Invalid: Decimal value is Required!");
                mp06b002.requestFocus();
                Log.i(TAG, "mp06b002: Invalid Decimal value is Required!");
                return false;
            } else {
                mp06b002.setError(null);
                if (Double.parseDouble(mp06b002.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b002), Toast.LENGTH_SHORT).show();
                    mp06b002.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp06b002: Invalid Greater then 0");
                    mp06b002.requestFocus();
                    return false;
                } else {
                    mp06b002.setError(null);
                    if (Double.parseDouble(mp06b002.getText().toString()) < 100 || Double.parseDouble(mp06b002.getText().toString()) > 180) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b002), Toast.LENGTH_SHORT).show();
                        mp06b002.setError("Invalid: Range between 100-180");
                        Log.i(TAG, "mp06b002: Invalid Range between 100-180");
                        mp06b002.requestFocus();
                        return false;
                    } else {
                        mp06b002.setError(null);
                    }
                }
            }
        }

        TextView mp06b002id2_txt = (TextView) mp06b002id2.getSelectedView();
        if (mp06b002id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b002), Toast.LENGTH_SHORT).show();
            mp06b002id2_txt.setTextColor(Color.RED);
            mp06b002id2_txt.setText("This data is Required!");
            mp06b002id2_txt.setError("This data is Required!");
            mp06b002id2_txt.requestFocus();
            Log.i(TAG, "mp06b002id2: This data is Required!");
            return false;
        } else {
            mp06b002id2_txt.setError(null);
        }

        if (mp06b001id1.getSelectedItem().toString().contains(mp06b002id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid) Users same: " + getString(R.string.mp06b001), Toast.LENGTH_SHORT).show();
            mp06b001id1_txt.setError("Users Same");
            mp06b002id2_txt.setError("Users Same");
            mp06b002id2_txt.requestFocus();
            Log.i(TAG, "mp06b001id1: Users Same");
            return false;
        } else {
            mp06b001id1_txt.setError(null);
            mp06b002id2_txt.setError(null);
        }

//        Skip

//        Question 4 Checking

        double q4 = Double.parseDouble(mp06b001.getText().toString()) - Double.parseDouble(mp06b002.getText().toString());

        if (Math.signum(q4) == -1) {
            q4 = q4 * -1;
        }

        if (!flag_q4) {
            if (q4 > 1.0) {
                flag_q4 = true;

                fldGrpmp06b004.setVisibility(View.VISIBLE);
                mp06b001.setEnabled(false);
                mp06b002.setEnabled(false);

                mp06b001id1.setEnabled(false);
                mp06b002id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp06b001 & mp06b002: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q4) {
            if (mp06b004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b004), Toast.LENGTH_SHORT).show();
                mp06b004.setError("This data is Required!");
                mp06b004.requestFocus();
                Log.i(TAG, "mp06b004: This data is Required!");
                return false;
            } else {
                mp06b004.setError(null);
                if (!mp06b004.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b004), Toast.LENGTH_SHORT).show();
                    mp06b004.setError("Invalid: Decimal value is Required!");
                    mp06b004.requestFocus();
                    Log.i(TAG, "mp06b004: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp06b004.setError(null);
                    if (Double.parseDouble(mp06b004.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b004), Toast.LENGTH_SHORT).show();
                        mp06b004.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp06b004: Invalid Greater then 0");
                        mp06b004.requestFocus();
                        return false;
                    } else {
                        mp06b004.setError(null);
                        if (Double.parseDouble(mp06b004.getText().toString()) < 100 || Double.parseDouble(mp06b004.getText().toString()) > 180) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b004), Toast.LENGTH_SHORT).show();
                            mp06b004.setError("Invalid: Range 100-180");
                            Log.i(TAG, "mp06b004: Invalid Range 100-180");
                            mp06b004.requestFocus();
                            return false;
                        } else {
                            mp06b004.setError(null);
                        }
                    }
                }
            }

            TextView mp06b004id3_txt = (TextView) mp06b004id3.getSelectedView();
            if (mp06b004id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b004), Toast.LENGTH_SHORT).show();
                mp06b004id3_txt.setError("This data is Required!");
                mp06b004id3_txt.setText("This data is Required!");
                mp06b004id3_txt.requestFocus();
                Log.i(TAG, "mp06b004id3: This data is Required!");
                return false;
            } else {
                mp06b004id3_txt.setError(null);
            }
        }

//        5
        if (mp06b005.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
            mp06b005.setError("This data is Required!");
            mp06b005.requestFocus();
            Log.i(TAG, "mp06b005: This data is Required!");
            return false;
        } else {
            mp06b005.setError(null);
            if (!mp06b005.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
                mp06b005.setError("Invalid: Decimal value is Required!");
                mp06b005.requestFocus();
                Log.i(TAG, "mp06b005: Invalid Decimal value is Required!");
                return false;
            } else {
                mp06b005.setError(null);
                if (Double.parseDouble(mp06b005.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
                    mp06b005.setError("Invalid: Greater then 0");
                    mp06b005.requestFocus();
                    Log.i(TAG, "mp06b005: Invalid Greater then 0");
                    return false;
                } else {
                    mp06b005.setError(null);
                    if (Double.parseDouble(mp06b005.getText().toString()) < 30.0 || Double.parseDouble(mp06b005.getText().toString()) > 99.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
                        mp06b005.setError("Invalid: Range 30.0-99.0");
                        mp06b005.requestFocus();
                        Log.i(TAG, "mp06b005: Invalid Range 30.0-99.0");
                        return false;
                    } else {
                        mp06b005.setError(null);
                    }
                }
            }
        }

        TextView mp06b005id1_txt = (TextView) mp06b005id1.getSelectedView();
        if (mp06b005id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
            mp06b005id1_txt.setError("This data is Required!");
            mp06b005id1_txt.setText("This data is Required!");
            mp06b005id1_txt.requestFocus();
            Log.i(TAG, "mp06b005id1: This data is Required!");
            return false;
        } else {
            mp06b005id1_txt.setError(null);
        }

//        6
        if (mp06b006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b006), Toast.LENGTH_SHORT).show();
            mp06b006.setError("This data is Required!");
            Log.i(TAG, "mp06b006: This data is Required!");
            mp06b006.requestFocus();
            return false;
        } else {
            mp06b006.setError(null);
            if (!mp06b006.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b006), Toast.LENGTH_SHORT).show();
                mp06b006.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp06b006: Invalid Decimal value is Required!");
                mp06b006.requestFocus();
                return false;
            } else {
                mp06b006.setError(null);
                if (Double.parseDouble(mp06b006.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b006), Toast.LENGTH_SHORT).show();
                    mp06b006.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp06b006: Invalid Greater then 0");
                    mp06b006.requestFocus();
                    return false;
                } else {
                    mp06b006.setError(null);
                    if (Double.parseDouble(mp06b006.getText().toString()) < 30.0 || Double.parseDouble(mp06b006.getText().toString()) > 99.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b006), Toast.LENGTH_SHORT).show();
                        mp06b006.setError("Invalid: Range 30.0-99.0");
                        Log.i(TAG, "mp06b006: Invalid Range 30.0-99.0");
                        mp06b006.requestFocus();
                        return false;
                    } else {
                        mp06b006.setError(null);
                    }
                }
            }
        }

        TextView mp06b006id2_txt = (TextView) mp06b006id2.getSelectedView();
        if (mp06b006id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b006), Toast.LENGTH_SHORT).show();
            mp06b006id2_txt.setError("This data is Required!");
            mp06b006id2_txt.setText("This data is Required!");
            mp06b006id2_txt.requestFocus();
            Log.i(TAG, "mp06b006id1: This data is Required!");
            return false;
        } else {
            mp06b006id2_txt.setError(null);
        }
        if (mp06b005id1.getSelectedItem().toString().contains(mp06b006id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b005), Toast.LENGTH_SHORT).show();
            mp06b006id2_txt.setError("Users Same");
            mp06b005id1_txt.setError("Users Same");
            mp06b005id1_txt.requestFocus();
            Log.i(TAG, "mp06b005id1: Users Same");
            return false;
        } else {
            mp06b006id2_txt.setError(null);
            mp06b005id1_txt.setError(null);
        }

//        Skip

        //        Question 8 Checking

        double q8 = Double.parseDouble(mp06b005.getText().toString()) - Double.parseDouble(mp06b006.getText().toString());

        if (Math.signum(q8) == -1) {
            q8 = q8 * -1;
        }

        if (!flag_q8) {
            if (q8 > 0.5) {
                flag_q8 = true;

                fldGrpmp06b008.setVisibility(View.VISIBLE);
                mp06b005.setEnabled(false);
                mp06b006.setEnabled(false);

                mp06b005id1.setEnabled(false);
                mp06b006id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp06b005 & mp06b006: Difference in Measurement");

                return false;
            }
        }

        if (flag_q8) {

//            8

            if (mp06b008.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b008), Toast.LENGTH_SHORT).show();
                mp06b008.setError("This data is Required!");
                mp06b008.requestFocus();
                Log.i(TAG, "mp06b008: This data is Required!");
                return false;
            } else {
                mp06b008.setError(null);
                if (!mp06b008.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b008), Toast.LENGTH_SHORT).show();
                    mp06b008.setError("Invalid: Decimal value is Required!");
                    mp06b008.requestFocus();
                    Log.i(TAG, "mp06b008: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp06b008.setError(null);
                    if (Double.parseDouble(mp06b008.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b008), Toast.LENGTH_SHORT).show();
                        mp06b008.setError("Invalid: Greater then 0");
                        mp06b008.requestFocus();
                        Log.i(TAG, "mp06b008: Invalid Greater then 0");
                        return false;
                    } else {
                        mp06b008.setError(null);
                        if (Double.parseDouble(mp06b008.getText().toString()) < 30.0 || Double.parseDouble(mp06b008.getText().toString()) > 99.0) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b008), Toast.LENGTH_SHORT).show();
                            mp06b008.setError("Invalid: Range 30.0-99.0");
                            mp06b008.requestFocus();
                            Log.i(TAG, "mp06b008: Invalid Range 30.0-99.0");
                            return false;
                        } else {
                            mp06b008.setError(null);
                        }
                    }
                }
            }

            TextView mp06b008id3_txt = (TextView) mp06b008id3.getSelectedView();
            if (mp06b008id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b008), Toast.LENGTH_SHORT).show();
                mp06b008id3_txt.setError("This data is Required!");
                mp06b008id3_txt.setText("This data is Required!");
                mp06b008id3_txt.requestFocus();
                Log.i(TAG, "mp06b008id3: This data is Required!");
                return false;
            } else {
                mp06b008id3_txt.setError(null);
            }

        }

//        9
        if (mp06b009.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
            mp06b009.setError("This data is Required!");
            mp06b009.requestFocus();
            Log.i(TAG, "mp06b009: This data is Required!");
            return false;
        } else {
            mp06b009.setError(null);
            if (!mp06b009.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
                mp06b009.setError("Invalid: Decimal value is Required!");
                mp06b009.requestFocus();
                Log.i(TAG, "mp06b009: Invalid Decimal value is Required!");
                return false;
            } else {
                mp06b009.setError(null);
                if (Double.parseDouble(mp06b009.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
                    mp06b009.setError("Invalid: Greater then 0");
                    mp06b009.requestFocus();
                    Log.i(TAG, "mp06b009: Invalid Greater then 0");
                    return false;
                } else {
                    mp06b009.setError(null);
                    if (Double.parseDouble(mp06b009.getText().toString()) < 15.0 || Double.parseDouble(mp06b009.getText().toString()) > 45.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
                        mp06b009.setError("Invalid: Range 15.0-45.0");
                        Log.i(TAG, "mp06b009: Invalid Range 15.0-45.0");
                        mp06b009.requestFocus();
                        return false;
                    } else {
                        mp06b009.setError(null);
                    }
                }
            }
        }

        TextView mp06b009id1_txt = (TextView) mp06b009id1.getSelectedView();
        if (mp06b009id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
            mp06b009id1_txt.setError("This data is Required!");
            mp06b009id1_txt.setText("This data is Required!");
            mp06b009id1_txt.requestFocus();
            Log.i(TAG, "mp06b009id1: This data is Required!");
            return false;
        } else {
            mp06b009id1_txt.setError(null);
        }

//        10
        if (mp06b010.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b010), Toast.LENGTH_SHORT).show();
            mp06b010.setError("This data is Required!");
            mp06b010.requestFocus();
            Log.i(TAG, "mp06b010: This data is Required!");
            return false;
        } else {
            mp06b010.setError(null);
            if (!mp06b010.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b010), Toast.LENGTH_SHORT).show();
                mp06b010.setError("Invalid: Decimal value is Required!");
                mp06b010.requestFocus();
                Log.i(TAG, "mp06b010: Invalid Decimal value is Required!");
                return false;
            } else {
                mp06b010.setError(null);
                if (Double.parseDouble(mp06b010.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b010), Toast.LENGTH_SHORT).show();
                    mp06b010.setError("Invalid: Greater then 0");
                    mp06b010.requestFocus();
                    Log.i(TAG, "mp06b010: Invalid Greater then 0");
                    return false;
                } else {
                    mp06b010.setError(null);
                    if (Double.parseDouble(mp06b010.getText().toString()) < 15.0 || Double.parseDouble(mp06b010.getText().toString()) > 45.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b010), Toast.LENGTH_SHORT).show();
                        mp06b010.setError("Invalid: Range 15.0-45.0");
                        mp06b010.requestFocus();
                        Log.i(TAG, "mp06b010: Invalid Range 15.0-45.0");
                        return false;
                    } else {
                        mp06b010.setError(null);
                    }
                }
            }
        }

        TextView mp06b010id2_txt = (TextView) mp06b010id2.getSelectedView();
        if (mp06b010id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b010), Toast.LENGTH_SHORT).show();
            mp06b010id2_txt.setError("This data is Required!");
            mp06b010id2_txt.setText("This data is Required!");
            mp06b010id2_txt.requestFocus();
            Log.i(TAG, "mp06b010id2: This data is Required!");
            return false;
        } else {
            mp06b010id2_txt.setError(null);
        }
        if (mp06b009id1.getSelectedItem().toString().contains(mp06b010id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b009), Toast.LENGTH_SHORT).show();
            mp06b009id1_txt.setError("Users Same");
            mp06b010id2_txt.setError("Users Same");
            mp06b010id2_txt.requestFocus();
            Log.i(TAG, "mp06b009id1: Users Same");
            return false;
        } else {
            mp06b009id1_txt.setError(null);
            mp06b010id2_txt.setError(null);
        }

//        Skip
        //        Question 12 Checking

        double q12 = Double.parseDouble(mp06b009.getText().toString()) - Double.parseDouble(mp06b010.getText().toString());

        if (Math.signum(q12) == -1) {
            q12 = q12 * -1;
        }

        if (!flag_q12) {
            if (q12 > 0.5) {
                flag_q12 = true;

                fldGrpmp06b012.setVisibility(View.VISIBLE);
                mp06b009.setEnabled(false);
                mp06b010.setEnabled(false);

                mp06b009id1.setEnabled(false);
                mp06b010id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp06b009 & mp06b010: Difference in Measurement");

                return false;
            }
        }

        if (flag_q12) {
//            12
            if (mp06b012.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b012), Toast.LENGTH_SHORT).show();
                mp06b012.setError("This data is Required!");
                mp06b012.requestFocus();
                Log.i(TAG, "mp06b012: This data is Required!");
                return false;
            } else {
                mp06b012.setError(null);
                if (!mp06b012.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b012), Toast.LENGTH_SHORT).show();
                    mp06b012.setError("Invalid: Decimal value is Required!");
                    mp06b012.requestFocus();
                    Log.i(TAG, "mp06b012: Decimal value is Required!");
                    return false;
                } else {
                    mp06b012.setError(null);
                    if (Double.parseDouble(mp06b012.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b012), Toast.LENGTH_SHORT).show();
                        mp06b012.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp06b012: Greater then 0");
                        mp06b012.requestFocus();
                        return false;
                    } else {
                        mp06b012.setError(null);
                        if (Double.parseDouble(mp06b012.getText().toString()) < 15.0 || Double.parseDouble(mp06b012.getText().toString()) > 45.0) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp06b012), Toast.LENGTH_SHORT).show();
                            mp06b012.setError("Invalid: Range 15.0-45.0");
                            Log.i(TAG, "mp06b012: Range 15.0-45.0");
                            mp06b012.requestFocus();
                            return false;
                        } else {
                            mp06b012.setError(null);
                        }
                    }
                }
            }

            TextView mp06b012id3_txt = (TextView) mp06b012id3.getSelectedView();
            if (mp06b012id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp06b012), Toast.LENGTH_SHORT).show();
                mp06b012id3_txt.setError("This data is Required!");
                mp06b012id3_txt.setText("This data is Required!");
                mp06b012id3_txt.requestFocus();
                Log.i(TAG, "mp06b012id3: This data is Required!");
                return false;
            } else {
                mp06b012id3_txt.setError(null);
            }
        }



        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp06b001", mp06b001.getText().toString());
        form4.put("mp06b001id1", mp06b001id1.getSelectedItem().toString());

        form4.put("mp06b002", mp06b002.getText().toString());
        form4.put("mp06b002id2", mp06b002id2.getSelectedItem().toString());

        form4.put("mp06b003", flag_q4 ? "1" : "2");

        form4.put("mp06b004", mp06b004.getText().toString());
        form4.put("mp06b004id3", mp06b004id3.getSelectedItem().toString());

        form4.put("mp06b005", mp06b005.getText().toString());
        form4.put("mp06b005id1", mp06b005id1.getSelectedItem().toString());

        form4.put("mp06b006", mp06b006.getText().toString());
        form4.put("mp06b006id2", mp06b006id2.getSelectedItem().toString());

        form4.put("mp06b007", flag_q8 ? "1" : "2");

        form4.put("mp06b008", mp06b008.getText().toString());
        form4.put("mp06b008id3", mp06b008id3.getSelectedItem().toString());

        form4.put("mp06b009", mp06b009.getText().toString());
        form4.put("mp06b009id1", mp06b009id1.getSelectedItem().toString());

        form4.put("mp06b010", mp06b010.getText().toString());
        form4.put("mp06b010id2", mp06b010id2.getSelectedItem().toString());

        form4.put("mp06b011", flag_q12 ? "1" : "2");

        form4.put("mp06b012", mp06b012.getText().toString());
        form4.put("mp06b012id3", mp06b012id3.getSelectedItem().toString());


        AppMain.fc.setsA(String.valueOf(form4));

        Toast.makeText(this, "Validation Successful! - Saving Draft...", Toast.LENGTH_SHORT).show();

    }

    private boolean UpdateDB() {
        DatabaseHelper db = new DatabaseHelper(this);

        int updcount = db.updatesA();

        if (updcount == 1) {
            Toast.makeText(this, "Updating Database... Successful!", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            Toast.makeText(this, "Updating Database... ERROR!", Toast.LENGTH_SHORT).show();
            return false;
        }


    }


}

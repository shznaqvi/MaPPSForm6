package edu.aku.hassannaqvi.mapps_form8.activities;

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
import edu.aku.hassannaqvi.mapps_form8.core.AppMain;
import edu.aku.hassannaqvi.mapps_form8.core.DatabaseHelper;
import edu.aku.hassannaqvi.mappsform8.R;

public class SectionDActivity extends AppCompatActivity {

    private static final String TAG = SectionDActivity.class.getSimpleName();

    @BindView(R.id.mp08d001)
    EditText mp08d001;
    @BindView(R.id.mp08d001id1)
    Spinner mp08d001id1;
    @BindView(R.id.mp08d005)
    EditText mp08d005;
    @BindView(R.id.mp08d005id1)
    Spinner mp08d005id1;
    @BindView(R.id.mp08d009)
    EditText mp08d009;
    @BindView(R.id.mp08d009id1)
    Spinner mp08d009id1;
    @BindView(R.id.mp08d002)
    EditText mp08d002;
    @BindView(R.id.mp08d002id2)
    Spinner mp08d002id2;
    @BindView(R.id.mp08d006)
    EditText mp08d006;
    @BindView(R.id.mp08d006id2)
    Spinner mp08d006id2;
    @BindView(R.id.mp08d010)
    EditText mp08d010;
    @BindView(R.id.mp08d010id2)
    Spinner mp08d010id2;
    @BindView(R.id.fldGrpmp08d004)
    LinearLayout fldGrpmp08d004;
    @BindView(R.id.mp08d004)
    EditText mp08d004;
    @BindView(R.id.mp08d004id3)
    Spinner mp08d004id3;
    @BindView(R.id.fldGrpmp08d008)
    LinearLayout fldGrpmp08d008;
    @BindView(R.id.mp08d008)
    EditText mp08d008;
    @BindView(R.id.mp08d008id3)
    Spinner mp08d008id3;
    @BindView(R.id.fldGrpmp08d012)
    LinearLayout fldGrpmp08d012;
    @BindView(R.id.mp08d012)
    EditText mp08d012;
    @BindView(R.id.mp08d012id3)
    Spinner mp08d012id3;

    boolean flag_q4 = false, flag_q8 = false, flag_q12 = false;

    String dateToday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section_d);
        ButterKnife.bind(this);


        mp08d001id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d002id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d004id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d005id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d006id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d008id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d009id1.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d010id2.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));
        mp08d012id3.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, Arrays.asList(AppMain.loginMem)));




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
        if (mp08d001.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
            mp08d001.setError("This data is Required!");
            mp08d001.requestFocus();
            Log.i(TAG, "mp08d001: This data is Required!");
            return false;
        } else {
            mp08d001.setError(null);
            if (!mp08d001.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
                mp08d001.setError("Invalid: Decimal value is Required!");
                mp08d001.requestFocus();
                Log.i(TAG, "mp08d001: Invalid Decimal value is Required!");
                return false;
            } else {
                mp08d001.setError(null);
                if (Double.parseDouble(mp08d001.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
                    mp08d001.setError("Invalid: Greater then 0");
                    mp08d001.requestFocus();
                    Log.i(TAG, "mp08d001: Invalid Greater then 0");
                    return false;
                } else {
                    mp08d001.setError(null);
                    if (Double.parseDouble(mp08d001.getText().toString()) < 100 || Double.parseDouble(mp08d001.getText().toString()) > 180) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
                        mp08d001.setError("Invalid: Range 100-180");
                        Log.i(TAG, "mp08d001: Invalid Range 100-180");
                        mp08d001.requestFocus();
                        return false;
                    } else {
                        mp08d001.setError(null);
                    }
                }
            }
        }

        TextView mp08d001id1_txt = (TextView) mp08d001id1.getSelectedView();
        if (mp08d001id1.getSelectedItemId() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
            mp08d001id1_txt.setTextColor(Color.RED);
            mp08d001id1_txt.setError("This data is Required!");
            mp08d001id1_txt.requestFocus();
            Log.i(TAG, "mp08d001id1: This data is Required!");
            return false;
        } else {
            mp08d001id1_txt.setError(null);
        }

//        2
        if (mp08d002.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d002), Toast.LENGTH_SHORT).show();
            mp08d002.setError("This data is Required!");
            mp08d002.requestFocus();
            Log.i(TAG, "mp08d002: This data is Required!");
            return false;
        } else {
            mp08d002.setError(null);
            if (!mp08d002.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d002), Toast.LENGTH_SHORT).show();
                mp08d002.setError("Invalid: Decimal value is Required!");
                mp08d002.requestFocus();
                Log.i(TAG, "mp08d002: Invalid Decimal value is Required!");
                return false;
            } else {
                mp08d002.setError(null);
                if (Double.parseDouble(mp08d002.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d002), Toast.LENGTH_SHORT).show();
                    mp08d002.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp08d002: Invalid Greater then 0");
                    mp08d002.requestFocus();
                    return false;
                } else {
                    mp08d002.setError(null);
                    if (Double.parseDouble(mp08d002.getText().toString()) < 100 || Double.parseDouble(mp08d002.getText().toString()) > 180) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d002), Toast.LENGTH_SHORT).show();
                        mp08d002.setError("Invalid: Range between 100-180");
                        Log.i(TAG, "mp08d002: Invalid Range between 100-180");
                        mp08d002.requestFocus();
                        return false;
                    } else {
                        mp08d002.setError(null);
                    }
                }
            }
        }

        TextView mp08d002id2_txt = (TextView) mp08d002id2.getSelectedView();
        if (mp08d002id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d002), Toast.LENGTH_SHORT).show();
            mp08d002id2_txt.setTextColor(Color.RED);
            mp08d002id2_txt.setText("This data is Required!");
            mp08d002id2_txt.setError("This data is Required!");
            mp08d002id2_txt.requestFocus();
            Log.i(TAG, "mp08d002id2: This data is Required!");
            return false;
        } else {
            mp08d002id2_txt.setError(null);
        }

        if (mp08d001id1.getSelectedItem().toString().contains(mp08d002id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid) Users same: " + getString(R.string.mp08d001), Toast.LENGTH_SHORT).show();
            mp08d001id1_txt.setError("Users Same");
            mp08d002id2_txt.setError("Users Same");
            mp08d002id2_txt.requestFocus();
            Log.i(TAG, "mp08d001id1: Users Same");
            return false;
        } else {
            mp08d001id1_txt.setError(null);
            mp08d002id2_txt.setError(null);
        }

//        Skip

//        Question 4 Checking

        double q4 = Double.parseDouble(mp08d001.getText().toString()) - Double.parseDouble(mp08d002.getText().toString());

        if (Math.signum(q4) == -1) {
            q4 = q4 * -1;
        }

        if (!flag_q4) {
            if (q4 > 1.0) {
                flag_q4 = true;

                fldGrpmp08d004.setVisibility(View.VISIBLE);
                mp08d001.setEnabled(false);
                mp08d002.setEnabled(false);

                mp08d001id1.setEnabled(false);
                mp08d002id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp08d001 & mp08d002: Difference in Measurement");

                return false;
            }
        }

//            4
        if (flag_q4) {
            if (mp08d004.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d004), Toast.LENGTH_SHORT).show();
                mp08d004.setError("This data is Required!");
                mp08d004.requestFocus();
                Log.i(TAG, "mp08d004: This data is Required!");
                return false;
            } else {
                mp08d004.setError(null);
                if (!mp08d004.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d004), Toast.LENGTH_SHORT).show();
                    mp08d004.setError("Invalid: Decimal value is Required!");
                    mp08d004.requestFocus();
                    Log.i(TAG, "mp08d004: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp08d004.setError(null);
                    if (Double.parseDouble(mp08d004.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d004), Toast.LENGTH_SHORT).show();
                        mp08d004.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp08d004: Invalid Greater then 0");
                        mp08d004.requestFocus();
                        return false;
                    } else {
                        mp08d004.setError(null);
                        if (Double.parseDouble(mp08d004.getText().toString()) < 100 || Double.parseDouble(mp08d004.getText().toString()) > 180) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d004), Toast.LENGTH_SHORT).show();
                            mp08d004.setError("Invalid: Range 100-180");
                            Log.i(TAG, "mp08d004: Invalid Range 100-180");
                            mp08d004.requestFocus();
                            return false;
                        } else {
                            mp08d004.setError(null);
                        }
                    }
                }
            }

            TextView mp08d004id3_txt = (TextView) mp08d004id3.getSelectedView();
            if (mp08d004id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d004), Toast.LENGTH_SHORT).show();
                mp08d004id3_txt.setError("This data is Required!");
                mp08d004id3_txt.setText("This data is Required!");
                mp08d004id3_txt.requestFocus();
                Log.i(TAG, "mp08d004id3: This data is Required!");
                return false;
            } else {
                mp08d004id3_txt.setError(null);
            }
        }

//        5
        if (mp08d005.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
            mp08d005.setError("This data is Required!");
            mp08d005.requestFocus();
            Log.i(TAG, "mp08d005: This data is Required!");
            return false;
        } else {
            mp08d005.setError(null);
            if (!mp08d005.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
                mp08d005.setError("Invalid: Decimal value is Required!");
                mp08d005.requestFocus();
                Log.i(TAG, "mp08d005: Invalid Decimal value is Required!");
                return false;
            } else {
                mp08d005.setError(null);
                if (Double.parseDouble(mp08d005.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
                    mp08d005.setError("Invalid: Greater then 0");
                    mp08d005.requestFocus();
                    Log.i(TAG, "mp08d005: Invalid Greater then 0");
                    return false;
                } else {
                    mp08d005.setError(null);
                    if (Double.parseDouble(mp08d005.getText().toString()) < 30.0 || Double.parseDouble(mp08d005.getText().toString()) > 99.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
                        mp08d005.setError("Invalid: Range 30.0-99.0");
                        mp08d005.requestFocus();
                        Log.i(TAG, "mp08d005: Invalid Range 30.0-99.0");
                        return false;
                    } else {
                        mp08d005.setError(null);
                    }
                }
            }
        }

        TextView mp08d005id1_txt = (TextView) mp08d005id1.getSelectedView();
        if (mp08d005id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
            mp08d005id1_txt.setError("This data is Required!");
            mp08d005id1_txt.setText("This data is Required!");
            mp08d005id1_txt.requestFocus();
            Log.i(TAG, "mp08d005id1: This data is Required!");
            return false;
        } else {
            mp08d005id1_txt.setError(null);
        }

//        6
        if (mp08d006.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d006), Toast.LENGTH_SHORT).show();
            mp08d006.setError("This data is Required!");
            Log.i(TAG, "mp08d006: This data is Required!");
            mp08d006.requestFocus();
            return false;
        } else {
            mp08d006.setError(null);
            if (!mp08d006.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d006), Toast.LENGTH_SHORT).show();
                mp08d006.setError("Invalid: Decimal value is Required!");
                Log.i(TAG, "mp08d006: Invalid Decimal value is Required!");
                mp08d006.requestFocus();
                return false;
            } else {
                mp08d006.setError(null);
                if (Double.parseDouble(mp08d006.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d006), Toast.LENGTH_SHORT).show();
                    mp08d006.setError("Invalid: Greater then 0");
                    Log.i(TAG, "mp08d006: Invalid Greater then 0");
                    mp08d006.requestFocus();
                    return false;
                } else {
                    mp08d006.setError(null);
                    if (Double.parseDouble(mp08d006.getText().toString()) < 30.0 || Double.parseDouble(mp08d006.getText().toString()) > 99.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d006), Toast.LENGTH_SHORT).show();
                        mp08d006.setError("Invalid: Range 30.0-99.0");
                        Log.i(TAG, "mp08d006: Invalid Range 30.0-99.0");
                        mp08d006.requestFocus();
                        return false;
                    } else {
                        mp08d006.setError(null);
                    }
                }
            }
        }

        TextView mp08d006id2_txt = (TextView) mp08d006id2.getSelectedView();
        if (mp08d006id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d006), Toast.LENGTH_SHORT).show();
            mp08d006id2_txt.setError("This data is Required!");
            mp08d006id2_txt.setText("This data is Required!");
            mp08d006id2_txt.requestFocus();
            Log.i(TAG, "mp08d006id1: This data is Required!");
            return false;
        } else {
            mp08d006id2_txt.setError(null);
        }
        if (mp08d005id1.getSelectedItem().toString().contains(mp08d006id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d005), Toast.LENGTH_SHORT).show();
            mp08d006id2_txt.setError("Users Same");
            mp08d005id1_txt.setError("Users Same");
            mp08d005id1_txt.requestFocus();
            Log.i(TAG, "mp08d005id1: Users Same");
            return false;
        } else {
            mp08d006id2_txt.setError(null);
            mp08d005id1_txt.setError(null);
        }

//        Skip

        //        Question 8 Checking

        double q8 = Double.parseDouble(mp08d005.getText().toString()) - Double.parseDouble(mp08d006.getText().toString());

        if (Math.signum(q8) == -1) {
            q8 = q8 * -1;
        }

        if (!flag_q8) {
            if (q8 > 0.5) {
                flag_q8 = true;

                fldGrpmp08d008.setVisibility(View.VISIBLE);
                mp08d005.setEnabled(false);
                mp08d006.setEnabled(false);

                mp08d005id1.setEnabled(false);
                mp08d006id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp08d005 & mp08d006: Difference in Measurement");

                return false;
            }
        }

        if (flag_q8) {

//            8

            if (mp08d008.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d008), Toast.LENGTH_SHORT).show();
                mp08d008.setError("This data is Required!");
                mp08d008.requestFocus();
                Log.i(TAG, "mp08d008: This data is Required!");
                return false;
            } else {
                mp08d008.setError(null);
                if (!mp08d008.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d008), Toast.LENGTH_SHORT).show();
                    mp08d008.setError("Invalid: Decimal value is Required!");
                    mp08d008.requestFocus();
                    Log.i(TAG, "mp08d008: Invalid Decimal value is Required!");
                    return false;
                } else {
                    mp08d008.setError(null);
                    if (Double.parseDouble(mp08d008.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d008), Toast.LENGTH_SHORT).show();
                        mp08d008.setError("Invalid: Greater then 0");
                        mp08d008.requestFocus();
                        Log.i(TAG, "mp08d008: Invalid Greater then 0");
                        return false;
                    } else {
                        mp08d008.setError(null);
                        if (Double.parseDouble(mp08d008.getText().toString()) < 30.0 || Double.parseDouble(mp08d008.getText().toString()) > 99.0) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d008), Toast.LENGTH_SHORT).show();
                            mp08d008.setError("Invalid: Range 30.0-99.0");
                            mp08d008.requestFocus();
                            Log.i(TAG, "mp08d008: Invalid Range 30.0-99.0");
                            return false;
                        } else {
                            mp08d008.setError(null);
                        }
                    }
                }
            }

            TextView mp08d008id3_txt = (TextView) mp08d008id3.getSelectedView();
            if (mp08d008id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d008), Toast.LENGTH_SHORT).show();
                mp08d008id3_txt.setError("This data is Required!");
                mp08d008id3_txt.setText("This data is Required!");
                mp08d008id3_txt.requestFocus();
                Log.i(TAG, "mp08d008id3: This data is Required!");
                return false;
            } else {
                mp08d008id3_txt.setError(null);
            }

        }

//        9
        if (mp08d009.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
            mp08d009.setError("This data is Required!");
            mp08d009.requestFocus();
            Log.i(TAG, "mp08d009: This data is Required!");
            return false;
        } else {
            mp08d009.setError(null);
            if (!mp08d009.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
                mp08d009.setError("Invalid: Decimal value is Required!");
                mp08d009.requestFocus();
                Log.i(TAG, "mp08d009: Invalid Decimal value is Required!");
                return false;
            } else {
                mp08d009.setError(null);
                if (Double.parseDouble(mp08d009.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
                    mp08d009.setError("Invalid: Greater then 0");
                    mp08d009.requestFocus();
                    Log.i(TAG, "mp08d009: Invalid Greater then 0");
                    return false;
                } else {
                    mp08d009.setError(null);
                    if (Double.parseDouble(mp08d009.getText().toString()) < 15.0 || Double.parseDouble(mp08d009.getText().toString()) > 45.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
                        mp08d009.setError("Invalid: Range 15.0-45.0");
                        Log.i(TAG, "mp08d009: Invalid Range 15.0-45.0");
                        mp08d009.requestFocus();
                        return false;
                    } else {
                        mp08d009.setError(null);
                    }
                }
            }
        }

        TextView mp08d009id1_txt = (TextView) mp08d009id1.getSelectedView();
        if (mp08d009id1.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
            mp08d009id1_txt.setError("This data is Required!");
            mp08d009id1_txt.setText("This data is Required!");
            mp08d009id1_txt.requestFocus();
            Log.i(TAG, "mp08d009id1: This data is Required!");
            return false;
        } else {
            mp08d009id1_txt.setError(null);
        }

//        10
        if (mp08d010.getText().toString().isEmpty()) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d010), Toast.LENGTH_SHORT).show();
            mp08d010.setError("This data is Required!");
            mp08d010.requestFocus();
            Log.i(TAG, "mp08d010: This data is Required!");
            return false;
        } else {
            mp08d010.setError(null);
            if (!mp08d010.getText().toString().contains(".")) {
                Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d010), Toast.LENGTH_SHORT).show();
                mp08d010.setError("Invalid: Decimal value is Required!");
                mp08d010.requestFocus();
                Log.i(TAG, "mp08d010: Invalid Decimal value is Required!");
                return false;
            } else {
                mp08d010.setError(null);
                if (Double.parseDouble(mp08d010.getText().toString()) < 1) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d010), Toast.LENGTH_SHORT).show();
                    mp08d010.setError("Invalid: Greater then 0");
                    mp08d010.requestFocus();
                    Log.i(TAG, "mp08d010: Invalid Greater then 0");
                    return false;
                } else {
                    mp08d010.setError(null);
                    if (Double.parseDouble(mp08d010.getText().toString()) < 15.0 || Double.parseDouble(mp08d010.getText().toString()) > 45.0) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d010), Toast.LENGTH_SHORT).show();
                        mp08d010.setError("Invalid: Range 15.0-45.0");
                        mp08d010.requestFocus();
                        Log.i(TAG, "mp08d010: Invalid Range 15.0-45.0");
                        return false;
                    } else {
                        mp08d010.setError(null);
                    }
                }
            }
        }

        TextView mp08d010id2_txt = (TextView) mp08d010id2.getSelectedView();
        if (mp08d010id2.getSelectedItemPosition() == 0) {
            Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d010), Toast.LENGTH_SHORT).show();
            mp08d010id2_txt.setError("This data is Required!");
            mp08d010id2_txt.setText("This data is Required!");
            mp08d010id2_txt.requestFocus();
            Log.i(TAG, "mp08d010id2: This data is Required!");
            return false;
        } else {
            mp08d010id2_txt.setError(null);
        }
        if (mp08d009id1.getSelectedItem().toString().contains(mp08d010id2.getSelectedItem().toString())) {
            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d009), Toast.LENGTH_SHORT).show();
            mp08d009id1_txt.setError("Users Same");
            mp08d010id2_txt.setError("Users Same");
            mp08d010id2_txt.requestFocus();
            Log.i(TAG, "mp08d009id1: Users Same");
            return false;
        } else {
            mp08d009id1_txt.setError(null);
            mp08d010id2_txt.setError(null);
        }

//        Skip
        //        Question 12 Checking

        double q12 = Double.parseDouble(mp08d009.getText().toString()) - Double.parseDouble(mp08d010.getText().toString());

        if (Math.signum(q12) == -1) {
            q12 = q12 * -1;
        }

        if (!flag_q12) {
            if (q12 > 0.5) {
                flag_q12 = true;

                fldGrpmp08d012.setVisibility(View.VISIBLE);
                mp08d009.setEnabled(false);
                mp08d010.setEnabled(false);

                mp08d009id1.setEnabled(false);
                mp08d010id2.setEnabled(false);

                Toast.makeText(this, "ERROR(invalid): Difference in Measurement", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "mp08d009 & mp08d010: Difference in Measurement");

                return false;
            }
        }

        if (flag_q12) {
//            12
            if (mp08d012.getText().toString().isEmpty()) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d012), Toast.LENGTH_SHORT).show();
                mp08d012.setError("This data is Required!");
                mp08d012.requestFocus();
                Log.i(TAG, "mp08d012: This data is Required!");
                return false;
            } else {
                mp08d012.setError(null);
                if (!mp08d012.getText().toString().contains(".")) {
                    Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d012), Toast.LENGTH_SHORT).show();
                    mp08d012.setError("Invalid: Decimal value is Required!");
                    mp08d012.requestFocus();
                    Log.i(TAG, "mp08d012: Decimal value is Required!");
                    return false;
                } else {
                    mp08d012.setError(null);
                    if (Double.parseDouble(mp08d012.getText().toString()) < 1) {
                        Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d012), Toast.LENGTH_SHORT).show();
                        mp08d012.setError("Invalid: Greater then 0");
                        Log.i(TAG, "mp08d012: Greater then 0");
                        mp08d012.requestFocus();
                        return false;
                    } else {
                        mp08d012.setError(null);
                        if (Double.parseDouble(mp08d012.getText().toString()) < 15.0 || Double.parseDouble(mp08d012.getText().toString()) > 45.0) {
                            Toast.makeText(this, "ERROR(invalid): " + getString(R.string.mp08d012), Toast.LENGTH_SHORT).show();
                            mp08d012.setError("Invalid: Range 15.0-45.0");
                            Log.i(TAG, "mp08d012: Range 15.0-45.0");
                            mp08d012.requestFocus();
                            return false;
                        } else {
                            mp08d012.setError(null);
                        }
                    }
                }
            }

            TextView mp08d012id3_txt = (TextView) mp08d012id3.getSelectedView();
            if (mp08d012id3.getSelectedItemPosition() == 0) {
                Toast.makeText(this, "ERROR(empty): " + getString(R.string.mp08d012), Toast.LENGTH_SHORT).show();
                mp08d012id3_txt.setError("This data is Required!");
                mp08d012id3_txt.setText("This data is Required!");
                mp08d012id3_txt.requestFocus();
                Log.i(TAG, "mp08d012id3: This data is Required!");
                return false;
            } else {
                mp08d012id3_txt.setError(null);
            }
        }



        return true;
    }

    private void SaveDraft() throws JSONException {
        Toast.makeText(this, "Saving Draft for  This Section", Toast.LENGTH_SHORT).show();

        JSONObject form4 = new JSONObject();

        form4.put("mp08d001", mp08d001.getText().toString());
        form4.put("mp08d001id1", mp08d001id1.getSelectedItem().toString());

        form4.put("mp08d002", mp08d002.getText().toString());
        form4.put("mp08d002id2", mp08d002id2.getSelectedItem().toString());

        form4.put("mp08d003", flag_q4 ? "1" : "2");

        form4.put("mp08d004", mp08d004.getText().toString());
        form4.put("mp08d004id3", mp08d004id3.getSelectedItem().toString());

        form4.put("mp08d005", mp08d005.getText().toString());
        form4.put("mp08d005id1", mp08d005id1.getSelectedItem().toString());

        form4.put("mp08d006", mp08d006.getText().toString());
        form4.put("mp08d006id2", mp08d006id2.getSelectedItem().toString());

        form4.put("mp08d007", flag_q8 ? "1" : "2");

        form4.put("mp08d008", mp08d008.getText().toString());
        form4.put("mp08d008id3", mp08d008id3.getSelectedItem().toString());

        form4.put("mp08d009", mp08d009.getText().toString());
        form4.put("mp08d009id1", mp08d009id1.getSelectedItem().toString());

        form4.put("mp08d010", mp08d010.getText().toString());
        form4.put("mp08d010id2", mp08d010id2.getSelectedItem().toString());

        form4.put("mp08d011", flag_q12 ? "1" : "2");

        form4.put("mp08d012", mp08d012.getText().toString());
        form4.put("mp08d012id3", mp08d012id3.getSelectedItem().toString());


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

    @Override
    public void onBackPressed() {
        Toast.makeText(getApplicationContext(), "You Can't go back", Toast.LENGTH_LONG).show();
    }



}

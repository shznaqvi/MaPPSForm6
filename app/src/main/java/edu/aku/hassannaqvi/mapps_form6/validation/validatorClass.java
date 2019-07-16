package edu.aku.hassannaqvi.mapps_form6.validation;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by ali.azaz on 12/04/17.
 */

public abstract class validatorClass {

    public static boolean EmptyTextBox(Context context, EditText txt, String msg) {
        if (TextUtils.isEmpty(txt.getText().toString())) {
            Toast.makeText(context, "ERROR(empty): " + msg, Toast.LENGTH_SHORT).show();
            txt.setError("This data is Required! ");    // Set Error on last radio button
            txt.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(txt.getId()) + ": This data is Required!");
            return false;
        } else {
            txt.setError(null);
            return true;
        }
    }

    public static boolean RangeTextBox(Context context, EditText txt, int min, int max, String msg, String type) {

        if (Integer.valueOf(txt.getText().toString()) < min || Integer.valueOf(txt.getText().toString()) > max) {
            Toast.makeText(context, "ERROR(invalid): " + msg, Toast.LENGTH_SHORT).show();
            txt.setError("Range is " + min + " to " + max + type + " ... ");    // Set Error on last radio button
            txt.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(txt.getId()) + ": Range is " + min + " to " + max + " times...  ");
            return false;
        } else {
            txt.setError(null);
            return true;
        }
    }


    public static boolean RangeTextBox(Context context, EditText txt, double min, double max, String msg, String type) {

        if (Double.valueOf(txt.getText().toString()) < min || Double.valueOf(txt.getText().toString()) > max) {
            Toast.makeText(context, "ERROR(invalid): " + msg, Toast.LENGTH_SHORT).show();
            txt.setError("Range is " + min + " to " + max + type + " ... ");    // Set Error on last radio button
            txt.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(txt.getId()) + ": Range is " + min + " to " + max + " times...  ");
            return false;
        } else {
            txt.setError(null);
            return true;
        }
    }

    public static boolean EmptySpinner(Context context, Spinner spin, String msg) {
        if (spin.getSelectedItem() == "....") {
            Toast.makeText(context, "ERROR(Empty)" + msg, Toast.LENGTH_SHORT).show();
            ((TextView) spin.getSelectedView()).setText("This Data is Required");
            ((TextView) spin.getSelectedView()).setTextColor(Color.RED);
            spin.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(spin.getId()) + ": This data is Required!");
            return false;
        } else {
            ((TextView) spin.getSelectedView()).setError(null);
            return true;
        }
    }


    public static boolean DuplicateItemSelected(Context context, Spinner spin, Spinner spin2, String msg) {
        if (spin.getSelectedItem().toString().contains(spin2.getSelectedItem().toString())) {
            Toast.makeText(context, "ERROR(invalid) Users same" + msg, Toast.LENGTH_SHORT).show();
            ((TextView) spin.getSelectedView()).setText("Users Same");
            ((TextView) spin2.getSelectedView()).setText("Users Same");
            ((TextView) spin.getSelectedView()).setTextColor(Color.RED);
            ((TextView) spin2.getSelectedView()).setTextColor(Color.RED);
            spin.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(spin.getId()) + ": This data is Required!");
            return false;
        } else {
            ((TextView) spin.getSelectedView()).setError(null);
            return true;
        }
    }

    public static boolean EmptyRadioButton(Context context, RadioGroup rdGrp, RadioButton rdBtn, String msg) {
        if (rdGrp.getCheckedRadioButtonId() == -1) {
            Toast.makeText(context, "ERROR(empty): " + msg, Toast.LENGTH_SHORT).show();
            rdBtn.setError("This data is Required!");    // Set Error on last radio button

            rdBtn.setFocusable(true);
            rdBtn.setFocusableInTouchMode(true);
            rdBtn.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(rdGrp.getId()) + ": This data is Required!");
            return false;
        } else {
            rdBtn.setError(null);
            return true;
        }
    }

    public static boolean EmptyRadioButton(Context context, RadioGroup rdGrp, RadioButton rdBtn, EditText txt, String msg) {
        if (rdGrp.getCheckedRadioButtonId() == -1) {
            Toast.makeText(context, "ERROR(empty): " + msg, Toast.LENGTH_SHORT).show();
            rdBtn.setError("This data is Required!");    // Set Error on last radio button

            rdBtn.setFocusable(true);
            rdBtn.setFocusableInTouchMode(true);
            rdBtn.requestFocus();
            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(rdGrp.getId()) + ": This data is Required!");
            return false;
        } else {
            rdBtn.setError(null);
            if (rdBtn.isChecked()) {
                return EmptyTextBox(context, txt, msg);
            } else {
                return true;
            }
        }
    }

    public static boolean EmptyCheckBox(Context context, LinearLayout container, CheckBox cbx, String msg) {

        Boolean flag = false;
        for (int i = 0; i < container.getChildCount(); i++) {
            View v = container.getChildAt(i);
            if (v instanceof CheckBox) {
                CheckBox cb = (CheckBox) v;
                if (cb.isChecked()) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            return true;
        } else {
            Toast.makeText(context, "ERROR(empty): " + msg, Toast.LENGTH_LONG).show();
            cbx.setError("This data is Required!");    // Set Error on last radio button

            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(cbx.getId()) + ": This data is Required!");
            return false;
        }
    }

    public static boolean EmptyCheckBox(Context context, LinearLayout container, CheckBox cbx, EditText txt, String msg) {

        Boolean flag = false;
        for (int i = 0; i < container.getChildCount(); i++) {
            View v = container.getChildAt(i);
            if (v instanceof CheckBox) {
                CheckBox cb = (CheckBox) v;
                if (cb.isChecked()) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            cbx.setError(null);
            if (cbx.isChecked()) {
                return EmptyTextBox(context, txt, msg);
            }
            return true;
        } else {
            Toast.makeText(context, "ERROR(empty): " + msg, Toast.LENGTH_LONG).show();
            cbx.setError("This data is Required!");    // Set Error on last radio button

            Log.i(context.getClass().getName(), context.getResources().getResourceEntryName(cbx.getId()) + ": This data is Required!");
            return false;
        }
    }

    public static boolean EmptyCheckingContainer(Context context, LinearLayout lv) {

        for (int i = 0; i < lv.getChildCount(); i++) {
            View view = lv.getChildAt(i);

            if (view.getVisibility() == View.GONE || !view.isEnabled())
                continue;

            // use tag for some situations
            if (view.getTag() != null && view.getTag().equals("-1")) {
                if (view instanceof EditText)
                    ((EditText) view).setError(null);
                else if (view instanceof LinearLayout)
                    ClearClass.ClearAllFields(view, null);
                else if (view instanceof CheckBox)
                    ((CheckBox) view).setError(null);
                continue;
            } else if (view instanceof RadioGroup) {

                View v = ((RadioGroup) view).getChildAt(0);
                if (v != null) {

                    String asNamed = getString(context, getIDComponent(view));

                    if (!EmptyRadioButton(context, (RadioGroup) view, (RadioButton) v, asNamed)) {
                        return false;
                    }
                }
            } else if (view instanceof Spinner) {
                if (!EmptySpinner(context, (Spinner) view, getString(context, getIDComponent(view)))) {
                    return false;
                }
            } else if (view instanceof EditText) {
                    if (!EmptyTextBox(context, (EditText) view, getString(context, getIDComponent(view)))) {
                        return false;
                    }
            } else if (view instanceof CheckBox) {
                if (!((CheckBox) view).isChecked()) {
                    ((CheckBox) view).setError(getString(context, getIDComponent(view)));
                    FancyToast.makeText(context, "ERROR(empty): " + getString(context, getIDComponent(view)), FancyToast.LENGTH_SHORT, FancyToast.ERROR, false).show();
                    return false;
                }
            } else if (view instanceof LinearLayout) {

                int length = ((LinearLayout) view).getChildCount();

                if (length > 0) {
                    if (((LinearLayout) view).getChildAt(0) instanceof CheckBox) {
                        if (!EmptyCheckBox(context, ((LinearLayout) view),
                                (CheckBox) ((LinearLayout) view).getChildAt(0),
                                getString(context, getIDComponent(((LinearLayout) view).getChildAt(0))))) {
                            return false;
                        }
                    } else if (!EmptyCheckingContainer(context, (LinearLayout) view)) {
                        return false;
                    }
                } else if (!EmptyCheckingContainer(context, (LinearLayout) view)) {
                    return false;
                }
            }
        }
        return true;
    }

}

package edu.aku.hassannaqvi.mappsform07.getclasses;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import edu.aku.hassannaqvi.mappsform07.contracts.FUPContract;
import edu.aku.hassannaqvi.mappsform07.core.AppMain;
import edu.aku.hassannaqvi.mappsform07.core.DatabaseHelper;

/**
 * Created by ali.azaz on 05/22/2018.
 */
public class GetFollowUps extends AsyncTask<String, String, String> {

    private final String TAG = "GetFollowUps()";
    HttpURLConnection urlConnection;
    private Context mContext;
    private ProgressDialog pd;

    public GetFollowUps(Context context) {
        mContext = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        pd = new ProgressDialog(mContext);
        pd.setTitle("Syncing FollowUps");
        pd.setMessage("Getting connected to server...");
        pd.show();

    }

    @Override
    protected String doInBackground(String... args) {

        StringBuilder result = new StringBuilder();

        try {
            URL url = new URL(AppMain._HOST_URL_9 + FUPContract.SingleFup._URIGET);
            urlConnection = (HttpURLConnection) url.openConnection();
            if (urlConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream in = new BufferedInputStream(urlConnection.getInputStream());

                BufferedReader reader = new BufferedReader(new InputStreamReader(in));

                String line;
                while ((line = reader.readLine()) != null) {
                    Log.i(TAG, "FollowUps In: " + line);
                    result.append(line);
                }
            }
        } catch (java.net.SocketTimeoutException e) {
            return null;
        } catch (java.io.IOException e) {
            return null;
        } finally {
            urlConnection.disconnect();
        }
        return result.toString();
    }

    @Override
    protected void onPostExecute(String result) {
        if (result != null) {

            String json = result;
            Log.d(TAG, result);
            if (json.length() > 0) {
                DatabaseHelper db = new DatabaseHelper(mContext);
                try {
                    JSONArray jsonArray = new JSONArray(json);
                    db.syncFollowUPS(jsonArray);
                    pd.setMessage("Received: " + jsonArray.length());
                    pd.show();
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else {
                pd.setMessage("Received: " + json.length() + "");
                pd.show();
            }
        } else {
            pd.setTitle("Connection Error");
            pd.setMessage("Server not found!");
            pd.show();
        }
    }

}
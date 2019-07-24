package edu.aku.hassannaqvi.mappsform07.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by hassan.naqvi on 11/30/2016.
 */

public class FormsContract {

    private String projectName = "MaPPS Study";
    private String surveyType = "Birth History & Maternal Antrhopometric Assessment (24 hours postpartum)";
    private Long _ID;
    private String UID = "";
    private String formDate = ""; // Date
    private String interviewer01 = ""; // Interviewer 01
    private String interviewer02 = ""; // Interviewer 02
    private String clustercode = "0000"; // Area Code
    private String villageacode = ""; // Sub-Area Code
    private String household = ""; // Household number
    private String istatus = ""; // Interview Status
    private String endingDateTime = "";
    private String lhwCode = ""; // lhwcode
    private String formType = "";
    private String sno = "";
    private String sInfo = "";
    private String s7B = "";
    private String s7D = "";
    private String s7E = "";
    private String s8B = "";
    private String s8C = "";
    private String s8D = "";
    private String s8E = "";
    private String s9B = "";
    private String s9C = "";
    private String s9D = "";
    private String s9E = "";

    private String s10B = "";
    private String s10C = "";
    private String s10D = "";
    private String s10E = "";
    private String s10E2 = "";
    private String s9F = "";
    private String s11B = "";
    private String childId = "";
    private String gpsLat = "";
    private String gpsLng = "";
    private String gpsTime = "";
    private String gpsAcc = "";
    private String deviceID = "";
    private String tagID = "";
    private String app_version = "";
    private String synced = "";
    private String synced_date = "";

    public FormsContract() {
    }

    public FormsContract(String formDate, String household, String istatus, String sno, String formType) {
        this.formDate = formDate;
        this.household = household;
        this.istatus = istatus;
        this.sno = sno;
        this.formType = formType;
    }

    public void setSurveyType(String surveyType) {
        this.surveyType = surveyType;
    }

    public String getS7B() {
        return s7B;
    }

    public void setS7B(String s7B) {
        this.s7B = s7B;
    }

    public String getS7D() {
        return s7D;
    }

    public void setS7D(String s7D) {
        this.s7D = s7D;
    }

    public String getS7E() {
        return s7E;
    }

    public void setS7E(String s7E) {
        this.s7E = s7E;
    }

    public String getS9B() {
        return s9B;
    }

    public void setS9B(String s9B) {
        this.s9B = s9B;
    }

    public String getS9C() {
        return s9C;
    }

    public void setS9C(String s9C) {
        this.s9C = s9C;
    }

    public String getS9D() {
        return s9D;
    }

    public void setS9D(String s9D) {
        this.s9D = s9D;
    }

    public String getS10B() {
        return s10B;
    }

    public void setS10B(String s10B) {
        this.s10B = s10B;
    }

    public String getS10C() {
        return s10C;
    }

    public void setS10C(String s10C) {
        this.s10C = s10C;
    }

    public String getS10D() {
        return s10D;
    }

    public void setS10D(String s10D) {
        this.s10D = s10D;
    }

    public String getS10E() {
        return s10E;
    }

    public String getS9F() {
        return s9F;
    }

    public void setS10E(String s10E) {
        this.s10E = s10E;
    }

    public void setS9F(String s9F) {
        this.s9F = s9F;
    }

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public String getFormType() {

        return formType;
    }

    public void setFormType(String formType) {
        this.formType = formType;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getSurveyType() {
        return surveyType;
    }

    public Long getID() {
        return _ID;
    }

    public void setID(Long _ID) {
        this._ID = _ID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID;
    }

    public String getFormDate() {
        return formDate;
    }

    public void setFormDate(String formDate) {
        this.formDate = formDate;
    }

    public String getInterviewer01() {
        return interviewer01;
    }

    public void setInterviewer01(String interviewer01) {
        this.interviewer01 = interviewer01;
    }

    public String getInterviewer02() {
        return interviewer02;
    }

    public void setInterviewer02(String interviewer02) {
        this.interviewer02 = interviewer02;
    }

    public String getClustercode() {
        return clustercode;
    }

    public void setClustercode(String clustercode) {
        this.clustercode = clustercode;
    }

    public String getVillageacode() {
        return villageacode;
    }

    public void setVillageacode(String villageacode) {
        this.villageacode = villageacode;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public String getIstatus() {
        return istatus;
    }

    public void setIstatus(String istatus) {
        this.istatus = istatus;
    }


    public String getEndingDateTime() {
        return endingDateTime;
    }

    public void setEndingDateTime(String endingDateTime) {
        this.endingDateTime = endingDateTime;
    }

    public String getsInfo() {
        return sInfo;
    }

    public void setsInfo(String sInfo) {
        this.sInfo = sInfo;
    }

    public String getS8B() {
        return s8B;
    }

    public void setS8B(String s8B) {
        this.s8B = s8B;
    }

    public String getS8C() {
        return s8C;
    }

    public void setS8C(String s8C) {
        this.s8C = s8C;
    }

    public String getS8D() {
        return s8D;
    }

    public void setS8D(String s8D) {
        this.s8D = s8D;
    }

    public String getS8E() {
        return s8E;
    }

    public void setS8E(String s8E) {
        this.s8E = s8E;
    }

    public String getGpsLat() {
        return gpsLat;
    }

    public void setGpsLat(String gpsLat) {
        this.gpsLat = gpsLat;
    }

    public String getGpsLng() {
        return gpsLng;
    }

    public void setGpsLng(String gpsLng) {
        this.gpsLng = gpsLng;
    }

    public String getGpsTime() {
        return gpsTime;
    }

    public void setGpsTime(String gpsTime) {
        this.gpsTime = gpsTime;
    }

    public String getGpsAcc() {
        return gpsAcc;
    }

    public void setGpsAcc(String gpsAcc) {
        this.gpsAcc = gpsAcc;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getApp_version() {
        return app_version;
    }

    public void setApp_version(String app_version) {
        this.app_version = app_version;
    }

    public String getSynced() {
        return synced;
    }

    public void setSynced(String synced) {
        this.synced = synced;
    }

    public String getSynced_date() {
        return synced_date;
    }

    public void setSynced_date(String synced_date) {
        this.synced_date = synced_date;
    }

    public String getLhwCode() {
        return lhwCode;
    }

    public void setLhwCode(String lhwCode) {
        this.lhwCode = lhwCode;
    }

    public String getTagID() {
        return tagID;
    }

    public void setTagID(String tagID) {
        this.tagID = tagID;
    }

    public String getS9E() {
        return s9E;
    }

    public void setS9E(String s9E) {
        this.s9E = s9E;
    }

    public String getS10E2() {
        return s10E2;
    }

    public void setS10E2(String s10E2) {
        this.s10E2 = s10E2;
    }

    public String getS11B() {
        return s11B;
    }

    public void setS11B(String s11B) {
        this.s11B = s11B;
    }

    public FormsContract Sync(JSONObject jsonObject) throws JSONException {
        this.projectName = jsonObject.getString(FormsTable.COLUMN_PROJECTNAME);
        this.surveyType = jsonObject.getString(FormsTable.COLUMN_SURVEYTYPE);
        this._ID = jsonObject.getLong(FormsTable.COLUMN__ID);
        this.UID = jsonObject.getString(FormsTable.COLUMN_UID);
        this.formDate = jsonObject.getString(FormsTable.COLUMN_FORMDATE);
        this.interviewer01 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER01);
        this.interviewer02 = jsonObject.getString(FormsTable.COLUMN_INTERVIEWER02);
        this.clustercode = jsonObject.getString(FormsTable.COLUMN_CLUSTERCODE);
        this.villageacode = jsonObject.getString(FormsTable.COLUMN_VILLAGEACODE);
        this.household = jsonObject.getString(FormsTable.COLUMN_HOUSEHOLD);
        this.lhwCode = jsonObject.getString(FormsTable.COLUMN_LHWCODE);
        this.istatus = jsonObject.getString(FormsTable.COLUMN_ISTATUS);
        this.sno = jsonObject.getString(FormsTable.COLUMN_SNO);
        this.formType = jsonObject.getString(FormsTable.COLUMN_FORMTYPE);
        this.sInfo = jsonObject.getString(FormsTable.COLUMN_SINFO);
        this.s8B = jsonObject.getString(FormsTable.COLUMN_S8B);
        this.s8C = jsonObject.getString(FormsTable.COLUMN_S8C);
        this.s8D = jsonObject.getString(FormsTable.COLUMN_S8D);
        this.s8E = jsonObject.getString(FormsTable.COLUMN_S8E);

        this.s7B = jsonObject.getString(FormsTable.COLUMN_S7B);
        this.s7D = jsonObject.getString(FormsTable.COLUMN_S7D);
        this.s7E = jsonObject.getString(FormsTable.COLUMN_S7E);
        this.s9B = jsonObject.getString(FormsTable.COLUMN_S9B);
        this.s9C = jsonObject.getString(FormsTable.COLUMN_S9C);
        this.s9D = jsonObject.getString(FormsTable.COLUMN_S9D);
        this.s9E = jsonObject.getString(FormsTable.COLUMN_S9E);
        this.s10B = jsonObject.getString(FormsTable.COLUMN_S10B);
        this.s10C = jsonObject.getString(FormsTable.COLUMN_S10C);
        this.s10D = jsonObject.getString(FormsTable.COLUMN_S10D);
        this.s10E = jsonObject.getString(FormsTable.COLUMN_S10E);
        this.s10E2 = jsonObject.getString(FormsTable.COLUMN_S10E2);
        this.s11B = jsonObject.getString(FormsTable.COLUMN_S11B);
        this.s9F = jsonObject.getString(FormsTable.COLUMN_S9F);
        this.childId = jsonObject.getString(FormsTable.COLUMN_CHILD_ID);

        this.endingDateTime = jsonObject.getString(FormsTable.COLUMN_ENDINGDATETIME);
        this.gpsLat = jsonObject.getString(FormsTable.COLUMN_GPSLAT);
        this.gpsLng = jsonObject.getString(FormsTable.COLUMN_GPSLNG);
        this.gpsTime = jsonObject.getString(FormsTable.COLUMN_GPSTIME);
        this.gpsAcc = jsonObject.getString(FormsTable.COLUMN_GPSACC);
        this.deviceID = jsonObject.getString(FormsTable.COLUMN_DEVICEID);
        this.tagID = jsonObject.getString(FormsTable.COLUMN_DEVICETAGID);
        this.app_version = jsonObject.getString(FormsTable.COLUMN_APP_VERSION);
        this.synced = jsonObject.getString(FormsTable.COLUMN_SYNCED);
        this.synced_date = jsonObject.getString(FormsTable.COLUMN_SYNCED_DATE);

        return this;

    }

    public FormsContract HydrateC(Cursor cursor) {

        this._ID = cursor.getLong(cursor.getColumnIndex(FormsTable.COLUMN__ID));
        this.childId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CHILD_ID));

        return this;

    }

    public FormsContract Hydrate(Cursor cursor, int type) {
        this.projectName = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_PROJECTNAME));
        this.surveyType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SURVEYTYPE));
        this._ID = cursor.getLong(cursor.getColumnIndex(FormsTable.COLUMN__ID));
        this.UID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_UID));
        this.formDate = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMDATE));
        this.interviewer01 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER01));
        this.interviewer02 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_INTERVIEWER02));
        this.clustercode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CLUSTERCODE));
        this.villageacode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_VILLAGEACODE));
        this.household = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_HOUSEHOLD));
        this.lhwCode = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_LHWCODE));
        this.istatus = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ISTATUS));
        this.sno = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SNO));
        this.formType = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_FORMTYPE));
        this.sInfo = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SINFO));

        if (type == 7 || type == 0) {
            this.s7B = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S7B));
            this.s7D = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S7D));
            this.s7E = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S7E));
        } else if (type == 8 || type == 0) {
            this.s8B = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S8B));
            this.s8C = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S8C));
            this.s8D = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S8D));
            this.s8E = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S8E));
        } else if (type == 9 || type == 0) {
            this.s9B = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S9B));
            this.s9C = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S9C));
            this.s9D = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S9D));
            this.s9E = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S9E));
            this.s9F = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S9F));
        } else if (type == 10 || type == 0) {
            this.s10B = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S10B));
            this.s10C = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S10C));
            this.s10D = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S10D));
            this.s10E = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S10E));
            this.s10E2 = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S10E2));
        } else if (type == 11 || type == 0) {
            this.s11B = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_S11B));
        }

        this.childId = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_CHILD_ID));

        this.endingDateTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_ENDINGDATETIME));
        this.gpsLat = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLAT));
        this.gpsLng = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSLNG));
        this.gpsTime = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSTIME));
        this.gpsAcc = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_GPSACC));
        this.deviceID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICEID));
        this.tagID = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_DEVICETAGID));
        this.app_version = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_APP_VERSION));
        this.synced = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED));
        this.synced_date = cursor.getString(cursor.getColumnIndex(FormsTable.COLUMN_SYNCED_DATE));

        return this;

    }


    public JSONObject toJSONObject() throws JSONException {

        JSONObject json = new JSONObject();

        json.put(FormsTable.COLUMN_PROJECTNAME, this.projectName == null ? JSONObject.NULL : this.projectName);
        json.put(FormsTable.COLUMN_SURVEYTYPE, this.surveyType == null ? JSONObject.NULL : this.surveyType);
        json.put(FormsTable.COLUMN__ID, this._ID == null ? JSONObject.NULL : this._ID);
        json.put(FormsTable.COLUMN_UID, this.UID == null ? JSONObject.NULL : this.UID);
        json.put(FormsTable.COLUMN_FORMDATE, this.formDate == null ? JSONObject.NULL : this.formDate);
        json.put(FormsTable.COLUMN_INTERVIEWER01, this.interviewer01 == null ? JSONObject.NULL : this.interviewer01);
        json.put(FormsTable.COLUMN_INTERVIEWER02, this.interviewer02 == null ? JSONObject.NULL : this.interviewer02);
        json.put(FormsTable.COLUMN_CLUSTERCODE, this.clustercode == null ? JSONObject.NULL : this.clustercode);
        json.put(FormsTable.COLUMN_VILLAGEACODE, this.villageacode == null ? JSONObject.NULL : this.villageacode);
        json.put(FormsTable.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);
        json.put(FormsTable.COLUMN_LHWCODE, this.lhwCode == null ? JSONObject.NULL : this.lhwCode);
        json.put(FormsTable.COLUMN_ISTATUS, this.istatus == null ? JSONObject.NULL : this.istatus);
        json.put(FormsTable.COLUMN_SNO, this.sno == null ? JSONObject.NULL : this.sno);
        json.put(FormsTable.COLUMN_FORMTYPE, this.formType == null ? JSONObject.NULL : this.formType);
        json.put(FormsTable.COLUMN_CHILD_ID, this.childId == null ? JSONObject.NULL : this.childId);
        try {
            if (!this.sInfo.equals("")) {
                json.put(FormsTable.COLUMN_SINFO, this.sInfo == null ? JSONObject.NULL : new JSONObject(this.sInfo));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.s8B.equals("")) {
                json.put(FormsTable.COLUMN_S8B, this.s8B == null ? JSONObject.NULL : new JSONObject(this.s8B));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s8C.equals("")) {
                json.put(FormsTable.COLUMN_S8C, this.s8C == null ? JSONObject.NULL : new JSONObject(this.s8C));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s8D.equals("")) {
                json.put(FormsTable.COLUMN_S8D, this.s8D == null ? JSONObject.NULL : new JSONObject(this.s8D));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s8E.equals("")) {
                json.put(FormsTable.COLUMN_S8E, this.s8E == null ? JSONObject.NULL : new JSONObject(this.s8E));
            }
        } catch (Exception e) {
        }


        try {
            if (!this.s7B.equals("")) {
                json.put(FormsTable.COLUMN_S7B, this.s7B == null ? JSONObject.NULL : new JSONObject(this.s7B));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s7D.equals("")) {
                json.put(FormsTable.COLUMN_S7D, this.s7D == null ? JSONObject.NULL : new JSONObject(this.s7D));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s7E.equals("")) {
                json.put(FormsTable.COLUMN_S7E, this.s7E == null ? JSONObject.NULL : new JSONObject(this.s7E));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s9B.equals("")) {
                json.put(FormsTable.COLUMN_S9B, this.s9B == null ? JSONObject.NULL : new JSONObject(this.s9B));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s9C.equals("")) {
                json.put(FormsTable.COLUMN_S9C, this.s9C == null ? JSONObject.NULL : new JSONObject(this.s9C));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s9D.equals("")) {
                json.put(FormsTable.COLUMN_S9D, this.s9D == null ? JSONObject.NULL : new JSONObject(this.s9D));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s9E.equals("")) {
                json.put(FormsTable.COLUMN_S9E, this.s9E == null ? JSONObject.NULL : new JSONObject(this.s9E));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s10B.equals("")) {
                json.put(FormsTable.COLUMN_S10B, this.s10B == null ? JSONObject.NULL : new JSONObject(this.s10B));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s10C.equals("")) {
                json.put(FormsTable.COLUMN_S10C, this.s10C == null ? JSONObject.NULL : new JSONObject(this.s10C));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s10D.equals("")) {
                json.put(FormsTable.COLUMN_S10D, this.s10D == null ? JSONObject.NULL : new JSONObject(this.s10D));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s10E.equals("")) {
                json.put(FormsTable.COLUMN_S10E, this.s10E == null ? JSONObject.NULL : new JSONObject(this.s10E));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s10E2.equals("")) {
                json.put(FormsTable.COLUMN_S10E2, this.s10E2 == null ? JSONObject.NULL : new JSONObject(this.s10E2));
            }
        } catch (Exception e) {
        }

        try {
            if (!this.s11B.equals("")) {
                json.put(FormsTable.COLUMN_S11B, this.s11B == null ? JSONObject.NULL : new JSONObject(this.s11B));
            }
        } catch (Exception e) {
        }
        try {
            if (!this.s9F.equals("")) {
                json.put(FormsTable.COLUMN_S9F, this.s9F == null ? JSONObject.NULL : new JSONObject(this.s9F));
            }
        } catch (Exception e) {
        }


        json.put(FormsTable.COLUMN_ENDINGDATETIME, this.endingDateTime == null ? JSONObject.NULL : this.endingDateTime);
        json.put(FormsTable.COLUMN_GPSLAT, this.gpsLat == null ? JSONObject.NULL : this.gpsLat);
        json.put(FormsTable.COLUMN_GPSLNG, this.gpsLng == null ? JSONObject.NULL : this.gpsLng);
        json.put(FormsTable.COLUMN_GPSTIME, this.gpsTime == null ? JSONObject.NULL : this.gpsTime);
        json.put(FormsTable.COLUMN_GPSACC, this.gpsAcc == null ? JSONObject.NULL : this.gpsAcc);
        json.put(FormsTable.COLUMN_DEVICEID, this.deviceID == null ? JSONObject.NULL : this.deviceID);
        json.put(FormsTable.COLUMN_DEVICETAGID, this.tagID == null ? JSONObject.NULL : this.tagID);
        json.put(FormsTable.COLUMN_APP_VERSION, this.app_version == null ? JSONObject.NULL : this.app_version);
        json.put(FormsTable.COLUMN_SYNCED, this.synced == null ? JSONObject.NULL : this.synced);
        json.put(FormsTable.COLUMN_SYNCED_DATE, this.synced_date == null ? JSONObject.NULL : this.synced_date);


        return json;
    }

    public static abstract class FormsTable implements BaseColumns {

        public static final String TABLE_NAME = "forms";
        public static final String _URL = "forms.php";
        public static final String COLUMN_NAME_NULLABLE = "NULLHACK";
        public static final String COLUMN_PROJECTNAME = "projectname";
        public static final String COLUMN_SURVEYTYPE = "surveytype";
        public static final String COLUMN__ID = "_id";
        public static final String COLUMN_UID = "uid";
        public static final String COLUMN_FORMDATE = "formdate";
        public static final String COLUMN_INTERVIEWER01 = "interviewer01";
        public static final String COLUMN_INTERVIEWER02 = "interviewer02";
        public static final String COLUMN_CLUSTERCODE = "clustercode";
        public static final String COLUMN_VILLAGEACODE = "villagename";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_ISTATUS = "istatus";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_FORMTYPE = "formtype";
        public static final String COLUMN_CHILD_ID = "childid";
        public static final String COLUMN_SINFO = "info";
        public static final String COLUMN_S7B = "s7b";
        public static final String COLUMN_S7D = "s7d";
        public static final String COLUMN_S7E = "s7e";
        public static final String COLUMN_S8B = "s8b";
        public static final String COLUMN_S8C = "s8c";
        public static final String COLUMN_S8D = "s8d";
        public static final String COLUMN_S8E = "s8e";
        public static final String COLUMN_S9B = "s9b";
        public static final String COLUMN_S9C = "s9c";
        public static final String COLUMN_S9D = "s9d";
        public static final String COLUMN_S9E = "s9e";
        public static final String COLUMN_S10B = "s10b";
        public static final String COLUMN_S10C = "s10c";
        public static final String COLUMN_S10D = "s10d";
        public static final String COLUMN_S10E = "s10e";
        public static final String COLUMN_S10E2 = "s10e2";
        public static final String COLUMN_S11B = "s11B";
        public static final String COLUMN_S9F = "s9F";

        public static final String COLUMN_ENDINGDATETIME = "endingdatetime";
        public static final String COLUMN_GPSLAT = "gpslat";
        public static final String COLUMN_GPSLNG = "gpslng";
        public static final String COLUMN_GPSTIME = "gpstime";
        public static final String COLUMN_GPSACC = "gpsacc";
        public static final String COLUMN_DEVICEID = "deviceid";
        public static final String COLUMN_DEVICETAGID = "tagid";
        public static final String COLUMN_APP_VERSION = "app_version";
        public static final String COLUMN_SYNCED = "synced";
        public static final String COLUMN_SYNCED_DATE = "synced_date";
    }
}

package edu.aku.hassannaqvi.mappsform07.contracts;

import android.database.Cursor;
import android.provider.BaseColumns;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by ali.azaz on 5/2/2018.
 */
public class FUPContract {
    private static final String TAG = "FOLLOWUP_CONTRACT";

    private String ROW_ID;
    private String id;
    private String muid;
    private String uid_f7;
    private String clustercode;
    private String lhwcode;
    private String sno;
    private String epname;
    private String childid;
    private String chname;
    private String fupdt;
    private String fupround;
    private String gendt;
    private String New;
    private String household;


    public FUPContract() {
    }

    public static String getTAG() {
        return TAG;
    }

    public String getROW_ID() {
        return ROW_ID;
    }

    public void setROW_ID(String ROW_ID) {
        this.ROW_ID = ROW_ID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMuid() {
        return muid;
    }

    public void setMuid(String muid) {
        this.muid = muid;
    }

    public String getUid_f7() {
        return uid_f7;
    }

    public void setUid_f7(String uid_f7) {
        this.uid_f7 = uid_f7;
    }

    public String getClustercode() {
        return clustercode;
    }

    public void setClustercode(String clustercode) {
        this.clustercode = clustercode;
    }

    public String getLhwcode() {
        return lhwcode;
    }

    public void setLhwcode(String lhwcode) {
        this.lhwcode = lhwcode;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getEpname() {
        return epname;
    }

    public void setEpname(String epname) {
        this.epname = epname;
    }

    public String getChildid() {
        return childid;
    }

    public void setChildid(String childid) {
        this.childid = childid;
    }

    public String getChname() {
        return chname;
    }

    public void setChname(String chname) {
        this.chname = chname;
    }

    public String getFupdt() {
        return fupdt;
    }

    public void setFupdt(String fupdt) {
        this.fupdt = fupdt;
    }

    public String getFupround() {
        return fupround;
    }

    public void setFupround(String fupround) {
        this.fupround = fupround;
    }

    public String getGendt() {
        return gendt;
    }

    public void setGendt(String gendt) {
        this.gendt = gendt;
    }

    public String getNew() {
        return New;
    }

    public void setNew(String aNew) {
        New = aNew;
    }

    public String getHousehold() {
        return household;
    }

    public void setHousehold(String household) {
        this.household = household;
    }

    public FUPContract Sync(JSONObject jsonObject) throws JSONException {
        this.id = jsonObject.getString(SingleFup.COLUMN_ID);
        this.muid = jsonObject.getString(SingleFup.COLUMN_MUID);
        this.uid_f7 = jsonObject.getString(SingleFup.COLUMN_UID_F7);
        this.clustercode = jsonObject.getString(SingleFup.COLUMN_CLUSTERCODE);
        this.lhwcode = jsonObject.getString(SingleFup.COLUMN_LHWCODE);
        this.household = jsonObject.getString(SingleFup.COLUMN_HOUSEHOLD);
        this.sno = jsonObject.getString(SingleFup.COLUMN_SNO);
        this.epname = jsonObject.getString(SingleFup.COLUMN_EPNAME);
        this.childid = jsonObject.getString(SingleFup.COLUMN_CHILDID);
        this.chname = jsonObject.getString(SingleFup.COLUMN_CHNAME);
        this.fupdt = jsonObject.getString(SingleFup.COLUMN_FUPDT);
        this.fupround = jsonObject.getString(SingleFup.COLUMN_FUPROUND);
        this.gendt = jsonObject.getString(SingleFup.COLUMN_GENDT);
        this.New = jsonObject.getString(SingleFup.COLUMN_NEW);

        return this;

    }

    public FUPContract Hydrate(Cursor cursor) {
        this.ROW_ID = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_ROW_ID));
        this.id = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_ID));
        this.muid = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_MUID));
        this.uid_f7 = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_UID_F7));
        this.clustercode = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_CLUSTERCODE));
        this.lhwcode = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_LHWCODE));
        this.sno = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_SNO));
        this.epname = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_EPNAME));
        this.childid = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_CHILDID));
        this.chname = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_CHNAME));
        this.fupdt = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_FUPDT));
        this.fupround = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_FUPROUND));
        this.gendt = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_GENDT));
        this.New = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_NEW));
        this.household = cursor.getString(cursor.getColumnIndex(SingleFup.COLUMN_HOUSEHOLD));

        return this;
    }

    public JSONObject toJSONObject() throws JSONException {
        JSONObject json = new JSONObject();

        json.put(SingleFup.COLUMN_ROW_ID, this.ROW_ID == null ? JSONObject.NULL : this.ROW_ID);
        json.put(SingleFup.COLUMN_ID, this.id == null ? JSONObject.NULL : this.id);
        json.put(SingleFup.COLUMN_MUID, this.muid == null ? JSONObject.NULL : this.muid);
        json.put(SingleFup.COLUMN_UID_F7, this.uid_f7 == null ? JSONObject.NULL : this.uid_f7);
        json.put(SingleFup.COLUMN_CLUSTERCODE, this.clustercode == null ? JSONObject.NULL : this.clustercode);
        json.put(SingleFup.COLUMN_LHWCODE, this.lhwcode == null ? JSONObject.NULL : this.lhwcode);
        json.put(SingleFup.COLUMN_SNO, this.sno == null ? JSONObject.NULL : this.sno);
        json.put(SingleFup.COLUMN_EPNAME, this.epname == null ? JSONObject.NULL : this.epname);
        json.put(SingleFup.COLUMN_CHILDID, this.childid == null ? JSONObject.NULL : this.childid);
        json.put(SingleFup.COLUMN_CHNAME, this.chname == null ? JSONObject.NULL : this.chname);
        json.put(SingleFup.COLUMN_FUPDT, this.fupdt == null ? JSONObject.NULL : this.fupdt);
        json.put(SingleFup.COLUMN_FUPROUND, this.fupround == null ? JSONObject.NULL : this.fupround);
        json.put(SingleFup.COLUMN_GENDT, this.gendt == null ? JSONObject.NULL : this.gendt);
        json.put(SingleFup.COLUMN_NEW, this.New == null ? JSONObject.NULL : this.New);
        json.put(SingleFup.COLUMN_HOUSEHOLD, this.household == null ? JSONObject.NULL : this.household);


        return json;
    }

    public static abstract class SingleFup implements BaseColumns {

        public static final String TABLE_NAME = "followups";

        public static final String COLUMN_ROW_ID = "row_id";
        public static final String COLUMN_ID = "id";
        public static final String COLUMN_MUID = "muid";
        public static final String COLUMN_UID_F7 = "uid_f7";
        public static final String COLUMN_CLUSTERCODE = "clustercode";
        public static final String COLUMN_LHWCODE = "lhwcode";
        public static final String COLUMN_HOUSEHOLD = "household";
        public static final String COLUMN_SNO = "sno";
        public static final String COLUMN_EPNAME = "epname";
        public static final String COLUMN_CHILDID = "childid";
        public static final String COLUMN_CHNAME = "chname";
        public static final String COLUMN_FUPDT = "fupdt";
        public static final String COLUMN_FUPROUND = "fupround";
        public static final String COLUMN_GENDT = "gendt";
        public static final String COLUMN_NEW = "new";

        public static final String _URIGET = "childfollowups.php";
    }

}

package com.e.crimealertapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MReportDatabaseHelper extends SQLiteOpenHelper {
    public MReportDatabaseHelper(Context context) {
        super(context, "MyCrimes.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table Crime(crime_id text primary key,name text," +
                "phone text,crime_type text,location text,crime_description text," +
                "people_involved text,crime_condition text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("Drop table if exists Crime");

    }
    public boolean insert(String name, String phone,String crime_type,String
            location,String crime_description,String people_involved,String crime_condition)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",name);
        contentValues.put("phone",phone);
        contentValues.put("crime_type",crime_type);
        contentValues.put("location",location);
        contentValues.put("crime_description",crime_description);
        contentValues.put("people_involved",people_involved);
        contentValues.put("crime_condition",crime_condition);


        long ins = db.insert("Crime",null,contentValues);
        if (ins==-1)return false;
        else return true;

    }

}

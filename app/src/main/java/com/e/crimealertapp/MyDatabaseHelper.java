package com.e.crimealertapp;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDatabaseHelper extends SQLiteOpenHelper {
    public MyDatabaseHelper(Context context) {
        super(context, "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
       db.execSQL("create table user(email text primary key,phone text,password text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("Drop table if exists user");
    }
    //inserting into table
    public boolean insert(String email, String password,String phone)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("email",email);
        contentValues.put("password",password);

        long ins = db.insert("user",null,contentValues);
          if (ins==-1)return false;
          else return true;

    }

    //checking if eamil already exists
    public Boolean CheckMail(String email)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from user where email = ?", new String[]{email});
         if (cursor.getCount()>0)return false;
          else return true;

    }
    //checking for password and email;

    public Boolean checkPassAndEmail(String email, String password)
    {
        SQLiteDatabase db  = this.getReadableDatabase();
        Cursor cursor =db.rawQuery("select * from user where email = ? and password = ?",
                new String[]{email,password});
                if (cursor.getCount()>0)
                    return true;
                else return false;


    }
}

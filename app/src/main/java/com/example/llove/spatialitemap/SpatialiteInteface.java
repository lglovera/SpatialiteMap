package com.example.llove.spatialitemap;

import android.content.Context;
import android.webkit.JavascriptInterface;

import org.spatialite.database.SQLiteDatabase;
import org.spatialite.database.SQLiteOpenHelper;

/**
 * Created by llove on 03/03/17.
 */

public class SpatialiteInteface {
    Context mContext;
    SQLiteOpenHelper eventsData;
    SQLiteDatabase db;

    /** Instantiate the interface and set the context */
    SpatialiteInteface(Context c) {
        mContext = c;
        SQLiteDatabase.loadLibs(c);
        eventsData = new SQLiteOpenHelper(c, "events.db", null, 1) {
            @Override
            public void onCreate(SQLiteDatabase db) {

            }

            @Override
            public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

            }
        };

        db = eventsData.getWritableDatabase();
    }

    

    /** Show a toast from the web page */
    @JavascriptInterface
    public void showToast(String toast) {

       // Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();
    }
}

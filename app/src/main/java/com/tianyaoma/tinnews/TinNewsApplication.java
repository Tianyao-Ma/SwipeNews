package com.tianyaoma.tinnews;

import android.app.Application;
import android.telephony.data.ApnSetting;

import androidx.room.Room;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;
import com.facebook.stetho.Stetho;
import com.tianyaoma.tinnews.database.TinNewsDatabase;

public class TinNewsApplication extends Application {
    private static TinNewsDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        Stetho.initializeWithDefaults(this);
        database = Room.databaseBuilder(this, TinNewsDatabase.class,
                "tinnews_db").build();
        // TODO: new code here.
    }
    public static TinNewsDatabase getDatabase() {
        return database;
    }

}

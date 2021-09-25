package com.tianyaoma.tinnews;

import android.app.Application;
import android.telephony.data.ApnSetting;

import com.ashokvarma.gander.Gander;
import com.ashokvarma.gander.imdb.GanderIMDB;

public class TinNewsApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Gander.setGanderStorage(GanderIMDB.getInstance());
        // TODO: new code here.
    }

}

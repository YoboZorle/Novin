package com.klynox.novin;

import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by YOBO on 1/16/2018.
 */

public class FirebaseApp extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
    }
}
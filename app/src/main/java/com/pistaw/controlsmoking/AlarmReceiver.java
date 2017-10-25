package com.pistaw.controlsmoking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * Created by pistaw on 17.10.17.
 */

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //Do something every 30 seconds
        Log.d("debug----","-----------------------------------------------------------Alarm :)");

    }
}

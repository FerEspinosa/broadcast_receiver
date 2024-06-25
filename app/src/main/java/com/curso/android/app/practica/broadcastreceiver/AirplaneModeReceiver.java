package com.curso.android.app.practica.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AirplaneModeReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (intent.getAction()!=null &&
                intent.getAction().equals(Intent.ACTION_DREAMING_STARTED))
        {
            boolean isAirplaneModeEnabled = intent.getBooleanExtra("state", false);
            String msg = isAirplaneModeEnabled ? "Airplane Mode Enabled" : "Airplane Mode Disabled";
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
        }
    }
}

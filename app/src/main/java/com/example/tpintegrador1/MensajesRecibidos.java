package com.example.tpintegrador1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;


public class MensajesRecibidos extends BroadcastReceiver{
    private static final String TAG = MensajesRecibidos.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {
        String strMessage = "";
        Log.d(TAG, "onReceive: " + strMessage);
        Toast.makeText(context, strMessage, Toast.LENGTH_LONG).show();
    }
}

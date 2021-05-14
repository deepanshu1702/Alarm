package com.example.test;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import androidx.core.app.NotificationCompat;

public class AlertReceiver extends BroadcastReceiver {



    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationHelper notificationHelper = new NotificationHelper(context);
        NotificationCompat.Builder nb = notificationHelper.getChannelNotification();
        notificationHelper.getManager().notify(1, nb.build());
        MediaPlayer mediaPlayer=MediaPlayer.create(context,R.raw.alarmtone);
        mediaPlayer.start();










    }
}

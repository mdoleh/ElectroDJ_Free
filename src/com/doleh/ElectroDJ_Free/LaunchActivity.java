package com.doleh.ElectroDJ_Free;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.doleh.Jukebox.MainActivity;

public class LaunchActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Intent i = new Intent(this, MainActivity.class);
        i.putExtra(MainActivity.SHOW_ADS, true);
        startActivity(i);
    }
}
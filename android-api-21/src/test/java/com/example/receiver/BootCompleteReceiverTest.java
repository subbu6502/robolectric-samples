package com.example.receiver;

import android.content.Intent;

import com.example.BuildConfig;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowLog;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.*;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class BootCompleteReceiverTest {

    @Test
    public void registerServiceOnDeviceBootComplete(){
        Intent intent = new Intent(Intent.ACTION_BOOT_COMPLETED);

        ShadowApplication application = ShadowApplication.getInstance();

        assertTrue("Reboot Listener not registered ",
                application.hasReceiverForIntent(intent));
    }
}
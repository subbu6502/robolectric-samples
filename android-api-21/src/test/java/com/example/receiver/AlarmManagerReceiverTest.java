package com.example.receiver;

import android.app.Application;
import android.content.Intent;

import com.example.BuildConfig;
import com.example.service.SampleIntentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class AlarmManagerReceiverTest {

    @Test
    public void startServiceForTheScheduledAlarm(){
        Application application = RuntimeEnvironment.application;
        Intent expectedService = new Intent(application, SampleIntentService.class);
        AlarmManagerReceiver alarmManagerReceiver = new AlarmManagerReceiver();

        alarmManagerReceiver.onReceive(application, new Intent());

        assertNotNull(shadowOf(application).getNextStartedService());
        assertEquals(shadowOf(application).getNextStartedService().getComponent(),
                expectedService.getComponent());
    }
}

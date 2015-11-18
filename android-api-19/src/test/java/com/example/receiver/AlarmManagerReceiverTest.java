package com.example.receiver;

import android.content.Intent;

import com.example.BuildConfig;
import com.example.service.SampleIntentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class)
public class AlarmManagerReceiverTest {

    @Test
    public void startServiceForTheScheduledAlarm(){
        Intent expectedService = new Intent(RuntimeEnvironment.application, SampleIntentService.class);

        AlarmManagerReceiver alarmManagerReceiver = new AlarmManagerReceiver();
        alarmManagerReceiver.onReceive(RuntimeEnvironment.application, new Intent());
        assertEquals(shadowOf(RuntimeEnvironment.application).getNextStartedService().getComponent(),
                expectedService.getComponent());
    }
}

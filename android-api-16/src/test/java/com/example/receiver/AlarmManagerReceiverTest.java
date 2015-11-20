package com.example.receiver;


import com.example.BuildConfig;
import com.example.service.SampleIntentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

//@RunWith(RobolectricTestRunner.class)
//@Config(constants = BuildConfig.class)
// TODO: find a solution for the Issue: https://github.com/robolectric/robolectric/issues/2148 or another alternate for the same
/*public class AlarmManagerReceiverTest {

//    @Test
//    public void startServiceForTheScheduledAlarm(){
//        AlarmManagerReceiver alarmManagerReceiver = new AlarmManagerReceiver();
//        alarmManagerReceiver.onReceive(RuntimeEnvironment.application, null);
//        assertNotNull(shadowOf(RuntimeEnvironment.application).getNextStartedService());
//        assertEquals(shadowOf(RuntimeEnvironment.application).getNextStartedService().getComponent().getClassName(),
//                SampleIntentService.class.getName());
//    }
}*/

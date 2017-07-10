package com.hj.autotest;
import java.io.IOException;

import android.os.RemoteException;
import android.text.format.Time;

import com.android.uiautomator.core.UiDevice;
import com.android.uiautomator.core.UiObject;
import com.android.uiautomator.core.UiObjectNotFoundException;
import com.android.uiautomator.core.UiScrollable;
import com.android.uiautomator.core.UiSelector;
import com.android.uiautomator.testrunner.UiAutomatorTestCase;
import com.hj.autotest.UiautomatorAsssistant;


public class aa extends UiAutomatorTestCase{
	String size;
	long starttime;
	long endtime;
	public void testDemo() throws UiObjectNotFoundException, IOException, RemoteException{

sleep(1000);
	}
	public void sleep(int times){
		try {
			Thread.sleep(times);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

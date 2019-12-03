package uk.co.ijhdev.trtlware.workers

import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.BatteryManager


/**
 * Created by Seperot on 28/03/2018.
 */

class PhoneBatteryWorker {

  fun getBatteryLevel(context: Context): String {
    val iFilter = IntentFilter(Intent.ACTION_BATTERY_CHANGED)
    val batteryStatus = context.registerReceiver(null, iFilter)
    return (batteryStatus?.getIntExtra(BatteryManager.EXTRA_LEVEL, 0).toString() + "%")
  }
}
package my.itgungnir.kotlin.wan.android.common.util

import android.app.Application
import com.squareup.leakcanary.LeakCanary

class LeakDetectUtil : Util {

    override fun init(application: Application) {
        if (LeakCanary.isInAnalyzerProcess(application)) {
            LeakCanary.install(application)
        }
    }
}
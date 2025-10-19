package androidx.profileinstaller;

import K2.c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import java.io.File;
import java.io.Serializable;
import m.ExecutorC0734a;
import r0.AbstractC0859d;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\profileinstaller\ProfileInstallReceiver.smali */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws Throwable {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            AbstractC0859d.s(context, new ExecutorC0734a(1), new c(this, 27), true);
            return;
        }
        if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if (!"WRITE_SKIP_FILE".equals(string)) {
                    if ("DELETE_SKIP_FILE".equals(string)) {
                        new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                        Log.d("ProfileInstaller", "RESULT_DELETE_SKIP_FILE_SUCCESS");
                        setResultCode(11);
                        return;
                    }
                    return;
                }
                c cVar = new c(this, 27);
                try {
                    AbstractC0859d.e(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                    cVar.f(10, (Serializable) null);
                    return;
                } catch (PackageManager.NameNotFoundException e5) {
                    cVar.f(7, e5);
                    return;
                }
            }
            return;
        }
        if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            Log.d("ProfileInstaller", "");
            setResultCode(12);
        } else {
            if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                return;
            }
            String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
            c cVar2 = new c(this, 27);
            if (!"DROP_SHADER_CACHE".equals(string2)) {
                cVar2.f(16, (Serializable) null);
            } else if (AbstractC0859d.c(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                cVar2.f(14, (Serializable) null);
            } else {
                cVar2.f(15, (Serializable) null);
            }
        }
    }
}

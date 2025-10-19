package androidx.work.impl.foreground;

import J0.t;
import K0.r;
import R0.a;
import T0.b;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.lifecycle.y;
import java.util.UUID;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\work\impl\foreground\SystemForegroundService.smali */
public class SystemForegroundService extends y {

    /* renamed from: f, reason: collision with root package name */
    public static final String f4867f = t.f("SystemFgService");

    /* renamed from: b, reason: collision with root package name */
    public Handler f4868b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4869c;

    /* renamed from: d, reason: collision with root package name */
    public a f4870d;

    /* renamed from: e, reason: collision with root package name */
    public NotificationManager f4871e;

    public final void a() {
        this.f4868b = new Handler(Looper.getMainLooper());
        this.f4871e = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f4870d = aVar;
        if (aVar.f2831m != null) {
            t.d().b(a.f2822n, "A callback already exists.");
        } else {
            aVar.f2831m = this;
        }
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f4870d.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i5) {
        super.onStartCommand(intent, i, i5);
        boolean z4 = this.f4869c;
        String str = f4867f;
        if (z4) {
            t.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f4870d.f();
            a();
            this.f4869c = false;
        }
        if (intent == null) {
            return 3;
        }
        a aVar = this.f4870d;
        aVar.getClass();
        String action = intent.getAction();
        boolean zEquals = "ACTION_START_FOREGROUND".equals(action);
        String str2 = a.f2822n;
        if (zEquals) {
            t.d().e(str2, "Started foreground service " + intent);
            aVar.f2824b.c(new A3.a(9, aVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            aVar.e(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            aVar.e(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            t.d().e(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = aVar.f2831m;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.f4869c = true;
            t.d().a(str, "All commands completed.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf();
            return 3;
        }
        t.d().e(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        UUID uuidFromString = UUID.fromString(stringExtra);
        r rVar = aVar.f2823a;
        rVar.getClass();
        rVar.f2175d.c(new b(rVar, uuidFromString));
        return 3;
    }
}

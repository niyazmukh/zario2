package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.i;
import u0.t;
import u0.u;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\room\MultiInstanceInvalidationService.smali */
public final class MultiInstanceInvalidationService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public int f4798a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f4799b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final u f4800c = new u(this);

    /* renamed from: d, reason: collision with root package name */
    public final t f4801d = new t(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        i.e(intent, "intent");
        return this.f4801d;
    }
}

package h1;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\k.smali */
public final class k extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0591d f7646b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C0591d c0591d, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f7646b = c0591d;
        this.f7645a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws PackageManager.NameNotFoundException {
        int i = message.what;
        if (i != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i);
            return;
        }
        int i5 = e.f7632a;
        C0591d c0591d = this.f7646b;
        Context context = this.f7645a;
        int iC = c0591d.c(context, i5);
        int i6 = h.f7638e;
        if (iC == 1 || iC == 2 || iC == 3 || iC == 9) {
            Intent intentA = c0591d.a(context, iC, "n");
            c0591d.g(context, iC, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}

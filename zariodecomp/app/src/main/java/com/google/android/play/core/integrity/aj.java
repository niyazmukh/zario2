package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.AbstractBinderC0472t;
import e2.AbstractC0459g;
import e2.C0457e;
import e2.C0465m;
import e2.C0471s;
import e2.C0477z;
import e2.InterfaceC0452D;
import e2.InterfaceC0473u;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\aj.smali */
final class aj {

    /* renamed from: a, reason: collision with root package name */
    final C0457e f6255a;

    /* renamed from: b, reason: collision with root package name */
    private final C0477z f6256b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6257c;

    /* renamed from: d, reason: collision with root package name */
    private final at f6258d;

    /* renamed from: e, reason: collision with root package name */
    private final k f6259e;

    public aj(Context context, C0477z c0477z, at atVar, k kVar) {
        this.f6257c = context.getPackageName();
        this.f6256b = c0477z;
        this.f6258d = atVar;
        this.f6259e = kVar;
        C0477z c0477z2 = AbstractC0459g.f6878a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                if (AbstractC0459g.a(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
                    this.f6255a = new C0457e(context, c0477z, "IntegrityService", ak.f6260a, new InterfaceC0452D() { // from class: com.google.android.play.core.integrity.ae
                        @Override // e2.InterfaceC0452D
                        public final Object a(IBinder iBinder) {
                            int i = AbstractBinderC0472t.i;
                            if (iBinder == null) {
                                return null;
                            }
                            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                            return iInterfaceQueryLocalInterface instanceof InterfaceC0473u ? (InterfaceC0473u) iInterfaceQueryLocalInterface : new C0471s(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                        }
                    });
                    return;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Object[] objArr = new Object[0];
        c0477z.getClass();
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", C0477z.c(c0477z.f6885a, "Phonesky is not installed.", objArr));
        }
        this.f6255a = null;
    }

    public static Bundle a(aj ajVar, byte[] bArr, Long l4, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", ajVar.f6257c);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l4 != null) {
            bundle.putLong("cloud.prj", l4.longValue());
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0465m(3, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(p1.b.a(arrayList)));
        return bundle;
    }

    public final Task b(Activity activity, Bundle bundle) {
        if (this.f6255a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        int i = bundle.getInt("dialog.intent.type");
        this.f6256b.b("requestAndShowDialog(%s, %s)", this.f6257c, Integer.valueOf(i));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f6255a.c(new ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task c(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f6255a == null) {
            return Tasks.forException(new IntegrityServiceException(-2, null));
        }
        try {
            byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
            Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
            if (integrityTokenRequest instanceof ao) {
            }
            this.f6256b.b("requestIntegrityToken(%s)", integrityTokenRequest);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            this.f6255a.c(new af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
            return taskCompletionSource.getTask();
        } catch (IllegalArgumentException e5) {
            return Tasks.forException(new IntegrityServiceException(-13, e5));
        }
    }
}

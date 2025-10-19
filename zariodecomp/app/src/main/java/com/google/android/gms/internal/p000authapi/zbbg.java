package com.google.android.gms.internal.p000authapi;

import a.AbstractC0183a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c1.C0335b;
import c1.c;
import c1.d;
import c1.e;
import c1.f;
import c1.g;
import c1.n;
import c1.o;
import c1.t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.C0346h;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0590c;
import java.util.Iterator;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbbg.smali */
public final class zbbg extends l implements n {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        h hVar = new h();
        zba = hVar;
        zbbb zbbbVar = new zbbb();
        zbb = zbbbVar;
        zbc = new i("Auth.Api.Identity.SignIn.API", zbbbVar, hVar);
    }

    public zbbg(Activity activity, t tVar) {
        super(activity, activity, zbc, tVar, k.f5649c);
        this.zbd = zbbj.zba();
    }

    @Override // c1.n
    public final Task<g> beginSignIn(f fVar) {
        C.f(fVar);
        C0335b c0335b = fVar.f5418b;
        C.f(c0335b);
        e eVar = fVar.f5417a;
        C.f(eVar);
        d dVar = fVar.f5422f;
        C.f(dVar);
        c cVar = fVar.f5423k;
        C.f(cVar);
        final f fVar2 = new f(eVar, c0335b, this.zbd, fVar.f5420d, fVar.f5421e, dVar, cVar);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zba};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbax
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                f fVar3 = fVar2;
                zbbc zbbcVar = new zbbc(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                C.f(fVar3);
                zbamVar.zbc(zbbcVar, fVar3);
            }
        };
        hVarA.f1682c = false;
        hVarA.f1681b = 1553;
        return doRead(hVarA.a());
    }

    public final String getPhoneNumberFromIntent(Intent intent) throws j {
        Status status = Status.f5532k;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC0183a.w(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f5534m);
        }
        if (!status2.c()) {
            throw new j(status2);
        }
        String stringExtra = intent.getStringExtra("phone_number_hint_result");
        if (stringExtra != null) {
            return stringExtra;
        }
        throw new j(status);
    }

    public final Task<PendingIntent> getPhoneNumberHintIntent(final c1.i iVar) {
        C.f(iVar);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbh};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbba
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                this.zba.zba(iVar, (zbbh) obj, (TaskCompletionSource) obj2);
            }
        };
        hVarA.f1681b = 1653;
        return doRead(hVarA.a());
    }

    public final o getSignInCredentialFromIntent(Intent intent) throws j {
        Status status = Status.f5532k;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC0183a.w(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f5534m);
        }
        if (!status2.c()) {
            throw new j(status2);
        }
        Parcelable.Creator<o> creator2 = o.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("sign_in_credential");
        o oVar = (o) (byteArrayExtra2 != null ? AbstractC0183a.w(byteArrayExtra2, creator2) : null);
        if (oVar != null) {
            return oVar;
        }
        throw new j(status);
    }

    @Override // c1.n
    public final Task<PendingIntent> getSignInIntent(c1.j jVar) {
        C.f(jVar);
        String str = jVar.f5426a;
        C.f(str);
        final c1.j jVar2 = new c1.j(str, jVar.f5427b, this.zbd, jVar.f5429d, jVar.f5430e, jVar.f5431f);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbf};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbay
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zbbg zbbgVar = this.zba;
                c1.j jVar3 = jVar2;
                zbbe zbbeVar = new zbbe(zbbgVar, (TaskCompletionSource) obj2);
                zbam zbamVar = (zbam) ((zbbh) obj).getService();
                C.f(jVar3);
                zbamVar.zbe(zbbeVar, jVar3);
            }
        };
        hVarA.f1681b = 1555;
        return doRead(hVarA.a());
    }

    public final Task<Void> signOut() {
        getApplicationContext().getSharedPreferences("com.google.android.gms.signin", 0).edit().clear().apply();
        Set set = com.google.android.gms.common.api.o.f5652a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((com.google.android.gms.common.api.o) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        C0346h.a();
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbb};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbaz
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                this.zba.zbb((zbbh) obj, (TaskCompletionSource) obj2);
            }
        };
        hVarA.f1682c = false;
        hVarA.f1681b = 1554;
        return doWrite(hVarA.a());
    }

    public final /* synthetic */ void zba(c1.i iVar, zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbd(new zbbf(this, taskCompletionSource), iVar, this.zbd);
    }

    public final /* synthetic */ void zbb(zbbh zbbhVar, TaskCompletionSource taskCompletionSource) {
        ((zbam) zbbhVar.getService()).zbf(new zbbd(this, taskCompletionSource), this.zbd);
    }

    public zbbg(Context context, t tVar) {
        super(context, null, zbc, tVar, k.f5649c);
        this.zbd = zbbj.zba();
    }
}

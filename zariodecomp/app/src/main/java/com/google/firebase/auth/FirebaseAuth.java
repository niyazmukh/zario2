package com.google.firebase.auth;

import E2.G;
import H2.b;
import I2.a;
import S0.n;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import l2.f;
import o2.C0803g;
import o2.J;
import o2.o;
import p2.InterfaceC0821a;
import p2.e;
import p2.h;
import p2.l;
import p2.q;
import p2.s;
import p2.t;
import r.AbstractC0854a;
import x2.C1036b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\auth\FirebaseAuth.smali */
public class FirebaseAuth implements InterfaceC0821a {

    /* renamed from: a, reason: collision with root package name */
    public final f f6368a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6369b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f6370c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f6371d;

    /* renamed from: e, reason: collision with root package name */
    public final zzacq f6372e;

    /* renamed from: f, reason: collision with root package name */
    public o f6373f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6374g;
    public final Object h;
    public final String i;

    /* renamed from: j, reason: collision with root package name */
    public G f6375j;

    /* renamed from: k, reason: collision with root package name */
    public final RecaptchaAction f6376k;

    /* renamed from: l, reason: collision with root package name */
    public final RecaptchaAction f6377l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f6378m;

    /* renamed from: n, reason: collision with root package name */
    public final n f6379n;

    /* renamed from: o, reason: collision with root package name */
    public final t f6380o;

    /* renamed from: p, reason: collision with root package name */
    public final b f6381p;

    /* renamed from: q, reason: collision with root package name */
    public final b f6382q;

    /* renamed from: r, reason: collision with root package name */
    public q f6383r;

    /* renamed from: s, reason: collision with root package name */
    public final Executor f6384s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f6385t;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f6386u;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00c1  */
    /* JADX WARN: Type inference failed for: r5v10, types: [o2.g, p2.s] */
    /* JADX WARN: Type inference failed for: r5v12, types: [o2.g, p2.s] */
    /* JADX WARN: Type inference failed for: r5v9, types: [o2.g, p2.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebaseAuth(l2.f r13, H2.b r14, H2.b r15, java.util.concurrent.Executor r16, java.util.concurrent.Executor r17, java.util.concurrent.ScheduledExecutorService r18, java.util.concurrent.Executor r19) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 994
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.<init>(l2.f, H2.b, H2.b, java.util.concurrent.Executor, java.util.concurrent.Executor, java.util.concurrent.ScheduledExecutorService, java.util.concurrent.Executor):void");
    }

    public static void d(FirebaseAuth firebaseAuth, o oVar) {
        if (oVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + ((e) oVar).f9329b.f9320a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f6386u.execute(new J(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void e(com.google.firebase.auth.FirebaseAuth r17, o2.o r18, com.google.android.gms.internal.p002firebaseauthapi.zzahv r19, boolean r20, boolean r21) throws org.json.JSONException {
        /*
            Method dump skipped, instructions count: 901
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.auth.FirebaseAuth.e(com.google.firebase.auth.FirebaseAuth, o2.o, com.google.android.gms.internal.firebase-auth-api.zzahv, boolean, boolean):void");
    }

    public static void f(FirebaseAuth firebaseAuth, o oVar) {
        if (oVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + ((e) oVar).f9329b.f9320a + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZzc = oVar != null ? ((e) oVar).f9328a.zzc() : null;
        a aVar = new a();
        aVar.f1928a = strZzc;
        firebaseAuth.f6386u.execute(new J(firebaseAuth, aVar));
    }

    @Keep
    public static FirebaseAuth getInstance() {
        f fVarC = f.c();
        fVarC.a();
        return (FirebaseAuth) fVarC.f8774d.a(FirebaseAuth.class);
    }

    public final void a(C1036b c1036b) {
        q qVar;
        this.f6371d.add(c1036b);
        synchronized (this) {
            if (this.f6383r == null) {
                f fVar = this.f6368a;
                C.f(fVar);
                this.f6383r = new q(fVar);
            }
            qVar = this.f6383r;
        }
        int size = this.f6371d.size();
        if (size > 0 && qVar.f9363a == 0) {
            qVar.f9363a = size;
            if (qVar.f9363a > 0 && !qVar.f9365c) {
                qVar.f9364b.a();
            }
        } else if (size == 0 && qVar.f9363a != 0) {
            h hVar = qVar.f9364b;
            hVar.f9352d.removeCallbacks(hVar.f9353e);
        }
        qVar.f9363a = size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [o2.g, p2.s] */
    public final Task b(boolean z4) {
        o oVar = this.f6373f;
        if (oVar == null) {
            return Tasks.forException(zzaen.zza(new Status(17495, null, null, null)));
        }
        zzahv zzahvVar = ((e) oVar).f9328a;
        if (zzahvVar.zzg() && !z4) {
            return Tasks.forResult(l.a(zzahvVar.zzc()));
        }
        return this.f6372e.zza(this.f6368a, oVar, zzahvVar.zzd(), (s) new C0803g(this, 1));
    }

    public final void c() {
        n nVar = this.f6379n;
        C.f(nVar);
        o oVar = this.f6373f;
        if (oVar != null) {
            ((SharedPreferences) nVar.f2874c).edit().remove(AbstractC0854a.b("com.google.firebase.auth.GET_TOKEN_RESPONSE.", ((e) oVar).f9329b.f9320a)).apply();
            this.f6373f = null;
        }
        ((SharedPreferences) nVar.f2874c).edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        f(this, null);
        d(this, null);
        q qVar = this.f6383r;
        if (qVar != null) {
            h hVar = qVar.f9364b;
            hVar.f9352d.removeCallbacks(hVar.f9353e);
        }
    }

    @Keep
    public static FirebaseAuth getInstance(f fVar) {
        fVar.a();
        return (FirebaseAuth) fVar.f8774d.a(FirebaseAuth.class);
    }
}

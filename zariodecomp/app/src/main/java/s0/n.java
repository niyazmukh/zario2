package S0;

import B3.Y0;
import E2.G;
import a2.AbstractC0193h;
import a2.C0190e;
import a2.C0195j;
import a2.C0196k;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzaen;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.android.gms.internal.p002firebaseauthapi.zzba;
import com.google.android.gms.internal.p002firebaseauthapi.zzco;
import com.google.android.gms.internal.p002firebaseauthapi.zzmy;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0545M;
import g0.C0548P;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import k1.C0657a;
import o2.C0796B;
import o2.y;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import z3.k0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S0\n.smali */
public final class n implements Continuation {

    /* renamed from: e, reason: collision with root package name */
    public static n f2871e;

    /* renamed from: a, reason: collision with root package name */
    public Object f2872a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2873b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2874c;

    /* renamed from: d, reason: collision with root package name */
    public Object f2875d;

    public n(int i) {
        switch (i) {
            case 7:
                this.f2872a = new ArrayList();
                this.f2873b = new HashMap();
                this.f2874c = new HashMap();
                break;
            default:
                this.f2872a = new Object();
                this.f2873b = new Handler(Looper.getMainLooper(), new C0195j(this));
                break;
        }
    }

    public static n i() {
        if (f2871e == null) {
            f2871e = new n(6);
        }
        return f2871e;
    }

    public void a(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        if (((ArrayList) this.f2872a).contains(abstractComponentCallbacksC0567t)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0567t);
        }
        synchronized (((ArrayList) this.f2872a)) {
            ((ArrayList) this.f2872a).add(abstractComponentCallbacksC0567t);
        }
        abstractComponentCallbacksC0567t.f7537o = true;
    }

    public boolean b(C0196k c0196k, int i) {
        C0190e c0190e = (C0190e) c0196k.f4106a.get();
        if (c0190e == null) {
            return false;
        }
        ((Handler) this.f2873b).removeCallbacksAndMessages(c0196k);
        Handler handler = AbstractC0193h.f4082x;
        handler.sendMessage(handler.obtainMessage(1, i, 0, c0190e.f4066a));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object c(Q3.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof W.C0168j
            if (r0 == 0) goto L13
            r0 = r7
            W.j r0 = (W.C0168j) r0
            int r1 = r0.f3621d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3621d = r1
            goto L18
        L13:
            W.j r0 = new W.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f3619b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3621d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            S0.n r6 = r0.f3618a
            a.AbstractC0183a.m0(r7)
            goto L63
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            S0.n r6 = r0.f3618a
            a.AbstractC0183a.m0(r7)
            goto L72
        L3a:
            a.AbstractC0183a.m0(r7)
            java.lang.Object r7 = r6.f2874c
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r2 = r6.f2875d
            W.O r2 = (W.O) r2
            if (r7 == 0) goto L66
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L4e
            goto L66
        L4e:
            W.i0 r7 = r2.f()
            W.m r4 = new W.m
            r5 = 0
            r4.<init>(r2, r6, r5)
            r0.f3618a = r6
            r0.f3621d = r3
            java.lang.Object r7 = r7.b(r4, r0)
            if (r7 != r1) goto L63
            return r1
        L63:
            W.d r7 = (W.C0162d) r7
            goto L74
        L66:
            r0.f3618a = r6
            r0.f3621d = r4
            r7 = 0
            java.lang.Object r7 = W.O.e(r2, r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            W.d r7 = (W.C0162d) r7
        L74:
            java.lang.Object r6 = r6.f2875d
            W.O r6 = (W.O) r6
            g1.i r6 = r6.f3534l
            r6.E(r7)
            K3.k r6 = K3.k.f2288a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.n.c(Q3.c):java.lang.Object");
    }

    public AbstractComponentCallbacksC0567t d(String str) {
        C0548P c0548p = (C0548P) ((HashMap) this.f2873b).get(str);
        if (c0548p != null) {
            return c0548p.f7385c;
        }
        return null;
    }

    public AbstractComponentCallbacksC0567t e(String str) {
        for (C0548P c0548p : ((HashMap) this.f2873b).values()) {
            if (c0548p != null) {
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tE = c0548p.f7385c;
                if (!str.equals(abstractComponentCallbacksC0567tE.f7531e)) {
                    abstractComponentCallbacksC0567tE = abstractComponentCallbacksC0567tE.f7547y.f7331c.e(str);
                }
                if (abstractComponentCallbacksC0567tE != null) {
                    return abstractComponentCallbacksC0567tE;
                }
            }
        }
        return null;
    }

    public ArrayList f() {
        ArrayList arrayList = new ArrayList();
        for (C0548P c0548p : ((HashMap) this.f2873b).values()) {
            if (c0548p != null) {
                arrayList.add(c0548p);
            }
        }
        return arrayList;
    }

    public ArrayList g() {
        ArrayList arrayList = new ArrayList();
        for (C0548P c0548p : ((HashMap) this.f2873b).values()) {
            if (c0548p != null) {
                arrayList.add(c0548p.f7385c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public List h() {
        ArrayList arrayList;
        if (((ArrayList) this.f2872a).isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (((ArrayList) this.f2872a)) {
            arrayList = new ArrayList((ArrayList) this.f2872a);
        }
        return arrayList;
    }

    public boolean j(C0190e c0190e) {
        C0196k c0196k = (C0196k) this.f2874c;
        return (c0196k == null || c0190e == null || c0196k.f4106a.get() != c0190e) ? false : true;
    }

    public void k(C0548P c0548p) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
        String str = abstractComponentCallbacksC0567t.f7531e;
        HashMap map = (HashMap) this.f2873b;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0567t.f7531e, c0548p);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0567t);
        }
    }

    public void l(C0548P c0548p) {
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = c0548p.f7385c;
        if (abstractComponentCallbacksC0567t.f7509F) {
            ((C0545M) this.f2875d).e(abstractComponentCallbacksC0567t);
        }
        HashMap map = (HashMap) this.f2873b;
        if (map.get(abstractComponentCallbacksC0567t.f7531e) == c0548p && ((C0548P) map.put(abstractComponentCallbacksC0567t.f7531e, null)) != null && Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0567t);
        }
    }

    public void m(k0 k0Var) {
        synchronized (this.f2872a) {
            try {
                if (((k0) this.f2874c) != null) {
                    return;
                }
                this.f2874c = k0Var;
                boolean zIsEmpty = ((HashSet) this.f2873b).isEmpty();
                if (zIsEmpty) {
                    ((Y0) this.f2875d).f625H.b(k0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void n(C0190e c0190e) {
        synchronized (this.f2872a) {
            try {
                if (j(c0190e)) {
                    C0196k c0196k = (C0196k) this.f2874c;
                    if (!c0196k.f4108c) {
                        c0196k.f4108c = true;
                        ((Handler) this.f2873b).removeCallbacksAndMessages(c0196k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(C0190e c0190e) {
        synchronized (this.f2872a) {
            try {
                if (j(c0190e)) {
                    C0196k c0196k = (C0196k) this.f2874c;
                    if (c0196k.f4108c) {
                        c0196k.f4108c = false;
                        q(c0196k);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10, types: [o4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object p(Q3.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof W.c0
            if (r0 == 0) goto L13
            r0 = r9
            W.c0 r0 = (W.c0) r0
            int r1 = r0.f3580e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3580e = r1
            goto L18
        L13:
            W.c0 r0 = new W.c0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f3578c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3580e
            K3.k r3 = K3.k.f2288a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L45
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            o4.a r8 = r0.f3577b
            S0.n r0 = r0.f3576a
            a.AbstractC0183a.m0(r9)     // Catch: java.lang.Throwable -> L31
            goto L83
        L31:
            r9 = move-exception
            goto L96
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            o4.a r8 = r0.f3577b
            S0.n r2 = r0.f3576a
            a.AbstractC0183a.m0(r9)
            r9 = r8
            r8 = r2
            goto L64
        L45:
            a.AbstractC0183a.m0(r9)
            java.lang.Object r9 = r8.f2873b
            f4.u r9 = (f4.C0521u) r9
            boolean r9 = r9.isCompleted()
            if (r9 == 0) goto L53
            return r3
        L53:
            r0.f3576a = r8
            java.lang.Object r9 = r8.f2872a
            o4.c r9 = (o4.c) r9
            r0.f3577b = r9
            r0.f3580e = r5
            java.lang.Object r2 = r9.c(r0)
            if (r2 != r1) goto L64
            return r1
        L64:
            java.lang.Object r2 = r8.f2873b     // Catch: java.lang.Throwable -> L94
            f4.u r2 = (f4.C0521u) r2     // Catch: java.lang.Throwable -> L94
            boolean r2 = r2.isCompleted()     // Catch: java.lang.Throwable -> L94
            if (r2 == 0) goto L74
            o4.c r9 = (o4.c) r9
            r9.e(r6)
            return r3
        L74:
            r0.f3576a = r8     // Catch: java.lang.Throwable -> L94
            r0.f3577b = r9     // Catch: java.lang.Throwable -> L94
            r0.f3580e = r4     // Catch: java.lang.Throwable -> L94
            java.lang.Object r0 = r8.c(r0)     // Catch: java.lang.Throwable -> L94
            if (r0 != r1) goto L81
            return r1
        L81:
            r0 = r8
            r8 = r9
        L83:
            java.lang.Object r9 = r0.f2873b     // Catch: java.lang.Throwable -> L31
            f4.u r9 = (f4.C0521u) r9     // Catch: java.lang.Throwable -> L31
            r9.D(r3)     // Catch: java.lang.Throwable -> L31
            o4.c r8 = (o4.c) r8
            r8.e(r6)
            return r3
        L90:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L96
        L94:
            r8 = move-exception
            goto L90
        L96:
            o4.c r8 = (o4.c) r8
            r8.e(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: S0.n.p(Q3.c):java.lang.Object");
    }

    public void q(C0196k c0196k) {
        int i = c0196k.f4107b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : 2750;
        }
        Handler handler = (Handler) this.f2873b;
        handler.removeCallbacksAndMessages(c0196k);
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0196k), i);
    }

    public Bundle r(Bundle bundle, String str) {
        HashMap map = (HashMap) this.f2874c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }

    public void s() {
        C0196k c0196k = (C0196k) this.f2875d;
        if (c0196k != null) {
            this.f2874c = c0196k;
            this.f2875d = null;
            C0190e c0190e = (C0190e) c0196k.f4106a.get();
            if (c0190e == null) {
                this.f2874c = null;
            } else {
                Handler handler = AbstractC0193h.f4082x;
                handler.sendMessage(handler.obtainMessage(0, c0190e.f4066a));
            }
        }
    }

    public String t(String str) {
        String str2;
        String string = ((SharedPreferences) this.f2874c).getString(str, null);
        if (string == null) {
            return null;
        }
        if (!string.startsWith("ENCRYPTED:")) {
            return string;
        }
        p2.p pVarA = p2.p.a((Context) this.f2872a, (String) this.f2873b);
        String strSubstring = string.substring(10);
        pVarA.getClass();
        C.f(strSubstring);
        zzmy zzmyVar = pVarA.f9362b;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to decrypt data");
            return null;
        }
        try {
            synchronized (zzmyVar) {
                str2 = new String(((zzba) pVarA.f9362b.zza().zza(zzco.zza(), zzba.class)).zza(Base64.decode(strSubstring, 2), null), StandardCharsets.UTF_8);
            }
            return str2;
        } catch (IllegalArgumentException | GeneralSecurityException e5) {
            Log.e("FirebearStorageCryptoHelper", "Exception encountered while decrypting bytes:\n" + e5.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        G g3;
        G g5;
        RecaptchaAction recaptchaAction = (RecaptchaAction) this.f2872a;
        FirebaseAuth firebaseAuth = (FirebaseAuth) this.f2873b;
        String str = (String) this.f2874c;
        K2.c cVar = (K2.c) this.f2875d;
        if (task.isSuccessful()) {
            return Tasks.forResult(task.getResult());
        }
        Exception exception = task.getException();
        C.f(exception);
        if (!zzaen.zzd(exception)) {
            Log.e("RecaptchaCallWrapper", "Initial task failed for action " + String.valueOf(recaptchaAction) + "with exception - " + exception.getMessage());
            return Tasks.forException(exception);
        }
        if (Log.isLoggable("RecaptchaCallWrapper", 4)) {
            Log.i("RecaptchaCallWrapper", "Falling back to recaptcha enterprise flow for action ".concat(String.valueOf(recaptchaAction)));
        }
        synchronized (firebaseAuth) {
            g3 = firebaseAuth.f6375j;
        }
        if (g3 == null) {
            G g6 = new G(firebaseAuth.f6368a, firebaseAuth);
            synchronized (firebaseAuth) {
                firebaseAuth.f6375j = g6;
            }
        }
        synchronized (firebaseAuth) {
            g5 = firebaseAuth.f6375j;
        }
        return g5.s(str, Boolean.FALSE, recaptchaAction).continueWithTask(cVar).continueWithTask(new i(str, g5, recaptchaAction, cVar));
    }

    public p2.e u(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        p2.f fVarB;
        try {
            String string = jSONObject.getString("cachedTokenState");
            String string2 = jSONObject.getString("applicationName");
            boolean z4 = jSONObject.getBoolean("anonymous");
            String string3 = jSONObject.getString("version");
            String str = string3 != null ? string3 : "2";
            JSONArray jSONArray3 = jSONObject.getJSONArray("userInfos");
            int length = jSONArray3.length();
            if (length == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i = 0; i < length; i++) {
                arrayList.add(p2.c.c(jSONArray3.getString(i)));
            }
            p2.e eVar = new p2.e(l2.f.d(string2), arrayList);
            if (!TextUtils.isEmpty(string)) {
                zzahv zzahvVarZzb = zzahv.zzb(string);
                C.f(zzahvVarZzb);
                eVar.f9328a = zzahvVarZzb;
            }
            if (!z4) {
                eVar.f9335l = Boolean.FALSE;
            }
            eVar.f9334k = str;
            if (jSONObject.has("userMetadata") && (fVarB = p2.f.b(jSONObject.getJSONObject("userMetadata"))) != null) {
                eVar.f9336m = fVarB;
            }
            if (jSONObject.has("userMultiFactorInfo") && (jSONArray2 = jSONObject.getJSONArray("userMultiFactorInfo")) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (int i5 = 0; i5 < jSONArray2.length(); i5++) {
                    JSONObject jSONObject2 = new JSONObject(jSONArray2.getString(i5));
                    String strOptString = jSONObject2.optString("factorIdKey");
                    arrayList2.add("phone".equals(strOptString) ? y.e(jSONObject2) : Objects.equals(strOptString, "totp") ? C0796B.e(jSONObject2) : null);
                }
                eVar.f(arrayList2);
            }
            if (jSONObject.has("passkeyInfo") && (jSONArray = jSONObject.getJSONArray("passkeyInfo")) != null) {
                ArrayList arrayList3 = new ArrayList();
                for (int i6 = 0; i6 < jSONArray.length(); i6++) {
                    arrayList3.add(o2.G.d(new JSONObject(jSONArray.getString(i6))));
                }
                eVar.f9340q = arrayList3;
            }
            return eVar;
        } catch (zzaao | ArrayIndexOutOfBoundsException | IllegalArgumentException | JSONException e5) {
            Log.wtf(((C0657a) this.f2875d).f8296a, e5);
            return null;
        }
    }

    public void v(String str, String str2) {
        String strEncodeToString;
        p2.p pVarA = p2.p.a((Context) this.f2872a, (String) this.f2873b);
        pVarA.getClass();
        C.f(str2);
        zzmy zzmyVar = pVarA.f9362b;
        String str3 = null;
        if (zzmyVar == null) {
            Log.e("FirebearStorageCryptoHelper", "KeysetManager failed to initialize - unable to encrypt data");
        } else {
            try {
                synchronized (zzmyVar) {
                    strEncodeToString = Base64.encodeToString(((zzba) pVarA.f9362b.zza().zza(zzco.zza(), zzba.class)).zzb(str2.getBytes(StandardCharsets.UTF_8), null), 2);
                }
                str3 = strEncodeToString;
            } catch (GeneralSecurityException e5) {
                Log.e("FirebearStorageCryptoHelper", "Exception encountered while encrypting bytes:\n" + e5.getMessage());
            }
        }
        if (str3 != null) {
            ((SharedPreferences) this.f2874c).edit().putString(str, "ENCRYPTED:".concat(str3)).apply();
        }
    }
}

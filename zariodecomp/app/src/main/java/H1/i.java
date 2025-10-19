package h1;

import A2.C0009i;
import A2.InterfaceC0007g;
import M.C0122g;
import M.InterfaceC0119d;
import M.S;
import N.z;
import N2.AbstractC0156x;
import N2.j0;
import N2.n0;
import S0.q;
import W.C0160b;
import W.InterfaceC0161c;
import W.InterfaceC0167i;
import a.AbstractC0183a;
import android.R;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.ContentInfo;
import android.view.ContextThemeWrapper;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.a0;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.InterfaceC0367e;
import com.google.android.gms.common.internal.t;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.protobuf.AbstractC0409l;
import com.google.protobuf.B0;
import com.niyaz.zario.ui.intervention.InterventionFragment;
import d.C0435a;
import d.InterfaceC0436b;
import f4.C0516n;
import f4.E;
import g.C0527b;
import g0.AbstractComponentCallbacksC0567t;
import g0.C0538F;
import g0.C0542J;
import g0.C0569v;
import i4.InterfaceC0612g;
import j1.C0625a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.WeakHashMap;
import k1.C0657a;
import m3.C0747a;
import r.AbstractC0854a;
import s2.AbstractC0869c;
import t0.AbstractC0898E;
import t2.C0942a;
import u0.AbstractC0953A;
import v0.AbstractC0977a;
import w2.C1024a;
import y2.C1048A;
import y2.C1057f;
import y2.EnumC1056e;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h1.1\i.smali */
public final class i implements InterfaceC0007g, z, G1.a, InterfaceC0119d, InterfaceC0161c, InterfaceC0167i, InterfaceC0367e, InterfaceC0436b, InterfaceC0357t, k.j, OnFailureListener, OnCompleteListener {

    /* renamed from: c, reason: collision with root package name */
    public static i f7639c;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7640a;

    /* renamed from: b, reason: collision with root package name */
    public Object f7641b;

    public /* synthetic */ i(Object obj, int i) {
        this.f7640a = i;
        this.f7641b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0096, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean B(android.content.pm.PackageInfo r10, boolean r11) {
        /*
            r0 = 1
            r1 = 0
            if (r10 != 0) goto L5
            return r1
        L5:
            if (r11 == 0) goto L28
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.android.vending"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L1b
            java.lang.String r2 = r10.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L28
        L1b:
            android.content.pm.ApplicationInfo r11 = r10.applicationInfo
            if (r11 != 0) goto L21
        L1f:
            r11 = r1
            goto L28
        L21:
            int r11 = r11.flags
            r11 = r11 & 129(0x81, float:1.81E-43)
            if (r11 == 0) goto L1f
            r11 = r0
        L28:
            if (r11 == 0) goto L2d
            com.google.android.gms.internal.common.zzah r2 = h1.o.f7654c     // Catch: java.lang.IllegalArgumentException -> La2
            goto L2f
        L2d:
            com.google.android.gms.internal.common.zzah r2 = h1.o.f7653b     // Catch: java.lang.IllegalArgumentException -> La2
        L2f:
            com.google.android.gms.internal.common.zzr.zza(r0)     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.SigningInfo r3 = r10.signingInfo     // Catch: java.lang.IllegalArgumentException -> La2
            if (r3 == 0) goto L62
            boolean r4 = r3.hasMultipleSigners()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L62
            android.content.pm.Signature[] r4 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L43
            goto L62
        L43:
            int r4 = com.google.android.gms.internal.common.zzah.zzd     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzad r4 = new com.google.android.gms.internal.common.zzad     // Catch: java.lang.IllegalArgumentException -> La2
            r4.<init>()     // Catch: java.lang.IllegalArgumentException -> La2
            android.content.pm.Signature[] r3 = r3.getSigningCertificateHistory()     // Catch: java.lang.IllegalArgumentException -> La2
            int r5 = r3.length     // Catch: java.lang.IllegalArgumentException -> La2
            r6 = r1
        L50:
            if (r6 >= r5) goto L5d
            r7 = r3[r6]     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r7 = r7.toByteArray()     // Catch: java.lang.IllegalArgumentException -> La2
            r4.zzb(r7)     // Catch: java.lang.IllegalArgumentException -> La2
            int r6 = r6 + r0
            goto L50
        L5d:
            com.google.android.gms.internal.common.zzah r3 = r4.zzd()     // Catch: java.lang.IllegalArgumentException -> La2
            goto L66
        L62:
            com.google.android.gms.internal.common.zzah r3 = com.google.android.gms.internal.common.zzah.zzj()     // Catch: java.lang.IllegalArgumentException -> La2
        L66:
            boolean r4 = r3.isEmpty()     // Catch: java.lang.IllegalArgumentException -> La2
            if (r4 != 0) goto L9a
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()     // Catch: java.lang.IllegalArgumentException -> La2
            int r4 = r3.size()     // Catch: java.lang.IllegalArgumentException -> La2
            r5 = r1
        L75:
            if (r5 >= r4) goto L98
            java.lang.Object r6 = r3.get(r5)     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r6 = (byte[]) r6     // Catch: java.lang.IllegalArgumentException -> La2
            com.google.android.gms.internal.common.zzal r7 = r2.listIterator(r1)     // Catch: java.lang.IllegalArgumentException -> La2
        L81:
            boolean r8 = r7.hasNext()     // Catch: java.lang.IllegalArgumentException -> La2
            int r9 = r5 + 1
            if (r8 == 0) goto L96
            java.lang.Object r8 = r7.next()     // Catch: java.lang.IllegalArgumentException -> La2
            byte[] r8 = (byte[]) r8     // Catch: java.lang.IllegalArgumentException -> La2
            boolean r8 = java.util.Arrays.equals(r6, r8)     // Catch: java.lang.IllegalArgumentException -> La2
            if (r8 == 0) goto L81
            goto L99
        L96:
            r5 = r9
            goto L75
        L98:
            r0 = r1
        L99:
            return r0
        L9a:
            java.lang.String r2 = "Unable to obtain package certificate history."
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> La2
            r3.<init>(r2)     // Catch: java.lang.IllegalArgumentException -> La2
            throw r3     // Catch: java.lang.IllegalArgumentException -> La2
        La2:
            java.lang.String r2 = "GoogleSignatureVerifier"
            java.lang.String r3 = "package info is not set correctly"
            android.util.Log.i(r2, r3)
            if (r11 == 0) goto Lb2
            h1.m[] r11 = h1.o.f7652a
            h1.m r10 = C(r10, r11)
            goto Lbe
        Lb2:
            h1.m[] r11 = h1.o.f7652a
            r11 = r11[r1]
            h1.m[] r11 = new h1.m[]{r11}
            h1.m r10 = C(r10, r11)
        Lbe:
            if (r10 == 0) goto Lc1
            return r0
        Lc1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.i.B(android.content.pm.PackageInfo, boolean):boolean");
    }

    public static m C(PackageInfo packageInfo, m... mVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            n nVar = new n(packageInfo.signatures[0].toByteArray());
            for (int i = 0; i < mVarArr.length; i++) {
                if (mVarArr[i].equals(nVar)) {
                    return mVarArr[i];
                }
            }
        }
        return null;
    }

    public static i x(Context context) {
        C.f(context);
        synchronized (i.class) {
            if (f7639c == null) {
                l lVar = p.f7655a;
                synchronized (p.class) {
                    if (p.f7657c == null) {
                        p.f7657c = context.getApplicationContext();
                    } else {
                        Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
                    }
                }
                f7639c = new i(context);
            }
        }
        return f7639c;
    }

    public void A(int i, int i5) {
        ((AbstractC0898E) this.f7641b).f9901a.f(i, i5);
    }

    @Override // A2.InterfaceC0007g
    public int a(C1048A c1048a) {
        return 1;
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
    public void accept(Object obj, Object obj2) {
        C0625a c0625a = (C0625a) ((j1.c) obj).getService();
        Parcel parcelZaa = c0625a.zaa();
        zac.zad(parcelZaa, (t) this.f7641b);
        c0625a.zad(1, parcelZaa);
        ((TaskCompletionSource) obj2).setResult(null);
    }

    @Override // A2.InterfaceC0007g
    public List b(String str) {
        HashSet hashSet = (HashSet) ((HashMap) ((g1.i) this.f7641b).f7594b).get(str);
        return hashSet != null ? new ArrayList(hashSet) : Collections.emptyList();
    }

    @Override // M.InterfaceC0119d
    public C0122g build() {
        return new C0122g(new K2.c(((ContentInfo.Builder) this.f7641b).build()));
    }

    @Override // A2.InterfaceC0007g
    public B2.b c(String str) {
        return B2.b.f300d;
    }

    @Override // N.z
    public boolean d(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f7641b;
        if (!swipeDismissBehavior.r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = S.f2363a;
        boolean z4 = M.C.d(view) == 1;
        int i = swipeDismissBehavior.f5811e;
        view.offsetLeftAndRight((!(i == 0 && z4) && (i != 1 || z4)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        g1.i iVar = swipeDismissBehavior.f5808b;
        if (iVar != null) {
            iVar.x(view);
        }
        return true;
    }

    @Override // A2.InterfaceC0007g
    public void e(AbstractC0869c abstractC0869c) {
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [m3.b] */
    @Override // k.j
    public boolean f(k.l lVar, MenuItem menuItem) {
        C0747a c0747a = (C0747a) ((C0009i) this.f7641b).f206d;
        if (c0747a == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        final InterventionFragment interventionFragment = c0747a.f8856a;
        if (itemId == 2131231032) {
            M1.b bVar = new M1.b(interventionFragment.S());
            C0527b c0527b = (C0527b) bVar.f1460c;
            c0527b.f7160d = c0527b.f7157a.getText(2131886200);
            ContextThemeWrapper contextThemeWrapper = c0527b.f7157a;
            c0527b.f7162f = contextThemeWrapper.getText(2131886199);
            c0527b.i = contextThemeWrapper.getText(R.string.cancel);
            ?? r22 = new DialogInterface.OnClickListener() { // from class: m3.b
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    InterventionFragment interventionFragment2 = interventionFragment;
                    E.t(a0.g(interventionFragment2.t()), null, null, new C0750d(interventionFragment2, null), 3);
                }
            };
            c0527b.f7163g = contextThemeWrapper.getText(2131886373);
            c0527b.h = r22;
            bVar.a().show();
        } else if (itemId == 2131231031) {
            AbstractC0953A.b(S0.f.z(interventionFragment), 2131230785);
        } else if (itemId == 2131231033) {
            AbstractC0953A.b(S0.f.z(interventionFragment), 2131230788);
        } else {
            if (itemId != 2131231030) {
                return false;
            }
            AbstractC0953A.b(S0.f.z(interventionFragment), 2131230784);
        }
        return true;
    }

    @Override // W.InterfaceC0167i
    public Object g(X3.p pVar, O3.d dVar) {
        return ((InterfaceC0167i) this.f7641b).g(new a0.c(pVar, null), dVar);
    }

    @Override // M.InterfaceC0119d
    public void h(Bundle bundle) {
        ((ContentInfo.Builder) this.f7641b).setExtras(bundle);
    }

    @Override // W.InterfaceC0161c
    public Object i(C0160b c0160b) {
        return ((C0942a) this.f7641b).invoke(c0160b);
    }

    @Override // d.InterfaceC0436b
    public void j(Object obj) {
        C0435a c0435a = (C0435a) obj;
        C0542J c0542j = (C0542J) this.f7641b;
        C0538F c0538f = (C0538F) c0542j.f7319D.pollFirst();
        if (c0538f == null) {
            Log.w("FragmentManager", "No IntentSenders were started for " + this);
            return;
        }
        String str = c0538f.f7308a;
        AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567tE = c0542j.f7331c.e(str);
        if (abstractComponentCallbacksC0567tE != null) {
            abstractComponentCallbacksC0567tE.A(c0538f.f7309b, c0435a.f6765a, c0435a.f6766b);
        } else {
            Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    @Override // M.InterfaceC0119d
    public void k(Uri uri) {
        ((ContentInfo.Builder) this.f7641b).setLinkUri(uri);
    }

    @Override // A2.InterfaceC0007g
    public void l(String str, B2.b bVar) {
    }

    @Override // A2.InterfaceC0007g
    public List m(C1048A c1048a) {
        return null;
    }

    @Override // A2.InterfaceC0007g
    public B2.b n(C1048A c1048a) {
        return B2.b.f300d;
    }

    @Override // k.j
    public void o(k.l lVar) {
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        Exception exception = task.getException();
        C0516n c0516n = (C0516n) this.f7641b;
        if (exception != null) {
            c0516n.resumeWith(AbstractC0183a.v(exception));
        } else if (task.isCanceled()) {
            c0516n.n(null);
        } else {
            c0516n.resumeWith(task.getResult());
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        if (exc instanceof l2.i) {
            C0657a c0657a = p2.h.f9348f;
            c0657a.e("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            p2.h hVar = (p2.h) ((A3.a) this.f7641b).f265b;
            int i = (int) hVar.f9350b;
            hVar.f9350b = (i == 30 || i == 60 || i == 120 || i == 240 || i == 480) ? 2 * hVar.f9350b : i != 960 ? 30L : 960L;
            hVar.f9349a = (hVar.f9350b * 1000) + System.currentTimeMillis();
            c0657a.e("Scheduling refresh for " + hVar.f9349a, new Object[0]);
            hVar.f9352d.postDelayed(hVar.f9353e, hVar.f9350b * 1000);
        }
    }

    @Override // W.InterfaceC0167i
    public InterfaceC0612g p() {
        return ((InterfaceC0167i) this.f7641b).p();
    }

    @Override // A2.InterfaceC0007g
    public String q() {
        return null;
    }

    @Override // A2.InterfaceC0007g
    public void r(B2.n nVar) {
        ((g1.i) this.f7641b).i(nVar);
    }

    @Override // M.InterfaceC0119d
    public void s(int i) {
        ((ContentInfo.Builder) this.f7641b).setFlags(i);
    }

    @Override // A2.InterfaceC0007g
    public void start() {
    }

    public void t(C1057f c1057f) {
        B2.l lVar = c1057f.f11092b;
        B2.h hVar = lVar.f322a;
        HashMap map = (HashMap) this.f7641b;
        C1057f c1057f2 = (C1057f) map.get(hVar);
        if (c1057f2 == null) {
            map.put(hVar, c1057f);
            return;
        }
        EnumC1056e enumC1056e = EnumC1056e.f11087b;
        EnumC1056e enumC1056e2 = EnumC1056e.f11089d;
        EnumC1056e enumC1056e3 = c1057f2.f11091a;
        EnumC1056e enumC1056e4 = c1057f.f11091a;
        if (enumC1056e4 != enumC1056e && enumC1056e3 == enumC1056e2) {
            map.put(hVar, c1057f);
            return;
        }
        EnumC1056e enumC1056e5 = EnumC1056e.f11086a;
        if (enumC1056e4 == enumC1056e2 && enumC1056e3 != enumC1056e5) {
            map.put(hVar, new C1057f(enumC1056e3, lVar));
            return;
        }
        EnumC1056e enumC1056e6 = EnumC1056e.f11088c;
        if (enumC1056e4 == enumC1056e6 && enumC1056e3 == enumC1056e6) {
            map.put(hVar, new C1057f(enumC1056e6, lVar));
            return;
        }
        if (enumC1056e4 == enumC1056e6 && enumC1056e3 == enumC1056e) {
            map.put(hVar, new C1057f(enumC1056e, lVar));
            return;
        }
        if (enumC1056e4 == enumC1056e5 && enumC1056e3 == enumC1056e) {
            map.remove(hVar);
            return;
        }
        if (enumC1056e4 == enumC1056e5 && enumC1056e3 == enumC1056e6) {
            map.put(hVar, new C1057f(enumC1056e5, c1057f2.f11092b));
        } else if (enumC1056e4 == enumC1056e && enumC1056e3 == enumC1056e5) {
            map.put(hVar, new C1057f(enumC1056e6, lVar));
        } else {
            AbstractC0183a.z("Unsupported combination of changes %s after %s", enumC1056e4, enumC1056e3);
            throw null;
        }
    }

    public String toString() {
        switch (this.f7640a) {
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "<" + ((String) this.f7641b) + '>';
            default:
                return super.toString();
        }
    }

    public void u(AbstractC0977a... migrations) {
        kotlin.jvm.internal.i.e(migrations, "migrations");
        for (AbstractC0977a abstractC0977a : migrations) {
            int i = abstractC0977a.f10554a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7641b;
            Integer numValueOf = Integer.valueOf(i);
            Object treeMap = linkedHashMap.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                linkedHashMap.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            int i5 = abstractC0977a.f10555b;
            if (treeMap2.containsKey(Integer.valueOf(i5))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i5)) + " with " + abstractC0977a);
            }
            treeMap2.put(Integer.valueOf(i5), abstractC0977a);
        }
    }

    public boolean v(q qVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : (List) this.f7641b) {
            P0.e eVar = (P0.e) obj;
            eVar.getClass();
            if (eVar.b(qVar) && eVar.c(eVar.f2673a.a())) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            J0.t.d().a(O0.l.f2633a, "Work " + qVar.f2895a + " constrained by " + L3.j.h0(arrayList, null, null, null, O0.f.f2618a, 31));
        }
        return arrayList.isEmpty();
    }

    public Object w(n0 n0Var) {
        n0 n0VarU;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        switch (B2.p.k(n0Var)) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(n0Var.H());
            case 2:
                return t.h.a(n0Var.R(), 3) ? Long.valueOf(n0Var.M()) : Double.valueOf(n0Var.K());
            case 3:
                B0 b0Q = n0Var.Q();
                return new l2.o(b0Q.y(), b0Q.z());
            case 4:
                int iC = t.h.c(AbstractC0854a.f9542a);
                if (iC == 1) {
                    B0 b0T = p1.b.t(n0Var);
                    return new l2.o(b0T.y(), b0T.z());
                }
                if (iC == 2 && (n0VarU = p1.b.u(n0Var)) != null) {
                    return w(n0VarU);
                }
                return null;
            case 5:
                return n0Var.P();
            case 6:
                AbstractC0409l abstractC0409lI = n0Var.I();
                AbstractC0156x.i(abstractC0409lI, "Provided ByteString must not be null.");
                return new C1024a(abstractC0409lI);
            case 7:
                B2.n nVarL = B2.n.l(n0Var.O());
                if (nVarL.f309a.size() > 3 && nVarL.g(0).equals("projects") && nVarL.g(2).equals("databases")) {
                    z4 = true;
                }
                AbstractC0183a.N(z4, "Tried to parse an invalid resource name: %s", nVarL);
                String strG = nVarL.g(1);
                String strG2 = nVarL.g(3);
                B2.f fVar = new B2.f(strG, strG2);
                B2.h hVarC = B2.h.c(n0Var.O());
                FirebaseFirestore firebaseFirestore = (FirebaseFirestore) this.f7641b;
                B2.f fVar2 = firebaseFirestore.f6399c;
                if (!fVar.equals(fVar2)) {
                    p1.b.p(2, "DocumentSnapshot", "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead.", hVarC.f315a, strG, strG2, fVar2.f310a, fVar2.f311b);
                }
                return new w2.g(hVarC, firebaseFirestore);
            case 8:
                return new w2.t(n0Var.L().y(), n0Var.L().z());
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                N2.b bVarG = n0Var.G();
                ArrayList arrayList = new ArrayList(bVarG.A());
                Iterator it = bVarG.a().iterator();
                while (it.hasNext()) {
                    arrayList.add(w((n0) it.next()));
                }
                return arrayList;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                List listA = ((n0) n0Var.N().y().get("value")).G().a();
                double[] dArr = new double[listA.size()];
                for (int i = 0; i < listA.size(); i++) {
                    dArr[i] = ((n0) listA.get(i)).K();
                }
                return new w2.E(dArr);
            case 11:
                Map mapY = n0Var.N().y();
                HashMap map = new HashMap();
                for (Map.Entry entry : mapY.entrySet()) {
                    map.put((String) entry.getKey(), w((n0) entry.getValue()));
                }
                return map;
            default:
                AbstractC0183a.z("Unknown value type: ".concat(B.a.z(n0Var.R())), new Object[0]);
                throw null;
        }
    }

    public void y() {
        ((C0569v) this.f7641b).f7554d.N();
    }

    public void z(int i, int i5) {
        ((AbstractC0898E) this.f7641b).f9901a.e(i, i5);
    }

    public i(A3.a aVar) {
        this.f7640a = 20;
        Objects.requireNonNull(aVar);
        this.f7641b = aVar;
    }

    public i(Context context) {
        this.f7640a = 0;
        this.f7641b = context.getApplicationContext();
    }

    public i(int i) {
        this.f7640a = i;
        switch (i) {
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                break;
            case 23:
                this.f7641b = new LinkedHashMap();
                break;
            case 25:
                this.f7641b = new HashMap();
                break;
            default:
                this.f7641b = new g1.i(1);
                break;
        }
    }

    public i(S0.n trackers) {
        this.f7640a = 7;
        kotlin.jvm.internal.i.e(trackers, "trackers");
        P0.a aVar = new P0.a((Q0.f) trackers.f2872a, 0);
        P0.a aVar2 = new P0.a((Q0.a) trackers.f2873b);
        P0.a aVar3 = new P0.a((Q0.f) trackers.f2875d, 4);
        Q0.f fVar = (Q0.f) trackers.f2874c;
        this.f7641b = L3.k.Y(aVar, aVar2, aVar3, new P0.a(fVar, 2), new P0.a(fVar, 3), new P0.g(fVar), new P0.f(fVar));
    }

    public i(EditText editText) {
        this.f7640a = 14;
        S0.e eVar = new S0.e();
        eVar.f2851a = editText;
        e0.i iVar = new e0.i(editText);
        eVar.f2852b = iVar;
        editText.addTextChangedListener(iVar);
        if (e0.a.f6822b == null) {
            synchronized (e0.a.f6821a) {
                try {
                    if (e0.a.f6822b == null) {
                        e0.a aVar = new e0.a();
                        try {
                            e0.a.f6823c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, e0.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        e0.a.f6822b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(e0.a.f6822b);
        this.f7641b = eVar;
    }

    public i(ClipData clipData, int i) {
        this.f7640a = 6;
        this.f7641b = F1.a.f(clipData, i);
    }
}

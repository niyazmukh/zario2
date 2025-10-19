package Y;

import K3.h;
import S0.f;
import X3.p;
import Z.j;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y\c.smali */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final p f3862a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3863b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f3864c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3865d;

    /* renamed from: e, reason: collision with root package name */
    public final h f3866e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f3867f;

    public c(Context context, String sharedPreferencesName, Set keysToMigrate, p shouldRunMigration, j jVar) {
        i.e(context, "context");
        i.e(sharedPreferencesName, "sharedPreferencesName");
        i.e(keysToMigrate, "keysToMigrate");
        i.e(shouldRunMigration, "shouldRunMigration");
        P0.b bVar = new P0.b(1, context, sharedPreferencesName);
        this.f3862a = shouldRunMigration;
        this.f3863b = jVar;
        this.f3864c = context;
        this.f3865d = sharedPreferencesName;
        this.f3866e = f.P(bVar);
        this.f3867f = keysToMigrate == d.f3868a ? null : L3.j.y0(keysToMigrate);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.Object r5, Q3.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof Y.b
            if (r0 == 0) goto L13
            r0 = r6
            Y.b r0 = (Y.b) r0
            int r1 = r0.f3861d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3861d = r1
            goto L18
        L13:
            Y.b r0 = new Y.b
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f3859b
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3861d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            Y.c r4 = r0.f3858a
            a.AbstractC0183a.m0(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            a.AbstractC0183a.m0(r6)
            r0.f3858a = r4
            r0.f3861d = r3
            X3.p r6 = r4.f3862a
            java.lang.Object r6 = r6.invoke(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L4c
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4c:
            java.util.Set r5 = r4.f3867f
            K3.h r4 = r4.f3866e
            r6 = 0
            if (r5 != 0) goto L6b
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Map r4 = r4.getAll()
            java.lang.String r5 = "sharedPrefs.all"
            kotlin.jvm.internal.i.d(r4, r5)
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L69
            goto L8e
        L69:
            r3 = r6
            goto L8e
        L6b:
            java.lang.Object r4 = r4.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L78
            goto L69
        L78:
            java.util.Iterator r5 = r5.iterator()
        L7c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L69
            java.lang.Object r0 = r5.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L7c
        L8e:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.c.a(java.lang.Object, Q3.c):java.lang.Object");
    }
}

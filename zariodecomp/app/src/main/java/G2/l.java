package G2;

import android.content.Context;
import f4.E;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r.AbstractC0854a;
import t2.C0945d;
import t2.C0946e;
import t2.C0949h;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\l.smali */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final a0.d f1863b = r1.d.M("fire-global");

    /* renamed from: c, reason: collision with root package name */
    public static final a0.d f1864c = r1.d.M("fire-count");

    /* renamed from: d, reason: collision with root package name */
    public static final a0.d f1865d = r1.d.V("last-used-date");

    /* renamed from: a, reason: collision with root package name */
    public final C0949h f1866a;

    public l(Context context, String str) {
        this.f1866a = new C0949h(context, AbstractC0854a.b("FirebaseHeartBeat", str));
    }

    public final synchronized ArrayList a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strB = b(System.currentTimeMillis());
            C0949h c0949h = this.f1866a;
            c0949h.getClass();
            for (Map.Entry entry : ((Map) E.x(O3.j.f2661a, new C0945d(c0949h, null))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strB);
                    if (!hashSet.isEmpty()) {
                        arrayList.add(new a(((a0.d) entry.getKey()).f4022a, new ArrayList(hashSet)));
                    }
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                this.f1866a.a(new X3.l() { // from class: G2.j
                    @Override // X3.l
                    public final Object invoke(Object obj) {
                        ((a0.b) obj).e(l.f1863b, Long.valueOf(jCurrentTimeMillis));
                        return null;
                    }
                });
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    public final synchronized String b(long j5) {
        return new Date(j5).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    public final synchronized a0.d c(a0.b bVar, String str) {
        for (Map.Entry entry : bVar.a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return r1.d.W(((a0.d) entry.getKey()).f4022a);
                    }
                }
            }
        }
        return null;
    }

    public final synchronized void d(a0.b bVar, String str) {
        try {
            a0.d dVarC = c(bVar, str);
            if (dVarC == null) {
                return;
            }
            HashSet hashSet = new HashSet((Collection) r1.d.D(bVar, dVarC, new HashSet()));
            hashSet.remove(str);
            if (hashSet.isEmpty()) {
                bVar.d(dVarC);
            } else {
                bVar.f(dVarC, hashSet);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean e(a0.d key, long j5) {
        O3.j jVar;
        long jLongValue;
        C0949h c0949h = this.f1866a;
        c0949h.getClass();
        kotlin.jvm.internal.i.e(key, "key");
        C0946e c0946e = new C0946e(c0949h, key, null);
        jVar = O3.j.f2661a;
        jLongValue = ((Long) E.x(jVar, c0946e)).longValue();
        synchronized (this) {
        }
        if (b(jLongValue).equals(b(j5))) {
            return false;
        }
        C0949h c0949h2 = this.f1866a;
        Long lValueOf = Long.valueOf(j5);
        c0949h2.getClass();
        return true;
    }
}

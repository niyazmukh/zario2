package s3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\L.smali */
public final class L {

    /* renamed from: c, reason: collision with root package name */
    public static final long f9738c = Duration.ofSeconds(1).toMillis();

    /* renamed from: a, reason: collision with root package name */
    public final C0878a f9739a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9740b;

    public L(C0878a c0878a) {
        this.f9739a = c0878a;
        this.f9740b = c0878a.f9742b.toMillis();
    }

    public static void a(LinkedHashMap linkedHashMap, String str, long j5, u3.b bVar, String str2) {
        K k5;
        K k6 = (K) linkedHashMap.get(str);
        if (k6 != null) {
            int iOrdinal = bVar.ordinal();
            u3.b bVar2 = k6.f9736d;
            u3.b bVar3 = iOrdinal < bVar2.ordinal() ? bVar : bVar2;
            long jMin = Math.min(k6.f9734b, j5);
            String str3 = k6.f9737e;
            k5 = K.a(k6, jMin, Math.max(k6.f9735c, j5), bVar3, str3 == null ? str2 : str3, 1);
        } else {
            k5 = new K(str, j5, j5, bVar, str2);
        }
        linkedHashMap.put(str, k5);
    }

    public final ArrayList b(LinkedHashMap linkedHashMap, long j5, u3.b bVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            K k5 = (K) entry.getValue();
            if (bVar == null || bVar.ordinal() <= k5.f9736d.ordinal()) {
                arrayList.add(K.a(k5, 0L, Math.max(k5.f9735c, j5), null, null, 27).b(j5, this.f9740b));
                it.remove();
            } else {
                entry.setValue(k5.c(j5, bVar));
            }
        }
        return arrayList;
    }

    public final I c(LinkedHashMap linkedHashMap, String str, long j5, u3.b bVar) {
        K k5 = (K) linkedHashMap.get(str);
        if (k5 == null) {
            return null;
        }
        if (bVar.ordinal() > k5.f9736d.ordinal()) {
            linkedHashMap.put(str, k5.c(j5, bVar));
            return null;
        }
        K kA = K.a(k5, 0L, Math.max(k5.f9735c, j5), null, null, 27);
        linkedHashMap.remove(str);
        return kA.b(j5, this.f9740b);
    }
}

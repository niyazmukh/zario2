package k3;

import L3.C;
import com.niyaz.zario.ui.history.HistoryFragment;
import i4.I;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u0.AbstractC0967h;

/* renamed from: k3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k3.1\a.smali */
public final /* synthetic */ class C0660a implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8305a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HistoryFragment f8306b;

    public /* synthetic */ C0660a(HistoryFragment historyFragment, int i) {
        this.f8305a = i;
        this.f8306b = historyFragment;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        C0666g c0666gC;
        Object objK;
        Object obj2;
        Object obj3;
        Object objK2;
        K3.k kVar = K3.k.f2288a;
        HistoryFragment historyFragment = this.f8306b;
        switch (this.f8305a) {
            case 0:
                C0670k entry = (C0670k) obj;
                kotlin.jvm.internal.i.e(entry, "entry");
                u uVar = (u) historyFragment.f6705g0.getValue();
                uVar.getClass();
                String packageName = entry.f8322a;
                kotlin.jvm.internal.i.e(packageName, "packageName");
                I i = uVar.f8363g;
                List list = ((C0671l) i.K()).f8327b;
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (kotlin.jvm.internal.i.a(((C0670k) it.next()).f8322a, packageName)) {
                                Set set = ((C0671l) i.K()).i;
                                LinkedHashSet linkedHashSetK0 = set.contains(packageName) ? C.k0(set, packageName) : C.l0(set, packageName);
                                if (linkedHashSetK0.isEmpty()) {
                                    c0666gC = uVar.f8364j;
                                } else {
                                    int i5 = u.f8356m;
                                    c0666gC = r1.d.c(uVar.i, uVar.f8361e, linkedHashSetK0);
                                }
                                List list2 = c0666gC.f8314a;
                                boolean z4 = false;
                                if (!list2.isEmpty()) {
                                    Iterator it2 = list2.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            if (((C0669j) it2.next()).f8321b > 0) {
                                                z4 = true;
                                            }
                                        }
                                    }
                                }
                                boolean z5 = !z4;
                                long j5 = z4 ? u.f8355l : 0L;
                                do {
                                    objK = i.K();
                                } while (!i.J(objK, C0671l.a((C0671l) objK, false, null, c0666gC.f8314a, null, null, null, z5, j5, linkedHashSetK0, 0L, 571)));
                            }
                        }
                    }
                }
                return kVar;
            case 1:
                return AbstractC0967h.b(historyFragment.S(), ((Long) obj).longValue());
            default:
                L.c cVar = (L.c) obj;
                if (cVar != null && (obj2 = cVar.a) != null && (obj3 = cVar.b) != null) {
                    u uVar2 = (u) historyFragment.f6705g0.getValue();
                    long jLongValue = ((Number) obj2).longValue();
                    long jLongValue2 = ((Number) obj3).longValue();
                    uVar2.getClass();
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(jLongValue);
                    ZoneId zoneId = uVar2.f8361e;
                    LocalDate localDate = instantOfEpochMilli.atZone(zoneId).toLocalDate();
                    kotlin.jvm.internal.i.d(localDate, "toLocalDate(...)");
                    LocalDate localDate2 = Instant.ofEpochMilli(jLongValue2).atZone(zoneId).toLocalDate();
                    kotlin.jvm.internal.i.d(localDate2, "toLocalDate(...)");
                    C0667h c0667h = new C0667h(localDate, localDate2);
                    if (localDate.isAfter(localDate2)) {
                        c0667h = new C0667h(localDate2, localDate);
                    }
                    I i6 = uVar2.f8363g;
                    C0667h c0667hD = u.d(c0667h, ((C0671l) i6.K()).f8330e);
                    if (!c0667hD.equals(((C0671l) i6.K()).f8329d)) {
                        do {
                            objK2 = i6.K();
                        } while (!i6.J(objK2, C0671l.a((C0671l) objK2, false, null, null, c0667hD, null, uVar2.g(c0667hD), false, 0L, null, 0L, 983)));
                    }
                }
                return kVar;
        }
    }
}

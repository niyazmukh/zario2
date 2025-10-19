package A2;

import J0.C0111e;
import g2.C0581d;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.UUID;

/* renamed from: A2.u, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\u.1.smali */
public final class C0020u implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f249a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f250b;

    /* renamed from: c, reason: collision with root package name */
    public Object f251c;

    /* renamed from: d, reason: collision with root package name */
    public Object f252d;

    /* renamed from: e, reason: collision with root package name */
    public Object f253e;

    public /* synthetic */ C0020u(Object obj, Object obj2, Object obj3, boolean z4, int i) {
        this.f249a = i;
        this.f251c = obj;
        this.f252d = obj2;
        this.f253e = obj3;
        this.f250b = z4;
    }

    public void a(Object obj, String str) {
        C0009i c0009i = new C0009i(14);
        ((C0009i) this.f253e).f206d = c0009i;
        this.f253e = c0009i;
        c0009i.f205c = obj;
        c0009i.f204b = str;
    }

    public void b(String str, long j5) {
        d(str, String.valueOf(j5));
    }

    public void c(String str, boolean z4) {
        d(str, String.valueOf(z4));
    }

    public void d(String str, String str2) {
        C0581d c0581d = new C0581d(14);
        ((C0009i) this.f253e).f206d = c0581d;
        this.f253e = c0581d;
        c0581d.f205c = str2;
        c0581d.f204b = str;
    }

    public J0.v e() {
        if (this.f250b && ((S0.q) this.f252d).f2902j.f2038c) {
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }
        J0.v vVar = new J0.v((UUID) this.f251c, (S0.q) this.f252d, (LinkedHashSet) this.f253e);
        C0111e c0111e = ((S0.q) this.f252d).f2902j;
        boolean z4 = !c0111e.h.isEmpty() || c0111e.f2039d || c0111e.f2037b || c0111e.f2038c;
        S0.q qVar = (S0.q) this.f252d;
        if (qVar.f2909q) {
            if (z4) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (qVar.f2901g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
        this.f251c = uuidRandomUUID;
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.i.d(string, "id.toString()");
        S0.q other = (S0.q) this.f252d;
        kotlin.jvm.internal.i.e(other, "other");
        this.f252d = new S0.q(string, other.f2896b, other.f2897c, other.f2898d, new J0.h(other.f2899e), new J0.h(other.f2900f), other.f2901g, other.h, other.i, new C0111e(other.f2902j), other.f2903k, other.f2904l, other.f2905m, other.f2906n, other.f2907o, other.f2908p, other.f2909q, other.f2910r, other.f2911s, other.f2913u, other.f2914v, other.f2915w, 524288);
        return vVar;
    }

    public int[] f() {
        synchronized (this) {
            try {
                if (!this.f250b) {
                    return null;
                }
                long[] jArr = (long[]) this.f251c;
                int length = jArr.length;
                int i = 0;
                int i5 = 0;
                while (i < length) {
                    int i6 = i5 + 1;
                    int i7 = 1;
                    boolean z4 = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.f252d;
                    if (z4 != zArr[i5]) {
                        int[] iArr = (int[]) this.f253e;
                        if (!z4) {
                            i7 = 2;
                        }
                        iArr[i5] = i7;
                    } else {
                        ((int[]) this.f253e)[i5] = 0;
                    }
                    zArr[i5] = z4;
                    i++;
                    i5 = i6;
                }
                this.f250b = false;
                return (int[]) ((int[]) this.f253e).clone();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A2.e0
    public void start() {
        if (((C0024y) this.f253e).f261b.f254a != -1) {
            ((F2.f) this.f251c).a(F2.e.f1699k, this.f250b ? C0024y.f259d : C0024y.f258c, new RunnableC0005e(this, 1));
        }
    }

    public String toString() {
        switch (this.f249a) {
            case 2:
                boolean z4 = this.f250b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.f251c);
                sb.append('{');
                String str = "";
                for (C0009i c0009i = (C0009i) ((C0009i) this.f252d).f206d; c0009i != null; c0009i = (C0009i) c0009i.f206d) {
                    Object obj = c0009i.f205c;
                    if ((c0009i instanceof C0581d) || obj != null || !z4) {
                        sb.append(str);
                        String str2 = (String) c0009i.f204b;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append('=');
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String strDeepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            case 3:
            default:
                return super.toString();
            case 4:
                StringBuilder sb2 = new StringBuilder("DatabaseInfo(databaseId:");
                sb2.append((B2.f) this.f251c);
                sb2.append(" host:");
                return B.a.m(sb2, (String) this.f253e, ")");
        }
    }

    public C0020u(Class cls) {
        this.f249a = 1;
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.i.d(uuidRandomUUID, "randomUUID()");
        this.f251c = uuidRandomUUID;
        String string = ((UUID) this.f251c).toString();
        kotlin.jvm.internal.i.d(string, "id.toString()");
        this.f252d = new S0.q(string, 0, cls.getName(), (String) null, (J0.h) null, (J0.h) null, 0L, 0L, 0L, (C0111e) null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 0L, 0, 0, 8388602);
        String[] strArr = {cls.getName()};
        LinkedHashSet linkedHashSet = new LinkedHashSet(L3.x.a0(1));
        linkedHashSet.add(strArr[0]);
        this.f253e = linkedHashSet;
    }

    public C0020u(C0024y c0024y, F2.f fVar, r rVar) {
        this.f249a = 0;
        this.f253e = c0024y;
        this.f250b = false;
        this.f251c = fVar;
        this.f252d = rVar;
    }

    public C0020u(String str) {
        this.f249a = 2;
        C0009i c0009i = new C0009i(14);
        this.f252d = c0009i;
        this.f253e = c0009i;
        this.f250b = false;
        this.f251c = str;
    }

    public C0020u(int i) {
        this.f249a = 3;
        this.f251c = new long[i];
        this.f252d = new boolean[i];
        this.f253e = new int[i];
    }
}

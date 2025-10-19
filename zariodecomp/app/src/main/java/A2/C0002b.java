package A2;

import N2.n0;
import java.util.Comparator;

/* renamed from: A2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\b.1.smali */
public final /* synthetic */ class C0002b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167a;

    public /* synthetic */ C0002b(int i) {
        this.f167a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f167a) {
            case 0:
                C0003c c0003c = (C0003c) obj;
                C0003c c0003c2 = (C0003c) obj2;
                int iA = c0003c.f172a.compareTo(c0003c2.f172a);
                return iA != 0 ? iA : Integer.compare(c0003c.f173b, c0003c2.f173b);
            case 1:
                C0003c c0003c3 = (C0003c) obj;
                C0003c c0003c4 = (C0003c) obj2;
                int iCompare = Integer.compare(c0003c3.f173b, c0003c4.f173b);
                return iCompare != 0 ? iCompare : c0003c3.f172a.compareTo(c0003c4.f172a);
            case 2:
                return ((Long) obj2).compareTo((Long) obj);
            case 3:
                B2.a aVar = (B2.a) obj;
                B2.a aVar2 = (B2.a) obj2;
                int iCompare2 = Long.compare(aVar.f299d.f305a, aVar2.f299d.f305a);
                return iCompare2 == 0 ? aVar.f297b.compareTo(aVar2.f297b) : iCompare2;
            case 4:
                return Integer.compare(((C2.i) obj).f1087a, ((C2.i) obj2).f1087a);
            case 5:
                return ((B2.h) obj).compareTo((B2.h) obj2);
            case 6:
                return B2.b.b((B2.l) obj).a(B2.b.b((B2.l) obj2));
            case 7:
                return ((y2.j) obj).f11112c.compareTo(((y2.j) obj2).f11112c);
            case 8:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b5 = bArr[i];
                    byte b6 = bArr2[i];
                    if (b5 != b6) {
                        return b5 - b6;
                    }
                }
                return 0;
        }
    }
}

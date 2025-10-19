package j4;

import h4.v;
import i4.InterfaceC0612g;
import i4.InterfaceC0613h;
import java.util.ArrayList;

/* renamed from: j4.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j4\f.1.smali */
public abstract class AbstractC0636f implements v {

    /* renamed from: a, reason: collision with root package name */
    public final O3.i f8080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8081b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.a f8082c;

    public AbstractC0636f(O3.i iVar, int i, h4.a aVar) {
        this.f8080a = iVar;
        this.f8081b = i;
        this.f8082c = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final i4.InterfaceC0612g a(O3.i r5, int r6, h4.a r7) {
        /*
            r4 = this;
            O3.i r0 = r4.f8080a
            O3.i r5 = r5.plus(r0)
            h4.a r1 = h4.a.f7766a
            h4.a r2 = r4.f8082c
            int r3 = r4.f8081b
            if (r7 == r1) goto Lf
            goto L26
        Lf:
            r7 = -3
            if (r3 != r7) goto L13
            goto L25
        L13:
            if (r6 != r7) goto L17
        L15:
            r6 = r3
            goto L25
        L17:
            r7 = -2
            if (r3 != r7) goto L1b
            goto L25
        L1b:
            if (r6 != r7) goto L1e
            goto L15
        L1e:
            int r6 = r6 + r3
            if (r6 < 0) goto L22
            goto L25
        L22:
            r6 = 2147483647(0x7fffffff, float:NaN)
        L25:
            r7 = r2
        L26:
            boolean r0 = kotlin.jvm.internal.i.a(r5, r0)
            if (r0 == 0) goto L31
            if (r6 != r3) goto L31
            if (r7 != r2) goto L31
            return r4
        L31:
            j4.f r4 = r4.d(r5, r6, r7)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.AbstractC0636f.a(O3.i, int, h4.a):i4.g");
    }

    public abstract Object b(v vVar, O3.d dVar);

    public Object c(InterfaceC0613h interfaceC0613h, O3.d dVar) throws Throwable {
        Object objG = f4.E.g(new C0634d(interfaceC0613h, this, null), dVar);
        return objG == P3.a.f2678a ? objG : K3.k.f2288a;
    }

    public abstract AbstractC0636f d(O3.i iVar, int i, h4.a aVar);

    public InterfaceC0612g e() {
        return null;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        O3.j jVar = O3.j.f2661a;
        O3.i iVar = this.f8080a;
        if (iVar != jVar) {
            arrayList.add("context=" + iVar);
        }
        int i = this.f8081b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        h4.a aVar = h4.a.f7766a;
        h4.a aVar2 = this.f8082c;
        if (aVar2 != aVar) {
            arrayList.add("onBufferOverflow=" + aVar2);
        }
        return getClass().getSimpleName() + '[' + L3.j.h0(arrayList, ", ", null, null, null, 62) + ']';
    }
}

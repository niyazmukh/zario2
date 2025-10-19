package B3;

import java.io.OutputStream;
import java.util.ArrayList;

/* renamed from: B3.j1, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\j1.1.smali */
public final class C0054j1 extends OutputStream {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f852a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public C3.t f853b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0060l1 f854c;

    public C0054j1(C0060l1 c0060l1) {
        this.f854c = c0060l1;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        C3.t tVar = this.f853b;
        if (tVar == null || tVar.f1249b <= 0) {
            write(new byte[]{(byte) i}, 0, 1);
            return;
        }
        tVar.f1248a.u((byte) i);
        tVar.f1249b--;
        tVar.f1250c++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i5) {
        C3.t tVar = this.f853b;
        ArrayList arrayList = this.f852a;
        C0060l1 c0060l1 = this.f854c;
        if (tVar == null) {
            c0060l1.f885g.getClass();
            C3.t tVarA = G2.e.a(i5);
            this.f853b = tVarA;
            arrayList.add(tVarA);
        }
        while (i5 > 0) {
            int iMin = Math.min(i5, this.f853b.f1249b);
            if (iMin == 0) {
                int iMax = Math.max(i5, this.f853b.f1250c * 2);
                c0060l1.f885g.getClass();
                C3.t tVarA2 = G2.e.a(iMax);
                this.f853b = tVarA2;
                arrayList.add(tVarA2);
            } else {
                this.f853b.a(bArr, i, iMin);
                i += iMin;
                i5 -= iMin;
            }
        }
    }
}

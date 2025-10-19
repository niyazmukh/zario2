package v;

import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\k.smali */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public m f10542a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f10543b;

    public static long a(f fVar, long j5) {
        m mVar = fVar.f10533d;
        if (mVar instanceof i) {
            return j5;
        }
        ArrayList arrayList = fVar.f10538k;
        int size = arrayList.size();
        long jMin = j5;
        for (int i = 0; i < size; i++) {
            InterfaceC0975d interfaceC0975d = (InterfaceC0975d) arrayList.get(i);
            if (interfaceC0975d instanceof f) {
                f fVar2 = (f) interfaceC0975d;
                if (fVar2.f10533d != mVar) {
                    jMin = Math.min(jMin, a(fVar2, fVar2.f10535f + j5));
                }
            }
        }
        if (fVar != mVar.i) {
            return jMin;
        }
        long j6 = mVar.j();
        long j7 = j5 - j6;
        return Math.min(Math.min(jMin, a(mVar.h, j7)), j7 - r9.f10535f);
    }

    public static long b(f fVar, long j5) {
        m mVar = fVar.f10533d;
        if (mVar instanceof i) {
            return j5;
        }
        ArrayList arrayList = fVar.f10538k;
        int size = arrayList.size();
        long jMax = j5;
        for (int i = 0; i < size; i++) {
            InterfaceC0975d interfaceC0975d = (InterfaceC0975d) arrayList.get(i);
            if (interfaceC0975d instanceof f) {
                f fVar2 = (f) interfaceC0975d;
                if (fVar2.f10533d != mVar) {
                    jMax = Math.max(jMax, b(fVar2, fVar2.f10535f + j5));
                }
            }
        }
        if (fVar != mVar.h) {
            return jMax;
        }
        long j6 = mVar.j();
        long j7 = j5 + j6;
        return Math.max(Math.max(jMax, b(mVar.i, j7)), j7 - r9.f10535f);
    }
}

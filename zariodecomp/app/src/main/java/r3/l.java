package r3;

import X3.p;
import a.AbstractC0183a;
import android.util.Log;
import f4.C;
import i4.I;
import s3.C0877A;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r3.1\l.smali */
public final class l extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f9656a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f9657b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, O3.d dVar) {
        super(2, dVar);
        this.f9657b = mVar;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new l(this.f9657b, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objC;
        P3.a aVar = P3.a.f2678a;
        int i = this.f9656a;
        m mVar = this.f9657b;
        boolean z4 = true;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                U2.l lVar = mVar.f9658a;
                this.f9656a = 1;
                objC = lVar.c(7, this);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
                objC = obj;
            }
            C0877A c0877a = (C0877A) objC;
            long j5 = c0877a.f9694c;
            long j6 = c0877a.f9695d;
            boolean z5 = c0877a.f9693b > 0 && j6 > 0;
            boolean z6 = j5 > 0;
            mVar.f9662e = z5 ? j6 : z6 ? j5 : 1800000L;
            mVar.f9663f = S0.f.u((long) (Math.max(r14, 1800000L) * 0.8d), 1800000L);
            if (!z6 && !z5) {
                Log.w("TargetFragment", "No usage detected yet; using minimum baseline for goal setup");
            }
            if (!z5) {
                j6 = mVar.f9662e;
            }
            I i5 = mVar.f9660c;
            long j7 = mVar.f9663f;
            if (z5 || z6) {
                z4 = false;
            }
            g gVar = new g(j6, j5, j7, z4);
            i5.getClass();
            i5.M(null, gVar);
        } catch (Exception e5) {
            Log.e("TargetFragment", "Error loading usage data", e5);
            I i6 = mVar.f9660c;
            String message = e5.getMessage();
            if (message == null) {
                message = "Unknown error occurred";
            }
            h hVar = new h(message);
            i6.getClass();
            i6.M(null, hVar);
        }
        return K3.k.f2288a;
    }
}

package j3;

import X3.p;
import a.AbstractC0183a;
import android.content.Context;
import e3.o;
import f4.C;
import i4.I;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\k.smali */
public final class k extends Q3.j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f8053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f8054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8056d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, int i, int i5, O3.d dVar) {
        super(2, dVar);
        this.f8054b = lVar;
        this.f8055c = i;
        this.f8056d = i5;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        return new k(this.f8054b, this.f8055c, this.f8056d, dVar);
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        P3.a aVar = P3.a.f2678a;
        int i = this.f8053a;
        l lVar = this.f8054b;
        Context context = lVar.f8057a;
        I i5 = lVar.f8059c;
        try {
            if (i == 0) {
                AbstractC0183a.m0(obj);
                h hVar = h.f8051a;
                i5.getClass();
                i5.M(null, hVar);
                o oVar = lVar.f8058b;
                int i6 = this.f8055c;
                int i7 = this.f8056d;
                this.f8053a = 1;
                obj = oVar.d(i6, i7, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                i iVar = i.f8052a;
                i5.getClass();
                i5.M(null, iVar);
            } else {
                String string = context.getString(2131886216);
                kotlin.jvm.internal.i.d(string, "getString(...)");
                f fVar = new f(string);
                i5.getClass();
                i5.M(null, fVar);
            }
        } catch (Exception unused) {
            String string2 = context.getString(2131886221);
            kotlin.jvm.internal.i.d(string2, "getString(...)");
            f fVar2 = new f(string2);
            i5.getClass();
            i5.M(null, fVar2);
        }
        return K3.k.f2288a;
    }
}

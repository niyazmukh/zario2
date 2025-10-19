package W;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: W.h, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W\h.1.smali */
public final class C0166h extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f3608a;

    /* renamed from: b, reason: collision with root package name */
    public Y.c f3609b;

    /* renamed from: c, reason: collision with root package name */
    public Object f3610c;

    /* renamed from: d, reason: collision with root package name */
    public int f3611d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f3612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f3613f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f3614k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166h(List list, ArrayList arrayList, O3.d dVar) {
        super(2, dVar);
        this.f3613f = list;
        this.f3614k = arrayList;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0166h c0166h = new C0166h(this.f3613f, this.f3614k, dVar);
        c0166h.f3612e = obj;
        return c0166h;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0166h) create(obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095 A[RETURN] */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            P3.a r0 = P3.a.f2678a
            int r1 = r10.f3611d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            java.util.Iterator r1 = r10.f3608a
            java.lang.Object r4 = r10.f3612e
            java.util.List r4 = (java.util.List) r4
            a.AbstractC0183a.m0(r11)
            goto L3c
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1e:
            java.lang.Object r1 = r10.f3610c
            Y.c r4 = r10.f3609b
            java.util.Iterator r5 = r10.f3608a
            java.lang.Object r6 = r10.f3612e
            java.util.List r6 = (java.util.List) r6
            a.AbstractC0183a.m0(r11)
            r9 = r6
            r6 = r4
            r4 = r9
            goto L5e
        L2f:
            a.AbstractC0183a.m0(r11)
            java.lang.Object r11 = r10.f3612e
            java.util.List r1 = r10.f3613f
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r4 = r10.f3614k
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L95
            java.lang.Object r5 = r1.next()
            Y.c r5 = (Y.c) r5
            r10.f3612e = r4
            r10.f3608a = r1
            r10.f3609b = r5
            r10.f3610c = r11
            r10.f3611d = r3
            java.lang.Object r6 = r5.a(r11, r10)
            if (r6 != r0) goto L59
            return r0
        L59:
            r9 = r1
            r1 = r11
            r11 = r6
            r6 = r5
            r5 = r9
        L5e:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L93
            W.g r11 = new W.g
            r7 = 0
            r11.<init>(r6, r7)
            r4.add(r11)
            r10.f3612e = r4
            r10.f3608a = r5
            r10.f3609b = r7
            r10.f3610c = r7
            r10.f3611d = r2
            Y.e r11 = new Y.e
            K3.h r7 = r6.f3866e
            java.lang.Object r7 = r7.getValue()
            android.content.SharedPreferences r7 = (android.content.SharedPreferences) r7
            java.util.Set r8 = r6.f3867f
            r11.<init>(r7, r8)
            Z.j r6 = r6.f3863b
            java.lang.Object r11 = r6.c(r11, r1, r10)
            if (r11 != r0) goto L91
            return r0
        L91:
            r1 = r5
            goto L3c
        L93:
            r11 = r1
            goto L91
        L95:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: W.C0166h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

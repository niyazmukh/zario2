package b3;

import com.niyaz.zario.firebase.RemoteSyncWorker;
import java.util.Iterator;

/* renamed from: b3.Y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\Y.smali */
public final class C0300Y extends Q3.j implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public RemoteSyncWorker f5198a;

    /* renamed from: b, reason: collision with root package name */
    public Iterator f5199b;

    /* renamed from: c, reason: collision with root package name */
    public int f5200c;

    /* renamed from: d, reason: collision with root package name */
    public int f5201d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f5202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RemoteSyncWorker f5203f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0300Y(RemoteSyncWorker remoteSyncWorker, O3.d dVar) {
        super(2, dVar);
        this.f5203f = remoteSyncWorker;
    }

    @Override // Q3.a
    public final O3.d create(Object obj, O3.d dVar) {
        C0300Y c0300y = new C0300Y(this.f5203f, dVar);
        c0300y.f5202e = obj;
        return c0300y;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0300Y) create((f4.C) obj, (O3.d) obj2)).invokeSuspend(K3.k.f2288a);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0136 -> B:52:0x0139). Please report as a decompilation issue!!! */
    @Override // Q3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: b3.C0300Y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

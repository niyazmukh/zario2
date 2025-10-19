package i4;

import com.google.protobuf.AbstractC0417p;
import f4.C0516n;
import j4.AbstractC0632b;
import j4.AbstractC0633c;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\i4\I.smali */
public final class I extends AbstractC0417p implements w, InterfaceC0612g, j4.v {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7889e = AtomicReferenceFieldUpdater.newUpdater(I.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: d, reason: collision with root package name */
    public int f7890d;

    public I(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean J(Object obj, Object obj2) {
        h1.i iVar = AbstractC0632b.f8071b;
        if (obj == null) {
            obj = iVar;
        }
        if (obj2 == null) {
            obj2 = iVar;
        }
        return M(obj, obj2);
    }

    public final Object K() {
        h1.i iVar = AbstractC0632b.f8071b;
        Object obj = f7889e.get(this);
        if (obj == iVar) {
            return null;
        }
        return obj;
    }

    public final void L(Object obj) {
        if (obj == null) {
            obj = AbstractC0632b.f8071b;
        }
        M(null, obj);
    }

    public final boolean M(Object obj, Object obj2) {
        int i;
        AbstractC0633c[] abstractC0633cArr;
        h1.i iVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7889e;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.i.a(obj3, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.i.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i5 = this.f7890d;
            if ((i5 & 1) != 0) {
                this.f7890d = i5 + 2;
                return true;
            }
            int i6 = i5 + 1;
            this.f7890d = i6;
            AbstractC0633c[] abstractC0633cArr2 = (AbstractC0633c[]) this.f6564c;
            while (true) {
                J[] jArr = (J[]) abstractC0633cArr2;
                if (jArr != null) {
                    for (J j5 : jArr) {
                        if (j5 != null) {
                            AtomicReference atomicReference = j5.f7891a;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (iVar = C.f7876c)) {
                                    h1.i iVar2 = C.f7875b;
                                    if (obj4 != iVar2) {
                                        while (!atomicReference.compareAndSet(obj4, iVar2)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((C0516n) obj4).resumeWith(K3.k.f2288a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, iVar)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f7890d;
                    if (i == i6) {
                        this.f7890d = i6 + 1;
                        return true;
                    }
                    abstractC0633cArr = (AbstractC0633c[]) this.f6564c;
                }
                abstractC0633cArr2 = abstractC0633cArr;
                i6 = i;
            }
        }
    }

    public final InterfaceC0612g a(O3.i iVar, int i, h4.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != h4.a.f7767b) ? C.k(this, iVar, i, aVar) : this;
    }

    @Override // i4.InterfaceC0613h
    public final Object b(Object obj, O3.d dVar) {
        L(obj);
        return K3.k.f2288a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x007b, code lost:
    
        if (r12 != r1) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:39:0x0091, B:41:0x0097], limit reached: 70 */
    /* JADX WARN: Path cross not found for [B:41:0x0097, B:39:0x0091], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x007b, B:33:0x0083, B:36:0x008a, B:37:0x008e, B:39:0x0091, B:49:0x00b2, B:52:0x00c2, B:53:0x00dc, B:59:0x00ee, B:56:0x00e5, B:58:0x00eb, B:41:0x0097, B:45:0x009e, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0091 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x007b, B:33:0x0083, B:36:0x008a, B:37:0x008e, B:39:0x0091, B:49:0x00b2, B:52:0x00c2, B:53:0x00dc, B:59:0x00ee, B:56:0x00e5, B:58:0x00eb, B:41:0x0097, B:45:0x009e, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c2 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:31:0x007b, B:33:0x0083, B:36:0x008a, B:37:0x008e, B:39:0x0091, B:49:0x00b2, B:52:0x00c2, B:53:0x00dc, B:59:0x00ee, B:56:0x00e5, B:58:0x00eb, B:41:0x0097, B:45:0x009e, B:21:0x004d), top: B:66:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [i4.J] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [j4.c] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [i4.J] */
    /* JADX WARN: Type inference failed for: r2v7, types: [i4.J] */
    /* JADX WARN: Type inference failed for: r2v8, types: [i4.J] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.google.protobuf.p] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [i4.I] */
    /* JADX WARN: Type inference failed for: r8v5, types: [i4.I, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7, types: [i4.I] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00c1 -> B:31:0x007b). Please report as a decompilation issue!!! */
    @Override // i4.InterfaceC0612g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(i4.InterfaceC0613h r14, O3.d r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: i4.I.c(i4.h, O3.d):java.lang.Object");
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final AbstractC0633c f() {
        return new J();
    }

    @Override // com.google.protobuf.AbstractC0417p
    public final AbstractC0633c[] g() {
        return new J[2];
    }
}

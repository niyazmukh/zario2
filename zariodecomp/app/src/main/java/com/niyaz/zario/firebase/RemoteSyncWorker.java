package com.niyaz.zario.firebase;

import X2.g;
import android.content.Context;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b3.C0294S;
import b3.InterfaceC0296U;
import com.google.firebase.auth.FirebaseAuth;
import kotlin.jvm.internal.i;

@HiltWorker
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\firebase\RemoteSyncWorker.smali */
public final class RemoteSyncWorker extends CoroutineWorker {

    /* renamed from: a, reason: collision with root package name */
    public final FirebaseAuth f6639a;

    /* renamed from: b, reason: collision with root package name */
    public final C0294S f6640b;

    /* renamed from: c, reason: collision with root package name */
    public final g f6641c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0296U f6642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSyncWorker(Context appContext, WorkerParameters params, FirebaseAuth auth, C0294S userGateway, g remoteSyncDao, InterfaceC0296U notifier) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        i.e(auth, "auth");
        i.e(userGateway, "userGateway");
        i.e(remoteSyncDao, "remoteSyncDao");
        i.e(notifier, "notifier");
        this.f6639a = auth;
        this.f6640b = userGateway;
        this.f6641c = remoteSyncDao;
        this.f6642d = notifier;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.io.Serializable c(com.niyaz.zario.firebase.RemoteSyncWorker r16, X2.d r17, Q3.c r18) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.firebase.RemoteSyncWorker.c(com.niyaz.zario.firebase.RemoteSyncWorker, X2.d, Q3.c):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:(1:109)|40|127|41|125|42|43|115|44|(4:123|47|48|45)|135|51|52|107|53|54|121|55|56|(1:139)(7:59|119|60|61|113|62|(1:140)(5:65|129|66|91|(6:93|101|(0)|104|35|(0)(0))(10:94|133|(1:95)|131|100|101|(0)|104|35|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(20:109|40|127|41|125|42|43|115|44|(4:123|47|48|45)|135|51|52|107|53|54|121|55|56|(1:139)(7:59|119|60|61|113|62|(1:140)(5:65|129|66|91|(6:93|101|(0)|104|35|(0)(0))(10:94|133|(1:95)|131|100|101|(0)|104|35|(0)(0))))) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:59|119|60|61|113|62|(1:140)(5:65|129|66|91|(6:93|101|(0)|104|35|(0)(0))(10:94|133|(1:95)|131|100|101|(0)|104|35|(0)(0)))) */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01a1, code lost:
    
        r2 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01aa, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01ad, code lost:
    
        r12 = r2;
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b1, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01b5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01b6, code lost:
    
        r3 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01b8, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01bd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01be, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x00fc -> B:104:0x0220). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x01cd -> B:101:0x0216). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x01d1 -> B:95:0x01ec). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.niyaz.zario.firebase.RemoteSyncWorker r28, java.util.List r29, Q3.c r30) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.firebase.RemoteSyncWorker.d(com.niyaz.zario.firebase.RemoteSyncWorker, java.util.List, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object doWork(O3.d r6) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r6 instanceof b3.C0298W
            if (r0 == 0) goto L13
            r0 = r6
            b3.W r0 = (b3.C0298W) r0
            int r1 = r0.f5195c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5195c = r1
            goto L1a
        L13:
            b3.W r0 = new b3.W
            Q3.c r6 = (Q3.c) r6
            r0.<init>(r5, r6)
        L1a:
            java.lang.Object r6 = r0.f5193a
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5195c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            a.AbstractC0183a.m0(r6)
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            a.AbstractC0183a.m0(r6)
            m4.e r6 = f4.N.f7027a
            m4.d r6 = m4.d.f8928c
            b3.Y r2 = new b3.Y
            r4 = 0
            r2.<init>(r5, r4)
            r0.f5195c = r3
            java.lang.Object r6 = f4.E.B(r6, r2, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.i.d(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.firebase.RemoteSyncWorker.doWork(O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(Y2.d r33, java.lang.Throwable r34, Q3.c r35) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.firebase.RemoteSyncWorker.e(Y2.d, java.lang.Throwable, Q3.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(Y2.f r8, java.lang.Throwable r9, Q3.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof b3.C0307c0
            if (r0 == 0) goto L13
            r0 = r10
            b3.c0 r0 = (b3.C0307c0) r0
            int r1 = r0.f5234f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5234f = r1
            goto L18
        L13:
            b3.c0 r0 = new b3.c0
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f5232d
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f5234f
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            Y2.f r7 = r0.f5231c
            java.lang.Throwable r9 = r0.f5230b
            com.niyaz.zario.firebase.RemoteSyncWorker r8 = r0.f5229a
            a.AbstractC0183a.m0(r10)
            goto L6e
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            a.AbstractC0183a.m0(r10)
            int r10 = r8.f3922l
            int r10 = r10 + r3
            long r4 = java.lang.System.currentTimeMillis()
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r4 = 10239(0x27ff, float:1.4348E-41)
            r5 = 0
            Y2.f r8 = Y2.f.a(r8, r5, r10, r2, r4)
            r0.f5229a = r7
            r0.f5230b = r9
            r0.f5231c = r8
            r0.f5234f = r3
            X2.g r10 = r7.f6641c
            X2.o r10 = (X2.o) r10
            r10.getClass()
            S0.r r2 = new S0.r
            r3 = 7
            r2.<init>(r3, r10, r8)
            java.lang.Object r10 = r10.f3847a
            com.niyaz.zario.data.local.AppDatabase_Impl r10 = (com.niyaz.zario.data.local.AppDatabase_Impl) r10
            java.lang.Object r10 = z2.C1071b.d(r10, r2, r0)
            if (r10 != r1) goto L6b
            return r1
        L6b:
            r6 = r8
            r8 = r7
            r7 = r6
        L6e:
            int r10 = r7.f3922l
            r0 = 3
            if (r10 < r0) goto L8e
            b3.U r10 = r8.f6642d
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r0 = "getApplicationContext(...)"
            kotlin.jvm.internal.i.d(r8, r0)
            b3.d0 r0 = new b3.d0
            java.lang.String r9 = r9.getMessage()
            int r7 = r7.f3922l
            r0.<init>(r7, r9)
            b3.a r10 = (b3.C0302a) r10
            r10.a(r8, r0)
        L8e:
            K3.k r7 = K3.k.f2288a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.firebase.RemoteSyncWorker.f(Y2.f, java.lang.Throwable, Q3.c):java.lang.Object");
    }
}

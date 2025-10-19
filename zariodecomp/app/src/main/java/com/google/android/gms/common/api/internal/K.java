package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC0368f;
import com.google.android.gms.common.internal.C0371i;
import com.google.android.gms.common.internal.C0379q;
import com.google.android.gms.common.internal.C0380s;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import h1.C0588a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\api\internal\K.smali */
public final class K implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0346h f5576a;

    /* renamed from: b, reason: collision with root package name */
    public final int f5577b;

    /* renamed from: c, reason: collision with root package name */
    public final C0339a f5578c;

    /* renamed from: d, reason: collision with root package name */
    public final long f5579d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5580e;

    public K(C0346h c0346h, int i, C0339a c0339a, long j5, long j6) {
        this.f5576a = c0346h;
        this.f5577b = i;
        this.f5578c = c0339a;
        this.f5579d = j5;
        this.f5580e = j6;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x002d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.internal.C0371i a(com.google.android.gms.common.api.internal.D r4, com.google.android.gms.common.internal.AbstractC0368f r5, int r6) {
        /*
            com.google.android.gms.common.internal.i r5 = r5.getTelemetryConfiguration()
            r0 = 0
            if (r5 == 0) goto L32
            boolean r1 = r5.f5708b
            if (r1 == 0) goto L32
            r1 = 0
            int[] r2 = r5.f5710d
            if (r2 != 0) goto L20
            int[] r2 = r5.f5712f
            if (r2 != 0) goto L15
            goto L27
        L15:
            int r3 = r2.length
            if (r1 >= r3) goto L27
            r3 = r2[r1]
            if (r3 != r6) goto L1d
            goto L32
        L1d:
            int r1 = r1 + 1
            goto L15
        L20:
            int r3 = r2.length
            if (r1 >= r3) goto L32
            r3 = r2[r1]
            if (r3 != r6) goto L2f
        L27:
            int r4 = r4.f5562n
            int r6 = r5.f5711e
            if (r4 >= r6) goto L2e
            return r5
        L2e:
            return r0
        L2f:
            int r1 = r1 + 1
            goto L20
        L32:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.K.a(com.google.android.gms.common.api.internal.D, com.google.android.gms.common.internal.f, int):com.google.android.gms.common.internal.i");
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        D d5;
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int iElapsedRealtime;
        long j5;
        long j6;
        C0346h c0346h = this.f5576a;
        if (c0346h.c()) {
            C0380s c0380s = (C0380s) com.google.android.gms.common.internal.r.b().f5746a;
            if ((c0380s == null || c0380s.f5748b) && (d5 = (D) c0346h.f5634j.get(this.f5578c)) != null) {
                Object obj = d5.f5553b;
                if (obj instanceof AbstractC0368f) {
                    AbstractC0368f abstractC0368f = (AbstractC0368f) obj;
                    long j7 = this.f5579d;
                    boolean z4 = j7 > 0;
                    int gCoreServiceId = abstractC0368f.getGCoreServiceId();
                    if (c0380s != null) {
                        z4 &= c0380s.f5749c;
                        boolean zHasConnectionInfo = abstractC0368f.hasConnectionInfo();
                        i = c0380s.f5750d;
                        int i10 = c0380s.f5747a;
                        if (!zHasConnectionInfo || abstractC0368f.isConnecting()) {
                            i6 = c0380s.f5751e;
                            i5 = i10;
                        } else {
                            C0371i c0371iA = a(d5, abstractC0368f, this.f5577b);
                            if (c0371iA == null) {
                                return;
                            }
                            boolean z5 = c0371iA.f5709c && j7 > 0;
                            i6 = c0371iA.f5711e;
                            i5 = i10;
                            z4 = z5;
                        }
                    } else {
                        i = 5000;
                        i5 = 0;
                        i6 = 100;
                    }
                    int i11 = i;
                    if (task.isSuccessful()) {
                        i8 = 0;
                        i9 = 0;
                    } else if (task.isCanceled()) {
                        i8 = -1;
                        i9 = 100;
                    } else {
                        Exception exception = task.getException();
                        if (exception instanceof com.google.android.gms.common.api.j) {
                            Status status = ((com.google.android.gms.common.api.j) exception).getStatus();
                            i7 = status.f5535a;
                            C0588a c0588a = status.f5538d;
                            if (c0588a != null) {
                                i8 = c0588a.f7621b;
                            }
                            i9 = i7;
                        } else {
                            i7 = 101;
                        }
                        i8 = -1;
                        i9 = i7;
                    }
                    if (z4) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f5580e);
                        j5 = j7;
                        j6 = jCurrentTimeMillis;
                    } else {
                        iElapsedRealtime = -1;
                        j5 = 0;
                        j6 = 0;
                    }
                    zau zauVar = c0346h.f5638n;
                    zauVar.sendMessage(zauVar.obtainMessage(18, new L(new C0379q(this.f5577b, i9, i8, j5, j6, null, null, gCoreServiceId, iElapsedRealtime), i5, i11, i6)));
                }
            }
        }
    }
}

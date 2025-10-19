package com.niyaz.zario.worker;

import O3.d;
import Q3.c;
import S2.u;
import S2.x;
import U2.l;
import android.content.Context;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c3.InterfaceC0338b;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@HiltWorker
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker.smali */
public final class UsageMonitoringWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    private static final long NOTIFICATION_COOLDOWN_MS = 300000;
    public static final String OUTPUT_CURRENT_USAGE = "current_usage";
    public static final String OUTPUT_ELAPSED_TIME = "elapsed_time";
    public static final String OUTPUT_EVALUATION_COMPLETE = "evaluation_complete";
    public static final String OUTPUT_GOAL_TIME = "goal_time";
    public static final String OUTPUT_PLAN_LABEL = "plan_label";
    public static final String OUTPUT_TIMESTAMP = "timestamp";
    public static final String TAG = "UsageMonitoringWorker";
    public static final String WORK_NAME = "usage_monitoring";
    private final Context appContext;
    private final MonitoringWorkScheduler monitoringWorkScheduler;
    private final InterfaceC0338b notificationDispatcher;
    private final S2.b remoteDataSource;
    private final u repository;
    private final x resultProcessor;
    private final l usageStatsRepository;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker$Companion.smali */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.UsageMonitoringWorker", f = "UsageMonitoringWorker.kt", l = {194, 202, 209}, m = "captureHourlySnapshotsIfNeeded")
    /* renamed from: com.niyaz.zario.worker.UsageMonitoringWorker$captureHourlySnapshotsIfNeeded$1, reason: invalid class name */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker$captureHourlySnapshotsIfNeeded$1.smali */
    public static final class AnonymousClass1 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(d dVar) {
            super(dVar);
        }

        @Override // Q3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UsageMonitoringWorker.this.captureHourlySnapshotsIfNeeded(null, 0L, 0L, this);
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.UsageMonitoringWorker", f = "UsageMonitoringWorker.kt", l = {136, 145, 148}, m = "completeEvaluation")
    /* renamed from: com.niyaz.zario.worker.UsageMonitoringWorker$completeEvaluation$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker$completeEvaluation$1.smali */
    public static final class C04331 extends c {
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public C04331(d dVar) {
            super(dVar);
        }

        @Override // Q3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UsageMonitoringWorker.this.completeEvaluation(0L, 0L, null, this);
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.UsageMonitoringWorker", f = "UsageMonitoringWorker.kt", l = {44, 50, 54, 71, 74, 77, 84, 85, 109, 121}, m = "doWork")
    /* renamed from: com.niyaz.zario.worker.UsageMonitoringWorker$doWork$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\UsageMonitoringWorker$doWork$1.smali */
    public static final class C04341 extends c {
        int I$0;
        long J$0;
        long J$1;
        long J$2;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C04341(d dVar) {
            super(dVar);
        }

        @Override // Q3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UsageMonitoringWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsageMonitoringWorker(Context appContext, WorkerParameters params, u repository, x resultProcessor, l usageStatsRepository, MonitoringWorkScheduler monitoringWorkScheduler, InterfaceC0338b notificationDispatcher, S2.b remoteDataSource) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        i.e(repository, "repository");
        i.e(resultProcessor, "resultProcessor");
        i.e(usageStatsRepository, "usageStatsRepository");
        i.e(monitoringWorkScheduler, "monitoringWorkScheduler");
        i.e(notificationDispatcher, "notificationDispatcher");
        i.e(remoteDataSource, "remoteDataSource");
        this.appContext = appContext;
        this.repository = repository;
        this.resultProcessor = resultProcessor;
        this.usageStatsRepository = usageStatsRepository;
        this.monitoringWorkScheduler = monitoringWorkScheduler;
        this.notificationDispatcher = notificationDispatcher;
        this.remoteDataSource = remoteDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0118 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object captureHourlySnapshotsIfNeeded(V2.n r17, long r18, long r20, O3.d r22) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.worker.UsageMonitoringWorker.captureHourlySnapshotsIfNeeded(V2.n, long, long, O3.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[Catch: Exception -> 0x00e6, TryCatch #3 {Exception -> 0x00e6, blocks: (B:56:0x0137, B:51:0x0106, B:52:0x010d, B:37:0x00bf, B:39:0x00c7, B:40:0x00cd, B:42:0x00d3, B:47:0x00ec, B:33:0x00b3), top: B:70:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ec A[Catch: Exception -> 0x00e6, TryCatch #3 {Exception -> 0x00e6, blocks: (B:56:0x0137, B:51:0x0106, B:52:0x010d, B:37:0x00bf, B:39:0x00c7, B:40:0x00cd, B:42:0x00d3, B:47:0x00ec, B:33:0x00b3), top: B:70:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0130 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object completeEvaluation(long r24, long r26, V2.n r28, O3.d r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.worker.UsageMonitoringWorker.completeEvaluation(long, long, V2.n, O3.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d7 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ec A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e2 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010c A[PHI: r1 r3
  0x010c: PHI (r1v10 V2.n) = (r1v8 V2.n), (r1v17 V2.n) binds: [B:58:0x010e, B:55:0x0108] A[DONT_GENERATE, DONT_INLINE]
  0x010c: PHI (r3v6 com.niyaz.zario.worker.UsageMonitoringWorker) = (r3v2 com.niyaz.zario.worker.UsageMonitoringWorker), (r3v8 com.niyaz.zario.worker.UsageMonitoringWorker) binds: [B:58:0x010e, B:55:0x0108] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0179 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c4 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0206 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:113:0x02b6, B:18:0x004a, B:110:0x026c, B:21:0x005f, B:82:0x01b0, B:83:0x01be, B:85:0x01c4, B:87:0x01d0, B:90:0x01e2, B:92:0x01ef, B:97:0x0206, B:24:0x0079, B:79:0x018f, B:27:0x008c, B:74:0x0171, B:76:0x0179, B:30:0x009f, B:70:0x014c, B:31:0x00ab, B:32:0x00b0, B:121:0x02e8, B:123:0x02ec, B:124:0x02f0, B:35:0x00bd, B:54:0x0106, B:59:0x0110, B:61:0x0114, B:63:0x0124, B:66:0x012e, B:114:0x02bc, B:118:0x02d7, B:38:0x00c5, B:44:0x00de, B:46:0x00e2, B:48:0x00ec, B:50:0x00f0, B:41:0x00cc), top: B:128:0x0025 }] */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(O3.d r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 794
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.worker.UsageMonitoringWorker.doWork(O3.d):java.lang.Object");
    }
}

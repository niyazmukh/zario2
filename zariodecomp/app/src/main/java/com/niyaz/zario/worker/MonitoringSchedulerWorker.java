package com.niyaz.zario.worker;

import O3.d;
import Q3.c;
import S2.u;
import U2.l;
import android.content.Context;
import androidx.hilt.work.HiltWorker;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@HiltWorker
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker.smali */
public final class MonitoringSchedulerWorker extends CoroutineWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "MonitoringSchedulerWorker";
    private static final int USAGE_FAILURE_BACKOFF_THRESHOLD = 3;
    public static final String WORK_NAME = "usage_monitoring_scheduler";
    private final MonitoringWorkScheduler monitoringWorkScheduler;
    private final u repository;
    private final l usageStatsRepository;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker$Companion.smali */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.MonitoringSchedulerWorker", f = "MonitoringSchedulerWorker.kt", l = {90, 101, 106}, m = "calculateAdaptiveInterval")
    /* renamed from: com.niyaz.zario.worker.MonitoringSchedulerWorker$calculateAdaptiveInterval$1, reason: invalid class name */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker$calculateAdaptiveInterval$1.smali */
    public static final class AnonymousClass1 extends c {
        float F$0;
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
            return MonitoringSchedulerWorker.this.calculateAdaptiveInterval(this);
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.MonitoringSchedulerWorker", f = "MonitoringSchedulerWorker.kt", l = {37, 46, 48, 58, 61, 73}, m = "doWork")
    /* renamed from: com.niyaz.zario.worker.MonitoringSchedulerWorker$doWork$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\MonitoringSchedulerWorker$doWork$1.smali */
    public static final class C04321 extends c {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C04321(d dVar) {
            super(dVar);
        }

        @Override // Q3.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return MonitoringSchedulerWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonitoringSchedulerWorker(Context appContext, WorkerParameters params, u repository, l usageStatsRepository, MonitoringWorkScheduler monitoringWorkScheduler) {
        super(appContext, params);
        i.e(appContext, "appContext");
        i.e(params, "params");
        i.e(repository, "repository");
        i.e(usageStatsRepository, "usageStatsRepository");
        i.e(monitoringWorkScheduler, "monitoringWorkScheduler");
        this.repository = repository;
        this.usageStatsRepository = usageStatsRepository;
        this.monitoringWorkScheduler = monitoringWorkScheduler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object calculateAdaptiveInterval(O3.d r15) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.worker.MonitoringSchedulerWorker.calculateAdaptiveInterval(O3.d):java.lang.Object");
    }

    private final void scheduleSelf(long j5) {
        this.monitoringWorkScheduler.enqueueScheduler(j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x008c A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:67:0x0166, B:18:0x0040, B:59:0x0111, B:61:0x0119, B:63:0x0123, B:21:0x0049, B:56:0x0101, B:24:0x0058, B:46:0x00c8, B:49:0x00d2, B:51:0x00da, B:53:0x00f1, B:27:0x0066, B:43:0x00b4, B:30:0x006e, B:36:0x0088, B:38:0x008c, B:40:0x00a0, B:33:0x0075), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a0 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:67:0x0166, B:18:0x0040, B:59:0x0111, B:61:0x0119, B:63:0x0123, B:21:0x0049, B:56:0x0101, B:24:0x0058, B:46:0x00c8, B:49:0x00d2, B:51:0x00da, B:53:0x00f1, B:27:0x0066, B:43:0x00b4, B:30:0x006e, B:36:0x0088, B:38:0x008c, B:40:0x00a0, B:33:0x0075), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0110 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0119 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:67:0x0166, B:18:0x0040, B:59:0x0111, B:61:0x0119, B:63:0x0123, B:21:0x0049, B:56:0x0101, B:24:0x0058, B:46:0x00c8, B:49:0x00d2, B:51:0x00da, B:53:0x00f1, B:27:0x0066, B:43:0x00b4, B:30:0x006e, B:36:0x0088, B:38:0x008c, B:40:0x00a0, B:33:0x0075), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0123 A[Catch: Exception -> 0x0039, TryCatch #0 {Exception -> 0x0039, blocks: (B:13:0x0034, B:67:0x0166, B:18:0x0040, B:59:0x0111, B:61:0x0119, B:63:0x0123, B:21:0x0049, B:56:0x0101, B:24:0x0058, B:46:0x00c8, B:49:0x00d2, B:51:0x00da, B:53:0x00f1, B:27:0x0066, B:43:0x00b4, B:30:0x006e, B:36:0x0088, B:38:0x008c, B:40:0x00a0, B:33:0x0075), top: B:71:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(O3.d r13) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.niyaz.zario.worker.MonitoringSchedulerWorker.doWork(O3.d):java.lang.Object");
    }
}

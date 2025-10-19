package com.niyaz.zario.worker;

import E2.n;
import J0.B;
import J0.C;
import K0.r;
import K3.k;
import O3.d;
import Q3.j;
import S0.q;
import S0.t;
import T0.g;
import X3.p;
import a.AbstractC0183a;
import android.content.Context;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.F;
import androidx.lifecycle.H;
import androidx.work.impl.WorkDatabase_Impl;
import com.niyaz.zario.worker.WorkProgressRepository;
import com.niyaz.zario.worker.WorkProgressUpdate;
import dagger.hilt.android.qualifiers.ApplicationContext;
import h4.u;
import h4.v;
import i4.C0608c;
import i4.InterfaceC0612g;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n.C0761f;
import t.h;
import u0.C0955C;
import u0.C0957E;
import u0.s;
import u0.x;

@Singleton
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressRepository.smali */
public final class WorkProgressRepository {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "WorkProgressRepository";
    private final Context context;
    private final C workManager;

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressRepository$Companion.smali */
    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    @Q3.e(c = "com.niyaz.zario.worker.WorkProgressRepository$observeWorkProgress$1", f = "WorkProgressRepository.kt", l = {73}, m = "invokeSuspend")
    /* renamed from: com.niyaz.zario.worker.WorkProgressRepository$observeWorkProgress$1, reason: invalid class name */
    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressRepository$observeWorkProgress$1.smali */
    public static final class AnonymousClass1 extends j implements p {
        final /* synthetic */ boolean $emitRunning;
        final /* synthetic */ String $uniqueWorkName;
        private /* synthetic */ Object L$0;
        int label;

        /* renamed from: com.niyaz.zario.worker.WorkProgressRepository$observeWorkProgress$1$WhenMappings */
        /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\niyaz\zario\worker\WorkProgressRepository$observeWorkProgress$1$WhenMappings.smali */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[h.d(6).length];
                try {
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[2] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[3] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[5] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z4, d dVar) {
            super(2, dVar);
            this.$uniqueWorkName = str;
            this.$emitRunning = z4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$1(String str, boolean z4, v vVar, List list) {
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    B b5 = (B) it.next();
                    int iC = h.c(b5.f2014b);
                    if (iC != 1) {
                        if (iC == 2) {
                            ((u) vVar).f7825d.c(new WorkProgressUpdate.Succeeded(b5.f2016d));
                        } else if (iC == 3) {
                            ((u) vVar).f7825d.c(WorkProgressUpdate.Failed.INSTANCE);
                        } else if (iC == 5) {
                            ((u) vVar).f7825d.c(WorkProgressUpdate.Cancelled.INSTANCE);
                        }
                    } else if (z4) {
                        ((u) vVar).c(new WorkProgressUpdate.Running(b5.f2017e));
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final k invokeSuspend$lambda$2(D d5, H h, String str) {
            d5.i(h);
            return k.f2288a;
        }

        @Override // Q3.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = WorkProgressRepository.this.new AnonymousClass1(this.$uniqueWorkName, this.$emitRunning, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // X3.p
        public final Object invoke(v vVar, d dVar) {
            return ((AnonymousClass1) create(vVar, dVar)).invokeSuspend(k.f2288a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v4, types: [androidx.lifecycle.H, com.niyaz.zario.worker.a] */
        @Override // Q3.a
        public final Object invokeSuspend(Object obj) {
            P3.a aVar = P3.a.f2678a;
            int i = this.label;
            if (i == 0) {
                AbstractC0183a.m0(obj);
                final v vVar = (v) this.L$0;
                C c5 = WorkProgressRepository.this.workManager;
                String str = this.$uniqueWorkName;
                r rVar = (r) c5;
                t tVarV = rVar.f2174c.v();
                tVarV.getClass();
                C0955C c0955cK = C0955C.k(1, "SELECT id, state, output, run_attempt_count, generation, required_network_type, requires_charging,requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                if (str == null) {
                    c0955cK.f(1);
                } else {
                    c0955cK.c(1, str);
                }
                WorkDatabase_Impl workDatabase_Impl = tVarV.f2920a;
                S0.r rVar2 = new S0.r(0, tVarV, c0955cK);
                s sVar = workDatabase_Impl.f10463e;
                sVar.getClass();
                String[] strArrD = sVar.d(new String[]{"WorkTag", "WorkProgress", "workspec", "workname"});
                for (String str2 : strArrD) {
                    LinkedHashMap linkedHashMap = sVar.f10433d;
                    Locale US = Locale.US;
                    i.d(US, "US");
                    String lowerCase = str2.toLowerCase(US);
                    i.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    if (!linkedHashMap.containsKey(lowerCase)) {
                        throw new IllegalArgumentException("There is no table with name ".concat(str2).toString());
                    }
                }
                S0.e eVar = sVar.f10437j;
                eVar.getClass();
                C0957E c0957e = new C0957E((x) eVar.f2851a, eVar, rVar2, strArrD);
                n nVar = q.f2894y;
                Object obj2 = new Object();
                final F f2 = new F();
                C0761f c0761f = new C0761f();
                f2.f4588l = c0761f;
                g gVar = new g(rVar.f2175d, obj2, nVar, f2);
                E e5 = new E(c0957e, gVar);
                E e6 = (E) c0761f.g(c0957e, e5);
                if (e6 != null && e6.f4586b != gVar) {
                    throw new IllegalArgumentException("This source was already added with the different observer");
                }
                if (e6 == null && f2.f4579c > 0) {
                    c0957e.e(e5);
                }
                final String str3 = this.$uniqueWorkName;
                final boolean z4 = this.$emitRunning;
                final ?? r42 = new H() { // from class: com.niyaz.zario.worker.a
                    @Override // androidx.lifecycle.H
                    public final void a(Object obj3) {
                        WorkProgressRepository.AnonymousClass1.invokeSuspend$lambda$1(str3, z4, vVar, (List) obj3);
                    }
                };
                f2.e(r42);
                final String str4 = this.$uniqueWorkName;
                X3.a aVar2 = new X3.a() { // from class: com.niyaz.zario.worker.b
                    @Override // X3.a
                    public final Object invoke() {
                        return WorkProgressRepository.AnonymousClass1.invokeSuspend$lambda$2(f2, r42, str4);
                    }
                };
                this.label = 1;
                if (p1.b.e(vVar, aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0183a.m0(obj);
            }
            return k.f2288a;
        }
    }

    @Inject
    public WorkProgressRepository(@ApplicationContext Context context) {
        i.e(context, "context");
        this.context = context;
        r rVarB = r.b(context);
        i.d(rVarB, "getInstance(...)");
        this.workManager = rVarB;
    }

    public final InterfaceC0612g observeWorkProgress(String uniqueWorkName) {
        i.e(uniqueWorkName, "uniqueWorkName");
        return new C0608c(new AnonymousClass1(uniqueWorkName, false, null), O3.j.f2661a, -2, h4.a.f7766a);
    }
}

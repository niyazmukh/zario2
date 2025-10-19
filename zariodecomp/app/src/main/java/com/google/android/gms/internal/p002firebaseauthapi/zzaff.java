package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC0350l;
import com.google.android.gms.common.api.internal.InterfaceC0351m;
import com.google.android.gms.common.internal.C;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l2.f;
import o2.AbstractC0799c;
import o2.o;
import o2.w;
import p2.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaff.smali */
abstract class zzaff<ResultT, CallbackT> implements zzafq<ResultT> {
    protected final int zza;
    protected f zzc;
    protected o zzd;
    protected CallbackT zze;
    protected i zzf;
    protected zzafg<ResultT> zzg;
    protected Executor zzi;
    protected zzahv zzj;
    protected zzahk zzk;
    protected zzagv zzl;
    protected zzaif zzm;
    protected AbstractC0799c zzn;
    protected String zzo;
    protected String zzp;
    protected zzaas zzq;
    protected zzahs zzr;
    protected zzahr zzs;
    protected zzair zzt;
    boolean zzu;
    protected final zzafh zzb = new zzafh(this);
    protected final List<w> zzh = new ArrayList();

    /* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaff$zza.smali */
    public static class zza extends AbstractC0350l {
        private final List<w> zza;

        private zza(InterfaceC0351m interfaceC0351m, List<w> list) {
            super(interfaceC0351m);
            this.mLifecycleFragment.c("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<w> list) {
            InterfaceC0351m fragment = AbstractC0350l.getFragment(activity);
            if (((zza) fragment.d(zza.class, "PhoneAuthActivityStopCallback")) == null) {
                new zza(fragment, list);
            }
        }

        @Override // com.google.android.gms.common.api.internal.AbstractC0350l
        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzaff(int i) {
        this.zza = i;
    }

    public final zzaff<ResultT, CallbackT> zza(CallbackT callbackt) {
        C.g(callbackt, "external callback cannot be null");
        this.zze = callbackt;
        return this;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzu = true;
        this.zzg.zza(resultt, null);
    }

    public final zzaff<ResultT, CallbackT> zza(i iVar) {
        C.g(iVar, "external failure callback cannot be null");
        this.zzf = iVar;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(f fVar) {
        C.g(fVar, "firebaseApp cannot be null");
        this.zzc = fVar;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(o oVar) {
        C.g(oVar, "firebaseUser cannot be null");
        this.zzd = oVar;
        return this;
    }

    public final zzaff<ResultT, CallbackT> zza(w wVar, Activity activity, Executor executor, String str) {
        w wVarZza = zzagb.zza(str, wVar, this);
        synchronized (this.zzh) {
            List<w> list = this.zzh;
            C.f(wVarZza);
            list.add(wVarZza);
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        C.f(executor);
        this.zzi = executor;
        return this;
    }

    public static /* synthetic */ void zza(zzaff zzaffVar) {
        zzaffVar.zzb();
        C.h("no success or failure set on method implementation", zzaffVar.zzu);
    }

    public static /* synthetic */ void zza(zzaff zzaffVar, Status status) {
        i iVar = zzaffVar.zzf;
        if (iVar != null) {
            iVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzu = true;
        this.zzg.zza(null, status);
    }
}

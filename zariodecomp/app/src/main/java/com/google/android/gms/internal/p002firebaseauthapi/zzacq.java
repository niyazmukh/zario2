package com.google.android.gms.internal.p002firebaseauthapi;

import a.AbstractC0183a;
import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import l2.f;
import o2.AbstractC0795A;
import o2.AbstractC0799c;
import o2.C0797a;
import o2.C0800d;
import o2.E;
import o2.o;
import o2.p;
import o2.w;
import o2.x;
import o2.y;
import p2.c;
import p2.e;
import p2.g;
import p2.i;
import p2.j;
import p2.s;
import p2.u;
import p2.z;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzacq.smali */
public final class zzacq extends zzafo {
    public zzacq(f fVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.zza = new zzaeo(fVar, scheduledExecutorService);
        this.zzb = executor;
    }

    public final Task<Void> zza(f fVar, String str, String str2) {
        return zza((zzacp) new zzacp(str, str2).zza(fVar));
    }

    public final Task<Object> zzb(f fVar, String str, String str2) {
        return zza((zzacs) new zzacs(str, str2).zza(fVar));
    }

    public final Task<Object> zzc(f fVar, String str, String str2) {
        return zza((zzacw) new zzacw(str, str2).zza(fVar));
    }

    public final Task<Void> zzd(f fVar, o oVar, String str, s sVar) {
        return zza((zzaeg) new zzaeg(str).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, String str, String str2, String str3) {
        return zza((zzacr) new zzacr(str, str2, str3).zza(fVar));
    }

    public final Task<Void> zzb(f fVar, String str, C0797a c0797a, String str2, String str3) {
        c0797a.f9204m = 6;
        return zza((zzadp) new zzadp(str, c0797a, str2, str3, "sendSignInLinkToEmail").zza(fVar));
    }

    public final Task<z> zzc(f fVar, o oVar, AbstractC0799c abstractC0799c, String str, s sVar) {
        return zza((zzadf) new zzadf(abstractC0799c, str).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<z> zza(f fVar, String str, String str2, String str3, String str4, u uVar) {
        return zza((zzacu) new zzacu(str, str2, str3, str4).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<String> zzd(f fVar, String str, String str2) {
        return zza((zzaek) new zzaek(str, str2).zza(fVar));
    }

    public final Task<Void> zzb(f fVar, o oVar, AbstractC0799c abstractC0799c, String str, s sVar) {
        return zza((zzadg) new zzadg(abstractC0799c, str).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zzc(f fVar, o oVar, String str, s sVar) {
        return zza((zzaed) new zzaed(str).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(o oVar, j jVar) {
        return zza((zzact) new zzact().zza(oVar).zza((zzaff<Void, j>) jVar).zza((i) jVar));
    }

    public final Task<z> zzb(f fVar, o oVar, C0800d c0800d, String str, s sVar) {
        return zza((zzadh) new zzadh(c0800d, str).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, x xVar, o oVar, String str, u uVar) {
        zzagb.zza();
        zzacv zzacvVar = new zzacv(xVar, ((e) oVar).f9328a.zzf(), str, null);
        zzacvVar.zza(fVar).zza((zzaff<Void, u>) uVar);
        return zza(zzacvVar);
    }

    public final Task<z> zzb(f fVar, o oVar, String str, String str2, String str3, String str4, s sVar) {
        return zza((zzadj) new zzadj(str, str2, str3, str4).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, AbstractC0795A abstractC0795A, o oVar, String str, String str2, u uVar) {
        zzacv zzacvVar = new zzacv(abstractC0795A, ((e) oVar).f9328a.zzf(), str, str2);
        zzacvVar.zza(fVar).zza((zzaff<Void, u>) uVar);
        return zza(zzacvVar);
    }

    public final Task<z> zzb(f fVar, o oVar, o2.u uVar, String str, s sVar) {
        zzagb.zza();
        return zza((zzadl) new zzadl(uVar, str).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<z> zza(f fVar, o oVar, x xVar, String str, u uVar) {
        zzagb.zza();
        zzacy zzacyVar = new zzacy(xVar, str, null);
        zzacyVar.zza(fVar).zza((zzaff<z, u>) uVar);
        if (oVar != null) {
            zzacyVar.zza(oVar);
        }
        return zza(zzacyVar);
    }

    public final Task<z> zzb(f fVar, String str, String str2, String str3, String str4, u uVar) {
        return zza((zzadw) new zzadw(str, str2, str3, str4).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<z> zza(f fVar, o oVar, AbstractC0795A abstractC0795A, String str, String str2, u uVar) {
        zzacy zzacyVar = new zzacy(abstractC0795A, str, str2);
        zzacyVar.zza(fVar).zza((zzaff<z, u>) uVar);
        if (oVar != null) {
            zzacyVar.zza(oVar);
        }
        return zza(zzacyVar);
    }

    public final Task<z> zzb(f fVar, o oVar, String str, s sVar) {
        C.f(fVar);
        C.d(str);
        C.f(oVar);
        C.f(sVar);
        ArrayList arrayList = ((e) oVar).f9333f;
        if ((arrayList != null && !arrayList.contains(str)) || oVar.d()) {
            return Tasks.forException(zzaen.zza(new Status(17016, str, null, null)));
        }
        str.getClass();
        if (!str.equals("password")) {
            return zza((zzafq) new zzaee(str).zza(fVar).zza(oVar).zza((zzaff) sVar).zza((i) sVar));
        }
        return zza((zzaeb) new zzaeb().zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(String str, String str2, C0797a c0797a) {
        c0797a.f9204m = 7;
        return zza(new zzaeh(str, str2, c0797a));
    }

    public final Task<Void> zza(f fVar, String str, C0797a c0797a, String str2, String str3) {
        c0797a.f9204m = 1;
        return zza((zzadp) new zzadp(str, c0797a, str2, str3, "sendPasswordResetEmail").zza(fVar));
    }

    public final Task<p> zza(f fVar, o oVar, String str, s sVar) {
        return zza((zzacx) new zzacx(str).zza(fVar).zza(oVar).zza((zzaff<p, u>) sVar).zza((i) sVar));
    }

    public final Task<zzahr> zza() {
        return zza(new zzada());
    }

    public final Task<zzahs> zza(String str, String str2) {
        return zza(new zzacz(str, str2));
    }

    public final Task<z> zza(f fVar, o oVar, AbstractC0799c abstractC0799c, String str, s sVar) {
        C.f(fVar);
        C.f(abstractC0799c);
        C.f(oVar);
        C.f(sVar);
        ArrayList arrayList = ((e) oVar).f9333f;
        if (arrayList != null && arrayList.contains(abstractC0799c.c())) {
            return Tasks.forException(zzaen.zza(new Status(17015, null, null, null)));
        }
        if (abstractC0799c instanceof C0800d) {
            C0800d c0800d = (C0800d) abstractC0799c;
            if (TextUtils.isEmpty(c0800d.f9212c)) {
                return zza((zzadc) new zzadc(c0800d, str).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
            }
            return zza((zzadd) new zzadd(c0800d).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
        }
        if (abstractC0799c instanceof o2.u) {
            zzagb.zza();
            return zza((zzade) new zzade((o2.u) abstractC0799c).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
        }
        return zza((zzadb) new zzadb(abstractC0799c).zza(fVar).zza(oVar).zza((zzaff<z, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, C0800d c0800d, String str, s sVar) {
        return zza((zzadi) new zzadi(c0800d, str).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, String str, String str2, String str3, String str4, s sVar) {
        return zza((zzadk) new zzadk(str, str2, str3, str4).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, o2.u uVar, String str, s sVar) {
        zzagb.zza();
        return zza((zzadm) new zzadm(uVar, str).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, s sVar) {
        return zza((zzado) new zzado().zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(String str, String str2, String str3, String str4) {
        return zza(new zzadn(str, str2, str3, str4));
    }

    public final Task<Void> zza(f fVar, C0797a c0797a, String str) {
        return zza((zzadq) new zzadq(str, c0797a).zza(fVar));
    }

    public final Task<Void> zza(String str) {
        return zza(new zzads(str));
    }

    public final Task<z> zza(f fVar, u uVar, String str) {
        return zza((zzadr) new zzadr(str).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<z> zza(f fVar, AbstractC0799c abstractC0799c, String str, u uVar) {
        return zza((zzadu) new zzadu(abstractC0799c, str).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<z> zza(f fVar, String str, String str2, u uVar) {
        return zza((zzadt) new zzadt(str, str2).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<z> zza(f fVar, C0800d c0800d, String str, u uVar) {
        return zza((zzadv) new zzadv(c0800d, str).zza(fVar).zza((zzaff<z, u>) uVar));
    }

    public final Task<z> zza(f fVar, o2.u uVar, String str, u uVar2) {
        zzagb.zza();
        return zza((zzady) new zzady(uVar, str).zza(fVar).zza((zzaff<z, u>) uVar2));
    }

    public final Task<Void> zza(g gVar, String str, String str2, long j5, boolean z4, boolean z5, String str3, String str4, String str5, boolean z6, w wVar, Executor executor, Activity activity) {
        zzadx zzadxVar = new zzadx(gVar, str, str2, j5, z4, z5, str3, str4, str5, z6);
        zzadxVar.zza(wVar, activity, executor, str);
        return zza(zzadxVar);
    }

    public final Task<zzair> zza(g gVar, String str) {
        return zza(new zzaea(gVar, str));
    }

    public final Task<Void> zza(g gVar, y yVar, String str, long j5, boolean z4, boolean z5, String str2, String str3, String str4, boolean z6, w wVar, Executor executor, Activity activity) {
        String str5 = gVar.f9344b;
        C.d(str5);
        zzadz zzadzVar = new zzadz(yVar, str5, str, j5, z4, z5, str2, str3, str4, z6);
        zzadzVar.zza(wVar, activity, executor, yVar.f9230a);
        return zza(zzadzVar);
    }

    public final Task<Void> zza(f fVar, o oVar, String str, String str2, s sVar) {
        return zza((zzaec) new zzaec(((e) oVar).f9328a.zzf(), str, str2).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, o2.u uVar, s sVar) {
        zzagb.zza();
        return zza((zzaef) new zzaef(uVar).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public final Task<Void> zza(f fVar, o oVar, E e5, s sVar) {
        return zza((zzaei) new zzaei(e5).zza(fVar).zza(oVar).zza((zzaff<Void, u>) sVar).zza((i) sVar));
    }

    public static e zza(f fVar, zzahk zzahkVar) {
        C.f(fVar);
        C.f(zzahkVar);
        ArrayList arrayList = new ArrayList();
        c cVar = new c();
        C.d("firebase");
        String strZzi = zzahkVar.zzi();
        C.d(strZzi);
        cVar.f9320a = strZzi;
        cVar.f9321b = "firebase";
        cVar.f9324e = zzahkVar.zzh();
        cVar.f9322c = zzahkVar.zzg();
        Uri uriZzc = zzahkVar.zzc();
        if (uriZzc != null) {
            cVar.f9323d = uriZzc.toString();
        }
        cVar.f9326k = zzahkVar.zzm();
        cVar.f9327l = null;
        cVar.f9325f = zzahkVar.zzj();
        arrayList.add(cVar);
        List<zzaib> listZzl = zzahkVar.zzl();
        if (listZzl != null && !listZzl.isEmpty()) {
            for (int i = 0; i < listZzl.size(); i++) {
                zzaib zzaibVar = listZzl.get(i);
                c cVar2 = new c();
                C.f(zzaibVar);
                cVar2.f9320a = zzaibVar.zzd();
                String strZzf = zzaibVar.zzf();
                C.d(strZzf);
                cVar2.f9321b = strZzf;
                cVar2.f9322c = zzaibVar.zzb();
                Uri uriZza = zzaibVar.zza();
                if (uriZza != null) {
                    cVar2.f9323d = uriZza.toString();
                }
                cVar2.f9324e = zzaibVar.zzc();
                cVar2.f9325f = zzaibVar.zze();
                cVar2.f9326k = false;
                cVar2.f9327l = zzaibVar.zzg();
                arrayList.add(cVar2);
            }
        }
        e eVar = new e(fVar, arrayList);
        eVar.f9336m = new p2.f(zzahkVar.zzb(), zzahkVar.zza());
        eVar.f9337n = zzahkVar.zzn();
        eVar.f9338o = zzahkVar.zze();
        eVar.f(AbstractC0183a.o0(zzahkVar.zzk()));
        List listZzd = zzahkVar.zzd();
        if (listZzd == null) {
            listZzd = new ArrayList();
        }
        eVar.f9340q = listZzd;
        return eVar;
    }

    public final void zza(f fVar, zzaij zzaijVar, w wVar, Activity activity, Executor executor) {
        zza((zzaej) new zzaej(zzaijVar).zza(fVar).zza(wVar, activity, executor, zzaijVar.zzd()));
    }
}

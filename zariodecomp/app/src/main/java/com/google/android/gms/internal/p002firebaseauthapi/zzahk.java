package com.google.android.gms.internal.p002firebaseauthapi;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C;
import java.util.ArrayList;
import java.util.List;
import o2.G;
import o2.H;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzahk.smali */
public final class zzahk {
    private String zza;
    private String zzb;
    private boolean zzc;
    private String zzd;
    private String zze;
    private zzaia zzf;
    private String zzg;
    private long zzh;
    private long zzi;
    private boolean zzj;
    private H zzk;
    private List<zzahy> zzl;
    private zzah<G> zzm;

    public zzahk() {
        this.zzf = new zzaia();
        this.zzm = zzah.zzg();
    }

    public final long zza() {
        return this.zzh;
    }

    public final long zzb() {
        return this.zzi;
    }

    public final Uri zzc() {
        if (TextUtils.isEmpty(this.zze)) {
            return null;
        }
        return Uri.parse(this.zze);
    }

    public final zzah<G> zzd() {
        return this.zzm;
    }

    public final H zze() {
        return this.zzk;
    }

    public final zzaia zzf() {
        return this.zzf;
    }

    public final String zzg() {
        return this.zzd;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final String zzi() {
        return this.zza;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final List<zzahy> zzk() {
        return this.zzl;
    }

    public final List<zzaib> zzl() {
        return this.zzf.zza();
    }

    public final boolean zzm() {
        return this.zzc;
    }

    public final boolean zzn() {
        return this.zzj;
    }

    public final zzahk zza(H h) {
        this.zzk = h;
        return this;
    }

    public final zzahk zzb(String str) {
        this.zzb = str;
        return this;
    }

    public final zzahk zza(String str) {
        this.zzd = str;
        return this;
    }

    public final zzahk zzc(String str) {
        this.zze = str;
        return this;
    }

    public zzahk(String str, String str2, boolean z4, String str3, String str4, zzaia zzaiaVar, String str5, String str6, long j5, long j6, boolean z5, H h, List<zzahy> list, zzah<G> zzahVar) {
        zzaia zzaiaVar2;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z4;
        this.zzd = str3;
        this.zze = str4;
        if (zzaiaVar == null) {
            zzaiaVar2 = new zzaia();
        } else {
            List<zzaib> listZza = zzaiaVar.zza();
            zzaia zzaiaVar3 = new zzaia();
            if (listZza != null) {
                zzaiaVar3.zza().addAll(listZza);
            }
            zzaiaVar2 = zzaiaVar3;
        }
        this.zzf = zzaiaVar2;
        this.zzg = str6;
        this.zzh = j5;
        this.zzi = j6;
        this.zzj = false;
        this.zzk = null;
        this.zzl = list == null ? new ArrayList<>() : list;
        this.zzm = zzahVar;
    }

    public final zzahk zza(boolean z4) {
        this.zzj = z4;
        return this;
    }

    public final zzahk zza(zzah<G> zzahVar) {
        C.f(zzahVar);
        this.zzm = zzahVar;
        return this;
    }

    public final zzahk zza(List<zzaib> list) {
        C.f(list);
        zzaia zzaiaVar = new zzaia();
        this.zzf = zzaiaVar;
        zzaiaVar.zza().addAll(list);
        return this;
    }
}

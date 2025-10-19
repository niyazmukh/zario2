package com.google.android.gms.internal.auth;

import Y0.d;
import Y0.f;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0342d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth\zzae.smali */
final class zzae extends AbstractC0342d {
    final /* synthetic */ String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(zzal zzalVar, i iVar, o oVar, String str) {
        super(iVar, oVar);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzai(status, null);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0342d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        zzad zzadVar = new zzad(this);
        String str = this.zza;
        d dVar = (d) fVar;
        Parcel parcelZza = dVar.zza();
        zzc.zze(parcelZza, zzadVar);
        parcelZza.writeString(str);
        dVar.zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0343e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzae) obj);
    }
}

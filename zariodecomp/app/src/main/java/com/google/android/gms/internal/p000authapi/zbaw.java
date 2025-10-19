package com.google.android.gms.internal.p000authapi;

import a.AbstractC0183a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import c1.h;
import c1.m;
import c1.r;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0590c;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbaw.smali */
public final class zbaw extends l implements h {
    private static final com.google.android.gms.common.api.h zba;
    private static final a zbb;
    private static final i zbc;
    private final String zbd;

    static {
        com.google.android.gms.common.api.h hVar = new com.google.android.gms.common.api.h();
        zba = hVar;
        zbat zbatVar = new zbat();
        zbb = zbatVar;
        zbc = new i("Auth.Api.Identity.CredentialSaving.API", zbatVar, hVar);
    }

    public zbaw(Activity activity, r rVar) {
        super(activity, activity, zbc, rVar, k.f5649c);
        this.zbd = zbbj.zba();
    }

    public final Status getStatusFromIntent(Intent intent) {
        Status status = Status.f5532k;
        if (intent == null) {
            return status;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC0183a.w(byteArrayExtra, creator));
        return status2 == null ? status : status2;
    }

    public final Task<c1.k> saveAccountLinkingToken(SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) {
        C.f(saveAccountLinkingTokenRequest);
        new ArrayList();
        TextUtils.isEmpty(saveAccountLinkingTokenRequest.f5486e);
        String str = this.zbd;
        PendingIntent pendingIntent = saveAccountLinkingTokenRequest.f5482a;
        C.a("Consent PendingIntent cannot be null", pendingIntent != null);
        String str2 = saveAccountLinkingTokenRequest.f5483b;
        C.a("Invalid tokenType", "auth_code".equals(str2));
        String str3 = saveAccountLinkingTokenRequest.f5484c;
        C.a("serviceId cannot be null or empty", !TextUtils.isEmpty(str3));
        ArrayList arrayList = saveAccountLinkingTokenRequest.f5485d;
        C.a("scopes cannot be null", arrayList != null);
        final SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest2 = new SaveAccountLinkingTokenRequest(pendingIntent, str2, str3, arrayList, str, saveAccountLinkingTokenRequest.f5487f);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbg};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbar
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest3 = saveAccountLinkingTokenRequest2;
                zbau zbauVar = new zbau(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                C.f(saveAccountLinkingTokenRequest3);
                zbadVar.zbc(zbauVar, saveAccountLinkingTokenRequest3);
            }
        };
        hVarA.f1682c = false;
        hVarA.f1681b = 1535;
        return doRead(hVarA.a());
    }

    @Override // c1.h
    public final Task<m> savePassword(c1.l lVar) {
        C.f(lVar);
        final c1.l lVar2 = new c1.l(lVar.f5433a, this.zbd, lVar.f5435c);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbe};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zbas
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zbaw zbawVar = this.zba;
                c1.l lVar3 = lVar2;
                zbav zbavVar = new zbav(zbawVar, (TaskCompletionSource) obj2);
                zbad zbadVar = (zbad) ((zbx) obj).getService();
                C.f(lVar3);
                zbadVar.zbd(zbavVar, lVar3);
            }
        };
        hVarA.f1682c = false;
        hVarA.f1681b = 1536;
        return doRead(hVarA.a());
    }

    public zbaw(Context context, r rVar) {
        super(context, null, zbc, rVar, k.f5649c);
        this.zbd = zbbj.zba();
    }
}

package com.google.android.gms.internal.p000authapi;

import a.AbstractC0183a;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import c1.C0334a;
import c1.q;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0359w;
import com.google.android.gms.common.api.internal.InterfaceC0357t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import h1.C0590c;
import java.util.ArrayList;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\auth-api\zbaq.smali */
public final class zbaq extends l {
    private static final h zba;
    private static final a zbb;
    private static final i zbc;

    static {
        h hVar = new h();
        zba = hVar;
        zbao zbaoVar = new zbao();
        zbb = zbaoVar;
        zbc = new i("Auth.Api.Identity.Authorization.API", zbaoVar, hVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Activity activity, q qVar) {
        i iVar = zbc;
        String str = qVar.a;
        if (str != null) {
            C.d(str);
        }
        String strZba = zbbj.zba();
        C.d(strZba);
        super(activity, activity, iVar, new q(strZba), k.f5649c);
    }

    public final Task<C0334a> authorize(AuthorizationRequest authorizationRequest) {
        String str;
        boolean z4;
        boolean z5;
        boolean z6;
        String str2;
        C.f(authorizationRequest);
        ArrayList arrayList = authorizationRequest.f5474a;
        C.a("requestedScopes cannot be null or empty", (arrayList == null || arrayList.isEmpty()) ? false : true);
        String str3 = null;
        String str4 = authorizationRequest.f5479f;
        if (str4 != null) {
            C.d(str4);
            str = str4;
        } else {
            str = null;
        }
        Account account = authorizationRequest.f5478e;
        Account account2 = account != null ? account : null;
        boolean z7 = authorizationRequest.f5477d;
        String str5 = authorizationRequest.f5475b;
        if (!z7 || str5 == null) {
            z4 = false;
        } else {
            z4 = true;
            str3 = str5;
        }
        if (!authorizationRequest.f5476c || str5 == null) {
            z5 = false;
            z6 = false;
            str2 = str3;
        } else {
            C.a("two different server client ids provided", str3 == null || str3.equals(str5));
            z6 = authorizationRequest.f5481l;
            str2 = str5;
            z5 = true;
        }
        final AuthorizationRequest authorizationRequest2 = new AuthorizationRequest(arrayList, str2, z5, z4, account2, str, getApiOptions().a, z6);
        F1.h hVarA = AbstractC0359w.a();
        hVarA.f1684e = new C0590c[]{zbbi.zbc};
        hVarA.f1683d = new InterfaceC0357t() { // from class: com.google.android.gms.internal.auth-api.zban
            @Override // com.google.android.gms.common.api.internal.InterfaceC0357t
            public final void accept(Object obj, Object obj2) {
                zbaq zbaqVar = this.zba;
                AuthorizationRequest authorizationRequest3 = authorizationRequest2;
                zbap zbapVar = new zbap(zbaqVar, (TaskCompletionSource) obj2);
                zbaa zbaaVar = (zbaa) ((zbw) obj).getService();
                C.f(authorizationRequest3);
                zbaaVar.zbc(zbapVar, authorizationRequest3);
            }
        };
        hVarA.f1682c = false;
        hVarA.f1681b = 1534;
        return doRead(hVarA.a());
    }

    public final C0334a getAuthorizationResultFromIntent(Intent intent) throws j {
        Status status = Status.f5532k;
        if (intent == null) {
            throw new j(status);
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("status");
        Status status2 = (Status) (byteArrayExtra == null ? null : AbstractC0183a.w(byteArrayExtra, creator));
        if (status2 == null) {
            throw new j(Status.f5534m);
        }
        if (!status2.c()) {
            throw new j(status2);
        }
        Parcelable.Creator<C0334a> creator2 = C0334a.CREATOR;
        byte[] byteArrayExtra2 = intent.getByteArrayExtra("authorization_result");
        C0334a c0334a = (C0334a) (byteArrayExtra2 != null ? AbstractC0183a.w(byteArrayExtra2, creator2) : null);
        if (c0334a != null) {
            return c0334a;
        }
        throw new j(status);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zbaq(Context context, q qVar) {
        i iVar = zbc;
        String str = qVar.a;
        if (str != null) {
            C.d(str);
        }
        String strZba = zbbj.zba();
        C.d(strZba);
        super(context, null, iVar, new q(strZba), k.f5649c);
    }
}

package Y0;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.InterfaceC0345g;
import com.google.android.gms.common.api.internal.InterfaceC0355q;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbo;
import com.google.android.gms.internal.p001authapiphone.zzw;
import g1.C0576e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z1.C1066a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Y0\g.smali */
public final class g extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3870a;

    @Override // com.google.android.gms.common.api.a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, m mVar, n nVar) {
        switch (this.f3870a) {
            case 0:
                return new zzam(context, looper, c0370h, mVar, nVar);
            case 1:
                return new zbo(context, looper, c0370h, (Z0.a) obj, mVar, nVar);
            case 2:
                return new C0576e(context, looper, c0370h, (GoogleSignInOptions) obj, mVar, nVar);
            case 3:
            case 4:
            case 5:
            default:
                return super.buildClient(context, looper, c0370h, obj, mVar, nVar);
            case 6:
                c0370h.getClass();
                Integer num = c0370h.f5706g;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new C1066a(context, looper, c0370h, bundle, mVar, nVar);
            case 7:
                B.a.p(obj);
                throw null;
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f3870a) {
            case 2:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.emptyList() : new ArrayList(googleSignInOptions.f5507b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0370h c0370h, Object obj, InterfaceC0345g interfaceC0345g, InterfaceC0355q interfaceC0355q) {
        switch (this.f3870a) {
            case 3:
                return new zzbe(context, looper, c0370h, (Z0.d) obj, interfaceC0345g, interfaceC0355q);
            case 4:
                return new zzw(context, looper, c0370h, interfaceC0345g, interfaceC0355q);
            case 5:
                return new j1.c(context, looper, c0370h, (u) obj, interfaceC0345g, interfaceC0355q);
            default:
                return super.buildClient(context, looper, c0370h, obj, interfaceC0345g, interfaceC0355q);
        }
    }
}

package g1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0373k;
import com.google.android.gms.common.internal.C0370h;
import com.google.android.gms.internal.p000authapi.zbbj;
import f1.C0492b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g1.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\e.smali */
public final class C0576e extends AbstractC0373k {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f7587a;

    public C0576e(Context context, Looper looper, C0370h c0370h, GoogleSignInOptions googleSignInOptions, com.google.android.gms.common.api.m mVar, n nVar) {
        C0492b c0492b;
        super(context, looper, 91, c0370h, mVar, nVar);
        if (googleSignInOptions != null) {
            c0492b = new C0492b();
            c0492b.f6989a = new HashSet();
            c0492b.h = new HashMap();
            c0492b.f6989a = new HashSet(googleSignInOptions.f5507b);
            c0492b.f6990b = googleSignInOptions.f5510e;
            c0492b.f6991c = googleSignInOptions.f5511f;
            c0492b.f6992d = googleSignInOptions.f5509d;
            c0492b.f6993e = googleSignInOptions.f5512k;
            c0492b.f6994f = googleSignInOptions.f5508c;
            c0492b.f6995g = googleSignInOptions.f5513l;
            c0492b.h = GoogleSignInOptions.d(googleSignInOptions.f5514m);
            c0492b.i = googleSignInOptions.f5515n;
        } else {
            c0492b = new C0492b();
            c0492b.f6989a = new HashSet();
            c0492b.h = new HashMap();
        }
        c0492b.i = zbbj.zba();
        Set<Scope> set = c0370h.f5701b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c0492b.f6989a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f5504r;
        HashSet hashSet2 = c0492b.f6989a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f5503q;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (c0492b.f6992d && (c0492b.f6994f == null || !hashSet2.isEmpty())) {
            c0492b.f6989a.add(GoogleSignInOptions.f5502p);
        }
        this.f7587a = new GoogleSignInOptions(3, new ArrayList(hashSet2), c0492b.f6994f, c0492b.f6992d, c0492b.f6990b, c0492b.f6991c, c0492b.f6993e, c0492b.f6995g, c0492b.h, c0492b.i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new k(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final Intent getSignInIntent() {
        Context context = getContext();
        h.f7591a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f7587a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0368f
    public final boolean providesSignIn() {
        return true;
    }
}

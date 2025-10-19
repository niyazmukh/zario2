package l0;

import androidx.lifecycle.H;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import g1.C0575d;

/* renamed from: l0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l0.1\b.smali */
public final class C0727b implements H {

    /* renamed from: a, reason: collision with root package name */
    public final K2.c f8749a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8750b = false;

    public C0727b(C0575d c0575d, K2.c cVar) {
        this.f8749a = cVar;
    }

    @Override // androidx.lifecycle.H
    public final void a(Object obj) {
        K2.c cVar = this.f8749a;
        cVar.getClass();
        SignInHubActivity signInHubActivity = (SignInHubActivity) cVar.b;
        signInHubActivity.setResult(signInHubActivity.f5524E, signInHubActivity.f5525F);
        signInHubActivity.finish();
        this.f8750b = true;
    }

    public final String toString() {
        return this.f8749a.toString();
    }
}

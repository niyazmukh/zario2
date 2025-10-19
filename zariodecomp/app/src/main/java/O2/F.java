package o2;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\F.smali */
public final class F extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f9176f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f9177g;
    public final /* synthetic */ C0800d h;
    public final /* synthetic */ FirebaseAuth i;

    public F(FirebaseAuth firebaseAuth, boolean z4, o oVar, C0800d c0800d) {
        this.f9176f = z4;
        this.f9177g = oVar;
        this.h = c0800d;
        Objects.requireNonNull(firebaseAuth);
        this.i = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [o2.g, p2.s] */
    @Override // p1.b
    public final Task W(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        C0800d c0800d = this.h;
        boolean z4 = this.f9176f;
        FirebaseAuth firebaseAuth = this.i;
        if (!z4) {
            return firebaseAuth.f6372e.zza(firebaseAuth.f6368a, c0800d, str, (p2.u) new C0802f(firebaseAuth));
        }
        zzacq zzacqVar = firebaseAuth.f6372e;
        o oVar = this.f9177g;
        com.google.android.gms.common.internal.C.f(oVar);
        return zzacqVar.zzb(firebaseAuth.f6368a, oVar, c0800d, str, (p2.s) new C0803g(firebaseAuth, 0));
    }
}

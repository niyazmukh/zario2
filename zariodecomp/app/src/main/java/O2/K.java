package o2;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzacq;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\K.smali */
public final class K extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f9192f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f9193g;
    public final /* synthetic */ o h;
    public final /* synthetic */ String i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f9194j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9195k;

    public K(FirebaseAuth firebaseAuth, String str, boolean z4, o oVar, String str2, String str3) {
        this.f9192f = str;
        this.f9193g = z4;
        this.h = oVar;
        this.i = str2;
        this.f9194j = str3;
        Objects.requireNonNull(firebaseAuth);
        this.f9195k = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [o2.g, p2.s] */
    @Override // p1.b
    public final Task W(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        String str2 = this.f9192f;
        if (zIsEmpty) {
            Log.i("FirebaseAuth", "Logging in as " + str2 + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + str2);
        }
        boolean z4 = this.f9193g;
        FirebaseAuth firebaseAuth = this.f9195k;
        if (!z4) {
            return firebaseAuth.f6372e.zzb(firebaseAuth.f6368a, this.f9192f, this.i, this.f9194j, str, new C0802f(firebaseAuth));
        }
        zzacq zzacqVar = firebaseAuth.f6372e;
        o oVar = this.h;
        com.google.android.gms.common.internal.C.f(oVar);
        return zzacqVar.zzb(firebaseAuth.f6368a, oVar, this.f9192f, this.i, this.f9194j, str, new C0803g(firebaseAuth, 0));
    }
}

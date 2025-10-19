package o2;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\I.smali */
public final class I extends p1.b {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f9188f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f9189g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ FirebaseAuth i;

    public I(FirebaseAuth firebaseAuth, String str, String str2) {
        this.f9189g = str;
        this.h = str2;
        Objects.requireNonNull(firebaseAuth);
        this.i = firebaseAuth;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [o2.g, p2.s] */
    @Override // p1.b
    public final Task W(String str) {
        switch (this.f9188f) {
            case 0:
                boolean zIsEmpty = TextUtils.isEmpty(str);
                String str2 = (String) this.f9189g;
                if (zIsEmpty) {
                    Log.i("FirebaseAuth", "Creating user with " + str2 + " with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + str2);
                }
                FirebaseAuth firebaseAuth = this.i;
                return firebaseAuth.f6372e.zza(firebaseAuth.f6368a, (String) this.f9189g, (String) this.h, firebaseAuth.i, str, new C0802f(firebaseAuth));
            default:
                if (TextUtils.isEmpty(str)) {
                    Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
                } else {
                    Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
                }
                p2.d dVar = (p2.d) this.i;
                return dVar.f6372e.zza(dVar.f6368a, (o) this.f9189g, (AbstractC0799c) this.h, str, (p2.s) new C0803g(dVar, 0));
        }
    }

    public I(p2.d dVar, o oVar, C0800d c0800d) {
        this.f9189g = oVar;
        this.h = c0800d;
        this.i = dVar;
    }
}

package o2;

import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: o2.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\f.1.smali */
public final class C0802f implements p2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9216a;

    public C0802f(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.f9216a = firebaseAuth;
    }

    @Override // p2.u
    public final void a(zzahv zzahvVar, o oVar) throws JSONException {
        com.google.android.gms.common.internal.C.f(zzahvVar);
        com.google.android.gms.common.internal.C.f(oVar);
        ((p2.e) oVar).f9328a = zzahvVar;
        FirebaseAuth firebaseAuth = this.f9216a;
        firebaseAuth.getClass();
        FirebaseAuth.e(firebaseAuth, oVar, zzahvVar, true, false);
    }
}

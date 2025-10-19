package o2;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;
import org.json.JSONException;

/* renamed from: o2.g, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o2.1\g.1.smali */
public final class C0803g implements p2.i, p2.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9217a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f9218b;

    public C0803g(FirebaseAuth firebaseAuth, int i) {
        this.f9217a = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(firebaseAuth);
                this.f9218b = firebaseAuth;
                break;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.f9218b = firebaseAuth;
                break;
        }
    }

    @Override // p2.u
    public final void a(zzahv zzahvVar, o oVar) throws JSONException {
        switch (this.f9217a) {
            case 0:
                com.google.android.gms.common.internal.C.f(zzahvVar);
                com.google.android.gms.common.internal.C.f(oVar);
                ((p2.e) oVar).f9328a = zzahvVar;
                FirebaseAuth firebaseAuth = this.f9218b;
                firebaseAuth.getClass();
                FirebaseAuth.e(firebaseAuth, oVar, zzahvVar, true, true);
                break;
            default:
                FirebaseAuth firebaseAuth2 = this.f9218b;
                firebaseAuth2.getClass();
                FirebaseAuth.e(firebaseAuth2, oVar, zzahvVar, true, true);
                break;
        }
    }

    @Override // p2.i
    public final void zza(Status status) {
        switch (this.f9217a) {
            case 0:
                int i = status.f5535a;
                if (i == 17011 || i == 17021 || i == 17005 || i == 17091) {
                    this.f9218b.c();
                    break;
                }
                break;
            default:
                int i5 = status.f5535a;
                if (i5 == 17011 || i5 == 17021 || i5 == 17005) {
                    this.f9218b.c();
                    break;
                }
                break;
        }
    }
}

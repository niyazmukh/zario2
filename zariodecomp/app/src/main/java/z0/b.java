package Z0;

import Y0.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.internal.p000authapi.zbl;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z0\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f3942a;

    /* renamed from: b, reason: collision with root package name */
    public static final i f3943b;

    static {
        h hVar = new h();
        h hVar2 = new h();
        g gVar = new g(1);
        g gVar2 = new g(2);
        i iVar = c.f3944a;
        f3942a = new i("Auth.CREDENTIALS_API", gVar, hVar);
        f3943b = new i("Auth.GOOGLE_SIGN_IN_API", gVar2, hVar2);
        new zbl();
    }
}

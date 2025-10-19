package d1;

import Y0.g;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\d1.1\a.smali */
public abstract class AbstractC0443a extends l {
    private static final h zza;
    private static final com.google.android.gms.common.api.a zzb;
    private static final i zzc;

    static {
        h hVar = new h();
        zza = hVar;
        g gVar = new g(4);
        zzb = gVar;
        zzc = new i("SmsRetriever.API", gVar, hVar);
    }

    public AbstractC0443a(Activity activity) {
        super(activity, activity, zzc, e.i, k.f5649c);
    }

    public AbstractC0443a(Context context) {
        super(context, null, zzc, e.i, k.f5649c);
    }
}

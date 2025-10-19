package j3;

import android.content.Context;
import androidx.lifecycle.f0;
import e3.o;
import i4.C;
import i4.I;
import i4.x;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\l.smali */
public final class l extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f8057a;

    /* renamed from: b, reason: collision with root package name */
    public final o f8058b;

    /* renamed from: c, reason: collision with root package name */
    public final I f8059c;

    /* renamed from: d, reason: collision with root package name */
    public final x f8060d;

    public l(Context context, o sessionRepository) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(sessionRepository, "sessionRepository");
        this.f8057a = context;
        this.f8058b = sessionRepository;
        I iB = C.b(g.f8050a);
        this.f8059c = iB;
        this.f8060d = new x(iB);
    }
}

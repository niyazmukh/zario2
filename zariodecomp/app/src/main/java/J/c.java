package J;

import C2.j;
import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J\c.smali */
public final class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f1992b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f1993c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f1994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1995e;

    public /* synthetic */ c(String str, Context context, j jVar, int i, int i5) {
        this.f1991a = i5;
        this.f1992b = str;
        this.f1993c = context;
        this.f1994d = jVar;
        this.f1995e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f1991a) {
            case 0:
                return f.a(this.f1992b, this.f1993c, this.f1994d, this.f1995e);
            default:
                try {
                    return f.a(this.f1992b, this.f1993c, this.f1994d, this.f1995e);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}

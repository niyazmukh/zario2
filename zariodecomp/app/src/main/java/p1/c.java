package p1;

import android.content.Context;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p1.1\c.smali */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final c f9317b;

    /* renamed from: a, reason: collision with root package name */
    public K2.c f9318a;

    static {
        c cVar = new c();
        cVar.f9318a = null;
        f9317b = cVar;
    }

    public static K2.c a(Context context) {
        K2.c cVar;
        c cVar2 = f9317b;
        synchronized (cVar2) {
            try {
                if (cVar2.f9318a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    cVar2.f9318a = new K2.c(context, 25);
                }
                cVar = cVar2.f9318a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }
}

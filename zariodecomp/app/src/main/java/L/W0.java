package l;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\W0.smali */
public abstract class W0 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f8540a = null;

    public static void a(Context context) {
        if (context.getResources() instanceof X0) {
            return;
        }
        context.getResources();
        int i = h1.f8592a;
    }
}

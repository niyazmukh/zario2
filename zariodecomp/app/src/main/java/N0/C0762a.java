package n0;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import g.HandlerC0528c;
import g0.AbstractActivityC0570w;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\n0.1\a.smali */
public final class C0762a {

    /* renamed from: e, reason: collision with root package name */
    public static final Object f8963e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static C0762a f8964f;

    /* renamed from: a, reason: collision with root package name */
    public final Context f8965a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f8966b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f8967c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f8968d = new ArrayList();

    public C0762a(Context context) {
        this.f8965a = context;
        new HandlerC0528c(this, context.getMainLooper());
    }

    public static C0762a a(AbstractActivityC0570w abstractActivityC0570w) {
        C0762a c0762a;
        synchronized (f8963e) {
            try {
                if (f8964f == null) {
                    f8964f = new C0762a(abstractActivityC0570w.getApplicationContext());
                }
                c0762a = f8964f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0762a;
    }

    public final void b(Intent intent) {
        synchronized (this.f8966b) {
            try {
                intent.getAction();
                String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f8965a.getContentResolver());
                intent.getData();
                String scheme = intent.getScheme();
                intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList arrayList = (ArrayList) this.f8967c.get(intent.getAction());
                if (arrayList != null) {
                    if (z4) {
                        Log.v("LocalBroadcastManager", "Action list: " + arrayList);
                    }
                    if (arrayList.size() > 0) {
                        if (arrayList.get(0) != null) {
                            throw new ClassCastException();
                        }
                        if (!z4) {
                            throw null;
                        }
                        throw null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

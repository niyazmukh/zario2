package e2;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: e2.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e2.1\e.smali */
public final class C0457e {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f6865o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f6866a;

    /* renamed from: b, reason: collision with root package name */
    public final C0477z f6867b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6868c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6872g;
    public final Intent h;
    public final InterfaceC0452D i;

    /* renamed from: m, reason: collision with root package name */
    public ServiceConnectionC0456d f6876m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f6877n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6869d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6870e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f6871f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final C0450B f6874k = new IBinder.DeathRecipient() { // from class: e2.B
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            C0457e c0457e = this.f6854a;
            c0457e.f6867b.b("reportBinderDeath", new Object[0]);
            if (c0457e.f6873j.get() != null) {
                throw new ClassCastException();
            }
            c0457e.f6867b.b("%s : Binder has died.", c0457e.f6868c);
            Iterator it = c0457e.f6869d.iterator();
            while (it.hasNext()) {
                ((AbstractRunnableC0449A) it.next()).a(new RemoteException(String.valueOf(c0457e.f6868c).concat(" : Binder has died.")));
            }
            c0457e.f6869d.clear();
            synchronized (c0457e.f6871f) {
                c0457e.e();
            }
        }
    };

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f6875l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f6873j = new WeakReference(null);

    /* JADX WARN: Type inference failed for: r0v3, types: [e2.B] */
    public C0457e(Context context, C0477z c0477z, String str, Intent intent, InterfaceC0452D interfaceC0452D) {
        this.f6866a = context;
        this.f6867b = c0477z;
        this.f6868c = str;
        this.h = intent;
        this.i = interfaceC0452D;
    }

    public static void b(C0457e c0457e, AbstractRunnableC0449A abstractRunnableC0449A) {
        IInterface iInterface = c0457e.f6877n;
        ArrayList arrayList = c0457e.f6869d;
        C0477z c0477z = c0457e.f6867b;
        if (iInterface != null || c0457e.f6872g) {
            if (!c0457e.f6872g) {
                abstractRunnableC0449A.run();
                return;
            } else {
                c0477z.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(abstractRunnableC0449A);
                return;
            }
        }
        c0477z.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(abstractRunnableC0449A);
        ServiceConnectionC0456d serviceConnectionC0456d = new ServiceConnectionC0456d(c0457e);
        c0457e.f6876m = serviceConnectionC0456d;
        c0457e.f6872g = true;
        if (c0457e.f6866a.bindService(c0457e.h, serviceConnectionC0456d, 1)) {
            return;
        }
        c0477z.b("Failed to bind to the service.", new Object[0]);
        c0457e.f6872g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractRunnableC0449A) it.next()).a(new C0458f("Failed to bind to the service."));
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f6865o;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f6868c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f6868c, 10);
                    handlerThread.start();
                    map.put(this.f6868c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f6868c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final void c(AbstractRunnableC0449A abstractRunnableC0449A, TaskCompletionSource taskCompletionSource) {
        a().post(new C0451C(this, abstractRunnableC0449A.c(), taskCompletionSource, abstractRunnableC0449A));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f6871f) {
            this.f6870e.remove(taskCompletionSource);
        }
        a().post(new C0455c(this, 1));
    }

    public final void e() {
        HashSet hashSet = this.f6870e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f6868c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}

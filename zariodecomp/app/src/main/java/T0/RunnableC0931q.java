package t0;

import N2.AbstractC0156x;
import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import g2.C0580c;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import n.C0757b;
import z0.C1063b;

/* renamed from: t0.q, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\q.1.smali */
public final class RunnableC0931q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10106a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10107b;

    public /* synthetic */ RunnableC0931q(Object obj, int i) {
        this.f10106a = i;
        this.f10107b = obj;
    }

    public M3.i a() throws IOException {
        u0.s sVar = (u0.s) this.f10107b;
        M3.i iVar = new M3.i();
        Cursor cursorM = sVar.f10430a.m(new C0580c("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 1), null);
        while (cursorM.moveToNext()) {
            try {
                iVar.add(Integer.valueOf(cursorM.getInt(0)));
            } finally {
            }
        }
        S0.f.t(cursorM, null);
        M3.i iVarF = AbstractC0156x.f(iVar);
        if (!iVarF.f2526a.isEmpty()) {
            if (((u0.s) this.f10107b).h == null) {
                throw new IllegalStateException("Required value was null.");
            }
            z0.i iVar2 = ((u0.s) this.f10107b).h;
            if (iVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            iVar2.e();
        }
        return iVarF;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Set setA;
        switch (this.f10106a) {
            case 0:
                C0933s c0933s = (C0933s) this.f10107b;
                int i = c0933s.f10115A;
                ValueAnimator valueAnimator = c0933s.f10140z;
                if (i == 1) {
                    valueAnimator.cancel();
                } else if (i != 2) {
                    return;
                }
                c0933s.f10115A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case 1:
                ((StaggeredGridLayoutManager) this.f10107b).z0();
                return;
            default:
                ReentrantReadWriteLock.ReadLock lock = ((u0.s) this.f10107b).f10430a.i.readLock();
                kotlin.jvm.internal.i.d(lock, "readWriteLock.readLock()");
                lock.lock();
                try {
                    try {
                    } catch (SQLiteException e5) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e5);
                        setA = L3.u.f2353a;
                    } catch (IllegalStateException e6) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e6);
                        setA = L3.u.f2353a;
                    }
                    if (((u0.s) this.f10107b).b() && ((u0.s) this.f10107b).f10435f.compareAndSet(true, false) && !((u0.s) this.f10107b).f10430a.g().i().o()) {
                        C1063b c1063bI = ((u0.s) this.f10107b).f10430a.g().i();
                        c1063bI.e();
                        try {
                            setA = a();
                            c1063bI.s();
                            if (setA.isEmpty()) {
                                return;
                            }
                            u0.s sVar = (u0.s) this.f10107b;
                            synchronized (sVar.f10438k) {
                                Iterator it = sVar.f10438k.iterator();
                                while (true) {
                                    C0757b c0757b = (C0757b) it;
                                    if (c0757b.hasNext()) {
                                        ((u0.q) ((Map.Entry) c0757b.next()).getValue()).a(setA);
                                    }
                                }
                            }
                            return;
                        } finally {
                            c1063bI.l();
                        }
                    }
                    return;
                } finally {
                    lock.unlock();
                    ((u0.s) this.f10107b).getClass();
                }
        }
    }
}

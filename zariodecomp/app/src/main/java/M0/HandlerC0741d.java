package m0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import g1.C0575d;
import java.util.concurrent.CountDownLatch;
import l0.C0726a;

/* renamed from: m0.d, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m0.1\d.smali */
public final class HandlerC0741d extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        CountDownLatch countDownLatch;
        C0740c c0740c = (C0740c) message.obj;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            c0740c.f8827a.getClass();
            return;
        }
        RunnableC0738a runnableC0738a = c0740c.f8827a;
        Object obj = c0740c.f8828b[0];
        if (runnableC0738a.f8822d.get()) {
            countDownLatch = runnableC0738a.f8824f;
            try {
                C0575d c0575d = runnableC0738a.f8825k;
                if (c0575d.h == runnableC0738a) {
                    SystemClock.uptimeMillis();
                    c0575d.h = null;
                    c0575d.b();
                }
                countDownLatch.countDown();
            } finally {
                countDownLatch.countDown();
            }
        } else {
            try {
                C0575d c0575d2 = runnableC0738a.f8825k;
                if (c0575d2.f7585g != runnableC0738a) {
                    if (c0575d2.h == runnableC0738a) {
                        SystemClock.uptimeMillis();
                        c0575d2.h = null;
                        c0575d2.b();
                    }
                } else if (!c0575d2.f7581c) {
                    SystemClock.uptimeMillis();
                    c0575d2.f7585g = null;
                    C0726a c0726a = c0575d2.f7579a;
                    if (c0726a != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            c0726a.j(obj);
                        } else {
                            c0726a.h(obj);
                        }
                    }
                }
            } finally {
                countDownLatch = runnableC0738a.f8824f;
            }
        }
        runnableC0738a.f8821c = 3;
    }
}

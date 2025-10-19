package r1;

import android.os.Process;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r1\c.smali */
public final class c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Process.setThreadPriority(19);
        synchronized (this) {
            while (true) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    return;
                }
            }
        }
    }
}

package r0;

import android.view.Choreographer;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r0.1\f.smali */
public abstract class f {
    public static void a(final Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: r0.e
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j5) {
                runnable.run();
            }
        });
    }
}

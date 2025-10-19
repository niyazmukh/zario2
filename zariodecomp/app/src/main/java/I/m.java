package I;

import android.os.Trace;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I\m.smali */
public abstract class m {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}

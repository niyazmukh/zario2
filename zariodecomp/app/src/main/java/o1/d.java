package o1;

import android.os.StrictMode;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o1.1\d.smali */
public abstract class d {
    public static StrictMode.VmPolicy.Builder a(StrictMode.VmPolicy.Builder builder) {
        return builder.permitUnsafeIntentLaunch();
    }
}

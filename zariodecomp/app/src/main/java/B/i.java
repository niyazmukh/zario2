package B;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\i.smali */
public abstract class i {
    public static Executor a(Context context) {
        return context.getMainExecutor();
    }
}

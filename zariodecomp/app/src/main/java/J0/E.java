package J0;

import android.content.Context;
import androidx.work.WorkerParameters;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\E.smali */
public abstract class E {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2023a = t.f("WorkerFactory");

    public abstract s a(Context context, String str, WorkerParameters workerParameters);

    public final s b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f2023a;
        s sVarA = a(context, str, workerParameters);
        if (sVarA == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(s.class);
            } catch (Throwable th) {
                t.d().c(str2, "Invalid class: " + str, th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    sVarA = (s) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    t.d().c(str2, "Could not instantiate " + str, th2);
                }
            }
        }
        if (sVarA == null || !sVarA.isUsed()) {
            return sVarA;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}

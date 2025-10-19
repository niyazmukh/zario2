package F2;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;
import m.ExecutorC0734a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\o.smali */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f1724a = TaskExecutors.MAIN_THREAD;

    /* renamed from: b, reason: collision with root package name */
    public static final ExecutorC0734a f1725b = new ExecutorC0734a(1);

    /* renamed from: c, reason: collision with root package name */
    public static final r f1726c = new r(AsyncTask.THREAD_POOL_EXECUTOR);
}

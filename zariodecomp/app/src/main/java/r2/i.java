package r2;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\r2.1\i.smali */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f9634a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f9635b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ i[] f9636c;

    static {
        i iVar = new i("INSTANCE", 0);
        f9634a = iVar;
        f9636c = new i[]{iVar};
        f9635b = new Handler(Looper.getMainLooper());
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f9636c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f9635b.post(runnable);
    }
}

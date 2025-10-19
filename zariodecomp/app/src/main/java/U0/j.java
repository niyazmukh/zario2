package U0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\j.smali */
public final class j implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final j f3293a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ j[] f3294b;

    static {
        j jVar = new j("INSTANCE", 0);
        f3293a = jVar;
        f3294b = new j[]{jVar};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f3294b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

package J0;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\i.smali */
public final class i implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final i f2052a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ i[] f2053b;

    static {
        i iVar = new i("INSTANCE", 0);
        f2052a = iVar;
        f2053b = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f2053b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        kotlin.jvm.internal.i.e(command, "command");
        command.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

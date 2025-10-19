package k2;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k2.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k2.1\a.smali */
public final class EnumC0658a implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC0658a f8299a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ EnumC0658a[] f8300b;

    static {
        EnumC0658a enumC0658a = new EnumC0658a("INSTANCE", 0);
        f8299a = enumC0658a;
        f8300b = new EnumC0658a[]{enumC0658a};
    }

    public static EnumC0658a valueOf(String str) {
        return (EnumC0658a) Enum.valueOf(EnumC0658a.class, str);
    }

    public static EnumC0658a[] values() {
        return (EnumC0658a[]) f8300b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

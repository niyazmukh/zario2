package m4;

import f4.E;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\m4\j.smali */
public final class j extends i {

    /* renamed from: c, reason: collision with root package name */
    public final Runnable f8935c;

    public j(Runnable runnable, long j5, boolean z4) {
        super(j5, z4);
        this.f8935c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8935c.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.f8935c;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(E.m(runnable));
        sb.append(", ");
        sb.append(this.f8933a);
        sb.append(", ");
        sb.append(this.f8934b ? "Blocking" : "Non-blocking");
        sb.append(']');
        return sb.toString();
    }
}

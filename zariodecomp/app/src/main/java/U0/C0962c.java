package u0;

import K3.k;
import android.os.Looper;
import java.util.Set;
import m.C0735b;

/* renamed from: u0.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\c.1.smali */
public final class C0962c extends p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10393b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10394c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0962c(String[] strArr, Object obj, int i) {
        super(strArr);
        this.f10393b = i;
        this.f10394c = obj;
    }

    @Override // u0.p
    public final void a(Set tables) {
        switch (this.f10393b) {
            case 0:
                ((h4.g) this.f10394c).c(k.f2288a);
                break;
            default:
                kotlin.jvm.internal.i.e(tables, "tables");
                C0735b c0735bQ0 = C0735b.q0();
                RunnableC0956D runnableC0956D = ((C0957E) this.f10394c).f10382u;
                c0735bQ0.f8810a.getClass();
                if (!(Looper.getMainLooper().getThread() == Thread.currentThread())) {
                    c0735bQ0.r0(runnableC0956D);
                    break;
                } else {
                    runnableC0956D.run();
                    break;
                }
        }
    }
}

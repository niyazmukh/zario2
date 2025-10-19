package B3;

import android.view.View;
import androidx.lifecycle.C0242x;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: B3.u0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\u0.1.smali */
public final class RunnableC0083u0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f986a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f987b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f988c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f989d;

    public /* synthetic */ RunnableC0083u0(int i, Object obj, Object obj2, boolean z4) {
        this.f986a = i;
        this.f989d = obj;
        this.f988c = obj2;
        this.f987b = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1.i iVar;
        Object obj = this.f989d;
        Object obj2 = this.f988c;
        switch (this.f986a) {
            case 0:
                ((A0) obj).f366t.c((C0089w0) obj2, this.f987b);
                break;
            case 1:
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) obj;
                V.e eVar = swipeDismissBehavior.f5807a;
                View view = (View) obj2;
                if (eVar != null && eVar.f()) {
                    WeakHashMap weakHashMap = M.S.f2363a;
                    M.B.m(view, this);
                    break;
                } else if (this.f987b && (iVar = swipeDismissBehavior.f5808b) != null) {
                    iVar.x(view);
                    break;
                }
                break;
            default:
                if (!this.f987b) {
                    ((C0242x) obj2).d((androidx.lifecycle.n) obj);
                    this.f987b = true;
                    break;
                }
                break;
        }
    }

    public RunnableC0083u0(C0242x registry, androidx.lifecycle.n event) {
        this.f986a = 2;
        kotlin.jvm.internal.i.e(registry, "registry");
        kotlin.jvm.internal.i.e(event, "event");
        this.f988c = registry;
        this.f989d = event;
    }
}

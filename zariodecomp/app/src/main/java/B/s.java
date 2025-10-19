package b;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b.1\s.smali */
public final class s implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ X3.l f4930a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ X3.l f4931b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ X3.a f4932c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ X3.a f4933d;

    public s(X3.l lVar, X3.l lVar2, X3.a aVar, X3.a aVar2) {
        this.f4930a = lVar;
        this.f4931b = lVar2;
        this.f4932c = aVar;
        this.f4933d = aVar2;
    }

    public final void onBackCancelled() {
        this.f4933d.invoke();
    }

    public final void onBackInvoked() {
        this.f4932c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f4931b.invoke(new C0245b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.i.e(backEvent, "backEvent");
        this.f4930a.invoke(new C0245b(backEvent));
    }
}

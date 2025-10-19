package q0;

import androidx.lifecycle.f0;
import java.lang.ref.WeakReference;

/* renamed from: q0.f, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q0.1\f.smali */
public final class C0842f extends f0 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f9446a;

    @Override // androidx.lifecycle.f0
    public final void onCleared() {
        WeakReference weakReference = this.f9446a;
        if (weakReference == null) {
            kotlin.jvm.internal.i.i("completeTransition");
            throw null;
        }
        X3.a aVar = (X3.a) weakReference.get();
        if (aVar != null) {
            aVar.invoke();
        }
    }
}

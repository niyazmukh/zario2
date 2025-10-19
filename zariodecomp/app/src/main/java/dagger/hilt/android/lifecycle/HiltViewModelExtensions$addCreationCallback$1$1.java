package dagger.hilt.android.lifecycle;

import X3.l;
import androidx.lifecycle.f0;
import kotlin.jvm.internal.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\lifecycle\HiltViewModelExtensions$addCreationCallback$1$1.smali */
public final class HiltViewModelExtensions$addCreationCallback$1$1 extends j implements l {
    final /* synthetic */ l $callback;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HiltViewModelExtensions$addCreationCallback$1$1(l lVar) {
        super(1);
        this.$callback = lVar;
    }

    @Override // X3.l
    public final f0 invoke(Object obj) {
        return (f0) this.$callback.invoke(obj);
    }
}

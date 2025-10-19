package dagger.hilt.android.lifecycle;

import X3.l;
import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import k0.AbstractC0653c;
import k0.C0655e;
import k0.InterfaceC0652b;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\dagger\hilt\android\lifecycle\HiltViewModelExtensions.smali */
public final class HiltViewModelExtensions {
    public static final <VMF> AbstractC0653c addCreationCallback(C0655e c0655e, l callback) {
        i.e(c0655e, "<this>");
        i.e(callback, "callback");
        InterfaceC0652b CREATION_CALLBACK_KEY = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        i.d(CREATION_CALLBACK_KEY, "CREATION_CALLBACK_KEY");
        c0655e.b(CREATION_CALLBACK_KEY, new HiltViewModelExtensions$addCreationCallback$1$1(callback));
        return c0655e;
    }

    public static final <VMF> AbstractC0653c withCreationCallback(AbstractC0653c abstractC0653c, l callback) {
        i.e(abstractC0653c, "<this>");
        i.e(callback, "callback");
        return addCreationCallback(new C0655e(abstractC0653c), callback);
    }
}

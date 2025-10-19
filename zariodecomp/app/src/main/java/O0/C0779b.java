package o0;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: o0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\b.1.smali */
public final class C0779b extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: b, reason: collision with root package name */
    public static final C0779b f9043b = new C0779b(1, 0);

    /* renamed from: c, reason: collision with root package name */
    public static final C0779b f9044c = new C0779b(1, 1);

    /* renamed from: d, reason: collision with root package name */
    public static final C0779b f9045d = new C0779b(1, 2);

    /* renamed from: e, reason: collision with root package name */
    public static final C0779b f9046e = new C0779b(1, 3);

    /* renamed from: f, reason: collision with root package name */
    public static final C0779b f9047f = new C0779b(1, 4);

    /* renamed from: k, reason: collision with root package name */
    public static final C0779b f9048k = new C0779b(1, 5);

    /* renamed from: l, reason: collision with root package name */
    public static final C0779b f9049l = new C0779b(1, 6);

    /* renamed from: m, reason: collision with root package name */
    public static final C0779b f9050m = new C0779b(1, 7);

    /* renamed from: n, reason: collision with root package name */
    public static final C0779b f9051n = new C0779b(1, 8);

    /* renamed from: o, reason: collision with root package name */
    public static final C0779b f9052o = new C0779b(1, 9);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9053a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0779b(int i, int i5) {
        super(i);
        this.f9053a = i5;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f9053a) {
            case 0:
                Context it = (Context) obj;
                kotlin.jvm.internal.i.e(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            case 1:
                Context it2 = (Context) obj;
                kotlin.jvm.internal.i.e(it2, "it");
                if (it2 instanceof ContextWrapper) {
                    return ((ContextWrapper) it2).getBaseContext();
                }
                return null;
            case 2:
                C0770E navOptions = (C0770E) obj;
                kotlin.jvm.internal.i.e(navOptions, "$this$navOptions");
                navOptions.f9015c = true;
                return K3.k.f2288a;
            case 3:
                x destination = (x) obj;
                kotlin.jvm.internal.i.e(destination, "destination");
                z zVar = destination.f9141b;
                if (zVar == null || zVar.f9154p != destination.f9147l) {
                    return null;
                }
                return zVar;
            case 4:
                x destination2 = (x) obj;
                kotlin.jvm.internal.i.e(destination2, "destination");
                z zVar2 = destination2.f9141b;
                if (zVar2 == null || zVar2.f9154p != destination2.f9147l) {
                    return null;
                }
                return zVar2;
            case 5:
                x it3 = (x) obj;
                kotlin.jvm.internal.i.e(it3, "it");
                return it3.f9141b;
            case 6:
                x it4 = (x) obj;
                kotlin.jvm.internal.i.e(it4, "it");
                if (!(it4 instanceof z)) {
                    return null;
                }
                z zVar3 = (z) it4;
                return zVar3.l(zVar3.f9154p, true);
            case 7:
                View it5 = (View) obj;
                kotlin.jvm.internal.i.e(it5, "it");
                Object parent = it5.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 8:
                View it6 = (View) obj;
                kotlin.jvm.internal.i.e(it6, "it");
                Object tag = it6.getTag(2131231068);
                if (tag instanceof WeakReference) {
                    return (C0767B) ((WeakReference) tag).get();
                }
                if (tag instanceof C0767B) {
                    return (C0767B) tag;
                }
                return null;
            default:
                C0770E navOptions2 = (C0770E) obj;
                kotlin.jvm.internal.i.e(navOptions2, "$this$navOptions");
                navOptions2.f9014b = true;
                return K3.k.f2288a;
        }
    }
}

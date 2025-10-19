package M;

import android.text.TextUtils;
import android.view.View;

/* renamed from: M.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\x.1.smali */
public final class C0135x extends AbstractC0137z {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2431e;

    public C0135x(int i, Class cls, int i5, int i6, int i7) {
        this.f2431e = i7;
        this.f2433a = i;
        this.f2436d = cls;
        this.f2435c = i5;
        this.f2434b = i6;
    }

    @Override // M.AbstractC0137z
    public final Object c(View view) {
        switch (this.f2431e) {
            case 0:
                return L.b(view);
            default:
                return Boolean.valueOf(L.c(view));
        }
    }

    @Override // M.AbstractC0137z
    public final void d(View view, Object obj) {
        switch (this.f2431e) {
            case 0:
                L.h(view, (CharSequence) obj);
                break;
            default:
                L.g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // M.AbstractC0137z
    public final boolean g(Object obj, Object obj2) {
        switch (this.f2431e) {
            case 0:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return true ^ ((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }
}

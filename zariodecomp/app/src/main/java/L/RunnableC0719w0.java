package l;

import java.util.WeakHashMap;

/* renamed from: l.w0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l.1\w0.1.smali */
public final class RunnableC0719w0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0725z0 f8709b;

    public /* synthetic */ RunnableC0719w0(C0725z0 c0725z0, int i) {
        this.f8708a = i;
        this.f8709b = c0725z0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0725z0 c0725z0 = this.f8709b;
        switch (this.f8708a) {
            case 0:
                C0703n0 c0703n0 = c0725z0.f8726c;
                if (c0703n0 != null) {
                    c0703n0.setListSelectionHidden(true);
                    c0703n0.requestLayout();
                    break;
                }
                break;
            default:
                C0703n0 c0703n02 = c0725z0.f8726c;
                if (c0703n02 != null) {
                    WeakHashMap weakHashMap = M.S.f2363a;
                    if (M.E.b(c0703n02) && c0725z0.f8726c.getCount() > c0725z0.f8726c.getChildCount() && c0725z0.f8726c.getChildCount() <= c0725z0.f8736q) {
                        c0725z0.f8723D.setInputMethodMode(2);
                        c0725z0.f();
                        break;
                    }
                }
                break;
        }
    }
}

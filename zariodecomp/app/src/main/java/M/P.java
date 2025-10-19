package M;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\P.smali */
public final class P implements OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0131s f2362a;

    public P(InterfaceC0131s interfaceC0131s) {
        this.f2362a = interfaceC0131s;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0122g c0122g = new C0122g(new K2.c(contentInfo));
        C0122g c0122gA = ((Q.s) this.f2362a).a(view, c0122g);
        if (c0122gA == null) {
            return null;
        }
        if (c0122gA == c0122g) {
            return contentInfo;
        }
        ContentInfo contentInfoI = c0122gA.f2389a.i();
        Objects.requireNonNull(contentInfoI);
        return F1.a.h(contentInfoI);
    }
}

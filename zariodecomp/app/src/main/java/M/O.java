package M;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\O.smali */
public abstract class O {
    public static String[] a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0122g b(View view, C0122g c0122g) {
        ContentInfo contentInfoI = c0122g.f2389a.i();
        Objects.requireNonNull(contentInfoI);
        ContentInfo contentInfoH = F1.a.h(contentInfoI);
        ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
        if (contentInfoPerformReceiveContent == null) {
            return null;
        }
        return contentInfoPerformReceiveContent == contentInfoH ? c0122g : new C0122g(new K2.c(contentInfoPerformReceiveContent));
    }

    public static void c(View view, String[] strArr, InterfaceC0131s interfaceC0131s) {
        if (interfaceC0131s == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new P(interfaceC0131s));
        }
    }
}

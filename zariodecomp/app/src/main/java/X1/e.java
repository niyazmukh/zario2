package X1;

import A2.E;
import B3.AbstractC0056k0;
import B3.k2;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.datepicker.InterfaceC0382b;
import com.google.android.material.datepicker.InterfaceC0384d;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p.AbstractC0817a;
import p.C0818b;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\X1\e.smali */
public class e implements E, k2, InterfaceC0384d, k.x {
    public e(View view) {
    }

    public static Path i(float f2, float f3, float f5, float f6) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f5, f6);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x006c A[EDGE_INSN: B:91:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085], EDGE_INSN: B:92:0x006c->B:46:0x006c BREAK  A[LOOP:2: B:47:0x006e->B:58:0x0085, LOOP_LABEL: LOOP:2: B:47:0x006e->B:58:0x0085]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00a2 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean j(e0.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X1.e.j(e0.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override // k.x
    public void a(k.l lVar, boolean z4) {
    }

    @Override // com.google.android.material.datepicker.InterfaceC0384d
    public int b() {
        return 1;
    }

    @Override // com.google.android.material.datepicker.InterfaceC0384d
    public boolean c(List list, long j5) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0382b interfaceC0382b = (InterfaceC0382b) it.next();
            if (interfaceC0382b != null && interfaceC0382b.a(j5)) {
                return true;
            }
        }
        return false;
    }

    @Override // k.x
    public boolean d(k.l lVar) {
        return false;
    }

    @Override // B3.k2
    public Object e() {
        return Executors.newCachedThreadPool(AbstractC0056k0.e("grpc-okhttp-%d"));
    }

    @Override // B3.k2
    public void f(Object obj) {
        ((ExecutorService) ((Executor) obj)).shutdown();
    }

    public boolean g() {
        return this instanceof f;
    }

    public void h(float f2, float f3, float f5, w wVar) {
        wVar.c(f2, 0.0f);
    }

    public void k(S0.c cVar, float f2) {
        C0818b c0818b = (C0818b) ((Drawable) cVar.f2847b);
        AbstractC0817a abstractC0817a = (AbstractC0817a) cVar.f2848c;
        boolean useCompatPadding = abstractC0817a.getUseCompatPadding();
        boolean preventCornerOverlap = abstractC0817a.getPreventCornerOverlap();
        if (f2 != c0818b.f9301e || c0818b.f9302f != useCompatPadding || c0818b.f9303g != preventCornerOverlap) {
            c0818b.f9301e = f2;
            c0818b.f9302f = useCompatPadding;
            c0818b.f9303g = preventCornerOverlap;
            c0818b.b(null);
            c0818b.invalidateSelf();
        }
        if (!abstractC0817a.getUseCompatPadding()) {
            cVar.t(0, 0, 0, 0);
            return;
        }
        C0818b c0818b2 = (C0818b) ((Drawable) cVar.f2847b);
        float f3 = c0818b2.f9301e;
        float f5 = c0818b2.f9297a;
        int iCeil = (int) Math.ceil(p.c.a(f3, f5, abstractC0817a.getPreventCornerOverlap()));
        int iCeil2 = (int) Math.ceil(p.c.b(f3, f5, abstractC0817a.getPreventCornerOverlap()));
        cVar.t(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // A2.E
    public void run() {
    }
}

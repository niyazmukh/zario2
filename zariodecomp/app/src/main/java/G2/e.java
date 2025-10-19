package G2;

import C3.t;
import M.C0133v;
import W.C0160b;
import W.InterfaceC0161c;
import android.os.Build;
import android.view.View;
import com.google.android.gms.common.api.internal.InterfaceC0358u;
import com.google.android.material.datepicker.InterfaceC0382b;
import com.google.android.material.datepicker.InterfaceC0384d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import r0.InterfaceC0858c;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\e.smali */
public final class e implements InterfaceC0161c, InterfaceC0358u, InterfaceC0384d, n4.a, InterfaceC0858c, O3.h {
    public e() {
    }

    public static t a(int i) {
        return new t(new q4.d(), Math.min(1048576, Math.max(4096, i)));
    }

    @Override // com.google.android.material.datepicker.InterfaceC0384d
    public int b() {
        return 2;
    }

    @Override // com.google.android.material.datepicker.InterfaceC0384d
    public boolean c(List list, long j5) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC0382b interfaceC0382b = (InterfaceC0382b) it.next();
            if (interfaceC0382b != null && !interfaceC0382b.a(j5)) {
                return false;
            }
        }
        return true;
    }

    @Override // r0.InterfaceC0858c
    public void f(int i, Serializable serializable) {
    }

    @Override // r0.InterfaceC0858c
    public void h() {
    }

    @Override // W.InterfaceC0161c
    public Object i(C0160b c0160b) throws C0160b {
        throw c0160b;
    }

    public e(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new C0133v(view);
        } else {
            new X1.e(view);
        }
    }
}

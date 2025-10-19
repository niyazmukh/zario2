package M;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M\p0.smali */
public abstract class p0 extends o0 {
    public p0(u0 u0Var, WindowInsets windowInsets) {
        super(u0Var, windowInsets);
    }

    @Override // M.s0
    public u0 a() {
        return u0.f(null, this.f2412c.consumeDisplayCutout());
    }

    @Override // M.s0
    public i e() {
        DisplayCutout displayCutout = this.f2412c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new i(displayCutout);
    }

    @Override // M.s0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return Objects.equals(this.f2412c, p0Var.f2412c) && Objects.equals(this.f2416g, p0Var.f2416g);
    }

    @Override // M.s0
    public int hashCode() {
        return this.f2412c.hashCode();
    }
}

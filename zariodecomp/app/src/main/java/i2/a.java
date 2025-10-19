package I2;

import S0.l;
import com.google.android.gms.common.internal.C;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\I2\a.smali */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f1928a;

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return C.i(this.f1928a, ((a) obj).f1928a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1928a});
    }

    public final String toString() {
        l lVar = new l(this);
        lVar.c(this.f1928a, "token");
        return lVar.toString();
    }
}

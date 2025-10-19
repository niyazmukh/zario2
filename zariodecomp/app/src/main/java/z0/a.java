package Z0;

import S0.v;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z0\a.smali */
public final class a implements e {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3939c;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3941b;

    static {
        v vVar = new v(6);
        vVar.f2935b = Boolean.FALSE;
        f3939c = new a(vVar);
    }

    public a(v vVar) {
        this.f3940a = ((Boolean) vVar.f2935b).booleanValue();
        this.f3941b = (String) vVar.f2936c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return C.i(null, null) && this.f3940a == aVar.f3940a && C.i(this.f3941b, aVar.f3941b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, Boolean.valueOf(this.f3940a), this.f3941b});
    }
}

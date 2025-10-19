package Z0;

import android.os.Bundle;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.C;
import java.util.Arrays;
import java.util.Set;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Z0\d.smali */
public final class d implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final d f3945b = new d(new Bundle());

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f3946a;

    public /* synthetic */ d(Bundle bundle) {
        this.f3946a = bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        Bundle bundle = ((d) obj).f3946a;
        Bundle bundle2 = this.f3946a;
        if (bundle2 == null || bundle == null) {
            if (bundle2 == bundle) {
                return true;
            }
        } else if (bundle2.size() == bundle.size()) {
            Set<String> setKeySet = bundle2.keySet();
            if (setKeySet.containsAll(bundle.keySet())) {
                for (String str : setKeySet) {
                    if (!C.i(bundle2.get(str), bundle.get(str))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3946a});
    }
}

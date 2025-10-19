package A3;

import C3.h;
import android.content.Context;
import android.util.Log;
import z3.AbstractC1096u;
import z3.P;
import z3.Q;
import z3.S;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A3\e.smali */
public final class e extends AbstractC1096u {

    /* renamed from: a, reason: collision with root package name */
    public final Q f276a;

    /* renamed from: b, reason: collision with root package name */
    public Context f277b;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    static {
        try {
            try {
                if (((S) h.class.asSubclass(S.class).getConstructor(null).newInstance(null)).b()) {
                    return;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
            } catch (Exception e5) {
                Log.w("AndroidChannelBuilder", "Failed to construct OkHttpChannelProvider", e5);
            }
        } catch (ClassCastException e6) {
            Log.w("AndroidChannelBuilder", "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider", e6);
        }
    }

    public e(Q q5) {
        this.f276a = q5;
    }

    @Override // z3.AbstractC1095t, z3.Q
    public final P a() {
        return new d(this.f276a.a(), this.f277b);
    }

    @Override // z3.AbstractC1095t
    public final Q d() {
        return this.f276a;
    }
}

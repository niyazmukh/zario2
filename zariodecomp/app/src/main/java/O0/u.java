package o0;

import android.os.Bundle;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\u.smali */
public final class u extends kotlin.jvm.internal.j implements X3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f9116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(int i, Bundle bundle) {
        super(1);
        this.f9115a = i;
        this.f9116b = bundle;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f9115a) {
            case 0:
                String argName = (String) obj;
                kotlin.jvm.internal.i.e(argName, "argName");
                return Boolean.valueOf(!this.f9116b.containsKey(argName));
            default:
                String key = (String) obj;
                kotlin.jvm.internal.i.e(key, "key");
                return Boolean.valueOf(!this.f9116b.containsKey(key));
        }
    }
}

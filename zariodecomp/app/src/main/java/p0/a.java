package P0;

import S0.q;
import android.os.Build;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\P0\a.smali */
public final class a extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2663b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2664c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q0.f tracker, int i) {
        super(tracker);
        this.f2663b = i;
        switch (i) {
            case 2:
                i.e(tracker, "tracker");
                super(tracker);
                this.f2664c = 7;
                break;
            case 3:
                i.e(tracker, "tracker");
                super(tracker);
                this.f2664c = 7;
                break;
            case 4:
                i.e(tracker, "tracker");
                super(tracker);
                this.f2664c = 9;
                break;
            default:
                i.e(tracker, "tracker");
                this.f2664c = 6;
                break;
        }
    }

    @Override // P0.e
    public final int a() {
        switch (this.f2663b) {
        }
        return this.f2664c;
    }

    @Override // P0.e
    public final boolean b(q qVar) {
        switch (this.f2663b) {
            case 0:
                return qVar.f2902j.f2037b;
            case 1:
                return qVar.f2902j.f2039d;
            case 2:
                return qVar.f2902j.f2036a == 2;
            case 3:
                int i = qVar.f2902j.f2036a;
                return i == 3 || (Build.VERSION.SDK_INT >= 30 && i == 6);
            default:
                return qVar.f2902j.f2040e;
        }
    }

    @Override // P0.e
    public final boolean c(Object obj) {
        switch (this.f2663b) {
            case 2:
                O0.d value = (O0.d) obj;
                i.e(value, "value");
                if (!value.f2614a || !value.f2615b) {
                }
                break;
            case 3:
                O0.d value2 = (O0.d) obj;
                i.e(value2, "value");
                if (!value2.f2614a || value2.f2616c) {
                }
                break;
        }
        return !((Boolean) obj).booleanValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Q0.a tracker) {
        super(tracker);
        this.f2663b = 1;
        i.e(tracker, "tracker");
        this.f2664c = 5;
    }
}

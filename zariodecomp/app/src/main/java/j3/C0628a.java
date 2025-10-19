package j3;

import com.niyaz.zario.ui.flexstakes.FlexStakesFragment;

/* renamed from: j3.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j3.1\a.smali */
public final /* synthetic */ class C0628a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlexStakesFragment f8042b;

    public /* synthetic */ C0628a(FlexStakesFragment flexStakesFragment, int i) {
        this.f8041a = i;
        this.f8042b = flexStakesFragment;
    }

    public final void a(Z1.c cVar, float f2) {
        switch (this.f8041a) {
            case 0:
                FlexStakesFragment flexStakesFragment = this.f8042b;
                flexStakesFragment.d0((int) f2);
                flexStakesFragment.b0();
                break;
            default:
                FlexStakesFragment flexStakesFragment2 = this.f8042b;
                flexStakesFragment2.c0((int) f2);
                flexStakesFragment2.b0();
                break;
        }
    }
}

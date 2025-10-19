package S1;

import android.os.SystemClock;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\S1\b.smali */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f2938b;

    public /* synthetic */ b(d dVar, int i) {
        this.f2937a = i;
        this.f2938b = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2937a) {
            case 0:
                d dVar = this.f2938b;
                if (dVar.f2945d > 0) {
                    SystemClock.uptimeMillis();
                }
                dVar.setVisibility(0);
                break;
            default:
                d dVar2 = this.f2938b;
                ((m) dVar2.getCurrentDrawable()).e(false, false, true);
                if ((dVar2.getProgressDrawable() == null || !dVar2.getProgressDrawable().isVisible()) && (dVar2.getIndeterminateDrawable() == null || !dVar2.getIndeterminateDrawable().isVisible())) {
                    dVar2.setVisibility(4);
                }
                dVar2.getClass();
                break;
        }
    }
}

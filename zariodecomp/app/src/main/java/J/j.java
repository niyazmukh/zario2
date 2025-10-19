package j;

import android.view.View;
import l.f1;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\j.1\j.smali */
public final class j extends S0.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f8023b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8024c;

    /* renamed from: d, reason: collision with root package name */
    public int f8025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8026e;

    public j(k kVar) {
        this.f8023b = 0;
        this.f8026e = kVar;
        this.f8024c = false;
        this.f8025d = 0;
    }

    @Override // M.Y
    public final void a() {
        switch (this.f8023b) {
            case 0:
                int i = this.f8025d + 1;
                this.f8025d = i;
                k kVar = (k) this.f8026e;
                if (i == kVar.f8027a.size()) {
                    S0.f fVar = kVar.f8030d;
                    if (fVar != null) {
                        fVar.a();
                    }
                    this.f8025d = 0;
                    this.f8024c = false;
                    kVar.f8031e = false;
                    break;
                }
                break;
            default:
                if (!this.f8024c) {
                    ((f1) this.f8026e).f8574a.setVisibility(this.f8025d);
                    break;
                }
                break;
        }
    }

    @Override // S0.f, M.Y
    public void b(View view) {
        switch (this.f8023b) {
            case 1:
                this.f8024c = true;
                break;
        }
    }

    @Override // S0.f, M.Y
    public final void c() {
        switch (this.f8023b) {
            case 0:
                if (!this.f8024c) {
                    this.f8024c = true;
                    S0.f fVar = ((k) this.f8026e).f8030d;
                    if (fVar != null) {
                        fVar.c();
                        break;
                    }
                }
                break;
            default:
                ((f1) this.f8026e).f8574a.setVisibility(0);
                break;
        }
    }

    public j(f1 f1Var, int i) {
        this.f8023b = 1;
        this.f8026e = f1Var;
        this.f8025d = i;
        this.f8024c = false;
    }
}

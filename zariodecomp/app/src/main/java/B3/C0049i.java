package B3;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: B3.i, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\i.1.smali */
public final class C0049i implements I0 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f825a;

    public C0049i(int i) {
        switch (i) {
            case 1:
                this.f825a = new AtomicLong();
                break;
            default:
                this.f825a = new AtomicLong();
                break;
        }
    }

    @Override // B3.I0
    public void a() {
        this.f825a.getAndAdd(1L);
    }
}

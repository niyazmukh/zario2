package q;

import S1.o;
import java.util.Map;

/* renamed from: q.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\q.1\a.smali */
public final class C0825a extends o {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f9390e;

    public /* synthetic */ C0825a(Object obj, int i) {
        this.f9389d = i;
        this.f9390e = obj;
    }

    @Override // S1.o
    public final void c() {
        switch (this.f9389d) {
            case 0:
                ((b) this.f9390e).clear();
                break;
            default:
                ((C0826c) this.f9390e).clear();
                break;
        }
    }

    @Override // S1.o
    public final Object d(int i, int i5) {
        switch (this.f9389d) {
            case 0:
                return ((b) this.f9390e).f9427b[(i << 1) + i5];
            default:
                return ((C0826c) this.f9390e).f9399b[i];
        }
    }

    @Override // S1.o
    public final Map e() {
        switch (this.f9389d) {
            case 0:
                return (b) this.f9390e;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // S1.o
    public final int f() {
        switch (this.f9389d) {
            case 0:
                return ((b) this.f9390e).f9428c;
            default:
                return ((C0826c) this.f9390e).f9400c;
        }
    }

    @Override // S1.o
    public final int g(Object obj) {
        switch (this.f9389d) {
            case 0:
                return ((b) this.f9390e).e(obj);
            default:
                return ((C0826c) this.f9390e).indexOf(obj);
        }
    }

    @Override // S1.o
    public final int h(Object obj) {
        switch (this.f9389d) {
            case 0:
                return ((b) this.f9390e).g(obj);
            default:
                return ((C0826c) this.f9390e).indexOf(obj);
        }
    }

    @Override // S1.o
    public final void i(Object obj, Object obj2) {
        switch (this.f9389d) {
            case 0:
                ((b) this.f9390e).put(obj, obj2);
                break;
            default:
                ((C0826c) this.f9390e).add(obj);
                break;
        }
    }

    @Override // S1.o
    public final void j(int i) {
        switch (this.f9389d) {
            case 0:
                ((b) this.f9390e).i(i);
                break;
            default:
                ((C0826c) this.f9390e).j(i);
                break;
        }
    }

    @Override // S1.o
    public final Object k(int i, Object obj) {
        switch (this.f9389d) {
            case 0:
                int i5 = (i << 1) + 1;
                Object[] objArr = ((b) this.f9390e).f9427b;
                Object obj2 = objArr[i5];
                objArr[i5] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}

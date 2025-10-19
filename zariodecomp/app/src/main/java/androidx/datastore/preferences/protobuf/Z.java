package androidx.datastore.preferences.protobuf;

import com.google.protobuf.C0427v0;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\Z.smali */
public final class Z implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4470a;

    /* renamed from: b, reason: collision with root package name */
    public int f4471b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4472c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f4474e;

    public /* synthetic */ Z(AbstractMap abstractMap, int i) {
        this.f4470a = i;
        this.f4474e = abstractMap;
    }

    public final Iterator a() {
        switch (this.f4470a) {
            case 0:
                if (this.f4473d == null) {
                    this.f4473d = ((X) this.f4474e).f4463b.entrySet().iterator();
                }
                break;
            default:
                if (this.f4473d == null) {
                    this.f4473d = ((C0427v0) this.f4474e).f6593c.entrySet().iterator();
                }
                break;
        }
        return this.f4473d;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f4470a) {
            case 0:
                int i = this.f4471b + 1;
                X x3 = (X) this.f4474e;
                if (i >= x3.f4462a.size()) {
                    if (x3.f4463b.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
            default:
                int i5 = this.f4471b + 1;
                C0427v0 c0427v0 = (C0427v0) this.f4474e;
                if (i5 >= c0427v0.f6592b.size()) {
                    if (c0427v0.f6593c.isEmpty() || !a().hasNext()) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f4470a) {
            case 0:
                this.f4472c = true;
                int i = this.f4471b + 1;
                this.f4471b = i;
                X x3 = (X) this.f4474e;
                if (i >= x3.f4462a.size()) {
                    break;
                } else {
                    break;
                }
            default:
                this.f4472c = true;
                int i5 = this.f4471b + 1;
                this.f4471b = i5;
                C0427v0 c0427v0 = (C0427v0) this.f4474e;
                if (i5 >= c0427v0.f6592b.size()) {
                    break;
                } else {
                    break;
                }
        }
        return (Map.Entry) a().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        AbstractMap abstractMap = this.f4474e;
        switch (this.f4470a) {
            case 0:
                if (!this.f4472c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4472c = false;
                int i = X.f4461f;
                X x3 = (X) abstractMap;
                x3.b();
                if (this.f4471b >= x3.f4462a.size()) {
                    a().remove();
                    return;
                }
                int i5 = this.f4471b;
                this.f4471b = i5 - 1;
                x3.h(i5);
                return;
            default:
                if (!this.f4472c) {
                    throw new IllegalStateException("remove() was called before next()");
                }
                this.f4472c = false;
                int i6 = C0427v0.f6590k;
                C0427v0 c0427v0 = (C0427v0) abstractMap;
                c0427v0.b();
                if (this.f4471b >= c0427v0.f6592b.size()) {
                    a().remove();
                    return;
                }
                int i7 = this.f4471b;
                this.f4471b = i7 - 1;
                c0427v0.g(i7);
                return;
        }
    }
}

package M3;

import M.AbstractC0137z;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\M3\d.smali */
public final class d extends AbstractC0137z implements Iterator, Y3.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2505e;

    public d(f map, int i) {
        this.f2505e = i;
        kotlin.jvm.internal.i.e(map, "map");
        this.f2436d = map;
        this.f2434b = -1;
        this.f2435c = map.f2516l;
        e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f2505e) {
            case 0:
                b();
                int i = this.f2433a;
                f fVar = (f) this.f2436d;
                if (i >= fVar.f2514f) {
                    throw new NoSuchElementException();
                }
                this.f2433a = i + 1;
                this.f2434b = i;
                e eVar = new e(fVar, i);
                e();
                return eVar;
            case 1:
                b();
                int i5 = this.f2433a;
                f fVar2 = (f) this.f2436d;
                if (i5 >= fVar2.f2514f) {
                    throw new NoSuchElementException();
                }
                this.f2433a = i5 + 1;
                this.f2434b = i5;
                Object obj = fVar2.f2509a[i5];
                e();
                return obj;
            default:
                b();
                int i6 = this.f2433a;
                f fVar3 = (f) this.f2436d;
                if (i6 >= fVar3.f2514f) {
                    throw new NoSuchElementException();
                }
                this.f2433a = i6 + 1;
                this.f2434b = i6;
                Object[] objArr = fVar3.f2510b;
                kotlin.jvm.internal.i.b(objArr);
                Object obj2 = objArr[this.f2434b];
                e();
                return obj2;
        }
    }
}

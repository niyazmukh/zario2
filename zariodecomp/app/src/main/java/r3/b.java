package R3;

import L3.AbstractC0115d;
import java.io.Serializable;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R3\b.smali */
public final class b extends AbstractC0115d implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Enum[] f2841a;

    public b(Enum[] entries) {
        i.e(entries, "entries");
        this.f2841a = entries;
    }

    @Override // L3.AbstractC0115d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return ((Enum) L3.i.w0(element.ordinal(), this.f2841a)) == element;
    }

    @Override // L3.AbstractC0115d
    public final int f() {
        return this.f2841a.length;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.f2841a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(B.a.h("index: ", i, length, ", size: "));
        }
        return enumArr[i];
    }

    @Override // L3.AbstractC0115d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) L3.i.w0(iOrdinal, this.f2841a)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // L3.AbstractC0115d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        i.e(element, "element");
        return indexOf(element);
    }
}

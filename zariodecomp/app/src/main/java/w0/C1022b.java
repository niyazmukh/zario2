package w0;

import java.util.List;
import kotlin.jvm.internal.i;

/* renamed from: w0.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w0.1\b.smali */
public final class C1022b {

    /* renamed from: a, reason: collision with root package name */
    public final String f10880a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10881b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10882c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10883d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10884e;

    public C1022b(String str, String str2, String str3, List columnNames, List referenceColumnNames) {
        i.e(columnNames, "columnNames");
        i.e(referenceColumnNames, "referenceColumnNames");
        this.f10880a = str;
        this.f10881b = str2;
        this.f10882c = str3;
        this.f10883d = columnNames;
        this.f10884e = referenceColumnNames;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1022b)) {
            return false;
        }
        C1022b c1022b = (C1022b) obj;
        if (i.a(this.f10880a, c1022b.f10880a) && i.a(this.f10881b, c1022b.f10881b) && i.a(this.f10882c, c1022b.f10882c) && i.a(this.f10883d, c1022b.f10883d)) {
            return i.a(this.f10884e, c1022b.f10884e);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10884e.hashCode() + ((this.f10883d.hashCode() + B.a.f(B.a.f(this.f10880a.hashCode() * 31, 31, this.f10881b), 31, this.f10882c)) * 31);
    }

    public final String toString() {
        return "ForeignKey{referenceTable='" + this.f10880a + "', onDelete='" + this.f10881b + " +', onUpdate='" + this.f10882c + "', columnNames=" + this.f10883d + ", referenceColumnNames=" + this.f10884e + '}';
    }
}

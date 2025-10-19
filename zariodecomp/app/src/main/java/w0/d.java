package w0;

import e4.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w0.1\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f10889a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f10890b;

    /* renamed from: c, reason: collision with root package name */
    public final List f10891c;

    /* renamed from: d, reason: collision with root package name */
    public final List f10892d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    public d(String str, boolean z4, List columns, List orders) {
        i.e(columns, "columns");
        i.e(orders, "orders");
        this.f10889a = str;
        this.f10890b = z4;
        this.f10891c = columns;
        this.f10892d = orders;
        if (orders.isEmpty()) {
            int size = columns.size();
            orders = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                orders.add("ASC");
            }
        }
        this.f10892d = orders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f10890b != dVar.f10890b || !i.a(this.f10891c, dVar.f10891c) || !i.a(this.f10892d, dVar.f10892d)) {
            return false;
        }
        String str = this.f10889a;
        boolean zX0 = m.x0(str, "index_");
        String str2 = dVar.f10889a;
        return zX0 ? m.x0(str2, "index_") : str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f10889a;
        return this.f10892d.hashCode() + ((this.f10891c.hashCode() + ((((m.x0(str, "index_") ? -1184239155 : str.hashCode()) * 31) + (this.f10890b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Index{name='" + this.f10889a + "', unique=" + this.f10890b + ", columns=" + this.f10891c + ", orders=" + this.f10892d + "'}";
    }
}

package B3;

import java.net.SocketAddress;
import java.util.List;
import z3.C1094s;

/* renamed from: B3.x0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\x0.1.smali */
public final class C0092x0 {

    /* renamed from: a, reason: collision with root package name */
    public List f1017a;

    /* renamed from: b, reason: collision with root package name */
    public int f1018b;

    /* renamed from: c, reason: collision with root package name */
    public int f1019c;

    public SocketAddress a() {
        if (c()) {
            return (SocketAddress) ((C1094s) this.f1017a.get(this.f1018b)).f11399a.get(this.f1019c);
        }
        throw new IllegalStateException("Index is past the end of the address group list");
    }

    public boolean b() {
        if (!c()) {
            return false;
        }
        C1094s c1094s = (C1094s) this.f1017a.get(this.f1018b);
        int i = this.f1019c + 1;
        this.f1019c = i;
        if (i < c1094s.f11399a.size()) {
            return true;
        }
        int i5 = this.f1018b + 1;
        this.f1018b = i5;
        this.f1019c = 0;
        return i5 < this.f1017a.size();
    }

    public boolean c() {
        return this.f1018b < this.f1017a.size();
    }

    public void d() {
        this.f1018b = 0;
        this.f1019c = 0;
    }

    public boolean e(SocketAddress socketAddress) {
        for (int i = 0; i < this.f1017a.size(); i++) {
            int iIndexOf = ((C1094s) this.f1017a.get(i)).f11399a.indexOf(socketAddress);
            if (iIndexOf != -1) {
                this.f1018b = i;
                this.f1019c = iIndexOf;
                return true;
            }
        }
        return false;
    }
}

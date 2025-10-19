package v;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\v.1\f.smali */
public class f implements InterfaceC0975d {

    /* renamed from: d, reason: collision with root package name */
    public final m f10533d;

    /* renamed from: f, reason: collision with root package name */
    public int f10535f;

    /* renamed from: g, reason: collision with root package name */
    public int f10536g;

    /* renamed from: a, reason: collision with root package name */
    public m f10530a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10531b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10532c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f10534e = 1;
    public int h = 1;
    public g i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10537j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f10538k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f10539l = new ArrayList();

    public f(m mVar) {
        this.f10533d = mVar;
    }

    @Override // v.InterfaceC0975d
    public final void a(InterfaceC0975d interfaceC0975d) {
        ArrayList arrayList = this.f10539l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((f) it.next()).f10537j) {
                return;
            }
        }
        this.f10532c = true;
        m mVar = this.f10530a;
        if (mVar != null) {
            mVar.a(this);
        }
        if (this.f10531b) {
            this.f10533d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        f fVar = null;
        int i = 0;
        while (it2.hasNext()) {
            f fVar2 = (f) it2.next();
            if (!(fVar2 instanceof g)) {
                i++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i == 1 && fVar.f10537j) {
            g gVar = this.i;
            if (gVar != null) {
                if (!gVar.f10537j) {
                    return;
                } else {
                    this.f10535f = this.h * gVar.f10536g;
                }
            }
            d(fVar.f10536g + this.f10535f);
        }
        m mVar2 = this.f10530a;
        if (mVar2 != null) {
            mVar2.a(this);
        }
    }

    public final void b(m mVar) {
        this.f10538k.add(mVar);
        if (this.f10537j) {
            mVar.a(mVar);
        }
    }

    public final void c() {
        this.f10539l.clear();
        this.f10538k.clear();
        this.f10537j = false;
        this.f10536g = 0;
        this.f10532c = false;
        this.f10531b = false;
    }

    public void d(int i) {
        if (this.f10537j) {
            return;
        }
        this.f10537j = true;
        this.f10536g = i;
        Iterator it = this.f10538k.iterator();
        while (it.hasNext()) {
            InterfaceC0975d interfaceC0975d = (InterfaceC0975d) it.next();
            interfaceC0975d.a(interfaceC0975d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10533d.f10547b.f10254W);
        sb.append(":");
        switch (this.f10534e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f10537j ? Integer.valueOf(this.f10536g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f10539l.size());
        sb.append(":d=");
        sb.append(this.f10538k.size());
        sb.append(">");
        return sb.toString();
    }
}

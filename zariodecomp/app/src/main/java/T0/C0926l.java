package t0;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;

/* renamed from: t0.l, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\l.1.smali */
public final class C0926l extends AbstractC0906M {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f10050s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10051g;
    public ArrayList h;
    public ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public ArrayList f10052j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f10053k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f10054l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f10055m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f10056n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f10057o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f10058p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f10059q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f10060r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g0) arrayList.get(size)).f10004a.animate().cancel();
        }
    }

    @Override // t0.AbstractC0906M
    public final boolean a(g0 g0Var, g0 g0Var2, M.q qVar, M.q qVar2) {
        int i;
        int i5;
        int i6 = qVar.f2418a;
        int i7 = qVar.f2419b;
        if (g0Var2.p()) {
            int i8 = qVar.f2418a;
            i5 = qVar.f2419b;
            i = i8;
        } else {
            i = qVar2.f2418a;
            i5 = qVar2.f2419b;
        }
        if (g0Var == g0Var2) {
            return g(g0Var, i6, i7, i, i5);
        }
        View view = g0Var.f10004a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(g0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        l(g0Var2);
        float f2 = -((int) ((i - i6) - translationX));
        View view2 = g0Var2.f10004a;
        view2.setTranslationX(f2);
        view2.setTranslationY(-((int) ((i5 - i7) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f10053k;
        C0925j c0925j = new C0925j();
        c0925j.f10035a = g0Var;
        c0925j.f10036b = g0Var2;
        c0925j.f10037c = i6;
        c0925j.f10038d = i7;
        c0925j.f10039e = i;
        c0925j.f10040f = i5;
        arrayList.add(c0925j);
        return true;
    }

    @Override // t0.AbstractC0906M
    public final void d(g0 g0Var) {
        View view = g0Var.f10004a;
        view.animate().cancel();
        ArrayList arrayList = this.f10052j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((k) arrayList.get(size)).a == g0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(g0Var);
                arrayList.remove(size);
            }
        }
        j(this.f10053k, g0Var);
        if (this.h.remove(g0Var)) {
            view.setAlpha(1.0f);
            c(g0Var);
        }
        if (this.i.remove(g0Var)) {
            view.setAlpha(1.0f);
            c(g0Var);
        }
        ArrayList arrayList2 = this.f10056n;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            j(arrayList3, g0Var);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.f10055m;
        for (int size3 = arrayList4.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList5 = (ArrayList) arrayList4.get(size3);
            int size4 = arrayList5.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((k) arrayList5.get(size4)).a == g0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(g0Var);
                    arrayList5.remove(size4);
                    if (arrayList5.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        ArrayList arrayList6 = this.f10054l;
        for (int size5 = arrayList6.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList6.get(size5);
            if (arrayList7.remove(g0Var)) {
                view.setAlpha(1.0f);
                c(g0Var);
                if (arrayList7.isEmpty()) {
                    arrayList6.remove(size5);
                }
            }
        }
        this.f10059q.remove(g0Var);
        this.f10057o.remove(g0Var);
        this.f10060r.remove(g0Var);
        this.f10058p.remove(g0Var);
        i();
    }

    @Override // t0.AbstractC0906M
    public final void e() {
        ArrayList arrayList = this.f10052j;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            k kVar = (k) arrayList.get(size);
            View view = kVar.a.f10004a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(kVar.a);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.h;
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            c((g0) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.i;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            g0 g0Var = (g0) arrayList3.get(size3);
            g0Var.f10004a.setAlpha(1.0f);
            c(g0Var);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.f10053k;
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C0925j c0925j = (C0925j) arrayList4.get(size4);
            g0 g0Var2 = c0925j.f10035a;
            if (g0Var2 != null) {
                k(c0925j, g0Var2);
            }
            g0 g0Var3 = c0925j.f10036b;
            if (g0Var3 != null) {
                k(c0925j, g0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            ArrayList arrayList5 = this.f10055m;
            for (int size5 = arrayList5.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList6 = (ArrayList) arrayList5.get(size5);
                for (int size6 = arrayList6.size() - 1; size6 >= 0; size6--) {
                    k kVar2 = (k) arrayList6.get(size6);
                    View view2 = kVar2.a.f10004a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(kVar2.a);
                    arrayList6.remove(size6);
                    if (arrayList6.isEmpty()) {
                        arrayList5.remove(arrayList6);
                    }
                }
            }
            ArrayList arrayList7 = this.f10054l;
            for (int size7 = arrayList7.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList8 = (ArrayList) arrayList7.get(size7);
                for (int size8 = arrayList8.size() - 1; size8 >= 0; size8--) {
                    g0 g0Var4 = (g0) arrayList8.get(size8);
                    g0Var4.f10004a.setAlpha(1.0f);
                    c(g0Var4);
                    arrayList8.remove(size8);
                    if (arrayList8.isEmpty()) {
                        arrayList7.remove(arrayList8);
                    }
                }
            }
            ArrayList arrayList9 = this.f10056n;
            for (int size9 = arrayList9.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList9.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C0925j c0925j2 = (C0925j) arrayList10.get(size10);
                    g0 g0Var5 = c0925j2.f10035a;
                    if (g0Var5 != null) {
                        k(c0925j2, g0Var5);
                    }
                    g0 g0Var6 = c0925j2.f10036b;
                    if (g0Var6 != null) {
                        k(c0925j2, g0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList9.remove(arrayList10);
                    }
                }
            }
            h(this.f10059q);
            h(this.f10058p);
            h(this.f10057o);
            h(this.f10060r);
            ArrayList arrayList11 = this.f9904b;
            if (arrayList11.size() > 0) {
                B.a.p(arrayList11.get(0));
                throw null;
            }
            arrayList11.clear();
        }
    }

    @Override // t0.AbstractC0906M
    public final boolean f() {
        return (this.i.isEmpty() && this.f10053k.isEmpty() && this.f10052j.isEmpty() && this.h.isEmpty() && this.f10058p.isEmpty() && this.f10059q.isEmpty() && this.f10057o.isEmpty() && this.f10060r.isEmpty() && this.f10055m.isEmpty() && this.f10054l.isEmpty() && this.f10056n.isEmpty()) ? false : true;
    }

    public final boolean g(g0 g0Var, int i, int i5, int i6, int i7) {
        View view = g0Var.f10004a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i5 + ((int) g0Var.f10004a.getTranslationY());
        l(g0Var);
        int i8 = i6 - translationX;
        int i9 = i7 - translationY;
        if (i8 == 0 && i9 == 0) {
            c(g0Var);
            return false;
        }
        if (i8 != 0) {
            view.setTranslationX(-i8);
        }
        if (i9 != 0) {
            view.setTranslationY(-i9);
        }
        ArrayList arrayList = this.f10052j;
        k kVar = new k();
        kVar.a = g0Var;
        kVar.b = translationX;
        kVar.c = translationY;
        kVar.d = i6;
        kVar.e = i7;
        arrayList.add(kVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f9904b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            B.a.p(arrayList.get(0));
            throw null;
        }
    }

    public final void j(ArrayList arrayList, g0 g0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0925j c0925j = (C0925j) arrayList.get(size);
            if (k(c0925j, g0Var) && c0925j.f10035a == null && c0925j.f10036b == null) {
                arrayList.remove(c0925j);
            }
        }
    }

    public final boolean k(C0925j c0925j, g0 g0Var) {
        if (c0925j.f10036b == g0Var) {
            c0925j.f10036b = null;
        } else {
            if (c0925j.f10035a != g0Var) {
                return false;
            }
            c0925j.f10035a = null;
        }
        g0Var.f10004a.setAlpha(1.0f);
        View view = g0Var.f10004a;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        c(g0Var);
        return true;
    }

    public final void l(g0 g0Var) {
        if (f10050s == null) {
            f10050s = new ValueAnimator().getInterpolator();
        }
        g0Var.f10004a.animate().setInterpolator(f10050s);
        d(g0Var);
    }
}

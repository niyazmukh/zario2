package g0;

import N2.n0;
import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g0.1\a.1.smali */
public final class C0549a implements InterfaceC0539G {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7414a;

    /* renamed from: b, reason: collision with root package name */
    public int f7415b;

    /* renamed from: c, reason: collision with root package name */
    public int f7416c;

    /* renamed from: d, reason: collision with root package name */
    public int f7417d;

    /* renamed from: e, reason: collision with root package name */
    public int f7418e;

    /* renamed from: f, reason: collision with root package name */
    public int f7419f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7420g;
    public boolean h;
    public String i;

    /* renamed from: j, reason: collision with root package name */
    public int f7421j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f7422k;

    /* renamed from: l, reason: collision with root package name */
    public int f7423l;

    /* renamed from: m, reason: collision with root package name */
    public CharSequence f7424m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f7425n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f7426o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7427p;

    /* renamed from: q, reason: collision with root package name */
    public final C0542J f7428q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7429r;

    /* renamed from: s, reason: collision with root package name */
    public int f7430s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7431t;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0549a(C0542J c0542j) {
        this();
        c0542j.E();
        C0569v c0569v = c0542j.f7347u;
        if (c0569v != null) {
            c0569v.f7552b.getClassLoader();
        }
        this.f7430s = -1;
        this.f7431t = false;
        this.f7428q = c0542j;
    }

    @Override // g0.InterfaceC0539G
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f7420g) {
            return true;
        }
        C0542J c0542j = this.f7428q;
        if (c0542j.f7332d == null) {
            c0542j.f7332d = new ArrayList();
        }
        c0542j.f7332d.add(this);
        return true;
    }

    public final void b(Q q5) {
        this.f7414a.add(q5);
        q5.f7391d = this.f7415b;
        q5.f7392e = this.f7416c;
        q5.f7393f = this.f7417d;
        q5.f7394g = this.f7418e;
    }

    public final void c(int i) {
        if (this.f7420g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f7414a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                Q q5 = (Q) arrayList.get(i5);
                AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t = q5.f7389b;
                if (abstractComponentCallbacksC0567t != null) {
                    abstractComponentCallbacksC0567t.f7544v += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + q5.f7389b + " to " + q5.f7389b.f7544v);
                    }
                }
            }
        }
    }

    public final int d(boolean z4) {
        if (this.f7429r) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new T());
            f("  ", printWriter, true);
            printWriter.close();
        }
        this.f7429r = true;
        boolean z5 = this.f7420g;
        C0542J c0542j = this.f7428q;
        if (z5) {
            this.f7430s = c0542j.i.getAndIncrement();
        } else {
            this.f7430s = -1;
        }
        c0542j.v(this, z4);
        return this.f7430s;
    }

    public final void e(int i, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, String str, int i5) {
        String str2 = abstractComponentCallbacksC0567t.f7518P;
        if (str2 != null) {
            h0.d.c(abstractComponentCallbacksC0567t, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0567t.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0567t.f7506C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0567t + ": was " + abstractComponentCallbacksC0567t.f7506C + " now " + str);
            }
            abstractComponentCallbacksC0567t.f7506C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0567t + " with tag " + str + " to container view with no id");
            }
            int i6 = abstractComponentCallbacksC0567t.f7504A;
            if (i6 != 0 && i6 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0567t + ": was " + abstractComponentCallbacksC0567t.f7504A + " now " + i);
            }
            abstractComponentCallbacksC0567t.f7504A = i;
            abstractComponentCallbacksC0567t.f7505B = i;
        }
        b(new Q(i5, abstractComponentCallbacksC0567t));
        abstractComponentCallbacksC0567t.f7545w = this.f7428q;
    }

    public final void f(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.i);
            printWriter.print(" mIndex=");
            printWriter.print(this.f7430s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f7429r);
            if (this.f7419f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f7419f));
            }
            if (this.f7415b != 0 || this.f7416c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7415b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7416c));
            }
            if (this.f7417d != 0 || this.f7418e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f7417d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f7418e));
            }
            if (this.f7421j != 0 || this.f7422k != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7421j));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f7422k);
            }
            if (this.f7423l != 0 || this.f7424m != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f7423l));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f7424m);
            }
        }
        ArrayList arrayList = this.f7414a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Q q5 = (Q) arrayList.get(i);
            switch (q5.f7388a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + q5.f7388a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(q5.f7389b);
            if (z4) {
                if (q5.f7391d != 0 || q5.f7392e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(q5.f7391d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(q5.f7392e));
                }
                if (q5.f7393f != 0 || q5.f7394g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(q5.f7393f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(q5.f7394g));
                }
            }
        }
    }

    public final void g(AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t) {
        C0542J c0542j = abstractComponentCallbacksC0567t.f7545w;
        if (c0542j == null || c0542j == this.f7428q) {
            b(new Q(8, abstractComponentCallbacksC0567t));
            return;
        }
        throw new IllegalStateException("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0567t.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f7430s >= 0) {
            sb.append(" #");
            sb.append(this.f7430s);
        }
        if (this.i != null) {
            sb.append(" ");
            sb.append(this.i);
        }
        sb.append("}");
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0549a(C0549a c0549a) {
        this();
        c0549a.f7428q.E();
        C0569v c0569v = c0549a.f7428q.f7347u;
        if (c0569v != null) {
            c0569v.f7552b.getClassLoader();
        }
        Iterator it = c0549a.f7414a.iterator();
        while (it.hasNext()) {
            Q q5 = (Q) it.next();
            ArrayList arrayList = this.f7414a;
            Q q6 = new Q();
            q6.f7388a = q5.f7388a;
            q6.f7389b = q5.f7389b;
            q6.f7390c = q5.f7390c;
            q6.f7391d = q5.f7391d;
            q6.f7392e = q5.f7392e;
            q6.f7393f = q5.f7393f;
            q6.f7394g = q5.f7394g;
            q6.h = q5.h;
            q6.i = q5.i;
            arrayList.add(q6);
        }
        this.f7415b = c0549a.f7415b;
        this.f7416c = c0549a.f7416c;
        this.f7417d = c0549a.f7417d;
        this.f7418e = c0549a.f7418e;
        this.f7419f = c0549a.f7419f;
        this.f7420g = c0549a.f7420g;
        this.h = c0549a.h;
        this.i = c0549a.i;
        this.f7423l = c0549a.f7423l;
        this.f7424m = c0549a.f7424m;
        this.f7421j = c0549a.f7421j;
        this.f7422k = c0549a.f7422k;
        if (c0549a.f7425n != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f7425n = arrayList2;
            arrayList2.addAll(c0549a.f7425n);
        }
        if (c0549a.f7426o != null) {
            ArrayList arrayList3 = new ArrayList();
            this.f7426o = arrayList3;
            arrayList3.addAll(c0549a.f7426o);
        }
        this.f7427p = c0549a.f7427p;
        this.f7430s = -1;
        this.f7431t = false;
        this.f7428q = c0549a.f7428q;
        this.f7429r = c0549a.f7429r;
        this.f7430s = c0549a.f7430s;
        this.f7431t = c0549a.f7431t;
    }

    public C0549a() {
        this.f7414a = new ArrayList();
        this.h = true;
        this.f7427p = false;
    }
}

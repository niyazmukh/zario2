package t0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\g0.smali */
public abstract class g0 {

    /* renamed from: s, reason: collision with root package name */
    public static final List f10003s = Collections.emptyList();

    /* renamed from: a, reason: collision with root package name */
    public final View f10004a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f10005b;

    /* renamed from: j, reason: collision with root package name */
    public int f10011j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f10019r;

    /* renamed from: c, reason: collision with root package name */
    public int f10006c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f10007d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f10008e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f10009f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f10010g = -1;
    public g0 h = null;
    public g0 i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f10012k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f10013l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f10014m = 0;

    /* renamed from: n, reason: collision with root package name */
    public X f10015n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f10016o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f10017p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f10018q = -1;

    public g0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f10004a = view;
    }

    public final void a(int i) {
        this.f10011j = i | this.f10011j;
    }

    public final int b() {
        int i = this.f10010g;
        return i == -1 ? this.f10006c : i;
    }

    public final List c() {
        ArrayList arrayList;
        return ((this.f10011j & 1024) != 0 || (arrayList = this.f10012k) == null || arrayList.size() == 0) ? f10003s : this.f10013l;
    }

    public final boolean d(int i) {
        return (this.f10011j & i) != 0;
    }

    public final boolean e() {
        View view = this.f10004a;
        return (view.getParent() == null || view.getParent() == this.f10019r) ? false : true;
    }

    public final boolean f() {
        return (this.f10011j & 1) != 0;
    }

    public final boolean g() {
        return (this.f10011j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f10011j & 16) == 0) {
            WeakHashMap weakHashMap = M.S.f2363a;
            if (!M.B.i(this.f10004a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i() {
        return (this.f10011j & 8) != 0;
    }

    public final boolean j() {
        return this.f10015n != null;
    }

    public final boolean k() {
        return (this.f10011j & 256) != 0;
    }

    public final boolean l() {
        return (this.f10011j & 2) != 0;
    }

    public final void m(int i, boolean z4) {
        if (this.f10007d == -1) {
            this.f10007d = this.f10006c;
        }
        if (this.f10010g == -1) {
            this.f10010g = this.f10006c;
        }
        if (z4) {
            this.f10010g += i;
        }
        this.f10006c += i;
        View view = this.f10004a;
        if (view.getLayoutParams() != null) {
            ((C0911S) view.getLayoutParams()).f9929c = true;
        }
    }

    public final void n() {
        this.f10011j = 0;
        this.f10006c = -1;
        this.f10007d = -1;
        this.f10008e = -1L;
        this.f10010g = -1;
        this.f10014m = 0;
        this.h = null;
        this.i = null;
        ArrayList arrayList = this.f10012k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f10011j &= -1025;
        this.f10017p = 0;
        this.f10018q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z4) {
        int i = this.f10014m;
        int i5 = z4 ? i - 1 : i + 1;
        this.f10014m = i5;
        if (i5 < 0) {
            this.f10014m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z4 && i5 == 1) {
            this.f10011j |= 16;
        } else if (z4 && i5 == 0) {
            this.f10011j &= -17;
        }
    }

    public final boolean p() {
        return (this.f10011j & 128) != 0;
    }

    public final boolean q() {
        return (this.f10011j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f10006c + " id=" + this.f10008e + ", oldPos=" + this.f10007d + ", pLpos:" + this.f10010g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f10016o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f10011j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f10014m + ")");
        }
        if ((this.f10011j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f10004a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}

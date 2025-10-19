package h2;

import A2.C0020u;
import M.Y;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.util.Arrays;
import z3.C1079c;

/* renamed from: h2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h2.1\b.smali */
public final class C0593b implements Y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7659a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7660b;

    /* renamed from: c, reason: collision with root package name */
    public int f7661c;

    /* renamed from: d, reason: collision with root package name */
    public Object f7662d;

    public /* synthetic */ C0593b() {
        this.f7659a = 0;
    }

    public static int e(int i, int i5) {
        if (i5 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i5) {
            iHighestOneBit = Integer.highestOneBit(i5 - 1) << 1;
        }
        return iHighestOneBit < 0 ? com.google.android.gms.common.api.f.API_PRIORITY_OTHER : iHighestOneBit;
    }

    @Override // M.Y
    public void a() {
        if (this.f7660b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.f7662d;
        actionBarContextView.f4157f = null;
        super/*android.view.View*/.setVisibility(this.f7661c);
    }

    @Override // M.Y
    public void b(View view) {
        this.f7660b = true;
    }

    @Override // M.Y
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.f7660b = false;
    }

    public void d(Object obj) {
        obj.getClass();
        f(this.f7661c + 1);
        Object[] objArr = (Object[]) this.f7662d;
        int i = this.f7661c;
        this.f7661c = i + 1;
        objArr[i] = obj;
    }

    public void f(int i) {
        Object[] objArr = (Object[]) this.f7662d;
        if (objArr.length < i) {
            this.f7662d = Arrays.copyOf(objArr, e(objArr.length, i));
            this.f7660b = false;
        } else if (this.f7660b) {
            this.f7662d = (Object[]) objArr.clone();
            this.f7660b = false;
        }
    }

    public String toString() {
        switch (this.f7659a) {
            case 2:
                C0020u c0020uX = r1.d.X(this);
                c0020uX.a((C1079c) this.f7662d, "callOptions");
                c0020uX.d("previousAttempts", String.valueOf(this.f7661c));
                c0020uX.c("isTransparentRetry", this.f7660b);
                return c0020uX.toString();
            default:
                return super.toString();
        }
    }

    public C0593b(C1079c c1079c, int i, boolean z4) {
        this.f7659a = 2;
        S0.f.l(c1079c, "callOptions");
        this.f7662d = c1079c;
        this.f7661c = i;
        this.f7660b = z4;
    }

    public C0593b(ActionBarContextView actionBarContextView) {
        this.f7659a = 1;
        this.f7662d = actionBarContextView;
        this.f7660b = false;
    }
}

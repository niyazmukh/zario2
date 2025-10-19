package t0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.C0208k;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\t0.1\f0.smali */
public final class f0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f9991a;

    /* renamed from: b, reason: collision with root package name */
    public int f9992b;

    /* renamed from: c, reason: collision with root package name */
    public OverScroller f9993c;

    /* renamed from: d, reason: collision with root package name */
    public Interpolator f9994d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9995e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9996f;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f9997k;

    public f0(RecyclerView recyclerView) {
        this.f9997k = recyclerView;
        V.d dVar = RecyclerView.f4706A0;
        this.f9994d = dVar;
        this.f9995e = false;
        this.f9996f = false;
        this.f9993c = new OverScroller(recyclerView.getContext(), dVar);
    }

    public final void a() {
        if (this.f9995e) {
            this.f9996f = true;
            return;
        }
        RecyclerView recyclerView = this.f9997k;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = M.S.f2363a;
        M.B.m(recyclerView, this);
    }

    public final void b(int i, int i5, int i6, BaseInterpolator baseInterpolator) {
        int iRound;
        RecyclerView recyclerView = this.f9997k;
        if (i6 == Integer.MIN_VALUE) {
            int iAbs = Math.abs(i);
            int iAbs2 = Math.abs(i5);
            boolean z4 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt(0);
            int iSqrt2 = (int) Math.sqrt((i5 * i5) + (i * i));
            int width = z4 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i7 = width / 2;
            float f2 = width;
            float f3 = i7;
            float fSin = (((float) Math.sin((Math.min(1.0f, (iSqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fSin / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z4) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f2) + 1.0f) * 300.0f);
            }
            i6 = Math.min(iRound, 2000);
        }
        int i8 = i6;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f4706A0;
        }
        if (this.f9994d != interpolator) {
            this.f9994d = interpolator;
            this.f9993c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f9992b = 0;
        this.f9991a = 0;
        recyclerView.setScrollState(2);
        this.f9993c.startScroll(0, 0, i, i5, i8);
        a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i5;
        int i6;
        int i7;
        RecyclerView recyclerView = this.f9997k;
        if (recyclerView.f4759q == null) {
            recyclerView.removeCallbacks(this);
            this.f9993c.abortAnimation();
            return;
        }
        this.f9996f = false;
        this.f9995e = true;
        recyclerView.m();
        OverScroller overScroller = this.f9993c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i8 = currX - this.f9991a;
            int i9 = currY - this.f9992b;
            this.f9991a = currX;
            this.f9992b = currY;
            int[] iArr = recyclerView.f4768u0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean zR = recyclerView.r(i8, i9, iArr, null, 1);
            int[] iArr2 = recyclerView.f4768u0;
            if (zR) {
                i8 -= iArr2[0];
                i9 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.l(i8, i9);
            }
            if (recyclerView.f4757p != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.Z(i8, i9, iArr2);
                int i10 = iArr2[0];
                int i11 = iArr2[1];
                int i12 = i8 - i10;
                int i13 = i9 - i11;
                C0895B c0895b = recyclerView.f4759q.f9918e;
                if (c0895b != null && !c0895b.f9878d && c0895b.f9879e) {
                    int iB = recyclerView.f4745i0.b();
                    if (iB == 0) {
                        c0895b.i();
                    } else if (c0895b.f9875a >= iB) {
                        c0895b.f9875a = iB - 1;
                        c0895b.g(i10, i11);
                    } else {
                        c0895b.g(i10, i11);
                    }
                }
                i7 = i10;
                i = i12;
                i5 = i13;
                i6 = i11;
            } else {
                i = i8;
                i5 = i9;
                i6 = 0;
                i7 = 0;
            }
            if (!recyclerView.f4761r.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f4768u0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i14 = i6;
            recyclerView.s(i7, i6, i, i5, null, 1, iArr3);
            int i15 = i - iArr2[0];
            int i16 = i5 - iArr2[1];
            if (i7 != 0 || i14 != 0) {
                recyclerView.t(i7, i14);
            }
            if (!recyclerView.awakenScrollBars()) {
                recyclerView.invalidate();
            }
            boolean z4 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i15 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i16 != 0));
            C0895B c0895b2 = recyclerView.f4759q.f9918e;
            if ((c0895b2 == null || !c0895b2.f9878d) && z4) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i17 = i15 < 0 ? -currVelocity : i15 > 0 ? currVelocity : 0;
                    if (i16 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i16 <= 0) {
                        currVelocity = 0;
                    }
                    if (i17 < 0) {
                        recyclerView.v();
                        if (recyclerView.f4717J.isFinished()) {
                            recyclerView.f4717J.onAbsorb(-i17);
                        }
                    } else if (i17 > 0) {
                        recyclerView.w();
                        if (recyclerView.f4719L.isFinished()) {
                            recyclerView.f4719L.onAbsorb(i17);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.x();
                        if (recyclerView.f4718K.isFinished()) {
                            recyclerView.f4718K.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.u();
                        if (recyclerView.f4720M.isFinished()) {
                            recyclerView.f4720M.onAbsorb(currVelocity);
                        }
                    }
                    if (i17 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = M.S.f2363a;
                        M.B.k(recyclerView);
                    }
                }
                C0208k c0208k = recyclerView.f4744h0;
                int[] iArr4 = (int[]) c0208k.f4522e;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0208k.f4521d = 0;
            } else {
                a();
                RunnableC0935u runnableC0935u = recyclerView.f4743g0;
                if (runnableC0935u != null) {
                    runnableC0935u.a(recyclerView, i7, i14);
                }
            }
        }
        C0895B c0895b3 = recyclerView.f4759q.f9918e;
        if (c0895b3 != null && c0895b3.f9878d) {
            c0895b3.g(0, 0);
        }
        this.f9995e = false;
        if (!this.f9996f) {
            recyclerView.setScrollState(0);
            recyclerView.e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = M.S.f2363a;
            M.B.m(recyclerView, this);
        }
    }
}

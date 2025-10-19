package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.HashMap;
import u.d;
import u.g;
import v.C0973b;
import w.AbstractC1019q;
import w.AbstractC1020r;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\constraintlayout\helper\widget\Flow.smali */
public class Flow extends AbstractC1020r {

    /* renamed from: m, reason: collision with root package name */
    public final g f4318m;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10697a = new int[32];
        this.f10702f = new HashMap();
        this.f10699c = context;
        super.e(attributeSet);
        g gVar = new g();
        gVar.f10328f0 = 0;
        gVar.f10329g0 = 0;
        gVar.f10330h0 = 0;
        gVar.f10331i0 = 0;
        gVar.f10332j0 = 0;
        gVar.f10333k0 = 0;
        gVar.f10334l0 = false;
        gVar.f10335m0 = 0;
        gVar.f10336n0 = 0;
        gVar.f10337o0 = new C0973b();
        gVar.f10338p0 = null;
        gVar.f10339q0 = -1;
        gVar.f10340r0 = -1;
        gVar.f10341s0 = -1;
        gVar.f10342t0 = -1;
        gVar.f10343u0 = -1;
        gVar.f10344v0 = -1;
        gVar.f10345w0 = 0.5f;
        gVar.f10346x0 = 0.5f;
        gVar.f10347y0 = 0.5f;
        gVar.f10348z0 = 0.5f;
        gVar.f10315A0 = 0.5f;
        gVar.f10316B0 = 0.5f;
        gVar.f10317C0 = 0;
        gVar.f10318D0 = 0;
        gVar.E0 = 2;
        gVar.f10319F0 = 2;
        gVar.f10320G0 = 0;
        gVar.f10321H0 = -1;
        gVar.I0 = 0;
        gVar.f10322J0 = new ArrayList();
        gVar.f10323K0 = null;
        gVar.f10324L0 = null;
        gVar.f10325M0 = null;
        gVar.f10327O0 = 0;
        this.f4318m = gVar;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1019q.f10865b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f4318m.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar2 = this.f4318m;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f10328f0 = dimensionPixelSize;
                    gVar2.f10329g0 = dimensionPixelSize;
                    gVar2.f10330h0 = dimensionPixelSize;
                    gVar2.f10331i0 = dimensionPixelSize;
                } else if (index == 11) {
                    g gVar3 = this.f4318m;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar3.f10330h0 = dimensionPixelSize2;
                    gVar3.f10332j0 = dimensionPixelSize2;
                    gVar3.f10333k0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f4318m.f10331i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f4318m.f10332j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f4318m.f10328f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f4318m.f10333k0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f4318m.f10329g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f4318m.f10320G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f4318m.f10339q0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f4318m.f10340r0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f4318m.f10341s0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f4318m.f10343u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f4318m.f10342t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f4318m.f10344v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f4318m.f10345w0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f4318m.f10347y0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f4318m.f10315A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f4318m.f10348z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f4318m.f10316B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f4318m.f10346x0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f4318m.E0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f4318m.f10319F0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f4318m.f10317C0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f4318m.f10318D0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f4318m.f10321H0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f10700d = this.f4318m;
        g();
    }

    @Override // w.AbstractC1006c
    public final void f(d dVar, boolean z4) {
        g gVar = this.f4318m;
        int i = gVar.f10330h0;
        if (i > 0 || gVar.f10331i0 > 0) {
            if (z4) {
                gVar.f10332j0 = gVar.f10331i0;
                gVar.f10333k0 = i;
            } else {
                gVar.f10332j0 = i;
                gVar.f10333k0 = gVar.f10331i0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00d4 A[EDGE_INSN: B:338:0x00d4->B:63:0x00d4 BREAK  A[LOOP:1: B:57:0x00c0->B:62:0x00d0], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010f  */
    /* JADX WARN: Type inference failed for: r35v2 */
    /* JADX WARN: Type inference failed for: r35v5 */
    /* JADX WARN: Type inference failed for: r35v6 */
    /* JADX WARN: Type inference failed for: r35v7 */
    @Override // w.AbstractC1020r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(u.g r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 1528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.Flow.h(u.g, int, int):void");
    }

    @Override // w.AbstractC1006c, android.view.View
    public final void onMeasure(int i, int i5) {
        h(this.f4318m, i, i5);
    }

    public void setFirstHorizontalBias(float f2) {
        this.f4318m.f10347y0 = f2;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f4318m.f10341s0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f2) {
        this.f4318m.f10348z0 = f2;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f4318m.f10342t0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f4318m.E0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f2) {
        this.f4318m.f10345w0 = f2;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f4318m.f10317C0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f4318m.f10339q0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f4318m.f10321H0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f4318m.I0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        g gVar = this.f4318m;
        gVar.f10328f0 = i;
        gVar.f10329g0 = i;
        gVar.f10330h0 = i;
        gVar.f10331i0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f4318m.f10329g0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f4318m.f10332j0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f4318m.f10333k0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f4318m.f10328f0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f4318m.f10319F0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f2) {
        this.f4318m.f10346x0 = f2;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f4318m.f10318D0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f4318m.f10340r0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f4318m.f10320G0 = i;
        requestLayout();
    }
}

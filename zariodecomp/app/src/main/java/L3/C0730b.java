package l3;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.niyaz.zario.databinding.ItemHourlyUsageBinding;
import java.util.ArrayList;
import k3.C0660a;
import kotlin.jvm.internal.i;
import t0.AbstractC0902I;
import t0.g0;

/* renamed from: l3.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\l3.1\b.smali */
public final class C0730b extends AbstractC0902I {

    /* renamed from: c, reason: collision with root package name */
    public final int f8796c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8797d;

    /* renamed from: e, reason: collision with root package name */
    public final C0660a f8798e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f8799f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public long f8800g;

    public C0730b(int i, int i5, C0660a c0660a) {
        this.f8796c = i;
        this.f8797d = i5;
        this.f8798e = c0660a;
    }

    @Override // t0.AbstractC0902I
    public final int a() {
        return this.f8799f.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    @Override // t0.AbstractC0902I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(t0.g0 r13, int r14) {
        /*
            r12 = this;
            l3.a r13 = (l3.C0729a) r13
            java.util.ArrayList r0 = r12.f8799f
            java.lang.Object r14 = r0.get(r14)
            k3.j r14 = (k3.C0669j) r14
            long r0 = r12.f8800g
            java.lang.String r12 = "bar"
            kotlin.jvm.internal.i.e(r14, r12)
            long r2 = r14.f8321b
            r4 = 0
            int r12 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r12 <= 0) goto L1d
            r12 = r7
            goto L1e
        L1d:
            r12 = r6
        L1e:
            l3.b r8 = r13.f8795u
            com.niyaz.zario.databinding.ItemHourlyUsageBinding r13 = r13.f8794t
            if (r12 == 0) goto L35
            android.widget.TextView r9 = r13.tvDuration
            k3.a r10 = r8.f8798e
            java.lang.Long r11 = java.lang.Long.valueOf(r2)
            java.lang.Object r10 = r10.invoke(r11)
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            r9.setText(r10)
        L35:
            android.widget.TextView r9 = r13.tvDuration
            java.lang.String r10 = "tvDuration"
            kotlin.jvm.internal.i.d(r9, r10)
            if (r12 == 0) goto L3f
            goto L41
        L3f:
            r6 = 8
        L41:
            r9.setVisibility(r6)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r5 = 0
            if (r4 <= 0) goto L5a
            double r9 = (double) r2
            double r0 = (double) r0
            double r9 = r9 / r0
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 >= 0) goto L52
            goto L5a
        L52:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 <= 0) goto L5b
            r9 = r0
            goto L5b
        L5a:
            r9 = r5
        L5b:
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 > 0) goto L62
            int r0 = r8.f8797d
            goto L6d
        L62:
            int r0 = r8.f8796c
            double r0 = (double) r0
            double r9 = r9 * r0
            int r0 = (int) r9
            int r1 = r8.f8797d
            int r0 = java.lang.Math.max(r0, r1)
        L6d:
            android.view.View r1 = r13.viewBar
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            r4.height = r0
            r1.setLayoutParams(r4)
            android.view.View r0 = r13.viewBar
            if (r12 == 0) goto L7f
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L81
        L7f:
            r1 = 1048576000(0x3e800000, float:0.25)
        L81:
            r0.setAlpha(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r14 = r14.f8320a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r7)
            java.lang.String r4 = "%02d"
            java.lang.String r0 = java.lang.String.format(r0, r4, r1)
            android.widget.TextView r1 = r13.tvHour
            r1.setText(r0)
            android.widget.LinearLayout r0 = r13.getRoot()
            android.content.Context r0 = r0.getContext()
            android.widget.FrameLayout r13 = r13.barContainer
            if (r12 == 0) goto Lc7
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            k3.a r14 = r8.f8798e
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Object r14 = r14.invoke(r1)
            java.lang.Object[] r12 = new java.lang.Object[]{r12, r14}
            r14 = 2131886289(0x7f1200d1, float:1.9407153E38)
            java.lang.String r12 = r0.getString(r14, r12)
            goto Ld6
        Lc7:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            r14 = 2131886290(0x7f1200d2, float:1.9407155E38)
            java.lang.String r12 = r0.getString(r14, r12)
        Ld6:
            r13.setContentDescription(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.C0730b.c(t0.g0, int):void");
    }

    @Override // t0.AbstractC0902I
    public final g0 d(ViewGroup parent) {
        i.e(parent, "parent");
        ItemHourlyUsageBinding itemHourlyUsageBindingInflate = ItemHourlyUsageBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        i.d(itemHourlyUsageBindingInflate, "inflate(...)");
        return new C0729a(this, itemHourlyUsageBindingInflate);
    }
}

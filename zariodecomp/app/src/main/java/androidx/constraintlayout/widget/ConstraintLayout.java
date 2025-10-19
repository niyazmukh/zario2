package androidx.constraintlayout.widget;

import N2.j0;
import N2.n0;
import S0.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;
import u.d;
import u.e;
import u.h;
import w.AbstractC1006c;
import w.AbstractC1007d;
import w.AbstractC1019q;
import w.C1008e;
import w.C1009f;
import w.C1016m;
import w.C1017o;
import w.n;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\constraintlayout\widget\ConstraintLayout.smali */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f4319a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4320b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4321c;

    /* renamed from: d, reason: collision with root package name */
    public int f4322d;

    /* renamed from: e, reason: collision with root package name */
    public int f4323e;

    /* renamed from: f, reason: collision with root package name */
    public int f4324f;

    /* renamed from: k, reason: collision with root package name */
    public int f4325k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4326l;

    /* renamed from: m, reason: collision with root package name */
    public int f4327m;

    /* renamed from: n, reason: collision with root package name */
    public C1016m f4328n;

    /* renamed from: o, reason: collision with root package name */
    public l f4329o;

    /* renamed from: p, reason: collision with root package name */
    public int f4330p;

    /* renamed from: q, reason: collision with root package name */
    public HashMap f4331q;

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f4332r;

    /* renamed from: s, reason: collision with root package name */
    public final C1009f f4333s;

    public ConstraintLayout(Context context, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        super(context, attributeSet);
        this.f4319a = new SparseArray();
        this.f4320b = new ArrayList(4);
        this.f4321c = new e();
        this.f4322d = 0;
        this.f4323e = 0;
        this.f4324f = f.API_PRIORITY_OTHER;
        this.f4325k = f.API_PRIORITY_OTHER;
        this.f4326l = true;
        this.f4327m = 263;
        this.f4328n = null;
        this.f4329o = null;
        this.f4330p = -1;
        this.f4331q = new HashMap();
        this.f4332r = new SparseArray();
        this.f4333s = new C1009f(this);
        c(attributeSet, 0);
    }

    public static C1008e a() {
        C1008e c1008e = new C1008e(-2, -2);
        c1008e.f10728a = -1;
        c1008e.f10730b = -1;
        c1008e.f10732c = -1.0f;
        c1008e.f10734d = -1;
        c1008e.f10736e = -1;
        c1008e.f10738f = -1;
        c1008e.f10740g = -1;
        c1008e.h = -1;
        c1008e.i = -1;
        c1008e.f10744j = -1;
        c1008e.f10746k = -1;
        c1008e.f10748l = -1;
        c1008e.f10749m = -1;
        c1008e.f10750n = 0;
        c1008e.f10751o = 0.0f;
        c1008e.f10752p = -1;
        c1008e.f10753q = -1;
        c1008e.f10754r = -1;
        c1008e.f10755s = -1;
        c1008e.f10756t = -1;
        c1008e.f10757u = -1;
        c1008e.f10758v = -1;
        c1008e.f10759w = -1;
        c1008e.f10760x = -1;
        c1008e.f10761y = -1;
        c1008e.f10762z = 0.5f;
        c1008e.f10704A = 0.5f;
        c1008e.f10705B = null;
        c1008e.f10706C = 1;
        c1008e.f10707D = -1.0f;
        c1008e.f10708E = -1.0f;
        c1008e.f10709F = 0;
        c1008e.G = 0;
        c1008e.f10710H = 0;
        c1008e.f10711I = 0;
        c1008e.f10712J = 0;
        c1008e.f10713K = 0;
        c1008e.f10714L = 0;
        c1008e.f10715M = 0;
        c1008e.f10716N = 1.0f;
        c1008e.f10717O = 1.0f;
        c1008e.f10718P = -1;
        c1008e.f10719Q = -1;
        c1008e.f10720R = -1;
        c1008e.f10721S = false;
        c1008e.f10722T = false;
        c1008e.f10723U = null;
        c1008e.f10724V = true;
        c1008e.f10725W = true;
        c1008e.X = false;
        c1008e.f10726Y = false;
        c1008e.f10727Z = false;
        c1008e.f10729a0 = -1;
        c1008e.f10731b0 = -1;
        c1008e.f10733c0 = -1;
        c1008e.f10735d0 = -1;
        c1008e.f10737e0 = -1;
        c1008e.f10739f0 = -1;
        c1008e.f10741g0 = 0.5f;
        c1008e.f10747k0 = new d();
        return c1008e;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int iMax2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    public final d b(View view) {
        if (view == this) {
            return this.f4321c;
        }
        if (view == null) {
            return null;
        }
        return ((C1008e) view.getLayoutParams()).f10747k0;
    }

    public final void c(AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        e eVar = this.f4321c;
        eVar.f10252U = this;
        C1009f c1009f = this.f4333s;
        eVar.f10287g0 = c1009f;
        eVar.f10286f0.f10528f = c1009f;
        this.f4319a.put(getId(), this);
        this.f4328n = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1019q.f10865b, i, 0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i5);
                if (index == 9) {
                    this.f4322d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4322d);
                } else if (index == 10) {
                    this.f4323e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4323e);
                } else if (index == 7) {
                    this.f4324f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4324f);
                } else if (index == 8) {
                    this.f4325k = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f4325k);
                } else if (index == 89) {
                    this.f4327m = typedArrayObtainStyledAttributes.getInt(index, this.f4327m);
                } else if (index == 38) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            d(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f4329o = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1016m c1016m = new C1016m();
                        this.f4328n = c1016m;
                        c1016m.e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f4328n = null;
                    }
                    this.f4330p = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        int i6 = this.f4327m;
        eVar.f10296p0 = i6;
        t.e.f9835p = (i6 & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1008e;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(int r10) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r9 = this;
            S0.l r0 = new S0.l
            android.content.Context r1 = r9.getContext()
            r2 = 12
            r0.<init>(r2)
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f2867b = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r0.f2868c = r2
            android.content.res.Resources r2 = r1.getResources()
            android.content.res.XmlResourceParser r10 = r2.getXml(r10)
            int r2 = r10.getEventType()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r3 = 0
        L26:
            r4 = 1
            if (r2 == r4) goto Lca
            if (r2 == 0) goto Lba
            r5 = 2
            if (r2 == r5) goto L30
            goto Lbd
        L30:
            java.lang.String r2 = r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            int r6 = r2.hashCode()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r7 = 4
            r8 = 3
            switch(r6) {
                case -1349929691: goto L6c;
                case 80204913: goto L62;
                case 1382829617: goto L58;
                case 1657696882: goto L4e;
                case 1901439077: goto L3e;
                default: goto L3d;
            }     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
        L3d:
            goto L76
        L3e:
            java.lang.String r6 = "Variant"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r6 == 0) goto L76
            r6 = r8
            goto L77
        L48:
            r10 = move-exception
            goto Lc3
        L4b:
            r10 = move-exception
            goto Lc7
        L4e:
            java.lang.String r6 = "layoutDescription"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r6 == 0) goto L76
            r6 = 0
            goto L77
        L58:
            java.lang.String r6 = "StateSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r6 == 0) goto L76
            r6 = r4
            goto L77
        L62:
            java.lang.String r6 = "State"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r6 == 0) goto L76
            r6 = r5
            goto L77
        L6c:
            java.lang.String r6 = "ConstraintSet"
            boolean r6 = r2.equals(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r6 == 0) goto L76
            r6 = r7
            goto L77
        L76:
            r6 = -1
        L77:
            if (r6 == 0) goto Lbd
            if (r6 == r4) goto Lbd
            if (r6 == r5) goto Lab
            if (r6 == r8) goto L9c
            if (r6 == r7) goto L98
            java.lang.String r4 = "ConstraintLayoutStates"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r5.<init>()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.String r6 = "unknown tag "
            r5.append(r6)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r5.append(r2)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.String r2 = r5.toString()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.Log.v(r4, r2)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            goto Lbd
        L98:
            r0.D(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            goto Lbd
        L9c:
            w.g r2 = new w.g     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.<init>(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            if (r3 == 0) goto Lbd
            java.lang.Object r4 = r3.f1572c     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r4.add(r2)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            goto Lbd
        Lab:
            E3.k r3 = new E3.k     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r3.<init>(r1, r10)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            java.lang.Object r2 = r0.f2867b     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            int r4 = r3.f1570a     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            r2.put(r4, r3)     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            goto Lbd
        Lba:
            r10.getName()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
        Lbd:
            int r2 = r10.next()     // Catch: java.io.IOException -> L48 org.xmlpull.v1.XmlPullParserException -> L4b
            goto L26
        Lc3:
            r10.printStackTrace()
            goto Lca
        Lc7:
            r10.printStackTrace()
        Lca:
            r9.f4329o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.d(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        Object tag;
        int size;
        ArrayList arrayList = this.f4320b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1006c) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i6 = Integer.parseInt(strArrSplit[0]);
                        int i7 = Integer.parseInt(strArrSplit[1]);
                        int i8 = Integer.parseInt(strArrSplit[2]);
                        int i9 = (int) ((i6 / 1080.0f) * width);
                        int i10 = (int) ((i7 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i9;
                        float f3 = i10;
                        float f5 = i9 + ((int) ((i8 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f5, f3, paint);
                        float f6 = i10 + ((int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height));
                        canvas.drawLine(f5, f3, f5, f6, paint);
                        canvas.drawLine(f5, f6, f2, f6, paint);
                        canvas.drawLine(f2, f6, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f5, f6, paint);
                        canvas.drawLine(f2, f6, f5, f3, paint);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(u.e r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1687
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.e(u.e, int, int, int):void");
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f4326l = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) throws NumberFormatException {
        int i;
        Context context = getContext();
        C1008e c1008e = new C1008e(context, attributeSet);
        c1008e.f10728a = -1;
        c1008e.f10730b = -1;
        c1008e.f10732c = -1.0f;
        c1008e.f10734d = -1;
        c1008e.f10736e = -1;
        c1008e.f10738f = -1;
        c1008e.f10740g = -1;
        c1008e.h = -1;
        c1008e.i = -1;
        c1008e.f10744j = -1;
        c1008e.f10746k = -1;
        c1008e.f10748l = -1;
        c1008e.f10749m = -1;
        c1008e.f10750n = 0;
        c1008e.f10751o = 0.0f;
        c1008e.f10752p = -1;
        c1008e.f10753q = -1;
        c1008e.f10754r = -1;
        c1008e.f10755s = -1;
        c1008e.f10756t = -1;
        c1008e.f10757u = -1;
        c1008e.f10758v = -1;
        c1008e.f10759w = -1;
        c1008e.f10760x = -1;
        c1008e.f10761y = -1;
        c1008e.f10762z = 0.5f;
        c1008e.f10704A = 0.5f;
        c1008e.f10705B = null;
        c1008e.f10706C = 1;
        c1008e.f10707D = -1.0f;
        c1008e.f10708E = -1.0f;
        c1008e.f10709F = 0;
        c1008e.G = 0;
        c1008e.f10710H = 0;
        c1008e.f10711I = 0;
        c1008e.f10712J = 0;
        c1008e.f10713K = 0;
        c1008e.f10714L = 0;
        c1008e.f10715M = 0;
        c1008e.f10716N = 1.0f;
        c1008e.f10717O = 1.0f;
        c1008e.f10718P = -1;
        c1008e.f10719Q = -1;
        c1008e.f10720R = -1;
        c1008e.f10721S = false;
        c1008e.f10722T = false;
        c1008e.f10723U = null;
        c1008e.f10724V = true;
        c1008e.f10725W = true;
        c1008e.X = false;
        c1008e.f10726Y = false;
        c1008e.f10727Z = false;
        c1008e.f10729a0 = -1;
        c1008e.f10731b0 = -1;
        c1008e.f10733c0 = -1;
        c1008e.f10735d0 = -1;
        c1008e.f10737e0 = -1;
        c1008e.f10739f0 = -1;
        c1008e.f10741g0 = 0.5f;
        c1008e.f10747k0 = new d();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1019q.f10865b);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i5 = 0; i5 < indexCount; i5++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i5);
            int i6 = AbstractC1007d.f10703a.get(index);
            switch (i6) {
                case 1:
                    c1008e.f10720R = typedArrayObtainStyledAttributes.getInt(index, c1008e.f10720R);
                    break;
                case 2:
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10749m);
                    c1008e.f10749m = resourceId;
                    if (resourceId == -1) {
                        c1008e.f10749m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1008e.f10750n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10750n);
                    break;
                case 4:
                    float f2 = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10751o) % 360.0f;
                    c1008e.f10751o = f2;
                    if (f2 < 0.0f) {
                        c1008e.f10751o = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1008e.f10728a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1008e.f10728a);
                    break;
                case 6:
                    c1008e.f10730b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1008e.f10730b);
                    break;
                case 7:
                    c1008e.f10732c = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10732c);
                    break;
                case 8:
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10734d);
                    c1008e.f10734d = resourceId2;
                    if (resourceId2 == -1) {
                        c1008e.f10734d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10736e);
                    c1008e.f10736e = resourceId3;
                    if (resourceId3 == -1) {
                        c1008e.f10736e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10738f);
                    c1008e.f10738f = resourceId4;
                    if (resourceId4 == -1) {
                        c1008e.f10738f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10740g);
                    c1008e.f10740g = resourceId5;
                    if (resourceId5 == -1) {
                        c1008e.f10740g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                    int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.h);
                    c1008e.h = resourceId6;
                    if (resourceId6 == -1) {
                        c1008e.h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.i);
                    c1008e.i = resourceId7;
                    if (resourceId7 == -1) {
                        c1008e.i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10744j);
                    c1008e.f10744j = resourceId8;
                    if (resourceId8 == -1) {
                        c1008e.f10744j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10746k);
                    c1008e.f10746k = resourceId9;
                    if (resourceId9 == -1) {
                        c1008e.f10746k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10748l);
                    c1008e.f10748l = resourceId10;
                    if (resourceId10 == -1) {
                        c1008e.f10748l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10752p);
                    c1008e.f10752p = resourceId11;
                    if (resourceId11 == -1) {
                        c1008e.f10752p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10753q);
                    c1008e.f10753q = resourceId12;
                    if (resourceId12 == -1) {
                        c1008e.f10753q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10754r);
                    c1008e.f10754r = resourceId13;
                    if (resourceId13 == -1) {
                        c1008e.f10754r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, c1008e.f10755s);
                    c1008e.f10755s = resourceId14;
                    if (resourceId14 == -1) {
                        c1008e.f10755s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1008e.f10756t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10756t);
                    break;
                case 22:
                    c1008e.f10757u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10757u);
                    break;
                case 23:
                    c1008e.f10758v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10758v);
                    break;
                case 24:
                    c1008e.f10759w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10759w);
                    break;
                case 25:
                    c1008e.f10760x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10760x);
                    break;
                case 26:
                    c1008e.f10761y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10761y);
                    break;
                case 27:
                    c1008e.f10721S = typedArrayObtainStyledAttributes.getBoolean(index, c1008e.f10721S);
                    break;
                case 28:
                    c1008e.f10722T = typedArrayObtainStyledAttributes.getBoolean(index, c1008e.f10722T);
                    break;
                case 29:
                    c1008e.f10762z = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10762z);
                    break;
                case 30:
                    c1008e.f10704A = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10704A);
                    break;
                case 31:
                    int i7 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1008e.f10710H = i7;
                    if (i7 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i8 = typedArrayObtainStyledAttributes.getInt(index, 0);
                    c1008e.f10711I = i8;
                    if (i8 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c1008e.f10712J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10712J);
                        break;
                    } catch (Exception unused) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1008e.f10712J) == -2) {
                            c1008e.f10712J = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1008e.f10714L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10714L);
                        break;
                    } catch (Exception unused2) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1008e.f10714L) == -2) {
                            c1008e.f10714L = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1008e.f10716N = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10716N));
                    c1008e.f10710H = 2;
                    break;
                case 36:
                    try {
                        c1008e.f10713K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10713K);
                        break;
                    } catch (Exception unused3) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1008e.f10713K) == -2) {
                            c1008e.f10713K = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c1008e.f10715M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, c1008e.f10715M);
                        break;
                    } catch (Exception unused4) {
                        if (typedArrayObtainStyledAttributes.getInt(index, c1008e.f10715M) == -2) {
                            c1008e.f10715M = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c1008e.f10717O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10717O));
                    c1008e.f10711I = 2;
                    break;
                default:
                    switch (i6) {
                        case 44:
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            c1008e.f10705B = string;
                            c1008e.f10706C = -1;
                            if (string != null) {
                                int length = string.length();
                                int iIndexOf = c1008e.f10705B.indexOf(44);
                                if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                    i = 0;
                                } else {
                                    String strSubstring = c1008e.f10705B.substring(0, iIndexOf);
                                    if (strSubstring.equalsIgnoreCase("W")) {
                                        c1008e.f10706C = 0;
                                    } else if (strSubstring.equalsIgnoreCase("H")) {
                                        c1008e.f10706C = 1;
                                    }
                                    i = iIndexOf + 1;
                                }
                                int iIndexOf2 = c1008e.f10705B.indexOf(58);
                                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                    String strSubstring2 = c1008e.f10705B.substring(i);
                                    if (strSubstring2.length() > 0) {
                                        Float.parseFloat(strSubstring2);
                                        break;
                                    } else {
                                        break;
                                    }
                                } else {
                                    String strSubstring3 = c1008e.f10705B.substring(i, iIndexOf2);
                                    String strSubstring4 = c1008e.f10705B.substring(iIndexOf2 + 1);
                                    if (strSubstring3.length() <= 0 || strSubstring4.length() <= 0) {
                                        break;
                                    } else {
                                        try {
                                            float f3 = Float.parseFloat(strSubstring3);
                                            float f5 = Float.parseFloat(strSubstring4);
                                            if (f3 <= 0.0f || f5 <= 0.0f) {
                                                break;
                                            } else if (c1008e.f10706C == 1) {
                                                Math.abs(f5 / f3);
                                                break;
                                            } else {
                                                Math.abs(f3 / f5);
                                                break;
                                            }
                                        } catch (NumberFormatException unused5) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                break;
                            }
                            break;
                        case 45:
                            c1008e.f10707D = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10707D);
                            break;
                        case 46:
                            c1008e.f10708E = typedArrayObtainStyledAttributes.getFloat(index, c1008e.f10708E);
                            break;
                        case 47:
                            c1008e.f10709F = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1008e.G = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1008e.f10718P = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1008e.f10718P);
                            break;
                        case 50:
                            c1008e.f10719Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, c1008e.f10719Q);
                            break;
                        case 51:
                            c1008e.f10723U = typedArrayObtainStyledAttributes.getString(index);
                            break;
                    }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        c1008e.a();
        return c1008e;
    }

    public int getMaxHeight() {
        return this.f4325k;
    }

    public int getMaxWidth() {
        return this.f4324f;
    }

    public int getMinHeight() {
        return this.f4323e;
    }

    public int getMinWidth() {
        return this.f4322d;
    }

    public int getOptimizationLevel() {
        return this.f4321c.f10296p0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i5, int i6, int i7) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            C1008e c1008e = (C1008e) childAt.getLayoutParams();
            d dVar = c1008e.f10747k0;
            if (childAt.getVisibility() != 8 || c1008e.f10726Y || c1008e.f10727Z || zIsInEditMode) {
                int iM = dVar.m();
                int iN = dVar.n();
                childAt.layout(iM, iN, dVar.l() + iM, dVar.i() + iN);
            }
        }
        ArrayList arrayList = this.f4320b;
        int size = arrayList.size();
        if (size > 0) {
            for (int i9 = 0; i9 < size; i9++) {
                ((AbstractC1006c) arrayList.get(i9)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r26, int r27) throws android.content.res.Resources.NotFoundException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        d dVarB = b(view);
        if ((view instanceof C1017o) && !(dVarB instanceof h)) {
            C1008e c1008e = (C1008e) view.getLayoutParams();
            h hVar = new h();
            c1008e.f10747k0 = hVar;
            c1008e.f10726Y = true;
            hVar.B(c1008e.f10720R);
        }
        if (view instanceof AbstractC1006c) {
            AbstractC1006c abstractC1006c = (AbstractC1006c) view;
            abstractC1006c.g();
            ((C1008e) view.getLayoutParams()).f10727Z = true;
            ArrayList arrayList = this.f4320b;
            if (!arrayList.contains(abstractC1006c)) {
                arrayList.add(abstractC1006c);
            }
        }
        this.f4319a.put(view.getId(), view);
        this.f4326l = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f4319a.remove(view.getId());
        d dVarB = b(view);
        this.f4321c.f10284d0.remove(dVarB);
        dVarB.f10240I = null;
        this.f4320b.remove(view);
        this.f4326l = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f4326l = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1016m c1016m) {
        this.f4328n = c1016m;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f4319a;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f4325k) {
            return;
        }
        this.f4325k = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f4324f) {
            return;
        }
        this.f4324f = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f4323e) {
            return;
        }
        this.f4323e = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f4322d) {
            return;
        }
        this.f4322d = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(n nVar) {
        l lVar = this.f4329o;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f4327m = i;
        this.f4321c.f10296p0 = i;
        t.e.f9835p = (i & 256) == 256;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        super(context, attributeSet, i);
        this.f4319a = new SparseArray();
        this.f4320b = new ArrayList(4);
        this.f4321c = new e();
        this.f4322d = 0;
        this.f4323e = 0;
        this.f4324f = f.API_PRIORITY_OTHER;
        this.f4325k = f.API_PRIORITY_OTHER;
        this.f4326l = true;
        this.f4327m = 263;
        this.f4328n = null;
        this.f4329o = null;
        this.f4330p = -1;
        this.f4331q = new HashMap();
        this.f4332r = new SparseArray();
        this.f4333s = new C1009f(this);
        c(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1008e c1008e = new C1008e(layoutParams);
        c1008e.f10728a = -1;
        c1008e.f10730b = -1;
        c1008e.f10732c = -1.0f;
        c1008e.f10734d = -1;
        c1008e.f10736e = -1;
        c1008e.f10738f = -1;
        c1008e.f10740g = -1;
        c1008e.h = -1;
        c1008e.i = -1;
        c1008e.f10744j = -1;
        c1008e.f10746k = -1;
        c1008e.f10748l = -1;
        c1008e.f10749m = -1;
        c1008e.f10750n = 0;
        c1008e.f10751o = 0.0f;
        c1008e.f10752p = -1;
        c1008e.f10753q = -1;
        c1008e.f10754r = -1;
        c1008e.f10755s = -1;
        c1008e.f10756t = -1;
        c1008e.f10757u = -1;
        c1008e.f10758v = -1;
        c1008e.f10759w = -1;
        c1008e.f10760x = -1;
        c1008e.f10761y = -1;
        c1008e.f10762z = 0.5f;
        c1008e.f10704A = 0.5f;
        c1008e.f10705B = null;
        c1008e.f10706C = 1;
        c1008e.f10707D = -1.0f;
        c1008e.f10708E = -1.0f;
        c1008e.f10709F = 0;
        c1008e.G = 0;
        c1008e.f10710H = 0;
        c1008e.f10711I = 0;
        c1008e.f10712J = 0;
        c1008e.f10713K = 0;
        c1008e.f10714L = 0;
        c1008e.f10715M = 0;
        c1008e.f10716N = 1.0f;
        c1008e.f10717O = 1.0f;
        c1008e.f10718P = -1;
        c1008e.f10719Q = -1;
        c1008e.f10720R = -1;
        c1008e.f10721S = false;
        c1008e.f10722T = false;
        c1008e.f10723U = null;
        c1008e.f10724V = true;
        c1008e.f10725W = true;
        c1008e.X = false;
        c1008e.f10726Y = false;
        c1008e.f10727Z = false;
        c1008e.f10729a0 = -1;
        c1008e.f10731b0 = -1;
        c1008e.f10733c0 = -1;
        c1008e.f10735d0 = -1;
        c1008e.f10737e0 = -1;
        c1008e.f10739f0 = -1;
        c1008e.f10741g0 = 0.5f;
        c1008e.f10747k0 = new d();
        return c1008e;
    }
}

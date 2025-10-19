package G0;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G0\m.smali */
public final class m {

    /* renamed from: p, reason: collision with root package name */
    public static final Matrix f1779p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f1781b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f1782c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f1783d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1784e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f1785f;

    /* renamed from: g, reason: collision with root package name */
    public final j f1786g;
    public float h;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f1787j;

    /* renamed from: k, reason: collision with root package name */
    public float f1788k;

    /* renamed from: l, reason: collision with root package name */
    public int f1789l;

    /* renamed from: m, reason: collision with root package name */
    public String f1790m;

    /* renamed from: n, reason: collision with root package name */
    public Boolean f1791n;

    /* renamed from: o, reason: collision with root package name */
    public final q.b f1792o;

    public m() {
        this.f1782c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f1787j = 0.0f;
        this.f1788k = 0.0f;
        this.f1789l = 255;
        this.f1790m = null;
        this.f1791n = null;
        this.f1792o = new q.b();
        this.f1786g = new j();
        this.f1780a = new Path();
        this.f1781b = new Path();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e6  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(G0.j r19, android.graphics.Matrix r20, android.graphics.Canvas r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G0.m.a(G0.j, android.graphics.Matrix, android.graphics.Canvas, int, int):void");
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1789l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f1789l = i;
    }

    public m(m mVar) {
        this.f1782c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.f1787j = 0.0f;
        this.f1788k = 0.0f;
        this.f1789l = 255;
        this.f1790m = null;
        this.f1791n = null;
        q.b bVar = new q.b();
        this.f1792o = bVar;
        this.f1786g = new j(mVar.f1786g, bVar);
        this.f1780a = new Path(mVar.f1780a);
        this.f1781b = new Path(mVar.f1781b);
        this.h = mVar.h;
        this.i = mVar.i;
        this.f1787j = mVar.f1787j;
        this.f1788k = mVar.f1788k;
        this.f1789l = mVar.f1789l;
        this.f1790m = mVar.f1790m;
        String str = mVar.f1790m;
        if (str != null) {
            bVar.put(str, this);
        }
        this.f1791n = mVar.f1791n;
    }
}

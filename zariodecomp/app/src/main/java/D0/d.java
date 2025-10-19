package D0;

import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D0\d.smali */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final RectF f1277a = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public final Paint f1278b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f1279c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f1280d;

    /* renamed from: e, reason: collision with root package name */
    public float f1281e;

    /* renamed from: f, reason: collision with root package name */
    public float f1282f;

    /* renamed from: g, reason: collision with root package name */
    public float f1283g;
    public float h;
    public int[] i;

    /* renamed from: j, reason: collision with root package name */
    public int f1284j;

    /* renamed from: k, reason: collision with root package name */
    public float f1285k;

    /* renamed from: l, reason: collision with root package name */
    public float f1286l;

    /* renamed from: m, reason: collision with root package name */
    public float f1287m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1288n;

    /* renamed from: o, reason: collision with root package name */
    public Path f1289o;

    /* renamed from: p, reason: collision with root package name */
    public float f1290p;

    /* renamed from: q, reason: collision with root package name */
    public float f1291q;

    /* renamed from: r, reason: collision with root package name */
    public int f1292r;

    /* renamed from: s, reason: collision with root package name */
    public int f1293s;

    /* renamed from: t, reason: collision with root package name */
    public int f1294t;

    /* renamed from: u, reason: collision with root package name */
    public int f1295u;

    public d() {
        Paint paint = new Paint();
        this.f1278b = paint;
        Paint paint2 = new Paint();
        this.f1279c = paint2;
        Paint paint3 = new Paint();
        this.f1280d = paint3;
        this.f1281e = 0.0f;
        this.f1282f = 0.0f;
        this.f1283g = 0.0f;
        this.h = 5.0f;
        this.f1290p = 1.0f;
        this.f1294t = 255;
        paint.setStrokeCap(Paint.Cap.SQUARE);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint3.setColor(0);
    }

    public final void a(int i) {
        this.f1284j = i;
        this.f1295u = this.i[i];
    }
}

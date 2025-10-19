package W1;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\W1\a.smali */
public final class a {
    public static final int[] i = new int[3];

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f3692j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f3693k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f3694l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f3696b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f3697c;

    /* renamed from: d, reason: collision with root package name */
    public int f3698d;

    /* renamed from: e, reason: collision with root package name */
    public int f3699e;

    /* renamed from: f, reason: collision with root package name */
    public int f3700f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f3701g = new Path();
    public final Paint h;

    public a() {
        Paint paint = new Paint();
        this.h = paint;
        this.f3695a = new Paint();
        a(-16777216);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f3696b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f3697c = new Paint(paint2);
    }

    public final void a(int i5) {
        this.f3698d = D.a.d(i5, 68);
        this.f3699e = D.a.d(i5, 20);
        this.f3700f = D.a.d(i5, 0);
        this.f3695a.setColor(this.f3698d);
    }
}

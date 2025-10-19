package U0;

import java.util.concurrent.CancellationException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\U0\a.smali */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final a f3265c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f3266d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3267a;

    /* renamed from: b, reason: collision with root package name */
    public final CancellationException f3268b;

    static {
        if (i.f3286d) {
            f3266d = null;
            f3265c = null;
        } else {
            f3266d = new a(false, null);
            f3265c = new a(true, null);
        }
    }

    public a(boolean z4, CancellationException cancellationException) {
        this.f3267a = z4;
        this.f3268b = cancellationException;
    }
}

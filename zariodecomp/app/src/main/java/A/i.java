package A;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A\i.smali */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final Bundle f4a;

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f5b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f7d;

    /* renamed from: e, reason: collision with root package name */
    public final int f8e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f9f;

    /* renamed from: g, reason: collision with root package name */
    public final PendingIntent f10g;

    public i(String str, PendingIntent pendingIntent) {
        IconCompat iconCompatA = IconCompat.a(2131165316);
        Bundle bundle = new Bundle();
        this.f7d = true;
        this.f5b = iconCompatA;
        int i = iconCompatA.f4365a;
        if ((i == -1 ? E.f.c(iconCompatA.f4366b) : i) == 2) {
            this.f8e = iconCompatA.b();
        }
        this.f9f = k.b(str);
        this.f10g = pendingIntent;
        this.f4a = bundle;
        this.f6c = true;
        this.f7d = true;
    }
}

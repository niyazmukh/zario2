package C;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\C\l.smali */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f1055a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f1056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1057c;

    public l(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f1055a = colorStateList;
        this.f1056b = configuration;
        this.f1057c = theme == null ? 0 : theme.hashCode();
    }
}

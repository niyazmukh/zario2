package g2;

import java.nio.charset.Charset;

/* renamed from: g2.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g2.1\b.smali */
public abstract class AbstractC0579b {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f7598a = Charset.forName("US-ASCII");

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f7599b;

    static {
        Charset.forName("ISO-8859-1");
        f7599b = Charset.forName("UTF-8");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}

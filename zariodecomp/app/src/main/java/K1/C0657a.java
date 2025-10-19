package k1;

import android.util.Log;
import java.util.Locale;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k1.1\a.smali */
public final class C0657a {

    /* renamed from: a, reason: collision with root package name */
    public final String f8296a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8297b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8298c;

    public C0657a(String str, String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f8297b = string;
        this.f8296a = str;
        int length = str.length();
        Object[] objArr = {str, 23};
        if (length > 23) {
            throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", objArr));
        }
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f8296a, i)) {
            i++;
        }
        this.f8298c = i;
    }

    public final void a(String str, Object... objArr) {
        if (this.f8298c <= 3) {
            Log.d(this.f8296a, d(str, objArr));
        }
    }

    public final void b(String str, Exception exc, Object... objArr) {
        Log.e(this.f8296a, d(str, objArr), exc);
    }

    public final void c(String str, Object... objArr) {
        Log.e(this.f8296a, d(str, objArr));
    }

    public final String d(String str, Object... objArr) {
        if (objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f8297b.concat(str);
    }

    public final void e(String str, Object... objArr) {
        if (this.f8298c <= 2) {
            Log.v(this.f8296a, d(str, objArr));
        }
    }

    public final void f(String str, Object... objArr) {
        Log.w(this.f8296a, d(str, objArr));
    }
}

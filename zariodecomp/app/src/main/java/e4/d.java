package e4;

import java.io.Serializable;
import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\d.smali */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f6956a;

    public d() {
        Pattern patternCompile = Pattern.compile("^[a-zA-Z0-9/_]{0,100}$");
        kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
        this.f6956a = patternCompile;
    }

    public final String toString() {
        String string = this.f6956a.toString();
        kotlin.jvm.internal.i.d(string, "toString(...)");
        return string;
    }
}

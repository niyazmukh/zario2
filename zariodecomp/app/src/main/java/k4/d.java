package k4;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\d.smali */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f8375a;

    static {
        try {
            f8375a = d4.g.m0(d4.g.k0(Arrays.asList(new g4.b()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}

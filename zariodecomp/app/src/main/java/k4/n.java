package k4;

import f4.v0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\k4\n.smali */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final v0 f8401a;

    static {
        String property;
        int i = u.f8410a;
        Object next = null;
        try {
            property = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            Boolean.parseBoolean(property);
        }
        try {
            List listM0 = d4.g.m0(d4.g.k0(Arrays.asList(new g4.a()).iterator()));
            Iterator it = listM0.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iB = ((g4.a) next).b();
                    do {
                        Object next2 = it.next();
                        int iB2 = ((g4.a) next2).b();
                        if (iB < iB2) {
                            next = next2;
                            iB = iB2;
                        }
                    } while (it.hasNext());
                }
            }
            g4.a aVar = (g4.a) next;
            if (aVar != null) {
                try {
                    v0 v0VarA = aVar.a(listM0);
                    if (v0VarA != null) {
                        f8401a = v0VarA;
                        return;
                    }
                } catch (Throwable th) {
                    aVar.c();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}

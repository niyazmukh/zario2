package androidx.profileinstaller;

import A2.RunnableC0012l;
import B0.b;
import X1.e;
import android.content.Context;
import java.util.Collections;
import java.util.List;
import r0.f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\profileinstaller\ProfileInstallerInitializer.smali */
public class ProfileInstallerInitializer implements b {
    @Override // B0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // B0.b
    public final Object b(Context context) {
        f.a(new RunnableC0012l(21, this, context.getApplicationContext()));
        return new e();
    }
}

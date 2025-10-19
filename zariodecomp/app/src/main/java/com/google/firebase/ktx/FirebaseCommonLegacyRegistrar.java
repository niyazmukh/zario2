package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p1.b;
import q2.C0849a;
import r1.d;

@Keep
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\ktx\FirebaseCommonLegacyRegistrar.smali */
public final class FirebaseCommonLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C0849a> getComponents() {
        return b.B(d.r("fire-core-ktx", "21.0.0"));
    }
}

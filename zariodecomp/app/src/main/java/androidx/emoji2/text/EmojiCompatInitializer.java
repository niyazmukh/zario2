package androidx.emoji2.text;

import B0.a;
import B0.b;
import android.content.Context;
import androidx.lifecycle.C0242x;
import androidx.lifecycle.InterfaceC0241v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import c0.i;
import c0.j;
import c0.l;
import c0.q;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\emoji2\text\EmojiCompatInitializer.smali */
public class EmojiCompatInitializer implements b {
    @Override // B0.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // B0.b
    public final Object b(Context context) {
        Object objB;
        q qVar = new q(new l(context, 0));
        qVar.f5353a = 1;
        if (i.f5356j == null) {
            synchronized (i.i) {
                try {
                    if (i.f5356j == null) {
                        i.f5356j = new i(qVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f279e) {
            try {
                objB = aVarC.f280a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0242x c0242xG = ((InterfaceC0241v) objB).g();
        c0242xG.a(new j(this, c0242xG));
        return Boolean.TRUE;
    }
}

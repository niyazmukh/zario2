package z3;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* renamed from: z3.m, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\z3.1\m.1.smali */
public abstract class AbstractC1089m {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1090n f11365a;

    static {
        AbstractC1090n q0Var;
        AtomicReference atomicReference = new AtomicReference();
        try {
            q0Var = (AbstractC1090n) Class.forName("io.grpc.override.ContextStorageOverride").asSubclass(AbstractC1090n.class).getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e5) {
            atomicReference.set(e5);
            q0Var = new q0();
        } catch (Exception e6) {
            throw new RuntimeException("Storage override failed to initialize", e6);
        }
        f11365a = q0Var;
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            C1091o.f11372a.log(Level.FINE, "Storage override doesn't exist. Using default", th);
        }
    }
}

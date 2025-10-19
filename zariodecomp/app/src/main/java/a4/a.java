package a4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a4\a.smali */
public final class a extends Z3.a {
    @Override // Z3.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        i.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}

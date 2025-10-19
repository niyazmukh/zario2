package e4;

import X3.p;
import java.util.Iterator;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\e4\c.smali */
public final class c implements d4.e {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f6952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6954c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.jvm.internal.j f6955d;

    /* JADX WARN: Multi-variable type inference failed */
    public c(CharSequence input, int i, int i5, p pVar) {
        kotlin.jvm.internal.i.e(input, "input");
        this.f6952a = input;
        this.f6953b = i;
        this.f6954c = i5;
        this.f6955d = (kotlin.jvm.internal.j) pVar;
    }

    @Override // d4.e
    public final Iterator iterator() {
        return new b(this);
    }
}

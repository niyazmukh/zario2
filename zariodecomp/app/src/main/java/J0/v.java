package J0;

import java.util.LinkedHashSet;
import java.util.UUID;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J0\v.smali */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f2066a;

    /* renamed from: b, reason: collision with root package name */
    public final S0.q f2067b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2068c;

    public v(UUID id, S0.q workSpec, LinkedHashSet tags) {
        kotlin.jvm.internal.i.e(id, "id");
        kotlin.jvm.internal.i.e(workSpec, "workSpec");
        kotlin.jvm.internal.i.e(tags, "tags");
        this.f2066a = id;
        this.f2067b = workSpec;
        this.f2068c = tags;
    }
}

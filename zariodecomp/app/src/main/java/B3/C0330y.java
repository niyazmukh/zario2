package b3;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: b3.y, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\b3.1\y.1.smali */
public final class C0330y extends Q3.c {

    /* renamed from: a, reason: collision with root package name */
    public String f5327a;

    /* renamed from: b, reason: collision with root package name */
    public String f5328b;

    /* renamed from: c, reason: collision with root package name */
    public Collection f5329c;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f5330d;

    /* renamed from: e, reason: collision with root package name */
    public Y2.b f5331e;

    /* renamed from: f, reason: collision with root package name */
    public Collection f5332f;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5333k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0294S f5334l;

    /* renamed from: m, reason: collision with root package name */
    public int f5335m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0330y(C0294S c0294s, Q3.c cVar) {
        super(cVar);
        this.f5334l = c0294s;
    }

    @Override // Q3.a
    public final Object invokeSuspend(Object obj) {
        this.f5333k = obj;
        this.f5335m |= Integer.MIN_VALUE;
        return this.f5334l.a(null, null, null, 0, this);
    }
}

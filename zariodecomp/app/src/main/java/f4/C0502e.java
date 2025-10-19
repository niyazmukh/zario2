package f4;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: f4.e, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\f4\e.1.smali */
public final class C0502e {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7055b = AtomicIntegerFieldUpdater.newUpdater(C0502e.class, "notCompletedCount$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final H[] f7056a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    public C0502e(H[] hArr) {
        this.f7056a = hArr;
        this.notCompletedCount$volatile = hArr.length;
    }
}

package h4;

import f4.InterfaceC0514l;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\h4\i.smali */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final o f7795a = new o(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f7796b = k4.a.l("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f7797c = k4.a.l("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final h1.i f7798d = new h1.i("BUFFERED", 18);

    /* renamed from: e, reason: collision with root package name */
    public static final h1.i f7799e = new h1.i("SHOULD_BUFFER", 18);

    /* renamed from: f, reason: collision with root package name */
    public static final h1.i f7800f = new h1.i("S_RESUMING_BY_RCV", 18);

    /* renamed from: g, reason: collision with root package name */
    public static final h1.i f7801g = new h1.i("RESUMING_BY_EB", 18);
    public static final h1.i h = new h1.i("POISONED", 18);
    public static final h1.i i = new h1.i("DONE_RCV", 18);

    /* renamed from: j, reason: collision with root package name */
    public static final h1.i f7802j = new h1.i("INTERRUPTED_SEND", 18);

    /* renamed from: k, reason: collision with root package name */
    public static final h1.i f7803k = new h1.i("INTERRUPTED_RCV", 18);

    /* renamed from: l, reason: collision with root package name */
    public static final h1.i f7804l = new h1.i("CHANNEL_CLOSED", 18);

    /* renamed from: m, reason: collision with root package name */
    public static final h1.i f7805m = new h1.i("SUSPEND", 18);

    /* renamed from: n, reason: collision with root package name */
    public static final h1.i f7806n = new h1.i("SUSPEND_NO_WAITER", 18);

    /* renamed from: o, reason: collision with root package name */
    public static final h1.i f7807o = new h1.i("FAILED", 18);

    /* renamed from: p, reason: collision with root package name */
    public static final h1.i f7808p = new h1.i("NO_RECEIVE_RESULT", 18);

    /* renamed from: q, reason: collision with root package name */
    public static final h1.i f7809q = new h1.i("CLOSE_HANDLER_CLOSED", 18);

    /* renamed from: r, reason: collision with root package name */
    public static final h1.i f7810r = new h1.i("CLOSE_HANDLER_INVOKED", 18);

    /* renamed from: s, reason: collision with root package name */
    public static final h1.i f7811s = new h1.i("NO_CLOSE_CAUSE", 18);

    public static final boolean a(InterfaceC0514l interfaceC0514l, Object obj, X3.q qVar) {
        h1.i iVarF = interfaceC0514l.f(obj, qVar);
        if (iVarF == null) {
            return false;
        }
        interfaceC0514l.h(iVarF);
        return true;
    }
}

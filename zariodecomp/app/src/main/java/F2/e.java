package F2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\F2\e.smali */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f1693a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f1694b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f1695c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f1696d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f1697e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f1698f;

    /* renamed from: k, reason: collision with root package name */
    public static final e f1699k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f1700l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f1701m;

    /* renamed from: n, reason: collision with root package name */
    public static final e f1702n;

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ e[] f1703o;

    /* JADX INFO: Fake field, exist only in values array */
    e EF0;

    static {
        e eVar = new e("ALL", 0);
        e eVar2 = new e("LISTEN_STREAM_IDLE", 1);
        f1693a = eVar2;
        e eVar3 = new e("LISTEN_STREAM_CONNECTION_BACKOFF", 2);
        f1694b = eVar3;
        e eVar4 = new e("WRITE_STREAM_IDLE", 3);
        f1695c = eVar4;
        e eVar5 = new e("WRITE_STREAM_CONNECTION_BACKOFF", 4);
        f1696d = eVar5;
        e eVar6 = new e("HEALTH_CHECK_TIMEOUT", 5);
        f1697e = eVar6;
        e eVar7 = new e("ONLINE_STATE_TIMEOUT", 6);
        f1698f = eVar7;
        e eVar8 = new e("GARBAGE_COLLECTION", 7);
        f1699k = eVar8;
        e eVar9 = new e("RETRY_TRANSACTION", 8);
        f1700l = eVar9;
        e eVar10 = new e("CONNECTIVITY_ATTEMPT_TIMER", 9);
        f1701m = eVar10;
        e eVar11 = new e("INDEX_BACKFILL", 10);
        f1702n = eVar11;
        f1703o = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7, eVar8, eVar9, eVar10, eVar11};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f1703o.clone();
    }
}

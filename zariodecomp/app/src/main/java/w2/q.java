package w2;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\w2\q.smali */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public String f10951a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10952b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10953c;

    /* renamed from: d, reason: collision with root package name */
    public long f10954d;

    /* renamed from: e, reason: collision with root package name */
    public v f10955e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10956f;

    public final r a() {
        if (this.f10952b || !this.f10951a.equals("firestore.googleapis.com")) {
            return new r(this);
        }
        throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
    }
}

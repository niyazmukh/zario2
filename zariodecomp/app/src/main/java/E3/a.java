package E3;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\a.smali */
public enum a {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_STREAM(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_VERSION(1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_IN_USE(1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    STREAM_CLOSED(5),
    FRAME_TOO_LARGE(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS(-1);


    /* renamed from: a, reason: collision with root package name */
    public final int f1533a;

    a(int i) {
        this.f1533a = i;
    }
}

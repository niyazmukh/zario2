package E3;

import N2.AbstractC0156x;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\E3\e.smali */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final q4.f f1553a;

    /* renamed from: b, reason: collision with root package name */
    public static final b[] f1554b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f1555c;

    static {
        q4.f fVar = q4.f.f9516d;
        f1553a = AbstractC0156x.D(":");
        b bVar = new b(b.h, "");
        q4.f fVar2 = b.f1535e;
        b bVar2 = new b(fVar2, "GET");
        b bVar3 = new b(fVar2, "POST");
        q4.f fVar3 = b.f1536f;
        b bVar4 = new b(fVar3, "/");
        b bVar5 = new b(fVar3, "/index.html");
        q4.f fVar4 = b.f1537g;
        b bVar6 = new b(fVar4, "http");
        b bVar7 = new b(fVar4, "https");
        q4.f fVar5 = b.f1534d;
        b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, new b(fVar5, "200"), new b(fVar5, "204"), new b(fVar5, "206"), new b(fVar5, "304"), new b(fVar5, "400"), new b(fVar5, "404"), new b(fVar5, "500"), new b("accept-charset", ""), new b("accept-encoding", "gzip, deflate"), new b("accept-language", ""), new b("accept-ranges", ""), new b("accept", ""), new b("access-control-allow-origin", ""), new b("age", ""), new b("allow", ""), new b("authorization", ""), new b("cache-control", ""), new b("content-disposition", ""), new b("content-encoding", ""), new b("content-language", ""), new b("content-length", ""), new b("content-location", ""), new b("content-range", ""), new b("content-type", ""), new b("cookie", ""), new b("date", ""), new b("etag", ""), new b("expect", ""), new b("expires", ""), new b("from", ""), new b("host", ""), new b("if-match", ""), new b("if-modified-since", ""), new b("if-none-match", ""), new b("if-range", ""), new b("if-unmodified-since", ""), new b("last-modified", ""), new b("link", ""), new b("location", ""), new b("max-forwards", ""), new b("proxy-authenticate", ""), new b("proxy-authorization", ""), new b("range", ""), new b("referer", ""), new b("refresh", ""), new b("retry-after", ""), new b("server", ""), new b("set-cookie", ""), new b("strict-transport-security", ""), new b("transfer-encoding", ""), new b("user-agent", ""), new b("vary", ""), new b("via", ""), new b("www-authenticate", "")};
        f1554b = bVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(bVarArr[i].f1538a)) {
                linkedHashMap.put(bVarArr[i].f1538a, Integer.valueOf(i));
            }
        }
        f1555c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(q4.f fVar) throws IOException {
        int iB = fVar.b();
        for (int i = 0; i < iB; i++) {
            byte bE = fVar.e(i);
            if (bE >= 65 && bE <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(fVar.k()));
            }
        }
    }
}

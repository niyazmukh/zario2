package o0;

import android.net.Uri;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\t.smali */
public final class t extends kotlin.jvm.internal.j implements X3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f9114b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(v vVar, int i) {
        super(0);
        this.f9113a = i;
        this.f9114b = vVar;
    }

    /* JADX WARN: Type inference failed for: r13v14, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [K3.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20, types: [K3.c, java.lang.Object] */
    @Override // X3.a
    public final Object invoke() {
        List list;
        switch (this.f9113a) {
            case 0:
                K3.e eVar = (K3.e) this.f9114b.f9126j.getValue();
                return (eVar == null || (list = (List) eVar.f2277a) == null) ? new ArrayList() : list;
            case 1:
                String str = this.f9114b.f9119a;
                if (str == null || Uri.parse(str).getFragment() == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                String fragment = Uri.parse(str).getFragment();
                StringBuilder sb = new StringBuilder();
                kotlin.jvm.internal.i.b(fragment);
                v.a(fragment, arrayList, sb);
                String string = sb.toString();
                kotlin.jvm.internal.i.d(string, "fragRegex.toString()");
                return new K3.e(arrayList, string);
            case 2:
                String str2 = (String) this.f9114b.f9128l.getValue();
                if (str2 != null) {
                    return Pattern.compile(str2, 2);
                }
                return null;
            case 3:
                K3.e eVar2 = (K3.e) this.f9114b.f9126j.getValue();
                if (eVar2 != null) {
                    return (String) eVar2.f2278b;
                }
                return null;
            case 4:
                String str3 = this.f9114b.f9119a;
                return Boolean.valueOf((str3 == null || Uri.parse(str3).getQuery() == null) ? false : true);
            case 5:
                String str4 = this.f9114b.f9130n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            case 6:
                String str5 = this.f9114b.f9123e;
                if (str5 != null) {
                    return Pattern.compile(str5, 2);
                }
                return null;
            default:
                v vVar = this.f9114b;
                vVar.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (((Boolean) vVar.f9125g.getValue()).booleanValue()) {
                    String str6 = vVar.f9119a;
                    Uri uri = Uri.parse(str6);
                    for (String paramName : uri.getQueryParameterNames()) {
                        StringBuilder sb2 = new StringBuilder();
                        List<String> queryParameters = uri.getQueryParameters(paramName);
                        if (queryParameters.size() > 1) {
                            throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + str6 + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                        }
                        String queryParam = (String) L3.j.e0(queryParameters);
                        if (queryParam == null) {
                            vVar.i = true;
                            queryParam = paramName;
                        }
                        Matcher matcher = v.f9118r.matcher(queryParam);
                        s sVar = new s();
                        int iEnd = 0;
                        while (matcher.find()) {
                            String strGroup = matcher.group(1);
                            kotlin.jvm.internal.i.c(strGroup, "null cannot be cast to non-null type kotlin.String");
                            sVar.f9112b.add(strGroup);
                            kotlin.jvm.internal.i.d(queryParam, "queryParam");
                            String strSubstring = queryParam.substring(iEnd, matcher.start());
                            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                            sb2.append(Pattern.quote(strSubstring));
                            sb2.append("(.+?)?");
                            iEnd = matcher.end();
                        }
                        if (iEnd < queryParam.length()) {
                            String strSubstring2 = queryParam.substring(iEnd);
                            kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                            sb2.append(Pattern.quote(strSubstring2));
                        }
                        String string2 = sb2.toString();
                        kotlin.jvm.internal.i.d(string2, "argRegex.toString()");
                        sVar.f9111a = e4.m.v0(string2, ".*", "\\E.*\\Q");
                        kotlin.jvm.internal.i.d(paramName, "paramName");
                        linkedHashMap.put(paramName, sVar);
                    }
                }
                return linkedHashMap;
        }
    }
}

package o0;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\v.smali */
public final class v {

    /* renamed from: q, reason: collision with root package name */
    public static final Pattern f9117q = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* renamed from: r, reason: collision with root package name */
    public static final Pattern f9118r = Pattern.compile("\\{(.+?)\\}");

    /* renamed from: a, reason: collision with root package name */
    public final String f9119a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9120b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9121c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f9122d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9123e;

    /* renamed from: f, reason: collision with root package name */
    public final K3.h f9124f;

    /* renamed from: g, reason: collision with root package name */
    public final K3.h f9125g;
    public final Object h;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f9126j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f9127k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f9128l;

    /* renamed from: m, reason: collision with root package name */
    public final K3.h f9129m;

    /* renamed from: n, reason: collision with root package name */
    public final String f9130n;

    /* renamed from: o, reason: collision with root package name */
    public final K3.h f9131o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f9132p;

    public v(String str, String str2, String str3) {
        List listB;
        List listQ0;
        this.f9119a = str;
        this.f9120b = str2;
        this.f9121c = str3;
        ArrayList arrayList = new ArrayList();
        this.f9122d = arrayList;
        this.f9124f = S0.f.P(new t(this, 6));
        this.f9125g = S0.f.P(new t(this, 4));
        K3.d[] dVarArr = K3.d.f2276a;
        this.h = S0.f.O(new t(this, 7));
        this.f9126j = S0.f.O(new t(this, 1));
        this.f9127k = S0.f.O(new t(this, 0));
        this.f9128l = S0.f.O(new t(this, 3));
        this.f9129m = S0.f.P(new t(this, 2));
        this.f9131o = S0.f.P(new t(this, 5));
        if (str != null) {
            StringBuilder sb = new StringBuilder("^");
            if (!f9117q.matcher(str).find()) {
                sb.append("http[s]?://");
            }
            Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(str);
            matcher.find();
            String strSubstring = str.substring(0, matcher.start());
            kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            a(strSubstring, arrayList, sb);
            this.f9132p = (e4.m.l0(sb, ".*") || e4.m.l0(sb, "([^/]+?)")) ? false : true;
            sb.append("($|(\\?(.)*)|(\\#(.)*))");
            String string = sb.toString();
            kotlin.jvm.internal.i.d(string, "uriRegex.toString()");
            this.f9123e = e4.m.v0(string, ".*", "\\E.*\\Q");
        }
        if (str3 == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(str3).matches()) {
            throw new IllegalArgumentException(B.a.l("The given mimeType ", str3, " does not match to required \"type/subtype\" format").toString());
        }
        Pattern patternCompile = Pattern.compile("/");
        kotlin.jvm.internal.i.d(patternCompile, "compile(...)");
        e4.m.w0(0);
        Matcher matcher2 = patternCompile.matcher(str3);
        if (matcher2.find()) {
            ArrayList arrayList2 = new ArrayList(10);
            int iEnd = 0;
            do {
                arrayList2.add(str3.subSequence(iEnd, matcher2.start()).toString());
                iEnd = matcher2.end();
            } while (matcher2.find());
            arrayList2.add(str3.subSequence(iEnd, str3.length()).toString());
            listB = arrayList2;
        } else {
            listB = p1.b.B(str3.toString());
        }
        if (listB.isEmpty()) {
            listQ0 = L3.s.f2351a;
        } else {
            ListIterator listIterator = listB.listIterator(listB.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    listQ0 = L3.j.q0(listIterator.nextIndex() + 1, listB);
                    break;
                }
            }
            listQ0 = L3.s.f2351a;
        }
        this.f9130n = e4.m.v0("^(" + ((String) listQ0.get(0)) + "|[*]+)/(" + ((String) listQ0.get(1)) + "|[*]+)$", "*|[*]", "[\\s\\S]");
    }

    public static void a(String str, ArrayList arrayList, StringBuilder sb) {
        Matcher matcher = f9118r.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.i.c(strGroup, "null cannot be cast to non-null type kotlin.String");
            arrayList.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                sb.append(Pattern.quote(strSubstring));
            }
            sb.append("([^/]+?)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            kotlin.jvm.internal.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
            sb.append(Pattern.quote(strSubstring2));
        }
    }

    public static void d(Bundle bundle, String key, String str, C0783f c0783f) {
        if (c0783f == null) {
            bundle.putString(key, str);
            return;
        }
        AbstractC0777L abstractC0777L = c0783f.f9059a;
        kotlin.jvm.internal.i.e(key, "key");
        abstractC0777L.e(bundle, key, abstractC0777L.c(str));
    }

    public final boolean b(Matcher matcher, Bundle bundle, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = this.f9122d;
        ArrayList arrayList2 = new ArrayList(L3.l.a0(arrayList));
        Iterator it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i5 = i + 1;
            if (i < 0) {
                L3.k.Z();
                throw null;
            }
            String str = (String) next;
            String value = Uri.decode(matcher.group(i5));
            C0783f c0783f = (C0783f) linkedHashMap.get(str);
            try {
                kotlin.jvm.internal.i.d(value, "value");
                d(bundle, str, value, c0783f);
                arrayList2.add(K3.k.f2288a);
                i = i5;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [K3.c, java.lang.Object] */
    public final boolean c(Uri uri, Bundle bundle, LinkedHashMap linkedHashMap) {
        String query;
        v vVar = this;
        for (Map.Entry entry : ((Map) vVar.h.getValue()).entrySet()) {
            String str = (String) entry.getKey();
            s sVar = (s) entry.getValue();
            List<String> queryParameters = uri.getQueryParameters(str);
            if (vVar.i && (query = uri.getQuery()) != null && !query.equals(uri.toString())) {
                queryParameters = p1.b.B(query);
            }
            if (queryParameters != null) {
                for (String str2 : queryParameters) {
                    String str3 = sVar.f9111a;
                    Matcher matcher = str3 != null ? Pattern.compile(str3, 32).matcher(str2) : null;
                    int i = 0;
                    if (matcher == null || !matcher.matches()) {
                        return false;
                    }
                    Bundle bundle2 = new Bundle();
                    try {
                        ArrayList arrayList = sVar.f9112b;
                        ArrayList arrayList2 = new ArrayList(L3.l.a0(arrayList));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            Object next = it.next();
                            int i5 = i + 1;
                            if (i < 0) {
                                L3.k.Z();
                                throw null;
                            }
                            String str4 = (String) next;
                            String strGroup = matcher.group(i5);
                            if (strGroup == null) {
                                strGroup = "";
                            }
                            try {
                                C0783f c0783f = (C0783f) linkedHashMap.get(str4);
                                if (!bundle.containsKey(str4)) {
                                    if (!strGroup.equals('{' + str4 + '}')) {
                                        d(bundle2, str4, strGroup, c0783f);
                                    }
                                } else if (c0783f != null) {
                                    AbstractC0777L abstractC0777L = c0783f.f9059a;
                                    Object objA = abstractC0777L.a(bundle, str4);
                                    if (!bundle.containsKey(str4)) {
                                        throw new IllegalArgumentException("There is no previous value in this bundle.");
                                    }
                                    abstractC0777L.e(bundle, str4, abstractC0777L.d(strGroup, objA));
                                } else {
                                    continue;
                                }
                                arrayList2.add(K3.k.f2288a);
                                i = i5;
                            } catch (IllegalArgumentException unused) {
                                continue;
                            }
                        }
                        bundle.putAll(bundle2);
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
            vVar = this;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return kotlin.jvm.internal.i.a(this.f9119a, vVar.f9119a) && kotlin.jvm.internal.i.a(this.f9120b, vVar.f9120b) && kotlin.jvm.internal.i.a(this.f9121c, vVar.f9121c);
    }

    public final int hashCode() {
        String str = this.f9119a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f9120b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9121c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}

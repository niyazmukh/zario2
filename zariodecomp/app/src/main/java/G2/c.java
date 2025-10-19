package G2;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\G2\c.smali */
public final /* synthetic */ class c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1846a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1847b;

    public /* synthetic */ c(d dVar, int i) {
        this.f1846a = i;
        this.f1847b = dVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.f1846a) {
            case 0:
                d dVar = this.f1847b;
                synchronized (dVar) {
                    try {
                        l lVar = (l) dVar.f1848a.get();
                        ArrayList arrayListA = lVar.a();
                        synchronized (lVar) {
                            lVar.f1866a.a(new i(lVar, 0));
                        }
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListA.size(); i++) {
                            a aVar = (a) arrayListA.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", aVar.f1841a);
                            jSONObject.put("dates", new JSONArray((Collection) aVar.f1842b));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return string;
            default:
                d dVar2 = this.f1847b;
                synchronized (dVar2) {
                    final l lVar2 = (l) dVar2.f1848a.get();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strA = ((K2.b) dVar2.f1850c.get()).a();
                    synchronized (lVar2) {
                        final String strB = lVar2.b(jCurrentTimeMillis);
                        final a0.d dVarW = r1.d.W(strA);
                        lVar2.f1866a.a(new X3.l() { // from class: G2.h
                            @Override // X3.l
                            public final Object invoke(Object obj) {
                                l lVar3 = lVar2;
                                String str = strB;
                                String str2 = strA;
                                a0.d dVar3 = dVarW;
                                a0.b bVar = (a0.b) obj;
                                if (((String) r1.d.D(bVar, l.f1865d, "")).equals(str)) {
                                    a0.d dVarC = lVar3.c(bVar, str);
                                    if (dVarC == null || dVarC.f4022a.equals(str2)) {
                                        return null;
                                    }
                                    synchronized (lVar3) {
                                        lVar3.d(bVar, str);
                                        HashSet hashSet = new HashSet((Collection) r1.d.D(bVar, dVar3, new HashSet()));
                                        hashSet.add(str);
                                        bVar.f(dVar3, hashSet);
                                    }
                                    return null;
                                }
                                a0.d dVar4 = l.f1864c;
                                long jLongValue = ((Long) r1.d.D(bVar, dVar4, 0L)).longValue();
                                if (jLongValue + 1 == 30) {
                                    synchronized (lVar3) {
                                        try {
                                            long jLongValue2 = ((Long) r1.d.D(bVar, dVar4, 0L)).longValue();
                                            String str3 = "";
                                            Set hashSet2 = new HashSet();
                                            String str4 = null;
                                            for (Map.Entry entry : bVar.a().entrySet()) {
                                                if (entry.getValue() instanceof Set) {
                                                    Set<String> set = (Set) entry.getValue();
                                                    for (String str5 : set) {
                                                        if (str4 == null || str4.compareTo(str5) > 0) {
                                                            str3 = ((a0.d) entry.getKey()).f4022a;
                                                            str4 = str5;
                                                            hashSet2 = set;
                                                        }
                                                    }
                                                }
                                            }
                                            HashSet hashSet3 = new HashSet(hashSet2);
                                            hashSet3.remove(str4);
                                            bVar.f(r1.d.W(str3), hashSet3);
                                            jLongValue = jLongValue2 - 1;
                                            bVar.e(l.f1864c, Long.valueOf(jLongValue));
                                        } catch (Throwable th2) {
                                            throw th2;
                                        }
                                    }
                                }
                                HashSet hashSet4 = new HashSet((Collection) r1.d.D(bVar, dVar3, new HashSet()));
                                hashSet4.add(str);
                                bVar.f(dVar3, hashSet4);
                                bVar.e(l.f1864c, Long.valueOf(jLongValue + 1));
                                bVar.e(l.f1865d, str);
                                return null;
                            }
                        });
                    }
                }
                return null;
        }
    }
}

package p2;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzaao;
import com.google.android.gms.internal.p002firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k1.C0657a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\k.smali */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C0657a f9354a = new C0657a("JSONParser", new String[0]);

    public static ArrayList a(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objC = jSONArray.get(i);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static Map b(String str) {
        C.d(str);
        List<String> listZza = zzt.zza('.').zza((CharSequence) str);
        int size = listZza.size();
        C0657a c0657a = f9354a;
        if (size < 2) {
            c0657a.c(AbstractC0854a.b("Invalid idToken ", str), new Object[0]);
            return new HashMap();
        }
        String str2 = listZza.get(1);
        try {
            q.b bVarD = d(new String(str2 == null ? null : Base64.decode(str2, 11), "UTF-8"));
            return bVarD == null ? new HashMap() : bVarD;
        } catch (UnsupportedEncodingException e5) {
            c0657a.b("Unable to decode token", e5, new Object[0]);
            return new HashMap();
        }
    }

    public static q.b c(JSONObject jSONObject) throws JSONException {
        q.b bVar = new q.b();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objC = jSONObject.get(next);
            if (objC instanceof JSONArray) {
                objC = a((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            bVar.put(next, objC);
        }
        return bVar;
    }

    public static q.b d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return c(jSONObject);
            }
            return null;
        } catch (Exception e5) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zzaao(e5);
        }
    }
}

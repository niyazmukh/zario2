package p2;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\p2.1\r.smali */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9366a;

    static {
        HashMap map = new HashMap();
        f9366a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status a(String str) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("code");
            String string2 = jSONObject.getString("message");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                HashMap map = f9366a;
                if (map.containsKey(string)) {
                    return S0.f.s0(((String) map.get(string)) + ":" + string2);
                }
            }
            return S0.f.s0("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e5) {
            return S0.f.s0("WEB_INTERNAL_ERROR:" + str + "[ " + e5.getLocalizedMessage() + " ]");
        }
    }
}

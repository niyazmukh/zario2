package g1;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C;
import f1.C0493c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r.AbstractC0854a;

/* renamed from: g1.b, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\g1.1\b.smali */
public final class C0573b {

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantLock f7572c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    public static C0573b f7573d;

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f7574a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final SharedPreferences f7575b;

    public C0573b(Context context) {
        this.f7575b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static C0573b a(Context context) {
        C.f(context);
        ReentrantLock reentrantLock = f7572c;
        reentrantLock.lock();
        try {
            if (f7573d == null) {
                f7573d = new C0573b(context.getApplicationContext());
            }
            C0573b c0573b = f7573d;
            reentrantLock.unlock();
            return c0573b;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String g(String str, String str2) {
        return AbstractC0854a.c(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInAccount", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.c(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final GoogleSignInOptions c() {
        String strE;
        String strE2 = e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = e(g("googleSignInOptions", strE2))) == null) {
            return null;
        }
        try {
            return GoogleSignInOptions.c(strE);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final void d(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) throws JSONException {
        C.f(googleSignInAccount);
        C.f(googleSignInOptions);
        String str = googleSignInAccount.f5496m;
        f("defaultGoogleSignInAccount", str);
        String strG = g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f5489b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f5490c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f5491d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f5492e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f5498o;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f5499p;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f5493f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f5494k;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f5495l);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.f5497n;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, C0493c.f6996b);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f5529b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            f(strG, jSONObject.toString());
            String strG2 = g("googleSignInOptions", str);
            String str9 = googleSignInOptions.f5513l;
            String str10 = googleSignInOptions.f5512k;
            ArrayList arrayList2 = googleSignInOptions.f5507b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList2, GoogleSignInOptions.f5505s);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(((Scope) it.next()).f5529b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f5508c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.f5509d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f5511f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f5510e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                f(strG2, jSONObject2.toString());
            } catch (JSONException e5) {
                throw new RuntimeException(e5);
            }
        } catch (JSONException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f7574a;
        reentrantLock.lock();
        try {
            return this.f7575b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void f(String str, String str2) {
        ReentrantLock reentrantLock = this.f7574a;
        reentrantLock.lock();
        try {
            this.f7575b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}

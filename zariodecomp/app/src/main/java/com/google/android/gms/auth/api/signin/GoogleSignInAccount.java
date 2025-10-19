package com.google.android.gms.auth.api.signin;

import B.a;
import S0.f;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f1.C0494d;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\signin\GoogleSignInAccount.smali */
public class GoogleSignInAccount extends AbstractC0596a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C0494d(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f5488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5489b;

    /* renamed from: c, reason: collision with root package name */
    public final String f5490c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5491d;

    /* renamed from: e, reason: collision with root package name */
    public final String f5492e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f5493f;

    /* renamed from: k, reason: collision with root package name */
    public String f5494k;

    /* renamed from: l, reason: collision with root package name */
    public final long f5495l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5496m;

    /* renamed from: n, reason: collision with root package name */
    public final ArrayList f5497n;

    /* renamed from: o, reason: collision with root package name */
    public final String f5498o;

    /* renamed from: p, reason: collision with root package name */
    public final String f5499p;

    /* renamed from: q, reason: collision with root package name */
    public final HashSet f5500q = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j5, String str6, ArrayList arrayList, String str7, String str8) {
        this.f5488a = i;
        this.f5489b = str;
        this.f5490c = str2;
        this.f5491d = str3;
        this.f5492e = str4;
        this.f5493f = uri;
        this.f5494k = str5;
        this.f5495l = j5;
        this.f5496m = str6;
        this.f5497n = arrayList;
        this.f5498o = str7;
        this.f5499p = str8;
    }

    public static GoogleSignInAccount c(String str) throws JSONException, NumberFormatException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j5 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        C.d(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j5, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f5494k = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (googleSignInAccount.f5496m.equals(this.f5496m)) {
            HashSet hashSet = new HashSet(googleSignInAccount.f5497n);
            hashSet.addAll(googleSignInAccount.f5500q);
            HashSet hashSet2 = new HashSet(this.f5497n);
            hashSet2.addAll(this.f5500q);
            if (hashSet.equals(hashSet2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iF = a.f(527, 31, this.f5496m);
        HashSet hashSet = new HashSet(this.f5497n);
        hashSet.addAll(this.f5500q);
        return hashSet.hashCode() + iF;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5488a);
        f.n0(parcel, 2, this.f5489b, false);
        f.n0(parcel, 3, this.f5490c, false);
        f.n0(parcel, 4, this.f5491d, false);
        f.n0(parcel, 5, this.f5492e, false);
        f.m0(parcel, 6, this.f5493f, i, false);
        f.n0(parcel, 7, this.f5494k, false);
        f.u0(parcel, 8, 8);
        parcel.writeLong(this.f5495l);
        f.n0(parcel, 9, this.f5496m, false);
        f.r0(parcel, 10, this.f5497n, false);
        f.n0(parcel, 11, this.f5498o, false);
        f.n0(parcel, 12, this.f5499p, false);
        f.w0(iV0, parcel);
    }
}

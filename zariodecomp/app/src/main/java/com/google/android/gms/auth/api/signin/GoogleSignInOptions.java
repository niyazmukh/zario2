package com.google.android.gms.auth.api.signin;

import S0.f;
import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.internal.ReflectedParcelable;
import f1.C0493c;
import f1.C0494d;
import g1.C0572a;
import i1.AbstractC0596a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\signin\GoogleSignInOptions.smali */
public class GoogleSignInOptions extends AbstractC0596a implements e, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: o, reason: collision with root package name */
    public static final GoogleSignInOptions f5501o;

    /* renamed from: p, reason: collision with root package name */
    public static final Scope f5502p;

    /* renamed from: q, reason: collision with root package name */
    public static final Scope f5503q;

    /* renamed from: r, reason: collision with root package name */
    public static final Scope f5504r;

    /* renamed from: s, reason: collision with root package name */
    public static final C0493c f5505s;

    /* renamed from: a, reason: collision with root package name */
    public final int f5506a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5507b;

    /* renamed from: c, reason: collision with root package name */
    public final Account f5508c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5509d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5510e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f5511f;

    /* renamed from: k, reason: collision with root package name */
    public final String f5512k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5513l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f5514m;

    /* renamed from: n, reason: collision with root package name */
    public final String f5515n;

    static {
        Scope scope = new Scope(1, "profile");
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        f5502p = scope2;
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        f5503q = scope3;
        f5504r = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(f5504r)) {
            Scope scope4 = f5503q;
            if (hashSet.contains(scope4)) {
                hashSet.remove(scope4);
            }
        }
        f5501o = new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, map, null);
        HashSet hashSet2 = new HashSet();
        HashMap map2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(f5504r)) {
            Scope scope5 = f5503q;
            if (hashSet2.contains(scope5)) {
                hashSet2.remove(scope5);
            }
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, map2, null);
        CREATOR = new C0494d(1);
        f5505s = new C0493c(1);
    }

    public GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z4, boolean z5, boolean z6, String str, String str2, HashMap map, String str3) {
        this.f5506a = i;
        this.f5507b = arrayList;
        this.f5508c = account;
        this.f5509d = z4;
        this.f5510e = z5;
        this.f5511f = z6;
        this.f5512k = str;
        this.f5513l = str2;
        this.f5514m = new ArrayList(map.values());
        this.f5515n = str3;
    }

    public static GoogleSignInOptions c(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), null);
    }

    public static HashMap d(ArrayList arrayList) {
        HashMap map = new HashMap();
        if (arrayList == null) {
            return map;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0572a c0572a = (C0572a) it.next();
            map.put(Integer.valueOf(c0572a.f7570b), c0572a);
        }
        return map;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056 A[Catch: ClassCastException -> 0x007b, TryCatch #0 {ClassCastException -> 0x007b, blocks: (B:5:0x0008, B:7:0x0018, B:10:0x0021, B:12:0x0030, B:15:0x003c, B:21:0x0049, B:23:0x004f, B:29:0x005d, B:31:0x0063, B:33:0x0069, B:35:0x006f, B:26:0x0056, B:19:0x0043), top: B:41:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r0 = r8.f5512k
            java.util.ArrayList r1 = r8.f5507b
            r2 = 0
            if (r9 != 0) goto L8
            return r2
        L8:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r9 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r9     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r3 = r9.f5507b     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r4 = r9.f5512k     // Catch: java.lang.ClassCastException -> L7b
            android.accounts.Account r5 = r9.f5508c     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r6 = r8.f5514m     // Catch: java.lang.ClassCastException -> L7b
            int r6 = r6.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 > 0) goto L7b
            java.util.ArrayList r6 = r9.f5514m     // Catch: java.lang.ClassCastException -> L7b
            int r6 = r6.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 <= 0) goto L21
            goto L7b
        L21:
            int r6 = r1.size()     // Catch: java.lang.ClassCastException -> L7b
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r7.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            int r7 = r7.size()     // Catch: java.lang.ClassCastException -> L7b
            if (r6 != r7) goto L7b
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.ClassCastException -> L7b
            r6.<init>(r3)     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r1.containsAll(r6)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L3c
            goto L7b
        L3c:
            android.accounts.Account r1 = r8.f5508c     // Catch: java.lang.ClassCastException -> L7b
            if (r1 != 0) goto L43
            if (r5 != 0) goto L7b
            goto L49
        L43:
            boolean r1 = r1.equals(r5)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L7b
        L49:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.ClassCastException -> L7b
            if (r1 == 0) goto L56
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 == 0) goto L7b
            goto L5d
        L56:
            boolean r0 = r0.equals(r4)     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != 0) goto L5d
            goto L7b
        L5d:
            boolean r0 = r8.f5511f     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f5511f     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f5509d     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f5509d     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            boolean r0 = r8.f5510e     // Catch: java.lang.ClassCastException -> L7b
            boolean r1 = r9.f5510e     // Catch: java.lang.ClassCastException -> L7b
            if (r0 != r1) goto L7b
            java.lang.String r8 = r8.f5515n     // Catch: java.lang.ClassCastException -> L7b
            java.lang.String r9 = r9.f5515n     // Catch: java.lang.ClassCastException -> L7b
            boolean r8 = android.text.TextUtils.equals(r8, r9)     // Catch: java.lang.ClassCastException -> L7b
            if (r8 == 0) goto L7b
            r8 = 1
            return r8
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f5507b;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).f5529b);
        }
        Collections.sort(arrayList);
        int iHashCode = arrayList.hashCode() + (31 * 1);
        Account account = this.f5508c;
        int iHashCode2 = (iHashCode * 31) + (account == null ? 0 : account.hashCode());
        String str = this.f5512k;
        int iHashCode3 = (((((((iHashCode2 * 31) + (str == null ? 0 : str.hashCode())) * 31) + (this.f5511f ? 1 : 0)) * 31) + (this.f5509d ? 1 : 0)) * 31) + (this.f5510e ? 1 : 0);
        String str2 = this.f5515n;
        return (31 * iHashCode3) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iV0 = f.v0(20293, parcel);
        f.u0(parcel, 1, 4);
        parcel.writeInt(this.f5506a);
        f.r0(parcel, 2, new ArrayList(this.f5507b), false);
        f.m0(parcel, 3, this.f5508c, i, false);
        f.u0(parcel, 4, 4);
        parcel.writeInt(this.f5509d ? 1 : 0);
        f.u0(parcel, 5, 4);
        parcel.writeInt(this.f5510e ? 1 : 0);
        f.u0(parcel, 6, 4);
        parcel.writeInt(this.f5511f ? 1 : 0);
        f.n0(parcel, 7, this.f5512k, false);
        f.n0(parcel, 8, this.f5513l, false);
        f.r0(parcel, 9, this.f5514m, false);
        f.n0(parcel, 10, this.f5515n, false);
        f.w0(iV0, parcel);
    }
}

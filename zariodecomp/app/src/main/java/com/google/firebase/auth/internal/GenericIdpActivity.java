package com.google.firebase.auth.internal;

import B.a;
import H2.b;
import S0.e;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import g0.AbstractActivityC0570w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import l2.f;
import n0.C0762a;
import o1.AbstractC0794a;
import org.json.JSONException;
import org.json.JSONObject;
import p2.n;
import p2.r;
import p2.t;
import p2.v;
import p2.w;
import p2.x;

@KeepName
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\auth\internal\GenericIdpActivity.smali */
public class GenericIdpActivity extends AbstractActivityC0570w implements zzaes {

    /* renamed from: C, reason: collision with root package name */
    public static long f6387C;

    /* renamed from: D, reason: collision with root package name */
    public static final /* synthetic */ int f6388D = 0;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6389B = false;

    static {
        t tVar = t.f9367b;
    }

    public final Uri.Builder o(Uri.Builder builder, Intent intent, String str, String str2) throws JSONException {
        String string;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String strJoin = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            string = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string2 = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string2)) {
                        jSONObject.put(str3, string2);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            string = jSONObject.toString();
        }
        String string3 = UUID.randomUUID().toString();
        String strZza = zzaer.zza(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        v vVar = v.f9369a;
        Context applicationContext = getApplicationContext();
        String str4 = string;
        String str5 = strJoin;
        synchronized (vVar) {
            C.d(str);
            C.d(string3);
            C.d(strZza);
            C.d(stringExtra4);
            SharedPreferences sharedPreferencesA = v.a(applicationContext, str);
            v.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".SESSION_ID", strZza);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".OPERATION", action);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".PROVIDER_ID", stringExtra2);
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string3 + ".FIREBASE_APP_NAME", stringExtra4);
            editorEdit.putString("com.google.firebase.auth.api.gms.config.tenant.id", stringExtra3);
            editorEdit.apply();
        }
        String strA = w.c(getApplicationContext(), f.d(stringExtra4).e()).a();
        if (TextUtils.isEmpty(strA)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            p(S0.f.s0("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (strZza == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X" + stringExtra5).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", strZza).appendQueryParameter("eventId", string3).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("scopes", str5);
        }
        if (!TextUtils.isEmpty(str4)) {
            builder.appendQueryParameter("customParameters", str4);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: " + action);
            q();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f6387C < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f6387C = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6389B = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
        }
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onResume() {
        x xVar;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6389B) {
                q();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC0794a.a(AbstractC0794a.b(this, packageName)).toLowerCase(Locale.US);
                f fVarD = f.d(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarD);
                if (zzagl.zza(fVarD)) {
                    fVarD.a();
                    zza(o(Uri.parse(zzagl.zza(fVarD.f8773c.f8783a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f6381p);
                } else {
                    new zzaeq(packageName, lowerCase, getIntent(), fVarD, this).executeOnExecutor(firebaseAuth.f6384s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e5));
                zzaer.zzb(this, packageName);
            }
            this.f6389B = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            p(r.a(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            q();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        synchronized (v.f9369a) {
            C.d(packageName2);
            C.d(stringExtra2);
            SharedPreferences sharedPreferencesA = v.a(this, packageName2);
            String str = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".SESSION_ID";
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".PROVIDER_ID";
            String str4 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string = sharedPreferencesA.getString(str, null);
            String string2 = sharedPreferencesA.getString(str2, null);
            String string3 = sharedPreferencesA.getString(str3, null);
            String string4 = sharedPreferencesA.getString("com.google.firebase.auth.api.gms.config.tenant.id", null);
            String string5 = sharedPreferencesA.getString(str4, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str);
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.remove(str4);
            editorEdit.apply();
            xVar = (string == null || string2 == null || string3 == null) ? null : new x(string, string2, string3, string4, string5);
        }
        if (xVar == null) {
            q();
        }
        if (booleanExtra) {
            stringExtra = w.c(getApplicationContext(), f.d(xVar.f9378e).e()).b(stringExtra);
        }
        zzajb zzajbVar = new zzajb(xVar, stringExtra);
        String str5 = xVar.f9377d;
        String str6 = xVar.f9375b;
        zzajbVar.zzb(str5);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(str6) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(str6)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(str6));
            q();
            return;
        }
        f6387C = 0L;
        this.f6389B = false;
        Intent intent2 = new Intent();
        Parcel parcelObtain = Parcel.obtain();
        zzajbVar.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent2.putExtra("com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST", bArrMarshall);
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", str6);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent2);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        Parcel parcelObtain2 = Parcel.obtain();
        zzajbVar.writeToParcel(parcelObtain2, 0);
        byte[] bArrMarshall2 = parcelObtain2.marshall();
        parcelObtain2.recycle();
        editorEdit2.putString("verifyAssertionRequest", bArrMarshall2 != null ? Base64.encodeToString(bArrMarshall2, 10) : null);
        editorEdit2.putString("operation", str6);
        editorEdit2.putString("tenantId", str5);
        editorEdit2.putLong(UsageMonitoringWorker.OUTPUT_TIMESTAMP, System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f6389B);
    }

    public final void p(Status status) {
        f6387C = 0L;
        this.f6389B = false;
        Intent intent = new Intent();
        HashMap map = r.f9366a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent);
        n.a(getApplicationContext(), status);
        finish();
    }

    public final void q() {
        f6387C = 0L;
        this.f6389B = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent);
        n.a(this, S0.f.s0("WEB_CONTEXT_CANCELED"));
        finish();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final Uri.Builder zza(Intent intent, String str, String str2) {
        return o(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final String zza(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        String strZza = zzagi.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(strZza)) {
            return zzagl.zzb(str);
        }
        Log.e("GenericIdpActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(String str, Status status) {
        if (status == null) {
            q();
        } else {
            p(status);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final void zza(Uri uri, String str, b bVar) {
        a.p(bVar.get());
        Task taskForResult = Tasks.forResult(uri);
        e eVar = new e();
        eVar.f2851a = this;
        eVar.f2852b = str;
        taskForResult.addOnCompleteListener(eVar);
    }
}

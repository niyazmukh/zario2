package com.google.firebase.auth.internal;

import B.a;
import H2.b;
import S0.l;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zza;
import com.google.android.gms.internal.p002firebaseauthapi.zzaeq;
import com.google.android.gms.internal.p002firebaseauthapi.zzaer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaes;
import com.google.android.gms.internal.p002firebaseauthapi.zzafd;
import com.google.android.gms.internal.p002firebaseauthapi.zzagi;
import com.google.android.gms.internal.p002firebaseauthapi.zzagl;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.auth.FirebaseAuth;
import com.niyaz.zario.worker.UsageMonitoringWorker;
import g0.AbstractActivityC0570w;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.UUID;
import l2.f;
import n0.C0762a;
import o1.AbstractC0794a;
import p2.n;
import p2.r;
import p2.t;
import p2.v;
import p2.w;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\firebase\auth\internal\RecaptchaActivity.smali */
public class RecaptchaActivity extends AbstractActivityC0570w implements zzaes {

    /* renamed from: C, reason: collision with root package name */
    public static long f6390C;

    /* renamed from: D, reason: collision with root package name */
    public static final t f6391D = t.f9367b;

    /* renamed from: B, reason: collision with root package name */
    public boolean f6392B = false;

    public final Uri.Builder o(Uri.Builder builder, Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String string = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        f fVarD = f.d(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarD);
        v vVar = v.f9369a;
        Context applicationContext = getApplicationContext();
        synchronized (vVar) {
            C.d(str);
            C.d(string);
            SharedPreferences sharedPreferencesA = v.a(applicationContext, str);
            v.b(sharedPreferencesA);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            editorEdit.putString("com.google.firebase.auth.internal.EVENT_ID." + string + ".FIREBASE_APP_NAME", stringExtra3);
            editorEdit.apply();
        }
        String strA = w.c(getApplicationContext(), fVarD.e()).a();
        String strZza = null;
        if (TextUtils.isEmpty(strA)) {
            Log.e("RecaptchaActivity", "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
            p(S0.f.s0("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
            return null;
        }
        synchronized (firebaseAuth.f6374g) {
        }
        if (TextUtils.isEmpty(null)) {
            strZza = zzafd.zza();
        }
        builder.appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", strZza).appendQueryParameter("eventId", string).appendQueryParameter("v", "X" + stringExtra2).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", strA);
        return builder;
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("RecaptchaActivity", "Could not do operation - unknown action: " + action);
            q();
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - f6390C < 30000) {
            Log.e("RecaptchaActivity", "Could not start operation - already in progress");
            return;
        }
        f6390C = jCurrentTimeMillis;
        if (bundle != null) {
            this.f6392B = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onResume() {
        String str;
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f6392B) {
                q();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                String lowerCase = AbstractC0794a.a(AbstractC0794a.b(this, packageName)).toLowerCase(Locale.US);
                f fVarD = f.d(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME"));
                FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(fVarD);
                if (zzagl.zza(fVarD)) {
                    fVarD.a();
                    zza(o(Uri.parse(zzagl.zza(fVarD.f8773c.f8783a)).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName, firebaseAuth.f6381p);
                } else {
                    new zzaeq(packageName, lowerCase, intent, fVarD, this).executeOnExecutor(firebaseAuth.f6384s, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("RecaptchaActivity", "Could not get package signature: " + packageName + " " + String.valueOf(e5));
                zzaer.zzb(this, packageName);
            }
            this.f6392B = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            p(r.a(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            q();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        v vVar = v.f9369a;
        Context applicationContext = getApplicationContext();
        String packageName2 = getPackageName();
        String stringExtra2 = intent2.getStringExtra("eventId");
        synchronized (vVar) {
            C.d(packageName2);
            C.d(stringExtra2);
            SharedPreferences sharedPreferencesA = v.a(applicationContext, packageName2);
            String str2 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".OPERATION";
            str = null;
            String string = sharedPreferencesA.getString(str2, null);
            String str3 = "com.google.firebase.auth.internal.EVENT_ID." + stringExtra2 + ".FIREBASE_APP_NAME";
            String string2 = sharedPreferencesA.getString(str3, null);
            SharedPreferences.Editor editorEdit = sharedPreferencesA.edit();
            editorEdit.remove(str2);
            editorEdit.remove(str3);
            editorEdit.apply();
            if (!TextUtils.isEmpty(string)) {
                str = string2;
            }
        }
        if (TextUtils.isEmpty(str)) {
            Log.e("RecaptchaActivity", "Failed to find registration for this event - failing to prevent session injection.");
            p(S0.f.s0("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = w.c(getApplicationContext(), f.d(str).e()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f6390C = 0L;
        this.f6392B = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent3);
        SharedPreferences.Editor editorEdit2 = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        editorEdit2.putString("recaptchaToken", queryParameter);
        editorEdit2.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        editorEdit2.putLong(UsageMonitoringWorker.OUTPUT_TIMESTAMP, System.currentTimeMillis());
        editorEdit2.commit();
        finish();
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f6392B);
    }

    public final void p(Status status) {
        f6390C = 0L;
        this.f6392B = false;
        Intent intent = new Intent();
        HashMap map = r.f9366a;
        Parcel parcelObtain = Parcel.obtain();
        status.writeToParcel(parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        intent.putExtra("com.google.firebase.auth.internal.STATUS", bArrMarshall);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent);
        f6391D.f9368a.getClass();
        n.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        finish();
    }

    public final void q() {
        f6390C = 0L;
        this.f6392B = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        C0762a.a(this).b(intent);
        f6391D.f9368a.getClass();
        n.b(getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
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
        Log.e("RecaptchaActivity", "Found hermetic configuration for identityToolkit URL: " + strZza);
        return strZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaes
    public final HttpURLConnection zza(URL url) {
        try {
            return (HttpURLConnection) zza.zza().zza(url, "client-firebase-auth-api");
        } catch (IOException unused) {
            zzaes.zza.c("Error generating connection", new Object[0]);
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
        l lVar = new l(10);
        lVar.f2867b = this;
        lVar.f2868c = str;
        taskForResult.addOnCompleteListener(lVar);
    }
}

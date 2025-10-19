package com.google.android.gms.auth.api.signin.internal;

import K2.c;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.lifecycle.l0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import g0.AbstractActivityC0570w;
import g1.C0573b;
import g1.C0575d;
import g1.i;
import java.lang.reflect.Modifier;
import java.util.Set;
import l0.C0726a;
import l0.C0727b;
import l0.C0728c;
import q.C0835l;

@KeepName
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\auth\api\signin\internal\SignInHubActivity.smali */
public class SignInHubActivity extends AbstractActivityC0570w {
    public static boolean G;

    /* renamed from: B, reason: collision with root package name */
    public boolean f5521B = false;

    /* renamed from: C, reason: collision with root package name */
    public SignInConfiguration f5522C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f5523D;

    /* renamed from: E, reason: collision with root package name */
    public int f5524E;

    /* renamed from: F, reason: collision with root package name */
    public Intent f5525F;

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    public final void o() {
        C0728c c0728c = (C0728c) new l0(e(), C0728c.f8751c).a(C0728c.class);
        c cVar = new c(this, 21);
        if (c0728c.f8753b) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0835l c0835l = c0728c.f8752a;
        C0726a c0726a = (C0726a) c0835l.c(0, null);
        if (c0726a == null) {
            try {
                c0728c.f8753b = true;
                Set set = o.f5652a;
                synchronized (set) {
                }
                C0575d c0575d = new C0575d(this, set);
                if (C0575d.class.isMemberClass() && !Modifier.isStatic(C0575d.class.getModifiers())) {
                    throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + c0575d);
                }
                C0726a c0726a2 = new C0726a(c0575d);
                c0835l.e(0, c0726a2);
                c0728c.f8753b = false;
                C0727b c0727b = new C0727b(c0726a2.f8746l, cVar);
                c0726a2.d(this, c0727b);
                C0727b c0727b2 = c0726a2.f8748n;
                if (c0727b2 != null) {
                    c0726a2.i(c0727b2);
                }
                c0726a2.f8747m = this;
                c0726a2.f8748n = c0727b;
            } catch (Throwable th) {
                c0728c.f8753b = false;
                throw th;
            }
        } else {
            C0727b c0727b3 = new C0727b(c0726a.f8746l, cVar);
            c0726a.d(this, c0727b3);
            C0727b c0727b4 = c0726a.f8748n;
            if (c0727b4 != null) {
                c0726a.i(c0727b4);
            }
            c0726a.f8747m = this;
            c0726a.f8748n = c0727b3;
        }
        G = false;
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity
    public final void onActivityResult(int i, int i5, Intent intent) {
        GoogleSignInAccount googleSignInAccount;
        if (this.f5521B) {
            return;
        }
        setResult(0);
        if (i != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && (googleSignInAccount = signInAccount.f5517b) != null) {
                i iVarF = i.F(this);
                GoogleSignInOptions googleSignInOptions = this.f5522C.f5520b;
                synchronized (iVarF) {
                    ((C0573b) iVarF.f7594b).d(googleSignInAccount, googleSignInOptions);
                }
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", googleSignInAccount);
                this.f5523D = true;
                this.f5524E = i5;
                this.f5525F = intent;
                o();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                p(intExtra);
                return;
            }
        }
        p(8);
    }

    @Override // g0.AbstractActivityC0570w, b.AbstractActivityC0255l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        action.getClass();
        if ("com.google.android.gms.auth.NO_IMPL".equals(action)) {
            p(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        bundleExtra.getClass();
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f5522C = signInConfiguration;
        if (bundle != null) {
            boolean z4 = bundle.getBoolean("signingInGoogleApiClients");
            this.f5523D = z4;
            if (z4) {
                this.f5524E = bundle.getInt("signInResultCode");
                Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
                intent2.getClass();
                this.f5525F = intent2;
                o();
                return;
            }
            return;
        }
        if (G) {
            setResult(0);
            p(12502);
            return;
        }
        G = true;
        Intent intent3 = new Intent(action);
        if (action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent3.setPackage("com.google.android.gms");
        } else {
            intent3.setPackage(getPackageName());
        }
        intent3.putExtra("config", this.f5522C);
        try {
            startActivityForResult(intent3, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f5521B = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            p(17);
        }
    }

    @Override // g0.AbstractActivityC0570w, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        G = false;
    }

    @Override // b.AbstractActivityC0255l, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f5523D);
        if (this.f5523D) {
            bundle.putInt("signInResultCode", this.f5524E);
            bundle.putParcelable("signInResultData", this.f5525F);
        }
    }

    public final void p(int i) {
        Status status = new Status(i, null, null, null);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        G = false;
    }
}

package com.google.android.gms.common.internal;

import N2.j0;
import N2.n0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import o1.AbstractC0794a;
import q.C0834k;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\common\internal\v.smali */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final C0834k f5755a = new C0834k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f5756b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) p1.c.a(context).b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i == 1) {
            return resources.getString(2131886171, strA);
        }
        if (i == 2) {
            return AbstractC0794a.c(context) ? resources.getString(2131886181) : resources.getString(2131886178, strA);
        }
        if (i == 3) {
            return resources.getString(2131886168, strA);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", strA);
        }
        if (i == 9) {
            return resources.getString(2131886176, strA);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strA);
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return d(context, "common_google_play_services_sign_in_failed_text", strA);
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return resources.getString(2131886180, strA);
            default:
                return resources.getString(2131886175, strA);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(2131886172);
            case 2:
                return resources.getString(2131886179);
            case 3:
                return resources.getString(2131886169);
            case 4:
            case 6:
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) throws Resources.NotFoundException {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(2131886175);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        C0834k c0834k = f5755a;
        synchronized (c0834k) {
            try {
                Locale locale = I.h.a(context.getResources().getConfiguration()).get(0);
                if (!locale.equals(f5756b)) {
                    c0834k.clear();
                    f5756b = locale;
                }
                String str2 = (String) c0834k.getOrDefault(str, null);
                if (str2 != null) {
                    return str2;
                }
                int i = h1.h.f7638e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication == null) {
                    return null;
                }
                int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resourcesForApplication.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f5755a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

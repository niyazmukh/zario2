package o0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@M("activity")
/* renamed from: o0.c, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\o0.1\c.1.smali */
public class C0780c extends N {

    /* renamed from: c, reason: collision with root package name */
    public final Context f9054c;

    /* renamed from: d, reason: collision with root package name */
    public final Activity f9055d;

    public C0780c(Context context) {
        Object next;
        this.f9054c = context;
        Iterator it = d4.g.l0(context, C0779b.f9043b).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((Context) next) instanceof Activity) {
                    break;
                }
            }
        }
        this.f9055d = (Activity) next;
    }

    @Override // o0.N
    public final x a() {
        return new C0778a(this);
    }

    @Override // o0.N
    public final x c(x xVar, Bundle bundle, C0769D c0769d) {
        Intent intent;
        int intExtra;
        C0778a c0778a = (C0778a) xVar;
        if (c0778a.f9041o == null) {
            throw new IllegalStateException(("Destination " + c0778a.f9147l + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(c0778a.f9041o);
        if (bundle != null) {
            intent2.putExtras(bundle);
            String str = c0778a.f9042p;
            if (str != null && str.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(str);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + str);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        Activity activity = this.f9055d;
        if (activity == null) {
            intent2.addFlags(268435456);
        }
        if (c0769d != null && c0769d.f9006a) {
            intent2.addFlags(536870912);
        }
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra("android-support-navigation:ActivityNavigator:current", 0)) != 0) {
            intent2.putExtra("android-support-navigation:ActivityNavigator:source", intExtra);
        }
        intent2.putExtra("android-support-navigation:ActivityNavigator:current", c0778a.f9147l);
        Context context = this.f9054c;
        Resources resources = context.getResources();
        if (c0769d != null) {
            int i = c0769d.h;
            int i5 = c0769d.i;
            if ((i <= 0 || !kotlin.jvm.internal.i.a(resources.getResourceTypeName(i), "animator")) && (i5 <= 0 || !kotlin.jvm.internal.i.a(resources.getResourceTypeName(i5), "animator"))) {
                intent2.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", i);
                intent2.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", i5);
            } else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(i) + " and popExit resource " + resources.getResourceName(i5) + " when launching " + c0778a);
            }
        }
        context.startActivity(intent2);
        if (c0769d == null || activity == null) {
            return null;
        }
        int i6 = c0769d.f9011f;
        int i7 = c0769d.f9012g;
        if ((i6 <= 0 || !kotlin.jvm.internal.i.a(resources.getResourceTypeName(i6), "animator")) && (i7 <= 0 || !kotlin.jvm.internal.i.a(resources.getResourceTypeName(i7), "animator"))) {
            if (i6 < 0 && i7 < 0) {
                return null;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            activity.overridePendingTransition(i6, i7 >= 0 ? i7 : 0);
            return null;
        }
        Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(i6) + " and exit resource " + resources.getResourceName(i7) + "when launching " + c0778a);
        return null;
    }

    @Override // o0.N
    public final boolean j() {
        Activity activity = this.f9055d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}

package B;

import N2.j0;
import N2.n0;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.android.recaptcha.internal.zzln;
import g0.AbstractComponentCallbacksC0567t;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B\a.smali */
public abstract /* synthetic */ class a {
    public static final void a(View view, int i) {
        kotlin.jvm.internal.i.e(view, "view");
        int iC = t.h.c(i);
        if (iC == 0) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iC == 1) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iC == 2) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iC != 3) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }

    public static final boolean b(int i) {
        return i == 3 || i == 4 || i == 6;
    }

    public static int c(int i, int i5, int i6) {
        return (Integer.hashCode(i) + i5) * i6;
    }

    public static int d(int i, int i5, int i6, int i7) {
        return ((i * i5) / i6) + i7;
    }

    public static int e(int i, int i5, long j5) {
        return (Long.hashCode(j5) + i) * i5;
    }

    public static int f(int i, int i5, String str) {
        return (str.hashCode() + i) * i5;
    }

    public static String g(int i, String str) {
        return str + i;
    }

    public static String h(String str, int i, int i5, String str2) {
        return str + i + str2 + i5;
    }

    public static String i(String str, int i, String str2) {
        return str + i + str2;
    }

    public static String j(String str, AbstractComponentCallbacksC0567t abstractComponentCallbacksC0567t, String str2) {
        return str + abstractComponentCallbacksC0567t + str2;
    }

    public static String k(String str, String str2) {
        return str + str2;
    }

    public static String l(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String m(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder n(String str, int i, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static /* synthetic */ void p(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static int q(int i, int i5, int i6) {
        return zzln.zzA(i) + i5 + i6;
    }

    public static /* synthetic */ void r(int i, String str) {
        if (i != 0) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(kotlin.jvm.internal.i.g(str));
        kotlin.jvm.internal.i.h(nullPointerException, kotlin.jvm.internal.i.class.getName());
        throw nullPointerException;
    }

    public static /* synthetic */ String s(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "NULL";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String t(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String u(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }

    public static /* synthetic */ String v(int i) {
        return i != 1 ? i != 2 ? "null" : "PLAINTEXT" : "TLS";
    }

    public static /* synthetic */ String w(int i) {
        return i != 1 ? i != 2 ? "null" : "OUTBOUND" : "INBOUND";
    }

    public static /* synthetic */ String x(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String y(int i) {
        switch (i) {
            case 1:
                return "ENQUEUED";
            case 2:
                return "RUNNING";
            case 3:
                return "SUCCEEDED";
            case 4:
                return "FAILED";
            case 5:
                return "BLOCKED";
            case 6:
                return "CANCELLED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String z(int i) {
        switch (i) {
            case 1:
                return "NULL_VALUE";
            case 2:
                return "BOOLEAN_VALUE";
            case 3:
                return "INTEGER_VALUE";
            case 4:
                return "DOUBLE_VALUE";
            case 5:
                return "TIMESTAMP_VALUE";
            case 6:
                return "STRING_VALUE";
            case 7:
                return "BYTES_VALUE";
            case 8:
                return "REFERENCE_VALUE";
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "GEO_POINT_VALUE";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "ARRAY_VALUE";
            case 11:
                return "MAP_VALUE";
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                return "VALUETYPE_NOT_SET";
            default:
                return "null";
        }
    }
}

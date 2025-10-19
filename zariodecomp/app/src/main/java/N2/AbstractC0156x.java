package N2;

import W.InterfaceC0167i;
import X3.p;
import a.AbstractC0183a;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.gms.tasks.Task;
import f4.C0516n;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CancellationException;
import org.xmlpull.v1.XmlSerializer;
import r.AbstractC0854a;

/* renamed from: N2.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N2\x.1.smali */
public abstract class AbstractC0156x {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.google.android.gms.common.api.internal.F f2608a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.google.android.gms.common.api.internal.F f2609b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile com.google.android.gms.common.api.internal.F f2610c;

    public static D.f[] A(D.f[] fVarArr) {
        if (fVarArr == null) {
            return null;
        }
        D.f[] fVarArr2 = new D.f[fVarArr.length];
        for (int i = 0; i < fVarArr.length; i++) {
            D.f fVar = fVarArr[i];
            D.f fVar2 = new D.f();
            fVar2.f1269a = fVar.f1269a;
            float[] fArr = fVar.f1270b;
            fVar2.f1270b = l(fArr, fArr.length);
            fVarArr2[i] = fVar2;
        }
        return fVarArr2;
    }

    public static final Object B(InterfaceC0167i interfaceC0167i, p pVar, O3.d dVar) {
        return interfaceC0167i.g(new a0.h(pVar, null), dVar);
    }

    public static String C(B2.e eVar) {
        StringBuilder sb = new StringBuilder();
        int size = eVar.f309a.size();
        for (int i = 0; i < size; i++) {
            if (sb.length() > 0) {
                sb.append((char) 1);
                sb.append((char) 1);
            }
            String strG = eVar.g(i);
            int length = strG.length();
            for (int i5 = 0; i5 < length; i5++) {
                char cCharAt = strG.charAt(i5);
                if (cCharAt == 0) {
                    sb.append((char) 1);
                    sb.append((char) 16);
                } else if (cCharAt != 1) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) 1);
                    sb.append((char) 17);
                }
            }
        }
        sb.append((char) 1);
        sb.append((char) 1);
        return sb.toString();
    }

    public static q4.f D(String str) {
        kotlin.jvm.internal.i.e(str, "<this>");
        byte[] bytes = str.getBytes(e4.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        q4.f fVar = new q4.f(bytes);
        fVar.f9519c = str;
        return fVar;
    }

    public static void E(int i, Parcel parcel) {
        if (parcel.dataPosition() == i) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i);
        throw new B0.c(sb.toString(), parcel);
    }

    public static boolean F(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int G(Context context, int i, int i5) {
        Integer numValueOf;
        TypedValue typedValueO = p1.b.O(context, i);
        if (typedValueO != null) {
            int i6 = typedValueO.resourceId;
            numValueOf = Integer.valueOf(i6 != 0 ? B.l.getColor(context, i6) : typedValueO.data);
        } else {
            numValueOf = null;
        }
        return numValueOf != null ? numValueOf.intValue() : i5;
    }

    public static int H(Context context, int i, String str) {
        TypedValue typedValueQ = p1.b.Q(context, i, str);
        int i5 = typedValueQ.resourceId;
        return i5 != 0 ? B.l.getColor(context, i5) : typedValueQ.data;
    }

    public static int I(View view, int i) {
        Context context = view.getContext();
        TypedValue typedValueQ = p1.b.Q(view.getContext(), i, view.getClass().getCanonicalName());
        int i5 = typedValueQ.resourceId;
        return i5 != 0 ? B.l.getColor(context, i5) : typedValueQ.data;
    }

    public static String J(Context context, int i) throws Resources.NotFoundException {
        String strValueOf;
        kotlin.jvm.internal.i.e(context, "context");
        if (i <= 16777215) {
            return String.valueOf(i);
        }
        try {
            strValueOf = context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            strValueOf = String.valueOf(i);
        }
        kotlin.jvm.internal.i.d(strValueOf, "try {\n                co….toString()\n            }");
        return strValueOf;
    }

    public static float K(String[] strArr, int i) throws NumberFormatException {
        float f2 = Float.parseFloat(strArr[i]);
        if (f2 >= 0.0f && f2 <= 1.0f) {
            return f2;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + f2);
    }

    public static String L(Class cls) {
        LinkedHashMap linkedHashMap = o0.O.f9036b;
        String strValue = (String) linkedHashMap.get(cls);
        if (strValue == null) {
            o0.M m5 = (o0.M) cls.getAnnotation(o0.M.class);
            strValue = m5 != null ? m5.value() : null;
            if (strValue == null || strValue.length() <= 0) {
                throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(cls.getSimpleName()).toString());
            }
            linkedHashMap.put(cls, strValue);
        }
        kotlin.jvm.internal.i.b(strValue);
        return strValue;
    }

    public static final int M(int i, int i5, int i6) {
        if (i6 > 0) {
            if (i >= i5) {
                return i5;
            }
            int i7 = i5 % i6;
            if (i7 < 0) {
                i7 += i6;
            }
            int i8 = i % i6;
            if (i8 < 0) {
                i8 += i6;
            }
            int i9 = (i7 - i8) % i6;
            if (i9 < 0) {
                i9 += i6;
            }
            return i5 - i9;
        }
        if (i6 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        }
        if (i <= i5) {
            return i5;
        }
        int i10 = -i6;
        int i11 = i % i10;
        if (i11 < 0) {
            i11 += i10;
        }
        int i12 = i5 % i10;
        if (i12 < 0) {
            i12 += i10;
        }
        int i13 = (i11 - i12) % i10;
        if (i13 < 0) {
            i13 += i10;
        }
        return i5 + i13;
    }

    public static String N(int i) {
        switch (i) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case 11:
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
                sb.append("unknown status code: ");
                sb.append(i);
                return sb.toString();
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case n0.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return "API_NOT_CONNECTED";
            case n0.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }

    public static boolean O(int i) {
        boolean z4;
        if (i != 0) {
            ThreadLocal threadLocal = D.a.f1263a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int iRed = Color.red(i);
            int iGreen = Color.green(i);
            int iBlue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d5 = iRed / 255.0d;
            double dPow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
            double d6 = iGreen / 255.0d;
            double dPow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
            double d7 = iBlue / 255.0d;
            double dPow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
            z4 = false;
            dArr[0] = ((0.1805d * dPow3) + (0.3576d * dPow2) + (0.4124d * dPow)) * 100.0d;
            double d8 = ((0.0722d * dPow3) + (0.7152d * dPow2) + (0.2126d * dPow)) * 100.0d;
            dArr[1] = d8;
            dArr[2] = ((dPow3 * 0.9505d) + (dPow2 * 0.1192d) + (dPow * 0.0193d)) * 100.0d;
            if (d8 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z4 = false;
        }
        return z4;
    }

    public static boolean P(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static int Q(int i, int i5, float f2) {
        return D.a.b(D.a.d(i5, Math.round(Color.alpha(i5) * f2)), i);
    }

    public static void R(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static void U(Context context, String str) throws IOException {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
            try {
                try {
                    xmlSerializerNewSerializer.setOutput(fileOutputStreamOpenFileOutput, null);
                    xmlSerializerNewSerializer.startDocument("UTF-8", Boolean.TRUE);
                    xmlSerializerNewSerializer.startTag(null, "locales");
                    xmlSerializerNewSerializer.attribute(null, "application_locales", str);
                    xmlSerializerNewSerializer.endTag(null, "locales");
                    xmlSerializerNewSerializer.endDocument();
                    Log.d("AppLocalesStorageHelper", "Storing App Locales : app-locales: " + str + " persisted successfully.");
                } catch (Exception e5) {
                    Log.w("AppLocalesStorageHelper", "Storing App Locales : Failed to persist app-locales: ".concat(str), e5);
                    if (fileOutputStreamOpenFileOutput != null) {
                    }
                }
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused) {
                    }
                }
            } catch (Throwable th) {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
            Log.w("AppLocalesStorageHelper", "Storing App Locales : FileNotFoundException: Cannot open file androidx.appcompat.app.AppCompatDelegate.application_locales_record_file for writing ");
        }
    }

    public static boolean V(int i, Parcel parcel) {
        i0(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static Double W(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        if (iC0 == 0) {
            return null;
        }
        j0(parcel, iC0, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static int X(int i, Parcel parcel) {
        i0(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer Y(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        if (iC0 == 0) {
            return null;
        }
        j0(parcel, iC0, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        r2 = r4.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String Z(android.content.Context r9) throws java.io.IOException {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = "AppLocalesStorageHelper"
            java.lang.String r2 = ""
            java.io.FileInputStream r3 = r9.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L6b
            org.xmlpull.v1.XmlPullParser r4 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r5 = "UTF-8"
            r4.setInput(r3, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            int r5 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L17:
            int r6 = r4.next()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            r7 = 1
            if (r6 == r7) goto L43
            r7 = 3
            if (r6 != r7) goto L2a
            int r8 = r4.getDepth()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r8 <= r5) goto L43
            goto L2a
        L28:
            r9 = move-exception
            goto L65
        L2a:
            if (r6 == r7) goto L17
            r7 = 4
            if (r6 != r7) goto L30
            goto L17
        L30:
            java.lang.String r6 = r4.getName()     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            java.lang.String r7 = "locales"
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
            if (r6 == 0) goto L17
            java.lang.String r5 = "application_locales"
            r6 = 0
            java.lang.String r2 = r4.getAttributeValue(r6, r5)     // Catch: java.lang.Throwable -> L28 java.lang.Throwable -> L49
        L43:
            if (r3 == 0) goto L51
        L45:
            r3.close()     // Catch: java.io.IOException -> L51
            goto L51
        L49:
            java.lang.String r4 = "Reading app Locales : Unable to parse through file :androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r4)     // Catch: java.lang.Throwable -> L28
            if (r3 == 0) goto L51
            goto L45
        L51:
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L61
            java.lang.String r9 = "Reading app Locales : Locales read from file: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file , appLocales: "
            java.lang.String r9 = r9.concat(r2)
            android.util.Log.d(r1, r9)
            goto L64
        L61:
            r9.deleteFile(r0)
        L64:
            return r2
        L65:
            if (r3 == 0) goto L6a
            r3.close()     // Catch: java.io.IOException -> L6a
        L6a:
            throw r9
        L6b:
            java.lang.String r9 = "Reading app Locales : Locales record file not found: androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            android.util.Log.w(r1, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.AbstractC0156x.Z(android.content.Context):java.lang.String");
    }

    public static final Map a(Y2.d dVar) {
        return L3.x.c0(new K3.e("planLabel", dVar.f3900e), new K3.e("goalTimeMs", Long.valueOf(dVar.f3901f)), new K3.e("dailyAverageMs", Long.valueOf(dVar.f3902g)), new K3.e("finalUsageMs", Long.valueOf(dVar.h)), new K3.e("evaluationStartTime", Long.valueOf(dVar.i)), new K3.e("evaluationEndTime", Long.valueOf(dVar.f3903j)), new K3.e("metGoal", Boolean.valueOf(dVar.f3904k)), new K3.e("pointsDelta", Integer.valueOf(dVar.f3905l)), new K3.e("pointsBalanceAfter", Integer.valueOf(dVar.f3906m)));
    }

    public static long a0(int i, Parcel parcel) {
        i0(parcel, i, 8);
        return parcel.readLong();
    }

    public static final Map b(Y2.f fVar) {
        return L3.x.c0(new K3.e("planLabel", fVar.f3917e), new K3.e("cycleStartTime", Long.valueOf(fVar.f3918f)), new K3.e("hourStartTime", Long.valueOf(fVar.f3919g)), new K3.e("hourEndTime", Long.valueOf(fVar.h)), new K3.e("packageName", fVar.i), new K3.e("usageMs", Long.valueOf(fVar.f3920j)));
    }

    public static Long b0(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        if (iC0 == 0) {
            return null;
        }
        j0(parcel, iC0, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static void c(Throwable th, Throwable exception) {
        kotlin.jvm.internal.i.e(th, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th != exception) {
            Integer num = T3.a.f3262a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(exception);
                return;
            }
            Method method = S3.a.f3121a;
            if (method != null) {
                method.invoke(th, exception);
            }
        }
    }

    public static int c0(int i, Parcel parcel) {
        return (i & (-65536)) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    public static void d(StringBuilder sb, Object obj, X3.l lVar) {
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    public static int d0(Context context, int i, int i5) {
        TypedValue typedValueO = p1.b.O(context, i);
        return (typedValueO == null || typedValueO.type != 16) ? i5 : typedValueO.data;
    }

    public static final Object e(Task task, O3.d dVar) throws Exception {
        if (!task.isComplete()) {
            C0516n c0516n = new C0516n(1, p1.b.x(dVar));
            c0516n.s();
            task.addOnCompleteListener(p4.a.f9388a, new h1.i(c0516n, 21));
            Object objR = c0516n.r();
            P3.a aVar = P3.a.f2678a;
            return objR;
        }
        Exception exception = task.getException();
        if (exception != null) {
            throw exception;
        }
        if (!task.isCanceled()) {
            return task.getResult();
        }
        throw new CancellationException("Task " + task + " was cancelled normally.");
    }

    public static TimeInterpolator e0(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!P(strValueOf, "cubic-bezier") && !P(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (P(strValueOf, "cubic-bezier")) {
            String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
            if (strArrSplit.length == 4) {
                return O.a.b(K(strArrSplit, 0), K(strArrSplit, 1), K(strArrSplit, 2), K(strArrSplit, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + strArrSplit.length);
        }
        if (!P(strValueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(strValueOf));
        }
        String strSubstring = strValueOf.substring(5, strValueOf.length() - 1);
        Path path = new Path();
        D.f[] fVarArrS = s(strSubstring);
        if (fVarArrS != null) {
            try {
                D.f.b(fVarArrS, path);
            } catch (RuntimeException e5) {
                throw new RuntimeException(AbstractC0854a.b("Error in parsing ", strSubstring), e5);
            }
        } else {
            path = null;
        }
        return O.a.c(path);
    }

    public static M3.i f(M3.i iVar) {
        M3.f fVar = iVar.f2526a;
        fVar.b();
        return fVar.f2517m > 0 ? iVar : M3.i.f2525b;
    }

    public static void f0(View view, X1.h hVar) {
        O1.a aVar = hVar.f3738a.f3723b;
        if (aVar == null || !aVar.f2635a) {
            return;
        }
        float fI = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = M.S.f2363a;
            fI += M.H.i((View) parent);
        }
        X1.g gVar = hVar.f3738a;
        if (gVar.f3731l != fI) {
            gVar.f3731l = fI;
            hVar.t();
        }
    }

    public static void g(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=" + obj2);
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj + "=null");
    }

    public static void g0(int i, Parcel parcel) {
        parcel.setDataPosition(parcel.dataPosition() + c0(i, parcel));
    }

    public static void h(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    public static int h0(Parcel parcel) {
        int i = parcel.readInt();
        int iC0 = c0(i, parcel);
        char c5 = (char) i;
        int iDataPosition = parcel.dataPosition();
        if (c5 != 20293) {
            throw new B0.c("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(i))), parcel);
        }
        int i5 = iC0 + iDataPosition;
        if (i5 >= iDataPosition && i5 <= parcel.dataSize()) {
            return i5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(iDataPosition).length() + 32 + String.valueOf(i5).length());
        sb.append("Size read is invalid start=");
        sb.append(iDataPosition);
        sb.append(" end=");
        sb.append(i5);
        throw new B0.c(sb.toString(), parcel);
    }

    public static void i(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i0(Parcel parcel, int i, int i5) {
        int iC0 = c0(i, parcel);
        if (iC0 == i5) {
            return;
        }
        String hexString = Integer.toHexString(iC0);
        int length = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(iC0).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(iC0);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new B0.c(sb.toString(), parcel);
    }

    public static int j(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static void j0(Parcel parcel, int i, int i5) {
        if (i == i5) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i5).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i5);
        sb.append(" got ");
        sb.append(i);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new B0.c(sb.toString(), parcel);
    }

    public static int k(int i, int i5) {
        return D.a.d(i, (Color.alpha(i) * i5) / 255);
    }

    public static float[] l(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int iMin = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, iMin);
        return fArr2;
    }

    public static void m(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i = inputStream.read(bArr);
        while (i >= 0) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = inputStream.read(bArr);
        }
    }

    public static BigDecimal n(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int i5 = parcel.readInt();
        parcel.setDataPosition(iDataPosition + iC0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), i5);
    }

    public static Bundle o(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iC0);
        return bundle;
    }

    public static byte[] p(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iC0);
        return bArrCreateByteArray;
    }

    public static r1.d q(int i) {
        if (i != 0 && i == 1) {
            return new X1.d();
        }
        return new X1.k();
    }

    public static int[] r(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iC0);
        return iArrCreateIntArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b A[Catch: NumberFormatException -> 0x00af, LOOP:3: B:29:0x006d->B:48:0x009b, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:48:0x009b, B:50:0x00a1, B:56:0x00b6, B:57:0x00b9), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:48:0x009b, B:50:0x00a1, B:56:0x00b6, B:57:0x00b9), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b6 A[Catch: NumberFormatException -> 0x00af, TryCatch #0 {NumberFormatException -> 0x00af, blocks: (B:26:0x0059, B:29:0x006d, B:31:0x0073, B:35:0x007f, B:48:0x009b, B:50:0x00a1, B:56:0x00b6, B:57:0x00b9), top: B:71:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x009a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static D.f[] s(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: N2.AbstractC0156x.s(java.lang.String):D.f[]");
    }

    public static Parcelable t(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iC0);
        return parcelable;
    }

    public static String u(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iC0);
        return string;
    }

    public static String[] v(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iC0);
        return strArrCreateStringArray;
    }

    public static ArrayList w(int i, Parcel parcel) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iC0);
        return arrayListCreateStringArrayList;
    }

    public static Object[] x(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iC0);
        return objArrCreateTypedArray;
    }

    public static ArrayList y(Parcel parcel, int i, Parcelable.Creator creator) {
        int iC0 = c0(i, parcel);
        int iDataPosition = parcel.dataPosition();
        if (iC0 == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iC0);
        return arrayListCreateTypedArrayList;
    }

    public static B2.n z(String str) {
        List listEmptyList;
        int length = str.length();
        AbstractC0183a.N(length >= 2, "Invalid path \"%s\"", str);
        if (length == 2) {
            AbstractC0183a.N(str.charAt(0) == 1 && str.charAt(1) == 1, "Non-empty path \"%s\" had length 2", str);
            listEmptyList = Collections.emptyList();
        } else {
            int length2 = str.length() - 2;
            ArrayList arrayList = new ArrayList();
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < length) {
                int iIndexOf = str.indexOf(1, i);
                if (iIndexOf < 0 || iIndexOf > length2) {
                    throw new IllegalArgumentException(B.a.l("Invalid encoded resource path: \"", str, "\""));
                }
                int i5 = iIndexOf + 1;
                char cCharAt = str.charAt(i5);
                if (cCharAt == 1) {
                    String strSubstring = str.substring(i, iIndexOf);
                    if (sb.length() != 0) {
                        sb.append(strSubstring);
                        strSubstring = sb.toString();
                        sb.setLength(0);
                    }
                    arrayList.add(strSubstring);
                } else if (cCharAt == 16) {
                    sb.append(str.substring(i, iIndexOf));
                    sb.append((char) 0);
                } else {
                    if (cCharAt != 17) {
                        throw new IllegalArgumentException(B.a.l("Invalid encoded resource path: \"", str, "\""));
                    }
                    sb.append(str.substring(i, i5));
                }
                i = iIndexOf + 2;
            }
            listEmptyList = arrayList;
        }
        B2.n nVar = B2.n.f332b;
        return listEmptyList.isEmpty() ? B2.n.f332b : new B2.n(listEmptyList);
    }

    public abstract void S(int i);

    public abstract void T(Typeface typeface, boolean z4);
}

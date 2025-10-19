package a;

import E.b;
import I.d;
import J0.t;
import K0.o;
import K3.e;
import L.c;
import L3.x;
import M.A;
import M.B;
import M.S;
import N2.j0;
import N2.n0;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.datastore.preferences.protobuf.C0204g;
import c0.p;
import c0.q;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.C;
import com.google.android.gms.internal.p002firebaseauthapi.zzahy;
import com.google.android.gms.internal.p002firebaseauthapi.zzaiz;
import com.google.android.material.datepicker.D;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import e4.m;
import g2.AbstractC0582e;
import h4.g;
import h4.j;
import h4.k;
import h4.r;
import i1.InterfaceC0597b;
import java.io.File;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.i;
import o0.AbstractC0777L;
import o2.C0796B;
import o2.y;
import org.xmlpull.v1.XmlPullParserException;
import q2.C0849a;
import q2.h;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\a.1\a.smali */
public abstract class AbstractC0183a {
    public static String A(String email) throws NoSuchAlgorithmException {
        i.e(email, "email");
        if (m.q0(email)) {
            return "";
        }
        String lowerCase = m.A0(email).toString().toLowerCase(Locale.ROOT);
        i.d(lowerCase, "toLowerCase(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = lowerCase.getBytes(e4.a.a);
        i.d(bytes, "getBytes(...)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b5 : bArrDigest) {
            sb.append(String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b5)}, 1)));
        }
        String string = sb.toString();
        i.d(string, "toString(...)");
        return string;
    }

    public static c B(Long l4, Long l5) {
        c cVar;
        if (l4 == null && l5 == null) {
            return new c((Object) null, (Object) null);
        }
        if (l4 == null) {
            cVar = new c((Object) null, C(l5.longValue()));
        } else {
            if (l5 != null) {
                Calendar calendarD = D.d();
                Calendar calendarE = D.e(null);
                calendarE.setTimeInMillis(l4.longValue());
                Calendar calendarE2 = D.e(null);
                calendarE2.setTimeInMillis(l5.longValue());
                return calendarE.get(1) == calendarE2.get(1) ? calendarE.get(1) == calendarD.get(1) ? new c(I(l4.longValue(), Locale.getDefault()), I(l5.longValue(), Locale.getDefault())) : new c(I(l4.longValue(), Locale.getDefault()), M(l5.longValue(), Locale.getDefault())) : new c(M(l4.longValue(), Locale.getDefault()), M(l5.longValue(), Locale.getDefault()));
            }
            cVar = new c(C(l4.longValue()), (Object) null);
        }
        return cVar;
    }

    public static String C(long j5) {
        Calendar calendarD = D.d();
        Calendar calendarE = D.e(null);
        calendarE.setTimeInMillis(j5);
        return calendarD.get(1) == calendarE.get(1) ? I(j5, Locale.getDefault()) : M(j5, Locale.getDefault());
    }

    public static String I(long j5, Locale locale) {
        return D.b("MMMd", locale).format(new Date(j5));
    }

    public static String M(long j5, Locale locale) {
        return D.b("yMMMd", locale).format(new Date(j5));
    }

    public static void N(boolean z4, String str, Object... objArr) {
        if (z4) {
            return;
        }
        z(str, objArr);
        throw null;
    }

    public static void O(Object obj, String str, Object... objArr) {
        if (obj != null) {
            return;
        }
        z(str, objArr);
        throw null;
    }

    public static boolean P(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i5 = rect.right;
            int i6 = rect2.right;
            return (i5 > i6 || rect.left >= i6) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i7 = rect.bottom;
            int i8 = rect2.bottom;
            return (i7 > i8 || rect.top >= i8) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i9 = rect.left;
            int i10 = rect2.left;
            return (i9 < i10 || rect.right <= i10) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        return (i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom;
    }

    public static boolean R(String str) {
        int i = AbstractC0582e.f7602a;
        return str == null || str.isEmpty();
    }

    public static String U(String str, Object... objArr) {
        int iIndexOf;
        String string;
        String strValueOf = String.valueOf(str);
        int i = 0;
        for (int i5 = 0; i5 < objArr.length; i5++) {
            Object obj = objArr[i5];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    Logger.getLogger("com.google.common.base.Strings").log(Level.WARNING, "Exception during lenientFormat for " + str2, (Throwable) e5);
                    StringBuilder sbO = B.a.o("<", str2, " threw ");
                    sbO.append(e5.getClass().getName());
                    sbO.append(">");
                    string = sbO.toString();
                }
            }
            objArr[i5] = string;
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i6 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i6)) != -1) {
            sb.append((CharSequence) strValueOf, i6, iIndexOf);
            sb.append(objArr[i]);
            i6 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i6, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i7 = i + 1; i7 < objArr.length; i7++) {
                sb.append(", ");
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int V(int i, Rect rect, Rect rect2) {
        int i5;
        int i6;
        if (i == 17) {
            i5 = rect.left;
            i6 = rect2.right;
        } else if (i == 33) {
            i5 = rect.top;
            i6 = rect2.bottom;
        } else if (i == 66) {
            i5 = rect2.left;
            i6 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i5 = rect2.top;
            i6 = rect.bottom;
        }
        return Math.max(0, i5 - i6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.Map] */
    public static final void W(Context context) {
        LinkedHashMap linkedHashMapB0;
        i.e(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        i.d(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            t.d().a(o.f2165a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            i.d(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File file = new File(K0.a.f2120a.a(context), "androidx.work.workdb");
            String[] strArr = o.f2166b;
            int iA0 = x.a0(strArr.length);
            if (iA0 < 16) {
                iA0 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA0);
            for (String str : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
            }
            e eVar = new e(databasePath2, file);
            if (linkedHashMap.isEmpty()) {
                linkedHashMapB0 = x.b0(eVar);
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, file);
                linkedHashMapB0 = linkedHashMap2;
            }
            for (Map.Entry entry : linkedHashMapB0.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        t.d().g(o.f2165a, "Over-writing contents of " + file3);
                    }
                    t.d().a(o.f2165a, file2.renameTo(file3) ? "Migrated " + file2 + "to " + file3 : "Renaming " + file2 + " to " + file3 + " failed");
                }
            }
        }
    }

    public static int X(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static g c(int i, int i5, h4.a aVar) {
        g rVar;
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            aVar = h4.a.f7766a;
        }
        if (i != -2) {
            if (i == -1) {
                if (aVar == h4.a.f7766a) {
                    return new r(1, h4.a.f7767b, null);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            }
            if (i == 0) {
                rVar = aVar == h4.a.f7766a ? new g(0, null) : new r(1, aVar, null);
            } else {
                if (i != Integer.MAX_VALUE) {
                    return aVar == h4.a.f7766a ? new g(i, null) : new r(i, aVar, null);
                }
                rVar = new g(f.API_PRIORITY_OTHER, null);
            }
        } else if (aVar == h4.a.f7766a) {
            k.f7814j.getClass();
            rVar = new g(j.f7813b, null);
        } else {
            rVar = new r(1, aVar, null);
        }
        return rVar;
    }

    public static void c0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor());
        Drawable drawableMutate = drawable.mutate();
        b.h(drawableMutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(drawableMutate);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0082 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0085 -> B:25:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(java.util.List r6, W.C0170l r7, Q3.c r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof W.C0164f
            if (r0 == 0) goto L13
            r0 = r8
            W.f r0 = (W.C0164f) r0
            int r1 = r0.f3595d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3595d = r1
            goto L18
        L13:
            W.f r0 = new W.f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f3594c
            P3.a r1 = P3.a.f2678a
            int r2 = r0.f3595d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Iterator r6 = r0.f3593b
            java.io.Serializable r7 = r0.f3592a
            kotlin.jvm.internal.r r7 = (kotlin.jvm.internal.r) r7
            m0(r8)     // Catch: java.lang.Throwable -> L30
            goto L65
        L30:
            r8 = move-exception
            goto L7e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.io.Serializable r6 = r0.f3592a
            java.util.List r6 = (java.util.List) r6
            m0(r8)
            goto L5c
        L42:
            m0(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            W.h r2 = new W.h
            r5 = 0
            r2.<init>(r6, r8, r5)
            r0.f3592a = r8
            r0.f3595d = r4
            java.lang.Object r6 = r7.a(r2, r0)
            if (r6 != r1) goto L5b
            goto L93
        L5b:
            r6 = r8
        L5c:
            kotlin.jvm.internal.r r7 = new kotlin.jvm.internal.r
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L65:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L8b
            java.lang.Object r8 = r6.next()
            X3.l r8 = (X3.l) r8
            r0.f3592a = r7     // Catch: java.lang.Throwable -> L30
            r0.f3593b = r6     // Catch: java.lang.Throwable -> L30
            r0.f3595d = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r1) goto L65
            goto L93
        L7e:
            java.lang.Object r2 = r7.f8431a
            if (r2 != 0) goto L85
            r7.f8431a = r8
            goto L65
        L85:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            N2.AbstractC0156x.c(r2, r8)
            goto L65
        L8b:
            java.lang.Object r6 = r7.f8431a
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            if (r6 != 0) goto L94
            K3.k r1 = K3.k.f2288a
        L93:
            return r1
        L94:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0183a.d(java.util.List, W.l, Q3.c):java.lang.Object");
    }

    public static void f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                b.h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] iArrCopyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, iArrCopyOf, length, drawableState2.length);
                b.h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(iArrCopyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                b.i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean h(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = i(r9, r10, r11)
            boolean r1 = i(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L78
            if (r0 != 0) goto Lf
            goto L78
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3d
            if (r9 == r3) goto L36
            if (r9 == r4) goto L2f
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L77
            goto L43
        L29:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L2f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L77
            goto L43
        L36:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L77
            goto L43
        L3d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L77
        L43:
            if (r9 == r5) goto L77
            if (r9 != r4) goto L48
            goto L77
        L48:
            int r11 = V(r9, r10, r11)
            if (r9 == r5) goto L6a
            if (r9 == r3) goto L65
            if (r9 == r4) goto L60
            if (r9 != r1) goto L5a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L58:
            int r9 = r9 - r10
            goto L6f
        L5a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L60:
            int r9 = r12.right
            int r10 = r10.right
            goto L58
        L65:
            int r9 = r10.top
            int r10 = r12.top
            goto L58
        L6a:
            int r9 = r10.left
            int r10 = r12.left
            goto L58
        L6f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L76
            r2 = r6
        L76:
            return r2
        L77:
            return r6
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a.AbstractC0183a.h(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static void h0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = S.f2363a;
        boolean zA = A.a(checkableImageButton);
        boolean z4 = onLongClickListener != null;
        boolean z5 = zA || z4;
        checkableImageButton.setFocusable(z5);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z4);
        B.s(checkableImageButton, z5 ? 1 : 2);
    }

    public static boolean i(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static void i0(EditorInfo editorInfo, CharSequence charSequence, int i, int i5) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i5);
    }

    public static final Bundle j(e... eVarArr) {
        Bundle bundle = new Bundle(eVarArr.length);
        for (e eVar : eVarArr) {
            String str = (String) eVar.f2277a;
            Object obj = eVar.f2278b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                i.b(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                I.c.a(bundle, str, (IBinder) obj);
            } else if (obj instanceof Size) {
                d.a(bundle, str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                d.b(bundle, str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static void j0(Drawable drawable, int i) {
        b.g(drawable, i);
    }

    public static long l(boolean z4, int i, int i5, long j5, long j6, int i6, boolean z5, long j7, long j8, long j9, long j10) {
        B.a.r(i5, "backoffPolicy");
        if (j10 != Long.MAX_VALUE && z5) {
            return i6 == 0 ? j10 : S0.f.u(j10, 900000 + j6);
        }
        if (z4) {
            return S0.f.v(i5 == 2 ? i * j5 : (long) Math.scalb(j5, i - 1), 18000000L) + j6;
        }
        if (z5) {
            long j11 = i6 == 0 ? j6 + j7 : j6 + j9;
            return (j8 == j9 || i6 != 0) ? j11 : (j9 - j8) + j11;
        }
        if (j6 == -1) {
            return Long.MAX_VALUE;
        }
        return j6 + j7;
    }

    public static final void m0(Object obj) {
        if (obj instanceof K3.f) {
            throw ((K3.f) obj).f2279a;
        }
    }

    public static ArrayList o0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o2.t tVarP0 = p0((zzahy) it.next());
            if (tVarP0 != null) {
                arrayList.add(tVarP0);
            }
        }
        return arrayList;
    }

    public static o2.t p0(zzahy zzahyVar) {
        if (zzahyVar == null) {
            return null;
        }
        if (!TextUtils.isEmpty(zzahyVar.zze())) {
            String strZzd = zzahyVar.zzd();
            String strZzc = zzahyVar.zzc();
            long jZza = zzahyVar.zza();
            String strZze = zzahyVar.zze();
            C.d(strZze);
            return new y(strZzd, strZzc, jZza, strZze);
        }
        if (zzahyVar.zzb() == null) {
            return null;
        }
        String strZzd2 = zzahyVar.zzd();
        String strZzc2 = zzahyVar.zzc();
        long jZza2 = zzahyVar.zza();
        zzaiz zzaizVarZzb = zzahyVar.zzb();
        C.g(zzaizVarZzb, "totpInfo cannot be null.");
        return new C0796B(strZzd2, strZzc2, jZza2, zzaizVarZzb);
    }

    public static AbstractC0777L q(TypedValue typedValue, AbstractC0777L abstractC0777L, AbstractC0777L abstractC0777L2, String str, String str2) throws XmlPullParserException {
        if (abstractC0777L == null || abstractC0777L == abstractC0777L2) {
            return abstractC0777L == null ? abstractC0777L2 : abstractC0777L;
        }
        throw new XmlPullParserException("Type is " + str + " but found " + str2 + ": " + typedValue.data);
    }

    public static int r(Context context, String str) {
        int iC;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strD = A.d.d(str);
        if (strD != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int iMyUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (iMyUid2 == iMyUid && L.b.a(packageName2, packageName)) {
                AppOpsManager appOpsManagerC = A.e.c(context);
                iC = A.e.a(appOpsManagerC, strD, Binder.getCallingUid(), packageName);
                if (iC == 0) {
                    iC = A.e.a(appOpsManagerC, strD, iMyUid, A.e.b(context));
                }
            } else {
                iC = A.d.c((AppOpsManager) A.d.a(context, AppOpsManager.class), strD, packageName);
            }
            if (iC != 0) {
                return -2;
            }
        }
        return 0;
    }

    public static ImageView.ScaleType s(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static final void t(int i, int i5) {
        if (i <= i5) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i5 + ").");
    }

    public static q u(Context context) {
        ProviderInfo providerInfo;
        C2.j jVar;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        r1.d.m(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            jVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                jVar = new C2.j(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e5) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e5);
            }
        }
        if (jVar == null) {
            return null;
        }
        return new q(new p(context, jVar));
    }

    public static final K3.f v(Throwable exception) {
        i.e(exception, "exception");
        return new K3.f(exception);
    }

    public static InterfaceC0597b w(byte[] bArr, Parcelable.Creator creator) {
        C.f(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        InterfaceC0597b interfaceC0597b = (InterfaceC0597b) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return interfaceC0597b;
    }

    public static void x(ArrayList arrayList) {
        HashMap map = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (q2.g gVar : (Set) it2.next()) {
                        for (q2.i iVar : gVar.f9484a.f9470c) {
                            if (iVar.f9491c == 0) {
                                Set<q2.g> set = (Set) map.get(new h(iVar.f9489a, iVar.f9490b == 2));
                                if (set != null) {
                                    for (q2.g gVar2 : set) {
                                        gVar.f9485b.add(gVar2);
                                        gVar2.f9486c.add(gVar);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    q2.g gVar3 = (q2.g) it4.next();
                    if (gVar3.f9486c.isEmpty()) {
                        hashSet2.add(gVar3);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    q2.g gVar4 = (q2.g) hashSet2.iterator().next();
                    hashSet2.remove(gVar4);
                    i++;
                    Iterator it5 = gVar4.f9485b.iterator();
                    while (it5.hasNext()) {
                        q2.g gVar5 = (q2.g) it5.next();
                        gVar5.f9486c.remove(gVar4);
                        if (gVar5.f9486c.isEmpty()) {
                            hashSet2.add(gVar5);
                        }
                    }
                }
                if (i == arrayList.size()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = hashSet.iterator();
                while (it6.hasNext()) {
                    q2.g gVar6 = (q2.g) it6.next();
                    if (!gVar6.f9486c.isEmpty() && !gVar6.f9485b.isEmpty()) {
                        arrayList2.add(gVar6.f9484a);
                    }
                }
                throw new q2.j("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
            }
            C0849a c0849a = (C0849a) it.next();
            q2.g gVar7 = new q2.g(c0849a);
            for (q2.q qVar : c0849a.f9469b) {
                boolean z4 = c0849a.f9471d == 0;
                h hVar = new h(qVar, !z4);
                if (!map.containsKey(hVar)) {
                    map.put(hVar, new HashSet());
                }
                Set set2 = (Set) map.get(hVar);
                if (!set2.isEmpty() && z4) {
                    throw new IllegalArgumentException("Multiple components provide " + qVar + ".");
                }
                set2.add(gVar7);
            }
        }
    }

    public static String y(C0204g c0204g) {
        StringBuilder sb = new StringBuilder(c0204g.size());
        for (int i = 0; i < c0204g.size(); i++) {
            byte bF = c0204g.f(i);
            if (bF == 34) {
                sb.append("\\\"");
            } else if (bF == 39) {
                sb.append("\\'");
            } else if (bF != 92) {
                switch (bF) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        sb.append("\\t");
                        break;
                    case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bF < 32 || bF > 126) {
                            sb.append('\\');
                            sb.append((char) (((bF >>> 6) & 3) + 48));
                            sb.append((char) (((bF >>> 3) & 7) + 48));
                            sb.append((char) ((bF & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bF);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void z(String str, Object... objArr) {
        throw new AssertionError("INTERNAL ASSERTION FAILED: ".concat(String.format(str, objArr)));
    }

    public abstract int D();

    public abstract InputFilter[] E(InputFilter[] inputFilterArr);

    public abstract int F();

    public abstract int G();

    public abstract int H();

    public abstract int J(View view);

    public abstract int K(CoordinatorLayout coordinatorLayout);

    public abstract int L();

    public abstract boolean Q(float f2);

    public abstract boolean S(View view);

    public abstract boolean T(float f2, float f3);

    public abstract View Y(int i);

    public abstract boolean Z();

    public abstract void a0(U0.h hVar, U0.h hVar2);

    public abstract void b0(U0.h hVar, Thread thread);

    public abstract void d0(boolean z4);

    public abstract void e0(boolean z4);

    public abstract void f0(boolean z4);

    public abstract void g0(boolean z4);

    public abstract int k(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract boolean k0(View view, float f2);

    public void l0() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
    }

    public abstract float m(int i);

    public abstract boolean n(U0.i iVar, U0.d dVar, U0.d dVar2);

    public abstract void n0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i5);

    public abstract boolean o(U0.i iVar, Object obj, Object obj2);

    public abstract boolean p(U0.i iVar, U0.h hVar, U0.h hVar2);
}

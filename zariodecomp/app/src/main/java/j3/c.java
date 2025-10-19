package J3;

import A2.C0011k;
import N2.n0;
import android.content.Context;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.EnumC0236o;
import com.google.firebase.components.ComponentRegistrar;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.i;
import o0.C0787j;
import o0.r;
import o0.x;
import q2.C0849a;
import r0.InterfaceC0858c;
import y0.C1042a;
import y0.InterfaceC1043b;
import y0.InterfaceC1044c;
import z0.g;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J3\c.smali */
public final class c implements InterfaceC0858c, InterfaceC1043b {

    /* renamed from: a, reason: collision with root package name */
    public static c f2099a;

    public static C0787j a(Context context, x destination, Bundle bundle, EnumC0236o hostLifecycleState, r rVar) {
        String string = UUID.randomUUID().toString();
        i.d(string, "randomUUID().toString()");
        i.e(destination, "destination");
        i.e(hostLifecycleState, "hostLifecycleState");
        return new C0787j(context, destination, bundle, hostLifecycleState, rVar, string, null);
    }

    public static Font c(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iD = d(fontStyle, font.getStyle());
        for (int i5 = 1; i5 < fontFamily.getSize(); i5++) {
            Font font2 = fontFamily.getFont(i5);
            int iD2 = d(fontStyle, font2.getStyle());
            if (iD2 < iD) {
                font = font2;
                iD = iD2;
            }
        }
        return font;
    }

    public static int d(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // y0.InterfaceC1043b
    public InterfaceC1044c b(C1042a c1042a) {
        return new g(c1042a.f11043a, c1042a.f11044b, c1042a.f11045c, c1042a.f11046d, c1042a.f11047e);
    }

    public List e(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C0849a c0849a : componentRegistrar.getComponents()) {
            String str = c0849a.f9468a;
            if (str != null) {
                C0011k c0011k = new C0011k(5, str, c0849a);
                c0849a = new C0849a(str, c0849a.f9469b, c0849a.f9470c, c0849a.f9471d, c0011k, c0849a.f9473f);
            }
            arrayList.add(c0849a);
        }
        return arrayList;
    }

    @Override // r0.InterfaceC0858c
    public void f(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            default:
                str = "";
                break;
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0 A[Catch: all -> 0x003d, TryCatch #9 {, blocks: (B:10:0x002d, B:12:0x0039, B:49:0x00a9, B:17:0x0042, B:19:0x0048, B:21:0x004e, B:26:0x0055, B:28:0x0059, B:31:0x0062, B:33:0x006a, B:36:0x0071, B:40:0x0086, B:41:0x008e, B:39:0x0078, B:44:0x0093, B:47:0x0096, B:48:0x00a0, B:18:0x0045), top: B:142:0x002d, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0174  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int g(android.content.Context r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 549
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.c.g(android.content.Context, boolean):int");
    }

    @Override // r0.InterfaceC0858c
    public void h() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }
}

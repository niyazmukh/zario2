package D;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import q.C0829f;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\D\g.smali */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final J3.c f1271a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0829f f1272b;

    static {
        J3.c cVar = new J3.c();
        new ConcurrentHashMap();
        f1271a = cVar;
        f1272b = new C0829f(16);
    }

    public static Typeface a(Context context, J.g[] gVarArr, int i) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        f1271a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (J.g gVar : gVarArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(gVar.f2004a, "r", null);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(gVar.f2006c).setSlant(gVar.f2007d ? 1 : 0).setTtcIndex(gVar.f2005b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(J3.c.c(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Typeface b(android.content.Context r15, C.f r16, android.content.res.Resources r17, int r18, java.lang.String r19, int r20, int r21, C.b r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: D.g.b(android.content.Context, C.f, android.content.res.Resources, int, java.lang.String, int, int, C.b, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i5, int i6) {
        Typeface typefaceBuild;
        f1271a.getClass();
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            typefaceBuild = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            typefaceBuild = null;
        }
        if (typefaceBuild != null) {
            f1272b.put(d(resources, i, str, i5, i6), typefaceBuild);
        }
        return typefaceBuild;
    }

    public static String d(Resources resources, int i, String str, int i5, int i6) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i5 + '-' + i + '-' + i6;
    }
}

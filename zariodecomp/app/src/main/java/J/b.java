package J;

import A2.C0002b;
import E2.j;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import r.AbstractC0854a;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\J\b.smali */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final C0002b f1990a = new C0002b(10);

    public static j a(Context context, C2.j jVar) throws Resources.NotFoundException, PackageManager.NameNotFoundException {
        Cursor cursorA;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) jVar.f1092b;
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(AbstractC0854a.b("No package found for authority: ", str));
        }
        String str2 = providerInfoResolveContentProvider.packageName;
        String str3 = (String) jVar.f1093c;
        if (!str2.equals(str3)) {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str3);
        }
        Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        C0002b c0002b = f1990a;
        Collections.sort(arrayList, c0002b);
        List listJ = (List) jVar.f1095e;
        if (listJ == null) {
            listJ = C.b.j(resources, 0);
        }
        int i = 0;
        loop1: while (true) {
            cursorA = null;
            if (i >= listJ.size()) {
                providerInfoResolveContentProvider = null;
                break;
            }
            ArrayList arrayList2 = new ArrayList((Collection) listJ.get(i));
            Collections.sort(arrayList2, c0002b);
            if (arrayList.size() == arrayList2.size()) {
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    if (!Arrays.equals((byte[]) arrayList.get(i5), (byte[]) arrayList2.get(i5))) {
                        break;
                    }
                }
                break loop1;
            }
            i++;
        }
        if (providerInfoResolveContentProvider == null) {
            return new j(null, 1, 3);
        }
        String str4 = providerInfoResolveContentProvider.authority;
        ArrayList arrayList3 = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str4).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
        try {
            cursorA = a.a(context.getContentResolver(), uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{(String) jVar.f1094d}, null, null);
            if (cursorA != null && cursorA.getCount() > 0) {
                int columnIndex = cursorA.getColumnIndex("result_code");
                arrayList3 = new ArrayList();
                int columnIndex2 = cursorA.getColumnIndex("_id");
                int columnIndex3 = cursorA.getColumnIndex("file_id");
                int columnIndex4 = cursorA.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorA.getColumnIndex("font_weight");
                int columnIndex6 = cursorA.getColumnIndex("font_italic");
                while (cursorA.moveToNext()) {
                    arrayList3.add(new g(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorA.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorA.getLong(columnIndex3)), columnIndex4 != -1 ? cursorA.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorA.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorA.getInt(columnIndex6) == 1, columnIndex != -1 ? cursorA.getInt(columnIndex) : 0));
                }
            }
            if (cursorA != null) {
                cursorA.close();
            }
            return new j((g[]) arrayList3.toArray(new g[0]), 0, 3);
        } catch (Throwable th) {
            if (cursorA != null) {
                cursorA.close();
            }
            throw th;
        }
    }
}

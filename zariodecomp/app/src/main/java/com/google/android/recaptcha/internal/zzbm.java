package com.google.android.recaptcha.internal;

import L3.j;
import L3.l;
import android.content.Context;
import b4.b;
import b4.c;
import e4.m;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzbm.smali */
public final class zzbm implements zzaq {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbm(Context context) {
        this.zza = context;
        new zzcd(context);
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzcd.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzb() {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
                    if (m.x0(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final void zzc(String str, String str2) throws IOException {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(l.a0(cVar));
        Iterator it = cVar.iterator();
        while (((b) it).f5343c) {
            b bVar = (b) it;
            int i = bVar.f5344d;
            if (i != bVar.f5342b) {
                bVar.f5344d = bVar.f5341a + i;
            } else {
                if (!bVar.f5343c) {
                    throw new NoSuchElementException();
                }
                bVar.f5343c = false;
            }
            arrayList.add(Character.valueOf((char) i));
        }
        List listX0 = j.x0(arrayList);
        Collections.shuffle(listX0);
        String strH0 = j.h0(((ArrayList) listX0).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(strH0));
        zzcd.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzaq
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                int length = fileArrListFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    File file2 = fileArrListFiles[i];
                    if (i.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}

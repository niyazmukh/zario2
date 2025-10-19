package com.google.android.recaptcha.internal;

import N2.AbstractC0156x;
import S0.f;
import V3.a;
import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.jvm.internal.i;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzcd.smali */
public final class zzcd {
    public zzcd(Context context) {
    }

    public static final byte[] zza(File file) throws IOException {
        i.e(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i5 = i;
            int i6 = 0;
            while (i5 > 0) {
                int i7 = fileInputStream.read(bArrCopyOf, i6, i5);
                if (i7 < 0) {
                    break;
                }
                i5 -= i7;
                i6 += i7;
            }
            if (i5 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                i.d(bArrCopyOf, "copyOf(...)");
            } else {
                int i8 = fileInputStream.read();
                if (i8 != -1) {
                    a aVar = new a(8193);
                    aVar.write(i8);
                    AbstractC0156x.m(fileInputStream, aVar);
                    int size = aVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrA = aVar.a();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    i.d(bArrCopyOf, "copyOf(...)");
                    L3.i.s0(bArrA, i, bArrCopyOf, 0, aVar.size());
                }
            }
            f.t(fileInputStream, null);
            return bArrCopyOf;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                f.t(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static final void zzb(File file, byte[] array) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException("Unable to delete existing encrypted file");
        }
        i.e(array, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(array);
            f.t(fileOutputStream, null);
        } finally {
        }
    }
}

package com.google.android.recaptcha.internal;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\internal\zzap.smali */
public final class zzap {
    public static final String zza(ContentResolver contentResolver) {
        Cursor cursorQuery = contentResolver.query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
            return "";
        }
        String strValueOf = String.valueOf(Long.parseLong(cursorQuery.getString(1)));
        cursorQuery.close();
        return strValueOf;
    }
}

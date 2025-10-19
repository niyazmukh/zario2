package com.google.android.gms.internal.p002firebaseauthapi;

import B.a;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzaoo.smali */
public final class zzaoo {
    private static final ThreadLocal<SimpleDateFormat> zza;

    static {
        zza = new zzaon();
        zzc("now");
        zzc("getEpochSecond");
        zzc("getNano");
    }

    private static boolean zza(long j5) {
        return j5 >= -62135596800L && j5 <= 253402300799L;
    }

    private static long zzb(String str) throws ParseException {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            throw new ParseException("Invalid offset value: ".concat(str), 0);
        }
        try {
            return ((Long.parseLong(str.substring(0, iIndexOf)) * 60) + Long.parseLong(str.substring(iIndexOf + 1))) * 60;
        } catch (NumberFormatException e5) {
            ParseException parseException = new ParseException("Invalid offset value: ".concat(str), 0);
            parseException.initCause(e5);
            throw parseException;
        }
    }

    private static Method zzc(String str) {
        try {
            return Class.forName("java.time.Instant").getMethod(str, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static long zza(zzans zzansVar) {
        return zzb(zzansVar).zzb();
    }

    public static zzans zza(String str) throws ParseException {
        String strSubstring;
        int iCharAt;
        int iIndexOf = str.indexOf(84);
        if (iIndexOf != -1) {
            int iIndexOf2 = str.indexOf(90, iIndexOf);
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(43, iIndexOf);
            }
            if (iIndexOf2 == -1) {
                iIndexOf2 = str.indexOf(45, iIndexOf);
            }
            if (iIndexOf2 != -1) {
                String strSubstring2 = str.substring(0, iIndexOf2);
                int iIndexOf3 = strSubstring2.indexOf(46);
                boolean z4 = true;
                if (iIndexOf3 != -1) {
                    String strSubstring3 = strSubstring2.substring(0, iIndexOf3);
                    strSubstring = strSubstring2.substring(iIndexOf3 + 1);
                    strSubstring2 = strSubstring3;
                } else {
                    strSubstring = "";
                }
                long time = zza.get().parse(strSubstring2).getTime() / 1000;
                if (strSubstring.isEmpty()) {
                    iCharAt = 0;
                } else {
                    iCharAt = 0;
                    for (int i = 0; i < 9; i++) {
                        iCharAt *= 10;
                        if (i < strSubstring.length()) {
                            if (strSubstring.charAt(i) >= '0' && strSubstring.charAt(i) <= '9') {
                                iCharAt = (strSubstring.charAt(i) - '0') + iCharAt;
                            } else {
                                throw new ParseException("Invalid nanoseconds.", 0);
                            }
                        }
                    }
                }
                if (str.charAt(iIndexOf2) == 'Z') {
                    if (str.length() != iIndexOf2 + 1) {
                        throw new ParseException(a.l("Failed to parse timestamp: invalid trailing data \"", str.substring(iIndexOf2), "\""), 0);
                    }
                } else {
                    long jZzb = zzb(str.substring(iIndexOf2 + 1));
                    time = str.charAt(iIndexOf2) == '+' ? time - jZzb : time + jZzb;
                }
                try {
                    if (zza(time)) {
                        if (iCharAt <= -1000000000 || iCharAt >= 1000000000) {
                            long j5 = iCharAt / 1000000000;
                            long j6 = time + j5;
                            if (((j5 ^ time) < 0) | ((time ^ j6) >= 0)) {
                                iCharAt %= 1000000000;
                                time = j6;
                            } else {
                                throw new ArithmeticException();
                            }
                        }
                        if (iCharAt < 0) {
                            iCharAt += 1000000000;
                            long j7 = time - 1;
                            boolean z5 = (1 ^ time) >= 0;
                            if ((time ^ j7) < 0) {
                                z4 = false;
                            }
                            if (!z5 && !z4) {
                                throw new ArithmeticException();
                            }
                            time = j7;
                        }
                        return zzb((zzans) ((zzalf) zzans.zzc().zza(time).zza(iCharAt).zze()));
                    }
                    throw new IllegalArgumentException(zzac.zza("Timestamp is not valid. Input seconds is too large. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. ", Long.valueOf(time)));
                } catch (IllegalArgumentException e5) {
                    ParseException parseException = new ParseException(a.l("Failed to parse timestamp ", str, " Timestamp is out of range."), 0);
                    parseException.initCause(e5);
                    throw parseException;
                }
            }
            throw new ParseException("Failed to parse timestamp: missing valid timezone offset.", 0);
        }
        throw new ParseException(a.l("Failed to parse timestamp: invalid timestamp \"", str, "\""), 0);
    }

    private static zzans zzb(zzans zzansVar) {
        long jZzb = zzansVar.zzb();
        int iZza = zzansVar.zza();
        if (!zza(jZzb) || iZza < 0 || iZza >= 1000000000) {
            throw new IllegalArgumentException(zzac.zza("Timestamp is not valid. See proto definition for valid values. Seconds (%s) must be in range [-62,135,596,800, +253,402,300,799]. Nanos (%s) must be in range [0, +999,999,999].", Long.valueOf(jZzb), Integer.valueOf(iZza)));
        }
        return zzansVar;
    }

    public static /* synthetic */ SimpleDateFormat zza() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.ENGLISH);
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        simpleDateFormat.setCalendar(gregorianCalendar);
        return simpleDateFormat;
    }
}

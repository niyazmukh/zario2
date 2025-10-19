package u0;

import android.content.Context;
import e4.m;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\v.smali */
public abstract class v {
    public static void a(Object obj, Class cls) {
        if (obj != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static void b(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    public static final w c(Context context, Class cls, String str) {
        if (m.q0(str)) {
            throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        }
        return new w(context, cls, str);
    }

    public static boolean d(String current, String str) {
        kotlin.jvm.internal.i.e(current, "current");
        if (current.equals(str)) {
            return true;
        }
        if (current.length() != 0) {
            int i = 0;
            int i5 = 0;
            int i6 = 0;
            while (true) {
                if (i < current.length()) {
                    char cCharAt = current.charAt(i);
                    int i7 = i6 + 1;
                    if (i6 == 0 && cCharAt != '(') {
                        break;
                    }
                    if (cCharAt != '(') {
                        if (cCharAt == ')' && i5 - 1 == 0 && i6 != current.length() - 1) {
                            break;
                        }
                    } else {
                        i5++;
                    }
                    i++;
                    i6 = i7;
                } else if (i5 == 0) {
                    String strSubstring = current.substring(1, current.length() - 1);
                    kotlin.jvm.internal.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                    return kotlin.jvm.internal.i.a(m.A0(strSubstring).toString(), str);
                }
            }
        }
        return false;
    }

    public static long e() {
        return LocalDate.now().atTime(LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static long f(long j5) {
        return ZonedDateTime.ofInstant(Instant.ofEpochMilli(j5), ZoneId.systemDefault()).toLocalDate().atTime(LocalTime.MAX).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
    }

    public static boolean g(long j5) {
        return LocalDate.now().atStartOfDay().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli() <= j5 && j5 <= e();
    }
}

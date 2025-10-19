package u0;

import android.content.Context;
import android.os.PowerManager;
import android.util.Log;
import java.math.RoundingMode;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\u0.1\o.smali */
public abstract class o {
    public static final void a(int i, StringBuilder sb) {
        for (int i5 = 0; i5 < i; i5++) {
            sb.append("?");
            if (i5 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static int b(int i, int i5, RoundingMode roundingMode) {
        if (i5 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i6 = i / i5;
        int i7 = i - (i5 * i6);
        if (i7 == 0) {
            return i6;
        }
        int i8 = ((i ^ i5) >> 31) | 1;
        switch (z2.d.f11223a[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return i6;
            case 3:
                break;
            case 4:
                if (i8 <= 0) {
                    return i6;
                }
                break;
            case 5:
                if (i8 >= 0) {
                    return i6;
                }
                break;
            case 6:
            case 7:
            case 8:
                int iAbs = Math.abs(i7);
                int iAbs2 = iAbs - (Math.abs(i5) - iAbs);
                if (iAbs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((i6 & 1) != 0))) {
                            return i6;
                        }
                    }
                } else if (iAbs2 <= 0) {
                    return i6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i6 + i8;
    }

    public static String c(String tableName, String triggerType) {
        kotlin.jvm.internal.i.e(tableName, "tableName");
        kotlin.jvm.internal.i.e(triggerType, "triggerType");
        return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
    }

    public static boolean d(Context context) {
        try {
            Object systemService = context.getSystemService("power");
            kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
            boolean zIsIgnoringBatteryOptimizations = ((PowerManager) systemService).isIgnoringBatteryOptimizations(context.getPackageName());
            Log.d("BatteryOptimization", "Battery optimization status: ".concat(zIsIgnoringBatteryOptimizations ? "EXEMPT" : "RESTRICTED"));
            return zIsIgnoringBatteryOptimizations;
        } catch (Exception e5) {
            Log.e("BatteryOptimization", "Failed to check battery optimization status", e5);
            return false;
        }
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import N2.j0;
import N2.n0;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\gms\internal\firebase-auth-api\zzann.smali */
final class zzann {
    public static String zza(zzajv zzajvVar) {
        zzanq zzanqVar = new zzanq(zzajvVar);
        StringBuilder sb = new StringBuilder(zzanqVar.zza());
        for (int i = 0; i < zzanqVar.zza(); i++) {
            byte bZza = zzanqVar.zza(i);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
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
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                            break;
                        } else {
                            sb.append((char) bZza);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}

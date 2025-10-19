package N0;

import N2.j0;
import N2.n0;
import android.app.job.JobParameters;
import androidx.work.impl.background.systemjob.SystemJobService;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N0\e.smali */
public abstract class e {
    public static int a(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        String str = SystemJobService.f4861e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case n0.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case n0.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
            case j0.EXPECTED_COUNT_FIELD_NUMBER /* 12 */:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }
}

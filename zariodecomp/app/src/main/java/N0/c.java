package N0;

import android.app.job.JobParameters;
import android.net.Uri;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N0\c.smali */
public abstract class c {
    public static String[] a(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }

    public static Uri[] b(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }
}

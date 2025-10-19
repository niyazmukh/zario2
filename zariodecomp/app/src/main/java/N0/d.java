package N0;

import android.app.job.JobParameters;
import android.net.Network;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\N0\d.smali */
public abstract class d {
    public static Network a(JobParameters jobParameters) {
        return jobParameters.getNetwork();
    }
}

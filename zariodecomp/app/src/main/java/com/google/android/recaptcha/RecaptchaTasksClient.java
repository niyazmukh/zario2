package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\recaptcha\RecaptchaTasksClient.smali */
public interface RecaptchaTasksClient {
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    Task<String> executeTask(RecaptchaAction recaptchaAction, long j5);
}

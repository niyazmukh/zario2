package R;

import K3.k;
import X3.l;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.ResultReceiver;
import androidx.credentials.playservices.HiddenActivity;
import c1.g;
import c1.m;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\R\c.smali */
public final class c extends j implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HiddenActivity f2820b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2821c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(HiddenActivity hiddenActivity, int i, int i5) {
        super(1);
        this.f2819a = i5;
        this.f2820b = hiddenActivity;
        this.f2821c = i;
    }

    @Override // X3.l
    public final Object invoke(Object obj) {
        switch (this.f2819a) {
            case 0:
                HiddenActivity hiddenActivity = this.f2820b;
                g gVar = (g) obj;
                try {
                    hiddenActivity.f4404b = true;
                    hiddenActivity.startIntentSenderForResult(gVar.f5424a.getIntentSender(), this.f2821c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e5) {
                    ResultReceiver resultReceiver = hiddenActivity.f4403a;
                    i.b(resultReceiver);
                    hiddenActivity.a(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e5.getMessage());
                }
                break;
            case 1:
                HiddenActivity hiddenActivity2 = this.f2820b;
                m mVar = (m) obj;
                try {
                    hiddenActivity2.f4404b = true;
                    hiddenActivity2.startIntentSenderForResult(mVar.f5436a.getIntentSender(), this.f2821c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e6) {
                    ResultReceiver resultReceiver2 = hiddenActivity2.f4403a;
                    i.b(resultReceiver2);
                    hiddenActivity2.a(resultReceiver2, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e6.getMessage());
                }
                break;
            case 2:
                HiddenActivity hiddenActivity3 = this.f2820b;
                PendingIntent result = (PendingIntent) obj;
                i.e(result, "result");
                try {
                    hiddenActivity3.f4404b = true;
                    hiddenActivity3.startIntentSenderForResult(result.getIntentSender(), this.f2821c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e7) {
                    ResultReceiver resultReceiver3 = hiddenActivity3.f4403a;
                    i.b(resultReceiver3);
                    hiddenActivity3.a(resultReceiver3, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e7.getMessage());
                }
                break;
            default:
                HiddenActivity hiddenActivity4 = this.f2820b;
                PendingIntent pendingIntent = (PendingIntent) obj;
                try {
                    hiddenActivity4.f4404b = true;
                    hiddenActivity4.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f2821c, null, 0, 0, 0, null);
                } catch (IntentSender.SendIntentException e8) {
                    ResultReceiver resultReceiver4 = hiddenActivity4.f4403a;
                    i.b(resultReceiver4);
                    hiddenActivity4.a(resultReceiver4, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e8.getMessage());
                }
                break;
        }
        return k.f2288a;
    }
}

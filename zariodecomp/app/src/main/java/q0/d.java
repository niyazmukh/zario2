package Q0;

import J0.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import g.v;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q0\d.smali */
public final class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2712b;

    public /* synthetic */ d(Object obj, int i) {
        this.f2711a = i;
        this.f2712b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f2711a) {
            case 0:
                kotlin.jvm.internal.i.e(context, "context");
                kotlin.jvm.internal.i.e(intent, "intent");
                a aVar = (a) this.f2712b;
                switch (aVar.f2708g) {
                    case 0:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        String action = intent.getAction();
                        if (action != null) {
                            t.d().a(b.f2709a, "Received ".concat(action));
                            switch (action.hashCode()) {
                                case -1886648615:
                                    if (action.equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case -54942926:
                                    if (action.equals("android.os.action.DISCHARGING")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                    break;
                                case 948344062:
                                    if (action.equals("android.os.action.CHARGING")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                                case 1019184907:
                                    if (action.equals("android.intent.action.ACTION_POWER_CONNECTED")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                    break;
                            }
                        }
                        break;
                    case 1:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        if (intent.getAction() != null) {
                            t.d().a(c.f2710a, "Received " + intent.getAction());
                            String action2 = intent.getAction();
                            if (action2 != null) {
                                int iHashCode = action2.hashCode();
                                if (iHashCode == -1980154005) {
                                    if (action2.equals("android.intent.action.BATTERY_OKAY")) {
                                        aVar.b(Boolean.TRUE);
                                        break;
                                    }
                                } else if (iHashCode == 490310653 && action2.equals("android.intent.action.BATTERY_LOW")) {
                                    aVar.b(Boolean.FALSE);
                                    break;
                                }
                            }
                        }
                        break;
                    default:
                        kotlin.jvm.internal.i.e(intent, "intent");
                        if (intent.getAction() != null) {
                            t.d().a(j.f2723a, "Received " + intent.getAction());
                            String action3 = intent.getAction();
                            if (action3 != null) {
                                int iHashCode2 = action3.hashCode();
                                if (iHashCode2 == -1181163412) {
                                    if (action3.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                                        aVar.b(Boolean.FALSE);
                                        break;
                                    }
                                } else if (iHashCode2 == -730838620 && action3.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                                    aVar.b(Boolean.TRUE);
                                    break;
                                }
                            }
                        }
                        break;
                }
            default:
                ((v) this.f2712b).i();
                break;
        }
    }
}

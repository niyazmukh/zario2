package Q0;

import J0.t;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\Q0\a.smali */
public final class a extends f {

    /* renamed from: f, reason: collision with root package name */
    public final d f2707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2708g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, V0.a taskExecutor, int i) {
        super(context, taskExecutor);
        this.f2708g = i;
        kotlin.jvm.internal.i.e(taskExecutor, "taskExecutor");
        this.f2707f = new d(this, 0);
    }

    @Override // Q0.f
    public final Object a() {
        switch (this.f2708g) {
            case 0:
                Intent intentRegisterReceiver = this.f2715b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    t.d().b(b.f2709a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = this.f2715b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    t.d().b(c.f2710a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z4 = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z4 = false;
                }
                return Boolean.valueOf(z4);
            default:
                Intent intentRegisterReceiver3 = this.f2715b.registerReceiver(null, e());
                boolean z5 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z5 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z5 = false;
                    }
                }
                return Boolean.valueOf(z5);
        }
    }

    @Override // Q0.f
    public final void c() {
        t.d().a(e.f2713a, getClass().getSimpleName().concat(": registering receiver"));
        this.f2715b.registerReceiver(this.f2707f, e());
    }

    @Override // Q0.f
    public final void d() {
        t.d().a(e.f2713a, getClass().getSimpleName().concat(": unregistering receiver"));
        this.f2715b.unregisterReceiver(this.f2707f);
    }

    public final IntentFilter e() {
        switch (this.f2708g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}

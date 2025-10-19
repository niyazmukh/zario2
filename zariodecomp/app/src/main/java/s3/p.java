package s3;

import a.AbstractC0183a;
import android.app.usage.UsageEvents;
import android.app.usage.UsageEventsQuery;
import android.app.usage.UsageStatsManager;
import java.lang.reflect.Method;
import java.util.Arrays;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\s3.1\p.smali */
public final /* synthetic */ class p extends kotlin.jvm.internal.h implements X3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9794a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(int i, Object obj, Class cls, String str, String str2, int i5, int i6) {
        super(i, obj, cls, str, str2, i5);
        this.f9794a = i6;
    }

    @Override // X3.p
    public final Object invoke(Object obj, Object obj2) {
        Object objV;
        UsageEventsQuery usageEventsQueryV;
        switch (this.f9794a) {
            case 0:
                UsageStatsManager p02 = (UsageStatsManager) obj;
                UsageEventsQuery p12 = m.d(obj2);
                kotlin.jvm.internal.i.e(p02, "p0");
                kotlin.jvm.internal.i.e(p12, "p1");
                ((q) this.receiver).getClass();
                Method method = w.f9801k;
                if (method == null) {
                    return null;
                }
                try {
                    Object objInvoke = method.invoke(p02, p12);
                    objV = objInvoke instanceof UsageEvents ? (UsageEvents) objInvoke : null;
                } catch (Throwable th) {
                    objV = AbstractC0183a.v(th);
                }
                return (UsageEvents) (objV instanceof K3.f ? null : objV);
            default:
                long jLongValue = ((Number) obj).longValue();
                long jLongValue2 = ((Number) obj2).longValue();
                ((q) this.receiver).getClass();
                try {
                    m.f();
                    UsageEventsQuery.Builder builderA = m.a(jLongValue, jLongValue2);
                    int[] iArr = w.i;
                    usageEventsQueryV = builderA.setEventTypes(Arrays.copyOf(iArr, iArr.length)).build();
                } catch (Throwable th2) {
                    usageEventsQueryV = AbstractC0183a.v(th2);
                }
                if (usageEventsQueryV instanceof K3.f) {
                    usageEventsQueryV = null;
                }
                return m.d(usageEventsQueryV);
        }
    }
}

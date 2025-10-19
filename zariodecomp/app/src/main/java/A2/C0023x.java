package A2;

import java.util.PriorityQueue;

/* renamed from: A2.x, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\A2\x.1.smali */
public final class C0023x {

    /* renamed from: c, reason: collision with root package name */
    public static final C0002b f255c = new C0002b(2);

    /* renamed from: a, reason: collision with root package name */
    public int f256a;

    /* renamed from: b, reason: collision with root package name */
    public Object f257b;

    public void a(Long l4) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f257b;
        if (priorityQueue.size() < this.f256a) {
            priorityQueue.add(l4);
            return;
        }
        if (l4.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l4);
        }
    }
}

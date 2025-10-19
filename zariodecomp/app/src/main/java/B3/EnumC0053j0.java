package B3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: B3.j0, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\B3\j0.1.smali */
public final class EnumC0053j0 {

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC0053j0 f847c;

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC0053j0[] f848d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ EnumC0053j0[] f849e;

    /* renamed from: a, reason: collision with root package name */
    public final int f850a;

    /* renamed from: b, reason: collision with root package name */
    public final z3.k0 f851b;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0053j0 EF0;

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:230)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:144)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:81)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:65)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:55)
        */
    static {
        /*
            Method dump skipped, instructions count: 200
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.EnumC0053j0.<clinit>():void");
    }

    public EnumC0053j0(String str, int i, int i5, z3.k0 k0Var) {
        this.f850a = i5;
        String strM = "HTTP/2 error code: " + name();
        if (k0Var.f11359b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(strM);
            sb.append(" (");
            strM = B.a.m(sb, k0Var.f11359b, ")");
        }
        this.f851b = k0Var.g(strM);
    }

    public static EnumC0053j0 valueOf(String str) {
        return (EnumC0053j0) Enum.valueOf(EnumC0053j0.class, str);
    }

    public static EnumC0053j0[] values() {
        return (EnumC0053j0[]) f849e.clone();
    }
}

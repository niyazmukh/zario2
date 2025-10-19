package com.google.android.play.core.integrity;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\b.smali */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f6288a;

    /* renamed from: b, reason: collision with root package name */
    private y f6289b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f6289b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f6288a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f6288a;
        if (str != null && (yVar = this.f6289b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6288a == null) {
            sb.append(" token");
        }
        if (this.f6289b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

package com.google.android.play.core.integrity;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\android\play\core\integrity\a.smali */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f6235a;

    /* renamed from: b, reason: collision with root package name */
    private y f6236b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f6236b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f6235a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f6235a;
        if (str != null && (yVar = this.f6236b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6235a == null) {
            sb.append(" token");
        }
        if (this.f6236b == null) {
            sb.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}

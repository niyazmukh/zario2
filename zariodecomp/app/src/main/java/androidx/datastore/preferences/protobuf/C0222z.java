package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: C:\Users\niyaz\Downloads\universal\smali\androidx\datastore\preferences\protobuf\z.1.smali */
public class C0222z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f4565a;

    public static C0222z a() {
        return new C0222z("Protocol message had invalid UTF-8.");
    }

    public static C0221y b() {
        return new C0221y("Protocol message tag had invalid wire type.");
    }

    public static C0222z c() {
        return new C0222z("CodedInputStream encountered a malformed varint.");
    }

    public static C0222z d() {
        return new C0222z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0222z e() {
        return new C0222z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

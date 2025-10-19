package com.google.protobuf;

import java.io.IOException;

/* loaded from: C:\Users\niyaz\Downloads\universal\smali\com\google\protobuf\N.smali */
public class N extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public boolean f6436a;

    public static N a() {
        return new N("Protocol message end-group tag did not match expected tag.");
    }

    public static N b() {
        return new N("Protocol message contained an invalid tag (zero).");
    }

    public static N c() {
        return new N("Protocol message had invalid UTF-8.");
    }

    public static M d() {
        return new M("Protocol message tag had invalid wire type.");
    }

    public static N e() {
        return new N("CodedInputStream encountered a malformed varint.");
    }

    public static N f() {
        return new N("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static N g() {
        return new N("Failed to parse the message.");
    }

    public static N h() {
        return new N("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}

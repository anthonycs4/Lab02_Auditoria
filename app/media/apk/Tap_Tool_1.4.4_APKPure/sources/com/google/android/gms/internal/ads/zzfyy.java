package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfyy extends IOException {
    private zzfzu zza;
    private boolean zzb;

    public zzfyy(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.zza = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzd() {
        return new zzfyy("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zze() {
        return new zzfyy("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzf() {
        return new zzfyy("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzg() {
        return new zzfyy("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzh() {
        return new zzfyy("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyx zzi() {
        return new zzfyx("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzj() {
        return new zzfyy("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzk() {
        return new zzfyy("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfyy zzl() {
        return new zzfyy("Protocol message had invalid UTF-8.");
    }

    public final zzfyy zza(zzfzu zzfzuVar) {
        this.zza = zzfzuVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb() {
        this.zzb = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zzc() {
        return this.zzb;
    }

    public zzfyy(String str) {
        super(str);
        this.zza = null;
    }
}

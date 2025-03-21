package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpa {
    private final zzflu zza;
    private final zzflx zzb;

    public zzfpa(zzflu zzfluVar) {
        this.zza = zzfluVar;
        this.zzb = null;
    }

    public zzfpa(zzflx zzflxVar) {
        this.zza = null;
        this.zzb = zzflxVar;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzflu zzfluVar = this.zza;
        if (zzfluVar != null) {
            return zzfluVar.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}

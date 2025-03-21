package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfpj implements zzfmj {
    private final zzfmo<zzfmj> zza;
    private final byte[] zzb = {0};

    @Override // com.google.android.gms.internal.ads.zzfmj
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzc().equals(zzfui.LEGACY)) {
            return zzfvb.zza(this.zza.zza().zzd(), this.zza.zza().zza().zza(zzfvb.zza(bArr, this.zzb)));
        }
        return zzfvb.zza(this.zza.zza().zzd(), this.zza.zza().zza().zza(bArr));
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfor extends zzfmf<zzfsh> {
    public zzfor() {
        super(zzfsh.class, new zzfoq(zzflz.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.ASYMMETRIC_PUBLIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfsh zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfsh.zzf(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfsh zzfshVar) throws GeneralSecurityException {
        zzfsh zzfshVar2 = zzfshVar;
        zzfwh.zzb(zzfshVar2.zza(), 0);
        zzfoy.zza(zzfshVar2.zzc());
    }
}

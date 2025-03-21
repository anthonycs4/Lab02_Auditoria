package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfnx extends zzfmf<zzftx> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnx() {
        super(zzftx.class, new zzfnv(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzftx zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzftx.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzftx zzftxVar) throws GeneralSecurityException {
        zzfwh.zzb(zzftxVar.zza(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzftx> zzi() {
        return new zzfnw(this, zzfua.class);
    }
}

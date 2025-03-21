package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfop extends zzfmr<zzfse, zzfsh> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfop() {
        super(zzfse.class, zzfsh.class, new zzfon(zzfly.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfzu zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfse.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfzu zzfzuVar) throws GeneralSecurityException {
        zzfse zzfseVar = (zzfse) zzfzuVar;
        if (zzfseVar.zzd().zzr()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zzfwh.zzb(zzfseVar.zza(), 0);
        zzfoy.zza(zzfseVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<zzfry, zzfse> zzi() {
        return new zzfoo(this, zzfry.class);
    }
}

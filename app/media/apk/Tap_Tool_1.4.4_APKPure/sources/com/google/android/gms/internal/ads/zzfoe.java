package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfoe extends zzfmf<zzfuo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoe() {
        super(zzfuo.class, new zzfoc(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfuo zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfuo.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfuo zzfuoVar) throws GeneralSecurityException {
        zzfuo zzfuoVar2 = zzfuoVar;
        zzfwh.zzb(zzfuoVar2.zza(), 0);
        if (zzfuoVar2.zzc().zzc() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfuo> zzi() {
        return new zzfod(this, zzfur.class);
    }
}

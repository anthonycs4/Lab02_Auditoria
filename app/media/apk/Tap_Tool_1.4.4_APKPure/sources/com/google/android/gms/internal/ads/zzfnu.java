package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfnu extends zzfmf<zzfrn> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnu() {
        super(zzfrn.class, new zzfns(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfrn zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfrn.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfrn zzfrnVar) throws GeneralSecurityException {
        zzfrn zzfrnVar2 = zzfrnVar;
        zzfwh.zzb(zzfrnVar2.zza(), 0);
        if (zzfrnVar2.zzc().zzc() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfrn> zzi() {
        return new zzfnt(this, zzfrq.class);
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfnl extends zzfmf<zzfqm> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnl() {
        super(zzfqm.class, new zzfnj(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfqm zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfqm.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfqm zzfqmVar) throws GeneralSecurityException {
        zzfqm zzfqmVar2 = zzfqmVar;
        zzfwh.zzb(zzfqmVar2.zza(), 0);
        zzfwh.zza(zzfqmVar2.zzd().zzc());
        if (zzfqmVar2.zzc().zza() != 12 && zzfqmVar2.zzc().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfqm> zzi() {
        return new zzfnk(this, zzfqp.class);
    }
}

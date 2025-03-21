package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfno extends zzfmf<zzfqv> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfno() {
        super(zzfqv.class, new zzfnm(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfqv zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfqv.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfqv zzfqvVar) throws GeneralSecurityException {
        zzfqv zzfqvVar2 = zzfqvVar;
        zzfwh.zzb(zzfqvVar2.zza(), 0);
        zzfwh.zza(zzfqvVar2.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfqv> zzi() {
        return new zzfnn(this, zzfqy.class);
    }
}

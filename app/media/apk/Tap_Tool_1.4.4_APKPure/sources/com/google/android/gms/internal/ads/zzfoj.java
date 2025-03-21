package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfoj extends zzfmf<zzfrh> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfoj() {
        super(zzfrh.class, new zzfoh(zzflx.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfrh zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfrh.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfrh zzfrhVar) throws GeneralSecurityException {
        zzfrh zzfrhVar2 = zzfrhVar;
        zzfwh.zzb(zzfrhVar2.zza(), 0);
        if (zzfrhVar2.zzc().zzc() == 64) {
            return;
        }
        int zzc = zzfrhVar2.zzc().zzc();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(zzc);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfrh> zzi() {
        return new zzfoi(this, zzfrk.class);
    }
}

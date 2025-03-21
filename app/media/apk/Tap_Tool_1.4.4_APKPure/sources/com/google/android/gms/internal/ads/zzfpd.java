package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpd extends zzfmf<zzfpo> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfpd() {
        super(zzfpo.class, new zzfpb(zzfmj.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzl(zzfpu zzfpuVar) throws GeneralSecurityException {
        if (zzfpuVar.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (zzfpuVar.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzm(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfpo zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfpo.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfpo zzfpoVar) throws GeneralSecurityException {
        zzfpo zzfpoVar2 = zzfpoVar;
        zzfwh.zzb(zzfpoVar2.zza(), 0);
        zzm(zzfpoVar2.zzc().zzc());
        zzl(zzfpoVar2.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfpo> zzi() {
        return new zzfpc(this, zzfpr.class);
    }
}

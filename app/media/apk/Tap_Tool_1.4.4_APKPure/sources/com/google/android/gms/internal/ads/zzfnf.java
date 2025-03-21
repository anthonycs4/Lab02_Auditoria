package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfnf extends zzfmf<zzfpx> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnf() {
        super(zzfpx.class, new zzfnd(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfpx zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfpx.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfpx zzfpxVar) throws GeneralSecurityException {
        zzfpx zzfpxVar2 = zzfpxVar;
        zzfwh.zzb(zzfpxVar2.zza(), 0);
        new zzfni();
        zzfni.zzk(zzfpxVar2.zzc());
        new zzfpg();
        zzfpg.zzk(zzfpxVar2.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfpx> zzi() {
        return new zzfne(this, zzfqa.class);
    }
}

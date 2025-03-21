package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfni extends zzfmf<zzfqd> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfni() {
        super(zzfqd.class, new zzfng(zzfvy.class));
    }

    public static final void zzk(zzfqd zzfqdVar) throws GeneralSecurityException {
        zzfwh.zzb(zzfqdVar.zza(), 0);
        zzfwh.zza(zzfqdVar.zzd().zzc());
        zzl(zzfqdVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzl(zzfqj zzfqjVar) throws GeneralSecurityException {
        if (zzfqjVar.zza() < 12 || zzfqjVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfqd zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfqd.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfqd zzfqdVar) throws GeneralSecurityException {
        zzk(zzfqdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfqd> zzi() {
        return new zzfnh(this, zzfqg.class);
    }
}

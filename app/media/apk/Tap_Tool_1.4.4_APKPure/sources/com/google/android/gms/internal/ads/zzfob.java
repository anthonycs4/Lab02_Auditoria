package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfob extends zzfmf<zzfud> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfob() {
        super(zzfud.class, new zzfnz(zzflu.class));
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfud zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfud.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfud zzfudVar) throws GeneralSecurityException {
        zzfwh.zzb(zzfudVar.zza(), 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfud> zzi() {
        return new zzfoa(this, zzfug.class);
    }
}

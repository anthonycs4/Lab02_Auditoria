package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfnr extends zzfmf<zzfrb> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfnr() {
        super(zzfrb.class, new zzfnp(zzflu.class));
    }

    public static void zzj(boolean z) throws GeneralSecurityException {
        if (zzk()) {
            zzfmx.zzc(new zzfnr(), true);
        }
    }

    private static boolean zzk() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfrb zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfrb.zzd(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfrb zzfrbVar) throws GeneralSecurityException {
        zzfrb zzfrbVar2 = zzfrbVar;
        zzfwh.zzb(zzfrbVar2.zza(), 0);
        zzfwh.zza(zzfrbVar2.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfrb> zzi() {
        return new zzfnq(this, zzfre.class);
    }
}

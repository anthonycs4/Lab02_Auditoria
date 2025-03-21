package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfpg extends zzfmf<zzfsr> {
    public zzfpg() {
        super(zzfsr.class, new zzfpe(zzfmj.class));
    }

    public static final void zzk(zzfsr zzfsrVar) throws GeneralSecurityException {
        zzfwh.zzb(zzfsrVar.zza(), 0);
        if (zzfsrVar.zzd().zzc() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzl(zzfsrVar.zzc());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzl(zzfsx zzfsxVar) throws GeneralSecurityException {
        if (zzfsxVar.zzc() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        zzfso zzfsoVar = zzfso.UNKNOWN_HASH;
        int ordinal = zzfsxVar.zza().ordinal();
        if (ordinal == 1) {
            if (zzfsxVar.zzc() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 2) {
            if (zzfsxVar.zzc() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 3) {
            if (zzfsxVar.zzc() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 4) {
            if (zzfsxVar.zzc() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 5) {
            if (zzfsxVar.zzc() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("unknown hash type");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final String zzb() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzftb zzc() {
        return zzftb.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ zzfsr zzd(zzfxj zzfxjVar) throws zzfyy {
        return zzfsr.zze(zzfxjVar, zzfxy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final /* bridge */ /* synthetic */ void zze(zzfsr zzfsrVar) throws GeneralSecurityException {
        zzk(zzfsrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmf
    public final zzfmd<?, zzfsr> zzi() {
        return new zzfpf(this, zzfsu.class);
    }
}

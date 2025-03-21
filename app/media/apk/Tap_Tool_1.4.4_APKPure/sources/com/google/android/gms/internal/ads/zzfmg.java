package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfmg {
    private final zzftp zza;

    private zzfmg(zzftp zzftpVar) {
        this.zza = zzftpVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final zzfmg zza(zzftp zzftpVar) throws GeneralSecurityException {
        if (zzftpVar == null || zzftpVar.zzd() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        return new zzfmg(zzftpVar);
    }

    public final String toString() {
        return zzfmy.zza(this.zza).toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <P> P zzb(Class<P> cls) throws GeneralSecurityException {
        Class<?> zzm = zzfmx.zzm(cls);
        if (zzm == null) {
            String valueOf = String.valueOf(cls.getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        zzfmy.zzb(this.zza);
        zzfmo zzb = zzfmo.zzb(zzm);
        for (zzfto zzftoVar : this.zza.zzc()) {
            if (zzftoVar.zzd() == zzfte.ENABLED) {
                zzfmm zzd = zzb.zzd(zzfmx.zzk(zzftoVar.zzc(), zzm), zzftoVar);
                if (zzftoVar.zze() == this.zza.zza()) {
                    zzb.zzc(zzd);
                }
            }
        }
        return (P) zzfmx.zzl(zzb, cls);
    }
}

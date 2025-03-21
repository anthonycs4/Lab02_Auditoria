package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfzy<T> implements zzgak<T> {
    private final zzfzu zza;
    private final zzgay<?, ?> zzb;
    private final boolean zzc;
    private final zzfxz<?> zzd;

    private zzfzy(zzgay<?, ?> zzgayVar, zzfxz<?> zzfxzVar, zzfzu zzfzuVar) {
        this.zzb = zzgayVar;
        this.zzc = zzfxzVar.zza(zzfzuVar);
        this.zzd = zzfxzVar;
        this.zza = zzfzuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> zzfzy<T> zzg(zzgay<?, ?> zzgayVar, zzfxz<?> zzfxzVar, zzfzu zzfzuVar) {
        return new zzfzy<>(zzgayVar, zzfxzVar, zzfzuVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final T zza() {
        return (T) this.zza.zzaM().zzak();
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final boolean zzb(T t, T t2) {
        if (this.zzb.zzj(t).equals(this.zzb.zzj(t2))) {
            if (this.zzc) {
                this.zzd.zzb(t);
                this.zzd.zzb(t2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int zzc(T t) {
        int hashCode = this.zzb.zzj(t).hashCode();
        if (this.zzc) {
            this.zzd.zzb(t);
            throw null;
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzd(T t, T t2) {
        zzgam.zzF(this.zzb, t, t2);
        if (this.zzc) {
            zzgam.zzE(this.zzd, t, t2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final int zze(T t) {
        zzgay<?, ?> zzgayVar = this.zzb;
        int zzp = zzgayVar.zzp(zzgayVar.zzj(t));
        if (this.zzc) {
            this.zzd.zzb(t);
            throw null;
        }
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzf(T t, zzgaf zzgafVar, zzfxy zzfxyVar) throws IOException {
        boolean zzd;
        zzgay<?, ?> zzgayVar = this.zzb;
        zzfxz<?> zzfxzVar = this.zzd;
        Object zzk = zzgayVar.zzk(t);
        zzfyd<?> zzc = zzfxzVar.zzc(t);
        while (zzgafVar.zzb() != Integer.MAX_VALUE) {
            try {
                int zzc2 = zzgafVar.zzc();
                if (zzc2 != 11) {
                    if ((zzc2 & 7) == 2) {
                        Object zzf = zzfxzVar.zzf(zzfxyVar, this.zza, zzc2 >>> 3);
                        if (zzf != null) {
                            zzfxzVar.zzg(zzgafVar, zzf, zzfxyVar, zzc);
                        } else {
                            zzd = zzgayVar.zzn(zzk, zzgafVar);
                        }
                    } else {
                        zzd = zzgafVar.zzd();
                    }
                    if (!zzd) {
                        return;
                    }
                } else {
                    int i = 0;
                    Object obj = null;
                    zzfxj zzfxjVar = null;
                    while (zzgafVar.zzb() != Integer.MAX_VALUE) {
                        int zzc3 = zzgafVar.zzc();
                        if (zzc3 == 16) {
                            i = zzgafVar.zzr();
                            obj = zzfxzVar.zzf(zzfxyVar, this.zza, i);
                        } else if (zzc3 == 26) {
                            if (obj != null) {
                                zzfxzVar.zzg(zzgafVar, obj, zzfxyVar, zzc);
                            } else {
                                zzfxjVar = zzgafVar.zzq();
                            }
                        } else if (!zzgafVar.zzd()) {
                            break;
                        }
                    }
                    if (zzgafVar.zzc() != 12) {
                        throw zzfyy.zzh();
                    } else if (zzfxjVar != null) {
                        if (obj != null) {
                            zzfxzVar.zzh(zzfxjVar, obj, zzfxyVar, zzc);
                        } else {
                            zzgayVar.zze(zzk, i, zzfxjVar);
                        }
                    }
                }
            } finally {
                zzgayVar.zzl(t, zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzi(T t, byte[] bArr, int i, int i2, zzfww zzfwwVar) throws IOException {
        zzfym zzfymVar = (zzfym) t;
        if (zzfymVar.zzc == zzgaz.zza()) {
            zzfymVar.zzc = zzgaz.zzb();
        }
        zzfyj zzfyjVar = (zzfyj) t;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzj(T t) {
        this.zzb.zzm(t);
        this.zzd.zzd(t);
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final boolean zzk(T t) {
        this.zzd.zzb(t);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgak
    public final void zzn(T t, zzfxu zzfxuVar) throws IOException {
        this.zzd.zzb(t);
        throw null;
    }
}

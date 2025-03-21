package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzcvq;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeqf<R extends zzcvq<? extends zzcsn>> {
    private final zzeuv zza;
    private final zzeqh zzb;
    private final zzeqi<R> zzc;
    private final Executor zzd;
    private zzeqe zze;

    public zzeqf(zzeuv zzeuvVar, zzeqh zzeqhVar, zzeqi<R> zzeqiVar, Executor executor) {
        this.zza = zzeuvVar;
        this.zzb = zzeqhVar;
        this.zzc = zzeqiVar;
        this.zzd = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzevf zze() {
        zzetk zza = this.zzc.zza(this.zzb).zzf().zza();
        return this.zza.zzd(zza.zzd, zza.zzf, zza.zzj);
    }

    public final zzfla<zzeqe> zza() {
        zzfla zzf;
        zzeqe zzeqeVar = this.zze;
        if (zzeqeVar == null) {
            if (!zzbhh.zza.zze().booleanValue()) {
                zzeqe zzeqeVar2 = new zzeqe(null, zze(), null);
                this.zze = zzeqeVar2;
                zzf = zzfks.zza(zzeqeVar2);
            } else {
                zzcvp<R> zza = this.zzc.zza(this.zzb);
                zza.zzg(new zzepr(this.zza.zze().zzf));
                zzf = zzfks.zzf(zzfks.zzj(zzfkj.zzw((zzfla) zza.zzf().zzc().zze(this.zza.zze())), new zzeqd(this), this.zzd), zzduo.class, new zzeqc(this), this.zzd);
            }
            return zzfks.zzj(zzf, zzeqb.zza, this.zzd);
        }
        return zzfks.zza(zzeqeVar);
    }
}

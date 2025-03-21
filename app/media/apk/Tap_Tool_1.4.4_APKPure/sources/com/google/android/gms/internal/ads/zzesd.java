package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzesd implements zzfko<zzdmb> {
    final /* synthetic */ zzeft zza;
    final /* synthetic */ zzese zzb;
    final /* synthetic */ zzesf zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzesd(zzesf zzesfVar, zzeft zzeftVar, zzese zzeseVar) {
        this.zzc = zzesfVar;
        this.zza = zzeftVar;
        this.zzb = zzeseVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzeqj zzeqjVar;
        final zzazm zzg;
        zzerw zzerwVar;
        zzdmf zzh;
        Executor executor;
        zzeqjVar = this.zzc.zze;
        zzdmg zzdmgVar = (zzdmg) zzeqjVar.zzc();
        if (zzdmgVar == null) {
            zzg = zzeuf.zzb(th, null);
        } else {
            zzg = zzdmgVar.zzc().zzg(th);
        }
        synchronized (this.zzc) {
            if (zzdmgVar != null) {
                zzdmgVar.zzb().zzbM(zzg);
                executor = this.zzc.zzb;
                executor.execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzesc
                    private final zzesd zza;
                    private final zzazm zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzg;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzerw zzerwVar2;
                        zzesd zzesdVar = this.zza;
                        zzazm zzazmVar = this.zzb;
                        zzerwVar2 = zzesdVar.zzc.zzd;
                        zzerwVar2.zzbM(zzazmVar);
                    }
                });
            } else {
                zzerwVar = this.zzc.zzd;
                zzerwVar.zzbM(zzg);
                zzh = this.zzc.zzh(this.zzb);
                zzh.zza().zzc().zzd().zzp();
            }
            zzeua.zza(zzg.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzdmb zzdmbVar) {
        zzerw zzerwVar;
        Executor executor;
        zzerw zzerwVar2;
        zzerw zzerwVar3;
        zzdmb zzdmbVar2 = zzdmbVar;
        synchronized (this.zzc) {
            zzdac zzo = zzdmbVar2.zzo();
            zzerwVar = this.zzc.zzd;
            zzo.zzd(zzerwVar);
            this.zza.zzb(zzdmbVar2);
            executor = this.zzc.zzb;
            zzerwVar2 = this.zzc.zzd;
            zzerwVar2.getClass();
            executor.execute(zzesb.zza(zzerwVar2));
            zzerwVar3 = this.zzc.zzd;
            zzerwVar3.zzl();
        }
    }
}

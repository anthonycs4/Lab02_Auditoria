package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqw implements zzfko<zzddu> {
    final /* synthetic */ zzeft zza;
    final /* synthetic */ zzder zzb;
    final /* synthetic */ zzeqx zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqw(zzeqx zzeqxVar, zzeft zzeftVar, zzder zzderVar) {
        this.zzc = zzeqxVar;
        this.zza = zzeftVar;
        this.zzb = zzderVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        Executor executor;
        Executor executor2;
        final zzazm zzg = this.zzb.zzb().zzg(th);
        synchronized (this.zzc) {
            zzeqx.zze(this.zzc, null);
            this.zzb.zza().zzbM(zzg);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfv)).booleanValue()) {
                executor = this.zzc.zzb;
                executor.execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzequ
                    private final zzeqw zza;
                    private final zzazm zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzg;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzefe zzefeVar;
                        zzeqw zzeqwVar = this.zza;
                        zzazm zzazmVar = this.zzb;
                        zzefeVar = zzeqwVar.zzc.zzd;
                        zzefeVar.zzbM(zzazmVar);
                    }
                });
                executor2 = this.zzc.zzb;
                executor2.execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzeqv
                    private final zzeqw zza;
                    private final zzazm zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zzg;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzerw zzerwVar;
                        zzeqw zzeqwVar = this.zza;
                        zzazm zzazmVar = this.zzb;
                        zzerwVar = zzeqwVar.zzc.zze;
                        zzerwVar.zzbM(zzazmVar);
                    }
                });
            }
            zzeua.zza(zzg.zza, th, "InterstitialAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzddu zzdduVar) {
        Executor executor;
        Executor executor2;
        zzefe zzefeVar;
        zzerw zzerwVar;
        zzddu zzdduVar2 = zzdduVar;
        synchronized (this.zzc) {
            zzeqx.zze(this.zzc, null);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfv)).booleanValue()) {
                zzdac zzo = zzdduVar2.zzo();
                zzefeVar = this.zzc.zzd;
                zzo.zza(zzefeVar);
                zzerwVar = this.zzc.zze;
                zzo.zzd(zzerwVar);
            }
            this.zza.zzb(zzdduVar2);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfv)).booleanValue()) {
                executor = this.zzc.zzb;
                executor.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeqs
                    private final zzeqw zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzefe zzefeVar2;
                        zzefeVar2 = this.zza.zzc.zzd;
                        zzefeVar2.zzbN();
                    }
                });
                executor2 = this.zzc.zzb;
                executor2.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzeqt
                    private final zzeqw zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzerw zzerwVar2;
                        zzerwVar2 = this.zza.zzc.zze;
                        zzerwVar2.zzbN();
                    }
                });
            }
        }
    }
}

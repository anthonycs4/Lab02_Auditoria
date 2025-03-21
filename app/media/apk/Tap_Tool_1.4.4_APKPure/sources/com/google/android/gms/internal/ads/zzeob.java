package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeob implements zzfko {
    final /* synthetic */ zzeft zza;
    final /* synthetic */ zzeoc zzb;
    final /* synthetic */ zzeod zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeob(zzeod zzeodVar, zzeft zzeftVar, zzeoc zzeocVar) {
        this.zzc = zzeodVar;
        this.zza = zzeftVar;
        this.zzb = zzeocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzeqj zzeqjVar;
        final zzazm zzg;
        zzeoq zzeoqVar;
        zzcvp zzk;
        Executor executor;
        zzeqjVar = this.zzc.zze;
        zzcpw zzcpwVar = (zzcpw) zzeqjVar.zzc();
        if (zzcpwVar == null) {
            zzg = zzeuf.zzb(th, null);
        } else {
            zzg = zzcpwVar.zzc().zzg(th);
        }
        synchronized (this.zzc) {
            zzeod.zzf(this.zzc, null);
            if (zzcpwVar != null) {
                zzcpwVar.zzb().zzbM(zzg);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfu)).booleanValue()) {
                    executor = this.zzc.zzc;
                    executor.execute(new Runnable(this, zzg) { // from class: com.google.android.gms.internal.ads.zzeoa
                        private final zzeob zza;
                        private final zzazm zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = zzg;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            zzeoq zzeoqVar2;
                            zzeob zzeobVar = this.zza;
                            zzazm zzazmVar = this.zzb;
                            zzeoqVar2 = zzeobVar.zzc.zzd;
                            zzeoqVar2.zzbM(zzazmVar);
                        }
                    });
                }
            } else {
                zzeoqVar = this.zzc.zzd;
                zzeoqVar.zzbM(zzg);
                zzk = this.zzc.zzk(this.zzb);
                ((zzcpw) zzk.zzf()).zzc().zzd().zzp();
            }
            zzeua.zza(zzg.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzeoq zzeoqVar;
        zzcsn zzcsnVar = (zzcsn) obj;
        synchronized (this.zzc) {
            zzeod.zzf(this.zzc, null);
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfu)).booleanValue()) {
                zzdac zzo = zzcsnVar.zzo();
                zzeoqVar = this.zzc.zzd;
                zzo.zzc(zzeoqVar);
            }
            this.zza.zzb(zzcsnVar);
        }
    }
}

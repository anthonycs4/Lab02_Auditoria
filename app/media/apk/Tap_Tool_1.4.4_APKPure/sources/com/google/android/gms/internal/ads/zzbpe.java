package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpe implements Runnable {
    final /* synthetic */ zzbpp zza;
    final /* synthetic */ zzbol zzb;
    final /* synthetic */ zzbpq zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbpe(zzbpq zzbpqVar, zzbpp zzbppVar, zzbol zzbolVar) {
        this.zzc = zzbpqVar;
        this.zza = zzbppVar;
        this.zzb = zzbolVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        obj = this.zzc.zza;
        synchronized (obj) {
            if (this.zza.zzh() != -1 && this.zza.zzh() != 1) {
                this.zza.zzg();
                zzccz.zze.execute(zzbpd.zza(this.zzb));
                com.google.android.gms.ads.internal.util.zze.zza("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcbw extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzcby zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcbw(zzcby zzcbyVar) {
        this.zza = zzcbyVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Context context;
        zzcct zzcctVar;
        Object obj;
        zzbfv zzbfvVar;
        context = this.zza.zze;
        zzcctVar = this.zza.zzf;
        zzbft zzbftVar = new zzbft(context, zzcctVar.zza);
        obj = this.zza.zza;
        synchronized (obj) {
            try {
                com.google.android.gms.ads.internal.zzs.zzl();
                zzbfvVar = this.zza.zzg;
                zzbfw.zza(zzbfvVar, zzbftVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Cannot config CSI reporter.", e);
            }
        }
    }
}

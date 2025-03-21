package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdyp implements zzdez {
    private final zzcct zza;
    private final zzfla<zzcpz> zzb;
    private final zzess zzc;
    private final zzcib zzd;
    private final zzetk zze;
    private final zzbls zzf;
    private final boolean zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdyp(zzcct zzcctVar, zzfla<zzcpz> zzflaVar, zzess zzessVar, zzcib zzcibVar, zzetk zzetkVar, boolean z, zzbls zzblsVar) {
        this.zza = zzcctVar;
        this.zzb = zzflaVar;
        this.zzc = zzessVar;
        this.zzd = zzcibVar;
        this.zze = zzetkVar;
        this.zzg = z;
        this.zzf = zzblsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z, Context context) {
        int i;
        zzcpz zzcpzVar = (zzcpz) zzfks.zzr(this.zzb);
        this.zzd.zzag(true);
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(this.zzg ? this.zzf.zzc(true) : true, true, this.zzg ? this.zzf.zzd() : false, this.zzg ? this.zzf.zze() : 0.0f, -1, z, this.zzc.zzJ, false);
        com.google.android.gms.ads.internal.zzs.zzb();
        zzdeo zzj = zzcpzVar.zzj();
        zzcib zzcibVar = this.zzd;
        int i2 = this.zzc.zzL;
        if (i2 == -1) {
            zzbad zzbadVar = this.zze.zzj;
            if (zzbadVar != null) {
                int i3 = zzbadVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
                zzcct zzcctVar = this.zza;
                zzess zzessVar = this.zzc;
                String str = zzessVar.zzA;
                zzesx zzesxVar = zzessVar.zzr;
                com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzazi) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcibVar, i, zzcctVar, str, zzjVar, zzesxVar.zzb, zzesxVar.zza, this.zze.zzf), true);
            }
            com.google.android.gms.ads.internal.util.zze.zzd("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzL;
        }
        i = i2;
        zzcct zzcctVar2 = this.zza;
        zzess zzessVar2 = this.zzc;
        String str2 = zzessVar2.zzA;
        zzesx zzesxVar2 = zzessVar2.zzr;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzazi) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcibVar, i, zzcctVar2, str2, zzjVar, zzesxVar2.zzb, zzesxVar2.zza, this.zze.zzf), true);
    }
}

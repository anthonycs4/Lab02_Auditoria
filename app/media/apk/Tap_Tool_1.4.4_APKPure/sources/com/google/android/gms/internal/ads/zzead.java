package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzead implements zzdez {
    private final Context zza;
    private final zzcct zzb;
    private final zzfla<zzddv> zzc;
    private final zzess zzd;
    private final zzcib zze;
    private final zzetk zzf;
    private final zzbls zzg;
    private final boolean zzh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzead(Context context, zzcct zzcctVar, zzfla zzflaVar, zzess zzessVar, zzcib zzcibVar, zzetk zzetkVar, boolean z, zzbls zzblsVar, zzeac zzeacVar) {
        this.zza = context;
        this.zzb = zzcctVar;
        this.zzc = zzflaVar;
        this.zzd = zzessVar;
        this.zze = zzcibVar;
        this.zzf = zzetkVar;
        this.zzg = zzblsVar;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z, Context context) {
        zzddv zzddvVar = (zzddv) zzfks.zzr(this.zzc);
        this.zze.zzag(true);
        boolean zzc = this.zzh ? this.zzg.zzc(false) : false;
        com.google.android.gms.ads.internal.zzs.zzc();
        com.google.android.gms.ads.internal.zzj zzjVar = new com.google.android.gms.ads.internal.zzj(zzc, com.google.android.gms.ads.internal.util.zzr.zzL(this.zza), this.zzh ? this.zzg.zzd() : false, this.zzh ? this.zzg.zze() : 0.0f, -1, z, this.zzd.zzJ, false);
        com.google.android.gms.ads.internal.zzs.zzb();
        zzdeo zzj = zzddvVar.zzj();
        zzcib zzcibVar = this.zze;
        zzess zzessVar = this.zzd;
        int i = zzessVar.zzL;
        zzcct zzcctVar = this.zzb;
        String str = zzessVar.zzA;
        zzesx zzesxVar = zzessVar.zzr;
        com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel((zzazi) null, zzj, (com.google.android.gms.ads.internal.overlay.zzv) null, zzcibVar, i, zzcctVar, str, zzjVar, zzesxVar.zzb, zzesxVar.zza, this.zzf.zzf), true);
    }
}

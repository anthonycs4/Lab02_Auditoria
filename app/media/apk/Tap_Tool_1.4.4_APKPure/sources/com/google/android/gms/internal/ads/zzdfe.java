package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdfe implements zzcwh, zzdcp {
    private final zzcae zza;
    private final Context zzb;
    private final zzcaw zzc;
    private final View zzd;
    private String zze;
    private final zzavq zzf;

    public zzdfe(zzcae zzcaeVar, Context context, zzcaw zzcawVar, View view, zzavq zzavqVar) {
        this.zza = zzcaeVar;
        this.zzb = context;
        this.zzc = zzcawVar;
        this.zzd = view;
        this.zzf = zzavqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzi(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    @ParametersAreNonnullByDefault
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
        if (this.zzc.zzb(this.zzb)) {
            try {
                zzcaw zzcawVar = this.zzc;
                Context context = this.zzb;
                zzcawVar.zzr(context, zzcawVar.zzl(context), this.zza.zzb(), zzbxvVar.zzb(), zzbxvVar.zzc());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzj("Remote Exception to get reward item.", e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzdcp
    public final void zzj() {
        String zzh = this.zzc.zzh(this.zzb);
        this.zze = zzh;
        String valueOf = String.valueOf(zzh);
        String str = this.zzf == zzavq.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.zze = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauj {
    private zzbbu zza;
    private final Context zzb;
    private final String zzc;
    private final zzbdq zzd;
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbrb zzg = new zzbrb();
    private final zzazw zzh = zzazw.zza;

    public zzauj(Context context, String str, zzbdq zzbdqVar, int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzbdqVar;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            this.zza = zzbay.zzb().zza(this.zzb, zzazx.zzd(), this.zzc, this.zzg);
            zzbad zzbadVar = new zzbad(this.zze);
            zzbbu zzbbuVar = this.zza;
            if (zzbbuVar != null) {
                zzbbuVar.zzH(zzbadVar);
                this.zza.zzI(new zzatw(this.zzf, this.zzc));
                this.zza.zze(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e) {
            zzccn.zzl("#007 Could not call remote method.", e);
        }
    }
}

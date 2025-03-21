package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebz implements zzdyi<zzdmb, zzbtl, zzdzw> {
    private final Context zza;
    private final zzdmg zzb;

    public zzebz(Context context, zzdmg zzdmgVar) {
        this.zza = context;
        this.zzb = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp {
        try {
            zzdydVar.zzb.zzo(zzessVar.zzT);
            if (zzeteVar.zza.zza.zzo.zza == 3) {
                zzdydVar.zzb.zzp(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeby(this, zzdydVar, null), zzdydVar.zzc);
            } else {
                zzdydVar.zzb.zzl(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeby(this, zzdydVar, null), zzdydVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzdmb zzb(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp, zzebr {
        zzeag zzeagVar = new zzeag(zzessVar, zzdydVar.zzb, true);
        zzdmc zze = this.zzb.zze(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzdmd(zzeagVar));
        zzeagVar.zzb(zze.zzd());
        zzdydVar.zzc.zzc(zze.zzn());
        return zze.zzh();
    }
}

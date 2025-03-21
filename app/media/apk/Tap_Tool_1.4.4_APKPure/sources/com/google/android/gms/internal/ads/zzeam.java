package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeam implements zzdyi<zzddu, zzbtl, zzdzw> {
    private final Context zza;
    private final zzder zzb;

    public zzeam(Context context, zzder zzderVar) {
        this.zza = context;
        this.zzb = zzderVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp {
        try {
            zzdydVar.zzb.zzo(zzessVar.zzT);
            zzdydVar.zzb.zzj(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeal(this, zzdydVar, null), zzdydVar.zzc);
        } catch (RemoteException e) {
            throw new zzetp(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzddu zzb(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp, zzebr {
        zzeag zzeagVar = new zzeag(zzessVar, zzdydVar.zzb, false);
        zzddv zzc = this.zzb.zzc(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzddy(zzeagVar, null));
        zzeagVar.zzb(zzc.zzd());
        zzdydVar.zzc.zzc(zzc.zzg());
        return zzc.zzh();
    }
}

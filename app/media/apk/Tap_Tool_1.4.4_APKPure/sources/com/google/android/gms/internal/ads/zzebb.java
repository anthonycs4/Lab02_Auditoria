package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebb implements zzdyi<zzdgu, zzbtl, zzdzw> {
    private final Context zza;
    private final zzdfn zzb;
    private zzbrt zzc;
    private final zzcct zzd;

    public zzebb(Context context, zzdfn zzdfnVar, zzcct zzcctVar) {
        this.zza = context;
        this.zzb = zzdfnVar;
        this.zzd = zzcctVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final void zza(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp {
        try {
            zzdydVar.zzb.zzo(zzessVar.zzT);
            if (this.zzd.zzc < ((Integer) zzbba.zzc().zzb(zzbfq.zzbd)).intValue()) {
                zzdydVar.zzb.zzn(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeba(this, zzdydVar, null), zzdydVar.zzc);
            } else {
                zzdydVar.zzb.zzr(zzessVar.zzO, zzessVar.zzu.toString(), zzeteVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzeba(this, zzdydVar, null), zzdydVar.zzc, zzeteVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzetp(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdyi
    public final /* bridge */ /* synthetic */ zzdgu zzb(zzete zzeteVar, zzess zzessVar, zzdyd<zzbtl, zzdzw> zzdydVar) throws zzetp, zzebr {
        if (!zzeteVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzebr(2, "Unified must be used for RTB.");
        }
        zzdgz zzaa = zzdgz.zzaa(this.zzc);
        if (!zzeteVar.zza.zza.zzg.contains(Integer.toString(zzaa.zzv()))) {
            throw new zzebr(1, "No corresponding native ad listener");
        }
        zzdhb zzd = this.zzb.zzd(new zzctc(zzeteVar, zzessVar, zzdydVar.zza), new zzdhl(zzaa), new zzdiy(null, null, this.zzc, null));
        zzdydVar.zzc.zzc(zzd.zzg());
        return zzd.zzh();
    }
}

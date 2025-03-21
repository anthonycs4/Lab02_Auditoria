package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzebp {
    private final zzetx zza;
    private final zzdni zzb;
    private final zzdpn zzc;
    private final zzexv zzd;

    public zzebp(zzetx zzetxVar, zzdni zzdniVar, zzdpn zzdpnVar, zzexv zzexvVar) {
        this.zza = zzetxVar;
        this.zzb = zzdniVar;
        this.zzc = zzdpnVar;
        this.zzd = zzexvVar;
    }

    public final void zza(zzesv zzesvVar, zzess zzessVar, int i, @Nullable zzdye zzdyeVar, long j) {
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
            zzdpm zza = this.zzc.zza();
            zza.zza(zzesvVar);
            zza.zzb(zzessVar);
            zza.zzc("action", "adapter_status");
            zza.zzc("adapter_l", String.valueOf(j));
            zza.zzc("sc", Integer.toString(i));
            if (zzdyeVar != null) {
                zza.zzc("arec", Integer.toString(zzdyeVar.zzb().zza));
                String zza2 = this.zza.zza(zzdyeVar.getMessage());
                if (zza2 != null) {
                    zza.zzc("areec", zza2);
                }
            }
            zzdnh zzd = this.zzb.zzd(zzessVar.zzs);
            if (zzd != null) {
                zza.zzc("ancn", zzd.zza);
                zzbty zzbtyVar = zzd.zzb;
                if (zzbtyVar != null) {
                    zza.zzc("adapter_v", zzbtyVar.toString());
                }
                zzbty zzbtyVar2 = zzd.zzc;
                if (zzbtyVar2 != null) {
                    zza.zzc("adapter_sv", zzbtyVar2.toString());
                }
            }
            zza.zzd();
            return;
        }
        zzexu zza3 = zzexu.zza("adapter_status");
        zza3.zzh(zzesvVar);
        zza3.zzi(zzessVar);
        zza3.zzc("adapter_l", String.valueOf(j));
        zza3.zzc("sc", Integer.toString(i));
        if (zzdyeVar != null) {
            zza3.zzc("arec", Integer.toString(zzdyeVar.zzb().zza));
            String zza4 = this.zza.zza(zzdyeVar.getMessage());
            if (zza4 != null) {
                zza3.zzc("areec", zza4);
            }
        }
        zzdnh zzd2 = this.zzb.zzd(zzessVar.zzs);
        if (zzd2 != null) {
            zza3.zzc("ancn", zzd2.zza);
            zzbty zzbtyVar3 = zzd2.zzb;
            if (zzbtyVar3 != null) {
                zza3.zzc("adapter_v", zzbtyVar3.toString());
            }
            zzbty zzbtyVar4 = zzd2.zzc;
            if (zzbtyVar4 != null) {
                zza3.zzc("adapter_sv", zzbtyVar4.toString());
            }
        }
        this.zzd.zza(zza3);
    }
}

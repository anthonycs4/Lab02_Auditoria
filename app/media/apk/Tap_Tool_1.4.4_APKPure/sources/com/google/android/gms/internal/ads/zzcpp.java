package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcpp {
    private final zzexv zza;
    private final zzdpn zzb;
    private final zzete zzc;

    public zzcpp(zzdpn zzdpnVar, zzete zzeteVar, zzexv zzexvVar) {
        this.zza = zzexvVar;
        this.zzb = zzdpnVar;
        this.zzc = zzeteVar;
    }

    private static String zzb(int i) {
        int i2 = i - 1;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "u" : "ac" : "cb" : "cc" : "bb" : "h";
    }

    public final void zza(long j, int i) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
            zzexv zzexvVar = this.zza;
            zzexu zza = zzexu.zza("ad_closed");
            zza.zzh(this.zzc.zzb.zzb);
            zza.zzc("show_time", String.valueOf(j));
            zza.zzc("ad_format", "app_open_ad");
            zza.zzc("acr", zzb(i));
            zzexvVar.zza(zza);
            return;
        }
        zzdpm zza2 = this.zzb.zza();
        zza2.zza(this.zzc.zzb.zzb);
        zza2.zzc("action", "ad_closed");
        zza2.zzc("show_time", String.valueOf(j));
        zza2.zzc("ad_format", "app_open_ad");
        zza2.zzc("acr", zzb(i));
        zza2.zzd();
    }
}

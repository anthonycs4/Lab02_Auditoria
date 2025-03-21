package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdpw {
    private final String zze;
    private final zzdps zzf;
    private final List<Map<String, String>> zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzs.zzg().zzl();

    public zzdpw(String str, zzdps zzdpsVar) {
        this.zze = str;
        this.zzf = zzdpsVar;
    }

    private final Map<String, String> zzf() {
        Map<String, String> zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzs.zzj().elapsedRealtime(), 10));
        zza.put("tid", this.zza.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                Map<String, String> zzf = zzf();
                zzf.put("action", "adapter_init_started");
                zzf.put("ancn", str);
                this.zzb.add(zzf);
            }
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                Map<String, String> zzf = zzf();
                zzf.put("action", "adapter_init_finished");
                zzf.put("ancn", str);
                this.zzb.add(zzf);
            }
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                Map<String, String> zzf = zzf();
                zzf.put("action", "adapter_init_finished");
                zzf.put("ancn", str);
                zzf.put("rqe", str2);
                this.zzb.add(zzf);
            }
        }
    }

    public final synchronized void zzd() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                if (this.zzc) {
                    return;
                }
                Map<String, String> zzf = zzf();
                zzf.put("action", "init_started");
                this.zzb.add(zzf);
                this.zzc = true;
            }
        }
    }

    public final synchronized void zze() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbn)).booleanValue()) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                if (this.zzd) {
                    return;
                }
                Map<String, String> zzf = zzf();
                zzf.put("action", "init_finished");
                this.zzb.add(zzf);
                for (Map<String, String> map : this.zzb) {
                    this.zzf.zzb(map);
                }
                this.zzd = true;
            }
        }
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcny implements zzcnp {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzs.zzg().zzl();

    public zzcny(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcnp
    public final void zza(Map<String, String> map) {
        if (map.isEmpty()) {
            return;
        }
        String str = map.get("gad_idless");
        if (str != null) {
            boolean parseBoolean = Boolean.parseBoolean(str);
            map.remove("gad_idless");
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzao)).booleanValue()) {
                this.zzb.zzA(parseBoolean);
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue() && parseBoolean) {
                    this.zza.deleteDatabase("OfflineUpload.db");
                }
            }
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaj)).booleanValue()) {
            com.google.android.gms.ads.internal.zzs.zzA().zze(bundle);
        }
    }
}

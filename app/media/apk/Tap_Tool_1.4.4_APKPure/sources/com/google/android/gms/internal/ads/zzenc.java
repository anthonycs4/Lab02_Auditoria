package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzenc {
    private final zzbxf zza;
    private final int zzb;

    public zzenc(zzbxf zzbxfVar, int i) {
        this.zza = zzbxfVar;
        this.zzb = i;
    }

    public final String zza() {
        return this.zza.zzd;
    }

    public final String zzb() {
        return this.zza.zza.getString("ms");
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final List<String> zzd() {
        return this.zza.zze;
    }

    public final String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }
}

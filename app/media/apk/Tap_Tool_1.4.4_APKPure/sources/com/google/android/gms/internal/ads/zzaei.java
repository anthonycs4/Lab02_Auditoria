package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaei {
    private Uri zza;
    private Map<String, String> zzb = Collections.emptyMap();
    private long zzc;
    private int zzd;

    public final zzaei zza(Uri uri) {
        this.zza = uri;
        return this;
    }

    public final zzaei zzb(Map<String, String> map) {
        this.zzb = map;
        return this;
    }

    public final zzaei zzc(long j) {
        this.zzc = j;
        return this;
    }

    public final zzaei zzd(int i) {
        this.zzd = 6;
        return this;
    }

    public final zzaej zze() {
        zzafs.zzg(this.zza, "The uri must be set.");
        return new zzaej(this.zza, this.zzb, this.zzc, this.zzd);
    }
}

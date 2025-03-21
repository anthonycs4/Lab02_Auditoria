package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzjw {
    private String zza;
    private Uri zzb;
    private final List<Integer> zzd = Collections.emptyList();
    private final Map<String, String> zzc = Collections.emptyMap();
    private final List zze = Collections.emptyList();
    private final List zzf = Collections.emptyList();

    public final zzjw zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzjw zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzkd zzc() {
        zzkc zzkcVar;
        Uri uri = this.zzb;
        if (uri != null) {
            zzkcVar = new zzkc(uri, null, null, null, this.zze, null, this.zzf, null, null);
            String str = this.zza;
            if (str == null) {
                str = uri.toString();
            }
            this.zza = str;
        } else {
            zzkcVar = null;
        }
        String str2 = this.zza;
        Objects.requireNonNull(str2);
        return new zzkd(str2, new zzjy(0L, Long.MIN_VALUE, false, false, false, null), zzkcVar, new zzkb(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), zzkg.zza, null);
    }
}

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaaa {
    private static final AtomicLong zzd = new AtomicLong();
    public final zzaej zza;
    public final Uri zzb;
    public final Map<String, List<String>> zzc;

    public zzaaa(long j, zzaej zzaejVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.zza = zzaejVar;
        this.zzb = uri;
        this.zzc = map;
    }

    public static long zza() {
        return zzd.getAndIncrement();
    }
}

package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfzi {
    private static final zzfzi zza = new zzfzg(null);
    private static final zzfzi zzb = new zzfzh(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfzi(zzfzf zzfzfVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfzi zzd() {
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzfzi zze() {
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> zza(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void zzb(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void zzc(Object obj, Object obj2, long j);
}

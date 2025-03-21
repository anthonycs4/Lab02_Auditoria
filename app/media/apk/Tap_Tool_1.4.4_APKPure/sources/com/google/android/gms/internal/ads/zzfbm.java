package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfbm {
    private final Context zza;
    private final Looper zzb;

    public zzfbm(Context context, Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(String str) {
        zzfcc zza = zzfcg.zza();
        zza.zzb(this.zza.getPackageName());
        zza.zza(zzfcf.BLOCKED_IMPRESSION);
        zzfbz zza2 = zzfca.zza();
        zza2.zzb(str);
        zza2.zza(zzfby.BLOCKED_REASON_BACKGROUND);
        zza.zzc(zza2);
        new zzfbn(this.zza, this.zzb, zza.zzah()).zza();
    }
}

package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzagc {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzagc zza(int i) {
        zzafs.zzd(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzagd zzb() {
        zzafs.zzd(!this.zzb);
        this.zzb = true;
        return new zzagd(this.zza, null);
    }
}

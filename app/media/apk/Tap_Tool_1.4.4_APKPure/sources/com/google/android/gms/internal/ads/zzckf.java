package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzckf implements zzgdq<WeakReference<Context>> {
    private final zzckc zza;

    public zzckf(zzckc zzckcVar) {
        this.zza = zzckcVar;
    }

    public final WeakReference<Context> zza() {
        WeakReference<Context> zzb = this.zza.zzb();
        zzgdw.zzb(zzb);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgeb
    public final /* bridge */ /* synthetic */ Object zzb() {
        WeakReference<Context> zzb = this.zza.zzb();
        zzgdw.zzb(zzb);
        return zzb;
    }
}

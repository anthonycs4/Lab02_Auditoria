package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeuk implements zzcwk {
    private final HashSet<zzcbt> zza = new HashSet<>();
    private final Context zzb;
    private final zzccc zzc;

    public zzeuk(Context context, zzccc zzcccVar) {
        this.zzb = context;
        this.zzc = zzcccVar;
    }

    public final synchronized void zzb(HashSet<zzcbt> hashSet) {
        this.zza.clear();
        this.zza.addAll(hashSet);
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final synchronized void zzbM(zzazm zzazmVar) {
        if (zzazmVar.zza != 3) {
            this.zzc.zzc(this.zza);
        }
    }

    public final Bundle zzc() {
        return this.zzc.zzj(this.zzb, this);
    }
}

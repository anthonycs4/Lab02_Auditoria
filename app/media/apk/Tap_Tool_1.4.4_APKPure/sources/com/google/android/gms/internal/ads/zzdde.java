package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdde {
    private final List<String> zza;
    private final zzeyn zzb;
    private boolean zzc;

    public zzdde(zzess zzessVar, zzeyn zzeynVar) {
        this.zza = zzessVar.zzo;
        this.zzb = zzeynVar;
    }

    public final void zza() {
        if (this.zzc) {
            return;
        }
        this.zzb.zza(this.zza);
        this.zzc = true;
    }
}

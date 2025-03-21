package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzazm;
import com.google.android.gms.internal.ads.zzbcw;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzav extends zzbcw {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzay zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzay zzayVar, Context context) {
        this.zzb = zzayVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbcx
    public final void zze(zzazm zzazmVar) {
        if (zzazmVar == null) {
            return;
        }
        this.zzb.zzn(this.zza, zzazmVar.zzb, true, true);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzedw {
    private final Context zza;
    private final zzder zzb;

    public zzedw(Context context, zzder zzderVar) {
        this.zza = context;
        this.zzb = zzderVar;
    }

    public final /* bridge */ /* synthetic */ Object zza(zzete zzeteVar, zzess zzessVar, View view, zzeds zzedsVar) {
        zzddv zzc = this.zzb.zzc(new zzctc(zzeteVar, zzessVar, null), new zzedu(this, zzedt.zza));
        zzedsVar.zzd(new zzedv(this, zzc));
        return zzc.zzh();
    }
}

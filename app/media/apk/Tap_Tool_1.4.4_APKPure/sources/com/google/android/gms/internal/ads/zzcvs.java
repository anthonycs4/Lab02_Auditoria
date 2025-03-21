package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcvs {
    private Context zza;
    private zzetk zzb;
    private Bundle zzc;
    private zzetf zzd;

    public final zzcvs zza(Context context) {
        this.zza = context;
        return this;
    }

    public final zzcvs zzb(zzetk zzetkVar) {
        this.zzb = zzetkVar;
        return this;
    }

    public final zzcvs zzc(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzcvt zzd() {
        return new zzcvt(this, null);
    }

    public final zzcvs zze(zzetf zzetfVar) {
        this.zzd = zzetfVar;
        return this;
    }
}

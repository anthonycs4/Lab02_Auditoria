package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcac {
    private Context zza;
    private Clock zzb;
    private com.google.android.gms.ads.internal.util.zzg zzc;
    private zzcaw zzd;

    private zzcac() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzcac(zzcab zzcabVar) {
    }

    public final zzcac zza(Context context) {
        Objects.requireNonNull(context);
        this.zza = context;
        return this;
    }

    public final zzcac zzb(Clock clock) {
        Objects.requireNonNull(clock);
        this.zzb = clock;
        return this;
    }

    public final zzcac zzc(com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zzc = zzgVar;
        return this;
    }

    public final zzcac zzd(zzcaw zzcawVar) {
        this.zzd = zzcawVar;
        return this;
    }

    public final zzcax zze() {
        zzgdw.zzc(this.zza, Context.class);
        zzgdw.zzc(this.zzb, Clock.class);
        zzgdw.zzc(this.zzc, com.google.android.gms.ads.internal.util.zzg.class);
        zzgdw.zzc(this.zzd, zzcaw.class);
        return new zzcad(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}

package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzakp {
    private final Handler zza;
    private final zzakq zzb;

    public zzakp(Handler handler, zzakq zzakqVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzakqVar;
    }

    public final void zza(zzall zzallVar) {
        this.zza.post(new zzakj(this, zzallVar));
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzakk(this, str, j, j2));
    }

    public final void zzc(zzajt zzajtVar) {
        this.zza.post(new zzakl(this, zzajtVar));
    }

    public final void zzd(int i, long j, long j2) {
        this.zza.post(new zzakm(this, i, j, j2));
    }

    public final void zze(zzall zzallVar) {
        this.zza.post(new zzakn(this, zzallVar));
    }

    public final void zzf(int i) {
        this.zza.post(new zzako(this, i));
    }
}

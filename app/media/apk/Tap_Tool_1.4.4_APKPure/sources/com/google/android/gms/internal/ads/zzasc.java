package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzasc {
    private final Handler zza;
    private final zzasd zzb;

    public zzasc(Handler handler, zzasd zzasdVar) {
        Objects.requireNonNull(handler);
        this.zza = handler;
        this.zzb = zzasdVar;
    }

    public final void zza(zzall zzallVar) {
        this.zza.post(new zzarv(this, zzallVar));
    }

    public final void zzb(String str, long j, long j2) {
        this.zza.post(new zzarw(this, str, j, j2));
    }

    public final void zzc(zzajt zzajtVar) {
        this.zza.post(new zzarx(this, zzajtVar));
    }

    public final void zzd(int i, long j) {
        this.zza.post(new zzary(this, i, j));
    }

    public final void zze(int i, int i2, int i3, float f) {
        this.zza.post(new zzarz(this, i, i2, i3, f));
    }

    public final void zzf(Surface surface) {
        this.zza.post(new zzasa(this, surface));
    }

    public final void zzg(zzall zzallVar) {
        this.zza.post(new zzasb(this, zzallVar));
    }
}

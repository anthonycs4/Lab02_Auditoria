package com.google.android.gms.internal.ads;

import javax.annotation.Nonnull;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzagk<T> {
    @Nonnull
    public final T zza;
    private zzagc zzb = new zzagc();
    private boolean zzc;
    private boolean zzd;

    public zzagk(@Nonnull T t) {
        this.zza = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagk) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(zzagj<T> zzagjVar) {
        this.zzd = true;
        if (this.zzc) {
            this.zzb.zzb();
        }
    }

    public final void zzb(int i, zzagi<T> zzagiVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzagiVar.zza(this.zza);
    }

    public final void zzc(zzagj<T> zzagjVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        this.zzb.zzb();
        this.zzb = new zzagc();
        this.zzc = false;
    }
}

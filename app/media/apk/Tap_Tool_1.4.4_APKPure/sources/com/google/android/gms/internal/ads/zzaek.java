package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaek {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzadr[] zze = new zzadr[100];
    private final zzadr[] zza = new zzadr[1];

    public zzaek(boolean z, int i) {
    }

    public final synchronized void zza() {
        zzb(0);
    }

    public final synchronized void zzb(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzf();
        }
    }

    public final synchronized zzadr zzc() {
        zzadr zzadrVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzadr[] zzadrVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzadrVar = zzadrVarArr[i2];
            Objects.requireNonNull(zzadrVar);
            zzadrVarArr[i2] = null;
        } else {
            zzadrVar = new zzadr(new byte[65536], 0);
        }
        return zzadrVar;
    }

    public final synchronized void zzd(zzadr zzadrVar) {
        zzadr[] zzadrVarArr = this.zza;
        zzadrVarArr[0] = zzadrVar;
        zze(zzadrVarArr);
    }

    public final synchronized void zze(zzadr[] zzadrVarArr) {
        int length = this.zzd + zzadrVarArr.length;
        zzadr[] zzadrVarArr2 = this.zze;
        int length2 = zzadrVarArr2.length;
        if (length >= length2) {
            this.zze = (zzadr[]) Arrays.copyOf(zzadrVarArr2, Math.max(length2 + length2, length));
        }
        for (zzadr zzadrVar : zzadrVarArr) {
            zzadr[] zzadrVarArr3 = this.zze;
            int i = this.zzd;
            this.zzd = i + 1;
            zzadrVarArr3[i] = zzadrVar;
        }
        this.zzc -= zzadrVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzaht.zzx(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max >= i) {
            return;
        }
        Arrays.fill(this.zze, max, i, (Object) null);
        this.zzd = max;
    }

    public final synchronized int zzg() {
        return this.zzc * 65536;
    }
}

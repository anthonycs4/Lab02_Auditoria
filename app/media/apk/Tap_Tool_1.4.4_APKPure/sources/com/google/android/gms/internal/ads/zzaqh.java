package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaqh {
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzaqb[] zze = new zzaqb[100];
    private final zzaqb[] zza = new zzaqb[1];

    public zzaqh(boolean z, int i) {
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

    public final synchronized zzaqb zzc() {
        zzaqb zzaqbVar;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzaqb[] zzaqbVarArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzaqbVar = zzaqbVarArr[i2];
            zzaqbVarArr[i2] = null;
        } else {
            zzaqbVar = new zzaqb(new byte[65536], 0);
        }
        return zzaqbVar;
    }

    public final synchronized void zzd(zzaqb zzaqbVar) {
        zzaqb[] zzaqbVarArr = this.zza;
        zzaqbVarArr[0] = zzaqbVar;
        zze(zzaqbVarArr);
    }

    public final synchronized void zze(zzaqb[] zzaqbVarArr) {
        int length = this.zzd + zzaqbVarArr.length;
        zzaqb[] zzaqbVarArr2 = this.zze;
        int length2 = zzaqbVarArr2.length;
        if (length >= length2) {
            this.zze = (zzaqb[]) Arrays.copyOf(zzaqbVarArr2, Math.max(length2 + length2, length));
        }
        for (zzaqb zzaqbVar : zzaqbVarArr) {
            zzaqu.zza(zzaqbVar.zza.length == 65536);
            zzaqb[] zzaqbVarArr3 = this.zze;
            int i = this.zzd;
            this.zzd = i + 1;
            zzaqbVarArr3[i] = zzaqbVar;
        }
        this.zzc -= zzaqbVarArr.length;
        notifyAll();
    }

    public final synchronized void zzf() {
        int max = Math.max(0, zzarj.zze(this.zzb, 65536) - this.zzc);
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

package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzhg implements Callable {
    protected final String zza = getClass().getSimpleName();
    protected final zzfy zzb;
    protected final String zzc;
    protected final String zzd;
    protected final zzcn zze;
    protected Method zzf;
    protected final int zzg;
    protected final int zzh;

    public zzhg(zzfy zzfyVar, String str, String str2, zzcn zzcnVar, int i, int i2) {
        this.zzb = zzfyVar;
        this.zzc = str;
        this.zzd = str2;
        this.zze = zzcnVar;
        this.zzg = i;
        this.zzh = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzb();
        return null;
    }

    protected abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzb() throws Exception {
        long nanoTime;
        Method zzp;
        int i;
        try {
            nanoTime = System.nanoTime();
            zzp = this.zzb.zzp(this.zzc, this.zzd);
            this.zzf = zzp;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
        if (zzp == null) {
            return null;
        }
        zza();
        zzew zzi = this.zzb.zzi();
        if (zzi != null && (i = this.zzg) != Integer.MIN_VALUE) {
            zzi.zza(this.zzh, i, (System.nanoTime() - nanoTime) / 1000, null, null);
        }
        return null;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzld {
    private final zzlc zza;
    private final zzlb zzb;
    private final zzaft zzc;
    private final zzlq zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzld(zzlb zzlbVar, zzlc zzlcVar, zzlq zzlqVar, int i, zzaft zzaftVar, Looper looper) {
        this.zzb = zzlbVar;
        this.zza = zzlcVar;
        this.zzd = zzlqVar;
        this.zzg = looper;
        this.zzc = zzaftVar;
        this.zzh = i;
    }

    public final zzlc zza() {
        return this.zza;
    }

    public final zzld zzb(int i) {
        zzafs.zzd(!this.zzi);
        this.zze = 1;
        return this;
    }

    public final int zzc() {
        return this.zze;
    }

    public final zzld zzd(Object obj) {
        zzafs.zzd(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final Object zze() {
        return this.zzf;
    }

    public final Looper zzf() {
        return this.zzg;
    }

    public final zzld zzg() {
        zzafs.zzd(!this.zzi);
        this.zzi = true;
        this.zzb.zzf(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzj() throws InterruptedException {
        zzafs.zzd(this.zzi);
        zzafs.zzd(this.zzg.getThread() != Thread.currentThread());
        while (!this.zzk) {
            wait();
        }
        return this.zzj;
    }
}

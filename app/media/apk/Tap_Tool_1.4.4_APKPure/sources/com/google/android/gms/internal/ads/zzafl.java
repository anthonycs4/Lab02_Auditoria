package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzafl {
    public static final zzaff zza = new zzaff(0, -9223372036854775807L, null);
    public static final zzaff zzb = new zzaff(1, -9223372036854775807L, null);
    public static final zzaff zzc = new zzaff(2, -9223372036854775807L, null);
    public static final zzaff zzd = new zzaff(3, -9223372036854775807L, null);
    private final ExecutorService zze = zzaht.zzl("ExoPlayer:Loader:ProgressiveMediaPeriod");
    private zzafg<? extends zzafh> zzf;
    private IOException zzg;

    public zzafl(String str) {
    }

    public static zzaff zza(boolean z, long j) {
        return new zzaff(z ? 1 : 0, j, null);
    }

    public final boolean zzb() {
        return this.zzg != null;
    }

    public final void zzc() {
        this.zzg = null;
    }

    public final <T extends zzafh> long zzd(T t, zzafe<T> zzafeVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzafs.zzf(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzafg(this, myLooper, t, zzafeVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zze() {
        return this.zzf != null;
    }

    public final void zzf() {
        zzafg<? extends zzafh> zzafgVar = this.zzf;
        zzafs.zzf(zzafgVar);
        zzafgVar.zzc(false);
    }

    public final void zzg(zzafi zzafiVar) {
        zzafg<? extends zzafh> zzafgVar = this.zzf;
        if (zzafgVar != null) {
            zzafgVar.zzc(true);
        }
        this.zze.execute(new zzafj(zzafiVar));
        this.zze.shutdown();
    }

    public final void zzh(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzafg<? extends zzafh> zzafgVar = this.zzf;
            if (zzafgVar != null) {
                zzafgVar.zza(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}

package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaqs {
    private final ExecutorService zza = zzarj.zzb("Loader:ExtractorMediaPeriod");
    private zzaqp<? extends zzaqq> zzb;
    private IOException zzc;

    public zzaqs(String str) {
    }

    public final <T extends zzaqq> long zza(T t, zzaqo<T> zzaqoVar, int i) {
        Looper myLooper = Looper.myLooper();
        zzaqu.zzd(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzaqp(this, myLooper, t, zzaqoVar, i, elapsedRealtime).zzb(0L);
        return elapsedRealtime;
    }

    public final boolean zzb() {
        return this.zzb != null;
    }

    public final void zzc() {
        this.zzb.zzc(false);
    }

    public final void zzd(Runnable runnable) {
        zzaqp<? extends zzaqq> zzaqpVar = this.zzb;
        if (zzaqpVar != null) {
            zzaqpVar.zzc(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final void zze(int i) throws IOException {
        IOException iOException = this.zzc;
        if (iOException == null) {
            zzaqp<? extends zzaqq> zzaqpVar = this.zzb;
            if (zzaqpVar != null) {
                zzaqpVar.zza(zzaqpVar.zza);
                return;
            }
            return;
        }
        throw iOException;
    }
}

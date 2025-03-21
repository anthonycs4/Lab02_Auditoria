package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeu implements zzex {
    private static zzeu zzb;
    private final Context zzc;
    private final zzfcu zzd;
    private final zzfdb zze;
    private final zzfdd zzf;
    private final zzfs zzg;
    private final zzfbb zzh;
    private final Executor zzi;
    private final zzhj zzj;
    private final zzfda zzk;
    private volatile boolean zzm;
    volatile long zza = 0;
    private final Object zzl = new Object();
    private volatile boolean zzn = false;

    zzeu(Context context, zzfbb zzfbbVar, zzfcu zzfcuVar, zzfdb zzfdbVar, zzfdd zzfddVar, zzfs zzfsVar, Executor executor, zzfax zzfaxVar, zzhj zzhjVar) {
        this.zzc = context;
        this.zzh = zzfbbVar;
        this.zzd = zzfcuVar;
        this.zze = zzfdbVar;
        this.zzf = zzfddVar;
        this.zzg = zzfsVar;
        this.zzi = executor;
        this.zzj = zzhjVar;
        this.zzk = new zzes(this, zzfaxVar);
    }

    public static synchronized zzeu zza(String str, Context context, boolean z, boolean z2) {
        zzeu zzeuVar;
        synchronized (zzeu.class) {
            if (zzb == null) {
                zzfbc zzd = zzfbd.zzd();
                zzd.zza(str);
                zzd.zzb(z);
                zzfbd zzd2 = zzd.zzd();
                ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
                zzfbb zzb2 = zzfbb.zzb(context, newCachedThreadPool, z2);
                zzfbu zza = zzfbu.zza(context, newCachedThreadPool, zzb2, zzd2);
                zzfr zzfrVar = new zzfr(context);
                zzfs zzfsVar = new zzfs(zzd2, zza, new zzgf(context, zzfrVar), zzfrVar);
                zzhj zzb3 = zzfch.zzb(context, zzb2);
                zzfax zzfaxVar = new zzfax();
                zzeu zzeuVar2 = new zzeu(context, zzb2, new zzfcu(context, zzb3), new zzfdb(context, zzb3, new zzer(zzb2), ((Boolean) zzbba.zzc().zzb(zzbfq.zzbr)).booleanValue()), new zzfdd(context, zzfsVar, zzb2, zzfaxVar), zzfsVar, newCachedThreadPool, zzfaxVar, zzb3);
                zzb = zzeuVar2;
                zzeuVar2.zzc();
                zzb.zzk();
            }
            zzeuVar = zzb;
        }
        return zzeuVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        if (r4.zza().zzc().equals(r5.zzc()) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzeu r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeu.zzo(com.google.android.gms.internal.ads.zzeu):void");
    }

    private final zzfct zzq(int i) {
        if (zzfch.zza(this.zzj)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbp)).booleanValue()) {
                return this.zze.zzc(1);
            }
            return this.zzd.zzc(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzn;
    }

    final synchronized void zzc() {
        long currentTimeMillis = System.currentTimeMillis();
        zzfct zzq = zzq(1);
        if (zzq != null) {
            if (this.zzf.zza(zzq)) {
                this.zzn = true;
                return;
            }
            return;
        }
        this.zzh.zzc(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd(MotionEvent motionEvent) {
        zzfbe zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            try {
                zzb2.zzd(null, motionEvent);
            } catch (zzfdc e) {
                this.zzh.zzd(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zze(int i, int i2, int i3) {
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzk();
        zzfbe zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzc = zzb2.zzc(context, null, str, view, activity);
            this.zzh.zze(5000, System.currentTimeMillis() - currentTimeMillis, zzc, null);
            return zzc;
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzh(View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzi(Context context, View view, Activity activity) {
        zzk();
        zzfbe zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zzb3 = zzb2.zzb(context, null, view, null);
            this.zzh.zze(5002, System.currentTimeMillis() - currentTimeMillis, zzb3, null);
            return zzb3;
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzj(Context context) {
        zzk();
        zzfbe zzb2 = this.zzf.zzb();
        if (zzb2 != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String zza = zzb2.zza(context, null);
            this.zzh.zze(5001, System.currentTimeMillis() - currentTimeMillis, zza, null);
            return zza;
        }
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public final void zzk() {
        if (this.zzm) {
            return;
        }
        synchronized (this.zzl) {
            if (!this.zzm) {
                if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                    return;
                }
                zzfct zzc = this.zzf.zzc();
                if ((zzc == null || zzc.zze(3600L)) && zzfch.zza(this.zzj)) {
                    this.zzi.execute(new zzet(this));
                }
            }
        }
    }
}

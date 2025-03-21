package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzccg;
import com.google.android.gms.internal.ads.zzcct;
import com.google.android.gms.internal.ads.zzccz;
import com.google.android.gms.internal.ads.zzeu;
import com.google.android.gms.internal.ads.zzex;
import com.google.android.gms.internal.ads.zzfa;
import com.google.android.gms.internal.ads.zzfbb;
import com.google.android.gms.internal.ads.zzfch;
import com.google.android.gms.internal.ads.zzfdb;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzi implements Runnable, zzex {
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfbb zzi;
    private Context zzj;
    private final Context zzk;
    private zzcct zzl;
    private final zzcct zzm;
    private final boolean zzn;
    private int zzo;
    private final List<Object[]> zzb = new Vector();
    private final AtomicReference<zzex> zzc = new AtomicReference<>();
    private final AtomicReference<zzex> zzd = new AtomicReference<>();
    final CountDownLatch zza = new CountDownLatch(1);

    public zzi(Context context, zzcct zzcctVar) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = zzcctVar;
        this.zzm = zzcctVar;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = newCachedThreadPool;
        boolean booleanValue = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbu)).booleanValue();
        this.zzn = booleanValue;
        zzfbb zzb = zzfbb.zzb(context, newCachedThreadPool, booleanValue);
        this.zzi = zzb;
        this.zzf = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbq)).booleanValue();
        this.zzg = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbv)).booleanValue();
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbt)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        Context context2 = this.zzj;
        zzh zzhVar = new zzh(this);
        this.zze = new zzfdb(this.zzj, zzfch.zzb(context2, zzb), zzhVar, ((Boolean) zzbba.zzc().zzb(zzbfq.zzbr)).booleanValue()).zzd(1);
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbM)).booleanValue()) {
            zzccz.zza.execute(this);
            return;
        }
        zzbay.zza();
        if (zzccg.zzp()) {
            zzccz.zza.execute(this);
        } else {
            run();
        }
    }

    private final void zzl() {
        zzex zzn = zzn();
        if (this.zzb.isEmpty() || zzn == null) {
            return;
        }
        for (Object[] objArr : this.zzb) {
            int length = objArr.length;
            if (length == 1) {
                zzn.zzd((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzn.zze(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzb.clear();
    }

    private final void zzm(boolean z) {
        this.zzc.set(zzfa.zzs(this.zzl.zza, zzo(this.zzj), z, this.zzo));
    }

    private final zzex zzn() {
        if (zzk() == 2) {
            return this.zzd.get();
        }
        return this.zzc.get();
    }

    private static final Context zzo(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.content.Context, com.google.android.gms.internal.ads.zzcct] */
    @Override // java.lang.Runnable
    public final void run() {
        try {
            boolean z = this.zzl.zzd;
            final boolean z2 = false;
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzaH)).booleanValue() && z) {
                z2 = true;
            }
            if (zzk() == 1) {
                zzm(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable(this, z2) { // from class: com.google.android.gms.ads.internal.zzg
                        private final zzi zza;
                        private final boolean zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = this;
                            this.zzb = z2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzb(this.zzb);
                        }
                    });
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                try {
                    zzeu zza = zzeu.zza(this.zzl.zza, zzo(this.zzj), z2, this.zzn);
                    this.zzd.set(zza);
                    if (this.zzg && !zza.zzb()) {
                        this.zzo = 1;
                        zzm(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzm(z2);
                    this.zzi.zzd(2031, System.currentTimeMillis() - currentTimeMillis, e);
                }
            }
        } finally {
            this.zza.countDown();
            this.zzj = null;
            this.zzl = null;
        }
    }

    protected final boolean zza() {
        try {
            this.zza.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.zze.zzj("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            zzeu.zza(this.zzm.zza, zzo(this.zzk), z, this.zzn).zzk();
        } catch (NullPointerException e) {
            this.zzi.zzd(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzd(MotionEvent motionEvent) {
        zzex zzn = zzn();
        if (zzn != null) {
            zzl();
            zzn.zzd(motionEvent);
            return;
        }
        this.zzb.add(new Object[]{motionEvent});
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zze(int i, int i2, int i3) {
        zzex zzn = zzn();
        if (zzn == null) {
            this.zzb.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        zzl();
        zzn.zze(i, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzf(Context context, String str, View view, Activity activity) {
        zzex zzn;
        if (!zza() || (zzn = zzn()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzl();
        return zzn.zzf(zzo(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzg(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final void zzh(View view) {
        zzex zzn = zzn();
        if (zzn != null) {
            zzn.zzh(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzi(Context context, View view, Activity activity) {
        zzex zzn = zzn();
        return zzn != null ? zzn.zzi(context, view, null) : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    @Override // com.google.android.gms.internal.ads.zzex
    public final String zzj(Context context) {
        zzex zzn;
        if (!zza() || (zzn = zzn()) == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        zzl();
        return zzn.zzj(zzo(context));
    }

    protected final int zzk() {
        if (!this.zzf || this.zze) {
            return this.zzo;
        }
        return 1;
    }
}

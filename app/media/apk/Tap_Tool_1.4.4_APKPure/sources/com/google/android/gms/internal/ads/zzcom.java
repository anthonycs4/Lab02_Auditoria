package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcom implements zzcwh, zzcxt, zzcwz, zzazi, zzcwv {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzete zze;
    private final zzess zzf;
    private final zzeyk zzg;
    private final zzetu zzh;
    private final zzfb zzi;
    private final zzbgp zzj;
    private final WeakReference<View> zzk;
    private boolean zzl;
    private final AtomicBoolean zzm = new AtomicBoolean();
    private final zzbgr zzn;

    public zzcom(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzete zzeteVar, zzess zzessVar, zzeyk zzeykVar, zzetu zzetuVar, View view, zzfb zzfbVar, zzbgp zzbgpVar, zzbgr zzbgrVar, byte[] bArr) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzeteVar;
        this.zzf = zzessVar;
        this.zzg = zzeykVar;
        this.zzh = zzetuVar;
        this.zzi = zzfbVar;
        this.zzk = new WeakReference<>(view);
        this.zzj = zzbgpVar;
        this.zzn = zzbgrVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzq */
    public final void zzp() {
        String zzi = ((Boolean) zzbba.zzc().zzb(zzbfq.zzbT)).booleanValue() ? this.zzi.zzb().zzi(this.zza, this.zzk.get(), null) : null;
        if ((!((Boolean) zzbba.zzc().zzb(zzbfq.zzai)).booleanValue() || !this.zze.zzb.zzb.zzg) && zzbhc.zzg.zze().booleanValue()) {
            zzfks.zzp((zzfkj) zzfks.zzh(zzfkj.zzw(zzfks.zza(null)), ((Long) zzbba.zzc().zzb(zzbfq.zzaG)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcol(this, zzi), this.zzb);
            return;
        }
        zzetu zzetuVar = this.zzh;
        zzeyk zzeykVar = this.zzg;
        zzete zzeteVar = this.zze;
        zzess zzessVar = this.zzf;
        zzetuVar.zza(zzeykVar.zzb(zzeteVar, zzessVar, false, zzi, null, zzessVar.zzd));
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        if ((((Boolean) zzbba.zzc().zzb(zzbfq.zzai)).booleanValue() && this.zze.zzb.zzb.zzg) || !zzbhc.zzd.zze().booleanValue()) {
            zzetu zzetuVar = this.zzh;
            zzeyk zzeykVar = this.zzg;
            zzete zzeteVar = this.zze;
            zzess zzessVar = this.zzf;
            List<String> zza = zzeykVar.zza(zzeteVar, zzessVar, zzessVar.zzc);
            com.google.android.gms.ads.internal.zzs.zzc();
            zzetuVar.zzb(zza, true == com.google.android.gms.ads.internal.util.zzr.zzI(this.zza) ? 2 : 1);
            return;
        }
        zzfks.zzp(zzfks.zzf(zzfkj.zzw((zzfla) this.zzj.zzb()), Throwable.class, zzcoh.zza, zzccz.zzf), new zzcok(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final synchronized void zzbN() {
        if (this.zzl) {
            ArrayList arrayList = new ArrayList(this.zzf.zzd);
            arrayList.addAll(this.zzf.zzf);
            this.zzh.zza(this.zzg.zzb(this.zze, this.zzf, true, null, null, arrayList));
        } else {
            zzetu zzetuVar = this.zzh;
            zzeyk zzeykVar = this.zzg;
            zzete zzeteVar = this.zze;
            zzess zzessVar = this.zzf;
            zzetuVar.zza(zzeykVar.zza(zzeteVar, zzessVar, zzessVar.zzm));
            zzetu zzetuVar2 = this.zzh;
            zzeyk zzeykVar2 = this.zzg;
            zzete zzeteVar2 = this.zze;
            zzess zzessVar2 = this.zzf;
            zzetuVar2.zza(zzeykVar2.zza(zzeteVar2, zzessVar2, zzessVar2.zzf));
        }
        this.zzl = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        if (this.zzm.compareAndSet(false, true)) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbV)).booleanValue()) {
                this.zzc.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcoi
                    private final zzcom zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzj();
                    }
                });
            } else {
                zzp();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
        zzetu zzetuVar = this.zzh;
        zzeyk zzeykVar = this.zzg;
        zzess zzessVar = this.zzf;
        zzetuVar.zza(zzeykVar.zzc(zzessVar, zzessVar.zzh, zzbxvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
        zzetu zzetuVar = this.zzh;
        zzeyk zzeykVar = this.zzg;
        zzete zzeteVar = this.zze;
        zzess zzessVar = this.zzf;
        zzetuVar.zza(zzeykVar.zza(zzeteVar, zzessVar, zzessVar.zzg));
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
        zzetu zzetuVar = this.zzh;
        zzeyk zzeykVar = this.zzg;
        zzete zzeteVar = this.zze;
        zzess zzessVar = this.zzf;
        zzetuVar.zza(zzeykVar.zza(zzeteVar, zzessVar, zzessVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcwv
    public final void zzi(zzazm zzazmVar) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzaZ)).booleanValue()) {
            this.zzh.zza(this.zzg.zza(this.zze, this.zzf, zzeyk.zzd(2, zzazmVar.zza, this.zzf.zzn)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zzb.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcoj
            private final zzcom zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }
}

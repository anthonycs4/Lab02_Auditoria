package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcox implements zzasi, zzcxa, com.google.android.gms.ads.internal.overlay.zzo, zzcwz {
    private final zzcos zza;
    private final zzcot zzb;
    private final zzbqq<JSONObject, JSONObject> zzd;
    private final Executor zze;
    private final Clock zzf;
    private final Set<zzcib> zzc = new HashSet();
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final zzcow zzh = new zzcow();
    private boolean zzi = false;
    private WeakReference<?> zzj = new WeakReference<>(this);

    public zzcox(zzbqn zzbqnVar, zzcot zzcotVar, Executor executor, zzcos zzcosVar, Clock clock) {
        this.zza = zzcosVar;
        this.zzd = zzbqnVar.zza("google.afma.activeView.handleUpdate", zzbqb.zza, zzbqb.zza);
        this.zzb = zzcotVar;
        this.zze = executor;
        this.zzf = clock;
    }

    private final void zzj() {
        for (zzcib zzcibVar : this.zzc) {
            this.zza.zzc(zzcibVar);
        }
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzb(Context context) {
        this.zzh.zzb = false;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzbA(Context context) {
        this.zzh.zzb = true;
        zzf();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbB() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        this.zzh.zzb = true;
        zzf();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbD(int i) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbT() {
        this.zzh.zzb = false;
        zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzbx(Context context) {
        this.zzh.zze = "u";
        zzf();
        zzj();
        this.zzi = true;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final synchronized void zzbz() {
        if (this.zzg.compareAndSet(false, true)) {
            this.zza.zza(this);
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasi
    public final synchronized void zzc(zzash zzashVar) {
        zzcow zzcowVar = this.zzh;
        zzcowVar.zza = zzashVar.zzj;
        zzcowVar.zzf = zzashVar;
        zzf();
    }

    public final synchronized void zzf() {
        if (this.zzj.get() == null) {
            zzg();
        } else if (!this.zzi && this.zzg.get()) {
            try {
                this.zzh.zzd = this.zzf.elapsedRealtime();
                final JSONObject zzb = this.zzb.zzb(this.zzh);
                for (final zzcib zzcibVar : this.zzc) {
                    this.zze.execute(new Runnable(zzcibVar, zzb) { // from class: com.google.android.gms.internal.ads.zzcov
                        private final zzcib zza;
                        private final JSONObject zzb;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zza = zzcibVar;
                            this.zzb = zzb;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzr("AFMA_updateActiveView", this.zzb);
                        }
                    });
                }
                zzcdc.zzb(this.zzd.zzb(zzb), "ActiveViewListener.callActiveViewJs");
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to call ActiveViewJS", e);
            }
        }
    }

    public final synchronized void zzg() {
        zzj();
        this.zzi = true;
    }

    public final synchronized void zzh(zzcib zzcibVar) {
        this.zzc.add(zzcibVar);
        this.zza.zzb(zzcibVar);
    }

    public final void zzi(Object obj) {
        this.zzj = new WeakReference<>(obj);
    }
}

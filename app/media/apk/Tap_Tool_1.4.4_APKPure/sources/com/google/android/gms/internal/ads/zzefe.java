package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzefe implements zzcyy, zzcxt, zzcwk, zzcwz, zzazi, zzcwh, zzcyp, zzajc, zzcwv {
    private final zzexv zzj;
    private final AtomicReference<zzbbh> zzb = new AtomicReference<>();
    private final AtomicReference<zzbcb> zzc = new AtomicReference<>();
    private final AtomicReference<zzbdd> zzd = new AtomicReference<>();
    private final AtomicReference<zzbbk> zze = new AtomicReference<>();
    private final AtomicReference<zzbci> zzf = new AtomicReference<>();
    private final AtomicBoolean zzg = new AtomicBoolean(true);
    private final AtomicBoolean zzh = new AtomicBoolean(false);
    private final AtomicBoolean zzi = new AtomicBoolean(false);
    final BlockingQueue<Pair<String, String>> zza = new ArrayBlockingQueue(((Integer) zzbba.zzc().zzb(zzbfq.zzfR)).intValue());

    public zzefe(zzexv zzexvVar) {
        this.zzj = zzexvVar;
    }

    private final void zzt() {
        if (this.zzh.get() && this.zzi.get()) {
            Iterator it = this.zza.iterator();
            while (it.hasNext()) {
                final Pair pair = (Pair) it.next();
                zzepy.zza(this.zzc, new zzepx(pair) { // from class: com.google.android.gms.internal.ads.zzeeu
                    private final Pair zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = pair;
                    }

                    @Override // com.google.android.gms.internal.ads.zzepx
                    public final void zza(Object obj) {
                        Pair pair2 = this.zza;
                        ((zzbcb) obj).zzb((String) pair2.first, (String) pair2.second);
                    }
                });
            }
            this.zza.clear();
            this.zzg.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazi
    public final void onAdClicked() {
        zzepy.zza(this.zzb, zzeep.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajc
    public final synchronized void zza(final String str, final String str2) {
        if (this.zzg.get()) {
            if (!this.zza.offer(new Pair<>(str, str2))) {
                com.google.android.gms.ads.internal.util.zze.zzd("The queue for app events is full, dropping the new event.");
                zzexv zzexvVar = this.zzj;
                if (zzexvVar != null) {
                    zzexu zza = zzexu.zza("dae_action");
                    zza.zzc("dae_name", str);
                    zza.zzc("dae_data", str2);
                    zzexvVar.zza(zza);
                    return;
                }
            }
            return;
        }
        zzepy.zza(this.zzc, new zzepx(str, str2) { // from class: com.google.android.gms.internal.ads.zzees
            private final String zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = str;
                this.zzb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbcb) obj).zzb(this.zza, this.zzb);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwk
    public final void zzbM(final zzazm zzazmVar) {
        zzepy.zza(this.zzb, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeew
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbbh) obj).zzd(this.zza);
            }
        });
        zzepy.zza(this.zzb, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeex
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbbh) obj).zzc(this.zza.zza);
            }
        });
        zzepy.zza(this.zze, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeey
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbbk) obj).zzc(this.zza);
            }
        });
        this.zzg.set(false);
        this.zza.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzcxt
    public final synchronized void zzbN() {
        zzepy.zza(this.zzb, zzefa.zza);
        zzepy.zza(this.zze, zzefb.zza);
        this.zzi.set(true);
        zzt();
    }

    @Override // com.google.android.gms.internal.ads.zzcwz
    public final void zzbz() {
        zzepy.zza(this.zzb, zzeeq.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzc() {
        zzepy.zza(this.zzb, zzefc.zza);
        zzepy.zza(this.zzf, zzefd.zza);
        zzepy.zza(this.zzf, zzeeo.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzd() {
        zzepy.zza(this.zzb, zzeen.zza);
        zzepy.zza(this.zzf, zzeev.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zze() {
        zzepy.zza(this.zzb, zzeez.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzf(zzbxv zzbxvVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwh
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.zzcwv
    public final void zzi(final zzazm zzazmVar) {
        zzepy.zza(this.zzf, new zzepx(zzazmVar) { // from class: com.google.android.gms.internal.ads.zzeet
            private final zzazm zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazmVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbci) obj).zzb(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzj(zzbxf zzbxfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcyp
    public final void zzk(final zzazz zzazzVar) {
        zzepy.zza(this.zzd, new zzepx(zzazzVar) { // from class: com.google.android.gms.internal.ads.zzeer
            private final zzazz zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzazzVar;
            }

            @Override // com.google.android.gms.internal.ads.zzepx
            public final void zza(Object obj) {
                ((zzbdd) obj).zze(this.zza);
            }
        });
    }

    public final synchronized zzbbh zzl() {
        return this.zzb.get();
    }

    public final synchronized zzbcb zzm() {
        return this.zzc.get();
    }

    public final void zzn(zzbbh zzbbhVar) {
        this.zzb.set(zzbbhVar);
    }

    public final void zzo(zzbcb zzbcbVar) {
        this.zzc.set(zzbcbVar);
        this.zzh.set(true);
        zzt();
    }

    public final void zzp(zzbdd zzbddVar) {
        this.zzd.set(zzbddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyy
    public final void zzq(zzete zzeteVar) {
        this.zzg.set(true);
        this.zzi.set(false);
    }

    public final void zzr(zzbbk zzbbkVar) {
        this.zze.set(zzbbkVar);
    }

    public final void zzs(zzbci zzbciVar) {
        this.zzf.set(zzbciVar);
    }
}

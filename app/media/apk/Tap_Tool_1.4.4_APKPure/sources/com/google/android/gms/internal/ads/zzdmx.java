package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdmx {
    private final zzcwf zza;
    private final zzcxm zzb;
    private final zzcxz zzc;
    private final zzcyk zzd;
    private final zzdar zze;
    private final Executor zzf;
    private final zzdcz zzg;
    private final zzcox zzh;
    private final com.google.android.gms.ads.internal.zzb zzi;
    private final zzbzu zzj;
    private final zzfb zzk;
    private final zzdai zzl;
    private final zzdxo zzm;
    private final zzeyn zzn;
    private final zzdpn zzo;
    private final zzexv zzp;

    public zzdmx(zzcwf zzcwfVar, zzcxm zzcxmVar, zzcxz zzcxzVar, zzcyk zzcykVar, zzdar zzdarVar, Executor executor, zzdcz zzdczVar, zzcox zzcoxVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbzu zzbzuVar, zzfb zzfbVar, zzdai zzdaiVar, zzdxo zzdxoVar, zzeyn zzeynVar, zzdpn zzdpnVar, zzexv zzexvVar) {
        this.zza = zzcwfVar;
        this.zzb = zzcxmVar;
        this.zzc = zzcxzVar;
        this.zzd = zzcykVar;
        this.zze = zzdarVar;
        this.zzf = executor;
        this.zzg = zzdczVar;
        this.zzh = zzcoxVar;
        this.zzi = zzbVar;
        this.zzj = zzbzuVar;
        this.zzk = zzfbVar;
        this.zzl = zzdaiVar;
        this.zzm = zzdxoVar;
        this.zzn = zzeynVar;
        this.zzo = zzdpnVar;
        this.zzp = zzexvVar;
    }

    public static final zzfla<?> zzj(zzcib zzcibVar, String str, String str2) {
        final zzcde zzcdeVar = new zzcde();
        zzcibVar.zzR().zzw(new zzcjn(zzcdeVar) { // from class: com.google.android.gms.internal.ads.zzdmv
            private final zzcde zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcdeVar;
            }

            @Override // com.google.android.gms.internal.ads.zzcjn
            public final void zza(boolean z) {
                zzcde zzcdeVar2 = this.zza;
                if (z) {
                    zzcdeVar2.zzc(null);
                } else {
                    zzcdeVar2.zzd(new Exception("Ad Web View failed to load."));
                }
            }
        });
        zzcibVar.zzat(str, str2, null);
        return zzcdeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcib zzcibVar, zzcib zzcibVar2, Map map) {
        this.zzh.zzh(zzcibVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(View view) {
        this.zzi.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ boolean zzc(View view, MotionEvent motionEvent) {
        this.zzi.zza();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd() {
        this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zze(String str, String str2) {
        this.zze.zzbL(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzf() {
        this.zza.onAdClicked();
    }

    public final void zzi(final zzcib zzcibVar, boolean z, zzbls zzblsVar) {
        zzex zzb;
        zzcibVar.zzR().zzM(new zzazi(this) { // from class: com.google.android.gms.internal.ads.zzdmo
            private final zzdmx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzazi
            public final void onAdClicked() {
                this.zza.zzf();
            }
        }, this.zzc, this.zzd, new zzbks(this) { // from class: com.google.android.gms.internal.ads.zzdmp
            private final zzdmx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbks
            public final void zzbL(String str, String str2) {
                this.zza.zze(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzv(this) { // from class: com.google.android.gms.internal.ads.zzdmq
            private final zzdmx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.ads.internal.overlay.zzv
            public final void zzf() {
                this.zza.zzd();
            }
        }, z, zzblsVar, this.zzi, new zzdmw(this), this.zzj, this.zzm, this.zzn, this.zzo, this.zzp, null);
        zzcibVar.setOnTouchListener(new View.OnTouchListener(this) { // from class: com.google.android.gms.internal.ads.zzdmr
            private final zzdmx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzc(view, motionEvent);
                return false;
            }
        });
        zzcibVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.google.android.gms.internal.ads.zzdms
            private final zzdmx zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.zza.zzb(view);
            }
        });
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbE)).booleanValue() && (zzb = this.zzk.zzb()) != null) {
            zzb.zzh(zzcibVar.zzH());
        }
        this.zzg.zzh(zzcibVar, this.zzf);
        this.zzg.zzh(new zzasi(zzcibVar) { // from class: com.google.android.gms.internal.ads.zzdmt
            private final zzcib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcibVar;
            }

            @Override // com.google.android.gms.internal.ads.zzasi
            public final void zzc(zzash zzashVar) {
                this.zza.zzR().zza(zzashVar.zzd.left, zzashVar.zzd.top, false);
            }
        }, this.zzf);
        this.zzg.zza(zzcibVar.zzH());
        zzcibVar.zzab("/trackActiveViewUnit", new zzblp(this, zzcibVar) { // from class: com.google.android.gms.internal.ads.zzdmu
            private final zzdmx zza;
            private final zzcib zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzcibVar;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zza(this.zzb, (zzcib) obj, map);
            }
        });
        this.zzh.zzi(zzcibVar);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzcqr extends zzcqo {
    private final Context zzc;
    private final View zzd;
    private final zzcib zze;
    private final zzest zzf;
    private final zzcsl zzg;
    private final zzdhk zzh;
    private final zzddc zzi;
    private final zzgdk<zzeeh> zzj;
    private final Executor zzk;
    private zzazx zzl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcqr(zzcsm zzcsmVar, Context context, zzest zzestVar, View view, zzcib zzcibVar, zzcsl zzcslVar, zzdhk zzdhkVar, zzddc zzddcVar, zzgdk<zzeeh> zzgdkVar, Executor executor) {
        super(zzcsmVar);
        this.zzc = context;
        this.zzd = view;
        this.zze = zzcibVar;
        this.zzf = zzestVar;
        this.zzg = zzcslVar;
        this.zzh = zzdhkVar;
        this.zzi = zzddcVar;
        this.zzj = zzgdkVar;
        this.zzk = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcsn
    public final void zzQ() {
        this.zzk.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.zzcqq
            private final zzcqr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
        super.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final View zza() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final void zzb(ViewGroup viewGroup, zzazx zzazxVar) {
        zzcib zzcibVar;
        if (viewGroup == null || (zzcibVar = this.zze) == null) {
            return;
        }
        zzcibVar.zzaf(zzcjr.zza(zzazxVar));
        viewGroup.setMinimumHeight(zzazxVar.zzc);
        viewGroup.setMinimumWidth(zzazxVar.zzf);
        this.zzl = zzazxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzbdj zzc() {
        try {
            return this.zzg.zza();
        } catch (zzetp unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzest zze() {
        zzazx zzazxVar = this.zzl;
        if (zzazxVar != null) {
            return zzeto.zzc(zzazxVar);
        }
        zzess zzessVar = this.zzb;
        if (zzessVar.zzW) {
            for (String str : zzessVar.zza) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            return new zzest(this.zzd.getWidth(), this.zzd.getHeight(), false);
        }
        return zzeto.zza(this.zzb.zzq, this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final zzest zzf() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final int zzg() {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfg)).booleanValue() && this.zzb.zzab) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfh)).booleanValue()) {
                return 0;
            }
        }
        return this.zza.zzb.zzb.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzcqo
    public final void zzh() {
        this.zzi.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* bridge */ /* synthetic */ void zzj() {
        if (this.zzh.zzd() == null) {
            return;
        }
        try {
            this.zzh.zzd().zze(this.zzj.zzb(), ObjectWrapper.wrap(this.zzc));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("RemoteException when notifyAdLoad is called", e);
        }
    }
}

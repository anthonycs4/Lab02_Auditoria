package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdkp {
    private final Executor zza;
    private final zzcph zzb;
    private final zzdcz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdkp(Executor executor, zzcph zzcphVar, zzdcz zzdczVar) {
        this.zza = executor;
        this.zzc = zzdczVar;
        this.zzb = zzcphVar;
    }

    public final void zza(final zzcib zzcibVar) {
        if (zzcibVar == null) {
            return;
        }
        this.zzc.zza(zzcibVar.zzH());
        this.zzc.zzh(new zzasi(zzcibVar) { // from class: com.google.android.gms.internal.ads.zzdkl
            private final zzcib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcibVar;
            }

            @Override // com.google.android.gms.internal.ads.zzasi
            public final void zzc(zzash zzashVar) {
                this.zza.zzR().zza(zzashVar.zzd.left, zzashVar.zzd.top, false);
            }
        }, this.zza);
        this.zzc.zzh(new zzasi(zzcibVar) { // from class: com.google.android.gms.internal.ads.zzdkm
            private final zzcib zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = zzcibVar;
            }

            @Override // com.google.android.gms.internal.ads.zzasi
            public final void zzc(zzash zzashVar) {
                zzcib zzcibVar2 = this.zza;
                HashMap hashMap = new HashMap();
                hashMap.put("isVisible", true != zzashVar.zzj ? "0" : "1");
                zzcibVar2.zze("onAdVisibilityChanged", hashMap);
            }
        }, this.zza);
        this.zzc.zzh(this.zzb, this.zza);
        this.zzb.zza(zzcibVar);
        zzcibVar.zzab("/trackActiveViewUnit", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdkn
            private final zzdkp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzc((zzcib) obj, map);
            }
        });
        zzcibVar.zzab("/untrackActiveViewUnit", new zzblp(this) { // from class: com.google.android.gms.internal.ads.zzdko
            private final zzdkp zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzblp
            public final void zza(Object obj, Map map) {
                this.zza.zzb((zzcib) obj, map);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcib zzcibVar, Map map) {
        this.zzb.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcib zzcibVar, Map map) {
        this.zzb.zzd();
    }
}

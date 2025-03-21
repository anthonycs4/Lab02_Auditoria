package com.google.android.gms.internal.ads;

import android.util.SparseArray;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzvz implements zzvs {
    final /* synthetic */ zzwb zza;
    private final zzahc zzb = new zzahc(new byte[4], 4);

    public zzvz(zzwb zzwbVar) {
        this.zza = zzwbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zza(zzahq zzahqVar, zzpu zzpuVar, zzwf zzwfVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzvs
    public final void zzb(zzahd zzahdVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        if (zzahdVar.zzn() == 0 && (zzahdVar.zzn() & 128) != 0) {
            zzahdVar.zzk(6);
            int zzd = zzahdVar.zzd() / 4;
            for (int i = 0; i < zzd; i++) {
                zzahdVar.zzl(this.zzb, 4);
                int zzh = this.zzb.zzh(16);
                this.zzb.zzf(3);
                if (zzh == 0) {
                    this.zzb.zzf(13);
                } else {
                    int zzh2 = this.zzb.zzh(13);
                    sparseArray2 = this.zza.zzf;
                    if (sparseArray2.get(zzh2) == null) {
                        sparseArray3 = this.zza.zzf;
                        sparseArray3.put(zzh2, new zzvt(new zzwa(this.zza, zzh2)));
                        zzwb.zzb(this.zza);
                    }
                }
            }
            sparseArray = this.zza.zzf;
            sparseArray.remove(0);
        }
    }
}

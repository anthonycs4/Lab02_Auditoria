package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzkm implements zzaat, zzov {
    final /* synthetic */ zzkq zza;
    private final zzko zzb;
    private zzaas zzc;
    private zzou zzd;

    public zzkm(zzkq zzkqVar, zzko zzkoVar) {
        zzaas zzaasVar;
        zzou zzouVar;
        this.zza = zzkqVar;
        zzaasVar = zzkqVar.zze;
        this.zzc = zzaasVar;
        zzouVar = zzkqVar.zzf;
        this.zzd = zzouVar;
        this.zzb = zzkoVar;
    }

    private final boolean zzf(int i, zzaaj zzaajVar) {
        zzaas zzaasVar;
        zzou zzouVar;
        zzaaj zzaajVar2 = null;
        if (zzaajVar != null) {
            zzko zzkoVar = this.zzb;
            int i2 = 0;
            while (true) {
                if (i2 >= zzkoVar.zzc.size()) {
                    break;
                } else if (zzkoVar.zzc.get(i2).zzd == zzaajVar.zzd) {
                    zzaajVar2 = zzaajVar.zzc(Pair.create(zzkoVar.zzb, zzaajVar.zza));
                    break;
                } else {
                    i2++;
                }
            }
            if (zzaajVar2 == null) {
                return false;
            }
        }
        int i3 = i + this.zzb.zzd;
        zzaas zzaasVar2 = this.zzc;
        if (zzaasVar2.zza != i3 || !zzaht.zzc(zzaasVar2.zzb, zzaajVar2)) {
            zzaasVar = this.zza.zze;
            this.zzc = zzaasVar.zza(i3, zzaajVar2, 0L);
        }
        zzou zzouVar2 = this.zzd;
        if (zzouVar2.zza == i3 && zzaht.zzc(zzouVar2.zzb, zzaajVar2)) {
            return true;
        }
        zzouVar = this.zza.zzf;
        this.zzd = zzouVar.zza(i3, zzaajVar2);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zza(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
        if (zzf(i, zzaajVar)) {
            this.zzc.zze(zzaaaVar, zzaafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbr(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar, IOException iOException, boolean z) {
        if (zzf(i, zzaajVar)) {
            this.zzc.zzk(zzaaaVar, zzaafVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbs(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
        if (zzf(i, zzaajVar)) {
            this.zzc.zzg(zzaaaVar, zzaafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbt(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
        if (zzf(i, zzaajVar)) {
            this.zzc.zzi(zzaaaVar, zzaafVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbu(int i, zzaaj zzaajVar, zzaaf zzaafVar) {
        if (zzf(i, zzaajVar)) {
            this.zzc.zzm(zzaafVar);
        }
    }
}

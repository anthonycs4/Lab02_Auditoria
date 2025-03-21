package com.google.android.gms.internal.ads;

import java.io.IOException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzzr implements zzaat, zzov {
    final /* synthetic */ zzzt zza;
    private final Object zzb;
    private zzaas zzc;
    private zzou zzd;

    public zzzr(zzzt zzztVar, Object obj) {
        this.zza = zzztVar;
        this.zzc = zzztVar.zzf(null);
        this.zzd = zzztVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, zzaaj zzaajVar) {
        zzaaj zzaajVar2;
        if (zzaajVar != null) {
            zzaajVar2 = this.zza.zzw(this.zzb, zzaajVar);
            if (zzaajVar2 == null) {
                return false;
            }
        } else {
            zzaajVar2 = null;
        }
        zzaas zzaasVar = this.zzc;
        if (zzaasVar.zza != i || !zzaht.zzc(zzaasVar.zzb, zzaajVar2)) {
            this.zzc = this.zza.zzg(i, zzaajVar2, 0L);
        }
        zzou zzouVar = this.zzd;
        if (zzouVar.zza == i && zzaht.zzc(zzouVar.zzb, zzaajVar2)) {
            return true;
        }
        this.zzd = this.zza.zzi(i, zzaajVar2);
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

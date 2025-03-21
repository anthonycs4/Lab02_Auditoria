package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzgba extends zzgay<zzgaz, zzgaz> {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final boolean zza(zzgaf zzgafVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(zzgaz zzgazVar, int i, long j) {
        zzgazVar.zzh(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    final /* bridge */ /* synthetic */ void zzc(zzgaz zzgazVar, int i, int i2) {
        zzgazVar.zzh((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    final /* bridge */ /* synthetic */ void zzd(zzgaz zzgazVar, int i, long j) {
        zzgazVar.zzh((i << 3) | 1, Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zze(zzgaz zzgazVar, int i, zzfxj zzfxjVar) {
        zzgazVar.zzh((i << 3) | 2, zzfxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    final /* bridge */ /* synthetic */ void zzf(zzgaz zzgazVar, int i, zzgaz zzgazVar2) {
        zzgazVar.zzh((i << 3) | 3, zzgazVar2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ zzgaz zzg() {
        return zzgaz.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    final /* bridge */ /* synthetic */ zzgaz zzh(zzgaz zzgazVar) {
        zzgaz zzgazVar2 = zzgazVar;
        zzgazVar2.zzd();
        return zzgazVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzi(Object obj, zzgaz zzgazVar) {
        ((zzfym) obj).zzc = zzgazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ zzgaz zzj(Object obj) {
        return ((zzfym) obj).zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ zzgaz zzk(Object obj) {
        zzfym zzfymVar = (zzfym) obj;
        zzgaz zzgazVar = zzfymVar.zzc;
        if (zzgazVar == zzgaz.zza()) {
            zzgaz zzb = zzgaz.zzb();
            zzfymVar.zzc = zzb;
            return zzb;
        }
        return zzgazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzl(Object obj, zzgaz zzgazVar) {
        ((zzfym) obj).zzc = zzgazVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzm(Object obj) {
        ((zzfym) obj).zzc.zzd();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ zzgaz zzo(zzgaz zzgazVar, zzgaz zzgazVar2) {
        zzgaz zzgazVar3 = zzgazVar2;
        return zzgazVar3.equals(zzgaz.zza()) ? zzgazVar : zzgaz.zzc(zzgazVar, zzgazVar3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ int zzp(zzgaz zzgazVar) {
        return zzgazVar.zze();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ int zzq(zzgaz zzgazVar) {
        return zzgazVar.zzf();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzr(zzgaz zzgazVar, zzfxu zzfxuVar) throws IOException {
        zzgazVar.zzi(zzfxuVar);
    }
}

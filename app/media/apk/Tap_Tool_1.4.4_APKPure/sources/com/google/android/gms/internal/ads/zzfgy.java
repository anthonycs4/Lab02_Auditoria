package com.google.android.gms.internal.ads;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfgy extends zzfgz {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzfgz zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfgy(zzfgz zzfgzVar, int i, int i2) {
        this.zzc = zzfgzVar;
        this.zza = i;
        this.zzb = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        zzfes.zze(i, this.zzb, "index");
        return this.zzc.get(i + this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfgz, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i, int i2) {
        return subList(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final Object[] zzb() {
        return this.zzc.zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    final int zzd() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfgu
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfgz
    public final zzfgz zzh(int i, int i2) {
        zzfes.zzg(i, i2, this.zzb);
        zzfgz zzfgzVar = this.zzc;
        int i3 = this.zza;
        return zzfgzVar.subList(i + i3, i2 + i3);
    }
}

package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzctp implements zzfko<Void> {
    final /* synthetic */ zzctq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzctp(zzctq zzctqVar) {
        this.zza = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzdaz zzdazVar;
        zzdazVar = this.zza.zzf;
        zzdazVar.zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Void r2) {
        zzdaz zzdazVar;
        zzdazVar = this.zza.zzf;
        zzdazVar.zzo(true);
    }
}

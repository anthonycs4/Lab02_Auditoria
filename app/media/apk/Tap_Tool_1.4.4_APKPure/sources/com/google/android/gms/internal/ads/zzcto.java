package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcto implements zzfko<zzbxf> {
    final /* synthetic */ zzctq zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcto(zzctq zzctqVar) {
        this.zza = zzctqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        zzdaz zzdazVar;
        zzdazVar = this.zza.zzf;
        zzdazVar.zzn(false);
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl zzbxf zzbxfVar) {
        zzdaz zzdazVar;
        zzdazVar = this.zza.zzf;
        zzdazVar.zzn(true);
    }
}

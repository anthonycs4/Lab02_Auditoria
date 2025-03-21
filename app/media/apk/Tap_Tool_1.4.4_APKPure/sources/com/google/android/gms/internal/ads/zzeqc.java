package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeqc implements zzfei<zzduo, zzeqe> {
    final /* synthetic */ zzeqf zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeqc(zzeqf zzeqfVar) {
        this.zza = zzeqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfei
    @NullableDecl
    public final /* bridge */ /* synthetic */ zzeqe apply(@NullableDecl zzduo zzduoVar) {
        zzevf zze;
        zzeqe zzeqeVar;
        zzccn.zzg(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, zzduoVar);
        com.google.android.gms.ads.internal.util.zze.zza("Failed to get a cache key, reverting to legacy flow.");
        zzeqf zzeqfVar = this.zza;
        zze = zzeqfVar.zze();
        zzeqfVar.zze = new zzeqe(null, zze, null);
        zzeqeVar = this.zza.zze;
        return zzeqeVar;
    }
}

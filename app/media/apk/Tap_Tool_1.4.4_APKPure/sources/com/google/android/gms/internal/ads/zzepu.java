package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzepu implements zzfko<Void> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzepu(zzepw zzepwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(@NullableDecl Void r1) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}

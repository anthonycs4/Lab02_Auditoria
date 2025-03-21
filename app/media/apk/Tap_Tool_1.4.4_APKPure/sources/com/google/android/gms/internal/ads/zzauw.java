package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzauw extends zzcde<zzave> {
    final /* synthetic */ zzavc zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzauw(zzavc zzavcVar) {
        this.zza = zzavcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcde, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        zzavc.zzb(this.zza);
        return super.cancel(z);
    }
}

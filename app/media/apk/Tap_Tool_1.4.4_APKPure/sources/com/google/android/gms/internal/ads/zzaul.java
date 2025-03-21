package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaul implements zzatb {
    final /* synthetic */ zzauo zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaul(zzauo zzauoVar) {
        this.zza = zzauoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatb
    public final void zza(boolean z) {
        if (z) {
            this.zza.zzl();
        } else {
            zzauo.zzf(this.zza);
        }
    }
}

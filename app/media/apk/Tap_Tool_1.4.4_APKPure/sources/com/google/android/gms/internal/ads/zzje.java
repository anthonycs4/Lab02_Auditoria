package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzje implements zzlf {
    final /* synthetic */ zzjl zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzje(zzjl zzjlVar) {
        this.zza = zzjlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zza(long j) {
        if (j >= 2000) {
            zzjl.zzo(this.zza, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzlf
    public final void zzb() {
        zzagf zzagfVar;
        zzagfVar = this.zza.zzf;
        zzagfVar.zzf(2);
    }
}

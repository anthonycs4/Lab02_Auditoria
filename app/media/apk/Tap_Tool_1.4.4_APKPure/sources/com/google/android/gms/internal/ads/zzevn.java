package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzevn implements zzfko<Void> {
    final /* synthetic */ zzevq zza;
    final /* synthetic */ zzevr zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzevn(zzevr zzevrVar, zzevq zzevqVar) {
        this.zzb = zzevrVar;
        this.zza = zzevqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            zzevr.zzd(this.zzb, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(Void r3) {
        ArrayDeque arrayDeque;
        int i;
        synchronized (this.zzb) {
            zzevr.zzd(this.zzb, null);
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            i = this.zzb.zzf;
            if (i == 1) {
                this.zzb.zzh();
            }
        }
    }
}

package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfjq implements Runnable {
    final /* synthetic */ zzfla zza;
    final /* synthetic */ int zzb;
    final /* synthetic */ zzfjs zzc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfjq(zzfjs zzfjsVar, zzfla zzflaVar, int i) {
        this.zzc = zzfjsVar;
        this.zza = zzflaVar;
        this.zzb = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (!this.zza.isCancelled()) {
                this.zzc.zzK(this.zzb, this.zza);
            } else {
                zzfjs.zzy(this.zzc, null);
                this.zzc.cancel(false);
            }
        } finally {
            zzfjs.zzA(this.zzc, (zzfgu) null);
        }
    }
}

package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzet implements Runnable {
    final /* synthetic */ zzeu zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzet(zzeu zzeuVar) {
        this.zza = zzeuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        zzfbb zzfbbVar;
        Object obj2;
        obj = this.zza.zzl;
        synchronized (obj) {
            z = this.zza.zzm;
            if (z) {
                return;
            }
            this.zza.zzm = true;
            try {
                zzeu.zzo(this.zza);
            } catch (Exception e) {
                zzfbbVar = this.zza.zzh;
                zzfbbVar.zzd(2023, -1L, e);
            }
            obj2 = this.zza.zzl;
            synchronized (obj2) {
                this.zza.zzm = false;
            }
        }
    }
}

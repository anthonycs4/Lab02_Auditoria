package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzev implements Runnable {
    final /* synthetic */ zzew zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzev(zzew zzewVar) {
        this.zza = zzewVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        zzfy zzfyVar;
        ConditionVariable conditionVariable2;
        if (this.zza.zzb != null) {
            return;
        }
        conditionVariable = zzew.zzd;
        synchronized (conditionVariable) {
            if (this.zza.zzb == null) {
                boolean z2 = false;
                try {
                    z = zzbfq.zzbz.zze().booleanValue();
                } catch (IllegalStateException unused) {
                    z = false;
                }
                if (z) {
                    try {
                        zzfyVar = this.zza.zzc;
                        zzew.zza = new zzfdh(zzfyVar.zza, "ADSHIELD", null);
                    } catch (Throwable unused2) {
                    }
                }
                z2 = z;
                this.zza.zzb = Boolean.valueOf(z2);
                conditionVariable2 = zzew.zzd;
                conditionVariable2.open();
            }
        }
    }
}

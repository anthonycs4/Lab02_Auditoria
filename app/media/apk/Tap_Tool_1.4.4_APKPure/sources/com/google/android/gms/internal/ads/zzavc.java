package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import java.util.concurrent.Future;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzavc {
    private zzaur zza;
    private boolean zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzavc(Context context) {
        this.zzc = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zze(zzavc zzavcVar, boolean z) {
        zzavcVar.zzb = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Future<zzave> zza(zzaus zzausVar) {
        zzauw zzauwVar = new zzauw(this);
        zzava zzavaVar = new zzava(this, zzausVar, zzauwVar);
        zzavb zzavbVar = new zzavb(this, zzauwVar);
        synchronized (this.zzd) {
            zzaur zzaurVar = new zzaur(this.zzc, com.google.android.gms.ads.internal.zzs.zzq().zza(), zzavaVar, zzavbVar);
            this.zza = zzaurVar;
            zzaurVar.checkAvailabilityAndConnect();
        }
        return zzauwVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void zzb(zzavc zzavcVar) {
        synchronized (zzavcVar.zzd) {
            zzaur zzaurVar = zzavcVar.zza;
            if (zzaurVar == null) {
                return;
            }
            zzaurVar.disconnect();
            zzavcVar.zza = null;
            Binder.flushPendingCommands();
        }
    }
}

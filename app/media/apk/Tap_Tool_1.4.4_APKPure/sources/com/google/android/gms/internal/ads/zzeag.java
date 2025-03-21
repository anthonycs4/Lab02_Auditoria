package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.dynamic.ObjectWrapper;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzeag implements zzdez {
    private final zzess zza;
    private final zzbtl zzb;
    private final boolean zzc;
    private zzcwx zzd = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzeag(zzess zzessVar, zzbtl zzbtlVar, boolean z) {
        this.zza = zzessVar;
        this.zzb = zzbtlVar;
        this.zzc = z;
    }

    @Override // com.google.android.gms.internal.ads.zzdez
    public final void zza(boolean z, Context context) throws zzdey {
        boolean zzk;
        try {
            if (this.zzc) {
                zzk = this.zzb.zzm(ObjectWrapper.wrap(context));
            } else {
                zzk = this.zzb.zzk(ObjectWrapper.wrap(context));
            }
            if (zzk) {
                if (this.zzd == null) {
                    return;
                }
                if (((Boolean) zzbba.zzc().zzb(zzbfq.zzba)).booleanValue() || this.zza.zzS != 2) {
                    return;
                }
                this.zzd.zza();
                return;
            }
            throw new zzdey("Adapter failed to show.");
        } catch (Throwable th) {
            throw new zzdey(th);
        }
    }

    public final void zzb(zzcwx zzcwxVar) {
        this.zzd = zzcwxVar;
    }
}

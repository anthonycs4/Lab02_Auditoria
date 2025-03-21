package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpk extends zzcdl<zzbpr> {
    private final Object zza = new Object();
    private final zzbpp zzb;
    private boolean zzc;

    public zzbpk(zzbpp zzbppVar) {
        this.zzb = zzbppVar;
    }

    public final void zza() {
        synchronized (this.zza) {
            if (this.zzc) {
                return;
            }
            this.zzc = true;
            zze(new zzbph(this), new zzcdh());
            zze(new zzbpi(this), new zzbpj(this));
        }
    }
}

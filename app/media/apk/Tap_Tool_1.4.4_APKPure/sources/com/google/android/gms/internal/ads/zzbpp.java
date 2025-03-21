package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Preconditions;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbpp extends zzcdl<zzbol> {
    private final com.google.android.gms.ads.internal.util.zzbd<zzbol> zzb;
    private final Object zza = new Object();
    private boolean zzc = false;
    private int zzd = 0;

    public zzbpp(com.google.android.gms.ads.internal.util.zzbd<zzbol> zzbdVar) {
        this.zzb = zzbdVar;
    }

    public final zzbpk zza() {
        zzbpk zzbpkVar = new zzbpk(this);
        synchronized (this.zza) {
            zze(new zzbpl(this, zzbpkVar), new zzbpm(this, zzbpkVar));
            Preconditions.checkState(this.zzd >= 0);
            this.zzd++;
        }
        return zzbpkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzb() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd > 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing 1 reference for JS Engine");
            this.zzd--;
            zzd();
        }
    }

    public final void zzc() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            com.google.android.gms.ads.internal.util.zze.zza("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.zzc = true;
            zzd();
        }
    }

    protected final void zzd() {
        synchronized (this.zza) {
            Preconditions.checkState(this.zzd >= 0);
            if (!this.zzc || this.zzd != 0) {
                com.google.android.gms.ads.internal.util.zze.zza("There are still references to the engine. Not destroying.");
            } else {
                com.google.android.gms.ads.internal.util.zze.zza("No reference is left (including root). Cleaning up engine.");
                zze(new zzbpo(this), new zzcdh());
            }
        }
    }
}

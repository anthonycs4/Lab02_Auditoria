package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzfzc {
    private static final zzfxy zzb = zzfxy.zza();
    protected volatile zzfzu zza;
    private volatile zzfxj zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzfzc) {
            zzfzc zzfzcVar = (zzfzc) obj;
            zzfzu zzfzuVar = this.zza;
            zzfzu zzfzuVar2 = zzfzcVar.zza;
            if (zzfzuVar == null && zzfzuVar2 == null) {
                return zzb().equals(zzfzcVar.zzb());
            }
            if (zzfzuVar == null || zzfzuVar2 == null) {
                if (zzfzuVar != null) {
                    zzfzcVar.zzc(zzfzuVar.zzbe());
                    return zzfzuVar.equals(zzfzcVar.zza);
                }
                zzc(zzfzuVar2.zzbe());
                return this.zza.equals(zzfzuVar2);
            }
            return zzfzuVar.equals(zzfzuVar2);
        }
        return false;
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzfxg) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzaw();
        }
        return 0;
    }

    public final zzfxj zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                return this.zzc;
            }
            if (this.zza == null) {
                this.zzc = zzfxj.zzb;
            } else {
                this.zzc = this.zza.zzan();
            }
            return this.zzc;
        }
    }

    protected final void zzc(zzfzu zzfzuVar) {
        if (this.zza != null) {
            return;
        }
        synchronized (this) {
            if (this.zza == null) {
                try {
                    this.zza = zzfzuVar;
                    this.zzc = zzfxj.zzb;
                } catch (zzfyy unused) {
                    this.zza = zzfzuVar;
                    this.zzc = zzfxj.zzb;
                }
            }
        }
    }
}

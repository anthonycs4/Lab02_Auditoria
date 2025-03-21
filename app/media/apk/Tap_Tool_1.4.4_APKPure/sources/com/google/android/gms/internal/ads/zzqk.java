package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzqk {
    public final zzqn zza;
    public final zzqn zzb;

    public zzqk(zzqn zzqnVar, zzqn zzqnVar2) {
        this.zza = zzqnVar;
        this.zzb = zzqnVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzqk zzqkVar = (zzqk) obj;
            if (this.zza.equals(zzqkVar.zza) && this.zzb.equals(zzqkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.zza);
        if (this.zza.equals(this.zzb)) {
            sb = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        } else {
            String valueOf2 = String.valueOf(this.zzb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 2);
            sb2.append(", ");
            sb2.append(valueOf2);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(sb).length());
        sb3.append("[");
        sb3.append(valueOf);
        sb3.append(sb);
        sb3.append("]");
        return sb3.toString();
    }
}

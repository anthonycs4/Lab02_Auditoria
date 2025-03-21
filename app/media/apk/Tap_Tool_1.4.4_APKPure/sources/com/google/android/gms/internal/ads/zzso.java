package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzso extends zzsq {
    public final long zza;
    public final List<zzsp> zzb;
    public final List<zzso> zzc;

    public zzso(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzsq
    public final String toString() {
        String zzf = zzf(this.zzd);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(zzf).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzf);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzsp zzspVar) {
        this.zzb.add(zzspVar);
    }

    public final void zzb(zzso zzsoVar) {
        this.zzc.add(zzsoVar);
    }

    public final zzsp zzc(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzsp zzspVar = this.zzb.get(i2);
            if (zzspVar.zzd == i) {
                return zzspVar;
            }
        }
        return null;
    }

    public final zzso zzd(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzso zzsoVar = this.zzc.get(i2);
            if (zzsoVar.zzd == i) {
                return zzsoVar;
            }
        }
        return null;
    }
}

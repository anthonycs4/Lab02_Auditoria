package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzamn extends zzamp {
    public final long zza;
    public final List<zzamo> zzb;
    public final List<zzamn> zzc;

    public zzamn(int i, long j) {
        super(i);
        this.zza = j;
        this.zzb = new ArrayList();
        this.zzc = new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.zzamp
    public final String toString() {
        String zzg = zzg(this.zzaR);
        String arrays = Arrays.toString(this.zzb.toArray());
        String arrays2 = Arrays.toString(this.zzc.toArray());
        int length = String.valueOf(zzg).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(arrays).length() + String.valueOf(arrays2).length());
        sb.append(zzg);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }

    public final void zza(zzamo zzamoVar) {
        this.zzb.add(zzamoVar);
    }

    public final void zzb(zzamn zzamnVar) {
        this.zzc.add(zzamnVar);
    }

    public final zzamo zzc(int i) {
        int size = this.zzb.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzamo zzamoVar = this.zzb.get(i2);
            if (zzamoVar.zzaR == i) {
                return zzamoVar;
            }
        }
        return null;
    }

    public final zzamn zzd(int i) {
        int size = this.zzc.size();
        for (int i2 = 0; i2 < size; i2++) {
            zzamn zzamnVar = this.zzc.get(i2);
            if (zzamnVar.zzaR == i) {
                return zzamnVar;
            }
        }
        return null;
    }
}

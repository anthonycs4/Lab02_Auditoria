package com.google.android.gms.internal.ads;

import java.util.Comparator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzatt implements Comparator<zzati> {
    public zzatt(zzatu zzatuVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzati zzatiVar, zzati zzatiVar2) {
        zzati zzatiVar3 = zzatiVar;
        zzati zzatiVar4 = zzatiVar2;
        if (zzatiVar3.zzb() >= zzatiVar4.zzb()) {
            if (zzatiVar3.zzb() > zzatiVar4.zzb()) {
                return 1;
            }
            if (zzatiVar3.zza() >= zzatiVar4.zza()) {
                if (zzatiVar3.zza() > zzatiVar4.zza()) {
                    return 1;
                }
                float zzd = (zzatiVar3.zzd() - zzatiVar3.zzb()) * (zzatiVar3.zzc() - zzatiVar3.zza());
                float zzd2 = (zzatiVar4.zzd() - zzatiVar4.zzb()) * (zzatiVar4.zzc() - zzatiVar4.zza());
                if (zzd <= zzd2) {
                    return zzd < zzd2 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}

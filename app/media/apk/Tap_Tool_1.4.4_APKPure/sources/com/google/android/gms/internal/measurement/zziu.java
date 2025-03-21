package com.google.android.gms.internal.measurement;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class zziu extends zzit {
    private zziu() {
        super();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzit
    public final <L> List<L> zza(Object obj, long j) {
        zzig zzc = zzc(obj, j);
        if (zzc.zza()) {
            return zzc;
        }
        int size = zzc.size();
        zzig zza = zzc.zza(size == 0 ? 10 : size << 1);
        zzkz.zza(obj, j, zza);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.zzit
    public final void zzb(Object obj, long j) {
        zzc(obj, j).i_();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.gms.internal.measurement.zzig] */
    @Override // com.google.android.gms.internal.measurement.zzit
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzig<E> zzc = zzc(obj, j);
        zzig<E> zzc2 = zzc(obj2, j);
        int size = zzc.size();
        int size2 = zzc2.size();
        zzig<E> zzigVar = zzc;
        zzigVar = zzc;
        if (size > 0 && size2 > 0) {
            boolean zza = zzc.zza();
            zzig<E> zzigVar2 = zzc;
            if (!zza) {
                zzigVar2 = zzc.zza(size2 + size);
            }
            zzigVar2.addAll(zzc2);
            zzigVar = zzigVar2;
        }
        if (size > 0) {
            zzc2 = zzigVar;
        }
        zzkz.zza(obj, j, zzc2);
    }

    private static <E> zzig<E> zzc(Object obj, long j) {
        return (zzig) zzkz.zzf(obj, j);
    }
}

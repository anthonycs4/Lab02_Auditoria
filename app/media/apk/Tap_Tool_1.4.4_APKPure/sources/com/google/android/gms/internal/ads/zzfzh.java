package com.google.android.gms.internal.ads;

import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfzh extends zzfzi {
    private zzfzh() {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzfzh(zzfzf zzfzfVar) {
        super(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final <L> List<L> zza(Object obj, long j) {
        zzfyv zzfyvVar = (zzfyv) zzgbi.zzn(obj, j);
        if (zzfyvVar.zza()) {
            return zzfyvVar;
        }
        int size = zzfyvVar.size();
        zzfyv zze = zzfyvVar.zze(size == 0 ? 10 : size + size);
        zzgbi.zzo(obj, j, zze);
        return zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final void zzb(Object obj, long j) {
        ((zzfyv) zzgbi.zzn(obj, j)).zzb();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzfyv] */
    @Override // com.google.android.gms.internal.ads.zzfzi
    public final <E> void zzc(Object obj, Object obj2, long j) {
        zzfyv<E> zzfyvVar = (zzfyv) zzgbi.zzn(obj, j);
        zzfyv<E> zzfyvVar2 = (zzfyv) zzgbi.zzn(obj2, j);
        int size = zzfyvVar.size();
        int size2 = zzfyvVar2.size();
        zzfyv<E> zzfyvVar3 = zzfyvVar;
        zzfyvVar3 = zzfyvVar;
        if (size > 0 && size2 > 0) {
            boolean zza = zzfyvVar.zza();
            zzfyv<E> zzfyvVar4 = zzfyvVar;
            if (!zza) {
                zzfyvVar4 = zzfyvVar.zze(size2 + size);
            }
            zzfyvVar4.addAll(zzfyvVar2);
            zzfyvVar3 = zzfyvVar4;
        }
        if (size > 0) {
            zzfyvVar2 = zzfyvVar3;
        }
        zzgbi.zzo(obj, j, zzfyvVar2);
    }
}

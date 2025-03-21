package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzfin extends zzfgz<Map.Entry> {
    final /* synthetic */ zzfio zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfin(zzfio zzfioVar) {
        this.zza = zzfioVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.zza.zzc;
        zzfes.zze(i, i2, "index");
        objArr = this.zza.zzb;
        int i3 = i + i;
        Object obj = objArr[i3];
        objArr2 = this.zza.zzb;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.zza.zzc;
        return i;
    }

    @Override // com.google.android.gms.internal.ads.zzfgu
    public final boolean zzf() {
        return true;
    }
}

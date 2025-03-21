package com.google.android.gms.internal.ads;

import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfaf {
    private final zzezn zza;
    private final ArrayList<String> zzb;

    public zzfaf(zzezn zzeznVar, String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        this.zzb = arrayList;
        this.zza = zzeznVar;
        arrayList.add(str);
    }

    public final void zza(String str) {
        this.zzb.add(str);
    }

    public final zzezn zzb() {
        return this.zza;
    }

    public final ArrayList<String> zzc() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfa extends zzez {
    protected zzfa(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    public static zzfa zzs(String str, Context context, boolean z, int i) {
        zzm(context, z);
        return new zzfa(context, str, z, i);
    }

    @Override // com.google.android.gms.internal.ads.zzez
    protected final List<Callable<Void>> zzp(zzfy zzfyVar, Context context, zzcn zzcnVar, zzce zzceVar) {
        if (zzfyVar.zzd() == null || !this.zzt) {
            return super.zzp(zzfyVar, context, zzcnVar, null);
        }
        int zzs = zzfyVar.zzs();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zzp(zzfyVar, context, zzcnVar, null));
        arrayList.add(new zzgn(zzfyVar, "+CBbXHi/+XdLnSyDhFU51JgiFyDr7i+oHe/ECeOut7QI1M4VCznQFAAROBrz4y9r", "uLz42FqWno2hsY6OwcAoAZ4P+BVsWg+PIwU6Rmo8Y88=", zzcnVar, zzs, 24));
        return arrayList;
    }
}

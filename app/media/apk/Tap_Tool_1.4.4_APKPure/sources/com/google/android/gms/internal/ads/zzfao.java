package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzfao extends zzfap {
    protected final HashSet<String> zza;
    protected final JSONObject zzb;
    protected final long zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzfao(zzfah zzfahVar, zzfah zzfahVar2, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(zzfahVar, null);
        this.zza = new HashSet<>((Collection<? extends String>) zzfahVar2);
        this.zzb = hashSet;
        this.zzc = jSONObject;
    }
}

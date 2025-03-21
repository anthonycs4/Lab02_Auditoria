package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzwd {
    public final int zza;
    public final String zzb;
    public final List<zzwc> zzc;
    public final byte[] zzd;

    public zzwd(int i, String str, List<zzwc> list, byte[] bArr) {
        List<zzwc> unmodifiableList;
        this.zza = i;
        this.zzb = str;
        if (list == null) {
            unmodifiableList = Collections.emptyList();
        } else {
            unmodifiableList = Collections.unmodifiableList(list);
        }
        this.zzc = unmodifiableList;
        this.zzd = bArr;
    }
}

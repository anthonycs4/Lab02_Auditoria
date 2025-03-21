package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfey {
    private final zzfef zza;
    private final zzfev zzb;

    private zzfey(zzfev zzfevVar, byte[] bArr) {
        zzfee zzfeeVar = zzfee.zza;
        this.zzb = zzfevVar;
        this.zza = zzfeeVar;
    }

    public static zzfey zza(zzfef zzfefVar) {
        return new zzfey(new zzfev(zzfefVar), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Iterator<String> zzf(CharSequence charSequence) {
        return new zzfeu(this.zzb, this, charSequence);
    }

    public final List<String> zzc(CharSequence charSequence) {
        Iterator<String> zzf = zzf(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzf.hasNext()) {
            arrayList.add(zzf.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final Iterable<String> zzb(CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        return new zzfew(this, charSequence);
    }
}

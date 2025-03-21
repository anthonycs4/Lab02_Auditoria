package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfew implements Iterable<String> {
    final /* synthetic */ CharSequence zza;
    final /* synthetic */ zzfey zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfew(zzfey zzfeyVar, CharSequence charSequence) {
        this.zzb = zzfeyVar;
        this.zza = charSequence;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        Iterator<String> zzf;
        zzf = this.zzb.zzf(this.zza);
        return zzf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<String> it = iterator();
        try {
            if (it.hasNext()) {
                sb.append(zzfej.zza(it.next(), ", "));
                while (it.hasNext()) {
                    sb.append((CharSequence) ", ");
                    sb.append(zzfej.zza(it.next(), ", "));
                }
            }
            sb.append(']');
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}

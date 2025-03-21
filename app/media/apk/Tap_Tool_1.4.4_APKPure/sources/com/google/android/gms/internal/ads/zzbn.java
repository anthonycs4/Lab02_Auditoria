package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbn extends zzgdb implements Closeable {
    private static final zzgdi zza = zzgdi.zzb(zzbn.class);

    public zzbn(zzgdc zzgdcVar, zzbm zzbmVar) throws IOException {
        zze(zzgdcVar, zzgdcVar.zzb(), zzbmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdb, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final String toString() {
        String obj = this.zzd.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}

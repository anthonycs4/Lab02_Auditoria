package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzgcy extends zzgdb implements zzbp {
    zzbq zza;
    protected final String zzb = "moov";

    public zzgcy(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zza(zzbq zzbqVar) {
        this.zza = zzbqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbp
    public final void zzc(zzgdc zzgdcVar, ByteBuffer byteBuffer, long j, zzbm zzbmVar) throws IOException {
        zzgdcVar.zzc();
        byteBuffer.remaining();
        byteBuffer.remaining();
        this.zzd = zzgdcVar;
        this.zzf = zzgdcVar.zzc();
        zzgdcVar.zzd(zzgdcVar.zzc() + j);
        this.zzg = zzgdcVar.zzc();
        this.zzc = zzbmVar;
    }
}

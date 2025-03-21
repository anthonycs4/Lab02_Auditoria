package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfny implements zzflu {
    private static final byte[] zza = new byte[0];
    private final zzfth zzb;
    private final zzflu zzc;

    public zzfny(zzfth zzfthVar, zzflu zzfluVar) {
        this.zzb = zzfthVar;
        this.zzc = zzfluVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzao = zzfmx.zzh(this.zzb).zzao();
        byte[] zza2 = this.zzc.zza(zzao, zza);
        byte[] zza3 = ((zzflu) zzfmx.zzj(this.zzb.zza(), zzao, zzflu.class)).zza(bArr, bArr2);
        int length = zza2.length;
        return ByteBuffer.allocate(length + 4 + zza3.length).putInt(length).put(zza2).put(zza3).array();
    }
}

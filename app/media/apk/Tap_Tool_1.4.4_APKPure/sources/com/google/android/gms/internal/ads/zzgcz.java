package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public abstract class zzgcz extends zzgcx implements zzbp {
    private int zza;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgcz(String str) {
        super("mvhd");
    }

    public final int zzh() {
        if (!this.zzc) {
            zzg();
        }
        return this.zza;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final long zzi(ByteBuffer byteBuffer) {
        this.zza = zzbo.zzc(byteBuffer.get());
        zzbo.zzb(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}

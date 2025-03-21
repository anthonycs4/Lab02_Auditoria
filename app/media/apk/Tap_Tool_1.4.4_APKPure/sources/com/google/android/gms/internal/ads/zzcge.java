package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcge {
    private long zza;

    public final long zza(ByteBuffer byteBuffer) {
        zzbs zzbsVar;
        zzbr zzbrVar;
        long j = this.zza;
        if (j > 0) {
            return j;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            Iterator<zzbp> it = new zzbn(new zzcgd(duplicate), zzcgg.zzb).zzd().iterator();
            while (true) {
                zzbsVar = null;
                if (!it.hasNext()) {
                    zzbrVar = null;
                    break;
                }
                zzbp next = it.next();
                if (next instanceof zzbr) {
                    zzbrVar = (zzbr) next;
                    break;
                }
            }
            Iterator<zzbp> it2 = zzbrVar.zzd().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                zzbp next2 = it2.next();
                if (next2 instanceof zzbs) {
                    zzbsVar = (zzbs) next2;
                    break;
                }
            }
            long zze = (zzbsVar.zze() * 1000) / zzbsVar.zzd();
            this.zza = zze;
            return zze;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}

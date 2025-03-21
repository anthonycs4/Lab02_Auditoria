package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import kotlin.UByte;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzns extends zznf {
    private static final int zzd = Float.floatToIntBits(Float.NaN);

    private static void zzo(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == zzd) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }

    @Override // com.google.android.gms.internal.ads.zzmh
    public final void zzc(ByteBuffer byteBuffer) {
        ByteBuffer zzi;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.zzb.zzd;
        if (i2 == 536870912) {
            zzi = zzi((i / 3) * 4);
            while (position < limit) {
                zzo(((byteBuffer.get(position) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 24), zzi);
                position += 3;
            }
        } else if (i2 == 805306368) {
            zzi = zzi(i);
            while (position < limit) {
                zzo((byteBuffer.get(position) & UByte.MAX_VALUE) | ((byteBuffer.get(position + 1) & UByte.MAX_VALUE) << 8) | ((byteBuffer.get(position + 2) & UByte.MAX_VALUE) << 16) | ((byteBuffer.get(position + 3) & UByte.MAX_VALUE) << 24), zzi);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        zzi.flip();
    }

    @Override // com.google.android.gms.internal.ads.zznf
    public final zzmf zzk(zzmf zzmfVar) throws zzmg {
        int i = zzmfVar.zzd;
        if (zzaht.zzP(i)) {
            return i != 4 ? new zzmf(zzmfVar.zzb, zzmfVar.zzc, 4) : zzmf.zza;
        }
        throw new zzmg(zzmfVar);
    }
}

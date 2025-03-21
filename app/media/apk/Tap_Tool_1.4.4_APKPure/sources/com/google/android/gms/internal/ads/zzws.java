package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzws extends zzol {
    private long zzf;
    private int zzg;
    private int zzh;

    public zzws() {
        super(2, 0);
        this.zzh = 32;
    }

    @Override // com.google.android.gms.internal.ads.zzol, com.google.android.gms.internal.ads.zzoe
    public final void zza() {
        super.zza();
        this.zzg = 0;
    }

    public final void zzl(int i) {
        this.zzh = i;
    }

    public final long zzm() {
        return this.zzf;
    }

    public final int zzn() {
        return this.zzg;
    }

    public final boolean zzo() {
        return this.zzg > 0;
    }

    public final boolean zzp(zzol zzolVar) {
        ByteBuffer byteBuffer;
        zzafs.zza(!zzolVar.zzh(BasicMeasure.EXACTLY));
        zzafs.zza(!zzolVar.zzh(268435456));
        zzafs.zza(!zzolVar.zzh(4));
        if (zzo()) {
            if (this.zzg >= this.zzh || zzolVar.zzh(Integer.MIN_VALUE) != zzh(Integer.MIN_VALUE)) {
                return false;
            }
            ByteBuffer byteBuffer2 = zzolVar.zzb;
            if (byteBuffer2 != null && (byteBuffer = this.zzb) != null && byteBuffer.position() + byteBuffer2.remaining() > 3072000) {
                return false;
            }
        }
        int i = this.zzg;
        this.zzg = i + 1;
        if (i == 0) {
            this.zzd = zzolVar.zzd;
            if (zzolVar.zzh(1)) {
                zzf(1);
            }
        }
        if (zzolVar.zzh(Integer.MIN_VALUE)) {
            zzf(Integer.MIN_VALUE);
        }
        ByteBuffer byteBuffer3 = zzolVar.zzb;
        if (byteBuffer3 != null) {
            zzi(byteBuffer3.remaining());
            this.zzb.put(byteBuffer3);
        }
        this.zzf = zzolVar.zzd;
        return true;
    }
}

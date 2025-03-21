package com.google.android.gms.internal.ads;

import androidx.core.view.MotionEventCompat;
import java.nio.ByteBuffer;
import java.util.Date;
import kotlin.UByte;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbs extends zzgcz {
    private Date zza;
    private Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private zzgdj zzm;
    private long zzn;

    public zzbs() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = zzgdj.zzj;
    }

    public final String toString() {
        return "MovieHeaderBox[creationTime=" + this.zza + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + "]";
    }

    public final long zzd() {
        return this.zzi;
    }

    public final long zze() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzf(ByteBuffer byteBuffer) {
        zzi(byteBuffer);
        if (zzh() == 1) {
            this.zza = zzgde.zza(zzbo.zzd(byteBuffer));
            this.zzh = zzgde.zza(zzbo.zzd(byteBuffer));
            this.zzi = zzbo.zza(byteBuffer);
            this.zzj = zzbo.zzd(byteBuffer);
        } else {
            this.zza = zzgde.zza(zzbo.zza(byteBuffer));
            this.zzh = zzgde.zza(zzbo.zza(byteBuffer));
            this.zzi = zzbo.zza(byteBuffer);
            this.zzj = zzbo.zza(byteBuffer);
        }
        this.zzk = zzbo.zze(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & UByte.MAX_VALUE) | ((short) ((bArr[0] << 8) & MotionEventCompat.ACTION_POINTER_INDEX_MASK)))) / 256.0f;
        zzbo.zzb(byteBuffer);
        zzbo.zza(byteBuffer);
        zzbo.zza(byteBuffer);
        this.zzm = zzgdj.zza(byteBuffer);
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = zzbo.zza(byteBuffer);
    }
}

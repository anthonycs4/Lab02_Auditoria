package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzxr {
    private final MediaCodec zza;
    private ByteBuffer[] zzb;
    private ByteBuffer[] zzc;

    public final void zza(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        this.zza.configure(mediaFormat, surface, (MediaCrypto) null, 0);
    }

    public final void zzb() {
        this.zza.start();
        if (zzaht.zza < 21) {
            this.zzb = this.zza.getInputBuffers();
            this.zzc = this.zza.getOutputBuffers();
        }
    }

    public final int zzc() {
        return this.zza.dequeueInputBuffer(0L);
    }

    public final int zzd(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.zza.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3) {
                if (zzaht.zza < 21) {
                    this.zzc = this.zza.getOutputBuffers();
                }
                dequeueOutputBuffer = -3;
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public final MediaFormat zze() {
        return this.zza.getOutputFormat();
    }

    public final ByteBuffer zzf(int i) {
        if (zzaht.zza >= 21) {
            return this.zza.getInputBuffer(i);
        }
        return ((ByteBuffer[]) zzaht.zzd(this.zzb))[i];
    }

    public final ByteBuffer zzg(int i) {
        if (zzaht.zza >= 21) {
            return this.zza.getOutputBuffer(i);
        }
        return ((ByteBuffer[]) zzaht.zzd(this.zzc))[i];
    }

    public final void zzh(int i, int i2, int i3, long j, int i4) {
        this.zza.queueInputBuffer(i, 0, i3, j, i4);
    }

    public final void zzi(int i, int i2, zzoh zzohVar, long j, int i3) {
        this.zza.queueSecureInputBuffer(i, 0, zzohVar.zzb(), j, 0);
    }

    public final void zzj(int i, boolean z) {
        this.zza.releaseOutputBuffer(i, z);
    }

    public final void zzk(int i, long j) {
        this.zza.releaseOutputBuffer(i, j);
    }

    public final void zzl() {
        this.zza.flush();
    }

    public final void zzm() {
        this.zzb = null;
        this.zzc = null;
        this.zza.release();
    }

    public final void zzn(final zzwv zzwvVar, Handler handler) {
        this.zza.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener(this, zzwvVar) { // from class: com.google.android.gms.internal.ads.zzxo
            private final zzxr zza;
            private final zzwv zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzwvVar;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
                this.zzb.zza(this.zza, j, j2);
            }
        }, handler);
    }

    public final void zzo(Surface surface) {
        this.zza.setOutputSurface(surface);
    }

    public final void zzp(Bundle bundle) {
        this.zza.setParameters(bundle);
    }

    public final void zzq(int i) {
        this.zza.setVideoScalingMode(i);
    }
}

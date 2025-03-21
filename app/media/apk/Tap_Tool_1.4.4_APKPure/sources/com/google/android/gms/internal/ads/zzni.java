package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzni {
    public final zzjq zza;
    public final int zzb;
    public final int zzc = 0;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzmh[] zzi;

    public zzni(zzjq zzjqVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, zzmh[] zzmhVarArr) {
        this.zza = zzjqVar;
        this.zzb = i;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzi = zzmhVarArr;
        int minBufferSize = AudioTrack.getMinBufferSize(i4, i5, i6);
        zzafs.zzd(minBufferSize != -2);
        this.zzh = zzaht.zzy(minBufferSize * 4, ((int) zzb(250000L)) * i3, Math.max(minBufferSize, ((int) zzb(750000L)) * i3));
    }

    private static AudioAttributes zzd(zzmd zzmdVar, boolean z) {
        if (z) {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
        return zzmdVar.zza();
    }

    public final long zza(long j) {
        return (j * 1000000) / this.zze;
    }

    public final long zzb(long j) {
        return (j * this.zze) / 1000000;
    }

    public final AudioTrack zzc(boolean z, zzmd zzmdVar, int i) throws zzmv {
        AudioTrack audioTrack;
        AudioFormat build;
        AudioFormat build2;
        try {
            if (zzaht.zza >= 29) {
                int i2 = this.zze;
                build2 = new AudioFormat.Builder().setSampleRate(i2).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack.Builder().setAudioAttributes(zzd(zzmdVar, z)).setAudioFormat(build2).setTransferMode(1).setBufferSizeInBytes(this.zzh).setSessionId(i).setOffloadedPlayback(false).build();
            } else if (zzaht.zza < 21) {
                int i3 = zzmdVar.zzb;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i);
                }
            } else {
                AudioAttributes zzd = zzd(zzmdVar, z);
                int i4 = this.zze;
                build = new AudioFormat.Builder().setSampleRate(i4).setChannelMask(this.zzf).setEncoding(this.zzg).build();
                audioTrack = new AudioTrack(zzd, build, this.zzh, 1, i);
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzmv(state, this.zze, this.zzf, this.zzh, this.zza, false, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzmv(0, this.zze, this.zzf, this.zzh, this.zza, false, e);
        }
    }
}

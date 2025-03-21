package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public class zzaks {
    protected AudioTrack zza;
    private boolean zzb;
    private int zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;
    private long zzi;

    private zzaks() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaks(zzakr zzakrVar) {
    }

    public void zza(AudioTrack audioTrack, boolean z) {
        this.zza = audioTrack;
        this.zzb = z;
        this.zzg = -9223372036854775807L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        if (audioTrack != null) {
            this.zzc = audioTrack.getSampleRate();
        }
    }

    public final void zzb(long j) {
        this.zzh = zzd();
        this.zzg = SystemClock.elapsedRealtime() * 1000;
        this.zzi = j;
        this.zza.stop();
    }

    public final void zzc() {
        if (this.zzg != -9223372036854775807L) {
            return;
        }
        this.zza.pause();
    }

    public final long zzd() {
        if (this.zzg != -9223372036854775807L) {
            return Math.min(this.zzi, this.zzh + ((((SystemClock.elapsedRealtime() * 1000) - this.zzg) * this.zzc) / 1000000));
        }
        int playState = this.zza.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.zza.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzb) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.zzf = this.zzd;
            }
            playbackHeadPosition += this.zzf;
        }
        if (this.zzd > playbackHeadPosition) {
            this.zze++;
        }
        this.zzd = playbackHeadPosition;
        return playbackHeadPosition + (this.zze << 32);
    }

    public final long zze() {
        return (zzd() * 1000000) / this.zzc;
    }

    public boolean zzf() {
        return false;
    }

    public long zzg() {
        throw new UnsupportedOperationException();
    }

    public long zzh() {
        throw new UnsupportedOperationException();
    }
}

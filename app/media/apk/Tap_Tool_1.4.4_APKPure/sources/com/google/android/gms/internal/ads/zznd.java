package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;
import android.util.Log;
import androidx.work.WorkRequest;
import java.lang.reflect.Method;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zznd {
    private long zzA;
    private long zzB;
    private long zzC;
    private boolean zzD;
    private long zzE;
    private long zzF;
    private final zznc zza;
    private final long[] zzb;
    private AudioTrack zzc;
    private int zzd;
    private int zze;
    private zznb zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private Method zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private long zzu;
    private int zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    public zznd(zznc zzncVar) {
        this.zza = zzncVar;
        if (zzaht.zza >= 18) {
            try {
                Class[] clsArr = null;
                this.zzn = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.zzb = new long[10];
    }

    private final long zzm(long j) {
        return (j * 1000000) / this.zzg;
    }

    private final void zzn() {
        this.zzl = 0L;
        this.zzw = 0;
        this.zzv = 0;
        this.zzm = 0L;
        this.zzC = 0L;
        this.zzF = 0L;
        this.zzk = false;
    }

    public final void zza(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.zzc = audioTrack;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = new zznb(audioTrack);
        this.zzg = audioTrack.getSampleRate();
        this.zzh = false;
        boolean zzO = zzaht.zzO(i);
        this.zzq = zzO;
        this.zzi = zzO ? zzm(i3 / i2) : -9223372036854775807L;
        this.zzs = 0L;
        this.zzt = 0L;
        this.zzu = 0L;
        this.zzp = false;
        this.zzx = -9223372036854775807L;
        this.zzy = -9223372036854775807L;
        this.zzr = 0L;
        this.zzo = 0L;
        this.zzj = 1.0f;
    }

    public final int zzf(long j) {
        return this.zze - ((int) (j - (zzo() * this.zzd)));
    }

    public final long zzg(long j) {
        return zzhx.zza(zzm(-zzo()));
    }

    public final boolean zzh(long j) {
        return this.zzy != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.zzy >= 200;
    }

    public final void zzi(long j) {
        this.zzz = zzo();
        this.zzx = SystemClock.elapsedRealtime() * 1000;
        this.zzA = j;
    }

    public final boolean zzj(long j) {
        if (j <= zzo()) {
            if (this.zzh) {
                AudioTrack audioTrack = this.zzc;
                Objects.requireNonNull(audioTrack);
                return audioTrack.getPlayState() == 2 && zzo() == 0;
            }
            return false;
        }
        return true;
    }

    public final boolean zzk() {
        zzn();
        if (this.zzx == -9223372036854775807L) {
            zznb zznbVar = this.zzf;
            Objects.requireNonNull(zznbVar);
            zznbVar.zze();
            return true;
        }
        return false;
    }

    public final void zzl() {
        zzn();
        this.zzc = null;
        this.zzf = null;
    }

    public final void zzc() {
        zznb zznbVar = this.zzf;
        Objects.requireNonNull(zznbVar);
        zznbVar.zze();
    }

    public final boolean zzd() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        return audioTrack.getPlayState() == 3;
    }

    private final long zzo() {
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        if (this.zzx != -9223372036854775807L) {
            return Math.min(this.zzA, this.zzz + ((((SystemClock.elapsedRealtime() * 1000) - this.zzx) * this.zzg) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.zzh) {
            if (playState == 2) {
                if (playbackHeadPosition == 0) {
                    this.zzu = this.zzs;
                }
                playState = 2;
            }
            playbackHeadPosition += this.zzu;
        }
        if (zzaht.zza <= 29) {
            if (playbackHeadPosition == 0 && this.zzs > 0 && playState == 3) {
                if (this.zzy == -9223372036854775807L) {
                    this.zzy = SystemClock.elapsedRealtime();
                }
                return this.zzs;
            }
            this.zzy = -9223372036854775807L;
        }
        if (this.zzs > playbackHeadPosition) {
            this.zzt++;
        }
        this.zzs = playbackHeadPosition;
        return playbackHeadPosition + (this.zzt << 32);
    }

    public final boolean zze(long j) {
        zzmw zzmwVar;
        long j2;
        zzmw zzmwVar2;
        zzms zzmsVar;
        AudioTrack audioTrack = this.zzc;
        Objects.requireNonNull(audioTrack);
        int playState = audioTrack.getPlayState();
        if (this.zzh) {
            if (playState == 2) {
                this.zzp = false;
                return false;
            } else if (playState == 1) {
                if (zzo() == 0) {
                    return false;
                }
                playState = 1;
            }
        }
        boolean z = this.zzp;
        boolean zzj = zzj(j);
        this.zzp = zzj;
        if (z && !zzj && playState != 1) {
            zznc zzncVar = this.zza;
            int i = this.zze;
            long zza = zzhx.zza(this.zzi);
            zznm zznmVar = (zznm) zzncVar;
            zzmwVar = zznmVar.zza.zzk;
            if (zzmwVar != null) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j2 = zznmVar.zza.zzP;
                zzmwVar2 = zznmVar.zza.zzk;
                zzmsVar = ((zznu) zzmwVar2).zza.zzc;
                zzmsVar.zze(i, zza, elapsedRealtime - j2);
            }
        }
        return true;
    }

    public final long zzb(boolean z) {
        long j;
        zzmw zzmwVar;
        zzmw zzmwVar2;
        zzms zzmsVar;
        Method method;
        AudioTrack audioTrack;
        long zzP;
        long zzQ;
        long zzP2;
        long zzQ2;
        zznd zzndVar = this;
        AudioTrack audioTrack2 = zzndVar.zzc;
        Objects.requireNonNull(audioTrack2);
        if (audioTrack2.getPlayState() == 3) {
            long zzm = zzndVar.zzm(zzo());
            if (zzm != 0) {
                long nanoTime = System.nanoTime() / 1000;
                if (nanoTime - zzndVar.zzm >= WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                    long[] jArr = zzndVar.zzb;
                    int i = zzndVar.zzv;
                    jArr[i] = zzm - nanoTime;
                    zzndVar.zzv = (i + 1) % 10;
                    int i2 = zzndVar.zzw;
                    if (i2 < 10) {
                        zzndVar.zzw = i2 + 1;
                    }
                    zzndVar.zzm = nanoTime;
                    zzndVar.zzl = 0L;
                    int i3 = 0;
                    while (true) {
                        int i4 = zzndVar.zzw;
                        if (i3 >= i4) {
                            break;
                        }
                        zzndVar.zzl += zzndVar.zzb[i3] / i4;
                        i3++;
                    }
                }
                if (!zzndVar.zzh) {
                    zznb zznbVar = zzndVar.zzf;
                    Objects.requireNonNull(zznbVar);
                    if (zznbVar.zza(nanoTime)) {
                        long zzf = zznbVar.zzf();
                        long zzg = zznbVar.zzg();
                        if (Math.abs(zzf - nanoTime) > 5000000) {
                            zznm zznmVar = (zznm) zzndVar.zza;
                            zzP2 = zznmVar.zza.zzP();
                            zzQ2 = zznmVar.zza.zzQ();
                            StringBuilder sb = new StringBuilder(180);
                            sb.append("Spurious audio timestamp (system clock mismatch): ");
                            sb.append(zzg);
                            sb.append(", ");
                            sb.append(zzf);
                            sb.append(", ");
                            sb.append(nanoTime);
                            sb.append(", ");
                            sb.append(zzm);
                            sb.append(", ");
                            sb.append(zzP2);
                            sb.append(", ");
                            sb.append(zzQ2);
                            Log.w("DefaultAudioSink", sb.toString());
                            zznbVar.zzb();
                        } else if (Math.abs(zzndVar.zzm(zzg) - zzm) > 5000000) {
                            zznm zznmVar2 = (zznm) zzndVar.zza;
                            zzP = zznmVar2.zza.zzP();
                            zzQ = zznmVar2.zza.zzQ();
                            StringBuilder sb2 = new StringBuilder(182);
                            sb2.append("Spurious audio timestamp (frame position mismatch): ");
                            sb2.append(zzg);
                            sb2.append(", ");
                            sb2.append(zzf);
                            sb2.append(", ");
                            sb2.append(nanoTime);
                            sb2.append(", ");
                            sb2.append(zzm);
                            sb2.append(", ");
                            sb2.append(zzP);
                            sb2.append(", ");
                            sb2.append(zzQ);
                            Log.w("DefaultAudioSink", sb2.toString());
                            zznbVar.zzb();
                        } else {
                            zznbVar.zzc();
                        }
                        zzndVar = this;
                    }
                    if (zzndVar.zzq && (method = zzndVar.zzn) != null && nanoTime - zzndVar.zzr >= 500000) {
                        try {
                            Objects.requireNonNull(zzndVar.zzc);
                            int i5 = zzaht.zza;
                            long intValue = (((Integer) method.invoke(audioTrack, new Object[0])).intValue() * 1000) - zzndVar.zzi;
                            zzndVar.zzo = intValue;
                            long max = Math.max(intValue, 0L);
                            zzndVar.zzo = max;
                            if (max > 5000000) {
                                StringBuilder sb3 = new StringBuilder(61);
                                sb3.append("Ignoring impossibly large audio latency: ");
                                sb3.append(max);
                                Log.w("DefaultAudioSink", sb3.toString());
                                zzndVar.zzo = 0L;
                            }
                        } catch (Exception unused) {
                            zzndVar.zzn = null;
                        }
                        zzndVar.zzr = nanoTime;
                    }
                }
            }
        }
        long nanoTime2 = System.nanoTime() / 1000;
        zznb zznbVar2 = zzndVar.zzf;
        Objects.requireNonNull(zznbVar2);
        boolean zzd = zznbVar2.zzd();
        if (zzd) {
            j = zzndVar.zzm(zznbVar2.zzg()) + zzaht.zzI(nanoTime2 - zznbVar2.zzf(), zzndVar.zzj);
        } else {
            if (zzndVar.zzw == 0) {
                j = zzndVar.zzm(zzo());
            } else {
                j = zzndVar.zzl + nanoTime2;
            }
            if (!z) {
                j = Math.max(0L, j - zzndVar.zzo);
            }
        }
        if (zzndVar.zzD != zzd) {
            zzndVar.zzF = zzndVar.zzC;
            zzndVar.zzE = zzndVar.zzB;
        }
        long j2 = nanoTime2 - zzndVar.zzF;
        if (j2 < 1000000) {
            long j3 = (j2 * 1000) / 1000000;
            j = ((j * j3) + ((1000 - j3) * (zzndVar.zzE + zzaht.zzI(j2, zzndVar.zzj)))) / 1000;
        }
        if (!zzndVar.zzk) {
            long j4 = zzndVar.zzB;
            if (j > j4) {
                zzndVar.zzk = true;
                long currentTimeMillis = System.currentTimeMillis() - zzhx.zza(zzaht.zzJ(zzhx.zza(j - j4), zzndVar.zzj));
                zznm zznmVar3 = (zznm) zzndVar.zza;
                zzmwVar = zznmVar3.zza.zzk;
                if (zzmwVar != null) {
                    zzmwVar2 = zznmVar3.zza.zzk;
                    zzmsVar = ((zznu) zzmwVar2).zza.zzc;
                    zzmsVar.zzd(currentTimeMillis);
                }
            }
        }
        zzndVar.zzC = nanoTime2;
        zzndVar.zzB = j;
        zzndVar.zzD = zzd;
        return j;
    }
}

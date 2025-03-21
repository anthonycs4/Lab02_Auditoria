package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzajm implements zzajj {
    private final zzajy[] zza;
    private final zzapz zzb;
    private final zzapx zzc;
    private final Handler zzd;
    private final zzajr zze;
    private final CopyOnWriteArraySet<zzajg> zzf;
    private final zzakd zzg;
    private final zzakc zzh;
    private boolean zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private zzake zzo;
    private Object zzp;
    private zzapl zzq;
    private zzapx zzr;
    private zzajx zzs;
    private zzajo zzt;
    private long zzu;

    public zzajm(zzajy[] zzajyVarArr, zzapz zzapzVar, zzcfr zzcfrVar, byte[] bArr) {
        String str = zzarj.zze;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("Init ExoPlayerLib/2.4.2 [");
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        this.zza = zzajyVarArr;
        Objects.requireNonNull(zzapzVar);
        this.zzb = zzapzVar;
        this.zzj = false;
        this.zzk = 1;
        this.zzf = new CopyOnWriteArraySet<>();
        zzapx zzapxVar = new zzapx(new zzapp[2], null);
        this.zzc = zzapxVar;
        this.zzo = zzake.zza;
        this.zzg = new zzakd();
        this.zzh = new zzakc();
        this.zzq = zzapl.zza;
        this.zzr = zzapxVar;
        this.zzs = zzajx.zza;
        zzajl zzajlVar = new zzajl(this, Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper());
        this.zzd = zzajlVar;
        zzajo zzajoVar = new zzajo(0, 0L);
        this.zzt = zzajoVar;
        this.zze = new zzajr(zzajyVarArr, zzapzVar, zzcfrVar, this.zzj, 0, zzajlVar, zzajoVar, this, null);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zza(zzajg zzajgVar) {
        this.zzf.add(zzajgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzb(zzajg zzajgVar) {
        this.zzf.remove(zzajgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final int zzc() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzd(zzaow zzaowVar) {
        if (!this.zzo.zzf() || this.zzp != null) {
            this.zzo = zzake.zza;
            this.zzp = null;
            Iterator<zzajg> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zza(this.zzo, this.zzp);
            }
        }
        if (this.zzi) {
            this.zzi = false;
            this.zzq = zzapl.zza;
            this.zzr = this.zzc;
            this.zzb.zze(null);
            Iterator<zzajg> it2 = this.zzf.iterator();
            while (it2.hasNext()) {
                it2.next().zzb(this.zzq, this.zzr);
            }
        }
        this.zzm++;
        this.zze.zzb(zzaowVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zze(boolean z) {
        if (this.zzj != z) {
            this.zzj = z;
            this.zze.zzc(z);
            Iterator<zzajg> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zzd(z, this.zzk);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final boolean zzf() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzg(long j) {
        zzr();
        if (this.zzo.zzf() || this.zzo.zza() > 0) {
            this.zzl++;
            if (!this.zzo.zzf()) {
                this.zzo.zzg(0, this.zzg, false);
                long zzb = zzaje.zzb(j);
                long j2 = this.zzo.zzd(0, this.zzh, false).zzc;
                if (j2 != -9223372036854775807L) {
                    int i = (zzb > j2 ? 1 : (zzb == j2 ? 0 : -1));
                }
            }
            this.zzu = j;
            this.zze.zzd(this.zzo, 0, zzaje.zzb(j));
            Iterator<zzajg> it = this.zzf.iterator();
            while (it.hasNext()) {
                it.next().zzf();
            }
            return;
        }
        throw new zzajv(this.zzo, 0, j);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzh() {
        this.zze.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzi() {
        this.zze.zzh();
        this.zzd.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzj(zzaji... zzajiVarArr) {
        this.zze.zzf(zzajiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzk(zzaji... zzajiVarArr) {
        this.zze.zzg(zzajiVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzl() {
        if (this.zzo.zzf()) {
            return -9223372036854775807L;
        }
        zzake zzakeVar = this.zzo;
        zzr();
        return zzaje.zza(zzakeVar.zzg(0, this.zzg, false).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzm() {
        if (this.zzo.zzf() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzaje.zza(0L) + zzaje.zza(this.zzt.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final long zzn() {
        if (this.zzo.zzf() || this.zzl > 0) {
            return this.zzu;
        }
        this.zzo.zzd(this.zzt.zza, this.zzh, false);
        return zzaje.zza(0L) + zzaje.zza(this.zzt.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzo() {
        this.zze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzp(int i) {
        this.zze.zzl(i);
    }

    @Override // com.google.android.gms.internal.ads.zzajj
    public final void zzq(int i) {
        this.zze.zzm(i);
    }

    public final int zzr() {
        if (!this.zzo.zzf() && this.zzl <= 0) {
            this.zzo.zzd(this.zzt.zza, this.zzh, false);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzs(Message message) {
        switch (message.what) {
            case 0:
                this.zzm--;
                return;
            case 1:
                this.zzk = message.arg1;
                Iterator<zzajg> it = this.zzf.iterator();
                while (it.hasNext()) {
                    it.next().zzd(this.zzj, this.zzk);
                }
                return;
            case 2:
                this.zzn = message.arg1 != 0;
                Iterator<zzajg> it2 = this.zzf.iterator();
                while (it2.hasNext()) {
                    it2.next().zzc(this.zzn);
                }
                return;
            case 3:
                if (this.zzm == 0) {
                    zzaqa zzaqaVar = (zzaqa) message.obj;
                    this.zzi = true;
                    this.zzq = zzaqaVar.zza;
                    this.zzr = zzaqaVar.zzb;
                    this.zzb.zze(zzaqaVar.zzc);
                    Iterator<zzajg> it3 = this.zzf.iterator();
                    while (it3.hasNext()) {
                        it3.next().zzb(this.zzq, this.zzr);
                    }
                    return;
                }
                return;
            case 4:
                int i = this.zzl - 1;
                this.zzl = i;
                if (i == 0) {
                    this.zzt = (zzajo) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<zzajg> it4 = this.zzf.iterator();
                        while (it4.hasNext()) {
                            it4.next().zzf();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (this.zzl == 0) {
                    this.zzt = (zzajo) message.obj;
                    Iterator<zzajg> it5 = this.zzf.iterator();
                    while (it5.hasNext()) {
                        it5.next().zzf();
                    }
                    return;
                }
                return;
            case 6:
                zzajq zzajqVar = (zzajq) message.obj;
                this.zzl -= zzajqVar.zzd;
                if (this.zzm == 0) {
                    this.zzo = zzajqVar.zza;
                    this.zzp = zzajqVar.zzb;
                    this.zzt = zzajqVar.zzc;
                    Iterator<zzajg> it6 = this.zzf.iterator();
                    while (it6.hasNext()) {
                        it6.next().zza(this.zzo, this.zzp);
                    }
                    return;
                }
                return;
            case 7:
                zzajx zzajxVar = (zzajx) message.obj;
                if (this.zzs.equals(zzajxVar)) {
                    return;
                }
                this.zzs = zzajxVar;
                Iterator<zzajg> it7 = this.zzf.iterator();
                while (it7.hasNext()) {
                    it7.next().zzg(zzajxVar);
                }
                return;
            case 8:
                zzajf zzajfVar = (zzajf) message.obj;
                Iterator<zzajg> it8 = this.zzf.iterator();
                while (it8.hasNext()) {
                    it8.next().zze(zzajfVar);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}

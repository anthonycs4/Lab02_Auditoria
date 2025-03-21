package com.google.android.gms.ads.internal;

import android.os.Build;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.overlay.zzx;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.util.zzbx;
import com.google.android.gms.ads.internal.util.zzch;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.ads.zzatc;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzavd;
import com.google.android.gms.internal.ads.zzbfw;
import com.google.android.gms.internal.ads.zzboj;
import com.google.android.gms.internal.ads.zzbpv;
import com.google.android.gms.internal.ads.zzbra;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvi;
import com.google.android.gms.internal.ads.zzbxn;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzcdf;
import com.google.android.gms.internal.ads.zzcdm;
import com.google.android.gms.internal.ads.zzcgl;
import com.google.android.gms.internal.ads.zzcin;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzs {
    private static final zzs zza = new zzs();
    private final zzch zzA;
    private final zzcgl zzB;
    private final zzcdm zzC;
    private final com.google.android.gms.ads.internal.overlay.zza zzb;
    private final com.google.android.gms.ads.internal.overlay.zzm zzc;
    private final com.google.android.gms.ads.internal.util.zzr zzd;
    private final zzcin zze;
    private final zzac zzf;
    private final zzatc zzg;
    private final zzcby zzh;
    private final zzad zzi;
    private final zzauo zzj;
    private final Clock zzk;
    private final zze zzl;
    private final zzbfw zzm;
    private final zzay zzn;
    private final zzbxn zzo;
    private final zzboj zzp;
    private final zzcdf zzq;
    private final zzbpv zzr;
    private final zzbw zzs;
    private final zzw zzt;
    private final zzx zzu;
    private final zzbra zzv;
    private final zzbx zzw;
    private final zzbvi zzx;
    private final zzavd zzy;
    private final zzcaw zzz;

    protected zzs() {
        com.google.android.gms.ads.internal.overlay.zza zzaVar = new com.google.android.gms.ads.internal.overlay.zza();
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = new com.google.android.gms.ads.internal.overlay.zzm();
        com.google.android.gms.ads.internal.util.zzr zzrVar = new com.google.android.gms.ads.internal.util.zzr();
        zzcin zzcinVar = new zzcin();
        zzac zzt = zzac.zzt(Build.VERSION.SDK_INT);
        zzatc zzatcVar = new zzatc();
        zzcby zzcbyVar = new zzcby();
        zzad zzadVar = new zzad();
        zzauo zzauoVar = new zzauo();
        Clock defaultClock = DefaultClock.getInstance();
        zze zzeVar = new zze();
        zzbfw zzbfwVar = new zzbfw();
        zzay zzayVar = new zzay();
        zzbxn zzbxnVar = new zzbxn();
        zzboj zzbojVar = new zzboj();
        zzcdf zzcdfVar = new zzcdf();
        zzbpv zzbpvVar = new zzbpv();
        zzbw zzbwVar = new zzbw();
        zzw zzwVar = new zzw();
        zzx zzxVar = new zzx();
        zzbra zzbraVar = new zzbra();
        zzbx zzbxVar = new zzbx();
        zzdxz zzdxzVar = new zzdxz(new zzdxy(), new zzbvh());
        zzavd zzavdVar = new zzavd();
        zzcaw zzcawVar = new zzcaw();
        zzch zzchVar = new zzch();
        zzcgl zzcglVar = new zzcgl();
        zzcdm zzcdmVar = new zzcdm();
        this.zzb = zzaVar;
        this.zzc = zzmVar;
        this.zzd = zzrVar;
        this.zze = zzcinVar;
        this.zzf = zzt;
        this.zzg = zzatcVar;
        this.zzh = zzcbyVar;
        this.zzi = zzadVar;
        this.zzj = zzauoVar;
        this.zzk = defaultClock;
        this.zzl = zzeVar;
        this.zzm = zzbfwVar;
        this.zzn = zzayVar;
        this.zzo = zzbxnVar;
        this.zzp = zzbojVar;
        this.zzq = zzcdfVar;
        this.zzr = zzbpvVar;
        this.zzs = zzbwVar;
        this.zzt = zzwVar;
        this.zzu = zzxVar;
        this.zzv = zzbraVar;
        this.zzw = zzbxVar;
        this.zzx = zzdxzVar;
        this.zzy = zzavdVar;
        this.zzz = zzcawVar;
        this.zzA = zzchVar;
        this.zzB = zzcglVar;
        this.zzC = zzcdmVar;
    }

    public static zzcaw zzA() {
        return zza.zzz;
    }

    public static com.google.android.gms.ads.internal.overlay.zza zza() {
        return zza.zzb;
    }

    public static com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return zza.zzc;
    }

    public static com.google.android.gms.ads.internal.util.zzr zzc() {
        return zza.zzd;
    }

    public static zzcin zzd() {
        return zza.zze;
    }

    public static zzac zze() {
        return zza.zzf;
    }

    public static zzatc zzf() {
        return zza.zzg;
    }

    public static zzcby zzg() {
        return zza.zzh;
    }

    public static zzad zzh() {
        return zza.zzi;
    }

    public static zzauo zzi() {
        return zza.zzj;
    }

    public static Clock zzj() {
        return zza.zzk;
    }

    public static zze zzk() {
        return zza.zzl;
    }

    public static zzbfw zzl() {
        return zza.zzm;
    }

    public static zzay zzm() {
        return zza.zzn;
    }

    public static zzbxn zzn() {
        return zza.zzo;
    }

    public static zzcdf zzo() {
        return zza.zzq;
    }

    public static zzbpv zzp() {
        return zza.zzr;
    }

    public static zzbw zzq() {
        return zza.zzs;
    }

    public static zzbvi zzr() {
        return zza.zzx;
    }

    public static zzw zzs() {
        return zza.zzt;
    }

    public static zzx zzt() {
        return zza.zzu;
    }

    public static zzbra zzu() {
        return zza.zzv;
    }

    public static zzbx zzv() {
        return zza.zzw;
    }

    public static zzavd zzw() {
        return zza.zzy;
    }

    public static zzch zzx() {
        return zza.zzA;
    }

    public static zzcgl zzy() {
        return zza.zzB;
    }

    public static zzcdm zzz() {
        return zza.zzC;
    }
}

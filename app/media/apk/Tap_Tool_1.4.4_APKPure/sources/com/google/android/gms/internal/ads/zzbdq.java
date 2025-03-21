package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.search.SearchAdRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdq {
    private final Date zza;
    private final String zzb;
    private final List<String> zzc;
    private final int zzd;
    private final Set<String> zze;
    private final Location zzf;
    private final Bundle zzg;
    private final Map<Class<? extends NetworkExtras>, NetworkExtras> zzh;
    private final String zzi;
    private final String zzj;
    @NotOnlyInitialized
    private final SearchAdRequest zzk;
    private final int zzl;
    private final Set<String> zzm;
    private final Bundle zzn;
    private final Set<String> zzo;
    private final boolean zzp;
    private final AdInfo zzq;
    private final String zzr;
    private final int zzs;

    public zzbdq(zzbdp zzbdpVar, SearchAdRequest searchAdRequest) {
        this.zza = zzbdp.zzu(zzbdpVar);
        this.zzb = zzbdp.zzv(zzbdpVar);
        this.zzc = zzbdp.zzw(zzbdpVar);
        this.zzd = zzbdp.zzx(zzbdpVar);
        this.zze = Collections.unmodifiableSet(zzbdp.zzy(zzbdpVar));
        this.zzf = zzbdp.zzz(zzbdpVar);
        this.zzg = zzbdp.zzA(zzbdpVar);
        this.zzh = Collections.unmodifiableMap(zzbdp.zzB(zzbdpVar));
        this.zzi = zzbdp.zzC(zzbdpVar);
        this.zzj = zzbdp.zzD(zzbdpVar);
        this.zzk = searchAdRequest;
        this.zzl = zzbdp.zzE(zzbdpVar);
        this.zzm = Collections.unmodifiableSet(zzbdp.zzF(zzbdpVar));
        this.zzn = zzbdp.zzG(zzbdpVar);
        this.zzo = Collections.unmodifiableSet(zzbdp.zzH(zzbdpVar));
        this.zzp = zzbdp.zzI(zzbdpVar);
        this.zzq = zzbdp.zzJ(zzbdpVar);
        this.zzr = zzbdp.zzK(zzbdpVar);
        this.zzs = zzbdp.zzL(zzbdpVar);
    }

    @Deprecated
    public final Date zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    public final List<String> zzc() {
        return new ArrayList(this.zzc);
    }

    @Deprecated
    public final int zzd() {
        return this.zzd;
    }

    public final Set<String> zze() {
        return this.zze;
    }

    public final Location zzf() {
        return this.zzf;
    }

    @Deprecated
    public final <T extends NetworkExtras> T zzg(Class<T> cls) {
        return (T) this.zzh.get(cls);
    }

    public final Bundle zzh(Class<? extends MediationExtrasReceiver> cls) {
        return this.zzg.getBundle(cls.getName());
    }

    public final Bundle zzi(Class<? extends CustomEvent> cls) {
        Bundle bundle = this.zzg.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zzj;
    }

    public final SearchAdRequest zzl() {
        return this.zzk;
    }

    public final boolean zzm(Context context) {
        RequestConfiguration zzm = zzbdy.zza().zzm();
        zzbay.zza();
        String zzt = zzccg.zzt(context);
        return this.zzm.contains(zzt) || zzm.getTestDeviceIds().contains(zzt);
    }

    public final Map<Class<? extends NetworkExtras>, NetworkExtras> zzn() {
        return this.zzh;
    }

    public final Bundle zzo() {
        return this.zzg;
    }

    public final int zzp() {
        return this.zzl;
    }

    public final Bundle zzq() {
        return this.zzn;
    }

    public final Set<String> zzr() {
        return this.zzo;
    }

    @Deprecated
    public final boolean zzs() {
        return this.zzp;
    }

    public final AdInfo zzt() {
        return this.zzq;
    }

    public final String zzu() {
        return this.zzr;
    }

    public final int zzv() {
        return this.zzs;
    }
}

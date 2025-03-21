package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbdp {
    private Date zzg;
    private String zzh;
    private Location zzk;
    private String zzl;
    private String zzm;
    private boolean zzo;
    private AdInfo zzp;
    private String zzq;
    private final HashSet<String> zza = new HashSet<>();
    private final Bundle zzb = new Bundle();
    private final HashMap<Class<? extends NetworkExtras>, NetworkExtras> zzc = new HashMap<>();
    private final HashSet<String> zzd = new HashSet<>();
    private final Bundle zze = new Bundle();
    private final HashSet<String> zzf = new HashSet<>();
    private final List<String> zzi = new ArrayList();
    private int zzj = -1;
    private int zzn = -1;
    private int zzr = 60000;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzA(zzbdp zzbdpVar) {
        return zzbdpVar.zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashMap zzB(zzbdp zzbdpVar) {
        return zzbdpVar.zzc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzC(zzbdp zzbdpVar) {
        return zzbdpVar.zzl;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzD(zzbdp zzbdpVar) {
        return zzbdpVar.zzm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzE(zzbdp zzbdpVar) {
        return zzbdpVar.zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzF(zzbdp zzbdpVar) {
        return zzbdpVar.zzd;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Bundle zzG(zzbdp zzbdpVar) {
        return zzbdpVar.zze;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzH(zzbdp zzbdpVar) {
        return zzbdpVar.zzf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ boolean zzI(zzbdp zzbdpVar) {
        return zzbdpVar.zzo;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ AdInfo zzJ(zzbdp zzbdpVar) {
        return zzbdpVar.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzK(zzbdp zzbdpVar) {
        return zzbdpVar.zzq;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzL(zzbdp zzbdpVar) {
        return zzbdpVar.zzr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Date zzu(zzbdp zzbdpVar) {
        return zzbdpVar.zzg;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String zzv(zzbdp zzbdpVar) {
        return zzbdpVar.zzh;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ List zzw(zzbdp zzbdpVar) {
        return zzbdpVar.zzi;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int zzx(zzbdp zzbdpVar) {
        return zzbdpVar.zzj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ HashSet zzy(zzbdp zzbdpVar) {
        return zzbdpVar.zza;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Location zzz(zzbdp zzbdpVar) {
        return zzbdpVar.zzk;
    }

    public final void zza(String str) {
        this.zza.add(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Deprecated
    public final void zzb(NetworkExtras networkExtras) {
        if (networkExtras instanceof AdMobExtras) {
            zzc(AdMobAdapter.class, ((AdMobExtras) networkExtras).getExtras());
        } else {
            this.zzc.put(networkExtras.getClass(), networkExtras);
        }
    }

    public final void zzc(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zzb.putBundle(cls.getName(), bundle);
    }

    public final void zzd(Class<? extends CustomEvent> cls, Bundle bundle) {
        if (this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") == null) {
            this.zzb.putBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter", new Bundle());
        }
        Bundle bundle2 = this.zzb.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        Preconditions.checkNotNull(bundle2);
        bundle2.putBundle(cls.getName(), bundle);
    }

    public final void zze(String str) {
        this.zzd.add(str);
    }

    public final void zzf(String str) {
        this.zzd.remove("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public final void zzg(Date date) {
        this.zzg = date;
    }

    public final void zzh(String str) {
        this.zzh = str;
    }

    public final void zzi(List<String> list) {
        this.zzi.clear();
        for (String str : list) {
            if (TextUtils.isEmpty(str)) {
                zzccn.zzi("neighboring content URL should not be null or empty");
            } else {
                this.zzi.add(str);
            }
        }
    }

    @Deprecated
    public final void zzj(int i) {
        this.zzj = i;
    }

    public final void zzk(Location location) {
        this.zzk = location;
    }

    public final void zzl(String str) {
        this.zzl = str;
    }

    public final void zzm(String str) {
        this.zzm = str;
    }

    @Deprecated
    public final void zzn(boolean z) {
        this.zzn = z ? 1 : 0;
    }

    public final void zzo(String str, String str2) {
        this.zze.putString(str, str2);
    }

    public final void zzp(String str) {
        this.zzf.add(str);
    }

    @Deprecated
    public final void zzq(boolean z) {
        this.zzo = z;
    }

    public final void zzr(AdInfo adInfo) {
        this.zzp = adInfo;
    }

    public final void zzs(String str) {
        this.zzq = str;
    }

    public final void zzt(int i) {
        this.zzr = i;
    }
}

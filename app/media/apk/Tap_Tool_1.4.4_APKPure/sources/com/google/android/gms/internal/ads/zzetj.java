package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzetj {
    private zzazs zza;
    private zzazx zzb;
    private String zzc;
    private zzbey zzd;
    private boolean zze;
    private ArrayList<String> zzf;
    private ArrayList<String> zzg;
    private zzbhy zzh;
    private zzbad zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private zzbcb zzl;
    private zzbnv zzn;
    private zzefe zzq;
    private zzbcf zzr;
    private int zzm = 1;
    private final zzesz zzo = new zzesz();
    private boolean zzp = false;

    public static /* synthetic */ zzbad zzA(zzetj zzetjVar) {
        return zzetjVar.zzi;
    }

    public static /* synthetic */ int zzB(zzetj zzetjVar) {
        return zzetjVar.zzm;
    }

    public static /* synthetic */ AdManagerAdViewOptions zzC(zzetj zzetjVar) {
        return zzetjVar.zzj;
    }

    public static /* synthetic */ PublisherAdViewOptions zzD(zzetj zzetjVar) {
        return zzetjVar.zzk;
    }

    public static /* synthetic */ zzbcb zzE(zzetj zzetjVar) {
        return zzetjVar.zzl;
    }

    public static /* synthetic */ zzbnv zzF(zzetj zzetjVar) {
        return zzetjVar.zzn;
    }

    public static /* synthetic */ zzesz zzG(zzetj zzetjVar) {
        return zzetjVar.zzo;
    }

    public static /* synthetic */ boolean zzH(zzetj zzetjVar) {
        return zzetjVar.zzp;
    }

    public static /* synthetic */ zzefe zzI(zzetj zzetjVar) {
        return zzetjVar.zzq;
    }

    public static /* synthetic */ zzazs zzJ(zzetj zzetjVar) {
        return zzetjVar.zza;
    }

    public static /* synthetic */ boolean zzK(zzetj zzetjVar) {
        return zzetjVar.zze;
    }

    public static /* synthetic */ zzbey zzL(zzetj zzetjVar) {
        return zzetjVar.zzd;
    }

    public static /* synthetic */ zzbhy zzM(zzetj zzetjVar) {
        return zzetjVar.zzh;
    }

    public static /* synthetic */ zzbcf zzO(zzetj zzetjVar) {
        return zzetjVar.zzr;
    }

    public static /* synthetic */ zzazx zzw(zzetj zzetjVar) {
        return zzetjVar.zzb;
    }

    public static /* synthetic */ String zzx(zzetj zzetjVar) {
        return zzetjVar.zzc;
    }

    public static /* synthetic */ ArrayList zzy(zzetj zzetjVar) {
        return zzetjVar.zzf;
    }

    public static /* synthetic */ ArrayList zzz(zzetj zzetjVar) {
        return zzetjVar.zzg;
    }

    public final zzetj zzN(zzbcf zzbcfVar) {
        this.zzr = zzbcfVar;
        return this;
    }

    public final zzetj zza(zzazs zzazsVar) {
        this.zza = zzazsVar;
        return this;
    }

    public final zzazs zzb() {
        return this.zza;
    }

    public final zzetj zzc(zzazx zzazxVar) {
        this.zzb = zzazxVar;
        return this;
    }

    public final zzetj zzd(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzazx zze() {
        return this.zzb;
    }

    public final zzetj zzf(String str) {
        this.zzc = str;
        return this;
    }

    public final String zzg() {
        return this.zzc;
    }

    public final zzetj zzh(zzbey zzbeyVar) {
        this.zzd = zzbeyVar;
        return this;
    }

    public final zzesz zzi() {
        return this.zzo;
    }

    public final zzetj zzj(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzetj zzk(int i) {
        this.zzm = i;
        return this;
    }

    public final zzetj zzl(ArrayList<String> arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzetj zzm(ArrayList<String> arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzetj zzn(zzbhy zzbhyVar) {
        this.zzh = zzbhyVar;
        return this;
    }

    public final zzetj zzo(zzbad zzbadVar) {
        this.zzi = zzbadVar;
        return this;
    }

    public final zzetj zzp(zzbnv zzbnvVar) {
        this.zzn = zzbnvVar;
        this.zzd = new zzbey(false, true, false);
        return this;
    }

    public final zzetj zzq(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zza();
            this.zzl = publisherAdViewOptions.zzb();
        }
        return this;
    }

    public final zzetj zzr(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzetj zzs(zzefe zzefeVar) {
        this.zzq = zzefeVar;
        return this;
    }

    public final zzetj zzt(zzetk zzetkVar) {
        this.zzo.zza(zzetkVar.zzo.zza);
        this.zza = zzetkVar.zzd;
        this.zzb = zzetkVar.zze;
        this.zzr = zzetkVar.zzq;
        this.zzc = zzetkVar.zzf;
        this.zzd = zzetkVar.zza;
        this.zzf = zzetkVar.zzg;
        this.zzg = zzetkVar.zzh;
        this.zzh = zzetkVar.zzi;
        this.zzi = zzetkVar.zzj;
        zzr(zzetkVar.zzl);
        zzq(zzetkVar.zzm);
        this.zzp = zzetkVar.zzp;
        this.zzq = zzetkVar.zzc;
        return this;
    }

    public final zzetk zzu() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzetk(this, null);
    }

    public final boolean zzv() {
        return this.zzp;
    }
}

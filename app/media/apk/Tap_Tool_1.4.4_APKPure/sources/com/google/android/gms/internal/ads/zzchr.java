package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzchr extends zzcel implements zzafp, zzaat, zzaiy, zzmt, zzky {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzchd zze;
    private final zzlg zzf;
    private final zzlg zzg;
    private final zzadf zzh;
    private final zzcet zzi;
    private final WeakReference<zzceu> zzj;
    private final zzabn zzk;
    private zzif zzl;
    private ByteBuffer zzm;
    private boolean zzn;
    private zzcek zzo;
    private int zzp;
    private int zzq;
    private long zzr;
    private final String zzs;
    private final int zzt;
    private final ArrayList<zzafb> zzu;
    private volatile zzchg zzv;
    private final Set<WeakReference<zzchc>> zzw = new HashSet();

    public zzchr(Context context, zzcet zzcetVar, zzceu zzceuVar) {
        final zzaee zzaeeVar;
        zzpx zzpxVar;
        this.zzd = context;
        this.zzi = zzcetVar;
        this.zzj = new WeakReference<>(zzceuVar);
        zzchd zzchdVar = new zzchd();
        this.zze = zzchdVar;
        zzaii zzaiiVar = new zzaii(context, zzwu.zza, zzxb.zzb, 0L, false, com.google.android.gms.ads.internal.util.zzr.zza, this, -1);
        this.zzf = zzaiiVar;
        zznv zznvVar = new zznv(context, zzwu.zza, zzxb.zzb, false, com.google.android.gms.ads.internal.util.zzr.zza, this, new zznq(null, new zzmh[0], false));
        this.zzg = zznvVar;
        zzadf zzadfVar = new zzadf();
        this.zzh = zzadfVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("OfficialExoPlayerAdapter initialize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        zza.incrementAndGet();
        zzif zza = zzig.zza(context, new zzlg[]{zznvVar, zzaiiVar}, zzadfVar, zzchdVar, zzaen.zza(context), zzaht.zzk());
        this.zzl = zza;
        zza.zzd(this);
        this.zzp = 0;
        this.zzr = 0L;
        this.zzq = 0;
        this.zzu = new ArrayList<>();
        this.zzv = null;
        this.zzs = (zzceuVar == null || zzceuVar.zzn() == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzceuVar.zzn();
        this.zzt = zzceuVar != null ? zzceuVar.zzp() : 0;
        final String zze = com.google.android.gms.ads.internal.zzs.zzc().zze(context, zzceuVar.zzt().zza);
        if (!this.zzn || this.zzm.limit() <= 0) {
            final boolean z = (((Boolean) zzbba.zzc().zzb(zzbfq.zzbm)).booleanValue() && ((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue()) || !zzcetVar.zzj;
            if (zzcetVar.zzi > 0) {
                zzaeeVar = new zzaee(this, zze, z) { // from class: com.google.android.gms.internal.ads.zzchk
                    private final zzchr zza;
                    private final String zzb;
                    private final boolean zzc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zze;
                        this.zzc = z;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaee
                    public final zzaef zza() {
                        return this.zza.zzS(this.zzb, this.zzc);
                    }
                };
            } else {
                zzaeeVar = new zzaee(this, zze, z) { // from class: com.google.android.gms.internal.ads.zzchl
                    private final zzchr zza;
                    private final String zzb;
                    private final boolean zzc;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                        this.zzb = zze;
                        this.zzc = z;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaee
                    public final zzaef zza() {
                        return this.zza.zzR(this.zzb, this.zzc);
                    }
                };
            }
            zzaeeVar = zzcetVar.zzj ? new zzaee(this, zzaeeVar) { // from class: com.google.android.gms.internal.ads.zzchm
                private final zzchr zza;
                private final zzaee zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = zzaeeVar;
                }

                @Override // com.google.android.gms.internal.ads.zzaee
                public final zzaef zza() {
                    return this.zza.zzn(this.zzb);
                }
            } : zzaeeVar;
            ByteBuffer byteBuffer = this.zzm;
            if (byteBuffer != null && byteBuffer.limit() > 0) {
                final byte[] bArr = new byte[this.zzm.limit()];
                this.zzm.get(bArr);
                zzaeeVar = new zzaee(zzaeeVar, bArr) { // from class: com.google.android.gms.internal.ads.zzchn
                    private final zzaee zza;
                    private final byte[] zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzaeeVar;
                        this.zzb = bArr;
                    }

                    @Override // com.google.android.gms.internal.ads.zzaee
                    public final zzaef zza() {
                        zzaee zzaeeVar2 = this.zza;
                        byte[] bArr2 = this.zzb;
                        int i = zzchr.zzc;
                        return new zzchh(new zzadz(bArr2), bArr2.length, zzaeeVar2.zza());
                    }
                };
            }
        } else {
            final byte[] bArr2 = new byte[this.zzm.limit()];
            this.zzm.get(bArr2);
            zzaeeVar = new zzaee(bArr2) { // from class: com.google.android.gms.internal.ads.zzchj
                private final byte[] zza;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = bArr2;
                }

                @Override // com.google.android.gms.internal.ads.zzaee
                public final zzaef zza() {
                    return new zzadz(this.zza);
                }
            };
        }
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzm)).booleanValue()) {
            zzpxVar = zzcho.zza;
        } else {
            zzpxVar = zzchp.zza;
        }
        this.zzk = new zzabn(zzaeeVar, zzpxVar);
    }

    private final boolean zzT() {
        return this.zzv != null && this.zzv.zzl();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("OfficialExoPlayerAdapter finalize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final boolean zzA() {
        return this.zzl != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final int zzB() {
        return this.zzl.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzC() {
        return this.zzl.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final boolean zzD() {
        return this.zzl.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzE(boolean z) {
        this.zzl.zzg(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzF(int i) {
        this.zze.zzf(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzG(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzH() {
        return this.zzl.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzI() {
        if (zzT()) {
            return 0L;
        }
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzJ() {
        if (zzT() && this.zzv.zzm()) {
            return Math.min(this.zzp, this.zzv.zzo());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzK() {
        if (!zzT()) {
            while (!this.zzu.isEmpty()) {
                long j = this.zzr;
                Map<String, List<String>> zze = this.zzu.remove(0).zze();
                long j2 = 0;
                if (zze != null) {
                    Iterator<Map.Entry<String, List<String>>> it = zze.entrySet().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Map.Entry<String, List<String>> next = it.next();
                        if (next != null) {
                            try {
                                if (next.getKey() != null && zzfea.zza("content-length", next.getKey()) && next.getValue() != null && next.getValue().get(0) != null) {
                                    j2 = Long.parseLong(next.getValue().get(0));
                                    break;
                                }
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                }
                this.zzr = j + j2;
            }
            return this.zzr;
        }
        return this.zzv.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final int zzL() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzM(boolean z) {
        if (this.zzl == null) {
            return;
        }
        int i = 0;
        while (true) {
            this.zzl.zza();
            if (i >= 2) {
                return;
            }
            zzadf zzadfVar = this.zzh;
            zzada zzd = zzadfVar.zzb().zzd();
            zzd.zza(i, !z);
            zzadfVar.zza(zzd.zzb());
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzN() {
        return this.zzl.zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzO() {
        return this.zzp;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaef zzR(String str, boolean z) {
        zzaer zzaerVar = new zzaer();
        zzaerVar.zzb(str);
        zzaerVar.zzf(true != z ? null : this);
        zzaerVar.zzc(this.zzi.zzd);
        zzaerVar.zzd(this.zzi.zzf);
        zzaerVar.zze(true);
        return zzaerVar.zza();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaef zzS(String str, boolean z) {
        zzchr zzchrVar = true != z ? null : this;
        zzcet zzcetVar = this.zzi;
        zzchc zzchcVar = new zzchc(str, zzchrVar, zzcetVar.zzd, zzcetVar.zzf, zzcetVar.zzi);
        this.zzw.add(new WeakReference<>(zzchcVar));
        return zzchcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zza(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzb(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbr(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar, IOException iOException, boolean z) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            if (this.zzi.zzl) {
                zzcekVar.zzv("onLoadException", iOException);
            } else {
                zzcekVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbs(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbt(int i, zzaaj zzaajVar, zzaaa zzaaaVar, zzaaf zzaafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public final void zzbu(int i, zzaaj zzaajVar, zzaaf zzaafVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzc(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
        if (zzaefVar instanceof zzafb) {
            this.zzu.add((zzafb) zzaefVar);
        } else if (zzaefVar instanceof zzchg) {
            this.zzv = (zzchg) zzaefVar;
            final zzceu zzceuVar = this.zzj.get();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() && zzceuVar != null && this.zzv.zzk()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzv.zzm()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzv.zzn()));
                com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(zzceuVar, hashMap) { // from class: com.google.android.gms.internal.ads.zzchi
                    private final zzceu zza;
                    private final Map zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzceuVar;
                        this.zzb = hashMap;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zzceu zzceuVar2 = this.zza;
                        Map<String, ?> map = this.zzb;
                        int i = zzchr.zzc;
                        zzceuVar2.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zzd(zzaef zzaefVar, zzaej zzaejVar, boolean z, int i) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzafp
    public final void zze(zzaef zzaefVar, zzaej zzaejVar, boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final void zzf(int i) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            zzcekVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzky
    public final void zzg(zzid zzidVar) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            zzcekVar.zzu("onPlayerError", zzidVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzmt
    public final void zzh(zzjq zzjqVar, zzom zzomVar) {
        zzceu zzceuVar = this.zzj.get();
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() || zzceuVar == null || zzjqVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzjqVar.zzk);
        hashMap.put("audioSampleMime", zzjqVar.zzl);
        hashMap.put("audioCodec", zzjqVar.zzi);
        zzceuVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    public final void zzi(zzjq zzjqVar, zzom zzomVar) {
        zzceu zzceuVar = this.zzj.get();
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() || zzceuVar == null || zzjqVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzjqVar.zzs));
        hashMap.put("bitRate", String.valueOf(zzjqVar.zzh));
        int i = zzjqVar.zzq;
        int i2 = zzjqVar.zzr;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", zzjqVar.zzk);
        hashMap.put("videoSampleMime", zzjqVar.zzl);
        hashMap.put("videoCodec", zzjqVar.zzi);
        zzceuVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    public final void zzj(int i, long j) {
        this.zzq += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    public final void zzk(int i, int i2, int i3, float f) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            zzcekVar.zzt(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaiy
    public final void zzl(Surface surface) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            zzcekVar.zzC();
        }
    }

    final zzaal zzm(Uri uri) {
        zzjw zzjwVar = new zzjw();
        zzjwVar.zzb(uri);
        zzkd zzc2 = zzjwVar.zzc();
        zzabn zzabnVar = this.zzk;
        zzabnVar.zza(this.zzi.zzg);
        zzabo zzb = zzabnVar.zzb(zzc2);
        zzb.zzk(com.google.android.gms.ads.internal.util.zzr.zza, this);
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaef zzn(zzaee zzaeeVar) {
        return new zzchg(this.zzd, zzaeeVar.zza(), this.zzs, this.zzt, this, new zzchf(this) { // from class: com.google.android.gms.internal.ads.zzchq
            private final zzchr zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzchf
            public final void zza(boolean z, long j) {
                this.zza.zzo(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(boolean z, long j) {
        zzcek zzcekVar = this.zzo;
        if (zzcekVar != null) {
            zzcekVar.zzr(z, j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzr(zzcek zzcekVar) {
        this.zzo = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzs() {
        zzif zzifVar = this.zzl;
        if (zzifVar != null) {
            zzifVar.zze(this);
            this.zzl.zzk();
            this.zzl = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzt(Surface surface, boolean z) throws IOException {
        zzif zzifVar = this.zzl;
        if (zzifVar == null) {
            return;
        }
        zzld zzc2 = zzifVar.zzc(this.zzf);
        zzc2.zzb(1);
        zzc2.zzd(surface);
        zzc2.zzg();
        if (z) {
            try {
                zzc2.zzj();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("Google3ExoPlayerAdapter InterruptedException for MSG_SET_SURFACE message.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzu(float f, boolean z) throws IOException {
        zzif zzifVar = this.zzl;
        if (zzifVar == null) {
            return;
        }
        zzld zzc2 = zzifVar.zzc(this.zzg);
        zzc2.zzb(1);
        zzc2.zzd(Float.valueOf(f));
        zzc2.zzg();
        if (z) {
            try {
                zzc2.zzj();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("Google3ExoPlayerAdapter InterruptedException for MSG_SET_VOLUME message.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzv() {
        ((zzhu) this.zzl).zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzw(long j) {
        zzhu zzhuVar = (zzhu) this.zzl;
        zzhuVar.zzi(zzhuVar.zzl(), j);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzx(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzy(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzz(int i) {
        for (WeakReference<zzchc> weakReference : this.zzw) {
            zzchc zzchcVar = weakReference.get();
            if (zzchcVar != null) {
                zzchcVar.zzk(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaal zzaazVar;
        if (this.zzl == null) {
            return;
        }
        this.zzm = byteBuffer;
        this.zzn = z;
        int length = uriArr.length;
        if (length == 1) {
            zzaazVar = zzm(uriArr[0]);
        } else {
            zzaal[] zzaalVarArr = new zzaal[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzaalVarArr[i] = zzm(uriArr[i]);
            }
            zzaazVar = new zzaaz(false, false, zzaalVarArr);
        }
        this.zzl.zzb(zzaazVar);
        zzb.incrementAndGet();
    }
}

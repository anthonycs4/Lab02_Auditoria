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
public final class zzcgb extends zzcel implements zzaqt, zzaor, zzasd, zzakq, zzajg {
    public static final /* synthetic */ int zzc = 0;
    private final Context zzd;
    private final zzcfr zze;
    private final zzajy zzf;
    private final zzajy zzg;
    private final zzapv zzh;
    private final zzcet zzi;
    private zzajj zzj;
    private ByteBuffer zzk;
    private boolean zzl;
    private final WeakReference<zzceu> zzm;
    private zzcek zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private final String zzr;
    private final int zzs;
    private final ArrayList<zzaqn> zzt;
    private volatile zzcfq zzu;
    private final Set<WeakReference<zzcfn>> zzv = new HashSet();

    public zzcgb(Context context, zzcet zzcetVar, zzceu zzceuVar) {
        this.zzd = context;
        this.zzi = zzcetVar;
        this.zzm = new WeakReference<>(zzceuVar);
        zzcfr zzcfrVar = new zzcfr();
        this.zze = zzcfrVar;
        zzars zzarsVar = new zzars(context, zzanp.zza, 0L, com.google.android.gms.ads.internal.util.zzr.zza, this, -1);
        this.zzf = zzarsVar;
        zzald zzaldVar = new zzald(zzanp.zza, null, true, com.google.android.gms.ads.internal.util.zzr.zza, this);
        this.zzg = zzaldVar;
        zzapr zzaprVar = new zzapr(null);
        this.zzh = zzaprVar;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("ForkedExoPlayerAdapter initialize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        zza.incrementAndGet();
        zzajj zza = zzajk.zza(new zzajy[]{zzaldVar, zzarsVar}, zzaprVar, zzcfrVar);
        this.zzj = zza;
        zza.zza(this);
        this.zzo = 0;
        this.zzq = 0L;
        this.zzp = 0;
        this.zzt = new ArrayList<>();
        this.zzu = null;
        this.zzr = (zzceuVar == null || zzceuVar.zzn() == null) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzceuVar.zzn();
        this.zzs = zzceuVar != null ? zzceuVar.zzp() : 0;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzn)).booleanValue()) {
            this.zzj.zzo();
        }
        if (zzceuVar != null && zzceuVar.zzD() > 0) {
            this.zzj.zzp(zzceuVar.zzD());
        }
        if (zzceuVar == null || zzceuVar.zzE() <= 0) {
            return;
        }
        this.zzj.zzq(zzceuVar.zzE());
    }

    private final boolean zzY() {
        return this.zzu != null && this.zzu.zzf();
    }

    public final void finalize() throws Throwable {
        zza.decrementAndGet();
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("ForkedExoPlayerAdapter finalize ");
            sb.append(valueOf);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final boolean zzA() {
        return this.zzj != null;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final int zzB() {
        return this.zzj.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzC() {
        return this.zzj.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final boolean zzD() {
        return this.zzj.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzE(boolean z) {
        this.zzj.zze(z);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzF(int i) {
        this.zze.zzg(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzG(int i) {
        this.zze.zzh(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzH() {
        return this.zzj.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzI() {
        if (zzY()) {
            return 0L;
        }
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzJ() {
        if (zzY() && this.zzu.zzg()) {
            return Math.min(this.zzo, this.zzu.zzi());
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzK() {
        if (!zzY()) {
            while (!this.zzt.isEmpty()) {
                long j = this.zzq;
                Map<String, List<String>> zze = this.zzt.remove(0).zze();
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
                this.zzq = j + j2;
            }
            return this.zzq;
        }
        return this.zzu.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final int zzL() {
        return this.zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzM(boolean z) {
        if (this.zzj != null) {
            for (int i = 0; i < 2; i++) {
                this.zzh.zzc(i, !z);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzN() {
        return this.zzj.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final long zzO() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    /* renamed from: zzR */
    public final void zzj(zzaqe zzaqeVar, zzaqg zzaqgVar) {
        if (zzaqeVar instanceof zzaqn) {
            this.zzt.add((zzaqn) zzaqeVar);
        } else if (zzaqeVar instanceof zzcfq) {
            this.zzu = (zzcfq) zzaqeVar;
            final zzceu zzceuVar = this.zzm.get();
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() && zzceuVar != null && this.zzu.zze()) {
                final HashMap hashMap = new HashMap();
                hashMap.put("gcacheHit", String.valueOf(this.zzu.zzg()));
                hashMap.put("gcacheDownloaded", String.valueOf(this.zzu.zzh()));
                com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(zzceuVar, hashMap) { // from class: com.google.android.gms.internal.ads.zzcfs
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
                        int i = zzcgb.zzc;
                        zzceuVar2.zze("onGcacheInfoEvent", map);
                    }
                });
            }
        }
    }

    public final void zzS(zzaqe zzaqeVar, int i) {
        this.zzo += i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0045, code lost:
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbba.zzc().zzb(com.google.android.gms.internal.ads.zzbfq.zzbj)).booleanValue() == false) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final com.google.android.gms.internal.ads.zzaow zzT(android.net.Uri r11, final java.lang.String r12) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzaos r9 = new com.google.android.gms.internal.ads.zzaos
            boolean r0 = r10.zzl
            if (r0 == 0) goto L22
            java.nio.ByteBuffer r0 = r10.zzk
            int r0 = r0.limit()
            if (r0 <= 0) goto L22
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r0 = r10.zzk
            r0.get(r12)
            com.google.android.gms.internal.ads.zzcft r0 = new com.google.android.gms.internal.ads.zzcft
            r0.<init>(r12)
        L20:
            r2 = r0
            goto L89
        L22:
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbfq.zzbm
            com.google.android.gms.internal.ads.zzbfo r1 = com.google.android.gms.internal.ads.zzbba.zzc()
            java.lang.Object r0 = r1.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 1
            if (r0 == 0) goto L47
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.zzbfq.zzbj
            com.google.android.gms.internal.ads.zzbfo r2 = com.google.android.gms.internal.ads.zzbba.zzc()
            java.lang.Object r0 = r2.zzb(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4f
        L47:
            com.google.android.gms.internal.ads.zzcet r0 = r10.zzi
            boolean r0 = r0.zzj
            if (r0 != 0) goto L4e
            goto L4f
        L4e:
            r1 = 0
        L4f:
            com.google.android.gms.internal.ads.zzcet r0 = r10.zzi
            int r0 = r0.zzi
            if (r0 <= 0) goto L5b
            com.google.android.gms.internal.ads.zzcfu r0 = new com.google.android.gms.internal.ads.zzcfu
            r0.<init>(r10, r12, r1)
            goto L60
        L5b:
            com.google.android.gms.internal.ads.zzcfv r0 = new com.google.android.gms.internal.ads.zzcfv
            r0.<init>(r10, r12, r1)
        L60:
            com.google.android.gms.internal.ads.zzcet r12 = r10.zzi
            boolean r12 = r12.zzj
            if (r12 == 0) goto L6c
            com.google.android.gms.internal.ads.zzcfw r12 = new com.google.android.gms.internal.ads.zzcfw
            r12.<init>(r10, r0)
            r0 = r12
        L6c:
            java.nio.ByteBuffer r12 = r10.zzk
            if (r12 == 0) goto L20
            int r12 = r12.limit()
            if (r12 <= 0) goto L20
            java.nio.ByteBuffer r12 = r10.zzk
            int r12 = r12.limit()
            byte[] r12 = new byte[r12]
            java.nio.ByteBuffer r1 = r10.zzk
            r1.get(r12)
            com.google.android.gms.internal.ads.zzcfx r1 = new com.google.android.gms.internal.ads.zzcfx
            r1.<init>(r0, r12)
            r2 = r1
        L89:
            com.google.android.gms.internal.ads.zzbfi<java.lang.Boolean> r12 = com.google.android.gms.internal.ads.zzbfq.zzm
            com.google.android.gms.internal.ads.zzbfo r0 = com.google.android.gms.internal.ads.zzbba.zzc()
            java.lang.Object r12 = r0.zzb(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            com.google.android.gms.internal.ads.zzalw r12 = com.google.android.gms.internal.ads.zzcfy.zza
            goto La0
        L9e:
            com.google.android.gms.internal.ads.zzalw r12 = com.google.android.gms.internal.ads.zzcfz.zza
        La0:
            r3 = r12
            com.google.android.gms.internal.ads.zzcet r12 = r10.zzi
            int r4 = r12.zzk
            com.google.android.gms.internal.ads.zzfdx r5 = com.google.android.gms.ads.internal.util.zzr.zza
            r7 = 0
            com.google.android.gms.internal.ads.zzcet r12 = r10.zzi
            int r8 = r12.zzg
            r0 = r9
            r1 = r11
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgb.zzT(android.net.Uri, java.lang.String):com.google.android.gms.internal.ads.zzaow");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaqe zzU(zzaqd zzaqdVar) {
        return new zzcfq(this.zzd, zzaqdVar.zza(), this.zzr, this.zzs, this, new zzcfp(this) { // from class: com.google.android.gms.internal.ads.zzcga
            private final zzcgb zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // com.google.android.gms.internal.ads.zzcfp
            public final void zza(boolean z, long j) {
                this.zza.zzV(z, j);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzV(boolean z, long j) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            zzcekVar.zzr(z, j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaqe zzW(String str, boolean z) {
        zzcgb zzcgbVar = true != z ? null : this;
        zzcet zzcetVar = this.zzi;
        return new zzaqi(str, null, zzcgbVar, zzcetVar.zzd, zzcetVar.zzf, true, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzaqe zzX(String str, boolean z) {
        zzcgb zzcgbVar = true != z ? null : this;
        zzcet zzcetVar = this.zzi;
        zzcfn zzcfnVar = new zzcfn(str, zzcgbVar, zzcetVar.zzd, zzcetVar.zzf, zzcetVar.zzi);
        this.zzv.add(new WeakReference<>(zzcfnVar));
        return zzcfnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zza(zzake zzakeVar, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzb(zzapl zzaplVar, zzapx zzapxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzd(boolean z, int i) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            zzcekVar.zzs(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zze(zzajf zzajfVar) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            zzcekVar.zzu("onPlayerError", zzajfVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzajg
    public final void zzg(zzajx zzajxVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzakq
    public final void zzh(zzajt zzajtVar) {
        zzceu zzceuVar = this.zzm.get();
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() || zzceuVar == null || zzajtVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("audioMime", zzajtVar.zze);
        hashMap.put("audioSampleMime", zzajtVar.zzf);
        hashMap.put("audioCodec", zzajtVar.zzc);
        zzceuVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzaor
    public final void zzi(IOException iOException) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            if (this.zzi.zzl) {
                zzcekVar.zzv("onLoadException", iOException);
            } else {
                zzcekVar.zzu("onLoadError", iOException);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final /* bridge */ /* synthetic */ void zzk(Object obj, int i) {
        this.zzo += i;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final void zzl(zzajt zzajtVar) {
        zzceu zzceuVar = this.zzm.get();
        if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzbj)).booleanValue() || zzceuVar == null || zzajtVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("frameRate", String.valueOf(zzajtVar.zzl));
        hashMap.put("bitRate", String.valueOf(zzajtVar.zzb));
        int i = zzajtVar.zzj;
        int i2 = zzajtVar.zzk;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        hashMap.put("resolution", sb.toString());
        hashMap.put("videoMime", zzajtVar.zze);
        hashMap.put("videoSampleMime", zzajtVar.zzf);
        hashMap.put("videoCodec", zzajtVar.zzc);
        zzceuVar.zze("onMetadataEvent", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final void zzm(int i, long j) {
        this.zzp += i;
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final void zzn(int i, int i2, int i3, float f) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            zzcekVar.zzt(i, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzasd
    public final void zzo(Surface surface) {
        zzcek zzcekVar = this.zzn;
        if (zzcekVar != null) {
            zzcekVar.zzC();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzp(Uri[] uriArr, String str) {
        zzq(uriArr, str, ByteBuffer.allocate(0), false);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzr(zzcek zzcekVar) {
        this.zzn = zzcekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzs() {
        zzajj zzajjVar = this.zzj;
        if (zzajjVar != null) {
            zzajjVar.zzb(this);
            this.zzj.zzi();
            this.zzj = null;
            zzb.decrementAndGet();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzt(Surface surface, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzaji zzajiVar = new zzaji(this.zzf, 1, surface);
        if (z) {
            this.zzj.zzk(zzajiVar);
        } else {
            this.zzj.zzj(zzajiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzu(float f, boolean z) {
        if (this.zzj == null) {
            return;
        }
        zzaji zzajiVar = new zzaji(this.zzg, 2, Float.valueOf(f));
        if (z) {
            this.zzj.zzk(zzajiVar);
        } else {
            this.zzj.zzj(zzajiVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzv() {
        this.zzj.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzw(long j) {
        this.zzj.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzx(int i) {
        this.zze.zzi(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzy(int i) {
        this.zze.zzj(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzz(int i) {
        for (WeakReference<zzcfn> weakReference : this.zzv) {
            zzcfn zzcfnVar = weakReference.get();
            if (zzcfnVar != null) {
                zzcfnVar.zzf(i);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcel
    public final void zzq(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        zzaow zzapaVar;
        if (this.zzj == null) {
            return;
        }
        this.zzk = byteBuffer;
        this.zzl = z;
        int length = uriArr.length;
        if (length == 1) {
            zzapaVar = zzT(uriArr[0], str);
        } else {
            zzaow[] zzaowVarArr = new zzaow[length];
            for (int i = 0; i < uriArr.length; i++) {
                zzaowVarArr[i] = zzT(uriArr[i], str);
            }
            zzapaVar = new zzapa(zzaowVarArr);
        }
        this.zzj.zzd(zzapaVar);
        zzb.incrementAndGet();
    }
}

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.nio.ByteBuffer;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgy extends zzcgs implements zzaqt<zzaqe> {
    private String zzd;
    private final zzcet zze;
    private boolean zzf;
    private final zzcgx zzg;
    private final zzcge zzh;
    private ByteBuffer zzi;
    private boolean zzj;
    private final Object zzk;
    private final String zzl;
    private final int zzm;
    private boolean zzn;

    public zzcgy(zzceu zzceuVar, zzcet zzcetVar) {
        super(zzceuVar);
        this.zze = zzcetVar;
        this.zzg = new zzcgx();
        this.zzh = new zzcge();
        this.zzk = new Object();
        this.zzl = zzceuVar != null ? zzceuVar.zzn() : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzm = zzceuVar != null ? zzceuVar.zzp() : 0;
    }

    protected static final String zzs(String str) {
        String valueOf = String.valueOf(zzccg.zzd(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    private final void zzt() {
        int zza = (int) this.zzg.zza();
        int zza2 = (int) this.zzh.zza(this.zzi);
        int position = this.zzi.position();
        int round = Math.round(zza2 * (position / zza));
        boolean z = round > 0;
        int zzP = zzcel.zzP();
        int zzQ = zzcel.zzQ();
        String str = this.zzd;
        zzi(str, zzs(str), position, zza, round, zza2, z, zzP, zzQ);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a5, code lost:
        r26.zzn = true;
        zzm(r27, r11, (int) r26.zzh.zza(r26.zzi));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d6, code lost:
        return true;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:? -> B:45:0x0143). Please submit an issue!!! */
    @Override // com.google.android.gms.internal.ads.zzcgs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcgy.zza(java.lang.String):boolean");
    }

    @Override // com.google.android.gms.internal.ads.zzcgs
    public final void zzg() {
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final /* bridge */ /* synthetic */ void zzj(zzaqe zzaqeVar, zzaqg zzaqgVar) {
        this.zzg.zzb((zzaqi) zzaqeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final /* bridge */ /* synthetic */ void zzk(zzaqe zzaqeVar, int i) {
    }

    public final String zzp() {
        return this.zzd;
    }

    public final boolean zzq() {
        return this.zzn;
    }

    public final ByteBuffer zzr() {
        synchronized (this.zzk) {
            ByteBuffer byteBuffer = this.zzi;
            if (byteBuffer != null && !this.zzj) {
                byteBuffer.flip();
                this.zzj = true;
            }
            this.zzf = true;
        }
        return this.zzi;
    }
}

package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzaac extends zzzx {
    public static final Object zzd = new Object();
    private final Object zze;
    private final Object zzf;

    private zzaac(zzlq zzlqVar, Object obj, Object obj2) {
        super(zzlqVar);
        this.zze = obj;
        this.zzf = obj2;
    }

    public static zzaac zzj(zzkd zzkdVar) {
        return new zzaac(new zzaad(zzkdVar), zzlp.zza, zzd);
    }

    public static zzaac zzk(zzlq zzlqVar, Object obj, Object obj2) {
        return new zzaac(zzlqVar, obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object zzm(zzaac zzaacVar) {
        return zzaacVar.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzzx, com.google.android.gms.internal.ads.zzlq
    public final zzlp zze(int i, zzlp zzlpVar, long j) {
        this.zzc.zze(i, zzlpVar, j);
        if (zzaht.zzc(zzlpVar.zzb, this.zze)) {
            zzlpVar.zzb = zzlp.zza;
        }
        return zzlpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzx, com.google.android.gms.internal.ads.zzlq
    public final zzln zzg(int i, zzln zzlnVar, boolean z) {
        this.zzc.zzg(i, zzlnVar, z);
        if (zzaht.zzc(zzlnVar.zzb, this.zzf) && z) {
            zzlnVar.zzb = zzd;
        }
        return zzlnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzzx, com.google.android.gms.internal.ads.zzlq
    public final int zzh(Object obj) {
        Object obj2;
        zzlq zzlqVar = this.zzc;
        if (zzd.equals(obj) && (obj2 = this.zzf) != null) {
            obj = obj2;
        }
        return zzlqVar.zzh(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzzx, com.google.android.gms.internal.ads.zzlq
    public final Object zzi(int i) {
        Object zzi = this.zzc.zzi(i);
        return zzaht.zzc(zzi, this.zzf) ? zzd : zzi;
    }

    public final zzaac zzl(zzlq zzlqVar) {
        return new zzaac(zzlqVar, this.zze, this.zzf);
    }
}

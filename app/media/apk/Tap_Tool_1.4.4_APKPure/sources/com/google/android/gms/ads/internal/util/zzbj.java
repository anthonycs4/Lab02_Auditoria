package com.google.android.gms.ads.internal.util;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbj implements com.google.android.gms.internal.ads.zzag {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbm zzb;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(zzbp zzbpVar, String str, zzbm zzbmVar) {
        this.zza = str;
        this.zzb = zzbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzag
    public final void zza(com.google.android.gms.internal.ads.zzal zzalVar) {
        String str = this.zza;
        String zzalVar2 = zzalVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(zzalVar2).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(zzalVar2);
        zze.zzi(sb.toString());
        this.zzb.zza((zzbm) null);
    }
}

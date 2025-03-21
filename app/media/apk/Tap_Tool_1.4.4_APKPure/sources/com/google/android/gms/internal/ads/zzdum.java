package com.google.android.gms.internal.ads;

import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdum implements zzdun {
    private final Map<String, zzgeb<zzdun>> zza;
    private final zzflb zzb;
    private final zzcyx zzc;

    public zzdum(Map<String, zzgeb<zzdun>> map, zzflb zzflbVar, zzcyx zzcyxVar) {
        this.zza = map;
        this.zzb = zzflbVar;
        this.zzc = zzcyxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdun
    public final zzfla<zzete> zza(final zzbxf zzbxfVar) {
        this.zzc.zzj(zzbxfVar);
        zzfla<zzete> zzc = zzfks.zzc(new zzdsp(3));
        for (String str : ((String) zzbba.zzc().zzb(zzbfq.zzfw)).split(",")) {
            final zzgeb<zzdun> zzgebVar = this.zza.get(str.trim());
            if (zzgebVar != null) {
                zzc = zzfks.zzg(zzc, zzdsp.class, new zzfjz(zzgebVar, zzbxfVar) { // from class: com.google.android.gms.internal.ads.zzduk
                    private final zzgeb zza;
                    private final zzbxf zzb;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzgebVar;
                        this.zzb = zzbxfVar;
                    }

                    @Override // com.google.android.gms.internal.ads.zzfjz
                    public final zzfla zza(Object obj) {
                        zzgeb zzgebVar2 = this.zza;
                        zzdsp zzdspVar = (zzdsp) obj;
                        return ((zzdun) zzgebVar2.zzb()).zza(this.zzb);
                    }
                }, this.zzb);
            }
        }
        zzfks.zzp(zzc, new zzdul(this), zzccz.zzf);
        return zzc;
    }
}

package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
final class zzdtr implements zzfko<zzete> {
    final /* synthetic */ zzdts zza;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdtr(zzdts zzdtsVar) {
        this.zza = zzdtsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final void zza(Throwable th) {
        Pattern pattern;
        zzdws zzdwsVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue()) {
            pattern = zzdts.zzf;
            Matcher matcher = pattern.matcher(th.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                zzdwsVar = this.zza.zze;
                zzdwsVar.zza(Integer.parseInt(group));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfko
    public final /* bridge */ /* synthetic */ void zzb(zzete zzeteVar) {
        zzdws zzdwsVar;
        zzdws zzdwsVar2;
        zzete zzeteVar2 = zzeteVar;
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzer)).booleanValue()) {
            zzdwsVar = this.zza.zze;
            zzdwsVar.zza(zzeteVar2.zzb.zzb.zze);
            zzdwsVar2 = this.zza.zze;
            zzdwsVar2.zzc(zzeteVar2.zzb.zzb.zzf);
        }
    }
}

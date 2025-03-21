package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdlg implements zzblp<Object> {
    private final zzbjk zza;
    private final zzdlt zzb;
    private final zzgdk<zzdlc> zzc;

    public zzdlg(zzdhk zzdhkVar, zzdgz zzdgzVar, zzdlt zzdltVar, zzgdk<zzdlc> zzgdkVar) {
        this.zza = zzdhkVar.zzg(zzdgzVar.zzQ());
        this.zzb = zzdltVar;
        this.zzc = zzgdkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zza(Object obj, Map<String, String> map) {
        String str = map.get("asset");
        try {
            this.zza.zze(this.zzc.zzb(), str);
        } catch (RemoteException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40);
            sb.append("Failed to call onCustomClick for asset ");
            sb.append(str);
            sb.append(".");
            com.google.android.gms.ads.internal.util.zze.zzj(sb.toString(), e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzd("/nativeAdCustomClick", this);
    }
}

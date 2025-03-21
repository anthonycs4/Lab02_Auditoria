package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzcgi implements zzblp<zzceu> {
    @Override // com.google.android.gms.internal.ads.zzblp
    public final /* bridge */ /* synthetic */ void zza(zzceu zzceuVar, Map map) {
        zzceu zzceuVar2 = zzceuVar;
        zzcix zzh = zzceuVar2.zzh();
        if (zzh == null) {
            try {
                zzcix zzcixVar = new zzcix(zzceuVar2, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzceuVar2.zzx(zzcixVar);
                zzh = zzcixVar;
            } catch (NullPointerException e) {
                e = e;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.zze.zzg("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzs.zzg().zzg(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        int i = 0;
        if (parseInt >= 0 && parseInt <= 3) {
            i = parseInt;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
            sb.append("Video Meta GMSG: currentTime : ");
            sb.append(parseFloat2);
            sb.append(" , duration : ");
            sb.append(parseFloat);
            sb.append(" , isMuted : ");
            sb.append(equals);
            sb.append(" , playbackState : ");
            sb.append(i);
            sb.append(" , aspectRatio : ");
            sb.append(str);
            com.google.android.gms.ads.internal.util.zze.zzd(sb.toString());
        }
        zzh.zzs(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}

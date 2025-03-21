package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzeyk {
    private final zzebo zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final Context zze;
    private final zzetf zzf;
    private final Clock zzg;
    private final zzfb zzh;

    public zzeyk(zzebo zzeboVar, zzcct zzcctVar, String str, String str2, Context context, zzetf zzetfVar, Clock clock, zzfb zzfbVar) {
        this.zza = zzeboVar;
        this.zzb = zzcctVar.zza;
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = zzetfVar;
        this.zzg = clock;
        this.zzh = zzfbVar;
    }

    public static final List<String> zzd(int i, int i2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            StringBuilder sb = new StringBuilder(23);
            sb.append("2.");
            sb.append(i2);
            arrayList.add(zze(str, "@gw_mpe@", sb.toString()));
        }
        return arrayList;
    }

    private static String zze(String str, String str2, String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return str.replaceAll(str2, str3);
    }

    private static String zzf(String str) {
        return (TextUtils.isEmpty(str) || !zzccm.zzj()) ? str : "fakeForAdDebugLog";
    }

    public final List<String> zza(zzete zzeteVar, zzess zzessVar, List<String> list) {
        return zzb(zzeteVar, zzessVar, false, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, list);
    }

    public final List<String> zzb(zzete zzeteVar, zzess zzessVar, boolean z, String str, String str2, List<String> list) {
        ArrayList arrayList = new ArrayList();
        String str3 = true != z ? "0" : "1";
        for (String str4 : list) {
            String zze = zze(zze(zze(str4, "@gw_adlocid@", zzeteVar.zza.zza.zzf), "@gw_adnetrefresh@", str3), "@gw_sdkver@", this.zzb);
            if (zzessVar != null) {
                zze = zzcay.zza(zze(zze(zze(zze, "@gw_qdata@", zzessVar.zzx), "@gw_adnetid@", zzessVar.zzw), "@gw_allocid@", zzessVar.zzv), this.zze, zzessVar.zzQ);
            }
            String zze2 = zze(zze(zze(zze, "@gw_adnetstatus@", this.zza.zzb()), "@gw_seqnum@", this.zzc), "@gw_sessid@", this.zzd);
            boolean z2 = false;
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbT)).booleanValue() && !TextUtils.isEmpty(str)) {
                z2 = true;
            }
            boolean z3 = !TextUtils.isEmpty(str2);
            if (!z2) {
                if (z3) {
                    z3 = true;
                } else {
                    arrayList.add(zze2);
                }
            }
            if (this.zzh.zza(Uri.parse(zze2))) {
                Uri.Builder buildUpon = Uri.parse(zze2).buildUpon();
                if (z2) {
                    buildUpon = buildUpon.appendQueryParameter("ms", str);
                }
                if (z3) {
                    buildUpon = buildUpon.appendQueryParameter("attok", str2);
                }
                zze2 = buildUpon.build().toString();
            }
            arrayList.add(zze2);
        }
        return arrayList;
    }

    public final List<String> zzc(zzess zzessVar, List<String> list, zzbxv zzbxvVar) {
        ArrayList arrayList = new ArrayList();
        long currentTimeMillis = this.zzg.currentTimeMillis();
        try {
            String zzb = zzbxvVar.zzb();
            String num = Integer.toString(zzbxvVar.zzc());
            zzetf zzetfVar = this.zzf;
            String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
            String zzf = zzetfVar == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : zzf(zzetfVar.zza);
            zzetf zzetfVar2 = this.zzf;
            if (zzetfVar2 != null) {
                str = zzf(zzetfVar2.zzb);
            }
            for (String str2 : list) {
                arrayList.add(zzcay.zza(zze(zze(zze(zze(zze(zze(str2, "@gw_rwd_userid@", Uri.encode(zzf)), "@gw_rwd_custom_data@", Uri.encode(str)), "@gw_tmstmp@", Long.toString(currentTimeMillis)), "@gw_rwd_itm@", Uri.encode(zzb)), "@gw_rwd_amt@", num), "@gw_sdkver@", this.zzb), this.zze, zzessVar.zzQ));
            }
            return arrayList;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzg("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}

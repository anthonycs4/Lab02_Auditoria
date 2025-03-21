package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdwz {
    private static final SparseArray<zzaxx> zzh;
    private final Context zza;
    private final zzcvn zzb;
    private final TelephonyManager zzc;
    private final zzdws zzd;
    private final zzdwo zze;
    private final com.google.android.gms.ads.internal.util.zzg zzf;
    private zzawy zzg;

    static {
        SparseArray<zzaxx> sparseArray = new SparseArray<>();
        zzh = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzaxx.CONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.AUTHENTICATING.ordinal(), zzaxx.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzaxx.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzaxx.CONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzaxx.DISCONNECTING);
        sparseArray.put(NetworkInfo.DetailedState.BLOCKED.ordinal(), zzaxx.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzaxx.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzaxx.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzaxx.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzaxx.DISCONNECTED);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzaxx.SUSPENDED);
        if (Build.VERSION.SDK_INT >= 17) {
            sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzaxx.CONNECTING);
        }
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzaxx.CONNECTING);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwz(Context context, zzcvn zzcvnVar, zzdws zzdwsVar, zzdwo zzdwoVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = context;
        this.zzb = zzcvnVar;
        this.zzd = zzdwsVar;
        this.zze = zzdwoVar;
        this.zzc = (TelephonyManager) context.getSystemService("phone");
        this.zzf = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ zzaxo zzd(zzdwz zzdwzVar, Bundle bundle) {
        zzaxk zzaxkVar;
        zzaxh zzf = zzaxo.zzf();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        if (i == -1) {
            zzdwzVar.zzg = zzawy.ENUM_TRUE;
        } else {
            zzdwzVar.zzg = zzawy.ENUM_FALSE;
            if (i == 0) {
                zzf.zza(zzaxn.CELL);
            } else if (i == 1) {
                zzf.zza(zzaxn.WIFI);
            } else {
                zzf.zza(zzaxn.NETWORKTYPE_UNSPECIFIED);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    zzaxkVar = zzaxk.TWO_G;
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    zzaxkVar = zzaxk.THREE_G;
                    break;
                case 13:
                    zzaxkVar = zzaxk.LTE;
                    break;
                default:
                    zzaxkVar = zzaxk.CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                    break;
            }
            zzf.zzb(zzaxkVar);
        }
        return zzf.zzah();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ byte[] zzf(zzdwz zzdwzVar, boolean z, ArrayList arrayList, zzaxo zzaxoVar, zzaxx zzaxxVar) {
        zzaxs zzo = zzaxt.zzo();
        zzo.zze(arrayList);
        zzo.zzh(zzg(com.google.android.gms.ads.internal.zzs.zze().zzf(zzdwzVar.zza.getContentResolver()) != 0));
        zzo.zzi(com.google.android.gms.ads.internal.zzs.zze().zzq(zzdwzVar.zza, zzdwzVar.zzc));
        zzo.zzc(zzdwzVar.zzd.zzd());
        zzo.zzd(zzdwzVar.zzd.zzh());
        zzo.zzj(zzdwzVar.zzd.zzb());
        zzo.zzl(zzaxxVar);
        zzo.zzf(zzaxoVar);
        zzo.zzk(zzdwzVar.zzg);
        zzo.zzb(zzg(z));
        zzo.zza(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis());
        zzo.zzg(zzg(com.google.android.gms.ads.internal.zzs.zze().zze(zzdwzVar.zza.getContentResolver()) != 0));
        return zzo.zzah().zzao();
    }

    private static final zzawy zzg(boolean z) {
        return z ? zzawy.ENUM_TRUE : zzawy.ENUM_FALSE;
    }

    public final void zza(boolean z) {
        zzfks.zzp(this.zzb.zza(), new zzdwy(this, z), zzccz.zzf);
    }
}

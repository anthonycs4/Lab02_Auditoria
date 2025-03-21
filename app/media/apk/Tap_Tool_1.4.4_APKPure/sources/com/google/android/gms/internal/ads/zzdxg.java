package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxg {
    private final zzavg zza;
    private final Context zzb;
    private final zzdwo zzc;
    private final zzcct zzd;
    private final String zze;
    private final zzexv zzf;
    private final com.google.android.gms.ads.internal.util.zzg zzg = com.google.android.gms.ads.internal.zzs.zzg().zzl();

    public zzdxg(Context context, zzcct zzcctVar, zzavg zzavgVar, zzdwo zzdwoVar, String str, zzexv zzexvVar) {
        this.zzb = context;
        this.zzd = zzcctVar;
        this.zza = zzavgVar;
        this.zzc = zzdwoVar;
        this.zze = str;
        this.zzf = zzexvVar;
    }

    private static final void zzc(SQLiteDatabase sQLiteDatabase, ArrayList<zzaxt> arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            zzaxt zzaxtVar = arrayList.get(i);
            if (zzaxtVar.zzc() == zzawy.ENUM_TRUE && zzaxtVar.zza() > j) {
                j = zzaxtVar.zza();
            }
        }
        if (j != 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(j));
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
        }
    }

    public final void zza(final boolean z) {
        try {
            this.zzc.zza(new zzewp(this, z) { // from class: com.google.android.gms.internal.ads.zzdxc
                private final zzdxg zza;
                private final boolean zzb;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zza = this;
                    this.zzb = z;
                }

                @Override // com.google.android.gms.internal.ads.zzewp
                public final Object zza(Object obj) {
                    this.zza.zzb(this.zzb, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            com.google.android.gms.ads.internal.util.zze.zzf(valueOf.length() != 0 ? "Error in offline signals database startup: ".concat(valueOf) : new String("Error in offline signals database startup: "));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzb(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (!z) {
            if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfN)).booleanValue()) {
                ArrayList<zzaxt> zza = zzdxb.zza(sQLiteDatabase);
                zzaxu zza2 = zzaxy.zza();
                zza2.zze(this.zzb.getPackageName());
                zza2.zzf(Build.MODEL);
                zza2.zzb(zzdxb.zzb(sQLiteDatabase, 0));
                zza2.zza(zza);
                zza2.zzc(zzdxb.zzb(sQLiteDatabase, 1));
                zza2.zzd(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis());
                zza2.zzg(zzdxb.zzc(sQLiteDatabase, 2));
                final zzaxy zzah = zza2.zzah();
                zzc(sQLiteDatabase, zza);
                this.zza.zzc(new zzavf(zzah) { // from class: com.google.android.gms.internal.ads.zzdxd
                    private final zzaxy zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzah;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavf
                    public final void zza(zzawz zzawzVar) {
                        zzawzVar.zzi(this.zza);
                    }
                });
                zzayj zza3 = zzayk.zza();
                zza3.zza(this.zzd.zzb);
                zza3.zzb(this.zzd.zzc);
                zza3.zzc(true == this.zzd.zzd ? 0 : 2);
                final zzayk zzah2 = zza3.zzah();
                this.zza.zzc(new zzavf(zzah2) { // from class: com.google.android.gms.internal.ads.zzdxe
                    private final zzayk zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = zzah2;
                    }

                    @Override // com.google.android.gms.internal.ads.zzavf
                    public final void zza(zzawz zzawzVar) {
                        zzayk zzaykVar = this.zza;
                        zzawp zzau = zzawzVar.zze().zzau();
                        zzau.zzb(zzaykVar);
                        zzawzVar.zzf(zzau);
                    }
                });
                this.zza.zzb(zzavi.OFFLINE_UPLOAD);
            } else {
                zzexu zza4 = zzexu.zza("oa_upload");
                zza4.zzc("oa_failed_reqs", String.valueOf(zzdxb.zzb(sQLiteDatabase, 0)));
                zza4.zzc("oa_total_reqs", String.valueOf(zzdxb.zzb(sQLiteDatabase, 1)));
                zza4.zzc("oa_upload_time", String.valueOf(com.google.android.gms.ads.internal.zzs.zzj().currentTimeMillis()));
                zza4.zzc("oa_last_successful_time", String.valueOf(zzdxb.zzc(sQLiteDatabase, 2)));
                zza4.zzc("oa_session_id", this.zzg.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zze);
                this.zzf.zza(zza4);
                ArrayList<zzaxt> zza5 = zzdxb.zza(sQLiteDatabase);
                zzc(sQLiteDatabase, zza5);
                int size = zza5.size();
                for (int i = 0; i < size; i++) {
                    zzaxt zzaxtVar = zza5.get(i);
                    zzexu zza6 = zzexu.zza("oa_signals");
                    zza6.zzc("oa_session_id", this.zzg.zzB() ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zze);
                    zzaxo zzg = zzaxtVar.zzg();
                    String valueOf = zzg.zza() ? String.valueOf(zzg.zzc().zza()) : "-1";
                    String obj = zzfhr.zzb(zzaxtVar.zzf(), zzdxf.zza).toString();
                    zza6.zzc("oa_sig_ts", String.valueOf(zzaxtVar.zza()));
                    zza6.zzc("oa_sig_status", String.valueOf(zzaxtVar.zzc().zza()));
                    zza6.zzc("oa_sig_resp_lat", String.valueOf(zzaxtVar.zzd()));
                    zza6.zzc("oa_sig_render_lat", String.valueOf(zzaxtVar.zze()));
                    zza6.zzc("oa_sig_formats", obj);
                    zza6.zzc("oa_sig_nw_type", valueOf);
                    zza6.zzc("oa_sig_wifi", String.valueOf(zzaxtVar.zzh().zza()));
                    zza6.zzc("oa_sig_airplane", String.valueOf(zzaxtVar.zzi().zza()));
                    zza6.zzc("oa_sig_data", String.valueOf(zzaxtVar.zzj().zza()));
                    zza6.zzc("oa_sig_nw_resp", String.valueOf(zzaxtVar.zzk()));
                    zza6.zzc("oa_sig_offline", String.valueOf(zzaxtVar.zzl().zza()));
                    zza6.zzc("oa_sig_nw_state", String.valueOf(zzaxtVar.zzm().zza()));
                    if (zzg.zzd() && zzg.zza() && zzg.zzc().equals(zzaxn.CELL)) {
                        zza6.zzc("oa_sig_cell_type", String.valueOf(zzg.zze().zza()));
                    }
                    this.zzf.zza(zza6);
                }
            }
            sQLiteDatabase.delete("offline_signal_contents", null, null);
            ContentValues contentValues = new ContentValues();
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{"failed_requests"});
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, (Integer) 0);
            sQLiteDatabase.update("offline_signal_statistics", contentValues2, "statistic_name = ?", new String[]{"total_requests"});
        } else {
            this.zzb.deleteDatabase("OfflineUpload.db");
        }
        return null;
    }
}

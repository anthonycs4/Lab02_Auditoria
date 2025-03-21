package com.google.android.gms.internal.ads;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxb {
    public static ArrayList<zzaxt> zza(SQLiteDatabase sQLiteDatabase) {
        ArrayList<zzaxt> arrayList = new ArrayList<>();
        Cursor query = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(zzaxt.zzn(query.getBlob(query.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (zzfyy e) {
                com.google.android.gms.ads.internal.util.zze.zzf("Unable to deserialize proto from offline signals database:");
                com.google.android.gms.ads.internal.util.zze.zzf(e.getMessage());
            }
        }
        query.close();
        return arrayList;
    }

    public static int zzb(SQLiteDatabase sQLiteDatabase, int i) {
        int i2;
        Cursor zzd = zzd(sQLiteDatabase, i);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            i2 = zzd.getInt(zzd.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            i2 = 0;
        }
        zzd.close();
        return i2;
    }

    public static long zzc(SQLiteDatabase sQLiteDatabase, int i) {
        long j;
        Cursor zzd = zzd(sQLiteDatabase, 2);
        if (zzd.getCount() > 0) {
            zzd.moveToNext();
            j = zzd.getLong(zzd.getColumnIndexOrThrow(AppMeasurementSdk.ConditionalUserProperty.VALUE));
        } else {
            j = 0;
        }
        zzd.close();
        return j;
    }

    private static Cursor zzd(SQLiteDatabase sQLiteDatabase, int i) {
        String[] strArr = {AppMeasurementSdk.ConditionalUserProperty.VALUE};
        String[] strArr2 = new String[1];
        if (i == 0) {
            strArr2[0] = "failed_requests";
        } else if (i != 1) {
            strArr2[0] = "last_successful_request_time";
        } else {
            strArr2[0] = "total_requests";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }
}

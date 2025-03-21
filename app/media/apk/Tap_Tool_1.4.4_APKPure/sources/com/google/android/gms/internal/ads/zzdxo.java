package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzdxo extends SQLiteOpenHelper {
    private final Context zza;
    private final zzflb zzb;

    public zzdxo(Context context, zzflb zzflbVar) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) zzbba.zzc().zzb(zzbfq.zzfE)).intValue());
        this.zza = context;
        this.zzb = zzflbVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ void zzg(SQLiteDatabase sQLiteDatabase, String str, zzccs zzccsVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzccsVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final /* synthetic */ Void zzh(zzccs zzccsVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzccsVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, zzccs zzccsVar) {
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {ImagesContract.URL};
            StringBuilder sb = new StringBuilder(25);
            sb.append("event_state = ");
            sb.append(1);
            Cursor query = sQLiteDatabase.query("offline_buffered_pings", strArr, sb.toString(), null, null, null, "timestamp ASC", null);
            int count = query.getCount();
            String[] strArr2 = new String[count];
            int i = 0;
            while (query.moveToNext()) {
                int columnIndex = query.getColumnIndex(ImagesContract.URL);
                if (columnIndex != -1) {
                    strArr2[i] = query.getString(columnIndex);
                }
                i++;
            }
            query.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i2 = 0; i2 < count; i2++) {
                zzccsVar.zza(strArr2[i2]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzewp<SQLiteDatabase, Void> zzewpVar) {
        zzfks.zzp(this.zzb.zzb(new Callable(this) { // from class: com.google.android.gms.internal.ads.zzdxh
            private final zzdxo zza;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzdxn(this, zzewpVar), this.zzb);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(final SQLiteDatabase sQLiteDatabase, final zzccs zzccsVar, final String str) {
        this.zzb.execute(new Runnable(sQLiteDatabase, str, zzccsVar) { // from class: com.google.android.gms.internal.ads.zzdxj
            private final SQLiteDatabase zza;
            private final String zzb;
            private final zzccs zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = sQLiteDatabase;
                this.zzb = str;
                this.zzc = zzccsVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                zzdxo.zzg(this.zza, this.zzb, this.zzc);
            }
        });
    }

    public final void zzc(final zzccs zzccsVar, final String str) {
        zza(new zzewp(this, zzccsVar, str) { // from class: com.google.android.gms.internal.ads.zzdxk
            private final zzdxo zza;
            private final zzccs zzb;
            private final String zzc;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzccsVar;
                this.zzc = str;
            }

            @Override // com.google.android.gms.internal.ads.zzewp
            public final Object zza(Object obj) {
                this.zza.zzb((SQLiteDatabase) obj, this.zzb, this.zzc);
                return null;
            }
        });
    }

    public final void zzd(final String str) {
        zza(new zzewp(this, str) { // from class: com.google.android.gms.internal.ads.zzdxl
            private final zzdxo zza;
            private final String zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = str;
            }

            @Override // com.google.android.gms.internal.ads.zzewp
            public final Object zza(Object obj) {
                zzdxo.zzi((SQLiteDatabase) obj, this.zzb);
                return null;
            }
        });
    }

    public final void zze(final zzdxq zzdxqVar) {
        zza(new zzewp(this, zzdxqVar) { // from class: com.google.android.gms.internal.ads.zzdxm
            private final zzdxo zza;
            private final zzdxq zzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zza = this;
                this.zzb = zzdxqVar;
            }

            @Override // com.google.android.gms.internal.ads.zzewp
            public final Object zza(Object obj) {
                this.zza.zzf(this.zzb, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ Void zzf(zzdxq zzdxqVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzdxqVar.zza));
        contentValues.put("gws_query_id", zzdxqVar.zzb);
        contentValues.put(ImagesContract.URL, zzdxqVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzdxqVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzs.zzc();
        com.google.android.gms.ads.internal.util.zzbs zzD = com.google.android.gms.ads.internal.util.zzr.zzD(this.zza);
        if (zzD != null) {
            try {
                zzD.zzf(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }
}

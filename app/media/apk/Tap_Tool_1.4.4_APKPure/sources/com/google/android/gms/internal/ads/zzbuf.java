package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbuf extends zzbun {
    private final Map<String, String> zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    public zzbuf(zzcib zzcibVar, Map<String, String> map) {
        super(zzcibVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcibVar.zzj();
        this.zzc = zzd("description");
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd("location");
    }

    private final String zzd(String str) {
        return TextUtils.isEmpty(this.zza.get(str)) ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : this.zza.get(str);
    }

    private final long zze(String str) {
        String str2 = this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() {
        if (this.zzb == null) {
            zzf("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        if (!new zzbfb(this.zzb).zzb()) {
            zzf("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
        Resources zzf = com.google.android.gms.ads.internal.zzs.zzg().zzf();
        builder.setTitle(zzf != null ? zzf.getString(R.string.s5) : "Create calendar event");
        builder.setMessage(zzf != null ? zzf.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        builder.setPositiveButton(zzf != null ? zzf.getString(R.string.s3) : "Accept", new zzbud(this));
        builder.setNegativeButton(zzf != null ? zzf.getString(R.string.s4) : "Decline", new zzbue(this));
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j = this.zzd;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zze;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}

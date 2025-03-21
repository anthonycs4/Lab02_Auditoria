package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzbuk extends zzbun {
    private final Map<String, String> zza;
    private final Context zzb;

    public zzbuk(zzcib zzcibVar, Map<String, String> map) {
        super(zzcibVar, "storePicture");
        this.zza = map;
        this.zzb = zzcibVar.zzj();
    }

    public final void zza() {
        if (this.zzb == null) {
            zzf("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        if (!new zzbfb(this.zzb).zza()) {
            zzf("Feature is not supported by the device.");
            return;
        }
        String str = this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzf("Image url cannot be empty.");
        } else if (URLUtil.isValidUrl(str)) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            com.google.android.gms.ads.internal.zzs.zzc();
            if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                String valueOf = String.valueOf(lastPathSegment);
                zzf(valueOf.length() != 0 ? "Image type not recognized: ".concat(valueOf) : new String("Image type not recognized: "));
                return;
            }
            Resources zzf = com.google.android.gms.ads.internal.zzs.zzg().zzf();
            com.google.android.gms.ads.internal.zzs.zzc();
            AlertDialog.Builder builder = new AlertDialog.Builder(this.zzb);
            builder.setTitle(zzf != null ? zzf.getString(R.string.s1) : "Save image");
            builder.setMessage(zzf != null ? zzf.getString(R.string.s2) : "Allow Ad to store image in Picture gallery?");
            builder.setPositiveButton(zzf != null ? zzf.getString(R.string.s3) : "Accept", new zzbui(this, str, lastPathSegment));
            builder.setNegativeButton(zzf != null ? zzf.getString(R.string.s4) : "Decline", new zzbuj(this));
            builder.create().show();
        } else {
            String valueOf2 = String.valueOf(str);
            zzf(valueOf2.length() != 0 ? "Invalid image url: ".concat(valueOf2) : new String("Invalid image url: "));
        }
    }
}

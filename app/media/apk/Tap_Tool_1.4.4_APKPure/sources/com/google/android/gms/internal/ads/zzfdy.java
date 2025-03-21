package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.gms.ads.RequestConfiguration;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzfdy {
    public static final int zza;
    public static final ClipData zzb;

    static {
        zza = Build.VERSION.SDK_INT > 22 ? 67108864 : 0;
        zzb = ClipData.newIntent(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, new Intent());
    }

    @Nullable
    public static PendingIntent zza(Context context, int i, Intent intent, int i2, int i3) {
        boolean z = true;
        zzfes.zza((i2 & 95) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzfes.zza(intent.getComponent() != null, "Must set component on Intent.");
        if (zzb(0, 1)) {
            zzfes.zza(!zzb(i2, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            if (Build.VERSION.SDK_INT >= 23 && !zzb(i2, 67108864)) {
                z = false;
            }
            zzfes.zza(z, "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (Build.VERSION.SDK_INT < 23 || !zzb(i2, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzb(0, 3) && intent2.getAction() == null) {
                intent2.setAction(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zzb(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
            }
            if (!zzb(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzb(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zzb);
            }
        }
        return PendingIntent.getService(context, 0, intent2, i2);
    }

    private static boolean zzb(int i, int i2) {
        return (i & i2) == i2;
    }
}

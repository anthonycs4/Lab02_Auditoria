package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.ump:user-messaging-platform@@1.0.0 */
/* loaded from: classes.dex */
public final class zzbj implements zzi {
    private final Application zza;
    private final zzbh zzb;
    private final Handler zzc;
    private final Executor zzd;
    private final zze zze;
    private final zzaj zzf;
    private final zzat zzg;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbj(Application application, zzbh zzbhVar, Handler handler, Executor executor, zze zzeVar, zzaj zzajVar, zzat zzatVar) {
        this.zza = application;
        this.zzb = zzbhVar;
        this.zzc = handler;
        this.zzd = executor;
        this.zze = zzeVar;
        this.zzf = zzajVar;
        this.zzg = zzatVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(int i, String str, String str2) {
        this.zzg.zza(new zzk(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", Integer.valueOf(i), str2, str)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(String str) {
        String valueOf = String.valueOf(str);
        Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Receive consent action: ".concat(valueOf) : new String("Receive consent action: "));
        Uri parse = Uri.parse(str);
        this.zze.zza(parse.getQueryParameter("action"), parse.getQueryParameter("args"), this, this.zzf);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final Executor zza() {
        Handler handler = this.zzc;
        handler.getClass();
        return zzbm.zza(handler);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.consent_sdk.zzi
    public final boolean zza(String str, JSONObject jSONObject) {
        char c;
        str.hashCode();
        char c2 = 65535;
        int i = 2;
        switch (str.hashCode()) {
            case -1370505102:
                if (str.equals("load_complete")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -278739366:
                if (str.equals("configure_app_assets")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 150940456:
                if (str.equals("browser")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1671672458:
                if (str.equals("dismiss")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.zzg.zzb();
                return true;
            case 1:
                this.zzd.execute(new Runnable(this) { // from class: com.google.android.gms.internal.consent_sdk.zzbl
                    private final zzbj zza;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zza = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                });
                return true;
            case 2:
                String optString = jSONObject.optString(ImagesContract.URL);
                if (TextUtils.isEmpty(optString)) {
                    Log.d("UserMessagingPlatform", "Action[browser]: empty url.");
                }
                Uri parse = Uri.parse(optString);
                if (parse.getScheme() == null) {
                    String valueOf = String.valueOf(optString);
                    Log.d("UserMessagingPlatform", valueOf.length() != 0 ? "Action[browser]: empty scheme: ".concat(valueOf) : new String("Action[browser]: empty scheme: "));
                }
                try {
                    this.zzb.startActivity(new Intent("android.intent.action.VIEW", parse));
                } catch (ActivityNotFoundException e) {
                    String valueOf2 = String.valueOf(optString);
                    zzca.zza(valueOf2.length() != 0 ? "Action[browser]: can not open url: ".concat(valueOf2) : new String("Action[browser]: can not open url: "), e);
                }
                return true;
            case 3:
                String optString2 = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
                optString2.hashCode();
                switch (optString2.hashCode()) {
                    case -954325659:
                        if (optString2.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case -258041904:
                        if (optString2.equals("personalized")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 429411856:
                        if (optString2.equals("CONSENT_SIGNAL_SUFFICIENT")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 467888915:
                        if (optString2.equals("CONSENT_SIGNAL_PERSONALIZED_ADS")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 1666911234:
                        if (optString2.equals("non_personalized")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                    case 4:
                        i = 1;
                        this.zzg.zza(3, i);
                        break;
                    case 1:
                    case 3:
                        this.zzg.zza(3, i);
                        break;
                    case 2:
                        i = 0;
                        this.zzg.zza(3, i);
                        break;
                    default:
                        this.zzg.zzb(new zzk(1, "We are getting something wrong with the webview."));
                        break;
                }
                return true;
            default:
                return false;
        }
    }

    private static JSONObject zza(Context context) {
        String concat;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString());
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
            if (applicationIcon == null) {
                concat = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                concat = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", concat);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzb() {
        this.zzg.zza().zza("UMP_configureFormWithAppAssets", zza(this.zza));
    }
}

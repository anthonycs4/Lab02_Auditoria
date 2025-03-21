package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.internal.ads.zzbay;
import com.google.android.gms.internal.ads.zzbba;
import com.google.android.gms.internal.ads.zzbfq;
import com.google.android.gms.internal.ads.zzess;
import com.google.android.gms.internal.ads.zzfef;
import com.google.android.gms.internal.ads.zzfey;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@20.2.0 */
/* loaded from: classes.dex */
public final class zzby {
    public static boolean zza(int i) {
        if (((Boolean) zzbba.zzc().zzb(zzbfq.zzbR)).booleanValue()) {
            return ((Boolean) zzbba.zzc().zzb(zzbfq.zzbS)).booleanValue() || i <= 15299999;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:18|(9:45|46|21|22|23|(3:25|(1:29)|39)(3:40|(1:42)|39)|30|(2:32|(1:34)(1:37))(1:38)|35)|20|21|22|23|(0)(0)|30|(0)(0)|35) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0174, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0175, code lost:
        com.google.android.gms.ads.internal.util.zze.zzg("Could not log native template signal to JSON", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x016f A[Catch: JSONException -> 0x0174, TRY_LEAVE, TryCatch #2 {JSONException -> 0x0174, blocks: (B:30:0x013b, B:47:0x0166, B:48:0x016a, B:49:0x016f), top: B:56:0x013b }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0175 -> B:55:0x017a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.json.JSONObject zzb(android.content.Context r16, android.view.View r17) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzby.zzb(android.content.Context, android.view.View):org.json.JSONObject");
    }

    public static JSONObject zzc(View view) {
        JSONObject jSONObject = new JSONObject();
        if (view != null) {
            try {
                if (!((Boolean) zzbba.zzc().zzb(zzbfq.zzfk)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzs.zzc();
                    ViewParent parent = view.getParent();
                    while (parent != null && !(parent instanceof AdapterView)) {
                        parent = parent.getParent();
                    }
                    jSONObject.put("contained_in_scroll_view", (parent == null ? -1 : ((AdapterView) parent).getPositionForView(view)) != -1);
                } else {
                    com.google.android.gms.ads.internal.zzs.zzc();
                    ViewParent parent2 = view.getParent();
                    while (parent2 != null && !(parent2 instanceof ScrollView)) {
                        parent2 = parent2.getParent();
                    }
                    if (parent2 != null) {
                        r2 = true;
                    }
                    jSONObject.put("contained_in_scroll_view", r2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    public static JSONObject zzd(Context context, View view) {
        JSONObject jSONObject = new JSONObject();
        if (view == null) {
            return jSONObject;
        }
        try {
            com.google.android.gms.ads.internal.zzs.zzc();
            jSONObject.put("can_show_on_lock_screen", zzr.zzt(view));
            com.google.android.gms.ads.internal.zzs.zzc();
            jSONObject.put("is_keyguard_locked", zzr.zzG(context));
        } catch (JSONException unused) {
            zze.zzi("Unable to get lock screen information");
        }
        return jSONObject;
    }

    public static JSONObject zze(Context context, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View view) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        Map.Entry<String, WeakReference<View>> entry;
        JSONObject jSONObject3 = new JSONObject();
        if (map == null || view == null) {
            return jSONObject3;
        }
        int[] zzg = zzg(view);
        Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, WeakReference<View>> next = it.next();
            View view2 = next.getValue().get();
            if (view2 != null) {
                int[] zzg2 = zzg(view2);
                JSONObject jSONObject4 = new JSONObject();
                JSONObject jSONObject5 = new JSONObject();
                Iterator<Map.Entry<String, WeakReference<View>>> it2 = it;
                try {
                    JSONObject jSONObject6 = jSONObject3;
                    try {
                        jSONObject5.put("width", zzbay.zza().zza(context, view2.getMeasuredWidth()));
                        jSONObject5.put("height", zzbay.zza().zza(context, view2.getMeasuredHeight()));
                        jSONObject5.put("x", zzbay.zza().zza(context, zzg2[0] - zzg[0]));
                        jSONObject5.put("y", zzbay.zza().zza(context, zzg2[1] - zzg[1]));
                        jSONObject5.put("relative_to", "ad_view");
                        jSONObject4.put(TypedValues.Attributes.S_FRAME, jSONObject5);
                        Rect rect = new Rect();
                        if (view2.getLocalVisibleRect(rect)) {
                            jSONObject2 = zzk(context, rect);
                        } else {
                            jSONObject2 = new JSONObject();
                            jSONObject2.put("width", 0);
                            jSONObject2.put("height", 0);
                            jSONObject2.put("x", zzbay.zza().zza(context, zzg2[0] - zzg[0]));
                            jSONObject2.put("y", zzbay.zza().zza(context, zzg2[1] - zzg[1]));
                            jSONObject2.put("relative_to", "ad_view");
                        }
                        jSONObject4.put("visible_bounds", jSONObject2);
                        if (view2 instanceof TextView) {
                            TextView textView = (TextView) view2;
                            jSONObject4.put("text_color", textView.getCurrentTextColor());
                            entry = next;
                            jSONObject4.put("font_size", textView.getTextSize());
                            jSONObject4.put("text", textView.getText());
                        } else {
                            entry = next;
                        }
                        jSONObject4.put("is_clickable", map2 != null && map2.containsKey(entry.getKey()) && view2.isClickable());
                        jSONObject = jSONObject6;
                    } catch (JSONException unused) {
                        jSONObject = jSONObject6;
                    }
                } catch (JSONException unused2) {
                    jSONObject = jSONObject3;
                }
                try {
                    jSONObject.put(entry.getKey(), jSONObject4);
                } catch (JSONException unused3) {
                    zze.zzi("Unable to get asset views information");
                    jSONObject3 = jSONObject;
                    it = it2;
                }
                jSONObject3 = jSONObject;
                it = it2;
            }
        }
        return jSONObject3;
    }

    public static JSONObject zzf(String str, Context context, Point point, Point point2) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject();
        } catch (Exception e) {
            e = e;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("x", zzbay.zza().zza(context, point2.x));
                jSONObject3.put("y", zzbay.zza().zza(context, point2.y));
                jSONObject3.put("start_x", zzbay.zza().zza(context, point.x));
                jSONObject3.put("start_y", zzbay.zza().zza(context, point.y));
                jSONObject2 = jSONObject3;
            } catch (JSONException e2) {
                zze.zzg("Error occurred while putting signals into JSON object.", e2);
            }
            jSONObject.put("click_point", jSONObject2);
            jSONObject.put("asset_id", str);
            return jSONObject;
        } catch (Exception e3) {
            e = e3;
            jSONObject2 = jSONObject;
            zze.zzg("Error occurred while grabbing click signals.", e);
            return jSONObject2;
        }
    }

    public static int[] zzg(View view) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        return iArr;
    }

    public static Point zzh(MotionEvent motionEvent, View view) {
        int[] zzg = zzg(view);
        float rawX = motionEvent.getRawX();
        return new Point(((int) rawX) - zzg[0], ((int) motionEvent.getRawY()) - zzg[1]);
    }

    public static boolean zzi(Context context, zzess zzessVar) {
        if (zzessVar.zzI) {
            if (((Boolean) zzbba.zzc().zzb(zzbfq.zzfl)).booleanValue()) {
                return ((Boolean) zzbba.zzc().zzb(zzbfq.zzfo)).booleanValue();
            }
            String str = (String) zzbba.zzc().zzb(zzbfq.zzfm);
            if (!str.isEmpty() && context != null) {
                String packageName = context.getPackageName();
                for (String str2 : zzfey.zza(zzfef.zzb(';')).zzb(str)) {
                    if (str2.equals(packageName)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public static WindowManager.LayoutParams zzj() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 0, 0, -2);
        layoutParams.flags = ((Integer) zzbba.zzc().zzb(zzbfq.zzfn)).intValue();
        layoutParams.type = 2;
        layoutParams.gravity = BadgeDrawable.TOP_START;
        return layoutParams;
    }

    private static JSONObject zzk(Context context, Rect rect) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", zzbay.zza().zza(context, rect.right - rect.left));
        jSONObject.put("height", zzbay.zza().zza(context, rect.bottom - rect.top));
        jSONObject.put("x", zzbay.zza().zza(context, rect.left));
        jSONObject.put("y", zzbay.zza().zza(context, rect.top));
        jSONObject.put("relative_to", "self");
        return jSONObject;
    }
}

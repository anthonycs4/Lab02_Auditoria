package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zzcco {
    public static boolean zza(Bundle bundle, Bundle bundle2) {
        if (bundle == null || bundle2 == null) {
            return bundle == null && bundle2 == null;
        } else if (bundle.size() != bundle2.size()) {
            return false;
        } else {
            for (String str : bundle.keySet()) {
                if (!bundle2.containsKey(str)) {
                    return false;
                }
                Object obj = bundle.get(str);
                Object obj2 = bundle2.get(str);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                } else if (obj instanceof Bundle) {
                    if (!(obj2 instanceof Bundle) || !zza((Bundle) obj, (Bundle) obj2)) {
                        return false;
                    }
                } else if (obj.getClass().isArray()) {
                    int length = Array.getLength(obj);
                    if (obj2.getClass().isArray() && length == Array.getLength(obj2)) {
                        for (int i = 0; i < length; i++) {
                            if (!Objects.equal(Array.get(obj, i), Array.get(obj2, i))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        return false;
                    }
                } else if (!obj.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
    }
}

package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.2.0 */
/* loaded from: classes.dex */
public enum zzfez {
    JAVA_VERSION("java.version"),
    JAVA_VENDOR("java.vendor"),
    JAVA_VENDOR_URL("java.vendor.url"),
    JAVA_HOME("java.home"),
    JAVA_VM_SPECIFICATION_VERSION("java.vm.specification.version"),
    JAVA_VM_SPECIFICATION_VENDOR("java.vm.specification.vendor"),
    JAVA_VM_SPECIFICATION_NAME("java.vm.specification.name"),
    JAVA_VM_VERSION("java.vm.version"),
    JAVA_VM_VENDOR("java.vm.vendor"),
    JAVA_VM_NAME("java.vm.name"),
    JAVA_SPECIFICATION_VERSION("java.specification.version"),
    JAVA_SPECIFICATION_VENDOR("java.specification.vendor"),
    JAVA_SPECIFICATION_NAME("java.specification.name"),
    JAVA_CLASS_VERSION("java.class.version"),
    JAVA_CLASS_PATH("java.class.path"),
    JAVA_LIBRARY_PATH("java.library.path"),
    JAVA_IO_TMPDIR("java.io.tmpdir"),
    JAVA_COMPILER("java.compiler"),
    JAVA_EXT_DIRS("java.ext.dirs"),
    OS_NAME("os.name"),
    OS_ARCH("os.arch"),
    OS_VERSION("os.version"),
    FILE_SEPARATOR("file.separator"),
    PATH_SEPARATOR("path.separator"),
    LINE_SEPARATOR("line.separator"),
    USER_NAME("user.name"),
    USER_HOME("user.home"),
    USER_DIR("user.dir");
    
    private final String zzC;

    zzfez(String str) {
        this.zzC = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        String str = this.zzC;
        String property = System.getProperty(str);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(property).length());
        sb.append(str);
        sb.append("=");
        sb.append(property);
        return sb.toString();
    }

    @CheckForNull
    public final String zza() {
        return System.getProperty(this.zzC);
    }
}

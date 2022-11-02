package com.alex_zaitsev.adg.io;

public class Filters {

    public static final boolean DEFAULT_PROCESS_INNER = false;
    public static final boolean DEFAULT_SHOW_PACKAGE_DEPENDENCIES = false;

    private String packageName = null;
    private boolean processingInner = DEFAULT_PROCESS_INNER;
    private String[] ignoredClasses = null;
    private String packagePrefix = null;
    private boolean showPackageDependencies = DEFAULT_SHOW_PACKAGE_DEPENDENCIES;

    public Filters(String packageName, boolean processingInner, 
                   String[] ignoredClasses, String packagePrefix, boolean showPackageDependencies) {
        this.packageName = packageName;
        this.processingInner = processingInner;
        this.ignoredClasses = ignoredClasses;
        this.packagePrefix = packagePrefix;
        this.showPackageDependencies = showPackageDependencies;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public boolean isProcessingInner() {
        return processingInner;
    }

    public void setProcessingInner(boolean isProcessingInner) {
        this.processingInner = isProcessingInner;
    }

    public String[] getIgnoredClasses() {
        return ignoredClasses;
    }

    public void setIgnoredClasses(String[] ignoredClasses) {
        this.ignoredClasses = ignoredClasses;
    }
    public String getPackagePrefix() {
        return packagePrefix;
    }

    public void setPackagePrefix(String packagePrefix) {
        this.packagePrefix = packagePrefix;
    }
    public boolean isShowPackageDependencies() {
        return showPackageDependencies;
    }

    public void setShowPackageDependencies(boolean showPackageDependencies) {
        this.showPackageDependencies = showPackageDependencies;
    }
}
package com.alex_zaitsev.adg.io;

public class Arguments {
    
    private String apkFilePath;
    private String projectPath;
    private String resultPath;
    private String filtersPath;
    private String packagePrefix;

    public Arguments(String apkPath, String projectPath, String resultPath,
                     String filtersPath, String packagePrefix) {
        this.apkFilePath = apkPath;
        this.projectPath = projectPath;
        this.resultPath = resultPath;
        this.filtersPath = filtersPath;
        this.packagePrefix = packagePrefix;
    }

    public String getProjectPath() {
        return projectPath;
    }

    public void setProjectPath(String projectPath) {
        this.projectPath = projectPath;
    }

    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath;
    }

    public String getApkFilePath() {
        return this.apkFilePath;
    }

    public void setApkFilePath(String apkFilePath) {
        this.apkFilePath = apkFilePath;
    }

    public String getFiltersPath() {
        return filtersPath;
    }

    public void setFiltersPath(String filtersPath) {
        this.filtersPath = filtersPath;
    }

    public String getPackagePrefix() {
        return packagePrefix;
    }

    public void setPackagePrefix(String packagePrefix) {
        this.packagePrefix = packagePrefix;
    }
}

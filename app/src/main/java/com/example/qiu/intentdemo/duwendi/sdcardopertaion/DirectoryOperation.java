package com.example.qiu.intentdemo.duwendi.sdcardopertaion;

import java.io.File;

import okhttp3.internal.Util;

/**
 * Created by admin on 2018/3/1.
 */

public class DirectoryOperation {
    /**
     * 功能：创建多层目录
     * @param path 路径
     * @return     目录路径
     */
    public static String mkDirs(String path){
        String sdPath = Utils.getSDPath();
        //保证path以sdPath开头
        if(path.indexOf(sdPath)==-1){
            path = sdPath + (path.indexOf("/")==0?"":"/")+path;
        }
        File destDir = new File(path);
        if(!destDir.exists()){
            path = makedir(path);
            if(path==null){
                return null;
            }
        }
        return path;
    }

    private static String makedir(String path){
        String sdPath = Utils.getSDPath();
        String[] dirs = path.replace(sdPath,"").split("/");
        StringBuffer filePath = new StringBuffer(sdPath);
        for(String dir :dirs){
            if(!"".equals(dir)&& !dir.equals(sdPath)){
                filePath.append("/").append(dir);
                File destDir = new File(filePath.toString());
                if(!destDir.exists()){
                    boolean makeDirResult = destDir.mkdirs();
                    if (makeDirResult==false){
                        return null;
                    }
                }
            }
        }
        return filePath.toString();
    }
}

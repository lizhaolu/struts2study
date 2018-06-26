package nuc.sw.DB;

import nuc.sw.bean.Path;
import nuc.sw.dao.PathDB;

import java.util.List;

/**
 * Created by idea on 2017/11/5.
 */
public class PathDao {
    public List<Path> paths(){
        return PathDB.pathList;
    }

    public void add(Path path){
        PathDB.pathList.add(path);
    }
}

package cn.leapcloud.release.platform.service;

import cn.leapcloud.release.platform.dao.impl.TaskWithCount;
import io.vertx.core.json.JsonObject;

/**
 * Created by songqian on 16/12/2.
 */
public interface ReleaseTaskService {


  boolean createNewTask(int releaseType, String proposal, String title, String projectURL, String projectDescription,String tag)
    throws Exception;

  boolean updateNewTask(int id, int releaseType, String proposal, String title, String projectURL, String projectDescription,String tag)
    throws Exception;

  boolean manageNewTask(int id, byte status, String releaseRemark) throws Exception;

  //
//  TaskWithCount queryAll(int pageSize, int currentPaged) throws Exception;
//
//  TaskWithCount queryAll(int pageSize, int currentPaged, int releaseType) throws Exception;
//
//
//
//  TaskWithCount queryAll(int pageSize, int currentPaged, byte releaseStatus) throws Exception;
//
//  TaskWithCount queryAll(int pageSize, int currentPaged, int releaseType,byte releaseStatus) throws Exception;
//
//
  TaskWithCount queryAll(JsonObject jsonObject, int i, int skip, int limit) throws RuntimeException;


}

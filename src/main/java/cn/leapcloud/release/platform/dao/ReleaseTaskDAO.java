package cn.leapcloud.release.platform.dao;

import cn.leapcloud.release.platform.dao.entity.tables.records.ReleaseTaskRecord;
import org.jooq.Configuration;

import java.util.List;

/**
 * Created by songqian on 16/11/25.
 */
public interface ReleaseTaskDAO {

  boolean doCreate(ReleaseTaskRecord releaseTaskRecord, Configuration configuration) throws Exception;

  boolean doUpdate(ReleaseTaskRecord releaseTaskRecord, Configuration configuration) throws Exception;

  ReleaseTaskRecord queryById(int id) throws Exception;

  List<ReleaseTaskRecord> query() throws Exception;





}

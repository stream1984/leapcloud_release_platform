/**
 * This class is generated by jOOQ
 */
package cn.leapcloud.release.platform.dao.entity;


import cn.leapcloud.release.platform.dao.entity.tables.ReleaseTask;
import cn.leapcloud.release.platform.dao.entity.tables.ReleaseType;
import cn.leapcloud.release.platform.dao.entity.tables.User;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in leapcloud_release_platform
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.7.3"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

	/**
	 * The table leapcloud_release_platform.release_task
	 */
	public static final ReleaseTask RELEASE_TASK = cn.leapcloud.release.platform.dao.entity.tables.ReleaseTask.RELEASE_TASK;

	/**
	 * The table leapcloud_release_platform.release_type
	 */
	public static final ReleaseType RELEASE_TYPE = cn.leapcloud.release.platform.dao.entity.tables.ReleaseType.RELEASE_TYPE;

	/**
	 * The table leapcloud_release_platform.user
	 */
	public static final User USER = cn.leapcloud.release.platform.dao.entity.tables.User.USER;
}

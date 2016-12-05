package cn.leapcloud.release.platform.Module;

import cn.leapcloud.release.platform.controller.ReleaseTaskController;
import cn.leapcloud.release.platform.controller.RestfulServer;
import cn.leapcloud.release.platform.controller.UserController;
import cn.leapcloud.release.platform.dao.UserDAO;
import cn.leapcloud.release.platform.dao.dbc.DataBaseConnection;
import cn.leapcloud.release.platform.dao.impl.UserDAOImpl;
import cn.leapcloud.release.platform.service.UserService;
import cn.leapcloud.release.platform.service.impl.UserServiceImpl;
import com.google.inject.*;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;
import org.jooq.DSLContext;

/**
 * Created by songqian.
 */
public class GuiceModule implements Module {

  private Vertx vertx;

  public GuiceModule(Vertx vertx) {
    this.vertx = vertx;
  }

  public void configure(Binder binder) {
    binder.bind(UserDAO.class).to(UserDAOImpl.class).in(Scopes.SINGLETON);
    binder.bind(UserService.class).to(UserServiceImpl.class).in(Scopes.SINGLETON);
    binder.bind(UserController.class);
    binder.bind(RestfulServer.class);
    binder.bind(ReleaseTaskController.class);
  }

  @Provides
  public DSLContext jooq() {
    return DataBaseConnection.getJooq();
  }

  @Provides
  public Vertx vertx() {
    return this.vertx;
  }

  @Provides
  @Singleton
  public Router router() {
    return Router.router(vertx);
  }



}
